package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class UGCMediaListSource {
    private static final int MAX_FRAME_SIZE = 5;
    private static final int READ_FRAME_TIME_OUT_MS = 5;
    public static final int SEEK_TIME_OUT = 1000;
    private CustomHandler mAudioHandler;
    private List<Bitmap> mBitmapList;
    private FutureTask<Long> mCalculateDurationTask;
    private UGCAudioFrameProvider mCurrentAudioFrameProvider;
    private UGCPixelFrameProvider mCurrentPixelFrameProvider;
    private EGLCore mEGLCore;
    private FutureTask<Boolean> mHasAudioDataTask;
    private UGCPixelFrameProvider mNextPixelFrameProvider;
    private List<TXVideoEditConstants.TXRepeat> mRepeatList;
    private List<String> mSources;
    private List<TXVideoEditConstants.TXSpeed> mSpeedList;
    private CustomHandler mVideoHandler;
    private CustomHandler mWorkHandler;
    private final AtomicInteger mCountOfPendingResetInputData = new AtomicInteger();
    private final AtomicReference<Long> mPendingSeekTime = new AtomicReference<>();
    private int mCurrentVideoClipIndex = 0;
    private int mCurrentAudioClipIndex = 0;
    private int mNextVideoClipIndex = 0;
    private long mVideoSeekTimeInClip = -1;
    private long mAudioSeekTimeInClip = -1;
    private long mLastVideoFrameTimestamp = -1;
    private long mLastAudioFrameTimestamp = -1;
    private boolean mIsSplitScreenMode = false;
    private int mFps = 20;
    private int mTransitionType = 1;
    private long mSourceRangeStart = 0;
    private long mSourceRangeEnd = 2147483647L;
    private long mTotalDuration = 0;
    private long mTailWaterMarkDurationMs = 0;
    private boolean mIsPreciseSeek = true;
    private boolean mIsReverse = false;
    private boolean mNeedAudioSource = false;
    private int mMaxBufferFrame = 3;
    private long mPlayEndTime = Long.MAX_VALUE;
    private TXVideoJoiner.DurationControlMode mDurationControlMode = TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST;
    private final List<Clip> mClipList = new ArrayList();
    private final List<a> mMediaInfoList = new ArrayList();
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue = new UGCFrameQueue<>();
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameListQueue = new UGCFrameQueue<>();
    private final List<PixelFrame> mTailPixelFrameList = new ArrayList();
    private final String mTAG = "UGCMediaListSource_" + hashCode();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f103231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f103232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f103233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f103234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f103235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f103236f;

        private a() {
            this.f103231a = 0L;
            this.f103232b = 0L;
            this.f103233c = false;
            this.f103234d = 25.0f;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    private void addClipToList(long j10, long j11, a aVar) {
        if (j10 >= j11) {
            return;
        }
        Clip clip = new Clip();
        clip.startInFileTime = j10;
        clip.endInFileTime = j11;
        clip.path = aVar.f103235e;
        clip.fps = aVar.f103234d;
        clip.videoMimeType = aVar.f103236f;
        this.mClipList.add(clip);
    }

    private void addVideoTailFrameListToQueue() {
        PixelFrame pixelFrame;
        if (this.mTailWaterMarkDurationMs <= 0 || this.mTailPixelFrameList.isEmpty()) {
            return;
        }
        long j10 = 40;
        List<Clip> list = this.mClipList;
        if (list != null && !list.isEmpty()) {
            float f10 = this.mClipList.get(0).fps;
            if (f10 > 0.0f) {
                j10 = (long) (1000.0f / f10);
            }
        }
        int i10 = (int) (this.mTailWaterMarkDurationMs / j10);
        for (int i11 = 0; i11 < i10; i11++) {
            LinkedList linkedList = new LinkedList();
            for (PixelFrame pixelFrame2 : this.mTailPixelFrameList) {
                if (pixelFrame2 instanceof GLTexturePool.TextureFrame) {
                    GLTexturePool.TextureFrame textureFrame = (GLTexturePool.TextureFrame) pixelFrame2;
                    pixelFrame = textureFrame.getGLTexture().wrap(textureFrame.getGLContext());
                } else {
                    LiteavLog.w(this.mTAG, "addVideoTailFrameListToQueue: pixelFrame is not TextureFrame");
                    pixelFrame = new PixelFrame(pixelFrame2);
                }
                pixelFrame.setTimestamp((((long) (i11 + 1)) * j10) + pixelFrame2.getTimestamp());
                linkedList.add(pixelFrame);
            }
            if (!putPixFrameToQueue(linkedList)) {
                return;
            }
        }
    }

    private void adjustAudioFrameTimestamp(List<AudioFrame> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        AudioFrame audioFrame = list.get(0);
        long jCalculateAudioFrameDuration = calculateAudioFrameDuration(audioFrame);
        if (this.mLastAudioFrameTimestamp != -1) {
            long timestamp = audioFrame.getTimestamp();
            long j10 = this.mLastAudioFrameTimestamp;
            if (timestamp < j10 + jCalculateAudioFrameDuration) {
                if (jCalculateAudioFrameDuration <= 0) {
                    jCalculateAudioFrameDuration = 1;
                }
                long j11 = j10 + jCalculateAudioFrameDuration;
                this.mLastAudioFrameTimestamp = j11;
                audioFrame.setTimestamp(j11);
                return;
            }
        }
        this.mLastAudioFrameTimestamp = audioFrame.getTimestamp();
    }

    private void adjustPixelFrameTimestamp(List<PixelFrame> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        PixelFrame pixelFrame = list.get(0);
        if (this.mLastVideoFrameTimestamp != -1) {
            long timestamp = pixelFrame.getTimestamp();
            long j10 = this.mLastVideoFrameTimestamp;
            if (timestamp <= j10) {
                long j11 = j10 + 1;
                this.mLastVideoFrameTimestamp = j11;
                pixelFrame.setTimestamp(j11);
                return;
            }
        }
        this.mLastVideoFrameTimestamp = pixelFrame.getTimestamp();
    }

    private long calculateAudioFrameDuration(AudioFrame audioFrame) {
        if (audioFrame == null || audioFrame.getData() == null) {
            return 0L;
        }
        long sampleRate = ((long) audioFrame.getSampleRate()) * 2 * ((long) audioFrame.getChannelCount());
        if (sampleRate == 0) {
            return 0L;
        }
        return (((long) audioFrame.getData().limit()) * 1000) / sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateTotalDurationOfClips() {
        if (isImageSource()) {
            return getImageDuration();
        }
        long clipDuration = 0;
        if (this.mIsSplitScreenMode) {
            return this.mDurationControlMode == TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST ? getMaxClipDuration(this.mClipList) : getMinClipDuration(this.mClipList);
        }
        Iterator<Clip> it = this.mClipList.iterator();
        while (it.hasNext()) {
            clipDuration += getClipDuration(it.next());
        }
        long j10 = this.mSourceRangeEnd - this.mSourceRangeStart;
        return j10 < clipDuration ? j10 : clipDuration;
    }

    private void clearFrameQueue() {
        clearVideoFrameQueue();
        this.mAudioFrameListQueue.clear();
    }

    private void clearTailPixelFrameQueue() {
        ensureEGLCoreCreated();
        if (EGLCore.makeCurrent(this.mEGLCore)) {
            PixelFrame.releasePixelFrames(this.mTailPixelFrameList);
        }
        this.mTailPixelFrameList.clear();
    }

    private void clearVideoFrameQueue() {
        runOnWorkThread(em.a(this, this.mPixelFrameListQueue.dequeueAll()));
    }

    private void closeCurrentAudioFrameProvider() {
        UGCAudioFrameProvider uGCAudioFrameProvider = this.mCurrentAudioFrameProvider;
        if (uGCAudioFrameProvider == null) {
            return;
        }
        uGCAudioFrameProvider.stop();
        this.mCurrentAudioFrameProvider.uninitialize();
        this.mCurrentAudioFrameProvider = null;
    }

    private void closeCurrentPixelFrameProvider() {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider == null) {
            return;
        }
        uGCPixelFrameProvider.stop();
        this.mCurrentPixelFrameProvider.uninitialize();
        this.mCurrentPixelFrameProvider = null;
    }

    private void closeNextPixelFrameProvider() {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mNextPixelFrameProvider;
        if (uGCPixelFrameProvider == null) {
            return;
        }
        uGCPixelFrameProvider.stop();
        this.mNextPixelFrameProvider.uninitialize();
        this.mNextPixelFrameProvider = null;
    }

    private UGCPixelFrameProvider createImageProvider() {
        UGCImageProvider uGCImageProvider = new UGCImageProvider(this.mBitmapList, this.mFps);
        uGCImageProvider.initialize();
        uGCImageProvider.start();
        uGCImageProvider.setPictureTransition(this.mTransitionType);
        return uGCImageProvider;
    }

    private UGCAudioFrameProvider createMuteAudioProvider() {
        Clip clip = new Clip();
        clip.path = UGCSingleFileAudioFrameProvider.MUTE_VIRTUAL_FILE_PATH;
        clip.startInClipsTimeline = 0L;
        clip.startTimelineNoSpeed = 0L;
        clip.startInFileTime = 0L;
        clip.endInFileTime = getImageDuration();
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider = new UGCSingleFileAudioFrameProvider(clip, this.mAudioHandler);
        uGCSingleFileAudioFrameProvider.initialize();
        uGCSingleFileAudioFrameProvider.start();
        return uGCSingleFileAudioFrameProvider;
    }

    private TXVideoEditConstants.TXSpeed createTXSpeed(long j10, long j11, int i10) {
        TXVideoEditConstants.TXSpeed tXSpeed = new TXVideoEditConstants.TXSpeed();
        tXSpeed.startTime = j10;
        tXSpeed.endTime = j11;
        tXSpeed.speedLevel = i10;
        return tXSpeed;
    }

    private UGCPixelFrameProvider createVideoFileProvider(int i10, boolean z10) {
        UGCPixelFrameProvider uGCMultiFilePixelFrameProvider;
        if (this.mVideoHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Video-File-Provider");
            handlerThread.start();
            this.mVideoHandler = new CustomHandler(handlerThread.getLooper());
        }
        if (z10) {
            uGCMultiFilePixelFrameProvider = new UGCMultiFilePixelFrameProvider(this.mClipList, this.mDurationControlMode, this.mVideoHandler);
        } else {
            UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider = new UGCSingleFilePixelFrameProvider(this.mClipList.get(i10), this.mVideoHandler);
            uGCSingleFilePixelFrameProvider.setPlayEndPts(this.mPlayEndTime);
            uGCMultiFilePixelFrameProvider = uGCSingleFilePixelFrameProvider;
        }
        uGCMultiFilePixelFrameProvider.initialize();
        uGCMultiFilePixelFrameProvider.setReverse(this.mIsReverse);
        uGCMultiFilePixelFrameProvider.setMaxBufferFrameCount(this.mMaxBufferFrame);
        uGCMultiFilePixelFrameProvider.start();
        return uGCMultiFilePixelFrameProvider;
    }

    private void cutMultipleFileToClips() {
        for (a aVar : this.mMediaInfoList) {
            addClipToList(0L, aVar.f103232b, aVar);
        }
    }

    private void cutSingleVideoFileToClips() {
        long j10;
        long j11 = this.mSourceRangeStart;
        List<TXVideoEditConstants.TXRepeat> list = this.mRepeatList;
        if (list == null || list.isEmpty()) {
            j10 = j11;
        } else {
            Collections.sort(this.mRepeatList, eo.a());
            j10 = j11;
            for (TXVideoEditConstants.TXRepeat tXRepeat : this.mRepeatList) {
                if (!isInvalidRepeat(tXRepeat)) {
                    long j12 = tXRepeat.endTime;
                    long j13 = this.mSourceRangeEnd;
                    if (j12 <= j13) {
                        j13 = j12;
                    }
                    addClipToList(j10, j13, this.mMediaInfoList.get(0));
                    for (int i10 = 0; i10 < tXRepeat.repeatTimes - 1; i10++) {
                        addClipToList(tXRepeat.startTime, j13, this.mMediaInfoList.get(0));
                    }
                    j10 = j13;
                }
            }
        }
        long j14 = this.mTotalDuration;
        long j15 = this.mSourceRangeEnd;
        if (j14 > j15) {
            j14 = j15;
        }
        if (j10 < j14) {
            addClipToList(j10, j14, this.mMediaInfoList.get(0));
        }
    }

    private void ensureEGLCoreCreated() {
        if (this.mEGLCore == null) {
            this.mEGLCore = EGLCore.create(GlobalContextManager.getInstance().getGLContext());
        }
    }

    private long estimateSourceOpenTime() {
        List<String> list = this.mSources;
        if (list == null || list.size() <= 1) {
            return 1000L;
        }
        return 1000 * ((long) list.size());
    }

    private long getClipDuration(Clip clip) {
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return clip.endInFileTime - clip.startInFileTime;
        }
        long speed = 0;
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            speed = (long) (speed + ((tXSpeed.endTime - tXSpeed.startTime) / getSpeed(tXSpeed.speedLevel)));
        }
        return speed;
    }

    private long getImageDuration() {
        if (!isImageSource() || !updateCurrentPixelFrameProvider()) {
            return 0L;
        }
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider instanceof UGCImageProvider) {
            return ((UGCImageProvider) uGCPixelFrameProvider).getDuration();
        }
        return 0L;
    }

    private long getMaxClipDuration(List<Clip> list) {
        long clipDuration = 0;
        for (Clip clip : list) {
            if (clipDuration < getClipDuration(clip)) {
                clipDuration = getClipDuration(clip);
            }
        }
        return clipDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static a getMediaInfo(String str) {
        a aVar = new a(0 == true ? 1 : 0);
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        if (fFmpegMediaRetriever.setDataSource(str) == 0) {
            long audioDurationMs = fFmpegMediaRetriever.getAudioDurationMs();
            aVar.f103232b = Math.max(audioDurationMs, fFmpegMediaRetriever.getVideoDurationMs());
            aVar.f103233c = audioDurationMs != 0;
            aVar.f103234d = fFmpegMediaRetriever.getFPS();
            aVar.f103236f = fFmpegMediaRetriever.getVideoMimeType();
        }
        return aVar;
    }

    private long getMinClipDuration(List<Clip> list) {
        long clipDuration = 2147483647L;
        for (Clip clip : list) {
            if (clipDuration > getClipDuration(clip)) {
                clipDuration = getClipDuration(clip);
            }
        }
        return clipDuration;
    }

    public static float getSpeed(int i10) {
        if (i10 == 0) {
            return 0.25f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 != 3) {
            return i10 != 4 ? 1.0f : 2.0f;
        }
        return 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAudioDataInternal() {
        Iterator<a> it = this.mMediaInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().f103233c) {
                return true;
            }
        }
        return false;
    }

    private boolean isImageSource() {
        List<Bitmap> list;
        return (this.mClipList.size() != 0 || (list = this.mBitmapList) == null || list.size() == 0) ? false : true;
    }

    private boolean isInvalidRepeat(TXVideoEditConstants.TXRepeat tXRepeat) {
        if (tXRepeat.repeatTimes <= 0) {
            return true;
        }
        long j10 = tXRepeat.startTime;
        long j11 = tXRepeat.endTime;
        return j10 >= j11 || j10 > this.mSourceRangeEnd || j11 < this.mSourceRangeStart;
    }

    private boolean isResettingInputData() {
        return this.mCountOfPendingResetInputData.get() > 0 || this.mPendingSeekTime.get() != null;
    }

    static /* synthetic */ void lambda$clearVideoFrameQueue$20(UGCMediaListSource uGCMediaListSource, List list) {
        uGCMediaListSource.ensureEGLCoreCreated();
        if (EGLCore.makeCurrent(uGCMediaListSource.mEGLCore)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PixelFrame.releasePixelFrames((List) it.next());
            }
        }
    }

    static /* synthetic */ int lambda$cutSingleVideoFileToClips$1(TXVideoEditConstants.TXRepeat tXRepeat, TXVideoEditConstants.TXRepeat tXRepeat2) {
        return (int) (tXRepeat.startTime - tXRepeat2.startTime);
    }

    static /* synthetic */ void lambda$seekTo$11(UGCMediaListSource uGCMediaListSource, boolean z10) {
        Long andSet = uGCMediaListSource.mPendingSeekTime.getAndSet(null);
        if (andSet != null) {
            uGCMediaListSource.seekToInternal(andSet.longValue(), z10);
        }
    }

    static /* synthetic */ void lambda$setDurationControlMode$3(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        uGCMediaListSource.mDurationControlMode = durationControlMode;
        futureTask.run();
    }

    static /* synthetic */ void lambda$setIsSplitScreenMode$4(UGCMediaListSource uGCMediaListSource, boolean z10, FutureTask futureTask) {
        uGCMediaListSource.mIsSplitScreenMode = z10;
        uGCMediaListSource.mSourceRangeStart = 0L;
        uGCMediaListSource.mSourceRangeEnd = 2147483647L;
        uGCMediaListSource.updateTimelineToClips();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setPictureList$6(UGCMediaListSource uGCMediaListSource, List list, int i10) {
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mClipList.clear();
        uGCMediaListSource.mBitmapList = list;
        uGCMediaListSource.mFps = i10;
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setPictureTransition$7(UGCMediaListSource uGCMediaListSource, int i10, FutureTask futureTask) {
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mTransitionType = i10;
        uGCMediaListSource.updateCurrentPixelFrameProvider();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setPlayEndTime$10(UGCMediaListSource uGCMediaListSource, long j10) {
        uGCMediaListSource.mPlayEndTime = j10;
        UGCPixelFrameProvider uGCPixelFrameProvider = uGCMediaListSource.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider != null) {
            uGCPixelFrameProvider.setPlayEndPts(j10);
        }
        UGCAudioFrameProvider uGCAudioFrameProvider = uGCMediaListSource.mCurrentAudioFrameProvider;
        if (uGCAudioFrameProvider != null) {
            uGCAudioFrameProvider.setPlayEndPts(j10);
        }
    }

    static /* synthetic */ void lambda$setRepeatPlay$12(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        uGCMediaListSource.mRepeatList = list;
        uGCMediaListSource.updateClipsInfo();
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setReverse$13(UGCMediaListSource uGCMediaListSource, boolean z10) {
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mIsReverse = z10;
        if (z10) {
            uGCMediaListSource.mCurrentVideoClipIndex = uGCMediaListSource.mClipList.size() - 1;
        } else {
            uGCMediaListSource.mCurrentVideoClipIndex = 0;
        }
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setSpeedList$14(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        uGCMediaListSource.mSpeedList = list;
        uGCMediaListSource.updateClipsInfo();
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setVideoSourceRange$5(UGCMediaListSource uGCMediaListSource, long j10, long j11, FutureTask futureTask) {
        if (!uGCMediaListSource.mIsSplitScreenMode) {
            uGCMediaListSource.mSourceRangeStart = j10;
            uGCMediaListSource.mSourceRangeEnd = j11;
            uGCMediaListSource.updateClipsInfo();
        }
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ void lambda$setVideoSources$0(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        uGCMediaListSource.setVideoSourcesInternal(list);
        futureTask.run();
        futureTask2.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    static /* synthetic */ int lambda$updateSpeedInfoToClips$2(TXVideoEditConstants.TXSpeed tXSpeed, TXVideoEditConstants.TXSpeed tXSpeed2) {
        return (int) (tXSpeed.startTime - tXSpeed2.startTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNextAudioFrameInternal(long j10) {
        if (this.mAudioFrameListQueue.size() > 5) {
            return;
        }
        if (!updateCurrentAudioFrameProvider()) {
            if (putAudioFrameToQueue(null)) {
                LiteavLog.i(this.mTAG, "getAudioFrameProvider fail.AudioFrameListQueue put null");
                return;
            } else {
                scheduleTaskOnWorkerThread(ee.a(this));
                return;
            }
        }
        long j11 = this.mAudioSeekTimeInClip;
        if (j11 != -1) {
            this.mCurrentAudioFrameProvider.seekTo(j11);
            this.mCurrentAudioFrameProvider.setPlayEndPts(this.mPlayEndTime);
            this.mAudioSeekTimeInClip = -1L;
        }
        readAudioFrameListToQueue(j10);
        scheduleTaskOnWorkerThread(ef.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNextVideoFrameInternal(long j10) {
        if (this.mPixelFrameListQueue.size() >= 5) {
            return;
        }
        if (!updateCurrentPixelFrameProvider()) {
            addVideoTailFrameListToQueue();
            if (putPixFrameToQueue(null)) {
                LiteavLog.i(this.mTAG, "getPixelFrameProvider fail.PixelFrameListQueue put null");
                return;
            } else {
                scheduleTaskOnWorkerThread(eg.a(this));
                return;
            }
        }
        long j11 = this.mVideoSeekTimeInClip;
        if (j11 != -1) {
            this.mCurrentPixelFrameProvider.seekTo(j11, this.mIsPreciseSeek);
            this.mCurrentPixelFrameProvider.setPlayEndPts(this.mPlayEndTime);
            this.mVideoSeekTimeInClip = -1L;
        }
        readVideoFrameListToQueue(j10);
        scheduleTaskOnWorkerThread(eh.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prePareNextUGCPixelFrameProvider() {
        int i10;
        closeNextPixelFrameProvider();
        if (this.mIsReverse) {
            this.mNextVideoClipIndex = this.mCurrentVideoClipIndex - 1;
        } else {
            this.mNextVideoClipIndex = this.mCurrentVideoClipIndex + 1;
        }
        if (this.mNextVideoClipIndex >= this.mClipList.size() || (i10 = this.mNextVideoClipIndex) < 0) {
            return;
        }
        this.mNextPixelFrameProvider = createVideoFileProvider(i10, false);
    }

    private boolean putPixFrameToQueue(List<PixelFrame> list) {
        if (isResettingInputData()) {
            PixelFrame.releasePixelFrames(list);
            return false;
        }
        this.mPixelFrameListQueue.queue(list);
        return true;
    }

    private void readAudioFrameListToQueue(long j10) {
        List<AudioFrame> listDequeue = this.mCurrentAudioFrameProvider.getFrameQueue().dequeue(j10);
        if (listDequeue == null) {
            return;
        }
        if (listDequeue != UGCAudioFrameProvider.END_OF_STREAM) {
            if (!this.mIsSplitScreenMode) {
                adjustAudioFrameTimestamp(listDequeue);
            }
            putAudioFrameToQueue(listDequeue);
        } else {
            LiteavLog.i(this.mTAG, "audio frame provider read END_OF_STREAM");
            closeCurrentAudioFrameProvider();
            if (this.mIsReverse) {
                this.mCurrentAudioClipIndex--;
            } else {
                this.mCurrentAudioClipIndex++;
            }
        }
    }

    private void readVideoFrameListToQueue(long j10) {
        List<PixelFrame> listDequeue = this.mCurrentPixelFrameProvider.getFrameQueue().dequeue(j10);
        if (listDequeue == null) {
            return;
        }
        if (listDequeue != UGCPixelFrameProvider.END_OF_STREAM) {
            if (!this.mIsSplitScreenMode) {
                adjustPixelFrameTimestamp(listDequeue);
            }
            if (putPixFrameToQueue(listDequeue)) {
                saveTailVideoFrameToList(listDequeue);
                return;
            }
            return;
        }
        LiteavLog.i(this.mTAG, "video frame provider read END_OF_STREAM");
        closeCurrentPixelFrameProvider();
        if (this.mIsReverse) {
            this.mCurrentVideoClipIndex--;
        } else {
            this.mCurrentVideoClipIndex++;
        }
    }

    private void removeRunnable(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(runnable);
        }
    }

    private void resetReadPositionInternal() {
        clearFrameQueue();
        clearTailPixelFrameQueue();
        closeCurrentPixelFrameProvider();
        closeCurrentAudioFrameProvider();
        this.mCurrentVideoClipIndex = 0;
        this.mCurrentAudioClipIndex = 0;
        this.mVideoSeekTimeInClip = -1L;
        this.mAudioSeekTimeInClip = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
    }

    private void runOnWorkThread(Runnable runnable) {
        runOnWorkThread(runnable, 0);
    }

    private void runOnWorkThread(Runnable runnable, int i10) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.runOrPost(runnable, i10);
        }
    }

    private void saveTailVideoFrameToList(List<PixelFrame> list) {
        if (this.mTailWaterMarkDurationMs == 0) {
            return;
        }
        Iterator<PixelFrame> it = this.mTailPixelFrameList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.mTailPixelFrameList.clear();
        for (PixelFrame pixelFrame : list) {
            pixelFrame.retain();
            this.mTailPixelFrameList.add(pixelFrame);
        }
    }

    private void scheduleTaskOnWorkerThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.post(runnable);
        }
    }

    private void seekTo(long j10, boolean z10) {
        if (j10 < 0) {
            return;
        }
        this.mPendingSeekTime.set(Long.valueOf(j10));
        runOnWorkThread(dx.a(this, z10));
    }

    private void seekToInternal(long j10, boolean z10) {
        long jA = com.tencent.liteav.base.util.h.a(j10, 0L, this.mTotalDuration);
        if (isImageSource()) {
            seekToInternalWithImageSource(jA);
            return;
        }
        if (this.mClipList.isEmpty()) {
            return;
        }
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
        if (this.mIsSplitScreenMode) {
            this.mVideoSeekTimeInClip = jA;
            this.mAudioSeekTimeInClip = jA;
            clearFrameQueue();
            clearTailPixelFrameQueue();
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < this.mClipList.size(); i11++) {
            Clip clip = this.mClipList.get(i11);
            if (clip.startInClipsTimeline + (clip.endInFileTime - clip.startInFileTime) >= jA) {
                i10 = i11;
                break;
            }
        }
        if (i10 >= 0) {
            this.mVideoSeekTimeInClip = jA - this.mClipList.get(i10).startInClipsTimeline;
        } else {
            this.mVideoSeekTimeInClip = jA;
        }
        long j11 = this.mVideoSeekTimeInClip;
        this.mAudioSeekTimeInClip = j11;
        if (this.mIsReverse) {
            this.mAudioSeekTimeInClip = this.mTotalDuration - j11;
        }
        this.mIsPreciseSeek = z10;
        if (this.mCurrentVideoClipIndex != i10) {
            closeCurrentPixelFrameProvider();
        }
        if (this.mCurrentAudioClipIndex != i10) {
            closeCurrentAudioFrameProvider();
        }
        this.mCurrentVideoClipIndex = i10;
        this.mCurrentAudioClipIndex = i10;
        this.mLastVideoFrameTimestamp = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        clearFrameQueue();
        clearTailPixelFrameQueue();
        loadNextVideoFrameInternal(0L);
        if (this.mNeedAudioSource) {
            loadNextAudioFrameInternal(0L);
        }
    }

    private void seekToInternalWithImageSource(long j10) {
        this.mCurrentVideoClipIndex = 0;
        this.mVideoSeekTimeInClip = j10;
        this.mLastVideoFrameTimestamp = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        clearFrameQueue();
        clearTailPixelFrameQueue();
        loadNextVideoFrameInternal(0L);
    }

    private void setVideoSourcesInternal(List<String> list) {
        resetReadPositionInternal();
        this.mSources = list;
        this.mMediaInfoList.clear();
        clearFrameQueue();
        this.mTotalDuration = 0L;
        for (String str : list) {
            a mediaInfo = getMediaInfo(str);
            LiteavLog.i(this.mTAG, str + " get media Info. duration = " + mediaInfo.f103232b);
            long j10 = this.mTotalDuration;
            mediaInfo.f103231a = j10;
            mediaInfo.f103235e = str;
            this.mTotalDuration = j10 + mediaInfo.f103232b;
            this.mMediaInfoList.add(mediaInfo);
        }
        this.mSourceRangeStart = 0L;
        this.mSourceRangeEnd = this.mTotalDuration;
        updateClipsInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uninitializeInternal() {
        clearFrameQueue();
        clearTailPixelFrameQueue();
        closeCurrentPixelFrameProvider();
        closeNextPixelFrameProvider();
        closeCurrentAudioFrameProvider();
        CustomHandler customHandler = this.mVideoHandler;
        if (customHandler != null) {
            customHandler.quitLooper();
            this.mVideoHandler = null;
        }
        CustomHandler customHandler2 = this.mAudioHandler;
        if (customHandler2 != null) {
            customHandler2.quitLooper();
            this.mAudioHandler = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
        this.mClipList.clear();
        this.mMediaInfoList.clear();
        this.mSources = null;
        this.mRepeatList = null;
        this.mSpeedList = null;
        this.mSourceRangeStart = 0L;
        this.mSourceRangeEnd = 2147483647L;
        this.mCurrentVideoClipIndex = 0;
        this.mCurrentAudioClipIndex = 0;
        this.mVideoSeekTimeInClip = -1L;
        this.mAudioSeekTimeInClip = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
        this.mIsReverse = false;
        this.mNextVideoClipIndex = 0;
        CustomHandler customHandler3 = this.mWorkHandler;
        if (customHandler3 != null) {
            customHandler3.quitLooper();
            this.mWorkHandler = null;
        }
    }

    private void updateClipsInfo() {
        LiteavLog.i(this.mTAG, "updateClipsInfo");
        List<String> list = this.mSources;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mClipList.clear();
        if (this.mSources.size() > 1) {
            cutMultipleFileToClips();
        } else {
            cutSingleVideoFileToClips();
        }
        Iterator<Clip> it = this.mClipList.iterator();
        while (it.hasNext()) {
            updateSpeedInfoToClips(it.next());
        }
        updateTimelineToClips();
    }

    private boolean updateCurrentAudioFrameProvider() {
        int i10;
        if (this.mCurrentAudioFrameProvider != null) {
            return true;
        }
        if (this.mAudioHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-File-Provider");
            handlerThread.start();
            this.mAudioHandler = new CustomHandler(handlerThread.getLooper());
        }
        if (isImageSource() && this.mCurrentAudioClipIndex == 0) {
            this.mCurrentAudioFrameProvider = createMuteAudioProvider();
            return true;
        }
        if (this.mCurrentAudioClipIndex >= this.mClipList.size() || (i10 = this.mCurrentAudioClipIndex) < 0) {
            return false;
        }
        if (this.mIsSplitScreenMode) {
            this.mCurrentAudioFrameProvider = new UGCMultiFileAudioFrameProvider(this.mClipList, this.mDurationControlMode, this.mAudioHandler);
            this.mCurrentAudioClipIndex = this.mClipList.size();
        } else {
            this.mCurrentAudioFrameProvider = new UGCSingleFileAudioFrameProvider(this.mClipList.get(i10), this.mAudioHandler);
        }
        this.mCurrentAudioFrameProvider.initialize();
        this.mCurrentAudioFrameProvider.start();
        return true;
    }

    private boolean updateCurrentPixelFrameProvider() {
        int i10;
        if (this.mCurrentPixelFrameProvider != null) {
            return true;
        }
        if (isImageSource() && this.mCurrentVideoClipIndex == 0) {
            this.mCurrentPixelFrameProvider = createImageProvider();
            return true;
        }
        if (this.mCurrentVideoClipIndex >= this.mClipList.size() || (i10 = this.mCurrentVideoClipIndex) < 0) {
            return false;
        }
        if (this.mIsSplitScreenMode) {
            this.mCurrentPixelFrameProvider = createVideoFileProvider(0, true);
            this.mCurrentVideoClipIndex = this.mClipList.size();
        } else {
            if (i10 == this.mNextVideoClipIndex) {
                this.mCurrentPixelFrameProvider = this.mNextPixelFrameProvider;
                this.mNextPixelFrameProvider = null;
            }
            if (this.mCurrentPixelFrameProvider == null) {
                this.mCurrentPixelFrameProvider = createVideoFileProvider(i10, false);
            }
            removeRunnable(ei.a(this));
            runOnWorkThread(ek.a(this), 500);
        }
        return true;
    }

    private void updateSpeedInfoToClips(Clip clip) {
        List<TXVideoEditConstants.TXSpeed> list = this.mSpeedList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(this.mSpeedList, ep.a());
        ArrayList arrayList = new ArrayList();
        long j10 = clip.startInFileTime;
        long j11 = j10;
        for (TXVideoEditConstants.TXSpeed tXSpeed : this.mSpeedList) {
            long j12 = tXSpeed.startTime;
            long j13 = clip.startInSourceListTimeline;
            long j14 = j12 - j13;
            long j15 = tXSpeed.endTime - j13;
            if (j15 >= clip.startInFileTime) {
                long j16 = clip.endInFileTime;
                if (j14 > j16 || j11 >= j16) {
                    break;
                }
                if (j14 > j11) {
                    arrayList.add(createTXSpeed(j11, j14, 2));
                    j11 = j14;
                }
                TXVideoEditConstants.TXSpeed tXSpeedCreateTXSpeed = createTXSpeed(j11, j15, tXSpeed.speedLevel);
                long j17 = tXSpeedCreateTXSpeed.endTime;
                long j18 = clip.endInFileTime;
                if (j17 > j18) {
                    tXSpeedCreateTXSpeed.endTime = j18;
                }
                arrayList.add(tXSpeedCreateTXSpeed);
                j11 = tXSpeedCreateTXSpeed.endTime;
            }
        }
        long j19 = clip.endInFileTime;
        if (j11 != j19) {
            arrayList.add(createTXSpeed(j11, j19, 2));
        }
        clip.speedList = arrayList;
    }

    private void updateTimelineToClips() {
        long clipDuration = 0;
        long j10 = 0;
        for (Clip clip : this.mClipList) {
            clip.startInClipsTimeline = clipDuration;
            clip.startTimelineNoSpeed = j10;
            if (!this.mIsSplitScreenMode) {
                clipDuration += getClipDuration(clip);
                j10 += clip.endInFileTime - clip.startInFileTime;
            }
        }
    }

    public long getDuration() {
        FutureTask<Long> futureTask = this.mCalculateDurationTask;
        if (futureTask == null) {
            return 0L;
        }
        Long l10 = 0L;
        try {
            l10 = futureTask.get(estimateSourceOpenTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            LiteavLog.w(this.mTAG, "getDuration future task exception: ".concat(String.valueOf(e10)));
        }
        return l10.longValue();
    }

    public boolean hasAudioData() throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask<Boolean> futureTask = this.mHasAudioDataTask;
        if (futureTask == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        try {
            bool = futureTask.get(estimateSourceOpenTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            LiteavLog.w(this.mTAG, "hasAudioData future exception ".concat(String.valueOf(e10)));
        }
        return bool.booleanValue();
    }

    public void impreciseSeekTo(long j10) {
        LiteavLog.i(this.mTAG, "impreciseSeekTo lineTime = ".concat(String.valueOf(j10)));
        seekTo(j10, false);
    }

    public void initialize() {
        LiteavLog.i(this.mTAG, "initialize");
        synchronized (this) {
            if (this.mWorkHandler != null) {
                LiteavLog.w(this.mTAG, "UGCMediaStreamSpliter is initialized");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("ugc-media-list-source");
            handlerThread.start();
            this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
        }
    }

    public boolean putAudioFrameToQueue(List<AudioFrame> list) {
        if (isResettingInputData()) {
            return false;
        }
        this.mAudioFrameListQueue.queue(list);
        return true;
    }

    public List<AudioFrame> readNextAudioFrame() {
        if (isResettingInputData()) {
            this.mAudioFrameListQueue.clear();
        }
        runOnWorkThread(du.a(this));
        return this.mAudioFrameListQueue.dequeue();
    }

    public List<PixelFrame> readNextVideoFrame() {
        if (isResettingInputData()) {
            clearVideoFrameQueue();
        }
        runOnWorkThread(dv.a(this));
        return this.mPixelFrameListQueue.dequeue();
    }

    public void seekTo(long j10) {
        LiteavLog.i(this.mTAG, "seekTo lineTime = ".concat(String.valueOf(j10)));
        seekTo(j10, true);
    }

    public void setDurationControlMode(TXVideoJoiner.DurationControlMode durationControlMode) {
        LiteavLog.i(this.mTAG, "set duration control mode " + this.mDurationControlMode);
        FutureTask<Long> futureTask = new FutureTask<>(eq.a(this));
        this.mCalculateDurationTask = futureTask;
        runOnWorkThread(er.a(this, durationControlMode, futureTask));
    }

    public void setIsSplitScreenMode(boolean z10) {
        LiteavLog.i(this.mTAG, "Set split screen mode is ".concat(String.valueOf(z10)));
        FutureTask<Long> futureTask = new FutureTask<>(es.a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(Cdo.a(this, z10, futureTask));
    }

    public void setMaxFrameSize(int i10) {
        this.mMaxBufferFrame = i10;
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider != null) {
            uGCPixelFrameProvider.setMaxBufferFrameCount(i10);
        }
    }

    public void setNeedAudioSource(boolean z10) {
        this.mNeedAudioSource = z10;
    }

    public void setPictureList(List<Bitmap> list, int i10) {
        LiteavLog.i(this.mTAG, "setPictureList bitmapList size = " + list.size() + " fps = " + i10);
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(dr.a(this, list, i10));
    }

    public void setPictureTransition(int i10) {
        LiteavLog.i(this.mTAG, "setPictureTransition type = ".concat(String.valueOf(i10)));
        FutureTask<Long> futureTask = new FutureTask<>(ds.a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(dt.a(this, i10, futureTask));
    }

    public void setPlayEndTime(long j10) {
        runOnWorkThread(dw.a(this, j10));
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
        LiteavLog.i(this.mTAG, "setRepeatPlay");
        FutureTask<Long> futureTask = new FutureTask<>(dz.a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(ea.a(this, list, futureTask));
    }

    public void setReverse(boolean z10) {
        LiteavLog.i(this.mTAG, "setReverse isReverse = ".concat(String.valueOf(z10)));
        if (z10 == this.mIsReverse) {
            return;
        }
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(eb.a(this, z10));
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        LiteavLog.i(this.mTAG, "setSpeedList");
        FutureTask<Long> futureTask = new FutureTask<>(ec.a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(ed.a(this, list, futureTask));
    }

    public void setTailWaterMarkDurationSecond(int i10) {
        runOnWorkThread(el.a(this, i10));
    }

    public void setVideoSourceRange(long j10, long j11) {
        LiteavLog.i(this.mTAG, "setVideoSourceRange startTime = " + j10 + " endTime = " + j11);
        FutureTask<Long> futureTask = new FutureTask<>(dp.a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(dq.a(this, j10, j11, futureTask));
    }

    public void setVideoSources(List<String> list) {
        LiteavLog.i(this.mTAG, "setVideoSources");
        FutureTask<Boolean> futureTask = new FutureTask<>(dy.a(this));
        this.mHasAudioDataTask = futureTask;
        FutureTask<Long> futureTask2 = new FutureTask<>(ej.a(this));
        this.mCalculateDurationTask = futureTask2;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(en.a(this, list, futureTask, futureTask2));
    }

    public long transitionOffsetTimeWithPts(long j10) {
        return 0L;
    }

    public void uninitialize() {
        LiteavLog.i(this.mTAG, "unInitialize");
        runOnWorkThread(dn.a(this));
    }
}
