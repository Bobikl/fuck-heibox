package com.ss.bytertc.engine.utils;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.base.utils.RtcContextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionChecker {
    @CalledByNative
    public static boolean checkAudioPermission() {
        return androidx.core.content.d.a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    @CalledByNative
    public static boolean checkCameraPermission() {
        return androidx.core.content.d.a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0;
    }
}
