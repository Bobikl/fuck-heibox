package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class ServerVideoProducerConfig {
    private l gsensorRotationCorrection;
    private Boolean hardwareEncoderBitrateModeCBRSupported;
    private final String mTAG = "ServerVideoProducerConfig_" + hashCode();
    private int hardwareEncodeType = 2;
    private boolean hardwareEncoderHighProfileEnable = true;
    private boolean hardwareEncoderHighProfileSupport = true;
    private int camera2SupportMinApiLevel = Integer.MAX_VALUE;
    private int cameraRotationCorrection = 0;
    private boolean mEnableCameraFpsCorrectionLogic = true;

    private l cameraCloudConfigEnumToRotation(int i10) {
        if (i10 == 1) {
            return l.NORMAL;
        }
        if (i10 == 2) {
            return l.ROTATION_90;
        }
        if (i10 == 3) {
            return l.ROTATION_180;
        }
        if (i10 != 4) {
            return null;
        }
        return l.ROTATION_270;
    }

    public static boolean isHWHevcEncodeAllowed() {
        return nativeIsHardwareHevcEncodeAllowed();
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getCamera2SupportMinApiLevel() {
        return this.camera2SupportMinApiLevel;
    }

    public String getCameraRotationCorrectionInfo() {
        return "[CameraV1Front:" + getCameraV1FrontRotationCorrection() + ", CameraV1Back:" + getCameraV1BackRotationCorrection() + ", CameraV2Front:" + getCameraV2FrontRotationCorrection() + ", CameraV2Back:" + getCameraV2BackRotationCorrection() + "]";
    }

    public l getCameraV1BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 8) & 255);
    }

    public l getCameraV1FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation(this.cameraRotationCorrection & 255);
    }

    public l getCameraV2BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 24) & 255);
    }

    public l getCameraV2FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 16) & 255);
    }

    public l getGsensorRotationCorrection() {
        return this.gsensorRotationCorrection;
    }

    public boolean isCameraFpsCorrectionLogicEnabled() {
        return this.mEnableCameraFpsCorrectionLogic;
    }

    public boolean isHardwareEncoderAllowed() {
        return this.hardwareEncodeType != 0;
    }

    public Boolean isHardwareEncoderBitrateModeCBRSupported() {
        return this.hardwareEncoderBitrateModeCBRSupported;
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
        return this.hardwareEncodeType == 2 && this.hardwareEncoderHighProfileEnable && this.hardwareEncoderHighProfileSupport;
    }

    public void setCamera2SupportMinApiLevel(int i10) {
        this.camera2SupportMinApiLevel = i10;
    }

    public void setCameraFpsCorrectionLogicEnabled(boolean z10) {
        this.mEnableCameraFpsCorrectionLogic = z10;
        LiteavLog.i(this.mTAG, "set camera fps correction logic enabled value is ".concat(String.valueOf(z10)));
    }

    public void setCameraRotationCorrection(int i10) {
        this.cameraRotationCorrection = i10;
        LiteavLog.i(this.mTAG, "set camera rotation correction raw value is %#x.", Integer.valueOf(i10));
    }

    public void setGSensorRotationCorrection(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.gsensorRotationCorrection = l.a(i10 * 90);
    }

    public void setHardwareEncodeType(int i10) {
        this.hardwareEncodeType = i10;
    }

    public void setHardwareEncoderBitrateModeCBRSupported(boolean z10) {
        this.hardwareEncoderBitrateModeCBRSupported = Boolean.valueOf(z10);
    }

    public void setHardwareEncoderHighProfileEnable(boolean z10) {
        this.hardwareEncoderHighProfileEnable = z10;
    }

    public void setHardwareEncoderHighProfileSupport(boolean z10) {
        this.hardwareEncoderHighProfileSupport = z10;
    }

    public String toString() {
        return "hardwareEncodeType: " + this.hardwareEncodeType + ", hardwareEncoderHighProfileEnable: " + this.hardwareEncoderHighProfileEnable + ", hardwareEncoderHighProfileSupport: " + this.hardwareEncoderHighProfileSupport + ", camera2SupportMinApiLevel: " + this.camera2SupportMinApiLevel + ", hardwareEncoderBitrateModeCBRSupported: " + this.hardwareEncoderBitrateModeCBRSupported + ", gsensorRotationCorrection: " + this.gsensorRotationCorrection + ", cameraRotationCorrection: " + getCameraRotationCorrectionInfo();
    }
}
