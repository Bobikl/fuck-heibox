package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";

    @j1
    public static boolean debugForceSurfaceProducerGlTextures = false;

    @n0
    private final FlutterJNI flutterJNI;

    @n0
    private final FlutterUiDisplayListener flutterUiDisplayListener;

    @p0
    private Surface surface;

    @n0
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private boolean isDisplayingFlutterUi = false;
    private final Handler handler = new Handler();

    @n0
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();

    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = DisplayFeatureState.UNKNOWN;
        }

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);

        public final int encodedValue;

        DisplayFeatureState(int i10) {
            this.encodedValue = i10;
        }
    }

    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);

        public final int encodedValue;

        DisplayFeatureType(int i10) {
            this.encodedValue = i10;
        }
    }

    @Keep
    @TargetApi(29)
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f119446id;
        private boolean released;
        private boolean ignoringFence = false;
        private boolean trimOnMemoryPressure = true;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private Object lock = new Object();
        private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
        private PerImage lastDequeuedImage = null;
        private PerImageReader lastReaderDequeuedFrom = null;

        public class PerImage {
            public final Image image;
            public final long queuedTime;

            public PerImage(Image image, long j10) {
                this.image = image;
                this.queuedTime = j10;
            }
        }

        public class PerImageReader {
            private final ImageReader.OnImageAvailableListener onImageAvailableListener;
            public final ImageReader reader;
            private final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
            private boolean closed = false;

            public PerImageReader(ImageReader imageReader) {
                ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.a
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        this.f119451a.lambda$new$0(imageReader2);
                    }
                };
                this.onImageAvailableListener = onImageAvailableListener;
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(onImageAvailableListener, new Handler(Looper.getMainLooper()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$new$0(ImageReader imageReader) {
                Image imageAcquireLatestImage;
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e10) {
                    Log.e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e10);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.closed) {
                    imageAcquireLatestImage.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                }
            }

            boolean canPrune() {
                return this.imageQueue.size() == 0 && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }

            PerImage dequeueImage() {
                if (this.imageQueue.size() == 0) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            PerImage queueImage(Image image) {
                if (this.closed) {
                    return null;
                }
                PerImage perImage = ImageReaderSurfaceProducer.this.new PerImage(image, System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }
        }

        ImageReaderSurfaceProducer(long j10) {
            this.f119446id = j10;
        }

        private void cleanup() {
            synchronized (this.lock) {
                for (PerImageReader perImageReader : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == perImageReader) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    perImageReader.close();
                }
                this.perImageReaders.clear();
                PerImage perImage = this.lastDequeuedImage;
                if (perImage != null) {
                    perImage.image.close();
                    this.lastDequeuedImage = null;
                }
                PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
                if (perImageReader2 != null) {
                    perImageReader2.close();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            }
        }

        private ImageReader createImageReader() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return createImageReader33();
            }
            if (i10 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader.Builder builder = new ImageReader.Builder(this.requestedWidth, this.requestedHeight);
            builder.setMaxImages(5);
            builder.setImageFormat(34);
            builder.setUsage(256L);
            return builder.build();
        }

        private PerImageReader getActiveReader() {
            synchronized (this.lock) {
                if (!this.createNewReader) {
                    return this.imageReaderQueue.peekLast();
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.w(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            PerImage perImageDequeueImage = dequeueImage();
            if (perImageDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(perImageDequeueImage.image);
            return perImageDequeueImage.image;
        }

        double deltaMillis(long j10) {
            return j10 / 1000000.0d;
        }

        PerImage dequeueImage() {
            PerImage perImage;
            synchronized (this.lock) {
                perImage = null;
                for (PerImageReader perImageReader : this.imageReaderQueue) {
                    PerImage perImageDequeueImage = perImageReader.dequeueImage();
                    if (perImageDequeueImage != null) {
                        PerImage perImage2 = this.lastDequeuedImage;
                        if (perImage2 != null) {
                            perImage2.image.close();
                            this.lastDequeuedImage = null;
                        }
                        this.lastDequeuedImage = perImageDequeueImage;
                        this.lastReaderDequeuedFrom = perImageReader;
                        perImage = perImageDequeueImage;
                        break;
                    }
                    perImage = perImageDequeueImage;
                }
                pruneImageReaderQueue();
            }
            return perImage;
        }

        @j1
        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f119446id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
            PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            PerImageReader perImageReader2 = new PerImageReader(imageReader);
            this.perImageReaders.put(imageReader, perImageReader2);
            this.imageReaderQueue.add(perImageReader2);
            return perImageReader2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f119446id;
        }

        @j1
        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        @j1
        public int numImages() {
            int size;
            synchronized (this.lock) {
                Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += it.next().imageQueue.size();
                }
            }
            return size;
        }

        @j1
        public int numTrims() {
            int i10;
            synchronized (this.lock) {
                i10 = this.numTrims;
            }
            return i10;
        }

        void onImage(ImageReader imageReader, Image image) {
            PerImage perImageQueueImage;
            synchronized (this.lock) {
                perImageQueueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
            }
            if (perImageQueueImage == null) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i10) {
            if (this.trimOnMemoryPressure && i10 >= 40) {
                synchronized (this.lock) {
                    this.numTrims++;
                }
                cleanup();
                this.createNewReader = true;
            }
        }

        void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                PerImageReader perImageReaderPeekFirst = this.imageReaderQueue.peekFirst();
                if (!perImageReaderPeekFirst.canPrune()) {
                    return;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(perImageReaderPeekFirst.reader);
                perImageReaderPeekFirst.close();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.unregisterTexture(this.f119446id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i10, int i11) {
            int iMax = Math.max(1, i10);
            int iMax2 = Math.max(1, i11);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }
    }

    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f119447id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j10) {
            this.f119447id = j10;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.w(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f119447id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f119447id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                Log.e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.unregisterTexture(this.f119447id);
        }
    }

    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {

        @p0
        private TextureRegistry.OnFrameConsumedListener frameConsumedListener;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f119448id;
        private boolean released;

        @n0
        private final SurfaceTextureWrapper textureWrapper;

        @p0
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        SurfaceTextureRegistryEntry(@n0 long j10, SurfaceTexture surfaceTexture) {
            this.f119448id = j10;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119452b.lambda$new$0();
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.c
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.f119453b.lambda$new$1(surfaceTexture2);
                }
            }, new Handler());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(SurfaceTexture surfaceTexture) {
            if (this.released || !FlutterRenderer.this.flutterJNI.isAttached()) {
                return;
            }
            this.textureWrapper.markDirty();
            FlutterRenderer.this.scheduleEngineFrame();
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f119448id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f119448id;
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i10) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i10);
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f119448id + ").");
            this.textureWrapper.release();
            FlutterRenderer.this.unregisterTexture(this.f119448id);
            removeListener();
            this.released = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(@p0 TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(@p0 TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        @n0
        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        @n0
        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    public static final class TextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f119449id;

        TextureFinalizerRunnable(long j10, @n0 FlutterJNI flutterJNI) {
            this.f119449id = j10;
            this.flutterJNI = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.v(FlutterRenderer.TAG, "Releasing a Texture (" + this.f119449id + ").");
                this.flutterJNI.unregisterTexture(this.f119449id);
            }
        }
    }

    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public int width = 0;
        public int height = 0;
        public int viewPaddingTop = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewInsetTop = 0;
        public int viewInsetRight = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
        public List<DisplayFeature> displayFeatures = new ArrayList();

        boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    public FlutterRenderer(@n0 FlutterJNI flutterJNI) {
        FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = flutterUiDisplayListener;
        this.flutterJNI = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void markTextureFrameAvailable(long j10) {
        this.flutterJNI.markTextureFrameAvailable(j10);
    }

    private void registerImageTexture(long j10, @n0 TextureRegistry.ImageConsumer imageConsumer) {
        this.flutterJNI.registerImageTexture(j10, imageConsumer);
    }

    @n0
    private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j10, @n0 SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j10, surfaceTexture);
        Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id());
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    private void registerTexture(long j10, @n0 SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j10, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterTexture(long j10) {
        this.flutterJNI.unregisterTexture(j10);
    }

    public void addIsDisplayingFlutterUiListener(@n0 FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @j1
    void addOnTrimMemoryListener(@n0 TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference<>(onTrimMemoryListener));
    }

    @Override // io.flutter.view.TextureRegistry
    @n0
    public TextureRegistry.ImageTextureEntry createImageTexture() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        registerImageTexture(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    @n0
    public TextureRegistry.SurfaceProducer createSurfaceProducer() {
        if (debugForceSurfaceProducerGlTextures || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = createSurfaceTexture();
            SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(surfaceTextureEntryCreateSurfaceTexture.id(), this.handler, this.flutterJNI, surfaceTextureEntryCreateSurfaceTexture);
            Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryCreateSurfaceTexture.id());
            return surfaceTextureSurfaceProducer;
        }
        long andIncrement = this.nextTextureId.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        registerImageTexture(andIncrement, imageReaderSurfaceProducer);
        addOnTrimMemoryListener(imageReaderSurfaceProducer);
        Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    @n0
    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(@n0 ByteBuffer byteBuffer, int i10) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i10, int i11, @p0 ByteBuffer byteBuffer, int i12) {
        this.flutterJNI.dispatchSemanticsAction(i10, i11, byteBuffer, i12);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    @Override // io.flutter.view.TextureRegistry
    public void onTrimMemory(int i10) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry
    @n0
    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(@n0 SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    public void removeIsDisplayingFlutterUiListener(@n0 FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    @j1
    void removeOnTrimMemoryListener(@n0 TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference<TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(weakReference);
                return;
            }
        }
    }

    public void setAccessibilityFeatures(int i10) {
        this.flutterJNI.setAccessibilityFeatures(i10);
    }

    public void setSemanticsEnabled(boolean z10) {
        this.flutterJNI.setSemanticsEnabled(z10);
    }

    public void setViewportMetrics(@n0 ViewportMetrics viewportMetrics) {
        if (viewportMetrics.validate()) {
            Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size());
            int[] iArr = new int[viewportMetrics.displayFeatures.size() * 4];
            int[] iArr2 = new int[viewportMetrics.displayFeatures.size()];
            int[] iArr3 = new int[viewportMetrics.displayFeatures.size()];
            for (int i10 = 0; i10 < viewportMetrics.displayFeatures.size(); i10++) {
                DisplayFeature displayFeature = viewportMetrics.displayFeatures.get(i10);
                int i11 = i10 * 4;
                Rect rect = displayFeature.bounds;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = displayFeature.type.encodedValue;
                iArr3[i10] = displayFeature.state.encodedValue;
            }
            this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3);
        }
    }

    public void startRenderingToSurface(@n0 Surface surface, boolean z10) {
        if (!z10) {
            stopRenderingToSurface();
        }
        this.surface = surface;
        if (z10) {
            this.flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            this.flutterJNI.onSurfaceCreated(surface);
        }
    }

    public void stopRenderingToSurface() {
        if (this.surface != null) {
            this.flutterJNI.onSurfaceDestroyed();
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            this.surface = null;
        }
    }

    public void surfaceChanged(int i10, int i11) {
        this.flutterJNI.onSurfaceChanged(i10, i11);
    }

    public void swapSurface(@n0 Surface surface) {
        this.surface = surface;
        this.flutterJNI.onSurfaceWindowChanged(surface);
    }
}
