package com.tencent.ugc.encoder;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.m;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.BlockingFrameQueue;
import com.tencent.ugc.videobase.utils.PixelFrameQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class UGCVideoEncodeController {
    private static final PixelFrame EOS_FRAME = new PixelFrame();
    private static final int FRAME_QUEUE_SIZE = 1;
    private static final int MAX_ENCODE_COST_TIME_PER_FRAME = 5000;
    private static final int MAX_ENCODING_FRAME_NUMBER = 30;
    private static final int MAX_WAIT_TIME_MS = 2000;
    private static final int SCHEDULE_ENCODE_TASK_DELAY_TIME_MS = 3;
    private static final int THREAD_KEEP_ALIVE_TIME_IN_SECOND = 15;
    private VideoEncodeParams mEncodeParams;
    private a mEncoderStats;
    private final UGCVideoEncoderJNI.EncoderType mExceptEncodeType;
    private final Map<Long, Long> mFrameDeliverToEncoderTimeMap;
    private boolean mHasEncodeFailureNotified;
    private final AtomicBoolean mHasEncoderError;
    private final PixelFrameQueue mPendingEncodeFrameQueue;
    private final m mSequenceTaskRunner;
    private final String mTag;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private UGCVideoEncoderJNI.UGCVideoEncoderListener mUGCEncoderControllerListener;
    private UGCVideoEncoderJNI mVideoEncoder;
    private final UGCVideoEncoderJNI.UGCVideoEncoderListener mVideoEncoderListener;

    /* JADX INFO: renamed from: com.tencent.ugc.encoder.UGCVideoEncodeController$1, reason: invalid class name */
    public final class AnonymousClass1 implements UGCVideoEncoderJNI.UGCVideoEncoderListener {
        AnonymousClass1() {
        }

        static /* synthetic */ void a(AnonymousClass1 anonymousClass1, EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame.isEosFrame) {
                LiteavLog.i(UGCVideoEncodeController.this.mTag, "got eos");
            }
            if (UGCVideoEncodeController.this.mUGCEncoderControllerListener != null) {
                UGCVideoEncodeController.this.mUGCEncoderControllerListener.onEncodedNAL(encodedVideoFrame);
            }
            UGCVideoEncodeController.this.removeEarlierFrameFromFrameDeliverToEncoderTimeMap(encodedVideoFrame.pts);
            if (!encodedVideoFrame.isEosFrame || UGCVideoEncodeController.this.mFrameDeliverToEncoderTimeMap.isEmpty()) {
                return;
            }
            LiteavLog.e(UGCVideoEncodeController.this.mTag, "got eos frame with unencoded frames left, causing an error");
            UGCVideoEncodeController.this.mHasEncoderError.set(true);
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedFail() {
            LiteavLog.e(UGCVideoEncodeController.this.mThrottlers.a("onEncodedFail"), UGCVideoEncodeController.this.mTag, "on encoded fail", new Object[0]);
            UGCVideoEncodeController.this.mHasEncoderError.set(true);
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame == null) {
                LiteavLog.d(UGCVideoEncodeController.this.mThrottlers.a("onEncodedNAL"), UGCVideoEncodeController.this.mTag, "on encoded frame is null.", new Object[0]);
            } else {
                UGCVideoEncodeController.this.mSequenceTaskRunner.a(h.a(this, encodedVideoFrame));
            }
        }
    }

    public enum a {
        STOPED,
        ENCODING,
        EOS_SENDED
    }

    public UGCVideoEncodeController(UGCVideoEncoderJNI.EncoderType encoderType) {
        String str = "UGCVideoEncodeController_" + hashCode();
        this.mTag = str;
        this.mHasEncoderError = new AtomicBoolean(false);
        this.mFrameDeliverToEncoderTimeMap = new HashMap();
        this.mHasEncodeFailureNotified = false;
        this.mEncoderStats = a.STOPED;
        this.mVideoEncoderListener = new AnonymousClass1();
        LiteavLog.i(str, "UGCVideoEncodeController construct encoderType = ".concat(String.valueOf(encoderType)));
        this.mThrottlers = new com.tencent.liteav.base.b.b();
        this.mExceptEncodeType = encoderType;
        this.mSequenceTaskRunner = new m(15, str);
        this.mPendingEncodeFrameQueue = new BlockingFrameQueue(1);
    }

    private boolean createEncoder() {
        PixelFrame pixelFramePeek = this.mPendingEncodeFrameQueue.peek();
        if (pixelFramePeek == null) {
            return false;
        }
        this.mVideoEncoder = new UGCVideoEncoderJNI();
        this.mEncodeParams.colorRange = pixelFramePeek.getColorRange();
        this.mEncodeParams.colorSpace = pixelFramePeek.getColorSpace();
        this.mVideoEncoder.start(this.mExceptEncodeType, this.mEncodeParams, this.mVideoEncoderListener);
        return true;
    }

    private void destroyEncoder() {
        UGCVideoEncoderJNI uGCVideoEncoderJNI = this.mVideoEncoder;
        if (uGCVideoEncoderJNI != null) {
            uGCVideoEncoderJNI.stopSync(2000L);
            this.mVideoEncoder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encodeFrameInternal() {
        if (this.mEncoderStats == a.STOPED) {
            this.mPendingEncodeFrameQueue.evictAll();
            return;
        }
        if ((this.mVideoEncoder == null && !createEncoder()) || hasEncoderError()) {
            this.mPendingEncodeFrameQueue.evictAll();
            notifyEncodedFail();
            return;
        }
        a aVar = this.mEncoderStats;
        a aVar2 = a.EOS_SENDED;
        if (aVar == aVar2) {
            this.mPendingEncodeFrameQueue.evictAll();
            this.mSequenceTaskRunner.b(e.a(this), 3L);
            return;
        }
        if (this.mVideoEncoder.isInputQueueFull()) {
            this.mSequenceTaskRunner.b(f.a(this), 3L);
            return;
        }
        PixelFrame pixelFramePoll = this.mPendingEncodeFrameQueue.poll();
        if (pixelFramePoll == null) {
            return;
        }
        this.mFrameDeliverToEncoderTimeMap.put(Long.valueOf(pixelFramePoll.getTimestamp()), Long.valueOf(SystemClock.elapsedRealtime()));
        if (pixelFramePoll != EOS_FRAME) {
            this.mVideoEncoder.encodeFrame(pixelFramePoll);
            pixelFramePoll.release();
        } else {
            this.mVideoEncoder.signalEndOfStream();
            this.mEncoderStats = aVar2;
            this.mSequenceTaskRunner.b(g.a(this), 3L);
        }
    }

    private long getEarliestTimeFromFrameDeliverToEncoderTimeMap() {
        Iterator<Long> it = this.mFrameDeliverToEncoderTimeMap.values().iterator();
        long j10 = Long.MAX_VALUE;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue < j10) {
                j10 = jLongValue;
            }
        }
        return j10;
    }

    private boolean hasEncoderError() {
        if (this.mHasEncoderError.get()) {
            LiteavLog.e(this.mThrottlers.a("hasEncoderError"), this.mTag, "encoder error or encoder need restart", new Object[0]);
            return true;
        }
        long earliestTimeFromFrameDeliverToEncoderTimeMap = getEarliestTimeFromFrameDeliverToEncoderTimeMap();
        if (earliestTimeFromFrameDeliverToEncoderTimeMap != 0 && SystemClock.elapsedRealtime() - earliestTimeFromFrameDeliverToEncoderTimeMap > 5000) {
            LiteavLog.e(this.mThrottlers.a("hasEncoderError"), this.mTag, "encoder output frame is outTime", new Object[0]);
            return true;
        }
        if (this.mFrameDeliverToEncoderTimeMap.size() <= 30) {
            return false;
        }
        LiteavLog.e(this.mThrottlers.a("isEncoderError"), this.mTag, "encoding frame is too many", new Object[0]);
        return true;
    }

    static /* synthetic */ void lambda$start$0(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        if (uGCVideoEncodeController.mVideoEncoder != null) {
            LiteavLog.i(uGCVideoEncodeController.mThrottlers.a(com.google.android.exoplayer2.text.ttml.d.f49798o0), uGCVideoEncodeController.mTag, "VideoEncoder is started", new Object[0]);
            return;
        }
        uGCVideoEncodeController.mEncodeParams = new VideoEncodeParams(videoEncodeParams);
        uGCVideoEncodeController.mUGCEncoderControllerListener = uGCVideoEncoderListener;
        uGCVideoEncodeController.mEncoderStats = a.ENCODING;
    }

    static /* synthetic */ void lambda$stop$1(UGCVideoEncodeController uGCVideoEncodeController) {
        uGCVideoEncodeController.mHasEncoderError.set(false);
        uGCVideoEncodeController.mFrameDeliverToEncoderTimeMap.clear();
        uGCVideoEncodeController.mUGCEncoderControllerListener = null;
        uGCVideoEncodeController.mEncodeParams = null;
        uGCVideoEncodeController.mHasEncodeFailureNotified = false;
        uGCVideoEncodeController.mEncoderStats = a.STOPED;
        uGCVideoEncodeController.mPendingEncodeFrameQueue.evictAll();
        uGCVideoEncodeController.destroyEncoder();
    }

    private void notifyEncodedFail() {
        if (this.mHasEncodeFailureNotified) {
            return;
        }
        UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener = this.mUGCEncoderControllerListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedFail();
        }
        this.mHasEncodeFailureNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEarlierFrameFromFrameDeliverToEncoderTimeMap(long j10) {
        Iterator<Map.Entry<Long, Long>> it = this.mFrameDeliverToEncoderTimeMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() <= j10) {
                it.remove();
            }
        }
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (pixelFrame.getGLContext() != null) {
            GLES20.glFinish();
        }
        this.mPendingEncodeFrameQueue.push(pixelFrame);
        this.mSequenceTaskRunner.a(c.a(this));
    }

    public void signalEndOfStream() {
        LiteavLog.i(this.mThrottlers.a("signalEndOfStream"), this.mTag, "signalEndOfStream", new Object[0]);
        this.mPendingEncodeFrameQueue.push(EOS_FRAME);
        this.mSequenceTaskRunner.a(d.a(this));
    }

    public void start(VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        LiteavLog.i(this.mThrottlers.a(com.google.android.exoplayer2.text.ttml.d.f49798o0), this.mTag, com.google.android.exoplayer2.text.ttml.d.f49798o0, new Object[0]);
        this.mSequenceTaskRunner.a(com.tencent.ugc.encoder.a.a(this, videoEncodeParams, uGCVideoEncoderListener));
    }

    public void stop() {
        LiteavLog.i(this.mThrottlers.a("stop"), this.mTag, "stop", new Object[0]);
        this.mSequenceTaskRunner.a(b.a(this));
    }
}
