package com.tencent.ugc.videobase.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class MediaCodecAbility {
    private static final String TAG = "MediaCodecAbility";

    public static boolean isDecoderSupportHevc() {
        boolean z10;
        Throwable th2;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            z10 = false;
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                try {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (!mediaCodecInfo.isEncoder()) {
                        for (String str : supportedTypes) {
                            if (str.contains("video/hevc")) {
                                try {
                                    LiteavLog.i(TAG, "got hevc decoder:%s", mediaCodecInfo.getName());
                                    z10 = true;
                                    break;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    z10 = true;
                                    LiteavLog.e(TAG, "get hevc decode error ", th2);
                                    return z10;
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            z10 = false;
            th2 = th5;
        }
        return z10;
    }

    public static boolean isEncoderSupportHevc() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.contains("video/hevc")) {
                        LiteavLog.i(TAG, "Got hevc encoder");
                        return true;
                    }
                }
            }
        }
        LiteavLog.w(TAG, "not got hevc encoder");
        return false;
    }

    public static boolean isMediaCodecSWHevcDecodeSupport() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : supportedTypes) {
                        if (str.contains("video/hevc") && isSoftOnlyDecoder(mediaCodecInfo)) {
                            LiteavLog.i(TAG, "got soft only hevc decoder:%s", mediaCodecInfo.getName());
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "get hevc decode error ", th2);
        }
        return false;
    }

    public static boolean isSoftOnlyDecoder(MediaCodecInfo mediaCodecInfo) {
        if (LiteavSystemInfo.getSystemOSVersionInt() > 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        return mediaCodecInfo.getName().contains("android") || mediaCodecInfo.getName().contains("google");
    }
}
