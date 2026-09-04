package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.text.TextUtils;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.ugc.common.MediaExtractorBuilder;
import com.tencent.ugc.common.UGCTranscodeAudioEncodeParamsDecider;
import com.tencent.ugc.common.UGCTranscodeVideoEncodeParamsDecider;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.encoder.UGCVideoEncoderJNI;
import com.tencent.ugc.encoder.VideoEncodeParams;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class TXVideoEditer {
    private static final long MIN_SEEK_DIR = 100;
    private static final String TAG = "TXVideoEditer";
    private static final int WAIT_FOR_THUMBNAIL_TIMEOUT = 500;
    private static final HashSet<String> sVideoExtHashSet = new HashSet<>(Arrays.asList("3gpp", "3gp", "3g2", "m4v", "mpeg", "mpg", "mpe", "mp4", "vob", "qt", "mov", "wmv", "avi"));
    private final UGCAVSyncer mAVSyncer;
    private final ArrayList<UGCThumbnailGenerator> mAllThumbnailGeneratorList;
    private int mAudioEncodeBitrate;
    private AudioEncodeParams mAudioEncodeParams;
    private UGCAudioProcessor.AudioEncodedFrameListener mAudioEncodedFrameListener;
    private List<MediaFormat> mAudioFormatList;
    private final UGCAudioProcessor mAudioProcessor;
    private MediaFormat mBGMFormat;
    private Size mCanvasSize;
    private CombineFilterInfo mCombineFilterInfo;
    private final Context mContext;
    private long mCutEndTimeMs;
    private long mCutStartTimeMs;
    private int mEncodeProfile;
    private FrameLayout mFrameLayout;
    private boolean mHasBGM;
    private final AtomicBoolean mHasNotifyProcessComplete;
    private boolean mIsAudioEncoderStarted;
    private boolean mIsFullIFrame;
    private boolean mIsGenerateAudioEnd;
    private boolean mIsGenerateVideoEnd;
    private boolean mIsGenerating;
    private boolean mIsPlaying;
    private boolean mIsProcessToFullKeyFrame;
    private final AtomicBoolean mIsRelease;
    private boolean mIsReverse;
    private boolean mIsVideoEncoderStarted;
    private float mLastVideoEncodeProgress;
    private final CustomHandler mMainHandler;
    private final UGCMediaListSource mMediaListSource;
    private MP4Writer mMp4Writer;
    private final MP4Writer.MP4WriterListener mMp4WriterListener;
    private boolean mNeedWaitProcessFullI;
    private boolean mNeedWaitThumbnailProcess;
    private UGCVideoProcessor.VideoProcessListener mOnPlayProgressListener;
    private final AtomicReference<Long> mPendingPreviewAtTime;
    private UGCAVSyncer.SyncMode mPreviewSyncMode;
    private String mProcessOutputPath;
    private UGCThumbnailGenerator.UGCThumbnailGenerateParams mProcessThumbnailInfo;
    private TXThumbnailListener mProcessThumbnailListener;
    private String mRecordOutputPath;
    private com.tencent.liteav.base.util.l mRotation;
    private Runnable mRunnableOnPlayComplete;
    protected final com.tencent.liteav.base.util.m mSequenceTaskRunner;
    private String mSourcePath;
    private long mSourceRangeEndTimeMs;
    private long mSourceRangeStartTimeMs;
    private final AtomicReference<Long> mTargetSeekPts;
    private int mVideoEncodeBitrate;
    private VideoEncodeParams mVideoEncodeParams;
    private UGCVideoProcessor.VideoEncodedFrameListener mVideoEncodedFrameListener;
    private List<MediaFormat> mVideoFormatList;
    private TXVideoEditConstants.VideoFrameRateLevel mVideoFrameRateLevel;
    private TXVideoGenerateListener mVideoGenerateListener;
    private TXVideoPreviewListener mVideoPreviewListener;
    private TXVideoProcessListener mVideoProcessListener;
    private final UGCVideoProcessor mVideoProcessor;
    private List<String> mVideoSourceList;

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$2, reason: invalid class name */
    public final class AnonymousClass2 implements UGCVideoProcessor.VideoEncodedFrameListener {
        AnonymousClass2() {
        }

        static /* synthetic */ void a(AnonymousClass2 anonymousClass2) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFrameComplete();
            }
        }

        static /* synthetic */ void a(AnonymousClass2 anonymousClass2, UGCVideoEncoderJNI.EncoderType encoderType) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFail(encoderType);
            }
        }

        static /* synthetic */ void a(AnonymousClass2 anonymousClass2, EncodedVideoFrame encodedVideoFrame) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFrame(encodedVideoFrame);
            }
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType) {
            TXVideoEditer.this.mSequenceTaskRunner.a(cb.a(this, encoderType));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoEncodeStarted() {
            TXVideoEditer.this.mSequenceTaskRunner.a(by.a(this));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoEncodingCompleted() {
            TXVideoEditer.this.mSequenceTaskRunner.a(ca.a(this));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame == null) {
                LiteavLog.w(TXVideoEditer.TAG, "onVideoEncodedFrame frame is null.");
            } else {
                TXVideoEditer.this.mSequenceTaskRunner.a(bz.a(this, encodedVideoFrame));
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$3, reason: invalid class name */
    public final class AnonymousClass3 implements UGCAudioProcessor.AudioEncodedFrameListener {
        AnonymousClass3() {
        }

        static /* synthetic */ void a(AnonymousClass3 anonymousClass3) {
            if (TXVideoEditer.this.mIsAudioEncoderStarted) {
                TXVideoEditer.this.onAudioEncodedFrameComplete();
            }
        }

        static /* synthetic */ void a(AnonymousClass3 anonymousClass3, AudioFrame audioFrame) {
            if (TXVideoEditer.this.mIsAudioEncoderStarted) {
                TXVideoEditer.this.onAudioEncodedFrame(audioFrame);
            }
        }

        static /* synthetic */ void b(AnonymousClass3 anonymousClass3) {
            LiteavLog.i(TXVideoEditer.TAG, "on audioEncoding started");
            TXVideoEditer.this.mIsAudioEncoderStarted = true;
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioEncodingCompleted() {
            TXVideoEditer.this.mSequenceTaskRunner.a(ce.a(this));
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioEncodingStarted() {
            TXVideoEditer.this.mSequenceTaskRunner.a(cc.a(this));
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioFrameEncoded(AudioFrame audioFrame) {
            if (audioFrame == null) {
                LiteavLog.w(TXVideoEditer.TAG, "onAudioEncodedFrame frame is null.");
            } else {
                TXVideoEditer.this.mSequenceTaskRunner.a(cd.a(this, audioFrame));
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$4, reason: invalid class name */
    public final class AnonymousClass4 implements UGCVideoProcessor.VideoProcessListener {
        AnonymousClass4() {
        }

        static /* synthetic */ void a(AnonymousClass4 anonymousClass4, long j10) {
            long duration = j10 * 1000;
            if (TXVideoEditer.this.mIsReverse) {
                duration = (TXVideoEditer.this.mMediaListSource.getDuration() * 1000) - duration;
            }
            TXVideoEditer.this.notifyPreviewProgress((int) com.tencent.liteav.base.util.h.a(duration, 0L, TXVideoEditer.this.mMediaListSource.getDuration() * 1000));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
            if (tXGenerateResult != null) {
                LiteavLog.i(TXVideoEditer.TAG, "on video progress complete: retCode= " + tXGenerateResult.retCode + ", descMsg= " + tXGenerateResult.descMsg);
            }
            TXVideoEditer tXVideoEditer = TXVideoEditer.this;
            tXVideoEditer.mSequenceTaskRunner.a(tXVideoEditer.mRunnableOnPlayComplete);
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onProgress(long j10) {
            TXVideoEditer.this.mSequenceTaskRunner.a(cf.a(this, j10));
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$5, reason: invalid class name */
    public final class AnonymousClass5 implements TXThumbnailListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TXThumbnailListener f103218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f103219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UGCThumbnailGenerator f103220c;

        AnonymousClass5(TXThumbnailListener tXThumbnailListener, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
            this.f103218a = tXThumbnailListener;
            this.f103219b = list;
            this.f103220c = uGCThumbnailGenerator;
        }

        static /* synthetic */ void a(AnonymousClass5 anonymousClass5, TXThumbnailListener tXThumbnailListener, int i10, long j10, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
            if (tXThumbnailListener != null) {
                tXThumbnailListener.onThumbnail(i10, j10, bitmap);
            }
            if (!TXVideoEditer.this.mIsRelease.get() && i10 == list.size()) {
                LiteavLog.i(TXVideoEditer.TAG, "getThumbnail finished!");
                TXVideoEditer.this.releaseThumbnailGenerator(uGCThumbnailGenerator);
            }
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
        public final void onThumbnail(int i10, long j10, Bitmap bitmap) {
            TXVideoEditer.this.mSequenceTaskRunner.a(cg.a(this, this.f103218a, i10, j10, bitmap, this.f103219b, this.f103220c));
        }
    }

    public interface TXPCMCallbackListener {
        TXAudioFrame onPCMCallback(TXAudioFrame tXAudioFrame);
    }

    public interface TXThumbnailListener {
        void onThumbnail(int i10, long j10, Bitmap bitmap);
    }

    public interface TXVideoCustomProcessListener {
        int onTextureCustomProcess(int i10, int i11, int i12, long j10);

        void onTextureDestroyed();
    }

    public interface TXVideoGenerateListener {
        void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onGenerateProgress(float f10);
    }

    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i10);
    }

    public interface TXVideoPreviewListenerEx extends TXVideoPreviewListener {
        void onPreviewError(TXVideoEditConstants.TXPreviewError tXPreviewError);
    }

    public interface TXVideoProcessListener {
        void onProcessComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProcessProgress(float f10);
    }

    public TXVideoEditer(Context context) {
        this(context, new com.tencent.liteav.base.util.m());
        LiteavLog.i(TAG, "version:" + CommonUtil.getSDKVersionStr());
    }

    protected TXVideoEditer(Context context, com.tencent.liteav.base.util.m mVar) {
        this.mPendingPreviewAtTime = new AtomicReference<>();
        UGCAVSyncer uGCAVSyncer = new UGCAVSyncer();
        this.mAVSyncer = uGCAVSyncer;
        this.mTargetSeekPts = new AtomicReference<>();
        this.mIsRelease = new AtomicBoolean(false);
        this.mAllThumbnailGeneratorList = new ArrayList<>();
        this.mHasNotifyProcessComplete = new AtomicBoolean(false);
        this.mPreviewSyncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
        this.mIsGenerating = false;
        this.mIsPlaying = false;
        this.mIsProcessToFullKeyFrame = false;
        this.mHasBGM = false;
        this.mNeedWaitProcessFullI = false;
        this.mNeedWaitThumbnailProcess = false;
        this.mLastVideoEncodeProgress = 0.0f;
        this.mMp4WriterListener = new MP4Writer.MP4WriterListener() { // from class: com.tencent.ugc.TXVideoEditer.1
            @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
            public final void onComplete(long j10) {
                LiteavLog.i(TXVideoEditer.TAG, "onComplete ".concat(String.valueOf(j10)));
                TXVideoEditer.this.handleWriteMP4Completed(0, j10);
            }

            @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
            public final void onError(String str) {
                LiteavLog.e(TXVideoEditer.TAG, "mp4 writer is error. info is ".concat(String.valueOf(str)));
                TXVideoEditer.this.handleWriteMP4Completed(-1, 0L);
            }
        };
        this.mMainHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsGenerateVideoEnd = false;
        this.mIsGenerateAudioEnd = false;
        this.mVideoEncodeBitrate = -1;
        this.mVideoFrameRateLevel = TXVideoEditConstants.VideoFrameRateLevel.VIDEO_FPS_ORIGIN;
        this.mAudioEncodeBitrate = -1;
        this.mEncodeProfile = -1;
        this.mSourceRangeStartTimeMs = 0L;
        this.mSourceRangeEndTimeMs = 2147483647L;
        this.mCutStartTimeMs = 0L;
        this.mCutEndTimeMs = 2147483647L;
        this.mIsReverse = false;
        this.mIsFullIFrame = false;
        this.mRotation = com.tencent.liteav.base.util.l.NORMAL;
        this.mIsVideoEncoderStarted = false;
        this.mIsAudioEncoderStarted = false;
        this.mVideoEncodedFrameListener = new AnonymousClass2();
        this.mAudioEncodedFrameListener = new AnonymousClass3();
        this.mOnPlayProgressListener = new AnonymousClass4();
        this.mRunnableOnPlayComplete = c.a(this);
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCMediaListSource uGCMediaListSource = new UGCMediaListSource();
        this.mMediaListSource = uGCMediaListSource;
        this.mVideoProcessor = new UGCVideoProcessor(applicationContext, uGCMediaListSource, uGCAVSyncer, true);
        this.mAudioProcessor = new UGCAudioProcessor(uGCAVSyncer, uGCMediaListSource);
        this.mSequenceTaskRunner = mVar;
        mVar.a(n.a(this));
        UGCDataReport.reportLicenseIsValid();
    }

    private float calculateProgress(long j10) {
        long duration = this.mMediaListSource.getDuration();
        if (duration == 0) {
            duration = 1;
        }
        return (j10 * 1.0f) / duration;
    }

    private void cancelAllThumbnailGenerator() {
        if (this.mAllThumbnailGeneratorList.size() <= 0) {
            return;
        }
        for (UGCThumbnailGenerator uGCThumbnailGenerator : this.mAllThumbnailGeneratorList) {
            uGCThumbnailGenerator.stop();
            uGCThumbnailGenerator.uninitialize();
        }
        this.mAllThumbnailGeneratorList.clear();
    }

    private static boolean checkIsVideoType(String str) {
        String fileExtension = CommonUtil.getFileExtension(str);
        return !TextUtils.isEmpty(fileExtension) && sVideoExtHashSet.contains(fileExtension.toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doGetThumbnail(List<Long> list, int i10, int i11, boolean z10, TXThumbnailListener tXThumbnailListener) {
        LiteavLog.i(TAG, "getThumbnail: width= " + i10 + " height= " + i11 + ",fast= " + z10 + ",list.size= " + list.size());
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = new UGCThumbnailGenerator.UGCThumbnailGenerateParams();
        uGCThumbnailGenerateParams.thumbnailPtsList = list;
        uGCThumbnailGenerateParams.width = i10;
        uGCThumbnailGenerateParams.height = i11;
        uGCThumbnailGenerateParams.fast = z10;
        UGCThumbnailGenerator uGCThumbnailGenerator = new UGCThumbnailGenerator();
        uGCThumbnailGenerator.initialize();
        uGCThumbnailGenerator.setVideoSourceList(Collections.singletonList(this.mSourcePath));
        uGCThumbnailGenerator.start(uGCThumbnailGenerateParams, new AnonymousClass5(tXThumbnailListener, list, uGCThumbnailGenerator));
        this.mAllThumbnailGeneratorList.add(uGCThumbnailGenerator);
    }

    private void doStopPlayInner() {
        LiteavLog.i(TAG, "doStopPlayInner");
        this.mVideoProcessor.setProgressListener(null);
        this.mAudioProcessor.setProgressListener(null);
        this.mAVSyncer.stop();
        this.mVideoProcessor.stop();
        this.mAudioProcessor.stop();
        this.mIsPlaying = false;
    }

    private boolean filtInvalidatedFrame(long j10) {
        return this.mTargetSeekPts.get() != null && Math.abs(j10 - this.mTargetSeekPts.get().longValue()) > 100;
    }

    private String generateVideoPath() {
        File externalFilesDir = this.mContext.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            LiteavLog.e(TAG, "generateVideoPath getExternalFilesDir return null.");
            return null;
        }
        File file = new File(externalFilesDir + File.separator + "liteav");
        if (!file.exists()) {
            file.mkdirs();
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        return file + "/" + String.format("TXVideo_%s_process.mp4", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date(Long.parseLong(strValueOf + "000"))));
    }

    private void getAllMediaFormatFromSource(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(it.next()).build();
            if (mediaExtractorBuild != null) {
                int trackCount = mediaExtractorBuild.getTrackCount();
                for (int i10 = 0; i10 < trackCount; i10++) {
                    MediaFormat trackFormat = mediaExtractorBuild.getTrackFormat(i10);
                    String string = trackFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
                    if (string != null) {
                        if (string.startsWith("video/")) {
                            this.mVideoFormatList.add(trackFormat);
                        }
                        if (string.startsWith("audio/")) {
                            this.mAudioFormatList.add(trackFormat);
                        }
                    }
                }
            } else {
                LiteavLog.e(TAG, "build extractor fail.");
            }
        }
    }

    private void handleEncodedCompletedInner() {
        if (this.mIsGenerateAudioEnd && this.mIsGenerateVideoEnd) {
            LiteavLog.i(TAG, "handleEncodedCompleted");
            this.mAVSyncer.stop();
            stopMp4Writer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessComplete(int i10) {
        TXVideoProcessListener tXVideoProcessListener;
        if (this.mHasNotifyProcessComplete.getAndSet(true) || (tXVideoProcessListener = this.mVideoProcessListener) == null) {
            return;
        }
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = i10;
        tXGenerateResult.descMsg = "";
        tXVideoProcessListener.onProcessComplete(tXGenerateResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleThumbnailGeneratedDuringProcessing(UGCThumbnailGenerator uGCThumbnailGenerator, boolean z10, int i10, long j10, Bitmap bitmap) {
        TXVideoProcessListener tXVideoProcessListener;
        TXThumbnailListener tXThumbnailListener = this.mProcessThumbnailListener;
        if (tXThumbnailListener != null) {
            tXThumbnailListener.onThumbnail(i10, j10, bitmap);
        }
        int thumbnailCount = getThumbnailCount();
        if (thumbnailCount == i10) {
            LiteavLog.i(TAG, "mInnerThumbnailListener: notifyProcessComplete");
            if (z10) {
                this.mProcessOutputPath = this.mSourcePath;
            }
            notifyProcessComplete(0, true);
            releaseThumbnailGenerator(uGCThumbnailGenerator);
        }
        if (!z10 || (tXVideoProcessListener = this.mVideoProcessListener) == null) {
            return;
        }
        this.mMainHandler.post(al.a(this, thumbnailCount, j10, i10, tXVideoProcessListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteMP4Completed(int i10, long j10) {
        this.mSequenceTaskRunner.a(bl.a(this, i10, j10));
    }

    private int isBGMValid(String str) {
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever(false);
        return (fFmpegMediaRetriever.setDataSource(str) != 0 || fFmpegMediaRetriever.getAudioDurationMs() <= 0) ? -1001 : 0;
    }

    private boolean isFullIFrame(String str) {
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("video/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.w("ContentValues", "judgeFullIFrame: extractor is null.");
            return false;
        }
        mediaExtractorBuild.seekTo(0L, 0);
        int i10 = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            if ((mediaExtractorBuild.getSampleFlags() & 1) == 1) {
                i10++;
            }
            mediaExtractorBuild.advance();
        }
        return i10 > 5;
    }

    private boolean isGopEqualOne(String str) {
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("video/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.w(TAG, "extractor is null.");
            return false;
        }
        mediaExtractorBuild.seekTo(1L, 1);
        long sampleTime = mediaExtractorBuild.getSampleTime();
        mediaExtractorBuild.release();
        return sampleTime > 100000 && sampleTime < 1100000;
    }

    protected static int isMediaSourceValid(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e(TAG, "checkLegality: path is null.");
            return TXVideoEditConstants.ERR_SOURCE_NO_FOUND;
        }
        if (MediaExtractorBuilder.isContentUri(str)) {
            return 0;
        }
        if (!new File(str).exists()) {
            LiteavLog.e(TAG, "checkLegality:source no found!");
            return TXVideoEditConstants.ERR_SOURCE_NO_FOUND;
        }
        if (checkIsVideoType(str)) {
            return 0;
        }
        LiteavLog.e(TAG, "checkLegality:source type error!");
        return TXVideoEditConstants.ERR_SOURCE_DAMAGED;
    }

    static /* synthetic */ void lambda$cancel$55(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "cancel");
        tXVideoEditer.mIsGenerating = false;
        tXVideoEditer.mIsVideoEncoderStarted = false;
        tXVideoEditer.mIsAudioEncoderStarted = false;
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mVideoProcessor.setVideoEncodedFrameListener(null);
        tXVideoEditer.mAudioProcessor.setAudioEncodedFrameListener(null);
        tXVideoEditer.mMediaListSource.setVideoSourceRange(0L, 2147483647L);
        tXVideoEditer.mMediaListSource.setTailWaterMarkDurationSecond(0);
        tXVideoEditer.cancelAllThumbnailGenerator();
        if (!tXVideoEditer.mIsPlaying) {
            tXVideoEditer.mAudioProcessor.stop();
            tXVideoEditer.mVideoProcessor.stop();
        }
        MP4Writer mP4Writer = tXVideoEditer.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.setListener(null);
        }
        tXVideoEditer.stopMp4Writer();
    }

    static /* synthetic */ void lambda$deleteAllEffect$30(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "deleteAllEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().deleteAllEffect();
    }

    static /* synthetic */ void lambda$deleteLastEffect$29(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "deleteLastEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().deleteLastEffect();
    }

    static /* synthetic */ void lambda$deleteLastTransitionEffect$26(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "deleteLastTransitionEffect");
        tXVideoEditer.mVideoProcessor.getTransitionProcessor().deleteLastTransitionEffect();
    }

    static /* synthetic */ void lambda$generateVideo$54(TXVideoEditer tXVideoEditer, int i10, String str) {
        LiteavLog.i(TAG, "generateVideo: videoCompressed= " + i10 + ", videoOutputPath= " + str);
        if (!UGCLicenseChecker.isSimpleFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = -5;
            tXGenerateResult.descMsg = "licence verify failed";
            TXVideoGenerateListener tXVideoGenerateListener = tXVideoEditer.mVideoGenerateListener;
            if (tXVideoGenerateListener != null) {
                tXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
                return;
            }
            return;
        }
        UGCTranscodeVideoEncodeParamsDecider uGCTranscodeVideoEncodeParamsDecider = new UGCTranscodeVideoEncodeParamsDecider();
        uGCTranscodeVideoEncodeParamsDecider.setFullIFrame(tXVideoEditer.mIsFullIFrame);
        uGCTranscodeVideoEncodeParamsDecider.setOutputResolution(i10);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeRotation(tXVideoEditer.mRotation);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeProfile(tXVideoEditer.mEncodeProfile);
        uGCTranscodeVideoEncodeParamsDecider.setInputCanvasSize(tXVideoEditer.mCanvasSize);
        uGCTranscodeVideoEncodeParamsDecider.setInputVideoMediaFormat(tXVideoEditer.mVideoFormatList);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeFramerate(tXVideoEditer.mVideoFrameRateLevel);
        UGCTranscodeAudioEncodeParamsDecider uGCTranscodeAudioEncodeParamsDecider = new UGCTranscodeAudioEncodeParamsDecider();
        uGCTranscodeAudioEncodeParamsDecider.setInputAudioMediaFormat(tXVideoEditer.mAudioFormatList);
        uGCTranscodeAudioEncodeParamsDecider.setBGMMediaFormat(tXVideoEditer.mBGMFormat);
        int i11 = tXVideoEditer.mVideoEncodeBitrate;
        if (i11 != -1) {
            uGCTranscodeVideoEncodeParamsDecider.setEncodeBitrate(i11);
        }
        int i12 = tXVideoEditer.mAudioEncodeBitrate;
        if (i12 != -1) {
            uGCTranscodeAudioEncodeParamsDecider.setEncodeBitrate(i12);
        }
        tXVideoEditer.mVideoEncodeParams = uGCTranscodeVideoEncodeParamsDecider.getDecidedEncodeParams();
        if (uGCTranscodeVideoEncodeParamsDecider.isNeedFilterFrame()) {
            tXVideoEditer.mVideoProcessor.setFilteredFrameRate(tXVideoEditer.mVideoEncodeParams.fps);
        }
        tXVideoEditer.mAudioEncodeParams = uGCTranscodeAudioEncodeParamsDecider.getDecidedEncodeParams();
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mRecordOutputPath = str;
        tXVideoEditer.mLastVideoEncodeProgress = 0.0f;
        tXVideoEditer.startProcessVideo(UGCVideoEncoderJNI.EncoderType.HARDWARE);
    }

    static /* synthetic */ void lambda$getThumbnail$33(TXVideoEditer tXVideoEditer, int i10, int i11, boolean z10, int i12, TXThumbnailListener tXThumbnailListener) {
        LiteavLog.i(TAG, "getThumbnail: width= " + i10 + " height= " + i11 + ",fast= " + z10 + ",count= " + i12);
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(tXVideoEditer.mSourcePath);
        List<Long> listCalculateThumbnailList = UGCThumbnailGenerator.calculateThumbnailList(i12, 0L, fFmpegMediaRetriever.getVideoDurationMs(), fFmpegMediaRetriever.getVideoDurationMs());
        if (listCalculateThumbnailList != null) {
            tXVideoEditer.doGetThumbnail(listCalculateThumbnailList, i10, i11, z10, tXThumbnailListener);
        }
    }

    static /* synthetic */ void lambda$handleWriteMP4Completed$64(TXVideoEditer tXVideoEditer, int i10, long j10) {
        LiteavLog.i(TAG, "handleWriteMP4Completed: mIsProcessToFullKeyFrame=" + tXVideoEditer.mIsProcessToFullKeyFrame + ",resultCode=" + i10 + ",mIsGenerating= " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            tXVideoEditer.mAVSyncer.stop();
            tXVideoEditer.mVideoProcessor.stop();
            tXVideoEditer.mAudioProcessor.stop();
            tXVideoEditer.stopMp4Writer();
            tXVideoEditer.mIsGenerating = false;
            tXVideoEditer.mIsVideoEncoderStarted = false;
            tXVideoEditer.mIsAudioEncoderStarted = false;
            if (!tXVideoEditer.mIsProcessToFullKeyFrame) {
                tXVideoEditer.notifyGenerateComplete(i10, j10);
                return;
            }
            if (com.tencent.liteav.base.util.f.a(tXVideoEditer.mProcessOutputPath) && i10 == 0) {
                com.tencent.liteav.base.util.l lVar = tXVideoEditer.mRotation;
                com.tencent.liteav.base.util.l lVar2 = com.tencent.liteav.base.util.l.NORMAL;
                if (lVar != lVar2) {
                    tXVideoEditer.mRotation = lVar2;
                    tXVideoEditer.mVideoProcessor.setRenderRotation(lVar2);
                }
                tXVideoEditer.setMediaSourcePathsInternal(Collections.singletonList(tXVideoEditer.mProcessOutputPath));
            }
            tXVideoEditer.notifyProcessComplete(i10, false);
        }
    }

    static /* synthetic */ void lambda$initWithPreview$43(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        FrameLayout frameLayout = tXVideoEditer.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        TextureView textureView = new TextureView(tXVideoEditer.mContext);
        FrameLayout frameLayout2 = tXPreviewParam.videoView;
        tXVideoEditer.mFrameLayout = frameLayout2;
        if (frameLayout2 != null) {
            frameLayout2.addView(textureView);
        }
        tXVideoEditer.mSequenceTaskRunner.a(bu.a(tXVideoEditer, tXPreviewParam, new DisplayTarget(textureView)));
    }

    static /* synthetic */ void lambda$new$0(TXVideoEditer tXVideoEditer) {
        UGCInitializer.initialize();
        tXVideoEditer.mVideoProcessor.initialize();
        tXVideoEditer.mAudioProcessor.initialize();
        tXVideoEditer.mMediaListSource.initialize();
        UGCDataReport.reportDAU(1004);
    }

    static /* synthetic */ void lambda$notifyGenerateComplete$70(int i10, TXVideoGenerateListener tXVideoGenerateListener) {
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = i10;
        tXGenerateResult.descMsg = "";
        tXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
    }

    static /* synthetic */ void lambda$notifyPreviewProgress$65(TXVideoEditer tXVideoEditer, int i10, TXVideoPreviewListener tXVideoPreviewListener) {
        if (tXVideoEditer.filtInvalidatedFrame(i10 / 1000)) {
            return;
        }
        tXVideoPreviewListener.onPreviewProgress(i10);
        tXVideoEditer.mTargetSeekPts.set(null);
    }

    static /* synthetic */ void lambda$null$42(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        if (tXPreviewParam.renderMode == 2) {
            gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
        }
        tXVideoEditer.mVideoProcessor.setDisplayView(displayTarget, gLScaleType);
    }

    static /* synthetic */ void lambda$pausePlay$45(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "pausePlay " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mAVSyncer.stop();
        tXVideoEditer.mVideoProcessor.stop();
        tXVideoEditer.mAudioProcessor.stop();
    }

    static /* synthetic */ void lambda$previewAtTime$48(TXVideoEditer tXVideoEditer) {
        Long andSet = tXVideoEditer.mPendingPreviewAtTime.getAndSet(null);
        if (andSet == null) {
            return;
        }
        LiteavLog.i(TAG, "previewAtTime time = ".concat(String.valueOf(andSet)));
        tXVideoEditer.mMediaListSource.seekTo(andSet.longValue());
        tXVideoEditer.mVideoProcessor.seekTo(andSet.longValue());
        tXVideoEditer.mSequenceTaskRunner.c(tXVideoEditer.mRunnableOnPlayComplete);
        tXVideoEditer.mAVSyncer.resetClock();
    }

    static /* synthetic */ void lambda$processVideoInternal$36(TXVideoProcessListener tXVideoProcessListener) {
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = -5;
        tXGenerateResult.descMsg = "licence verify failed";
        if (tXVideoProcessListener != null) {
            tXVideoProcessListener.onProcessComplete(tXGenerateResult);
        }
    }

    static /* synthetic */ void lambda$release$40(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "release");
        tXVideoEditer.mIsRelease.set(true);
        tXVideoEditer.cancelAllThumbnailGenerator();
        tXVideoEditer.mVideoProcessor.unInitialize();
        tXVideoEditer.mAudioProcessor.unInitialize();
        tXVideoEditer.mAudioProcessor.destroy();
        tXVideoEditer.mMediaListSource.uninitialize();
        tXVideoEditer.stopMp4Writer();
        UGCInitializer.uninitialize();
    }

    static /* synthetic */ void lambda$resumePlay$46(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "resumePlay " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mAVSyncer.start();
        tXVideoEditer.mVideoProcessor.start(false, UGCVideoEncoderJNI.EncoderType.HARDWARE);
        tXVideoEditer.mAudioProcessor.start(false);
    }

    static /* synthetic */ void lambda$setAnimatedPasterList$19(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.i(TAG, "setAnimatedPasterList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setAnimatedPasterList(list);
    }

    static /* synthetic */ void lambda$setAudioBitrate$53(TXVideoEditer tXVideoEditer, int i10) {
        LiteavLog.i(TAG, "setAudioBitrate: bitrate= ".concat(String.valueOf(i10)));
        tXVideoEditer.mAudioEncodeBitrate = i10;
    }

    static /* synthetic */ void lambda$setBGM$10(TXVideoEditer tXVideoEditer, String str, boolean z10) {
        tXVideoEditer.mAudioProcessor.setBGM(str);
        tXVideoEditer.doStopPlayInner();
        if (z10) {
            tXVideoEditer.mBGMFormat = null;
            tXVideoEditer.mHasBGM = false;
            if (CollectionUtils.isEmpty(tXVideoEditer.mAudioFormatList)) {
                tXVideoEditer.mAVSyncer.setAudioExist(false);
                UGCAVSyncer.SyncMode syncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
                tXVideoEditer.mPreviewSyncMode = syncMode;
                tXVideoEditer.mAVSyncer.setSyncMode(syncMode);
                return;
            }
            return;
        }
        tXVideoEditer.mHasBGM = true;
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("audio/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.w(TAG, "setBGM: build extractor fail.");
            return;
        }
        tXVideoEditer.mBGMFormat = mediaExtractorBuild.getTrackFormat(mediaExtractorBuild.getSampleTrackIndex());
        tXVideoEditer.mAVSyncer.setAudioExist(true);
        UGCAVSyncer.SyncMode syncMode2 = UGCAVSyncer.SyncMode.AUDIO_MASTER;
        tXVideoEditer.mPreviewSyncMode = syncMode2;
        tXVideoEditer.mAVSyncer.setSyncMode(syncMode2);
    }

    static /* synthetic */ void lambda$setBGMAtVideoTime$12(TXVideoEditer tXVideoEditer, long j10) {
        LiteavLog.i(TAG, "setBGMAtVideoTime: videoStartTime= ".concat(String.valueOf(j10)));
        tXVideoEditer.mAudioProcessor.setBGMAtVideoTime(j10);
    }

    static /* synthetic */ void lambda$setBGMFadeInOutDuration$15(TXVideoEditer tXVideoEditer, long j10, long j11) {
        LiteavLog.i(TAG, "setBGMFadeInOutDuration: fadeInDuration= " + j10 + ",fadeOutDuration= " + j11);
        tXVideoEditer.mAudioProcessor.setFadeInOutDuration(j10, j11);
    }

    static /* synthetic */ void lambda$setBGMLoop$11(TXVideoEditer tXVideoEditer, boolean z10) {
        LiteavLog.i(TAG, "setBGMLoop: looping= ".concat(String.valueOf(z10)));
        tXVideoEditer.mAudioProcessor.setBGMLoop(z10);
    }

    static /* synthetic */ void lambda$setBGMStartTime$13(TXVideoEditer tXVideoEditer, long j10, long j11) {
        LiteavLog.i(TAG, "setBGMStartTime: startTime= " + j10 + ", endTime= " + j11);
        tXVideoEditer.mAudioProcessor.setBGMStartTime(j10, j11);
    }

    static /* synthetic */ void lambda$setBGMVolume$14(TXVideoEditer tXVideoEditer, float f10) {
        LiteavLog.i(TAG, "setBGMVolume: ".concat(String.valueOf(f10)));
        tXVideoEditer.mAudioProcessor.setBGMVolume(f10);
    }

    static /* synthetic */ void lambda$setBeautyFilter$7(TXVideoEditer tXVideoEditer, int i10, int i11) {
        LiteavLog.i(TAG, "setBeautyFilter: beautyLevel= " + i10 + ",whiteningLevel= " + i11);
        tXVideoEditer.mVideoProcessor.setBeautyFilter(i10, i11);
    }

    static /* synthetic */ void lambda$setCustomVideoProcessListener$2(TXVideoEditer tXVideoEditer, TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        LiteavLog.i(TAG, "setCustomVideoProcessListener: ".concat(String.valueOf(tXVideoCustomProcessListener)));
        tXVideoEditer.mVideoProcessor.setCustomVideoProcessListener(tXVideoCustomProcessListener);
    }

    static /* synthetic */ void lambda$setCutFromTime$50(TXVideoEditer tXVideoEditer, long j10, long j11) {
        LiteavLog.i(TAG, "setCutFromTime: startTime= " + j10 + ",endTime= " + j11);
        tXVideoEditer.mCutStartTimeMs = j10;
        tXVideoEditer.mCutEndTimeMs = j11;
    }

    static /* synthetic */ void lambda$setFilter$5(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        float leftSpecialRatio;
        float rightSpecialRatio;
        LiteavLog.i(TAG, "setFilter: ".concat(String.valueOf(bitmap)));
        CombineFilterInfo combineFilterInfo = tXVideoEditer.mCombineFilterInfo;
        if (combineFilterInfo != null) {
            leftSpecialRatio = combineFilterInfo.getLeftSpecialRatio();
            rightSpecialRatio = tXVideoEditer.mCombineFilterInfo.getRightSpecialRatio();
        } else {
            leftSpecialRatio = 0.5f;
            rightSpecialRatio = 0.0f;
        }
        tXVideoEditer.setFilter(bitmap, leftSpecialRatio, null, rightSpecialRatio, 1.0f);
    }

    static /* synthetic */ void lambda$setFilter$6(TXVideoEditer tXVideoEditer, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        LiteavLog.i(TAG, "setFilter: leftIntensity= " + f10 + ",rightIntensity= " + f11 + ",leftRatio= " + f12);
        tXVideoEditer.mVideoProcessor.setFilter(bitmap, f10, bitmap2, f11, f12);
    }

    static /* synthetic */ void lambda$setIsSplitScreen$56(TXVideoEditer tXVideoEditer, boolean z10) {
        tXVideoEditer.mMediaListSource.setIsSplitScreenMode(z10);
        if (z10) {
            return;
        }
        tXVideoEditer.mVideoProcessor.setSplitScreenList(null, -1, -1);
        tXVideoEditer.mCanvasSize = null;
    }

    static /* synthetic */ void lambda$setPasterList$20(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.i(TAG, "setPasterList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setPasterList(list);
    }

    static /* synthetic */ void lambda$setPictureList$8(TXVideoEditer tXVideoEditer, int i10, List list) {
        LiteavLog.i(TAG, "setPictureList: fps= " + i10 + ",bitmapList.size= " + list.size());
        tXVideoEditer.mMediaListSource.setPictureList(list, i10);
        tXVideoEditer.mCanvasSize = new Size(720, 1280);
    }

    static /* synthetic */ void lambda$setPictureTransition$9(TXVideoEditer tXVideoEditer, int i10) {
        LiteavLog.i(TAG, "setPictureTransition: ".concat(String.valueOf(i10)));
        tXVideoEditer.mMediaListSource.setPictureTransition(i10);
        tXVideoEditer.mVideoProcessor.setPictureTransition(i10);
    }

    static /* synthetic */ void lambda$setProfile$3(TXVideoEditer tXVideoEditer, int i10) {
        LiteavLog.i(TAG, "setProfile: ".concat(String.valueOf(i10)));
        tXVideoEditer.mEncodeProfile = i10;
    }

    static /* synthetic */ void lambda$setRenderRotation$21(TXVideoEditer tXVideoEditer, int i10) {
        LiteavLog.i(TAG, "setRenderRotation: rotation= ".concat(String.valueOf(i10)));
        com.tencent.liteav.base.util.l lVarA = com.tencent.liteav.base.util.l.a(i10);
        tXVideoEditer.mRotation = lVarA;
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mVideoProcessor.setRenderRotation(lVarA);
    }

    static /* synthetic */ void lambda$setRepeatPlay$23(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.i(TAG, "setRepeatPlay");
        tXVideoEditer.mMediaListSource.setRepeatPlay(list);
    }

    static /* synthetic */ void lambda$setReverse$24(TXVideoEditer tXVideoEditer, boolean z10) {
        LiteavLog.i(TAG, "setReverse: isReverse= ".concat(String.valueOf(z10)));
        tXVideoEditer.mIsReverse = z10;
        tXVideoEditer.mMediaListSource.setReverse(z10);
        tXVideoEditer.mVideoProcessor.setReverse(z10);
        tXVideoEditer.mVideoProcessor.getEffectProcessor().setReverse(z10, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.mVideoProcessor.getTransitionProcessor().setReverse(z10, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setReverse(z10, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.doStopPlayInner();
    }

    static /* synthetic */ void lambda$setSpecialRatio$4(TXVideoEditer tXVideoEditer, float f10) {
        LiteavLog.i(TAG, "setSpecialRatio: ".concat(String.valueOf(f10)));
        if (tXVideoEditer.mCombineFilterInfo == null) {
            tXVideoEditer.mCombineFilterInfo = new CombineFilterInfo();
        }
        tXVideoEditer.mCombineFilterInfo.setLeftSpecialRatio(f10);
        tXVideoEditer.mCombineFilterInfo.setRightSpecialRatio(0.0f);
        tXVideoEditer.mVideoProcessor.setSpecialRatio(f10);
    }

    static /* synthetic */ void lambda$setSpeedList$22(TXVideoEditer tXVideoEditer, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TXVideoEditConstants.TXSpeed tXSpeed = (TXVideoEditConstants.TXSpeed) it.next();
                LiteavLog.i(TAG, "setSpeedList " + tXSpeed.startTime + " " + tXSpeed.endTime + " speed: " + tXSpeed.speedLevel);
            }
        }
        tXVideoEditer.mVideoProcessor.setSpeedList(list);
        tXVideoEditer.mAudioProcessor.setSpeedList(list);
        tXVideoEditer.mMediaListSource.setSpeedList(list);
    }

    static /* synthetic */ void lambda$setSplitScreenList$58(TXVideoEditer tXVideoEditer, List list, int i10, int i11) {
        tXVideoEditer.mVideoProcessor.setSplitScreenList(list, i10, i11);
        tXVideoEditer.mCanvasSize = new Size(i10, i11);
    }

    static /* synthetic */ void lambda$setSubtitleList$18(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.i(TAG, "setSubtitleList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setSubtitleList(list);
    }

    static /* synthetic */ void lambda$setTXVideoPreviewListener$41(TXVideoEditer tXVideoEditer, TXVideoPreviewListener tXVideoPreviewListener) {
        LiteavLog.i(TAG, "setTXVideoPreviewListener: listener= ".concat(String.valueOf(tXVideoPreviewListener)));
        tXVideoEditer.mVideoPreviewListener = tXVideoPreviewListener;
    }

    static /* synthetic */ void lambda$setTailWaterMark$17(TXVideoEditer tXVideoEditer, int i10, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        LiteavLog.i(TAG, "setTailWaterMark: duration= ".concat(String.valueOf(i10)));
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setTailWaterMark(bitmap, tXRect, tXVideoEditer.mMediaListSource.getDuration(), i10);
        tXVideoEditer.mMediaListSource.setTailWaterMarkDurationSecond(i10);
    }

    static /* synthetic */ void lambda$setThumbnail$34(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        LiteavLog.i(TAG, "setThumbnail: thumbnail.count= " + tXThumbnail.count + " ,thumbnail.width= " + tXThumbnail.width + " ,thumbnail.height= " + tXThumbnail.height);
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = new UGCThumbnailGenerator.UGCThumbnailGenerateParams();
        tXVideoEditer.mProcessThumbnailInfo = uGCThumbnailGenerateParams;
        uGCThumbnailGenerateParams.thumbnailCount = tXThumbnail.count;
        uGCThumbnailGenerateParams.width = tXThumbnail.width;
        uGCThumbnailGenerateParams.height = tXThumbnail.height;
        uGCThumbnailGenerateParams.fast = false;
    }

    static /* synthetic */ void lambda$setThumbnailListener$35(TXVideoEditer tXVideoEditer, TXThumbnailListener tXThumbnailListener) {
        LiteavLog.i(TAG, "setThumbnailListener: listener= ".concat(String.valueOf(tXThumbnailListener)));
        tXVideoEditer.mProcessThumbnailListener = tXThumbnailListener;
    }

    static /* synthetic */ void lambda$setTransitionEffect$25(TXVideoEditer tXVideoEditer, int i10, long j10, long j11, AtomicBoolean atomicBoolean) {
        LiteavLog.i(TAG, "setTransitionEffect: type=" + i10 + " ,startTimeMs= " + j10 + " ,transitionDurationMs= " + j11);
        atomicBoolean.set(tXVideoEditer.mVideoProcessor.getTransitionProcessor().setTransitionEffect(i10, tXVideoEditer.mMediaListSource.getDuration(), j10, j11));
    }

    static /* synthetic */ void lambda$setVideoBitrate$51(TXVideoEditer tXVideoEditer, int i10) {
        LiteavLog.i(TAG, "setVideoBitrate: bitrate= ".concat(String.valueOf(i10)));
        tXVideoEditer.mVideoEncodeBitrate = i10;
    }

    static /* synthetic */ void lambda$setVideoFrameRate$52(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        LiteavLog.i(TAG, "set video frame rate: ".concat(String.valueOf(videoFrameRateLevel)));
        tXVideoEditer.mVideoFrameRateLevel = videoFrameRateLevel;
    }

    static /* synthetic */ void lambda$setVideoGenerateListener$49(TXVideoEditer tXVideoEditer, TXVideoGenerateListener tXVideoGenerateListener) {
        LiteavLog.i(TAG, "setVideoGenerateListener: listener= ".concat(String.valueOf(tXVideoGenerateListener)));
        tXVideoEditer.mVideoGenerateListener = tXVideoGenerateListener;
    }

    static /* synthetic */ void lambda$setVideoProcessListener$31(TXVideoEditer tXVideoEditer, TXVideoProcessListener tXVideoProcessListener) {
        LiteavLog.i(TAG, "setVideoProcessListener: listener= ".concat(String.valueOf(tXVideoProcessListener)));
        tXVideoEditer.mVideoProcessListener = tXVideoProcessListener;
    }

    static /* synthetic */ void lambda$setVideoVolume$63(TXVideoEditer tXVideoEditer, float f10) {
        LiteavLog.i(TAG, "setVideoVolume: volume= ".concat(String.valueOf(f10)));
        tXVideoEditer.mAudioProcessor.setVideoVolume(f10);
    }

    static /* synthetic */ void lambda$setWaterMark$16(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        LiteavLog.i(TAG, "setWaterMark: " + tXRect.toString());
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setWaterMark(bitmap, tXRect);
    }

    static /* synthetic */ void lambda$startEffect$27(TXVideoEditer tXVideoEditer, int i10, long j10) {
        LiteavLog.i(TAG, "startEffect: type=" + i10 + ",startTime= " + j10);
        tXVideoEditer.mVideoProcessor.getEffectProcessor().startEffect(i10, j10);
    }

    static /* synthetic */ void lambda$startPlayFromTime$44(TXVideoEditer tXVideoEditer, long j10, long j11) {
        LiteavLog.i(TAG, "startPlayFromTime: startTime= " + j10 + ", endTime= " + j11);
        tXVideoEditer.doStopPlayInner();
        Size size = tXVideoEditer.mCanvasSize;
        if (size == null) {
            tXVideoEditer.mVideoProcessor.setOutputSize(-1, -1, GLConstants.GLScaleType.FIT_CENTER);
        } else {
            tXVideoEditer.mVideoProcessor.setOutputSize(size.width, size.height, GLConstants.GLScaleType.FIT_CENTER);
        }
        tXVideoEditer.mAVSyncer.setSyncMode(tXVideoEditer.mPreviewSyncMode);
        tXVideoEditer.mAVSyncer.start();
        if (tXVideoEditer.mSourceRangeStartTimeMs != 0 || ((j11 != tXVideoEditer.mSourceRangeEndTimeMs && j11 >= 0) || tXVideoEditer.mIsReverse)) {
            tXVideoEditer.mSourceRangeStartTimeMs = 0L;
            tXVideoEditer.mSourceRangeEndTimeMs = j11;
            if (tXVideoEditer.mIsReverse) {
                tXVideoEditer.mSourceRangeStartTimeMs = j10;
            }
        }
        if (tXVideoEditer.mIsReverse) {
            tXVideoEditer.mMediaListSource.seekTo(j11);
            tXVideoEditer.mMediaListSource.setPlayEndTime(Long.MAX_VALUE);
        } else {
            tXVideoEditer.mMediaListSource.seekTo(j10);
            tXVideoEditer.mMediaListSource.setPlayEndTime(j11);
        }
        tXVideoEditer.mVideoProcessor.setProgressListener(tXVideoEditer.mOnPlayProgressListener);
        tXVideoEditer.mVideoProcessor.setRenderRotation(tXVideoEditer.mRotation);
        tXVideoEditer.mVideoProcessor.start(false, UGCVideoEncoderJNI.EncoderType.HARDWARE);
        tXVideoEditer.mAudioProcessor.start(false);
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mIsGenerating = false;
        tXVideoEditer.mIsVideoEncoderStarted = false;
        tXVideoEditer.mIsAudioEncoderStarted = false;
        tXVideoEditer.mIsPlaying = true;
        tXVideoEditer.mTargetSeekPts.set(null);
    }

    static /* synthetic */ void lambda$stopEffect$28(TXVideoEditer tXVideoEditer, int i10, long j10) {
        LiteavLog.i(TAG, "stopEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().stopEffect(i10, j10);
    }

    static /* synthetic */ void lambda$stopPlay$47(TXVideoEditer tXVideoEditer) {
        LiteavLog.i(TAG, "stopPlay");
        tXVideoEditer.doStopPlayInner();
    }

    private void notifyGenerateComplete(int i10, long j10) {
        TXVideoGenerateListener tXVideoGenerateListener = this.mVideoGenerateListener;
        if (!TextUtils.isEmpty(this.mProcessOutputPath) && new File(this.mProcessOutputPath).exists()) {
            UGCDataReport.reportDAU(1032, (int) new File(this.mProcessOutputPath).length(), "");
            UGCDataReport.reportDAU(1033, (int) j10, "");
        }
        if (tXVideoGenerateListener != null) {
            this.mMainHandler.post(bt.a(i10, tXVideoGenerateListener));
        }
    }

    private void notifyGenerateProgress(float f10) {
        TXVideoGenerateListener tXVideoGenerateListener = this.mVideoGenerateListener;
        if (tXVideoGenerateListener != null) {
            this.mMainHandler.post(bs.a(tXVideoGenerateListener, f10));
        }
    }

    private void notifyPreviewFinished() {
        TXVideoPreviewListener tXVideoPreviewListener = this.mVideoPreviewListener;
        if (tXVideoPreviewListener != null) {
            this.mMainHandler.post(bn.a(tXVideoPreviewListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPreviewProgress(int i10) {
        TXVideoPreviewListener tXVideoPreviewListener = this.mVideoPreviewListener;
        if (tXVideoPreviewListener != null) {
            this.mMainHandler.post(bm.a(this, i10, tXVideoPreviewListener));
        }
    }

    private void notifyProcessComplete(int i10, boolean z10) {
        LiteavLog.i(TAG, "notifyProcessComplete: resultCode:" + i10 + " isThumbnailProcessFinish:" + z10);
        this.mHasNotifyProcessComplete.set(false);
        if (z10) {
            this.mNeedWaitThumbnailProcess = false;
        } else {
            this.mNeedWaitProcessFullI = false;
        }
        if (!this.mNeedWaitProcessFullI && !this.mNeedWaitThumbnailProcess) {
            this.mMainHandler.post(bp.a(this, i10));
        } else if (this.mNeedWaitThumbnailProcess) {
            this.mMainHandler.postDelayed(bo.a(this, i10), 500L);
        }
    }

    private void notifyProcessProgress(float f10) {
        TXVideoProcessListener tXVideoProcessListener = this.mVideoProcessListener;
        if (tXVideoProcessListener != null) {
            this.mMainHandler.post(br.a(tXVideoProcessListener, f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioEncodedFrame(AudioFrame audioFrame) {
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.writeAudioFrame(audioFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioEncodedFrameComplete() {
        LiteavLog.i(TAG, "onAudioEncodedFrameComplete end flag = " + this.mIsGenerateAudioEnd);
        if (this.mIsGenerateAudioEnd) {
            return;
        }
        this.mIsGenerateAudioEnd = true;
        this.mAVSyncer.setAudioEos();
        handleEncodedCompletedInner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayComplete() {
        LiteavLog.i(TAG, "on play complete. playing is " + this.mIsPlaying);
        if (this.mIsPlaying) {
            this.mIsPlaying = false;
            this.mAVSyncer.setVideoEos();
            this.mAVSyncer.setAudioEos();
            this.mAVSyncer.stop();
            notifyPreviewFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType) {
        LiteavLog.i(TAG, "on video encoded fail. encoder type is ".concat(String.valueOf(encoderType)));
        if (encoderType == UGCVideoEncoderJNI.EncoderType.HARDWARE) {
            startProcessVideo(UGCVideoEncoderJNI.EncoderType.SOFTWARE);
        } else {
            onVideoEncodedFrameComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoEncodedFrame(EncodedVideoFrame encodedVideoFrame) {
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.writeVideoFrame(encodedVideoFrame);
        }
        float fCalculateProgress = calculateProgress(encodedVideoFrame.pts);
        if (fCalculateProgress < this.mLastVideoEncodeProgress) {
            return;
        }
        this.mLastVideoEncodeProgress = fCalculateProgress;
        if (this.mIsProcessToFullKeyFrame) {
            notifyProcessProgress(fCalculateProgress);
        } else {
            notifyGenerateProgress(fCalculateProgress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoEncodedFrameComplete() {
        LiteavLog.i(TAG, "onVideoEncodedFrameComplete end flag = " + this.mIsGenerateVideoEnd);
        if (this.mIsGenerateVideoEnd) {
            return;
        }
        this.mAVSyncer.setVideoEos();
        this.mIsGenerateVideoEnd = true;
        handleEncodedCompletedInner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processVideoInternal() {
        if (!UGCLicenseChecker.isSimpleFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mMainHandler.post(ai.a(this.mVideoProcessListener));
            return;
        }
        UGCDataReport.reportDAU(1034);
        LiteavLog.i(TAG, "processVideoInternal");
        String strGenerateVideoPath = generateVideoPath();
        this.mProcessOutputPath = strGenerateVideoPath;
        this.mRecordOutputPath = strGenerateVideoPath;
        boolean zIsFullIFrame = isFullIFrame(this.mSourcePath);
        UGCTranscodeVideoEncodeParamsDecider uGCTranscodeVideoEncodeParamsDecider = new UGCTranscodeVideoEncodeParamsDecider();
        uGCTranscodeVideoEncodeParamsDecider.setFullIFrame(true);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeRotation(this.mRotation);
        uGCTranscodeVideoEncodeParamsDecider.setOutputResolution(4);
        uGCTranscodeVideoEncodeParamsDecider.setInputVideoMediaFormat(this.mVideoFormatList);
        this.mVideoEncodeParams = uGCTranscodeVideoEncodeParamsDecider.getDecidedEncodeParams();
        UGCTranscodeAudioEncodeParamsDecider uGCTranscodeAudioEncodeParamsDecider = new UGCTranscodeAudioEncodeParamsDecider();
        uGCTranscodeAudioEncodeParamsDecider.setInputAudioMediaFormat(this.mAudioFormatList);
        this.mAudioEncodeParams = uGCTranscodeAudioEncodeParamsDecider.getDecidedEncodeParams();
        LiteavLog.i(TAG, "processVideoInternal: hasIFramePerMinute= " + isGopEqualOne(this.mSourcePath) + ", inputFullIFrame= " + zIsFullIFrame + ",mProcessOutputPath= " + this.mProcessOutputPath);
        this.mIsProcessToFullKeyFrame = true;
        this.mLastVideoEncodeProgress = 0.0f;
        if (zIsFullIFrame) {
            this.mNeedWaitProcessFullI = false;
        } else {
            startProcessVideo(UGCVideoEncoderJNI.EncoderType.HARDWARE);
            this.mNeedWaitProcessFullI = true;
        }
        startThumbnailGeneratorByProcess(this.mVideoEncodeParams, zIsFullIFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseThumbnailGenerator(UGCThumbnailGenerator uGCThumbnailGenerator) {
        if (this.mAllThumbnailGeneratorList.size() > 0 && this.mAllThumbnailGeneratorList.contains(uGCThumbnailGenerator)) {
            uGCThumbnailGenerator.stop();
            uGCThumbnailGenerator.uninitialize();
            this.mAllThumbnailGeneratorList.remove(uGCThumbnailGenerator);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaSourcePathsInternal(List<String> list) {
        if (list == null || list.isEmpty()) {
            LiteavLog.w(TAG, "video source is null or empty");
            return;
        }
        Size size = this.mCanvasSize;
        if (size == null) {
            this.mVideoProcessor.setOutputSize(-1, -1, GLConstants.GLScaleType.FIT_CENTER);
        } else {
            this.mVideoProcessor.setOutputSize(size.width, size.height, GLConstants.GLScaleType.FIT_CENTER);
        }
        this.mVideoSourceList = list;
        this.mMediaListSource.setVideoSources(list);
        this.mSourcePath = list.get(0);
        this.mVideoFormatList = new LinkedList();
        this.mAudioFormatList = new LinkedList();
        try {
            getAllMediaFormatFromSource(list);
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "get all media format from source exception.", th2);
        }
        if (!CollectionUtils.isEmpty(this.mVideoFormatList)) {
            this.mAVSyncer.setVideoExist(true);
        }
        if (!CollectionUtils.isEmpty(this.mAudioFormatList)) {
            this.mAVSyncer.setAudioExist(true);
        }
        if (CollectionUtils.isEmpty(this.mAudioFormatList)) {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
        } else if (list.size() > 1) {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.CLOCK_MASTER;
        } else {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.AUDIO_MASTER;
        }
    }

    private void startMP4Writer(String str) {
        LiteavLog.i(TAG, "startMP4Writer ".concat(String.valueOf(str)));
        MP4Writer mP4Writer = new MP4Writer();
        this.mMp4Writer = mP4Writer;
        mP4Writer.setListener(this.mMp4WriterListener);
        if (!CollectionUtils.isEmpty(this.mAudioFormatList) || this.mHasBGM) {
            this.mMp4Writer.setHasAudio(true);
        }
        this.mMp4Writer.setHasVideo(true);
        this.mMp4Writer.setPath(str);
        this.mMp4Writer.start();
    }

    private void startProcessVideo(UGCVideoEncoderJNI.EncoderType encoderType) {
        doStopPlayInner();
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.setListener(null);
            this.mMp4Writer.stop();
        }
        this.mIsGenerating = true;
        startMP4Writer(this.mRecordOutputPath);
        this.mIsVideoEncoderStarted = false;
        this.mIsAudioEncoderStarted = false;
        this.mVideoProcessor.setVideoEncodedFrameListener(this.mVideoEncodedFrameListener);
        this.mAudioProcessor.setAudioEncodedFrameListener(this.mAudioEncodedFrameListener);
        this.mAVSyncer.setSyncMode(UGCAVSyncer.SyncMode.INTERLEAVE_OUTPUT_WITHOUT_SKIP);
        this.mAVSyncer.start();
        this.mIsGenerateAudioEnd = false;
        this.mIsGenerateVideoEnd = false;
        this.mMediaListSource.setPlayEndTime(Long.MAX_VALUE);
        this.mMediaListSource.setVideoSourceRange(this.mCutStartTimeMs, this.mCutEndTimeMs);
        UGCVideoProcessor uGCVideoProcessor = this.mVideoProcessor;
        VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
        uGCVideoProcessor.setOutputSize(videoEncodeParams.width, videoEncodeParams.height, GLConstants.GLScaleType.FIT_CENTER);
        this.mVideoProcessor.setEncodeParams(this.mVideoEncodeParams);
        this.mVideoProcessor.start(true, encoderType);
        this.mAudioProcessor.setEncodeParams(this.mAudioEncodeParams);
        this.mAudioProcessor.start(true);
    }

    private void startThumbnailGeneratorByProcess(VideoEncodeParams videoEncodeParams, boolean z10) {
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = this.mProcessThumbnailInfo;
        if (uGCThumbnailGenerateParams == null) {
            return;
        }
        if (uGCThumbnailGenerateParams.width == 0 || uGCThumbnailGenerateParams.height == 0) {
            uGCThumbnailGenerateParams.width = videoEncodeParams.width;
            uGCThumbnailGenerateParams.height = videoEncodeParams.height;
        }
        UGCThumbnailGenerator uGCThumbnailGenerator = new UGCThumbnailGenerator();
        uGCThumbnailGenerator.initialize();
        uGCThumbnailGenerator.setVideoSourceList(this.mVideoSourceList);
        uGCThumbnailGenerator.setVideoSourceRange(this.mCutStartTimeMs, this.mCutEndTimeMs);
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams2 = this.mProcessThumbnailInfo;
        uGCThumbnailGenerateParams2.thumbnailPtsList = UGCThumbnailGenerator.calculateThumbnailList(uGCThumbnailGenerateParams2.thumbnailCount, 0L, this.mCutEndTimeMs - this.mCutStartTimeMs, this.mMediaListSource.getDuration());
        this.mNeedWaitThumbnailProcess = true;
        uGCThumbnailGenerator.start(this.mProcessThumbnailInfo, ak.a(this, uGCThumbnailGenerator, z10));
        this.mAllThumbnailGeneratorList.add(uGCThumbnailGenerator);
    }

    private void stopMp4Writer() {
        LiteavLog.i(TAG, "stopMp4Writer");
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.stop();
            this.mMp4Writer = null;
        }
    }

    public void cancel() {
        this.mSequenceTaskRunner.a(bb.a(this));
    }

    public void deleteAllEffect() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.a(ab.a(this));
        } else {
            LiteavLog.e(TAG, "deleteAllEffect is not supported in UGC_Smart license");
        }
    }

    public void deleteLastEffect() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.a(aa.a(this));
        } else {
            LiteavLog.e(TAG, "deleteLastEffect is not supported in UGC_Smart license");
        }
    }

    public void deleteLastTransitionEffect() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.a(w.a(this));
        } else {
            LiteavLog.e(TAG, "deleteLastTransitionEffect is not supported in UGC_Smart license");
        }
    }

    public void generateVideo(int i10, String str) {
        this.mSequenceTaskRunner.a(ba.a(this, i10, str));
    }

    protected long getDuration() {
        return this.mMediaListSource.getDuration();
    }

    public void getThumbnail(int i10, int i11, int i12, boolean z10, TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.a(ae.a(this, i11, i12, z10, i10, tXThumbnailListener));
    }

    public void getThumbnail(List<Long> list, int i10, int i11, boolean z10, TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.a(ad.a(this, list, i10, i11, z10, tXThumbnailListener));
    }

    public int getThumbnailCount() {
        LiteavLog.i(TAG, "getThumbnailCount");
        List<Long> list = this.mProcessThumbnailInfo.thumbnailPtsList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public String getVideoProcessPath() {
        LiteavLog.i(TAG, "getVideoProcessPath: process output path= " + this.mProcessOutputPath);
        return this.mProcessOutputPath;
    }

    public String getVideoSourcePath() {
        LiteavLog.i(TAG, "getVideoSourcePath: sourcePath= " + this.mSourcePath);
        return this.mSourcePath;
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        if (tXPreviewParam == null) {
            LiteavLog.i(TAG, "initWithPreview param is null.");
            return;
        }
        LiteavLog.i(TAG, "initWithPreview: view= " + tXPreviewParam.videoView + " renderMode= " + tXPreviewParam.renderMode);
        this.mMainHandler.runOrPost(ao.a(this, tXPreviewParam));
    }

    protected boolean isHasAudio() {
        return this.mMediaListSource.hasAudioData();
    }

    public void pausePlay() {
        this.mSequenceTaskRunner.a(aq.a(this));
    }

    public void previewAtTime(long j10) {
        this.mPendingPreviewAtTime.set(Long.valueOf(j10));
        this.mTargetSeekPts.set(Long.valueOf(j10));
        this.mSequenceTaskRunner.a(at.a(this));
    }

    public void processVideo() {
        this.mSequenceTaskRunner.a(ah.a(this));
    }

    public void refreshOneFrame() {
        LiteavLog.i(TAG, "refreshOneFrame");
        this.mSequenceTaskRunner.a(bj.a(this));
    }

    public void release() {
        this.mSequenceTaskRunner.a(am.a(this));
    }

    public void resumePlay() {
        this.mSequenceTaskRunner.a(ar.a(this));
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setAnimatedPasterList is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1026);
            this.mSequenceTaskRunner.a(p.a(this, list));
        }
    }

    @Deprecated
    public void setAudioBitrate(int i10) {
        this.mSequenceTaskRunner.a(az.a(this, i10));
    }

    public int setBGM(String str) {
        boolean z10;
        int iIsBGMValid;
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "setBGM is not supported in UGC_Smart license");
            return 0;
        }
        LiteavLog.i(TAG, "setBGM: path= ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e(TAG, " setBGM: bgm path is empty.");
            z10 = true;
            iIsBGMValid = 0;
        } else {
            iIsBGMValid = isBGMValid(str);
            z10 = false;
        }
        if (iIsBGMValid != 0) {
            LiteavLog.e(TAG, " bgm file is invalid. error code  ".concat(String.valueOf(iIsBGMValid)));
            return iIsBGMValid;
        }
        this.mSequenceTaskRunner.a(f.a(this, str, z10));
        UGCDataReport.reportDAU(1024);
        return 0;
    }

    public void setBGMAtVideoTime(long j10) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(h.a(this, j10));
        } else {
            LiteavLog.e(TAG, "setBGMAtVideoTime is not supported in UGC_Smart license");
        }
    }

    public void setBGMFadeInOutDuration(long j10, long j11) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(k.a(this, j10, j11));
        } else {
            LiteavLog.e(TAG, "setBGMFadeInOutDuration is not supported in UGC_Smart license");
        }
    }

    public void setBGMLoop(boolean z10) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(g.a(this, z10));
        } else {
            LiteavLog.e(TAG, "setBGMLoop is not supported in UGC_Smart license");
        }
    }

    public void setBGMStartTime(long j10, long j11) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(i.a(this, j10, j11));
        } else {
            LiteavLog.e(TAG, "setBGMStartTime is not supported in UGC_Smart license");
        }
    }

    public void setBGMVolume(float f10) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(j.a(this, f10));
        } else {
            LiteavLog.e(TAG, "setBGMVolume is not supported in UGC_Smart license");
        }
    }

    public void setBeautyFilter(int i10, int i11) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(bx.a(this, i10, i11));
        } else {
            LiteavLog.e(TAG, "setBeautyFilter is not supported in UGC_Smart license");
        }
    }

    public void setCustomVideoProcessListener(TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.a(aj.a(this, tXVideoCustomProcessListener));
        } else {
            LiteavLog.e(TAG, "setCustomVideoProcessListener is not supported in UGC_Smart license");
        }
    }

    public void setCutFromTime(long j10, long j11) {
        this.mSequenceTaskRunner.a(aw.a(this, j10, j11));
        UGCDataReport.reportDAU(1018);
    }

    protected void setDurationControlMode(TXVideoJoiner.DurationControlMode durationControlMode) {
        LiteavLog.i(TAG, "set duration control mode ".concat(String.valueOf(durationControlMode)));
        this.mSequenceTaskRunner.a(bd.a(this, durationControlMode));
    }

    public void setFilter(Bitmap bitmap) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "setFilter is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1023);
            this.mSequenceTaskRunner.a(bq.a(this, bitmap));
        }
    }

    public void setFilter(Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(bw.a(this, f10, f11, f12, bitmap, bitmap2));
        } else {
            LiteavLog.e(TAG, "setFilter is not supported in UGC_Smart license");
        }
    }

    protected void setIsFullIFrame(boolean z10) {
        this.mSequenceTaskRunner.a(bh.a(this, z10));
    }

    protected void setIsSplitScreen(boolean z10) {
        this.mSequenceTaskRunner.a(bc.a(this, z10));
    }

    protected void setMediaSourcePaths(List<String> list) {
        this.mSequenceTaskRunner.a(bi.a(this, list));
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "setPasterList is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1025);
            this.mSequenceTaskRunner.a(q.a(this, list));
        }
    }

    public int setPictureList(List<Bitmap> list, int i10) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setPictureList is not supported in UGC_Smart license");
            return -1;
        }
        UGCDataReport.reportDAU(1030);
        this.mSequenceTaskRunner.a(d.a(this, i10, list));
        return 0;
    }

    public long setPictureTransition(int i10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.b(e.a(this, i10));
            return this.mMediaListSource.getDuration();
        }
        LiteavLog.e(TAG, "setPictureTransition is not supported in UGC_Smart license");
        return 0L;
    }

    public void setProfile(int i10) {
        this.mSequenceTaskRunner.a(au.a(this, i10));
    }

    public void setRenderRotation(int i10) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(r.a(this, i10));
        } else {
            LiteavLog.e(TAG, "setRenderRotation is not supported in UGC_Smart license");
        }
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setRepeatPlay is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1020);
            this.mSequenceTaskRunner.a(t.a(this, list));
        }
    }

    public void setReverse(boolean z10) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setReverse is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1021);
            this.mSequenceTaskRunner.a(u.a(this, z10));
        }
    }

    public void setSpecialRatio(float f10) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mSequenceTaskRunner.a(bf.a(this, f10));
        } else {
            LiteavLog.e(TAG, "setSpecialRatio is not supported in UGC_Smart license");
        }
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setSpeedList is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1019);
            this.mSequenceTaskRunner.a(s.a(this, list));
        }
    }

    protected void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i10, int i11) {
        this.mSequenceTaskRunner.a(be.a(this, list, i10, i11));
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "setSubtitleList is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1027);
            this.mSequenceTaskRunner.a(o.a(this, list));
        }
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        this.mSequenceTaskRunner.a(an.a(this, tXVideoPreviewListener));
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, int i10) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setTailWaterMark is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1029);
            this.mSequenceTaskRunner.a(m.a(this, i10, bitmap, tXRect));
        }
    }

    public void setThumbnail(TXVideoEditConstants.TXThumbnail tXThumbnail) {
        this.mSequenceTaskRunner.a(af.a(this, tXThumbnail));
    }

    public void setThumbnailListener(TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.a(ag.a(this, tXThumbnailListener));
    }

    public boolean setTransitionEffect(int i10, long j10, long j11) {
        return setTransitionEffect(i10, j11, j10, 1000L);
    }

    public boolean setTransitionEffect(int i10, long j10, long j11, long j12) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setTransitionEffect is not supported in UGC_Smart license");
            return false;
        }
        UGCDataReport.reportDAU(1035);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mSequenceTaskRunner.b(v.a(this, i10, j11, j12, atomicBoolean));
        return atomicBoolean.get();
    }

    public void setVideoBitrate(int i10) {
        this.mSequenceTaskRunner.a(ax.a(this, i10));
    }

    public void setVideoFrameRate(TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        this.mSequenceTaskRunner.a(ay.a(this, videoFrameRateLevel));
    }

    public void setVideoGenerateListener(TXVideoGenerateListener tXVideoGenerateListener) {
        this.mSequenceTaskRunner.a(av.a(this, tXVideoGenerateListener));
    }

    public int setVideoPath(String str) {
        LiteavLog.i(TAG, "setVideoPath ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int iIsMediaSourceValid = isMediaSourceValid(str);
        if (iIsMediaSourceValid == 0) {
            this.mSequenceTaskRunner.a(y.a(this, str));
            return 0;
        }
        LiteavLog.e(TAG, "setVideoPath " + str + " is illegal." + iIsMediaSourceValid);
        return iIsMediaSourceValid;
    }

    public void setVideoProcessListener(TXVideoProcessListener tXVideoProcessListener) {
        this.mSequenceTaskRunner.a(ac.a(this, tXVideoProcessListener));
    }

    public void setVideoVolume(float f10) {
        this.mSequenceTaskRunner.a(bk.a(this, f10));
    }

    protected void setVideoVolumes(float[] fArr) {
        this.mSequenceTaskRunner.a(bg.a(this, fArr));
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setWaterMark is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1028);
            this.mSequenceTaskRunner.a(l.a(this, tXRect, bitmap));
        }
    }

    public void startEffect(int i10, long j10) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "startEffect is not supported in UGC_Smart license");
        } else {
            UGCDataReport.reportDAU(1022, i10, "");
            this.mSequenceTaskRunner.a(x.a(this, i10, j10));
        }
    }

    public void startPlayFromTime(long j10, long j11) {
        this.mSequenceTaskRunner.a(ap.a(this, j10, j11));
    }

    public void stopEffect(int i10, long j10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mSequenceTaskRunner.a(z.a(this, i10, j10));
        } else {
            LiteavLog.e(TAG, "stopEffect is not supported in UGC_Smart license");
        }
    }

    public void stopPlay() {
        this.mSequenceTaskRunner.a(as.a(this));
    }
}
