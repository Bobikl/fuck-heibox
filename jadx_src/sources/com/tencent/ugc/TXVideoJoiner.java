package com.tencent.ugc;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXVideoJoiner {
    private static final String TAG = "TXVideoJoiner";
    private final Context mContext;
    private RemuxJoiner mRemuxJoiner;
    private final com.tencent.liteav.base.util.m mSequenceTaskRunner;
    private List<TXVideoEditConstants.TXAbsoluteRect> mSplitScreenRects;
    private TXVideoEditer mTXVideoEditer;
    private TXVideoJoinerListener mTXVideoJoinerListener;
    private TXVideoPreviewListener mTXVideoPreviewListener;
    private TXVideoEditConstants.TXPreviewParam mTxPreviewParam;
    private String mVideoOutputPath;
    private List<String> mVideoSourceList;
    private float[] mVideoVolumes;
    private boolean mIsNeedEdit = false;
    private int mProfile = -1;
    private int mSplitScreenCanvasWidth = -1;
    private int mSplitScreenCanvasHeight = -1;
    private DurationControlMode mDurationControlMode = DurationControlMode.ALIGNS_TO_LONGEST;
    private final TXVideoEditer.TXVideoPreviewListener mTXEditerVideoPreviewListener = new AnonymousClass1();
    private final TXVideoEditer.TXVideoGenerateListener mTXEditerVideoJoinerListener = new TXVideoEditer.TXVideoGenerateListener() { // from class: com.tencent.ugc.TXVideoJoiner.2
        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
            TXVideoJoiner.this.notifyJoinComplete(tXGenerateResult.retCode, tXGenerateResult.descMsg);
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateProgress(float f10) {
            TXVideoJoiner.this.notifyJoinProgress(f10);
        }
    };
    private final RemuxJoiner.RemuxJoinerListener mRemuxJoinerListener = new AnonymousClass3();

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoJoiner$1, reason: invalid class name */
    public final class AnonymousClass1 implements TXVideoEditer.TXVideoPreviewListener {
        AnonymousClass1() {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewFinished() {
            TXVideoJoiner.this.mSequenceTaskRunner.a(cz.a(this));
            TXVideoPreviewListener tXVideoPreviewListener = TXVideoJoiner.this.mTXVideoPreviewListener;
            if (tXVideoPreviewListener != null) {
                tXVideoPreviewListener.onPreviewFinished();
            }
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewProgress(int i10) {
            TXVideoPreviewListener tXVideoPreviewListener = TXVideoJoiner.this.mTXVideoPreviewListener;
            if (tXVideoPreviewListener != null) {
                tXVideoPreviewListener.onPreviewProgress(i10);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoJoiner$3, reason: invalid class name */
    public final class AnonymousClass3 implements RemuxJoiner.RemuxJoinerListener {
        AnonymousClass3() {
        }

        static /* synthetic */ void a(AnonymousClass3 anonymousClass3, int i10, String str) {
            TXVideoJoiner.this.notifyJoinComplete(i10, str);
            TXVideoJoiner.this.destroyRemuxJoiner();
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerComplete(int i10, String str) {
            TXVideoJoiner.this.mSequenceTaskRunner.a(db.a(this, i10, str));
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerProgress(float f10) {
            TXVideoJoiner.this.mSequenceTaskRunner.a(da.a(this, f10));
        }
    }

    public enum DurationControlMode {
        ALIGNS_TO_LONGEST,
        ALIGNS_TO_SHORTEST
    }

    public static class SplitScreenParam {
        public int canvasHeight;
        public int canvasWidth;
        public DurationControlMode durationControlMode;
        public List<TXVideoEditConstants.TXAbsoluteRect> rects;
    }

    public interface TXVideoJoinerListener {
        void onJoinComplete(TXVideoEditConstants.TXJoinerResult tXJoinerResult);

        void onJoinProgress(float f10);
    }

    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i10);
    }

    public TXVideoJoiner(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mSequenceTaskRunner = new com.tencent.liteav.base.util.m();
        UGCDataReport.reportDAU(1005);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRemuxJoiner() {
        RemuxJoiner remuxJoiner = this.mRemuxJoiner;
        if (remuxJoiner != null) {
            remuxJoiner.stop();
            this.mRemuxJoiner.uninitialize();
            this.mRemuxJoiner = null;
        }
    }

    private void destroyVideoEditer() {
        TXVideoEditer tXVideoEditer = this.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.cancel();
            this.mTXVideoEditer.release();
            this.mTXVideoEditer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinVideoInternal(int i10, String str, boolean z10) {
        List<String> list = this.mVideoSourceList;
        if (list == null || list.isEmpty()) {
            LiteavLog.w(TAG, "video source is null or empty");
            return;
        }
        destroyVideoEditer();
        TXVideoEditer tXVideoEditer = new TXVideoEditer(this.mContext, this.mSequenceTaskRunner);
        this.mTXVideoEditer = tXVideoEditer;
        tXVideoEditer.setMediaSourcePaths(this.mVideoSourceList);
        if (z10 && !CollectionUtils.isEmpty(this.mSplitScreenRects)) {
            this.mTXVideoEditer.setIsSplitScreen(true);
            this.mTXVideoEditer.setDurationControlMode(this.mDurationControlMode);
            this.mTXVideoEditer.setSplitScreenList(this.mSplitScreenRects, this.mSplitScreenCanvasWidth, this.mSplitScreenCanvasHeight);
            float[] fArr = this.mVideoVolumes;
            if (fArr != null) {
                this.mTXVideoEditer.setVideoVolumes(fArr);
            }
        }
        this.mTXVideoEditer.setVideoGenerateListener(this.mTXEditerVideoJoinerListener);
        this.mTXVideoEditer.setIsFullIFrame(this.mIsNeedEdit);
        this.mTXVideoEditer.setProfile(this.mProfile);
        this.mTXVideoEditer.generateVideo(i10, str);
    }

    static /* synthetic */ void lambda$cancel$9(TXVideoJoiner tXVideoJoiner) {
        tXVideoJoiner.destroyRemuxJoiner();
        tXVideoJoiner.destroyVideoEditer();
    }

    static /* synthetic */ void lambda$initWithPreview$1(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        tXVideoJoiner.mTxPreviewParam = tXPreviewParam;
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.initWithPreview(tXPreviewParam);
        }
    }

    static /* synthetic */ void lambda$joinVideo$8(TXVideoJoiner tXVideoJoiner, String str, int i10) {
        if (tXVideoJoiner.startQuickJoinVideo(str)) {
            LiteavLog.i(TAG, "quickJoinVideo success");
        } else {
            tXVideoJoiner.joinVideoInternal(i10, str, false);
        }
    }

    static /* synthetic */ void lambda$notifyJoinComplete$14(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.release();
            tXVideoJoiner.mTXVideoEditer = null;
        }
    }

    static /* synthetic */ void lambda$pausePlay$4(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.pausePlay();
        }
    }

    static /* synthetic */ void lambda$resumePlay$5(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.resumePlay();
        }
    }

    static /* synthetic */ void lambda$setSplitScreenList$10(TXVideoJoiner tXVideoJoiner, SplitScreenParam splitScreenParam) {
        List<TXVideoEditConstants.TXAbsoluteRect> list = splitScreenParam.rects;
        tXVideoJoiner.mSplitScreenRects = list;
        int i10 = splitScreenParam.canvasWidth;
        tXVideoJoiner.mSplitScreenCanvasWidth = i10;
        int i11 = splitScreenParam.canvasHeight;
        tXVideoJoiner.mSplitScreenCanvasHeight = i11;
        tXVideoJoiner.mDurationControlMode = splitScreenParam.durationControlMode;
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.setSplitScreenList(list, i10, i11);
            tXVideoJoiner.mTXVideoEditer.setDurationControlMode(splitScreenParam.durationControlMode);
        }
    }

    static /* synthetic */ void lambda$setVideoVolumes$11(TXVideoJoiner tXVideoJoiner, List list) {
        tXVideoJoiner.mVideoVolumes = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            tXVideoJoiner.mVideoVolumes[i10] = ((Float) list.get(i10)).floatValue();
        }
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.setVideoVolumes(tXVideoJoiner.mVideoVolumes);
        }
    }

    static /* synthetic */ void lambda$startPlay$3(TXVideoJoiner tXVideoJoiner) {
        List<String> list = tXVideoJoiner.mVideoSourceList;
        if (list == null || list.isEmpty()) {
            LiteavLog.w(TAG, "video source is null or empty");
            return;
        }
        tXVideoJoiner.stopPlayInternal();
        TXVideoEditer tXVideoEditer = new TXVideoEditer(tXVideoJoiner.mContext, tXVideoJoiner.mSequenceTaskRunner);
        tXVideoJoiner.mTXVideoEditer = tXVideoEditer;
        tXVideoEditer.setMediaSourcePaths(tXVideoJoiner.mVideoSourceList);
        tXVideoJoiner.mTXVideoEditer.initWithPreview(tXVideoJoiner.mTxPreviewParam);
        if (!CollectionUtils.isEmpty(tXVideoJoiner.mSplitScreenRects)) {
            tXVideoJoiner.mTXVideoEditer.setIsSplitScreen(true);
            tXVideoJoiner.mTXVideoEditer.setDurationControlMode(tXVideoJoiner.mDurationControlMode);
            tXVideoJoiner.mTXVideoEditer.setSplitScreenList(tXVideoJoiner.mSplitScreenRects, tXVideoJoiner.mSplitScreenCanvasWidth, tXVideoJoiner.mSplitScreenCanvasHeight);
            float[] fArr = tXVideoJoiner.mVideoVolumes;
            if (fArr != null) {
                tXVideoJoiner.mTXVideoEditer.setVideoVolumes(fArr);
            }
        }
        tXVideoJoiner.mTXVideoEditer.setTXVideoPreviewListener(tXVideoJoiner.mTXEditerVideoPreviewListener);
        TXVideoEditer tXVideoEditer2 = tXVideoJoiner.mTXVideoEditer;
        tXVideoEditer2.startPlayFromTime(0L, tXVideoEditer2.getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyJoinComplete(int i10, String str) {
        this.mSequenceTaskRunner.a(cq.a(this));
        TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
        tXJoinerResult.descMsg = str;
        tXJoinerResult.retCode = i10;
        LiteavLog.i(TAG, "TXGenerateResult descMsg = " + str + " retCode = " + i10);
        TXVideoJoinerListener tXVideoJoinerListener = this.mTXVideoJoinerListener;
        if (tXVideoJoinerListener != null) {
            tXVideoJoinerListener.onJoinComplete(tXJoinerResult);
        }
        if (i10 == 0 && !TextUtils.isEmpty(this.mVideoOutputPath) && new File(this.mVideoOutputPath).exists()) {
            UGCDataReport.reportDAU(1032, (int) new File(this.mVideoOutputPath).length(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyJoinProgress(float f10) {
        TXVideoJoinerListener tXVideoJoinerListener = this.mTXVideoJoinerListener;
        if (tXVideoJoinerListener != null) {
            tXVideoJoinerListener.onJoinProgress(f10);
        }
    }

    private boolean startQuickJoinVideo(String str) {
        destroyRemuxJoiner();
        List<String> list = this.mVideoSourceList;
        if (list == null || !RemuxJoiner.isConcatableWithoutReencode(list)) {
            return false;
        }
        LiteavLog.i(TAG, "RemuxerJoinerChecker check is ok");
        if (this.mRemuxJoiner == null) {
            RemuxJoiner remuxJoiner = new RemuxJoiner();
            this.mRemuxJoiner = remuxJoiner;
            remuxJoiner.initialize();
        }
        this.mRemuxJoiner.stop();
        if (this.mRemuxJoiner.setSourcePaths(this.mVideoSourceList) || this.mRemuxJoiner.setTargetPath(str)) {
            return false;
        }
        this.mVideoOutputPath = str;
        this.mRemuxJoiner.setVideoJoinerListener(this.mRemuxJoinerListener);
        return this.mRemuxJoiner.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPlayInternal() {
        LiteavLog.i(TAG, "stopPlayInternal");
        TXVideoEditer tXVideoEditer = this.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.stopPlay();
            this.mTXVideoEditer.release();
            this.mTXVideoEditer = null;
        }
    }

    public void cancel() {
        LiteavLog.i(TAG, "cancel");
        this.mSequenceTaskRunner.a(cl.a(this));
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        LiteavLog.i(TAG, "initWithPreview videoView = " + tXPreviewParam.videoView);
        this.mSequenceTaskRunner.a(cr.a(this, tXPreviewParam));
    }

    public void joinVideo(int i10, String str) {
        LiteavLog.i(TAG, "joinVideo videoCompressed " + i10 + " videoOutputPath = " + str);
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mVideoOutputPath = str;
            this.mSequenceTaskRunner.a(ck.a(this, str, i10));
        } else {
            LiteavLog.e(TAG, "joinVideo is not support on smart version");
            notifyJoinComplete(-5, "licence verify failed");
        }
    }

    public void pausePlay() {
        LiteavLog.i(TAG, "pausePlay");
        this.mSequenceTaskRunner.a(cu.a(this));
    }

    public void resumePlay() {
        LiteavLog.i(TAG, "resumePlay");
        this.mSequenceTaskRunner.a(cv.a(this));
    }

    public void setNeedEdit(boolean z10) {
        LiteavLog.i(TAG, "setNeedEdit = ".concat(String.valueOf(z10)));
        this.mSequenceTaskRunner.a(cp.a(this, z10));
    }

    public void setProfile(int i10) {
        LiteavLog.i(TAG, "setProfile profile ".concat(String.valueOf(i10)));
        this.mSequenceTaskRunner.a(cy.a(this, i10));
    }

    public void setRecordPath(String str) {
        LiteavLog.i(TAG, "setRecordPath recordPath = ".concat(String.valueOf(str)));
    }

    public void setSplitScreenList(SplitScreenParam splitScreenParam) {
        if (splitScreenParam == null) {
            LiteavLog.w(TAG, "set split screen list. param is null");
            return;
        }
        LiteavLog.i(TAG, "setSplitScreenList canvasWidth: " + splitScreenParam.canvasWidth + " canvasHeight:  " + splitScreenParam.canvasHeight + " durationControlMode: " + splitScreenParam.durationControlMode);
        this.mSequenceTaskRunner.a(cm.a(this, splitScreenParam));
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i10, int i11) {
        SplitScreenParam splitScreenParam = new SplitScreenParam();
        splitScreenParam.rects = list;
        splitScreenParam.canvasWidth = i10;
        splitScreenParam.canvasHeight = i11;
        splitScreenParam.durationControlMode = this.mDurationControlMode;
        setSplitScreenList(splitScreenParam);
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        LiteavLog.i(TAG, "setTXVideoPreviewListener");
        this.mSequenceTaskRunner.a(cs.a(this, tXVideoPreviewListener));
    }

    public void setVideoJoinerListener(TXVideoJoinerListener tXVideoJoinerListener) {
        LiteavLog.i(TAG, "setVideoJoinerListener");
        this.mSequenceTaskRunner.a(cx.a(this, tXVideoJoinerListener));
    }

    public int setVideoPathList(List<String> list) {
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int iIsMediaSourceValid = TXVideoEditer.isMediaSourceValid(str);
            if (iIsMediaSourceValid != 0) {
                LiteavLog.e(TAG, "set video path list " + str + " is illegal. valid code is " + iIsMediaSourceValid);
                return iIsMediaSourceValid;
            }
        }
        this.mSequenceTaskRunner.a(cj.a(this, list));
        return 0;
    }

    public void setVideoVolumes(List<Float> list) {
        LiteavLog.i(TAG, "setVideoVolumes");
        this.mSequenceTaskRunner.a(cn.a(this, list));
    }

    public void splitJoinVideo(int i10, String str) {
        LiteavLog.i(TAG, "splitJoinVideo video Compressed = " + i10 + " videoOutputPath = " + str);
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "splitJoinVideo is not support on smart version");
            notifyJoinComplete(-5, "licence verify failed");
        } else {
            this.mVideoOutputPath = str;
            this.mSequenceTaskRunner.a(co.a(this, i10, str));
            UGCDataReport.reportDAU(1031);
        }
    }

    public void startPlay() {
        LiteavLog.i(TAG, "startPlay");
        this.mSequenceTaskRunner.a(ct.a(this));
    }

    public void stopPlay() {
        LiteavLog.i(TAG, "stopPlay");
        this.mSequenceTaskRunner.a(cw.a(this));
    }
}
