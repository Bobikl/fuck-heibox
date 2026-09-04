package com.tencent.liteav.videobase.common;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display$HdrCapabilities;
import android.view.WindowManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.m;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class HDRCapability {
    private static final String TAG = "HDRCapability";
    private static Boolean sIsHDR10Supported;
    private static final m sSequenceTaskRunner = new m();

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIsHDR10Supported() {
        synchronized (HDRCapability.class) {
            if (sIsHDR10Supported != null) {
                return;
            }
            try {
                boolean zIsDisplaySupportHDR10 = isDisplaySupportHDR10();
                boolean zIsDecoderSupportHDR10 = isDecoderSupportHDR10();
                synchronized (HDRCapability.class) {
                    Boolean boolValueOf = Boolean.valueOf(zIsDisplaySupportHDR10 && zIsDecoderSupportHDR10);
                    sIsHDR10Supported = boolValueOf;
                    LiteavLog.i(TAG, "the device supports hdr10 %b", boolValueOf);
                }
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "check hdr capability error ", th2);
            }
        }
    }

    private static boolean hasHDR10ProfileLevel(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 4096) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDecoderSupportHDR10() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc") && hasHDR10ProfileLevel(mediaCodecInfo.getCapabilitiesForType("video/hevc").profileLevels)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isDisplaySupportHDR10() {
        WindowManager windowManager;
        Display$HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return false;
        }
        for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean isHDRSupported(int i10) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return false;
        }
        if (i10 != b.HDR10.mValue) {
            return false;
        }
        Boolean bool = sIsHDR10Supported;
        if (bool != null) {
            return bool.booleanValue();
        }
        sSequenceTaskRunner.a(a.a());
        return false;
    }
}
