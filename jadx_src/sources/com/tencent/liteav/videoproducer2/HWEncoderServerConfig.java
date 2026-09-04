package com.tencent.liteav.videoproducer2;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class HWEncoderServerConfig {
    private Boolean hardwareEncoderBitrateModeCBRSupported;
    private int mHardwareEncodeType = 2;
    private boolean mHardwareEncoderHighProfileEnable = true;
    private boolean mHardwareEncoderHighProfileSupport = true;

    public static boolean isHWHevcEncodeAllowed() {
        return nativeIsHardwareHevcEncodeAllowed();
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getHardwareEncodeType() {
        return this.mHardwareEncodeType;
    }

    public boolean getHardwareEncoderHighProfileEnable() {
        return this.mHardwareEncoderHighProfileEnable;
    }

    public boolean getHardwareEncoderHighProfileSupport() {
        return this.mHardwareEncoderHighProfileSupport;
    }

    public boolean isHardwareEncoderAllowed() {
        return this.mHardwareEncodeType != 0;
    }

    public Boolean isHardwareEncoderBitrateModeCBRSupported() {
        return this.hardwareEncoderBitrateModeCBRSupported;
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
        return this.mHardwareEncodeType == 2 && this.mHardwareEncoderHighProfileEnable && this.mHardwareEncoderHighProfileSupport;
    }

    public void setHardwareEncodeType(int i10) {
        this.mHardwareEncodeType = i10;
    }

    public void setHardwareEncoderBitrateModeCBRSupported(boolean z10) {
        this.hardwareEncoderBitrateModeCBRSupported = Boolean.valueOf(z10);
    }

    public void setHardwareEncoderHighProfileEnable(boolean z10) {
        this.mHardwareEncoderHighProfileEnable = z10;
    }

    public void setHardwareEncoderHighProfileSupport(boolean z10) {
        this.mHardwareEncoderHighProfileSupport = z10;
    }
}
