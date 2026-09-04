package com.bytedance.realx.video;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;

    @p0
    private RendererCommon.GlDrawer drawer;

    @p0
    private EglBase eglBase;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;

    @p0
    private RXVideoFrameInterface pendingFrame;
    private long renderSwapBufferTimeNs;

    @p0
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;
    private final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    private final Object handlerLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();
    private final Object frameLock = new Object();
    private final Object firstRenderLock = new Object();
    private final Object layoutLock = new Object();
    private final Object statisticsLock = new Object();
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(bb.c.f.OB);
    private volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: com.bytedance.realx.video.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                if (EglRenderer.this.renderThreadHandler != null) {
                    EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                    EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
                }
            }
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private boolean haveRenderFirstVideoFrame = false;

    /* JADX INFO: renamed from: com.bytedance.realx.video.EglRenderer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else {
                    if (!(obj instanceof SurfaceTexture)) {
                        throw new IllegalStateException("Invalid surface: " + this.surface);
                    }
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(bb.c.d.On, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer, boolean z10) {
            this.listener = frameListener;
            this.scale = f10;
            this.drawer = glDrawer;
            this.applyFpsReduction = z10;
        }
    }

    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) throws Exception {
            try {
                super.dispatchMessage(message);
            } catch (Exception e10) {
                RXLogging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e10);
                this.exceptionCallback.run();
                throw e10;
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    private String averageTimeAsString(long j10, int i10) {
        if (i10 <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j10 / ((long) i10)) + " us";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$6(float f10, float f11, float f12, float f13) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f10, f11, f12, f13);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private void glClear(int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i10, i11, i12, f10, f11, f12, f13, 1.0f, 8);
        } else {
            GLES20.glClearColor(f10, f11, f12, f13);
            GLES20.glClear(16384);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f10, boolean z10) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f10, glDrawer, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = a.e(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = a.c(context, iArr);
        }
        this.glClearWorkaround.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        this.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.clear();
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(String str) {
        RXLogging.i(TAG, this.name + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j10 = jNanoTime - this.statisticsStartTimeNs;
            if (j10 <= 0) {
                return;
            }
            logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j10) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format((((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1L)) / j10) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
            resetStatistics(jNanoTime);
        }
    }

    private void logW(String str) {
        RXLogging.w(TAG, this.name + str);
    }

    private void notifyCallbacks(RXVideoFrameInterface rXVideoFrameInterface, boolean z10) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z10 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * rXVideoFrameInterface.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * rXVideoFrameInterface.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    glClear(rotatedWidth, rotatedHeight, 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    this.frameDrawer.drawFrame(rXVideoFrameInterface, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, bb.c.f.OB, bb.c.f.Zc, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.firstRenderLock) {
            Iterator<FirstVideoFrameRenderListener> it = this.firstVideoFrameListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstVideoFrameRender();
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0185  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void renderFrameOnRenderThread() {
        boolean z10;
        float f10;
        int i10;
        int iSurfaceWidth;
        int i11;
        int iSurfaceHeight;
        float f11;
        float f12;
        float f13;
        boolean z11;
        long jNanoTime;
        long jNanoTime2;
        synchronized (this.frameLock) {
            RXVideoFrameInterface rXVideoFrameInterface = this.pendingFrame;
            if (rXVideoFrameInterface == null) {
                return;
            }
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                logD("Dropping frame - No surface");
                rXVideoFrameInterface.release();
                return;
            }
            synchronized (this.fpsReductionLock) {
                long j10 = this.minRenderPeriodNs;
                if (j10 != Long.MAX_VALUE) {
                    if (j10 > 0) {
                        long jNanoTime3 = System.nanoTime();
                        long j11 = this.nextFrameTimeNs;
                        if (jNanoTime3 < j11) {
                            logD("Skipping frame rendering - fps reduction is active.");
                            z10 = false;
                        } else {
                            long j12 = j11 + this.minRenderPeriodNs;
                            this.nextFrameTimeNs = j12;
                            this.nextFrameTimeNs = Math.max(j12, jNanoTime3);
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            long jNanoTime4 = System.nanoTime();
            if (rXVideoFrameInterface.getRotatedHeight() <= 0) {
                return;
            }
            float rotatedWidth = rXVideoFrameInterface.getRotatedWidth() / rXVideoFrameInterface.getRotatedHeight();
            synchronized (this.layoutLock) {
                f10 = this.layoutAspectRatio;
                if (f10 == 0.0f) {
                    f10 = rotatedWidth;
                }
            }
            int iSurfaceWidth2 = this.eglBase.surfaceWidth();
            int iSurfaceHeight2 = this.eglBase.surfaceHeight();
            int i12 = AnonymousClass3.$SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[this.renderModel.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = iSurfaceWidth2;
                    i11 = iSurfaceHeight2;
                    iSurfaceWidth = 0;
                    iSurfaceHeight = 0;
                } else if (rotatedWidth > f10) {
                    f12 = f10 / rotatedWidth;
                    i10 = iSurfaceWidth2;
                    i11 = iSurfaceHeight2;
                    iSurfaceWidth = 0;
                    iSurfaceHeight = 0;
                    f11 = 1.0f;
                } else {
                    f11 = rotatedWidth / f10;
                    i10 = iSurfaceWidth2;
                    i11 = iSurfaceHeight2;
                    iSurfaceWidth = 0;
                    iSurfaceHeight = 0;
                    f12 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                Matrix matrix = this.drawMatrix;
                if (this.mirrorHorizontally) {
                    f13 = -1.0f;
                } else {
                    f13 = 1.0f;
                }
                matrix.preScale(f13, this.mirrorVertically ? -1.0f : 1.0f);
                this.drawMatrix.preScale(f12, f11);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                if (z10) {
                    glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    z11 = true;
                    this.frameDrawer.drawFrame(rXVideoFrameInterface, this.drawer, this.drawMatrix, iSurfaceWidth, iSurfaceHeight, i10, i11);
                    jNanoTime = System.nanoTime();
                    if (this.usePresentationTimeStamp) {
                        this.eglBase.swapBuffers(rXVideoFrameInterface.getTimestampNs());
                    } else {
                        this.eglBase.swapBuffers();
                    }
                    jNanoTime2 = System.nanoTime();
                    synchronized (this.statisticsLock) {
                        this.framesRendered++;
                        this.renderTimeNs += jNanoTime2 - jNanoTime4;
                        this.renderSwapBufferTimeNs += jNanoTime2 - jNanoTime;
                    }
                } else {
                    z11 = true;
                }
                notifyCallbacks(rXVideoFrameInterface, z10);
                if (!this.haveRenderFirstVideoFrame) {
                    notifyFristRenderCallback();
                    this.haveRenderFirstVideoFrame = z11;
                }
                rXVideoFrameInterface.release();
            }
            if (rotatedWidth > f10) {
                int iSurfaceWidth3 = (int) (this.eglBase.surfaceWidth() / rotatedWidth);
                i11 = iSurfaceWidth3;
                i10 = iSurfaceWidth2;
                iSurfaceHeight = (this.eglBase.surfaceHeight() - iSurfaceWidth3) / 2;
                iSurfaceWidth = 0;
            } else {
                int iSurfaceHeight3 = (int) (this.eglBase.surfaceHeight() * rotatedWidth);
                i10 = iSurfaceHeight3;
                iSurfaceWidth = (this.eglBase.surfaceWidth() - iSurfaceHeight3) / 2;
                i11 = iSurfaceHeight2;
                iSurfaceHeight = 0;
            }
            f11 = 1.0f;
            f12 = 1.0f;
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix2 = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            matrix2.preScale(f13, this.mirrorVertically ? -1.0f : 1.0f);
            this.drawMatrix.preScale(f12, f11);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            if (z10) {
                glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                z11 = true;
                this.frameDrawer.drawFrame(rXVideoFrameInterface, this.drawer, this.drawMatrix, iSurfaceWidth, iSurfaceHeight, i10, i11);
                jNanoTime = System.nanoTime();
                if (this.usePresentationTimeStamp) {
                    this.eglBase.swapBuffers(rXVideoFrameInterface.getTimestampNs());
                } else {
                    this.eglBase.swapBuffers();
                }
                jNanoTime2 = System.nanoTime();
                synchronized (this.statisticsLock) {
                    this.framesRendered++;
                    this.renderTimeNs += jNanoTime2 - jNanoTime4;
                    this.renderSwapBufferTimeNs += jNanoTime2 - jNanoTime;
                }
            } else {
                z11 = true;
            }
            notifyCallbacks(rXVideoFrameInterface, z10);
            if (!this.haveRenderFirstVideoFrame) {
                notifyFristRenderCallback();
                this.haveRenderFirstVideoFrame = z11;
            }
            rXVideoFrameInterface.release();
        }
    }

    private void resetStatistics(long j10) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j10;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void addFrameListener(FrameListener frameListener, float f10) {
        addFrameListener(frameListener, f10, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f10, glDrawer, false);
    }

    public void addFrameListener(final FrameListener frameListener, final float f10, @p0 final RendererCommon.GlDrawer glDrawer, final boolean z10) {
        postToRenderThread(new Runnable() { // from class: com.bytedance.realx.video.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f42189b.lambda$addFrameListener$3(glDrawer, frameListener, f10, z10);
            }
        });
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void clearImage(final float f10, final float f11, final float f12, final float f13) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.realx.video.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42199b.lambda$clearImage$6(f10, f11, f12, f13);
                }
            });
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(@p0 EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void init(@p0 final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z10) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                throw new IllegalStateException(this.name + "Already initialized");
            }
            logD("Initializing EglRenderer");
            this.drawer = glDrawer;
            this.usePresentationTimeStamp = z10;
            HandlerThread handlerThread = new HandlerThread(this.name + TAG);
            handlerThread.start();
            HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: com.bytedance.realx.video.EglRenderer.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (EglRenderer.this.handlerLock) {
                        EglRenderer.this.renderThreadHandler = null;
                    }
                }
            });
            this.renderThreadHandler = handlerWithExceptionCallback;
            ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: com.bytedance.realx.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42184b.lambda$init$0(context, iArr);
                }
            });
            this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
            resetStatistics(System.nanoTime());
            this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
        }
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        boolean z10;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                RXVideoFrameInterface rXVideoFrameInterface2 = this.pendingFrame;
                z10 = rXVideoFrameInterface2 != null;
                if (z10) {
                    rXVideoFrameInterface2.release();
                }
                this.pendingFrame = rXVideoFrameInterface;
                rXVideoFrameInterface.retain();
                this.renderThreadHandler.post(new Runnable() { // from class: com.bytedance.realx.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42187b.renderFrameOnRenderThread();
                    }
                });
            }
            if (z10) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            Thread thread = handler == null ? null : handler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.removeCallbacks(this.logStatisticsRunnable);
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.realx.video.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42179b.lambda$release$1(countDownLatch);
                }
            });
            final Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new Runnable() { // from class: com.bytedance.realx.video.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42181b.lambda$release$2(looper);
                }
            });
            this.renderThreadHandler = null;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                RXVideoFrameInterface rXVideoFrameInterface = this.pendingFrame;
                if (rXVideoFrameInterface != null) {
                    rXVideoFrameInterface.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                runnable.run();
            } else {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.realx.video.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42197b.lambda$releaseEglSurface$5(runnable);
                    }
                });
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
            postToRenderThread(new Runnable() { // from class: com.bytedance.realx.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42194b.lambda$removeFrameListener$4(countDownLatch, frameListener);
                }
            });
            ThreadUtils.awaitUninterruptibly(countDownLatch);
        }
    }

    public void setFpsReduction(float f10) {
        logD("setFpsReduction: " + f10);
        synchronized (this.fpsReductionLock) {
            long j10 = this.minRenderPeriodNs;
            if (f10 <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f10);
            }
            if (this.minRenderPeriodNs != j10) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f10) {
        logD("setLayoutAspectRatio: " + f10);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f10;
        }
    }

    public void setMirror(boolean z10) {
        logD("setMirrorHorizontally: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z10;
        }
    }

    public void setMirrorVertically(boolean z10) {
        logD("setMirrorVertically: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z10;
        }
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
    }
}
