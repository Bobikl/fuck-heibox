package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.datereport.UGCDataReport;

/* JADX INFO: loaded from: classes4.dex */
public class TXUGCRecord {
    private static final String TAG = "TXUGCRecord";
    private static TXUGCRecord instance;
    private UGCRecorderJni mUGCRecorder;

    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i10, int i11, int i12);

        void onTextureDestroyed();
    }

    protected TXUGCRecord(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCRecorderJni uGCRecorderJni = new UGCRecorderJni(context);
        this.mUGCRecorder = uGCRecorderJni;
        uGCRecorderJni.setBGMLoop(true);
        UGCDataReport.reportLicenseIsValid();
    }

    public static synchronized TXUGCRecord getInstance(Context context) {
        if (instance == null) {
            instance = new TXUGCRecord(context);
        }
        return instance;
    }

    public TXBeautyManager getBeautyManager() {
        return this.mUGCRecorder.getBeautyManager();
    }

    public int getMaxZoom() {
        return this.mUGCRecorder.getMaxZoom();
    }

    public int getMusicDuration(String str) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.getMusicDuration(str);
        }
        LiteavLog.e(TAG, "setBGMVolume is not supported in UGC_Smart license");
        return 0;
    }

    public TXUGCPartsManager getPartsManager() {
        return this.mUGCRecorder.getPartsManager();
    }

    public boolean pauseBGM() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.pauseBGM();
        }
        LiteavLog.e(TAG, "pauseBGM is not supported in UGC_Smart license");
        return false;
    }

    public int pauseRecord() {
        return this.mUGCRecorder.pauseRecord();
    }

    public boolean playBGMFromTime(int i10, int i11) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.playBGMFromTime(i10, i11);
        }
        LiteavLog.e(TAG, "playBGMFromTime is not supported in UGC_Smart license");
        return false;
    }

    public void release() {
        this.mUGCRecorder.release();
    }

    public boolean resumeBGM() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.resumeBGM();
        }
        LiteavLog.e(TAG, "resumeBGM is not supported in UGC_Smart license");
        return false;
    }

    public int resumeRecord() {
        return this.mUGCRecorder.resumeRecord();
    }

    public boolean seekBGM(int i10, int i11) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.seekBGM(i10, i11);
        }
        LiteavLog.e(TAG, "seekBGM is not supported in UGC_Smart license");
        return false;
    }

    public void setAspectRatio(int i10) {
        this.mUGCRecorder.setAspectRatio(i10);
    }

    public int setBGM(String str) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.setBGM(str);
        }
        LiteavLog.e(TAG, "setBGM is not supported in UGC_Smart license");
        return -1;
    }

    public void setBGMLoop(boolean z10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setBGMLoop(z10);
        } else {
            LiteavLog.e(TAG, "setBGMLoop is not supported in UGC_Smart license");
        }
    }

    public void setBGMNofify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setBGMNotify(iTXBGMNotify);
        } else {
            LiteavLog.e(TAG, "setBGMNofify is not supported in UGC_Smart license");
        }
    }

    public boolean setBGMVolume(float f10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.setBGMVolume(f10);
        }
        LiteavLog.e(TAG, "setBGMVolume is not supported in UGC_Smart license");
        return false;
    }

    @Deprecated
    public void setBeautyDepth(int i10, int i11, int i12, int i13) {
        this.mUGCRecorder.setBeautyDepth(i10, i11, i12, i13);
    }

    @Deprecated
    public void setBeautyStyle(int i10) {
        this.mUGCRecorder.setBeautyStyle(i10);
    }

    @Deprecated
    public void setChinLevel(int i10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setChinLevel(i10);
        } else {
            LiteavLog.e(TAG, "setChinLevel is not supported below enterprise pro license");
        }
    }

    @Deprecated
    public void setEyeScaleLevel(float f10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setEyeScaleLevel(f10);
        } else {
            LiteavLog.e(TAG, "setEyeScaleLevel is not supported below enterprise pro license");
        }
    }

    @Deprecated
    public void setFaceScaleLevel(float f10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setFaceScaleLevel(f10);
        } else {
            LiteavLog.e(TAG, "setFaceScaleLevel is not supported below enterprise pro license");
        }
    }

    @Deprecated
    public void setFaceShortLevel(int i10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setFaceShortLevel(i10);
        } else {
            LiteavLog.e(TAG, "setFaceVLevel is not supported below enterprise pro license");
        }
    }

    @Deprecated
    public void setFaceVLevel(int i10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setFaceVLevel(i10);
        } else {
            LiteavLog.e(TAG, "setFaceVLevel is not supported below enterprise pro license");
        }
    }

    @Deprecated
    public void setFilter(Bitmap bitmap) {
        this.mUGCRecorder.setFilter(bitmap);
    }

    public void setFilter(Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        this.mUGCRecorder.setFilter(bitmap, f10, bitmap2, f11, f12);
    }

    public void setFocusPosition(float f10, float f11) {
        this.mUGCRecorder.setFocusPosition(f10, f11);
    }

    @Deprecated
    public void setGreenScreenFile(String str, boolean z10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setGreenScreenFile(str, z10);
        } else {
            LiteavLog.e(TAG, "setGreenScreenFile is not supported below enterprise license");
        }
    }

    public void setHomeOrientation(int i10) {
        this.mUGCRecorder.setHomeOrientation(i10);
    }

    public boolean setMicVolume(float f10) {
        return this.mUGCRecorder.setMicVolume(f10);
    }

    @Deprecated
    public void setMotionMute(boolean z10) {
        if (UGCLicenseChecker.isEnterpriseFunctionSupport()) {
            this.mUGCRecorder.setMotionMute(z10);
        } else {
            LiteavLog.e(TAG, "setMotionMute is not supported below enterprise license");
        }
    }

    @Deprecated
    public void setMotionTmpl(String str) {
        if (UGCLicenseChecker.isEnterpriseFunctionSupport()) {
            this.mUGCRecorder.setMotionTmpl(str);
        } else {
            LiteavLog.e(TAG, "setMotionTmpl is not supported below enterprise license");
        }
    }

    public void setMute(boolean z10) {
        this.mUGCRecorder.setMute(z10);
    }

    @Deprecated
    public void setNoseSlimLevel(int i10) {
        if (UGCLicenseChecker.isEnterpriseProFunctionSupport()) {
            this.mUGCRecorder.setNoseSlimLevel(i10);
        } else {
            LiteavLog.e(TAG, "setNoseSlimLevel is not supported below enterprise pro license");
        }
    }

    public void setRecordSpeed(int i10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setRecordSpeed(i10);
        } else {
            LiteavLog.e(TAG, "setRecordSpeed is not supported in UGC_Smart license");
        }
    }

    public void setRenderRotation(int i10) {
        this.mUGCRecorder.setRenderRotation(i10);
    }

    public void setReverb(int i10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setReverb(i10);
        } else {
            LiteavLog.e(TAG, "setReverb is not supported in UGC_Smart license");
        }
    }

    @Deprecated
    public void setSpecialRatio(float f10) {
        this.mUGCRecorder.setSpecialRatio(f10);
    }

    public void setVideoBitrate(int i10) {
        this.mUGCRecorder.setVideoBitrate(i10);
    }

    public void setVideoEncoderMirror(boolean z10) {
        this.mUGCRecorder.setVideoEncoderMirror(z10);
    }

    public void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setVideoProcessListener(videoCustomProcessListener);
        } else {
            LiteavLog.e(TAG, "setVideoProcessListener is not supported in UGC_Smart license");
        }
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mUGCRecorder.setVideoRecordListener(iTXVideoRecordListener);
    }

    public void setVideoRenderMirrorType(int i10) {
        this.mUGCRecorder.setVideoRenderMirrorType(i10);
    }

    public void setVideoRenderMode(int i10) {
        this.mUGCRecorder.setVideoRenderMode(i10);
    }

    public void setVideoResolution(int i10) {
        this.mUGCRecorder.setVideoResolution(i10);
    }

    public void setVoiceChangerType(int i10) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setVoiceChangerType(i10);
        } else {
            LiteavLog.e(TAG, "setVoiceChangerType is not supported in UGC_Smart license");
        }
    }

    public void setWatermark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            this.mUGCRecorder.setWatermark(bitmap, tXRect);
        } else {
            LiteavLog.e(TAG, "setWatermark is not supported in UGC_Smart license");
        }
    }

    public boolean setZoom(int i10) {
        return this.mUGCRecorder.setZoom(i10);
    }

    public void snapshot(TXRecordCommon.ITXSnapshotListener iTXSnapshotListener) {
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mUGCRecorder.snapshot(iTXSnapshotListener);
        }
    }

    public int startCameraCustomPreview(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig, TXCloudVideoView tXCloudVideoView) {
        return this.mUGCRecorder.startCameraCustomPreview(tXUGCCustomConfig, tXCloudVideoView);
    }

    public int startCameraSimplePreview(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig, TXCloudVideoView tXCloudVideoView) {
        return this.mUGCRecorder.startCameraSimplePreview(tXUGCSimpleConfig, tXCloudVideoView);
    }

    public int startRecord() {
        if (UGCLicenseChecker.isSimpleFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            return this.mUGCRecorder.startRecord();
        }
        return -5;
    }

    public int startRecord(String str, String str2) {
        if (UGCLicenseChecker.isSimpleFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            return this.mUGCRecorder.startRecord(str, str2);
        }
        return -5;
    }

    public int startRecord(String str, String str2, String str3) {
        if (UGCLicenseChecker.isSimpleFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            return this.mUGCRecorder.startRecord(str, str2, str3);
        }
        return -5;
    }

    public boolean stopBGM() {
        if (UGCLicenseChecker.isStandardFunctionSupport()) {
            return this.mUGCRecorder.stopBGM();
        }
        LiteavLog.e(TAG, "stopBGM is not supported in UGC_Smart license");
        return false;
    }

    public void stopCameraPreview() {
        this.mUGCRecorder.stopCameraPreview();
    }

    public int stopRecord() {
        return this.mUGCRecorder.stopRecord();
    }

    public boolean switchCamera(boolean z10) {
        return this.mUGCRecorder.switchCamera(z10);
    }

    public boolean toggleTorch(boolean z10) {
        return this.mUGCRecorder.toggleTorch(z10);
    }
}
