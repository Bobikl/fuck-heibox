package com.tencent.ugc;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.decoder.UGCVideoDecodeController;
import com.tencent.ugc.decoder.UGCVideoDecodeControllerListener;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCSingleFilePixelFrameProvider implements UGCPixelFrameProvider {
    private static final int DELAY_TIME_OF_TRY_DECODE = 10;
    private static final int REVERSE_STEP_TIME = 500;
    private final Clip mClip;
    private VideoDemuxer mDemuxer;
    private EGLCore mEGLCore;
    private GLTexturePool mGLTexturePool;
    private PixelFrameRenderer mPixelFrameRenderer;
    private long mReversePlayCurrentPts;
    private UGCVideoDecodeController mVideoDecodeController;
    private final CustomHandler mWorkHandler;
    private final String mTag = "UGCSingleFilePixelFrameProvider_" + hashCode();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private boolean mIsAbandoningDecodingFrame = false;
    private long mSeekingTimeMs = -1;
    private boolean mIsInPreciseSeeking = true;
    private boolean mHasReadEOF = false;
    private boolean mIsDecodeCompleted = false;
    private boolean mIsFrameSendingDecoder = false;
    private int mMaxFrameCount = 3;
    private boolean mIsReverse = false;
    private int mFrameCacheCapacityForReverse = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private com.tencent.liteav.base.util.l mVideoRotation = com.tencent.liteav.base.util.l.NORMAL;
    private long mPlayEndPts = Long.MAX_VALUE;
    private final UGCVideoDecodeControllerListener mUGCDecodeControllerListener = new AnonymousClass1();
    private final UGCFrameQueue.UGCFrameQueueListener mUGCFrameQueueListener = new AnonymousClass2();
    private final UGCFrameQueue<List<PixelFrame>> mPixFrameQueue = new UGCFrameQueue<>();
    private final Deque<PixelFrame> mPixFrameCacheForReverse = new LinkedList();

    /* JADX INFO: renamed from: com.tencent.ugc.UGCSingleFilePixelFrameProvider$1, reason: invalid class name */
    public final class AnonymousClass1 implements UGCVideoDecodeControllerListener {
        AnonymousClass1() {
        }

        static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            if (UGCSingleFilePixelFrameProvider.this.mVideoDecodeController == null) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        }

        static /* synthetic */ void b(AnonymousClass1 anonymousClass1) {
            if (UGCSingleFilePixelFrameProvider.this.mVideoDecodeController == null) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.mIsAbandoningDecodingFrame = false;
            UGCSingleFilePixelFrameProvider.this.decodeInternal();
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onAbandonDecodingFramesCompleted() {
            LiteavLog.i(UGCSingleFilePixelFrameProvider.this.mTag, "onAbandonDecodingFramesCompleted");
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(gd.a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onDecodeCompleted() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(gc.a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onDecodeFailed() {
            LiteavLog.i(UGCSingleFilePixelFrameProvider.this.mTag, "on decode fail");
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(gf.a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onFrameDecoded(PixelFrame pixelFrame) {
            if (pixelFrame == null) {
                return;
            }
            pixelFrame.retain();
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(ga.a(this, pixelFrame));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onFrameEnqueuedToDecoder() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(gb.a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onRequestSeekToLastKeyFrame(long j10) {
            LiteavLog.i(UGCSingleFilePixelFrameProvider.this.mTag, "onRequestSeekToLastKeyFrame pts = ".concat(String.valueOf(j10)));
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(ge.a(this, j10));
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCSingleFilePixelFrameProvider$2, reason: invalid class name */
    public final class AnonymousClass2 implements UGCFrameQueue.UGCFrameQueueListener {
        AnonymousClass2() {
        }

        static /* synthetic */ void a(AnonymousClass2 anonymousClass2) {
            if (UGCSingleFilePixelFrameProvider.this.mIsFrameSendingDecoder) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.decodeInternal();
        }

        @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
        public final void onFrameDequeued() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(gg.a(this));
        }
    }

    public UGCSingleFilePixelFrameProvider(Clip clip, CustomHandler customHandler) {
        this.mClip = new Clip(clip);
        this.mWorkHandler = customHandler;
    }

    private void addFrameToQueue(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        if (pixelFrame.getTimestamp() < this.mClip.startInFileTime) {
            pixelFrame.release();
            return;
        }
        if (pixelFrame.getTimestamp() <= this.mClip.endInFileTime && pixelFrame.getTimestamp() <= this.mPlayEndPts) {
            pixelFrame.setTimestamp(fileTimeToTimeline(pixelFrame.getTimestamp()));
            LinkedList linkedList = new LinkedList();
            linkedList.add(pixelFrame);
            this.mPixFrameQueue.queue(linkedList);
            return;
        }
        LiteavLog.i(this.mTag, "addFrameToQueue Timestamp = " + pixelFrame.getTimestamp() + " endInnerFileTime = " + this.mClip.endInFileTime);
        this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        pixelFrame.release();
    }

    private void addFrameToQueueForReverse(PixelFrame pixelFrame) {
        if (pixelFrame != null && pixelFrame.getTimestamp() <= this.mReversePlayCurrentPts) {
            this.mPixFrameCacheForReverse.addLast(pixelFrame);
            return;
        }
        if (pixelFrame != null) {
            pixelFrame.release();
        }
        if (this.mPixFrameCacheForReverse.isEmpty()) {
            LiteavLog.i(this.mTag, "mGopVideoFrameList isEmpty so put END_OF_STREAM");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        this.mFrameCacheCapacityForReverse = this.mPixFrameCacheForReverse.size();
        while (!this.mPixFrameCacheForReverse.isEmpty()) {
            PixelFrame pixelFramePollLast = this.mPixFrameCacheForReverse.pollLast();
            long timestamp = pixelFramePollLast.getTimestamp();
            this.mReversePlayCurrentPts = timestamp;
            Clip clip = this.mClip;
            if (timestamp > clip.endInFileTime || timestamp < clip.startInFileTime) {
                pixelFramePollLast.release();
            } else {
                pixelFramePollLast.setTimestamp(fileTimeToTimelineForReverse(timestamp));
                LinkedList linkedList = new LinkedList();
                linkedList.add(pixelFramePollLast);
                this.mPixFrameQueue.queue(linkedList);
            }
        }
        long j10 = this.mReversePlayCurrentPts;
        if (j10 <= this.mClip.startInFileTime) {
            LiteavLog.i(this.mTag, "mLastGopFinishPts is smaller start time so put END_OF_STREAM");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        } else {
            long j11 = j10 - 1;
            this.mReversePlayCurrentPts = j11;
            seekToInFileTime(j11 - 500, false);
        }
    }

    private void clearPixelFrameQueue() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore != null) {
            try {
                eGLCore.makeCurrent();
            } catch (EGLException e10) {
                LiteavLog.e(this.mTag, "make current exception when clear pixel frame queue. exception msg is ", e10);
                return;
            }
        }
        Iterator<List<PixelFrame>> it = this.mPixFrameQueue.dequeueAll().iterator();
        while (it.hasNext()) {
            PixelFrame.releasePixelFrames(it.next());
        }
    }

    private boolean createDemuxerAndOpenFile() {
        String str = this.mClip.videoMimeType;
        if (str == null || "video/hevc".equals(str) || "video/avc".equals(this.mClip.videoMimeType)) {
            this.mDemuxer = new VideoDemuxerFFmpeg();
        } else {
            this.mDemuxer = new VideoDemuxerSystem();
        }
        if (this.mDemuxer.open(this.mClip.path)) {
            return true;
        }
        this.mDemuxer.close();
        this.mDemuxer = null;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeInternal() {
        if (this.mVideoDecodeController == null || !isNeedDecode()) {
            this.mIsFrameSendingDecoder = false;
            return;
        }
        if (this.mVideoDecodeController.isInputQueueFull()) {
            this.mWorkHandler.postDelayed(fw.a(this), 10L);
            return;
        }
        EncodedVideoFrame nextEncodeVideoFrame = this.mDemuxer.getNextEncodeVideoFrame();
        if (nextEncodeVideoFrame == null) {
            return;
        }
        if (nextEncodeVideoFrame == VideoDemuxer.END_OF_STREAM) {
            LiteavLog.i(this.mTag, "demuxer read completed");
            this.mHasReadEOF = true;
            this.mVideoDecodeController.signalEndOfStream();
            this.mWorkHandler.removeCallbacks(fx.a(this));
            this.mWorkHandler.runOrPost(fy.a(this), 1000);
        } else {
            this.mIsFrameSendingDecoder = true;
            this.mIsDecodeCompleted = false;
            this.mVideoRotation = com.tencent.liteav.base.util.l.a(nextEncodeVideoFrame.rotation);
            this.mVideoDecodeController.decode(nextEncodeVideoFrame);
        }
        long j10 = this.mSeekingTimeMs;
        if (j10 < 0) {
            this.mWorkHandler.post(fz.a(this));
        } else if (nextEncodeVideoFrame.pts > j10) {
            this.mWorkHandler.postDelayed(fq.a(this), 10L);
        } else {
            this.mWorkHandler.post(fr.a(this));
        }
    }

    private long fileTimeToTimeline(long j10) {
        Clip clip = this.mClip;
        long j11 = clip.startInClipsTimeline;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return j11 + (j10 - clip.startInFileTime);
        }
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j12 = tXSpeed.endTime;
            if (j10 < j12) {
                return j11 + ((long) ((j10 - tXSpeed.startTime) * timeMultipleInSpeed));
            }
            j11 += (long) ((j12 - tXSpeed.startTime) * timeMultipleInSpeed);
        }
        return j11;
    }

    private long fileTimeToTimelineForReverse(long j10) {
        Clip clip = this.mClip;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return clip.endInFileTime - j10;
        }
        long j11 = clip.startInClipsTimeline;
        for (int size = list.size() - 1; size >= 0; size--) {
            TXVideoEditConstants.TXSpeed tXSpeed = this.mClip.speedList.get(size);
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j12 = tXSpeed.startTime;
            if (j10 > j12) {
                return j11 + ((long) ((tXSpeed.endTime - j10) * timeMultipleInSpeed));
            }
            j11 += (long) ((tXSpeed.endTime - j12) * timeMultipleInSpeed);
        }
        return j11;
    }

    private float getTimeMultipleInSpeed(int i10) {
        return UGCMediaListSource.getSpeed(i10);
    }

    private void initializeDecodeController() {
        if (this.mVideoDecodeController != null) {
            LiteavLog.w(this.mTag, "UGCVideoFileProvider is initialized");
            return;
        }
        LiteavLog.i(this.mTag, "initializeDecodeController");
        UGCVideoDecodeController uGCVideoDecodeController = new UGCVideoDecodeController();
        this.mVideoDecodeController = uGCVideoDecodeController;
        uGCVideoDecodeController.start(this.mUGCDecodeControllerListener);
    }

    private void initializeGLComponents() {
        if (this.mEGLCore != null) {
            return;
        }
        LiteavLog.i(this.mThrottlers.a("initGL"), this.mTag, "initializeGLComponents", new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(GlobalContextManager.getInstance().getGLContext(), null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mGLTexturePool = new GLTexturePool();
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("initGLError"), this.mTag, "initializeGLComponents failed.", e10);
            this.mEGLCore = null;
        }
    }

    private boolean isNeedDecode() {
        return (this.mVideoDecodeController != null && this.mDemuxer != null && !this.mIsAbandoningDecodingFrame && !this.mHasReadEOF) && !(!this.mIsReverse ? this.mPixFrameQueue.size() >= this.mMaxFrameCount : !(this.mPixFrameQueue.size() < this.mMaxFrameCount || this.mPixFrameQueue.size() + this.mPixFrameCacheForReverse.size() < this.mFrameCacheCapacityForReverse + this.mMaxFrameCount));
    }

    static /* synthetic */ void lambda$seekTo$0(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j10, boolean z10) {
        if (uGCSingleFilePixelFrameProvider.mVideoDecodeController == null || uGCSingleFilePixelFrameProvider.mDemuxer == null) {
            return;
        }
        uGCSingleFilePixelFrameProvider.clearPixelFrameQueue();
        long jTimelineToFileTime = uGCSingleFilePixelFrameProvider.timelineToFileTime(j10);
        uGCSingleFilePixelFrameProvider.mReversePlayCurrentPts = jTimelineToFileTime;
        uGCSingleFilePixelFrameProvider.seekToInFileTime(jTimelineToFileTime, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDecodeCompletedInternal() {
        LiteavLog.i(this.mTag, "onDecodeCompletedInteral");
        if (this.mVideoDecodeController == null || this.mIsAbandoningDecodingFrame || this.mIsDecodeCompleted || !this.mHasReadEOF) {
            return;
        }
        if (this.mIsReverse) {
            addFrameToQueueForReverse(null);
        } else {
            addFrameToQueue(null);
        }
        this.mIsDecodeCompleted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r5 != (-1)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDecodeFrameInternal(com.tencent.ugc.videobase.frame.PixelFrame r8) {
        /*
            r7 = this;
            com.tencent.ugc.decoder.UGCVideoDecodeController r0 = r7.mVideoDecodeController
            if (r0 != 0) goto L8
            r8.release()
            return
        L8:
            long r0 = r8.getTimestamp()
            boolean r2 = r7.mIsAbandoningDecodingFrame
            if (r2 != 0) goto L37
            boolean r2 = r7.mIsReverse
            r3 = -1
            if (r2 != 0) goto L25
            boolean r2 = r7.mIsInPreciseSeeking
            if (r2 == 0) goto L25
            long r5 = r7.mSeekingTimeMs
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L37
        L25:
            r7.mSeekingTimeMs = r3
            com.tencent.ugc.videobase.frame.PixelFrame r8 = r7.processFrame(r8)
            boolean r0 = r7.mIsReverse
            if (r0 == 0) goto L33
            r7.addFrameToQueueForReverse(r8)
            return
        L33:
            r7.addFrameToQueue(r8)
            return
        L37:
            r8.release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ugc.UGCSingleFilePixelFrameProvider.onDecodeFrameInternal(com.tencent.ugc.videobase.frame.PixelFrame):void");
    }

    private PixelFrame processFrame(PixelFrame pixelFrame) {
        PixelFrameRenderer pixelFrameRenderer;
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            pixelFrame.release();
            return null;
        }
        try {
            eGLCore.makeCurrent();
            pixelFrame.setRotation(this.mVideoRotation);
            if (pixelFrame.getRotation() != com.tencent.liteav.base.util.l.NORMAL && pixelFrame.getRotation() != com.tencent.liteav.base.util.l.ROTATION_180) {
                pixelFrame.swapWidthHeight();
            }
            int width = pixelFrame.getWidth();
            int height = pixelFrame.getHeight();
            if ((width != this.mVideoWidth || height != this.mVideoHeight) && (pixelFrameRenderer = this.mPixelFrameRenderer) != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new PixelFrameRenderer(width, height);
                this.mVideoWidth = width;
                this.mVideoHeight = height;
            }
            OpenGlUtils.glViewport(0, 0, width, height);
            GLTexture gLTextureObtain = this.mGLTexturePool.obtain(width, height);
            gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
            this.mPixelFrameRenderer.renderFrame(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
            PixelFrame pixelFrameWrap = gLTextureObtain.wrap(this.mEGLCore.getEglContext());
            pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
            pixelFrameWrap.setGLContext(GlobalContextManager.getInstance().getGLContext());
            GLES20.glFinish();
            gLTextureObtain.release();
            pixelFrame.release();
            return pixelFrameWrap;
        } catch (EGLException unused) {
            pixelFrame.release();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToInFileTime(long j10, boolean z10) {
        if (this.mDemuxer == null) {
            return;
        }
        Clip clip = this.mClip;
        long jA = com.tencent.liteav.base.util.h.a(j10, clip.startInFileTime, clip.endInFileTime);
        LiteavLog.i(this.mTag, "seekToInFileTime file time = ".concat(String.valueOf(jA)));
        this.mSeekingTimeMs = jA;
        this.mIsInPreciseSeeking = z10;
        this.mDemuxer.seek(jA);
        if (!this.mIsAbandoningDecodingFrame) {
            this.mIsAbandoningDecodingFrame = true;
            this.mVideoDecodeController.abandonDecodingFrames();
        }
        this.mHasReadEOF = false;
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseInternal(boolean z10) {
        if (this.mIsReverse == z10) {
            return;
        }
        this.mIsReverse = z10;
        if (z10) {
            long j10 = this.mClip.endInFileTime;
            this.mReversePlayCurrentPts = j10;
            seekToInFileTime(j10 - 500, false);
        } else {
            seekToInFileTime(this.mClip.startInFileTime, true);
        }
        clearPixelFrameQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (!createDemuxerAndOpenFile()) {
            LiteavLog.e(this.mTag, this.mClip.path + " open fail or there is not video stream");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        LiteavLog.i(this.mTag, this.mClip.path + " open success");
        this.mPixFrameQueue.setUGCFrameQueueListener(this.mUGCFrameQueueListener);
        this.mPixFrameQueue.clear();
        if (this.mIsReverse) {
            long j10 = this.mClip.endInFileTime;
            this.mReversePlayCurrentPts = j10;
            this.mDemuxer.seek(j10 - 500);
        } else {
            long j11 = this.mClip.startInFileTime;
            if (j11 != 0) {
                this.mDemuxer.seek(j11);
            }
        }
        initializeDecodeController();
        initializeGLComponents();
        decodeInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        this.mPixFrameQueue.setUGCFrameQueueListener(null);
        VideoDemuxer videoDemuxer = this.mDemuxer;
        if (videoDemuxer != null) {
            videoDemuxer.close();
            this.mDemuxer = null;
        }
        UGCVideoDecodeController uGCVideoDecodeController = this.mVideoDecodeController;
        if (uGCVideoDecodeController != null) {
            uGCVideoDecodeController.stop();
            this.mVideoDecodeController = null;
        }
        clearPixelFrameQueue();
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
        this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        this.mIsAbandoningDecodingFrame = false;
        this.mIsInPreciseSeeking = true;
        this.mIsReverse = false;
        this.mIsFrameSendingDecoder = false;
        this.mSeekingTimeMs = -1L;
        this.mReversePlayCurrentPts = this.mClip.startInFileTime;
    }

    private long timelineToFileTime(long j10) {
        Clip clip = this.mClip;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return j10 + clip.startInFileTime;
        }
        long j11 = 0;
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j12 = tXSpeed.endTime;
            long j13 = tXSpeed.startTime;
            long j14 = (long) ((j12 - j13) * timeMultipleInSpeed);
            long j15 = ((long) (j10 / timeMultipleInSpeed)) + j13;
            if (j10 < j14) {
                return j15;
            }
            j10 -= j14;
            j11 = j15;
        }
        return j11;
    }

    private void unInitializeGLComponents() {
        GLTexturePool gLTexturePool = this.mGLTexturePool;
        if (gLTexturePool != null) {
            gLTexturePool.evictAll();
            this.mGLTexturePool.destroy();
            this.mGLTexturePool = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uninitializeInternal() {
        unInitializeGLComponents();
        UGCVideoDecodeController uGCVideoDecodeController = this.mVideoDecodeController;
        if (uGCVideoDecodeController != null) {
            uGCVideoDecodeController.stop();
            this.mVideoDecodeController = null;
        }
        clearPixelFrameQueue();
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mPixFrameQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.i(this.mTag, "initialize");
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j10, boolean z10) {
        LiteavLog.i(this.mTag, "seekTo lineTime = " + j10 + " isPreciseSeek = " + z10);
        this.mWorkHandler.runAndWaitDone(fu.a(this, j10, z10), 1000L);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setMaxBufferFrameCount(int i10) {
        this.mMaxFrameCount = i10;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setPlayEndPts(long j10) {
        this.mPlayEndPts = j10;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z10) {
        LiteavLog.i(this.mTag, "isReverse = ".concat(String.valueOf(z10)));
        this.mWorkHandler.runOrPost(fv.a(this, z10));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(fs.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(ft.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        LiteavLog.i(this.mTag, "unInitialize");
        this.mWorkHandler.runOrPost(fp.a(this));
    }
}
