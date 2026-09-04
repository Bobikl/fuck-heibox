package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class NativeCapturerParamCreator {
    public static Boolean createBooleanWithValue(boolean z10) {
        return Boolean.valueOf(z10);
    }

    public static CameraCaptureParams createCameraParams(Boolean bool, int i10, int i11, int i12) {
        CameraCaptureParams cameraCaptureParams = new CameraCaptureParams();
        cameraCaptureParams.f100680a = bool;
        cameraCaptureParams.f100686b = i10;
        cameraCaptureParams.f100687c = i11;
        cameraCaptureParams.f100688d = i12;
        return cameraCaptureParams;
    }
}
