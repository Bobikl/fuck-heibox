package com.tencent.ugc.decoder;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.x;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.GlobalContextManager;
import com.tencent.ugc.UGCFrameQueue;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class UGCVideoDecodeController {
    private static final int INTERVAL_DRAIN_DECODED_FRAME = 15;
    private static final int MAX_CACHE_FRAME_COUNT = 1;
    private static final int MAX_DECODE_FRAME_FAIL_COUNT = 30;
    private static final int MAX_DECODING_FRAME_COUNT = 30;
    private static final int MAX_DECODING_FRAME_TIME = 2500;
    private x mDecodeTimer;
    private VideoDecoderInterface mDecoder;
    private a mDecoderListener;
    private final AtomicBoolean mHasDecodeError;
    private UGCVideoDecodeControllerListener mListener;
    private final UGCFrameQueue<EncodedVideoFrame> mPendingFrameQueue;
    private final String mTAG;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private final UGCFrameQueue.UGCFrameQueueListener mUGCFrameQueueListener;
    private CustomHandler mWorkHandler;
    private boolean mIsUsingHardwareDecoder = true;
    private boolean mIsRedecodingFromBeginOfThisGop = false;
    private Long mLastOutputFramePts = null;
    private int mDecodingFrameCount = 0;
    private int mSendFrameFailCount = 0;
    private long mInputFramePts = 0;
    private long mOutputFramePts = 0;
    private GLConstants.ColorRange mColorRange = GLConstants.ColorRange.UNKNOWN;
    private GLConstants.ColorSpace mColorSpace = GLConstants.ColorSpace.UNKNOWN;

    /* JADX INFO: renamed from: com.tencent.ugc.decoder.UGCVideoDecodeController$1, reason: invalid class name */
    public final class AnonymousClass1 implements UGCFrameQueue.UGCFrameQueueListener {
        AnonymousClass1() {
        }

        static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            if (UGCVideoDecodeController.this.mListener != null) {
                UGCVideoDecodeController.this.mListener.onFrameEnqueuedToDecoder();
            }
        }

        @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
        public final void onFrameDequeued() {
            UGCVideoDecodeController.this.runOnWorkThread(q.a(this));
        }
    }

    public final class a extends VideoDecoderListener {
        private a() {
        }

        /* synthetic */ a(UGCVideoDecodeController uGCVideoDecodeController, byte b10) {
            this();
        }

        static /* synthetic */ void a(a aVar, PixelFrame pixelFrame) {
            UGCVideoDecodeController.this.onDecodeFrameInternal(pixelFrame);
            pixelFrame.release();
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onAbandonDecodingFramesCompleted() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            UGCVideoDecodeController uGCVideoDecodeController = UGCVideoDecodeController.this;
            uGCVideoDecodeController.runOnWorkThread(s.a(uGCVideoDecodeController));
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeCompleted() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            UGCVideoDecodeController uGCVideoDecodeController = UGCVideoDecodeController.this;
            uGCVideoDecodeController.runOnWorkThread(t.a(uGCVideoDecodeController));
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeFailed() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            LiteavLog.i(UGCVideoDecodeController.this.mThrottlers.a("onDecodeFailed"), UGCVideoDecodeController.this.mTAG, "onDecodeFailed", new Object[0]);
            UGCVideoDecodeController.this.mHasDecodeError.set(true);
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeFrame(PixelFrame pixelFrame, long j10) {
            if (this != UGCVideoDecodeController.this.mDecoderListener || pixelFrame == null) {
                return;
            }
            pixelFrame.retain();
            CustomHandler customHandler = UGCVideoDecodeController.this.mWorkHandler;
            if (customHandler != null) {
                customHandler.post(r.a(this, pixelFrame));
            }
        }
    }

    public UGCVideoDecodeController() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.mUGCFrameQueueListener = anonymousClass1;
        this.mTAG = "UGCVideoDecodeController_" + hashCode();
        this.mThrottlers = new com.tencent.liteav.base.b.b();
        this.mHasDecodeError = new AtomicBoolean(false);
        UGCFrameQueue<EncodedVideoFrame> uGCFrameQueue = new UGCFrameQueue<>();
        this.mPendingFrameQueue = uGCFrameQueue;
        uGCFrameQueue.setUGCFrameQueueListener(anonymousClass1);
    }

    private void clearFrameQueue() {
        this.mPendingFrameQueue.clear();
    }

    private boolean createDecoder(boolean z10) {
        EncodedVideoFrame iDRFrameFromQueue = getIDRFrameFromQueue();
        byte b10 = 0;
        if (iDRFrameFromQueue == null) {
            return false;
        }
        if (z10) {
            this.mDecoder = createHardwareDecoder(iDRFrameFromQueue);
        } else {
            this.mDecoder = new SoftwareVideoDecoder(iDRFrameFromQueue.isH265());
        }
        this.mDecoder.initialize();
        this.mDecoderListener = new a(this, b10);
        this.mDecoder.start(GlobalContextManager.getInstance().getGLContext(), this.mDecoderListener);
        this.mDecoder.decode(iDRFrameFromQueue);
        return true;
    }

    private VideoDecoderInterface createHardwareDecoder(EncodedVideoFrame encodedVideoFrame) {
        parserColorFormatInfo(encodedVideoFrame);
        LiteavLog.i(this.mTAG, "video color info: " + this.mColorRange + ", " + this.mColorSpace);
        HardwareVideoDecoder.HardwareVideoDecoderParams hardwareVideoDecoderParams = new HardwareVideoDecoder.HardwareVideoDecoderParams();
        hardwareVideoDecoderParams.useOutputBuffer = this.mColorSpace == GLConstants.ColorSpace.BT709;
        MediaFormat mediaFormat = encodedVideoFrame.videoFormat;
        if (mediaFormat != null) {
            hardwareVideoDecoderParams.mediaFormat = mediaFormat;
        } else {
            hardwareVideoDecoderParams.useHevc = encodedVideoFrame.isH265();
            hardwareVideoDecoderParams.resolution = new Size(encodedVideoFrame.width, encodedVideoFrame.height);
        }
        return new HardwareVideoDecoder(hardwareVideoDecoderParams, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeInternal() {
        handleDecoderError();
        if (this.mDecoder != null || createDecoder(this.mIsUsingHardwareDecoder)) {
            EncodedVideoFrame encodedVideoFramePeek = this.mPendingFrameQueue.peek();
            if (encodedVideoFramePeek == null) {
                this.mDecoder.decode(null);
                return;
            }
            if (!this.mDecoder.decode(encodedVideoFramePeek)) {
                this.mSendFrameFailCount++;
                return;
            }
            this.mDecodingFrameCount++;
            this.mInputFramePts = encodedVideoFramePeek.pts;
            this.mSendFrameFailCount = 0;
            this.mPendingFrameQueue.dequeue();
        }
    }

    private void destroyDecoder() {
        VideoDecoderInterface videoDecoderInterface = this.mDecoder;
        if (videoDecoderInterface != null) {
            videoDecoderInterface.stop();
            this.mDecoder.uninitialize();
            this.mDecoder = null;
            this.mDecoderListener = null;
        }
    }

    private EncodedVideoFrame getIDRFrameFromQueue() {
        while (this.mPendingFrameQueue.size() != 0) {
            EncodedVideoFrame encodedVideoFrameDequeue = this.mPendingFrameQueue.dequeue();
            if (encodedVideoFrameDequeue != null && encodedVideoFrameDequeue.isIDRFrame()) {
                return encodedVideoFrameDequeue;
            }
        }
        return null;
    }

    private void handleDecoderError() {
        if (isDecoderError()) {
            if (this.mIsUsingHardwareDecoder) {
                LiteavLog.i(this.mThrottlers.a("handleDecoderError"), this.mTAG, "handle Hardware Decoder Error", new Object[0]);
                this.mIsUsingHardwareDecoder = false;
                this.mIsRedecodingFromBeginOfThisGop = true;
                destroyDecoder();
                clearFrameQueue();
                UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
                if (uGCVideoDecodeControllerListener != null) {
                    Long l10 = this.mLastOutputFramePts;
                    uGCVideoDecodeControllerListener.onRequestSeekToLastKeyFrame(l10 == null ? 0L : l10.longValue());
                }
            } else {
                LiteavLog.i(this.mThrottlers.a("handleDecoderError"), this.mTAG, "notify DecodeFailed", new Object[0]);
                UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener2 = this.mListener;
                if (uGCVideoDecodeControllerListener2 != null) {
                    uGCVideoDecodeControllerListener2.onDecodeFailed();
                }
            }
            this.mHasDecodeError.set(false);
            this.mSendFrameFailCount = 0;
            this.mDecodingFrameCount = 0;
            this.mInputFramePts = 0L;
            this.mOutputFramePts = 0L;
        }
    }

    private boolean isDecoderError() {
        if (this.mHasDecodeError.get()) {
            LiteavLog.e(this.mThrottlers.a("isDecoderError"), this.mTAG, "mIsDecodeError is true", new Object[0]);
            return true;
        }
        if (this.mSendFrameFailCount <= 30) {
            if (this.mDecodingFrameCount <= 30 || this.mInputFramePts - this.mOutputFramePts <= 2500) {
                return false;
            }
            LiteavLog.e(this.mThrottlers.a("isDecoderError"), this.mTAG, "internal decoder cache too big", new Object[0]);
            return true;
        }
        LiteavLog.e(this.mThrottlers.a("isDecoderError"), this.mTAG, "mSendFrameFailCount = " + this.mSendFrameFailCount, new Object[0]);
        return true;
    }

    static /* synthetic */ void lambda$abandonDecodingFrames$2(UGCVideoDecodeController uGCVideoDecodeController) {
        uGCVideoDecodeController.clearFrameQueue();
        uGCVideoDecodeController.mIsRedecodingFromBeginOfThisGop = false;
        uGCVideoDecodeController.mDecodingFrameCount = 0;
        uGCVideoDecodeController.mInputFramePts = 0L;
        uGCVideoDecodeController.mOutputFramePts = 0L;
        VideoDecoderInterface videoDecoderInterface = uGCVideoDecodeController.mDecoder;
        if (videoDecoderInterface != null) {
            videoDecoderInterface.abandonDecodingFrames();
        } else {
            uGCVideoDecodeController.notifyAbandonDecodingFramesCompleted();
        }
    }

    static /* synthetic */ void lambda$decode$1(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        if (uGCVideoDecodeController.mLastOutputFramePts == null) {
            uGCVideoDecodeController.mLastOutputFramePts = Long.valueOf(encodedVideoFrame.pts - 1);
        }
        uGCVideoDecodeController.mSendFrameFailCount = 0;
        uGCVideoDecodeController.decodeInternal();
    }

    static /* synthetic */ void lambda$signalEndOfStream$3(UGCVideoDecodeController uGCVideoDecodeController) {
        if (uGCVideoDecodeController.mDecoder == null) {
            uGCVideoDecodeController.notifyDecodeCompleted();
            return;
        }
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.isEosFrame = true;
        uGCVideoDecodeController.mPendingFrameQueue.queue(encodedVideoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAbandonDecodingFramesCompleted() {
        LiteavLog.i(this.mThrottlers.a("onAbandonCompleted"), this.mTAG, "onAbandonDecodingFramesCompleted", new Object[0]);
        UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
        if (uGCVideoDecodeControllerListener != null) {
            uGCVideoDecodeControllerListener.onAbandonDecodingFramesCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDecodeCompleted() {
        LiteavLog.i(this.mThrottlers.a("onDecodeCompleted"), this.mTAG, "onDecodeCompleted", new Object[0]);
        UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
        if (uGCVideoDecodeControllerListener != null) {
            uGCVideoDecodeControllerListener.onDecodeCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDecodeFrameInternal(PixelFrame pixelFrame) {
        this.mDecodingFrameCount--;
        pixelFrame.setColorFormat(this.mColorRange, this.mColorSpace);
        this.mOutputFramePts = pixelFrame.getTimestamp();
        Long l10 = this.mLastOutputFramePts;
        long jLongValue = l10 == null ? 0L : l10.longValue();
        if (!this.mIsRedecodingFromBeginOfThisGop || pixelFrame.getTimestamp() > jLongValue) {
            UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
            if (uGCVideoDecodeControllerListener != null) {
                uGCVideoDecodeControllerListener.onFrameDecoded(pixelFrame);
            }
            this.mLastOutputFramePts = Long.valueOf(pixelFrame.getTimestamp());
            this.mIsRedecodingFromBeginOfThisGop = false;
        }
        decodeInternal();
    }

    private void parserColorFormatInfo(EncodedVideoFrame encodedVideoFrame) {
        Integer num;
        SpsInfo spsInfoNativeDecodeSps = SpsInfo.nativeDecodeSps(encodedVideoFrame.isH265(), encodedVideoFrame.data);
        if (spsInfoNativeDecodeSps == null) {
            return;
        }
        LiteavLog.i(this.mTAG, " sps info is ".concat(String.valueOf(spsInfoNativeDecodeSps)));
        this.mColorRange = GLConstants.ColorRange.VIDEO_RANGE;
        Integer num2 = spsInfoNativeDecodeSps.videoFullRangeFlag;
        if (num2 != null && num2.intValue() == 1) {
            this.mColorRange = GLConstants.ColorRange.FULL_RANGE;
        }
        this.mColorSpace = GLConstants.ColorSpace.BT601;
        Integer num3 = spsInfoNativeDecodeSps.colourPrimaries;
        if (num3 == null || num3.intValue() != 1 || (num = spsInfoNativeDecodeSps.transferCharacteristics) == null || num.intValue() != 1) {
            return;
        }
        this.mColorSpace = GLConstants.ColorSpace.BT709;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean runOnWorkThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        return customHandler != null && customHandler.runOrPost(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        LiteavLog.i(this.mThrottlers.a("stopInternal"), this.mTAG, "stopInternal", new Object[0]);
        this.mIsUsingHardwareDecoder = true;
        this.mIsRedecodingFromBeginOfThisGop = false;
        this.mListener = null;
        this.mLastOutputFramePts = null;
        this.mHasDecodeError.set(false);
        this.mDecodingFrameCount = 0;
        this.mSendFrameFailCount = 0;
        this.mInputFramePts = 0L;
        this.mOutputFramePts = 0L;
        destroyDecoder();
        clearFrameQueue();
        x xVar = this.mDecodeTimer;
        if (xVar != null) {
            xVar.a();
            this.mDecodeTimer = null;
        }
    }

    public void abandonDecodingFrames() {
        LiteavLog.i(this.mThrottlers.a("abandonFrames"), this.mTAG, "abandonDecodingFrames", new Object[0]);
        runOnWorkThread(o.a(this));
    }

    public void decode(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame == null) {
            return;
        }
        this.mPendingFrameQueue.queue(encodedVideoFrame);
        runOnWorkThread(n.a(this, encodedVideoFrame));
    }

    public boolean isInputQueueFull() {
        return this.mPendingFrameQueue.size() > 0;
    }

    public void signalEndOfStream() {
        LiteavLog.i(this.mThrottlers.a("signalEndOfStream"), this.mTAG, "signalEndOfStream", new Object[0]);
        runOnWorkThread(p.a(this));
    }

    public void start(UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        LiteavLog.i(this.mThrottlers.a(com.google.android.exoplayer2.text.ttml.d.f49798o0), this.mTAG, com.google.android.exoplayer2.text.ttml.d.f49798o0, new Object[0]);
        synchronized (this) {
            if (this.mWorkHandler != null) {
                LiteavLog.w(this.mThrottlers.a("startWorkHandler"), this.mTAG, "UGCDecodeController is start", new Object[0]);
                return;
            }
            HandlerThread handlerThread = new HandlerThread("ugc-decoder-controller");
            handlerThread.start();
            this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
            x xVar = new x(this.mWorkHandler.getLooper(), new x.a(this) { // from class: com.tencent.ugc.decoder.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final UGCVideoDecodeController f103488a;

                {
                    this.f103488a = this;
                }

                @Override // com.tencent.liteav.base.util.x.a
                public final void onTimeout() {
                    this.f103488a.decodeInternal();
                }
            });
            this.mDecodeTimer = xVar;
            xVar.a(15);
            runOnWorkThread(l.a(this, uGCVideoDecodeControllerListener));
        }
    }

    public void stop() {
        LiteavLog.i(this.mThrottlers.a("stop"), this.mTAG, "stop", new Object[0]);
        runOnWorkThread(m.a(this));
        synchronized (this) {
            CustomHandler customHandler = this.mWorkHandler;
            if (customHandler != null) {
                customHandler.quitLooperAndWaitDone();
                this.mWorkHandler = null;
            }
        }
    }
}
