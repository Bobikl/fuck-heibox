package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.x;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.i;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.b;
import com.tencent.liteav.videoproducer.encoder.e;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class HardwareVideoEncoder2 {
    private EGLCore mEGLCore;
    private Surface mInputSurface;
    private long mNativeHandler;
    private final VideoEncodeParams mParams;
    private i mPixelFrameRenderer;
    private HWEncoderServerConfig mServerConfig;
    private Object mSharedContext;
    private b mSurfaceInputVideoEncoder;
    private String mTAG;
    private String mTraceId;
    private final Size mSurfaceSize = new Size(0, 0);
    private final AtomicBoolean mNeedRestart = new AtomicBoolean(false);
    private final Bundle mSessionStates = new Bundle();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private long mPreFrameTimeStamp = 0;
    private final e.a mVideoEncoderListener = new e.a() { // from class: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.1
        @Override // com.tencent.liteav.videoproducer.encoder.e.a
        public final void a() {
            HardwareVideoEncoder2.this.mNeedRestart.set(true);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onBitrateModeUpdated(VideoEncoderDef.BitrateMode bitrateMode) {
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            hardwareVideoEncoder2.nativeOnBitrateModeUpdated(hardwareVideoEncoder2.mNativeHandler, bitrateMode.mValue);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onEncodedFail(com.tencent.liteav.videobase.videobase.e.a aVar) {
            com.tencent.liteav.videobase.videobase.e.a aVar2 = com.tencent.liteav.videobase.videobase.e.a.ERR_CODE_NONE;
            HardwareVideoEncoder2.this.notifyEncodeFail();
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z10) {
            if (HardwareVideoEncoder2.this.mNativeHandler == 0 || z10) {
                LiteavLog.d(HardwareVideoEncoder2.this.mTAG, "onEncodedNAL mNativeHandler=%d,isEos=%b", Long.valueOf(HardwareVideoEncoder2.this.mNativeHandler), Boolean.valueOf(z10));
                return;
            }
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            long j10 = hardwareVideoEncoder2.mNativeHandler;
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i10 = encodedVideoFrame.nalType.mValue;
            int i11 = encodedVideoFrame.profileType.mValue;
            int i12 = encodedVideoFrame.codecType.mValue;
            int i13 = encodedVideoFrame.rotation;
            long j11 = encodedVideoFrame.dts;
            long j12 = encodedVideoFrame.pts;
            long j13 = encodedVideoFrame.gopIndex;
            long j14 = encodedVideoFrame.gopFrameIndex;
            long j15 = encodedVideoFrame.frameIndex;
            long j16 = encodedVideoFrame.refFrameIndex;
            int i14 = encodedVideoFrame.width;
            int i15 = encodedVideoFrame.height;
            Integer num = encodedVideoFrame.svcInfo;
            hardwareVideoEncoder2.nativeOnEncodedNAL(j10, encodedVideoFrame, byteBuffer, i10, i11, i12, i13, j11, j12, j13, j14, j15, j16, i14, i15, num != null, num == null ? 0 : num.intValue());
        }
    };

    public HardwareVideoEncoder2(long j10, String str, VideoEncodeParams videoEncodeParams) {
        this.mTraceId = str;
        this.mTAG = str + "HardwareVideoEncoder2_" + hashCode();
        this.mNativeHandler = j10;
        this.mParams = videoEncodeParams;
    }

    public static PixelFrame createPixelFrameByTexture(int i10, int i11, int i12, int i13, long j10, int i14, boolean z10, boolean z11, int i15, Object obj) {
        if (i12 != GLConstants.a.TEXTURE_2D.mValue) {
            GLConstants.a aVar = GLConstants.a.TEXTURE_OES;
        }
        GLConstants.PixelFormatType.RGBA.getValue();
        PixelFrame pixelFrame = new PixelFrame(i10, i11, 0, i12, i13);
        pixelFrame.setMirrorHorizontal(z10);
        pixelFrame.setMirrorVertical(z11);
        pixelFrame.setTextureId(i15);
        pixelFrame.setGLContext(obj);
        pixelFrame.setRotation(l.a(i14));
        pixelFrame.setTimestamp(j10);
        return pixelFrame;
    }

    private void drawFrameToInputSurface(PixelFrame pixelFrame) {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
            PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
            boolean z10 = true;
            if (pixelFrame2.getRotation() == l.ROTATION_90 || pixelFrame2.getRotation() == l.ROTATION_270) {
                if (pixelFrame2.isMirrorHorizontal()) {
                    z10 = false;
                }
                pixelFrame2.setMirrorHorizontal(z10);
            } else {
                if (pixelFrame2.isMirrorVertical()) {
                    z10 = false;
                }
                pixelFrame2.setMirrorVertical(z10);
            }
            Size size = this.mSurfaceSize;
            OpenGlUtils.glViewport(0, 0, size.width, size.height);
            i iVar = this.mPixelFrameRenderer;
            if (iVar != null) {
                iVar.a(pixelFrame2, GLConstants.GLScaleType.CENTER_CROP, (d) null);
            }
            b bVar = this.mSurfaceInputVideoEncoder;
            long timestamp = pixelFrame2.getTimestamp();
            if (bVar.f100837i.isEmpty()) {
                bVar.f100838j.set(SystemClock.elapsedRealtime());
            }
            bVar.f100837i.addLast(Long.valueOf(timestamp));
            bVar.f100831c.sendEmptyMessageDelayed(10, 10L);
            if (pixelFrame2.getTimestamp() < this.mPreFrameTimeStamp) {
                LiteavLog.e(this.mTAG, "timestamp is not increase. pre: " + this.mPreFrameTimeStamp + ", cur: " + pixelFrame2.getTimestamp());
            }
            this.mPreFrameTimeStamp = pixelFrame2.getTimestamp();
            this.mEGLCore.setPresentationTime(TimeUnit.MILLISECONDS.toNanos(pixelFrame2.getTimestamp()));
            this.mEGLCore.swapBuffers();
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(this.mThrottlers.a("EncodeFrameError"), this.mTAG, "makeCurrent failed. error = ".concat(String.valueOf("VideoEncode: swapBuffer error, EGLCode:" + e10.mErrorCode + " message:" + e10.getMessage())), e10);
            notifyEncodeFail();
        }
    }

    public static Object getCurrentContext() {
        return OpenGlUtils.getCurrentContext();
    }

    private ServerVideoProducerConfig getServerVideoProducerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        ServerVideoProducerConfig serverVideoProducerConfig = new ServerVideoProducerConfig();
        serverVideoProducerConfig.setHardwareEncodeType(hWEncoderServerConfig.getHardwareEncodeType());
        serverVideoProducerConfig.setHardwareEncoderHighProfileEnable(hWEncoderServerConfig.getHardwareEncoderHighProfileEnable());
        serverVideoProducerConfig.setHardwareEncoderHighProfileSupport(hWEncoderServerConfig.getHardwareEncoderHighProfileSupport());
        Boolean boolIsHardwareEncoderBitrateModeCBRSupported = hWEncoderServerConfig.isHardwareEncoderBitrateModeCBRSupported();
        if (boolIsHardwareEncoderBitrateModeCBRSupported != null) {
            serverVideoProducerConfig.setHardwareEncoderBitrateModeCBRSupported(boolIsHardwareEncoderBitrateModeCBRSupported.booleanValue());
        }
        return serverVideoProducerConfig;
    }

    private boolean initOpenGLComponents(Object obj, Surface surface) {
        if (surface == null) {
            LiteavLog.w(this.mThrottlers.a("NoSurface"), this.mTAG, "init opengl: surface is null.", new Object[0]);
            return false;
        }
        LiteavLog.d(this.mThrottlers.a("initGL"), this.mTAG, "initOpenGLComponents", new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            Size size = this.mSurfaceSize;
            eGLCore.initialize(obj, surface, size.width, size.height);
            this.mSharedContext = obj;
            Size size2 = this.mSurfaceSize;
            this.mPixelFrameRenderer = new i(size2.width, size2.height);
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(this.mThrottlers.a("initGLError"), this.mTAG, "create EGLCore failed. error = ".concat(String.valueOf("VideoEncode: create EGLCore failed, EGLCode:" + e10.mErrorCode + " message:" + e10.getMessage())), e10);
            notifyStartEncodedFail();
            this.mEGLCore = null;
            return false;
        }
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnBitrateModeUpdated(long j10, int i10);

    private native void nativeOnEncodedFail(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnEncodedNAL(long j10, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j11, long j12, long j13, long j14, long j15, long j16, int i14, int i15, boolean z10, int i16);

    private native void nativeOnStartEncodedFail(long j10);

    private boolean restart() {
        LiteavLog.d(this.mTAG, "reStart");
        stop();
        return start();
    }

    private boolean start() {
        if (this.mSurfaceInputVideoEncoder != null) {
            return this.mInputSurface != null;
        }
        LiteavLog.i(this.mTAG, "Start hw video encoder. %s", this.mParams);
        b bVar = new b(this.mSessionStates, new com.tencent.liteav.videobase.videobase.d(), this.mTraceId);
        this.mSurfaceInputVideoEncoder = bVar;
        bVar.f100831c = new CustomHandler(Looper.myLooper()) { // from class: com.tencent.liteav.videoproducer.encoder.b.1
            public AnonymousClass1(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 10) {
                    b.this.c();
                }
            }
        };
        this.mSurfaceInputVideoEncoder.a(getServerVideoProducerConfig(this.mServerConfig));
        b bVar2 = this.mSurfaceInputVideoEncoder;
        VideoEncodeParams videoEncodeParams = this.mParams;
        e.a aVar = this.mVideoEncoderListener;
        LiteavLog.d(bVar2.f100829a, com.google.android.exoplayer2.text.ttml.d.f49798o0);
        bVar2.f100833e = aVar;
        Surface surfaceA = bVar2.a(videoEncodeParams);
        LiteavLog.i(bVar2.f100829a, "startCodecInternal success");
        Size size = new Size(720, 1280);
        VideoEncodeParams videoEncodeParams2 = bVar2.f100834f;
        if (videoEncodeParams2 != null) {
            size.set(videoEncodeParams2.width, videoEncodeParams2.height);
        }
        Pair pair = new Pair(surfaceA, size);
        this.mInputSurface = (Surface) pair.first;
        this.mSurfaceSize.set((Size) pair.second);
        if (this.mInputSurface != null) {
            return true;
        }
        notifyStartEncodedFail();
        return false;
    }

    private void stop() {
        uninitOpenGLComponents();
        Surface surface = this.mInputSurface;
        if (surface != null) {
            surface.release();
            this.mInputSurface = null;
        }
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            LiteavLog.i(bVar.f100829a, "stop");
            bVar.b();
            bVar.a();
            this.mSurfaceInputVideoEncoder.a();
            this.mSurfaceInputVideoEncoder = null;
        }
    }

    private void uninitOpenGLComponents() {
        if (this.mEGLCore == null) {
            return;
        }
        LiteavLog.d(this.mThrottlers.a("uninitGL"), this.mTAG, "uninitOpenGLComponents", new Object[0]);
        try {
            this.mEGLCore.makeCurrent();
            i iVar = this.mPixelFrameRenderer;
            if (iVar != null) {
                iVar.a();
                this.mPixelFrameRenderer = null;
            }
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(this.mThrottlers.a("unintGLError"), this.mTAG, "makeCurrent failed.", e10);
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (!this.mNeedRestart.getAndSet(false) || restart()) {
            if (this.mSurfaceInputVideoEncoder != null || start()) {
                pixelFrame.getGLContext();
                if (!CommonUtil.equals(pixelFrame.getGLContext(), this.mSharedContext)) {
                    uninitOpenGLComponents();
                }
                if (this.mEGLCore != null || initOpenGLComponents(pixelFrame.getGLContext(), this.mInputSurface)) {
                    this.mSurfaceInputVideoEncoder.c();
                    drawFrameToInputSurface(pixelFrame);
                }
            }
        }
    }

    public synchronized void notifyEncodeFail() {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnEncodedFail(j10);
        }
    }

    public synchronized void notifyStartEncodedFail() {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnStartEncodedFail(j10);
        }
    }

    public synchronized void release() {
        LiteavLog.d(this.mTAG, "release");
        this.mNativeHandler = 0L;
        stop();
    }

    public void requestKeyFrame() {
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void setBitrate(int i10) {
        MediaCodec mediaCodec;
        LiteavLog.i(this.mTAG, "SetBitrate ".concat(String.valueOf(i10)));
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar == null) {
            this.mParams.bitrate = i10;
            return;
        }
        VideoEncodeParams videoEncodeParams = bVar.f100834f;
        if (videoEncodeParams == null) {
            LiteavLog.w(bVar.f100829a, "encoder not started yet. set bitrate to " + i10 + " kbps will not take effect.");
            return;
        }
        if (videoEncodeParams.bitrate != i10) {
            LiteavLog.i(bVar.f100829a, "set bitrate to " + i10 + " kbps");
            boolean z10 = false;
            if (i10 < bVar.f100834f.bitrate) {
                if (bVar.f100830b.getBoolean("need_restart_when_down_bitrate", false)) {
                    z10 = true;
                } else {
                    bVar.a(i10);
                }
            }
            bVar.f100834f.bitrate = i10;
            if (LiteavSystemInfo.getSystemOSVersionInt() < 19 || (mediaCodec = bVar.f100832d) == null) {
                return;
            }
            if (!z10) {
                bVar.a(mediaCodec, i10);
                return;
            }
            bVar.f100831c.removeCallbacks(bVar.f100839k);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - bVar.f100835g;
            if (jElapsedRealtime >= TimeUnit.SECONDS.toMillis(2L)) {
                bVar.f100839k.run();
            } else {
                bVar.f100831c.postDelayed(bVar.f100839k, 2000 - jElapsedRealtime);
            }
        }
    }

    public void setHWEncoderServerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        this.mServerConfig = hWEncoderServerConfig;
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.a(getServerVideoProducerConfig(hWEncoderServerConfig));
        }
    }

    public void signalEndOfStream() {
        final b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            LiteavLog.i(bVar.f100829a, "signalEndOfStream");
            MediaCodec mediaCodec = bVar.f100832d;
            if (mediaCodec != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                } catch (Throwable th2) {
                    LiteavLog.e(bVar.f100829a, "signalEndOfStream failed.", th2);
                }
            }
            if (bVar.f100836h == null) {
                x xVar = new x(Looper.myLooper(), new x.a(bVar) { // from class: com.tencent.liteav.videoproducer.encoder.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final b f100857a;

                    {
                        this.f100857a = bVar;
                    }

                    @Override // com.tencent.liteav.base.util.x.a
                    public final void onTimeout() {
                        this.f100857a.c();
                    }
                });
                bVar.f100836h = xVar;
                xVar.a(30);
            }
        }
    }
}
