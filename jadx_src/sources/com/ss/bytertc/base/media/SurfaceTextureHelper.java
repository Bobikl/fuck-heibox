package com.ss.bytertc.base.media;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.TimestampAligner;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private static float[] TEX_MATRIX = new float[16];
    private boolean capture2DTexture;
    private final EglBase eglBase;
    private final int frameBufferId;
    private int frameRotation;
    private final GlRectDrawer glRectDrawer;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private long lastDeliverTime;

    @p0
    private VideoSink listener;
    private boolean mUsedByCamera;
    private int maxDeliverTimerInternal;
    private final int oesTextureId;

    @p0
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    final Runnable timedDeliverRunnable;

    @p0
    private final TimestampAligner timestampAligner;
    private final int twoDTextureId;
    private final YuvConverter yuvConverter;

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z10, boolean z11) {
        this.yuvConverter = new YuvConverter();
        this.capture2DTexture = false;
        this.mUsedByCamera = false;
        this.setListenerRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                RXLogging.i(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.lastDeliverTime = 0L;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (SurfaceTextureHelper.this.maxDeliverTimerInternal <= 0 || SurfaceTextureHelper.this.handler == null || SurfaceTextureHelper.this.listener == null) {
                    return;
                }
                if (!SurfaceTextureHelper.this.hasPendingTexture && System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime >= SurfaceTextureHelper.this.maxDeliverTimerInternal) {
                    SurfaceTextureHelper.this.hasPendingTexture = true;
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                }
                long jCurrentTimeMillis = ((long) SurfaceTextureHelper.this.maxDeliverTimerInternal) - (System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime);
                Handler handler2 = SurfaceTextureHelper.this.handler;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = SurfaceTextureHelper.this.maxDeliverTimerInternal;
                }
                handler2.postDelayed(this, jCurrentTimeMillis);
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
        this.handler = handler;
        this.timestampAligner = z10 ? new TimestampAligner() : null;
        this.capture2DTexture = z11;
        EglBase eglBaseC = com.bytedance.realx.video.a.c(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBaseC;
        try {
            eglBaseC.createDummyPbufferSurface();
            eglBaseC.makeCurrent();
            if (z11) {
                this.glRectDrawer = new GlRectDrawer();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
                Matrix.setIdentityM(TEX_MATRIX, 0);
                this.twoDTextureId = GlUtil.generateTexture(bb.c.e.F);
            } else {
                this.glRectDrawer = null;
                this.frameBufferId = 0;
                this.twoDTextureId = 0;
            }
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: com.ss.bytertc.base.media.q
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.f97911b.lambda$new$0(surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e10) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e10;
        }
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z10) {
        return create(str, context, z10, false);
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z10, final boolean z11) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @p0
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z10, z11);
                } catch (RuntimeException e10) {
                    RXLogging.e(SurfaceTextureHelper.TAG, str + " create failure", e10);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$5() {
        this.isQuitting = true;
        if (this.isTextureInUse) {
            return;
        }
        release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$returnTextureFrame$4() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRotation$3(int i10) {
        this.frameRotation = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureSize$2(int i10, int i11) {
        this.textureWidth = i10;
        this.textureHeight = i11;
        if (this.capture2DTexture) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(bb.c.e.F, this.twoDTextureId);
            GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.OB, i10, i11, 0, bb.c.f.OB, bb.c.f.Zc, null);
            GLES20.glBindTexture(bb.c.e.F, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        this.yuvConverter.release();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        if (this.capture2DTexture) {
            GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
            this.glRectDrawer.release();
        }
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f97913b.lambda$returnTextureFrame$4();
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        TextureBufferImpl textureBufferImpl;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            RXLogging.w(TAG, "Texture size has not been set.");
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        if (this.mUsedByCamera) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        } else {
            this.surfaceTexture.getTransformMatrix(fArr);
        }
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        this.lastDeliverTime = System.currentTimeMillis();
        if (this.capture2DTexture) {
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, this.twoDTextureId, 0);
            GlRectDrawer glRectDrawer = this.glRectDrawer;
            int i10 = this.oesTextureId;
            float[] fArr2 = TEX_MATRIX;
            int i11 = this.textureWidth;
            int i12 = this.textureHeight;
            glRectDrawer.drawOes(i10, fArr2, i11, i12, 0, 0, i11, i12);
            GLES20.glBindFramebuffer(36160, 0);
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.RGB, this.twoDTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: com.ss.bytertc.base.media.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97906b.returnTextureFrame();
                }
            });
        } else {
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: com.ss.bytertc.base.media.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97906b.returnTextureFrame();
                }
            });
        }
        VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        RXLogging.i(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.bytertc.base.media.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f97912b.lambda$dispose$5();
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(final int i10) {
        this.handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f97904b.lambda$setFrameRotation$3(i10);
            }
        });
    }

    public void setMinFps(int i10) {
        if (i10 > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / i10);
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void setTextureSize(final int i10, final int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was " + i10);
        }
        if (i11 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i10, i11);
            this.handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97907b.lambda$setTextureSize$2(i10, i11);
                }
            });
        } else {
            throw new IllegalArgumentException("Texture height must be positive, but was " + i11);
        }
    }

    public void setUsedByCamera(boolean z10) {
        this.mUsedByCamera = z10;
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
        this.handler.post(this.timedDeliverRunnable);
    }

    public void stopListening() {
        RXLogging.i(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.bytertc.base.media.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f97910b.lambda$stopListening$1();
            }
        });
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }
}
