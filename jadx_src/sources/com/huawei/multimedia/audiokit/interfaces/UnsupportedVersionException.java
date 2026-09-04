package com.huawei.multimedia.audiokit.interfaces;

import com.huawei.multimedia.audiokit.utils.LogUtils;

/* JADX INFO: loaded from: classes7.dex */
public class UnsupportedVersionException extends Exception {
    private static final String TAG = "HwAudioKit.UnsupportedVersionException";

    public UnsupportedVersionException() {
        LogUtils.error(TAG, "getEnhancedDeviceInfo UnsupportedVersionException");
    }
}
