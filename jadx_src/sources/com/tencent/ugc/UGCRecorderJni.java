package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.datereport.UGCDataReport;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCRecorderJni {
    private static final String OUTPUT_DIR_NAME = "TXUGC";
    private static final String OUTPUT_TEMP_DIR_NAME = "TXUGCParts";
    private static final String OUTPUT_VIDEO_COVER_NAME = "TXUGCCover.jpg";
    private static final String OUTPUT_VIDEO_NAME = "TXUGCRecord.mp4";
    private static final String TAG = "UGCRecorderJni";
    private TXRecordCommon.ITXBGMNotify mBGMListener;
    private TXBeautyManager mBeautyManager;
    private Context mContext;
    private String mCoverPath;
    private TXUGCRecord.VideoCustomProcessListener mCustomProcessListener;
    private long mNativeUGCRecorderJni;
    private TXCloudVideoView mPreviewView;
    private RecordParams mRecorderParams = new RecordParams();
    private TXRecordCommon.ITXSnapshotListener mSnapshotListener;
    private TXUGCPartsManager mTXUGCPartsManager;
    private String mVideoFilePath;
    private String mVideoPartFolder;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;

    public static class RecordParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103237a = 540;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103238b = bb.c.b.f31065yf;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103239c = 20;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103240d = bb.c.b.Hv;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f103241e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f103242f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f103243g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f103244h = 5000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f103245i = 60000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f103246j = 48000;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f103247k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.tencent.liteav.videobase.common.d f103248l = com.tencent.liteav.videobase.common.d.HIGH;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f103249m = true;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f103250n = true;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f103251o = true;

        RecordParams() {
        }

        public boolean enableAEC() {
            return this.f103249m;
        }

        public boolean enableAGC() {
            return this.f103250n;
        }

        public boolean enableANS() {
            return this.f103251o;
        }

        public int getAudioSampleRate() {
            return this.f103246j;
        }

        public int getMaxDuration() {
            return this.f103245i;
        }

        public int getMinDuration() {
            return this.f103244h;
        }

        public int getVideoBitrate() {
            return this.f103240d;
        }

        public int getVideoFps() {
            return this.f103239c;
        }

        public int getVideoGop() {
            return this.f103241e;
        }

        public int getVideoHeight() {
            return this.f103238b;
        }

        public int getVideoProfile() {
            return this.f103248l.mValue;
        }

        public int getVideoWidth() {
            return this.f103237a;
        }

        public boolean isFullIFrame() {
            return this.f103247k;
        }
    }

    static {
        com.tencent.liteav.base.util.s.a();
    }

    protected UGCRecorderJni(Context context) {
        this.mNativeUGCRecorderJni = 0L;
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCInitializer.initialize();
        long jNativeCreate = nativeCreate(this);
        this.mNativeUGCRecorderJni = jNativeCreate;
        this.mBeautyManager = new UGCBeautyManager(nativeCreateBeautyManager(jNativeCreate));
        this.mTXUGCPartsManager = new TXUGCPartsManagerImpl(nativeCreatePartsManager(this.mNativeUGCRecorderJni));
        initFileAndFolder();
    }

    private int checkRecordPath(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e(TAG, "startRecord: init videoRecord failed, videoFilePath is empty");
            return -2;
        }
        this.mVideoFilePath = str;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (!TextUtils.isEmpty(str3)) {
            this.mCoverPath = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mVideoPartFolder = str2;
        }
        File file2 = new File(this.mVideoPartFolder);
        if (file2.exists()) {
            return 0;
        }
        file2.mkdirs();
        return 0;
    }

    private void createThumbFile(String str, String str2) throws Throwable {
        Bitmap sampleImage;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (sampleImage = TXVideoInfoReader.getInstance(this.mContext).getSampleImage(0L, str)) == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                sampleImage.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                com.tencent.liteav.base.util.f.a(fileOutputStream2);
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                com.tencent.liteav.base.util.f.a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                com.tencent.liteav.base.util.f.a(fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private String getDefaultDir() {
        File fileA = com.tencent.liteav.base.util.f.a(this.mContext, OUTPUT_DIR_NAME);
        if (fileA == null) {
            fileA = this.mContext.getFilesDir();
        }
        return fileA != null ? fileA.getPath() : "";
    }

    private int getEditBitrateWithSize(int i10, int i11) {
        if (i10 <= 640 && i11 <= 640) {
            return 2000;
        }
        if (i10 > 960 || i11 > 960) {
            return (i10 > 1280 || i11 > 1280) ? bb.c.m.Ef : bb.c.g.Rc;
        }
        return bb.c.f.Ae;
    }

    private Size getVideoSize(int i10) {
        Size size = new Size();
        if (i10 == 0) {
            size.width = 360;
            size.height = bb.c.b.f30883q9;
        } else if (i10 == 1) {
            size.width = 480;
            size.height = bb.c.b.f30883q9;
        } else if (i10 == 3) {
            size.width = 720;
            size.height = 1280;
        } else if (i10 != 4) {
            size.width = 540;
            size.height = bb.c.b.f31065yf;
        } else {
            size.width = 1080;
            size.height = 1920;
        }
        return size;
    }

    private void initFileAndFolder() {
        String defaultDir = getDefaultDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(defaultDir);
        String str = File.separator;
        sb2.append(str);
        sb2.append(OUTPUT_VIDEO_NAME);
        this.mVideoFilePath = sb2.toString();
        this.mCoverPath = defaultDir + str + OUTPUT_VIDEO_COVER_NAME;
        this.mVideoPartFolder = defaultDir + str + OUTPUT_TEMP_DIR_NAME;
        File file = new File(this.mVideoPartFolder);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(this.mVideoFilePath);
        if (file2.exists()) {
            file2.delete();
        }
    }

    private void initRecorderParams(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig) {
        Size videoSize = getVideoSize(tXUGCCustomConfig.videoResolution);
        if (tXUGCCustomConfig.enableHighResolutionCapture) {
            videoSize.width = 1080;
            videoSize.height = 1920;
        }
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f103237a = videoSize.width;
        recordParams.f103238b = videoSize.height;
        recordParams.f103240d = tXUGCCustomConfig.videoBitrate;
        recordParams.f103239c = tXUGCCustomConfig.videoFps;
        recordParams.f103241e = tXUGCCustomConfig.videoGop;
        recordParams.f103247k = tXUGCCustomConfig.needEdit;
        recordParams.f103242f = tXUGCCustomConfig.isFront;
        recordParams.f103243g = tXUGCCustomConfig.touchFocus;
        recordParams.f103248l = recordProfileToVideoProfileType(tXUGCCustomConfig.profile);
        RecordParams recordParams2 = this.mRecorderParams;
        recordParams2.f103244h = tXUGCCustomConfig.minDuration;
        recordParams2.f103245i = tXUGCCustomConfig.maxDuration;
        recordParams2.f103246j = tXUGCCustomConfig.audioSampleRate;
        recordParams2.f103249m = tXUGCCustomConfig.enableAEC;
        recordParams2.f103250n = tXUGCCustomConfig.enableAGC;
        recordParams2.f103251o = tXUGCCustomConfig.enableANS;
        if (tXUGCCustomConfig.needEdit) {
            recordParams2.f103241e = 1;
            recordParams2.f103240d = getEditBitrateWithSize(recordParams2.f103237a, recordParams2.f103238b);
        }
        int i10 = tXUGCCustomConfig.videoResolution;
        if (i10 == 0) {
            UGCDataReport.reportDAU(1044, 360, "360x640");
        } else if (i10 == 1) {
            UGCDataReport.reportDAU(1045, 480, "480x640");
        } else if (i10 == 3) {
            UGCDataReport.reportDAU(1046, 720, "720x1280");
        } else if (i10 != 4) {
            UGCDataReport.reportDAU(1045, 540, "540x960");
        } else {
            UGCDataReport.reportDAU(1047, 1080, "1080x1920");
        }
        UGCDataReport.reportDAU(1049, tXUGCCustomConfig.videoFps, "");
        UGCDataReport.reportDAU(1050, tXUGCCustomConfig.videoGop, "");
    }

    private void initRecorderParams(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig) {
        int i10 = tXUGCSimpleConfig.videoQuality;
        if (i10 == 0) {
            RecordParams recordParams = this.mRecorderParams;
            recordParams.f103237a = 360;
            recordParams.f103238b = bb.c.b.f30883q9;
            recordParams.f103240d = 2000;
            UGCDataReport.reportDAU(1044);
        } else if (i10 == 1) {
            RecordParams recordParams2 = this.mRecorderParams;
            recordParams2.f103237a = 480;
            recordParams2.f103238b = bb.c.b.f30883q9;
            recordParams2.f103240d = bb.c.d.Bl;
            UGCDataReport.reportDAU(1045);
        } else if (i10 != 3) {
            RecordParams recordParams3 = this.mRecorderParams;
            recordParams3.f103237a = 540;
            recordParams3.f103238b = bb.c.b.f31065yf;
            recordParams3.f103240d = bb.c.f.Ae;
            UGCDataReport.reportDAU(1045);
        } else {
            RecordParams recordParams4 = this.mRecorderParams;
            recordParams4.f103237a = 720;
            recordParams4.f103238b = 1280;
            recordParams4.f103240d = bb.c.g.Rc;
            UGCDataReport.reportDAU(1046);
        }
        UGCDataReport.reportDAU(1048, this.mRecorderParams.f103240d, "");
        RecordParams recordParams5 = this.mRecorderParams;
        recordParams5.f103239c = 30;
        recordParams5.f103247k = tXUGCSimpleConfig.needEdit;
        recordParams5.f103242f = tXUGCSimpleConfig.isFront;
        recordParams5.f103243g = tXUGCSimpleConfig.touchFocus;
        recordParams5.f103248l = recordProfileToVideoProfileType(tXUGCSimpleConfig.profile);
        RecordParams recordParams6 = this.mRecorderParams;
        recordParams6.f103244h = tXUGCSimpleConfig.minDuration;
        recordParams6.f103245i = tXUGCSimpleConfig.maxDuration;
        recordParams6.f103249m = true;
        recordParams6.f103250n = true;
        recordParams6.f103251o = true;
        if (tXUGCSimpleConfig.needEdit) {
            recordParams6.f103241e = 1;
            recordParams6.f103240d = getEditBitrateWithSize(recordParams6.f103237a, recordParams6.f103238b);
        }
        UGCDataReport.reportDAU(1049, this.mRecorderParams.f103239c, "");
    }

    static /* synthetic */ void lambda$onRecordComplete$0(int i10, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
        tXRecordResult.retCode = i10;
        tXRecordResult.descMsg = str;
        tXRecordResult.videoPath = str2;
        tXRecordResult.coverPath = str3;
        iTXVideoRecordListener.onRecordComplete(tXRecordResult);
    }

    private static native long nativeCreate(UGCRecorderJni uGCRecorderJni);

    private static native long nativeCreateBeautyManager(long j10);

    private static native long nativeCreatePartsManager(long j10);

    private static native void nativeDestroy(long j10);

    private static native void nativeEnableBGMNotify(long j10, boolean z10);

    private static native void nativeEnableCameraAutoFocus(long j10, boolean z10);

    private static native void nativeEnableVideoCustomPreprocess(long j10, boolean z10);

    private static native int nativeGetMusicDuration(long j10, String str);

    private static native int nativeGetZoomLevel(long j10);

    private static native boolean nativePauseBGM(long j10);

    private static native int nativePauseRecord(long j10);

    private static native boolean nativePlayBGM(long j10, int i10, int i11);

    private static native boolean nativeResumeBGM(long j10);

    private static native int nativeResumeRecord(long j10);

    private static native void nativeSetAspectRatio(long j10, int i10);

    private static native void nativeSetBGMLoop(long j10, boolean z10);

    private static native int nativeSetBGMPath(long j10, String str);

    private static native boolean nativeSetBGMVolume(long j10, int i10);

    private static native void nativeSetFilter(long j10, Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12);

    private static native void nativeSetFocusPosition(long j10, float f10, float f11);

    private static native void nativeSetHomeOrientation(long j10, int i10);

    private static native void nativeSetMicVolume(long j10, int i10);

    public static native void nativeSetMute(long j10, boolean z10);

    private static native void nativeSetRecordParams(long j10, RecordParams recordParams);

    private static native void nativeSetRecordSpeed(long j10, int i10);

    private static native void nativeSetRenderMirrorType(long j10, int i10);

    private static native void nativeSetRenderMode(long j10, int i10);

    private static native void nativeSetRenderRotation(long j10, int i10);

    private static native void nativeSetReverbType(long j10, int i10);

    private static native void nativeSetVideoEncoderMirror(long j10, boolean z10);

    private static native void nativeSetView(long j10, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j10, int i10);

    private static native void nativeSetWatermark(long j10, Bitmap bitmap, float f10, float f11, float f12);

    private static native boolean nativeSetZoomLevel(long j10, int i10);

    private static native void nativeSnapshot(long j10);

    private static native void nativeStartCamera(long j10, boolean z10);

    private static native int nativeStartRecord(long j10, String str, String str2, String str3);

    private static native boolean nativeStopBGM(long j10);

    private static native void nativeStopCamera(long j10);

    private static native int nativeStopRecord(long j10);

    private static native boolean nativeSwitchCamera(long j10, boolean z10);

    private static native boolean nativeTurnOnTorch(long j10, boolean z10);

    private com.tencent.liteav.videobase.common.d recordProfileToVideoProfileType(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? com.tencent.liteav.videobase.common.d.HIGH : com.tencent.liteav.videobase.common.d.MAIN;
        }
        return com.tencent.liteav.videobase.common.d.BASELINE;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j10 = this.mNativeUGCRecorderJni;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.mNativeUGCRecorderJni = 0L;
        }
        UGCInitializer.uninitialize();
    }

    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    public int getMaxZoom() {
        return nativeGetZoomLevel(this.mNativeUGCRecorderJni);
    }

    public int getMusicDuration(String str) {
        long j10 = this.mNativeUGCRecorderJni;
        if (str == null) {
            str = "";
        }
        return nativeGetMusicDuration(j10, str);
    }

    public TXUGCPartsManager getPartsManager() {
        return this.mTXUGCPartsManager;
    }

    public void onBGMComplete(int i10) {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMComplete(i10);
        }
    }

    public void onBGMProgress(long j10, long j11) {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMProgress(j10, j11);
        }
    }

    public void onBGMStart() {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMStart();
        }
    }

    public void onGLContextDestroy() {
        TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener = this.mCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestroyed();
        }
    }

    public int onPreprocessVideoFrame(int i10, int i11, int i12) {
        TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener = this.mCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i10, i11, i12);
        }
        return -1;
    }

    public void onRecordComplete(int i10, String str, String str2, String str3) throws Throwable {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            createThumbFile(str2, str3);
            ThreadUtils.getUiThreadHandler().post(fb.a(i10, str, str2, str3, iTXVideoRecordListener));
        }
    }

    public void onRecordEvent(int i10) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i10, new Bundle());
        }
    }

    public void onRecordProgress(long j10) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j10);
        }
    }

    public void onSnapshot(Bitmap bitmap) {
        TXRecordCommon.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeUGCRecorderJni);
    }

    public int pauseRecord() {
        return nativePauseRecord(this.mNativeUGCRecorderJni);
    }

    public boolean playBGMFromTime(int i10, int i11) {
        UGCDataReport.reportDAU(1008);
        return nativePlayBGM(this.mNativeUGCRecorderJni, i10, i11);
    }

    public void release() {
        setVoiceChangerType(0);
        setReverb(0);
        setRecordSpeed(2);
        stopBGM();
        stopCameraPreview();
        stopRecord();
    }

    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeUGCRecorderJni);
    }

    public int resumeRecord() {
        return nativeResumeRecord(this.mNativeUGCRecorderJni);
    }

    public boolean seekBGM(int i10, int i11) {
        return nativePlayBGM(this.mNativeUGCRecorderJni, i10, i11);
    }

    public void setAspectRatio(int i10) {
        nativeSetAspectRatio(this.mNativeUGCRecorderJni, i10);
        if (i10 == 0) {
            UGCDataReport.reportDAU(1055);
            return;
        }
        if (i10 == 1) {
            UGCDataReport.reportDAU(1042);
            return;
        }
        if (i10 == 2) {
            UGCDataReport.reportDAU(1041);
        } else if (i10 == 3) {
            UGCDataReport.reportDAU(1043);
        } else if (i10 == 4) {
            UGCDataReport.reportDAU(1056);
        }
    }

    public int setBGM(String str) {
        UGCDataReport.reportDAU(1052);
        long j10 = this.mNativeUGCRecorderJni;
        if (str == null) {
            str = "";
        }
        return nativeSetBGMPath(j10, str);
    }

    public void setBGMLoop(boolean z10) {
        nativeSetBGMLoop(this.mNativeUGCRecorderJni, z10);
    }

    public void setBGMNotify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
        this.mBGMListener = iTXBGMNotify;
        nativeEnableBGMNotify(this.mNativeUGCRecorderJni, iTXBGMNotify != null);
    }

    public boolean setBGMVolume(float f10) {
        return nativeSetBGMVolume(this.mNativeUGCRecorderJni, (int) (f10 * 100.0f));
    }

    public void setBeautyDepth(int i10, int i11, int i12, int i13) {
        this.mBeautyManager.setBeautyStyle(i10);
        this.mBeautyManager.setBeautyLevel(i11);
        this.mBeautyManager.setWhitenessLevel(i12);
        this.mBeautyManager.setRuddyLevel(i13);
    }

    public void setBeautyStyle(int i10) {
        this.mBeautyManager.setBeautyStyle(i10);
    }

    public void setChinLevel(int i10) {
        this.mBeautyManager.setChinLevel(i10);
    }

    public void setEyeScaleLevel(float f10) {
        this.mBeautyManager.setEyeScaleLevel(f10);
    }

    public void setFaceScaleLevel(float f10) {
        this.mBeautyManager.setFaceSlimLevel(f10);
    }

    public void setFaceShortLevel(int i10) {
        this.mBeautyManager.setFaceShortLevel(i10);
    }

    public void setFaceVLevel(int i10) {
        this.mBeautyManager.setFaceVLevel(i10);
    }

    public void setFilter(Bitmap bitmap) {
        this.mBeautyManager.setFilter(bitmap);
    }

    public void setFilter(Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        nativeSetFilter(this.mNativeUGCRecorderJni, bitmap, f10, bitmap2, f11, f12);
    }

    public void setFocusPosition(float f10, float f11) {
        if (this.mRecorderParams.f103243g) {
            nativeSetFocusPosition(this.mNativeUGCRecorderJni, f10, f11);
        }
    }

    public void setGreenScreenFile(String str, boolean z10) {
        TXBeautyManager tXBeautyManager = this.mBeautyManager;
        if (str == null) {
            str = "";
        }
        tXBeautyManager.setGreenScreenFile(str);
    }

    public void setHomeOrientation(int i10) {
        nativeSetHomeOrientation(this.mNativeUGCRecorderJni, i10);
    }

    public boolean setMicVolume(float f10) {
        nativeSetMicVolume(this.mNativeUGCRecorderJni, (int) (f10 * 100.0f));
        return true;
    }

    public void setMotionMute(boolean z10) {
        this.mBeautyManager.setMotionMute(z10);
    }

    public void setMotionTmpl(String str) {
        TXBeautyManager tXBeautyManager = this.mBeautyManager;
        if (str == null) {
            str = "";
        }
        tXBeautyManager.setMotionTmpl(str);
    }

    public void setMute(boolean z10) {
        nativeSetMute(this.mNativeUGCRecorderJni, z10);
    }

    public void setNoseSlimLevel(int i10) {
        this.mBeautyManager.setNoseSlimLevel(i10);
    }

    public void setRecordSpeed(int i10) {
        nativeSetRecordSpeed(this.mNativeUGCRecorderJni, i10);
        if (i10 == 0) {
            UGCDataReport.reportDAU(1051, i10, "SLOWEST");
            return;
        }
        if (i10 == 1) {
            UGCDataReport.reportDAU(1051, i10, "SLOW");
            return;
        }
        if (i10 == 2) {
            UGCDataReport.reportDAU(1051, i10, "NORMAL");
        } else if (i10 == 3) {
            UGCDataReport.reportDAU(1051, i10, "FAST");
        } else {
            if (i10 != 4) {
                return;
            }
            UGCDataReport.reportDAU(1051, i10, "FASTEST");
        }
    }

    public void setRenderRotation(int i10) {
        nativeSetRenderRotation(this.mNativeUGCRecorderJni, i10);
    }

    public void setReverb(int i10) {
        nativeSetReverbType(this.mNativeUGCRecorderJni, i10);
        UGCDataReport.reportDAU(1054, i10, "");
        UGCDataReport.reportDAU(1007);
    }

    public void setSpecialRatio(float f10) {
        this.mBeautyManager.setFilterStrength(f10);
    }

    public void setVideoBitrate(int i10) {
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f103240d = i10;
        nativeSetRecordParams(this.mNativeUGCRecorderJni, recordParams);
    }

    public void setVideoEncoderMirror(boolean z10) {
        nativeSetVideoEncoderMirror(this.mNativeUGCRecorderJni, z10);
    }

    public void setVideoProcessListener(TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener) {
        this.mCustomProcessListener = videoCustomProcessListener;
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, videoCustomProcessListener != null);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    public void setVideoRenderMirrorType(int i10) {
        nativeSetRenderMirrorType(this.mNativeUGCRecorderJni, i10);
    }

    public void setVideoRenderMode(int i10) {
        nativeSetRenderMode(this.mNativeUGCRecorderJni, i10);
    }

    public void setVideoResolution(int i10) {
        Size videoSize = getVideoSize(i10);
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f103237a = videoSize.width;
        recordParams.f103238b = videoSize.height;
        nativeSetRecordParams(this.mNativeUGCRecorderJni, recordParams);
    }

    public void setVoiceChangerType(int i10) {
        nativeSetVoiceChangerType(this.mNativeUGCRecorderJni, i10);
        UGCDataReport.reportDAU(1053, i10, "");
    }

    public void setWatermark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXRect.f103212x, tXRect.f103213y, tXRect.width);
    }

    public boolean setZoom(int i10) {
        return nativeSetZoomLevel(this.mNativeUGCRecorderJni, i10);
    }

    public void snapshot(TXRecordCommon.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeUGCRecorderJni);
    }

    public int startCameraCustomPreview(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig, TXCloudVideoView tXCloudVideoView) {
        initRecorderParams(tXUGCCustomConfig);
        nativeSetRecordParams(this.mNativeUGCRecorderJni, this.mRecorderParams);
        nativeSetView(this.mNativeUGCRecorderJni, new DisplayTarget(tXCloudVideoView));
        nativeEnableCameraAutoFocus(this.mNativeUGCRecorderJni, !this.mRecorderParams.f103243g);
        nativeStartCamera(this.mNativeUGCRecorderJni, this.mRecorderParams.f103242f);
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, this.mCustomProcessListener != null);
        Bitmap bitmap = tXUGCCustomConfig.watermark;
        if (bitmap != null) {
            nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXUGCCustomConfig.watermarkX, tXUGCCustomConfig.watermarkY, bitmap.getWidth());
        }
        this.mPreviewView = tXCloudVideoView;
        return 0;
    }

    public int startCameraSimplePreview(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig, TXCloudVideoView tXCloudVideoView) {
        initRecorderParams(tXUGCSimpleConfig);
        nativeSetRecordParams(this.mNativeUGCRecorderJni, this.mRecorderParams);
        nativeSetView(this.mNativeUGCRecorderJni, new DisplayTarget(tXCloudVideoView));
        nativeEnableCameraAutoFocus(this.mNativeUGCRecorderJni, !this.mRecorderParams.f103243g);
        nativeStartCamera(this.mNativeUGCRecorderJni, this.mRecorderParams.f103242f);
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, this.mCustomProcessListener != null);
        Bitmap bitmap = tXUGCSimpleConfig.watermark;
        if (bitmap != null) {
            nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXUGCSimpleConfig.watermarkX, tXUGCSimpleConfig.watermarkY, bitmap.getWidth());
        }
        this.mPreviewView = tXCloudVideoView;
        return 0;
    }

    public int startRecord() {
        UGCDataReport.reportDAU(1002);
        return nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    public int startRecord(String str, String str2) {
        int iCheckRecordPath = checkRecordPath(str, this.mVideoPartFolder, str2);
        return iCheckRecordPath != 0 ? iCheckRecordPath : nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    public int startRecord(String str, String str2, String str3) {
        int iCheckRecordPath = checkRecordPath(str, str2, str3);
        return iCheckRecordPath != 0 ? iCheckRecordPath : nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeUGCRecorderJni);
    }

    public void stopCameraPreview() {
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, false);
        nativeStopCamera(this.mNativeUGCRecorderJni);
        this.mPreviewView = null;
    }

    public int stopRecord() {
        return nativeStopRecord(this.mNativeUGCRecorderJni);
    }

    public boolean switchCamera(boolean z10) {
        return nativeSwitchCamera(this.mNativeUGCRecorderJni, z10);
    }

    public boolean toggleTorch(boolean z10) {
        return nativeTurnOnTorch(this.mNativeUGCRecorderJni, z10);
    }
}
