package com.ss.bytertc.engine.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.p0;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.bytertc.base.media.EglRenderer;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.converter.WebRTCConverter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class VideoFrameRender implements View.OnLayoutChangeListener, RendererCommon.RendererEvents, EglRenderer.FirstVideoFrameRenderListener {
    private static final String TAG = "VideoFrameRender";
    private boolean enableFixedSize;
    private volatile EglRenderer mEglRenderer;
    private final String mRenderName;
    private volatile Surface mSurface;
    private volatile SurfaceView mSurfaceView;
    private Looper mTextureProcessLooper;
    private volatile TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private long mReceiveFirstTimeStampMs = 0;
    private boolean mHasReceivedFirstFrame = false;
    private final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    private final Object mRenderLock = new Object();
    private final Object mTextureProcessLock = new Object();
    private final Object mFirstFrameListenerLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    private final VideoFrameConverter frameConverter = new VideoFrameConverter(true);
    private final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() { // from class: com.ss.bytertc.engine.ui.VideoFrameRender.1
        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onCreated() {
            if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                return;
            }
            LogUtil.e(VideoFrameRender.TAG, "Already has an another surface created.");
        }

        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onDestroy() {
            if (!VideoFrameRender.this.mHasInitAtomic.get()) {
                VideoFrameRender.this.mEglSurfaceCreatedAtomic.set(false);
            } else {
                if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    return;
                }
                LogUtil.e(VideoFrameRender.TAG, "Already has an another surface destroyed.");
            }
        }
    };

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender(int i10);
    }

    public interface SurfaceLifecycleCallback {
        void onCreated();

        void onDestroy();
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i10, int i11) {
        if (bArr != null && bArr.length != 0) {
            int i12 = (i10 + 1) / 2;
            int i13 = i10 * i11;
            int i14 = ((i11 + 1) / 2) * i12;
            final ByteBuffer byteBufferNativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i13);
            final ByteBuffer byteBufferNativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i14);
            final ByteBuffer byteBufferNativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i14);
            if (byteBufferNativeAllocateBuffer != null && byteBufferNativeAllocateBuffer2 != null && byteBufferNativeAllocateBuffer3 != null) {
                byteBufferNativeAllocateBuffer.put(bArr, 0, i13);
                byteBufferNativeAllocateBuffer2.put(bArr, i13, i14);
                byteBufferNativeAllocateBuffer3.put(bArr, i13 + i14, i14);
                byteBufferNativeAllocateBuffer.position(0);
                byteBufferNativeAllocateBuffer2.position(0);
                byteBufferNativeAllocateBuffer3.position(0);
                return this.mEglRenderer instanceof TextureEglRenderer ? CountDownLatchI420Buffer.wrap(i10, i11, byteBufferNativeAllocateBuffer, i10, byteBufferNativeAllocateBuffer2, i12, byteBufferNativeAllocateBuffer3, i12, new Runnable() { // from class: com.ss.bytertc.engine.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameRender.lambda$createYUV$3(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                    }
                }) : JavaI420Buffer.wrap(i10, i11, byteBufferNativeAllocateBuffer, i10, byteBufferNativeAllocateBuffer2, i12, byteBufferNativeAllocateBuffer3, i12, new Runnable() { // from class: com.ss.bytertc.engine.ui.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameRender.lambda$createYUV$4(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                    }
                });
            }
            if (byteBufferNativeAllocateBuffer != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer);
            }
            if (byteBufferNativeAllocateBuffer2 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer2);
            }
            if (byteBufferNativeAllocateBuffer3 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer3);
            }
        }
        return null;
    }

    private void initSurfaceView() {
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer instanceof SurfaceEglRender) {
                ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                this.mSurfaceView.addOnLayoutChangeListener(this);
            }
        }
    }

    private void initTextureView() {
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                if (this.mTextureView.isShown()) {
                    textureEglRenderer.setLayoutAspectRatio(this.mTextureView.getMeasuredWidth() / this.mTextureView.getMeasuredHeight());
                }
                this.mTextureView.addOnLayoutChangeListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createYUV$3(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createYUV$4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$1(int i10, int i11) {
        this.rotatedFrameWidth = i10;
        this.rotatedFrameHeight = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$renderTextureFrame$2() {
    }

    private void notifyFristRenderCallback() {
        synchronized (this.mFirstFrameListenerLock) {
            if (this.mFirstVideoFrameListeners.isEmpty()) {
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStampMs);
            Iterator<FirstVideoFrameRenderListener> it = this.mFirstVideoFrameListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstVideoFrameRender(iCurrentTimeMillis);
            }
        }
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        synchronized (this.mRenderLock) {
            if (this.mEglSurfaceCreatedAtomic.get() && this.mEglRenderer != null) {
                if (!this.mHasReceivedFirstFrame) {
                    this.mReceiveFirstTimeStampMs = System.currentTimeMillis();
                    this.mHasReceivedFirstFrame = true;
                }
                this.mEglRenderer.onFrame(videoFrame);
            }
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i10, int i11, int i12, long j10) {
        VideoFrameConverter videoFrameConverter;
        if (byteBuffer == null || (videoFrameConverter = this.frameConverter) == null) {
            return;
        }
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer = this.mEglRenderer instanceof TextureEglRenderer ? videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i10, i11, true) : videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i10, i11, false);
        if (i420BufferConvertToJavaI420Buffer != null) {
            VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i12, j10);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    private void renderI420Frame(byte[] bArr, int i10, int i11, int i12, long j10) {
        VideoFrameConverter videoFrameConverter;
        if (bArr == null || bArr.length <= 0 || (videoFrameConverter = this.frameConverter) == null) {
            return;
        }
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer = this.mEglRenderer instanceof TextureEglRenderer ? videoFrameConverter.convertToJavaI420Buffer(bArr, i10, i11, true) : videoFrameConverter.convertToJavaI420Buffer(bArr, i10, i11, false);
        if (i420BufferConvertToJavaI420Buffer != null) {
            VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i12, j10);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    private void renderTextureFrame(int i10, VideoFrame.TextureBuffer.Type type, int i11, int i12, int i13, long j10, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i11, i12, type, i10, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), new Runnable() { // from class: com.ss.bytertc.engine.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameRender.lambda$renderTextureFrame$2();
            }
        }), i13, j10);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = this.mSurfaceView.getWidth() / this.mSurfaceView.getHeight();
        int i10 = this.rotatedFrameWidth;
        int i11 = this.rotatedFrameHeight;
        if (i10 / i11 > width) {
            i10 = (int) (i11 * width);
        } else {
            i11 = (int) (i10 / width);
        }
        int iMin = Math.min(this.mSurfaceView.getWidth(), i10);
        int iMin2 = Math.min(this.mSurfaceView.getHeight(), i11);
        LogUtil.d(TAG, "updateSurfaceSize. Layout size: " + this.mSurfaceView.getWidth() + "x" + this.mSurfaceView.getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + iMin + "x" + iMin2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        this.mSurfaceView.getHolder().setFixedSize(iMin, iMin2);
    }

    public void consumeByteArrayFrame(byte[] bArr, @p0 ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10) {
        if (i10 != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(bArr, i11, i12, i13, j10);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, @p0 ByteBuffer byteBuffer2, int i10, int i11, int i12, int i13, long j10) {
        if (i10 != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(byteBuffer, i11, i12, i13, j10);
    }

    public void consumeTextureFrame(int i10, @p0 ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, long j10, float[] fArr) {
        if (i11 != VideoPixelFormat.I420.value()) {
            return;
        }
        synchronized (this.mTextureProcessLock) {
            if (this.mTextureProcessLooper == null) {
                this.mTextureProcessLooper = Looper.getMainLooper();
            }
            renderTextureFrame(i10, VideoFrame.TextureBuffer.Type.RGB, i12, i13, i14, j10, fArr, this.mTextureProcessLooper);
        }
    }

    public void consumeVideoFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        VideoFrame videoFrameConvertByteRGBAFrame2WebrtcI420Frame;
        if (videoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteTexFrame2WebrtcTexFrame(videoFrame, this.mTextureProcessLooper);
        } else if (videoFrame.getPixelFormat() == VideoPixelFormat.I420) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteI420Frame2WebrtcI420Frame(videoFrame);
        } else {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = videoFrame.getPixelFormat() == VideoPixelFormat.RGBA ? WebRTCConverter.convertByteRGBAFrame2WebrtcI420Frame(videoFrame) : null;
        }
        if (videoFrameConvertByteRGBAFrame2WebrtcI420Frame != null) {
            onVideoFrame(videoFrameConvertByteRGBAFrame2WebrtcI420Frame);
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame.release();
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, int i14, int i15, long j10, @p0 ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i10, i11, i12, i13, i14), i13, i14, i15, j10);
    }

    public void disableFpsReduction() {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.disableFpsReduction();
            }
        }
    }

    public void init(final EglBase.Context context) {
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            throw new IllegalStateException("Already initialized");
        }
        synchronized (this.mRenderLock) {
            if (this.mSurfaceView == null && this.mSurface == null && this.mTextureView == null && this.mEglRenderer == null) {
                return;
            }
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            if (this.mEglRenderer instanceof SurfaceEglRender) {
                ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), new Runnable() { // from class: com.ss.bytertc.engine.ui.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98002b.lambda$init$0(context);
                    }
                });
            } else {
                this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
            }
        }
    }

    public void onDispose() {
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("Try to dispose an not initialized VideoFrameRender");
        }
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.release();
                this.mEglRenderer.createEglSurface((Surface) null);
            }
            if (this.mSurfaceView != null) {
                this.mSurfaceView.removeOnLayoutChangeListener(this);
            } else if (this.mTextureView != null) {
                this.mTextureView.setSurfaceTextureListener(null);
                this.mTextureView.removeOnLayoutChangeListener(this);
            }
            this.mEglSurfaceCreatedAtomic.set(false);
        }
        synchronized (this.mFirstFrameListenerLock) {
            this.mFirstVideoFrameListeners.clear();
        }
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    @Override // com.ss.bytertc.base.media.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i10, int i11, int i12) {
        final int i13 = (i12 == 0 || i12 == 180) ? i10 : i11;
        if (i12 == 0 || i12 == 180) {
            i10 = i11;
        }
        postOrRun(new Runnable() { // from class: com.ss.bytertc.engine.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f97999b.lambda$onFrameResolutionChanged$1(i13, i10);
            }
        });
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setLayoutAspectRatio((i12 - i10) / (i13 - i11));
            }
            if (this.mSurfaceView != null) {
                updateSurfaceSize();
            }
        }
    }

    public void onStart() {
        if (this.mHasRenderViewAtomic.get() && this.mHasInitAtomic.get()) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    public void release() {
        onDispose();
    }

    public void setEnableHardwareScaler(boolean z10) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z10;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void setFpsReduction(float f10) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setFpsReduction(f10);
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.mFirstFrameListenerLock) {
            this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void setMirror(boolean z10) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setMirror(z10);
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        synchronized (this.mTextureProcessLock) {
            this.mTextureProcessLooper = looper;
        }
    }

    public void setRenderView(Surface surface) {
        if (this.mEglSurfaceCreatedAtomic.get() || surface == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mSurface = surface;
            new EglRenderer(this.mRenderName).createEglSurface(surface);
        }
        this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        if (this.mEglSurfaceCreatedAtomic.get() || surfaceView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        this.mSurfaceView = surfaceView;
        synchronized (this.mRenderLock) {
            SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
            surfaceEglRender.setSurfaceHolderCallback(callback);
            surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
            this.mEglRenderer = surfaceEglRender;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mEglSurfaceCreatedAtomic.get() || textureView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mTextureView = textureView;
            TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
            textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
            this.mEglRenderer = textureEglRenderer;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setRenderModel(scalingType);
            }
        }
    }
}
