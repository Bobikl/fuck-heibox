package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class HardwareVideoDecoder implements MediaCodecDecoder.MediaCodecDecoderListener, VideoDecoderInterface {
    private static final int INTERVAL_DRAIN_ONE_FRAME_MORE = 30;
    private final HardwareDecoderMediaFormatBuilder mDecoderMediaFormatBuilder;
    private final HardwareVideoDecoderParams mParams;
    private MediaCodec mPreloadMediaCodec;
    private String mTAG = "HardwareVideoDecoder";
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private Surface mOutputSurface = null;
    private MediaCodecDecoder mMediaCodecDecoder = null;
    private volatile CustomHandler mWorkHandler = null;
    private VideoDecoderListener mListener = null;
    private EncodedVideoFrame mPendingDecodeFrame = null;
    private boolean mAllowDrainDecodedFrames = true;
    private VideoDecoderDef.ConsumerScene mScene = VideoDecoderDef.ConsumerScene.UNKNOWN;
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private boolean mIsNeedNotifyAbandonCompleted = false;
    private long mDecodedFrameCount = 0;

    public static class HardwareVideoDecoderParams {
        public boolean isHDR;
        public boolean isLowLatencyEnabled;
        public JSONArray mediaCodecDeviceRelatedParams;
        public MediaFormat mediaFormat;
        public Size resolution;
        public boolean useHevc;
        public boolean useOutputBuffer;
        public boolean useSoftDecoder;

        public HardwareVideoDecoderParams() {
            this.isHDR = false;
            this.useHevc = false;
            this.useOutputBuffer = false;
            this.isLowLatencyEnabled = false;
            this.resolution = null;
            this.mediaFormat = null;
            this.useSoftDecoder = false;
            this.mediaCodecDeviceRelatedParams = null;
        }

        public HardwareVideoDecoderParams(HardwareVideoDecoderParams hardwareVideoDecoderParams) {
            this.isHDR = false;
            this.useHevc = false;
            this.useOutputBuffer = false;
            this.isLowLatencyEnabled = false;
            this.resolution = null;
            this.mediaFormat = null;
            this.useSoftDecoder = false;
            this.mediaCodecDeviceRelatedParams = null;
            this.isHDR = hardwareVideoDecoderParams.isHDR;
            this.useHevc = hardwareVideoDecoderParams.useHevc;
            this.useOutputBuffer = hardwareVideoDecoderParams.useOutputBuffer;
            this.isLowLatencyEnabled = hardwareVideoDecoderParams.isLowLatencyEnabled;
            this.resolution = hardwareVideoDecoderParams.resolution;
            this.mediaFormat = hardwareVideoDecoderParams.mediaFormat;
            this.mediaCodecDeviceRelatedParams = hardwareVideoDecoderParams.mediaCodecDeviceRelatedParams;
            this.useSoftDecoder = hardwareVideoDecoderParams.useSoftDecoder;
        }
    }

    public HardwareVideoDecoder(HardwareVideoDecoderParams hardwareVideoDecoderParams, MediaCodec mediaCodec) {
        HardwareVideoDecoderParams hardwareVideoDecoderParams2 = new HardwareVideoDecoderParams(hardwareVideoDecoderParams);
        this.mParams = hardwareVideoDecoderParams2;
        this.mPreloadMediaCodec = mediaCodec;
        String string = hardwareVideoDecoderParams2.useHevc ? "video/hevc" : "video/avc";
        MediaFormat mediaFormat = hardwareVideoDecoderParams.mediaFormat;
        if (mediaFormat != null) {
            hardwareVideoDecoderParams2.resolution = new Size(mediaFormat.getInteger("width"), hardwareVideoDecoderParams.mediaFormat.getInteger("height"));
            string = hardwareVideoDecoderParams.mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
        }
        this.mDecoderMediaFormatBuilder = new HardwareDecoderMediaFormatBuilder().setMediaFormat(hardwareVideoDecoderParams2.mediaFormat).setMediaCodecDeviceRelatedParams(hardwareVideoDecoderParams2.mediaCodecDeviceRelatedParams).setMimeType(string).setWidth(hardwareVideoDecoderParams2.resolution.getWidth()).setHeight(hardwareVideoDecoderParams2.resolution.getHeight());
        this.mTAG += lg.a.f131412e + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abandonDecodingFramesInternal() {
        releasePendingDecodeFrame();
        MediaCodecDecoder mediaCodecDecoder = this.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.flush();
        }
        if (this.mAllowDrainDecodedFrames) {
            notifyOnAbandonDecodingFramesCompleted();
        } else {
            this.mIsNeedNotifyAbandonCompleted = true;
        }
    }

    private boolean allowDrainOneFrameMore() {
        return this.mDecodedFrameCount % 30 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drainAndFeedFrame() {
        EncodedVideoFrame encodedVideoFrame;
        if (this.mMediaCodecDecoder == null) {
            LiteavLog.w(this.mTAG, "MediaCodec is stopped.");
            releasePendingDecodeFrame();
            return;
        }
        try {
            if (this.mAllowDrainDecodedFrames) {
                drainDecodedFrame();
            }
            synchronized (this) {
                encodedVideoFrame = this.mPendingDecodeFrame;
            }
            if (encodedVideoFrame != null && this.mMediaCodecDecoder.feedEncodedFrame(encodedVideoFrame)) {
                synchronized (this) {
                    if (this.mPendingDecodeFrame == encodedVideoFrame) {
                        this.mPendingDecodeFrame = null;
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "decode failed.", th2);
            handleDecoderError();
        }
    }

    private boolean drainDecodedFrame() {
        if (this.mMediaCodecDecoder.drainDecodedFrame()) {
            this.mAllowDrainDecodedFrames = false;
        }
        return this.mAllowDrainDecodedFrames;
    }

    private void handleDecoderError() {
        releasePendingDecodeFrame();
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFailed();
        }
    }

    static /* synthetic */ void lambda$setOutputSurface$2(HardwareVideoDecoder hardwareVideoDecoder, Surface surface) {
        if (hardwareVideoDecoder.mOutputSurface == surface) {
            return;
        }
        LiteavLog.i(hardwareVideoDecoder.mTAG, "setSurface ".concat(String.valueOf(surface)));
        hardwareVideoDecoder.mOutputSurface = surface;
        MediaCodecDecoder mediaCodecDecoder = hardwareVideoDecoder.mMediaCodecDecoder;
        if (mediaCodecDecoder == null || !(mediaCodecDecoder instanceof MediaCodecHDRDecoder)) {
            return;
        }
        ((MediaCodecHDRDecoder) mediaCodecDecoder).setOutputSurface(surface);
    }

    static /* synthetic */ void lambda$setScene$1(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        hardwareVideoDecoder.mScene = consumerScene;
        MediaCodecDecoder mediaCodecDecoder = hardwareVideoDecoder.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.enableLimitMaxDecFrameBuffer(hardwareVideoDecoder.mEnableLimitMaxDecFrameBufferingInH264Sps && consumerScene == VideoDecoderDef.ConsumerScene.RTC);
        }
    }

    private void notifyEndOfStream() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeCompleted();
        }
    }

    private void notifyOnAbandonDecodingFramesCompleted() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onAbandonDecodingFramesCompleted();
        }
    }

    private void releasePendingDecodeFrame() {
        this.mPendingDecodeFrame = null;
    }

    private void runOnWorkThread(Runnable runnable) {
        if (this.mWorkHandler != null) {
            this.mWorkHandler.runOrPost(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal(Object obj, VideoDecoderListener videoDecoderListener) {
        LiteavLog.i(this.mTAG, "Start decoder with eglContext:%s", obj);
        System.currentTimeMillis();
        if (this.mMediaCodecDecoder != null) {
            LiteavLog.w(this.mTAG, "Decoder already started.");
            return;
        }
        HardwareVideoDecoderParams hardwareVideoDecoderParams = this.mParams;
        String string = hardwareVideoDecoderParams.useHevc ? "video/hevc" : "video/avc";
        MediaFormat mediaFormat = hardwareVideoDecoderParams.mediaFormat;
        if (mediaFormat != null) {
            string = mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
        }
        int supportColorFormat = DecodeAbilityProvider.getInstance().getSupportColorFormat(string);
        HardwareVideoDecoderParams hardwareVideoDecoderParams2 = this.mParams;
        if (hardwareVideoDecoderParams2.isHDR) {
            MediaCodecHDRDecoder mediaCodecHDRDecoder = new MediaCodecHDRDecoder(this.mDecoderMediaFormatBuilder, hardwareVideoDecoderParams2.resolution, hardwareVideoDecoderParams2.useSoftDecoder, this, this.mWorkHandler);
            this.mMediaCodecDecoder = mediaCodecHDRDecoder;
            mediaCodecHDRDecoder.setOutputSurface(this.mOutputSurface);
        } else if (hardwareVideoDecoderParams2.useOutputBuffer && MediaCodecOutputBufferDecoder.isSupportColorFormat(supportColorFormat)) {
            HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder = this.mDecoderMediaFormatBuilder;
            HardwareVideoDecoderParams hardwareVideoDecoderParams3 = this.mParams;
            this.mMediaCodecDecoder = new MediaCodecOutputBufferDecoder(hardwareDecoderMediaFormatBuilder, hardwareVideoDecoderParams3.resolution, hardwareVideoDecoderParams3.useSoftDecoder, this, this.mWorkHandler);
        } else {
            HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder2 = this.mDecoderMediaFormatBuilder;
            HardwareVideoDecoderParams hardwareVideoDecoderParams4 = this.mParams;
            this.mMediaCodecDecoder = new MediaCodecOutputOESTextureDecoder(hardwareDecoderMediaFormatBuilder2, hardwareVideoDecoderParams4.resolution, hardwareVideoDecoderParams4.useSoftDecoder, this, this.mWorkHandler);
        }
        this.mMediaCodecDecoder.enableLimitMaxDecFrameBuffer(this.mEnableLimitMaxDecFrameBufferingInH264Sps && this.mScene == VideoDecoderDef.ConsumerScene.RTC);
        this.mMediaCodecDecoder.start(obj);
        this.mListener = videoDecoderListener;
        MediaCodecDecoder.BuildResult buildResultBuildMediaCodec = this.mMediaCodecDecoder.buildMediaCodec(this.mParams.isLowLatencyEnabled, this.mPreloadMediaCodec);
        boolean z10 = this.mParams.isLowLatencyEnabled && buildResultBuildMediaCodec.isSuccess;
        if (!buildResultBuildMediaCodec.isSuccess) {
            buildResultBuildMediaCodec = this.mMediaCodecDecoder.buildMediaCodec(false, null);
        }
        if (!buildResultBuildMediaCodec.isSuccess) {
            stopInternal();
            handleDecoderError();
        } else {
            VideoDecoderListener videoDecoderListener2 = this.mListener;
            if (videoDecoderListener2 != null) {
                videoDecoderListener2.onDecodeLatencyChanged(z10);
            }
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        LiteavLog.i(this.mTAG, "Stop decoder");
        MediaCodecDecoder mediaCodecDecoder = this.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.stop();
            this.mMediaCodecDecoder = null;
        }
        releasePendingDecodeFrame();
        this.mAllowDrainDecodedFrames = true;
        this.mDecodedFrameCount = 0L;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void abandonDecodingFrames() {
        LiteavLog.i(this.mTAG, "flush");
        runOnWorkThread(f.a(this));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public boolean decode(EncodedVideoFrame encodedVideoFrame) {
        synchronized (this) {
            if (this.mPendingDecodeFrame == null && encodedVideoFrame != null) {
                this.mPendingDecodeFrame = encodedVideoFrame;
                runOnWorkThread(d.a(this));
                return true;
            }
            runOnWorkThread(c.a(this));
            return false;
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public VideoDecoderInterface.DecoderType getDecoderType() {
        HardwareVideoDecoderParams hardwareVideoDecoderParams = this.mParams;
        return (hardwareVideoDecoderParams == null || !hardwareVideoDecoderParams.useSoftDecoder) ? VideoDecoderInterface.DecoderType.HARDWARE : VideoDecoderInterface.DecoderType.SOFTWARE_DEVICE;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void initialize() {
        HandlerThread handlerThread = new HandlerThread("HardwareVideoDecoder_" + hashCode());
        handlerThread.start();
        this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder.MediaCodecDecoderListener
    public void onDecodeFrame(PixelFrame pixelFrame, boolean z10) {
        if (z10) {
            notifyEndOfStream();
            this.mAllowDrainDecodedFrames = true;
            return;
        }
        if (pixelFrame == null) {
            return;
        }
        this.mDecodedFrameCount++;
        this.mAllowDrainDecodedFrames = true;
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFrame(pixelFrame, pixelFrame.getTimestamp());
        }
        try {
            if (allowDrainOneFrameMore() && drainDecodedFrame()) {
                LiteavLog.d(this.mTAG, "drain more frame success");
            }
        } catch (Throwable th2) {
            LiteavLog.e(this.mThrottlers.a("drainDecodedFrame"), this.mTAG, "exception from drain decoded frame, message:" + th2.getMessage(), new Object[0]);
        }
        if (this.mIsNeedNotifyAbandonCompleted) {
            notifyOnAbandonDecodingFramesCompleted();
            this.mIsNeedNotifyAbandonCompleted = false;
        }
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder.MediaCodecDecoderListener
    public void onDecoderError() {
        handleDecoderError();
    }

    public void setOutputSurface(Surface surface) {
        runOnWorkThread(h.a(this, surface));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
        runOnWorkThread(g.a(this, consumerScene));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void start(Object obj, VideoDecoderListener videoDecoderListener) {
        runOnWorkThread(b.a(this, obj, videoDecoderListener));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void stop() {
        runOnWorkThread(e.a(this));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void uninitialize() {
        if (this.mWorkHandler != null) {
            LiteavLog.i(this.mTAG, "uninitialize quitLooper");
            this.mWorkHandler.quitLooper();
        }
    }
}
