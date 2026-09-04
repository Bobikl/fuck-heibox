package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class MediaCodecAbility {
    private static final String TAG = "MediaCodecAbility";

    public static int getMediaCodecDecoderSupportLowResolution() {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return 0;
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = MediaCodec.createDecoderByType("video/avc").getCodecInfo().getCapabilitiesForType("video/avc");
            if (capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) {
                return 0;
            }
            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
            Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
            if (supportedWidths != null && supportedHeights != null) {
                return Math.max(((Integer) supportedWidths.getLower()).intValue(), ((Integer) supportedHeights.getLower()).intValue());
            }
            return 0;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "get low resolution error:".concat(String.valueOf(th2)));
            return 0;
        }
    }

    public static boolean isDecoderSupportHevc() {
        boolean z10;
        Object th2;
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
                                    LiteavLog.e(TAG, "get hevc decode error:".concat(String.valueOf(th2)));
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
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.contains("video/hevc")) {
                            LiteavLog.i(TAG, "get hevc encoder");
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.w(TAG, "failed to get hevc encoder:".concat(String.valueOf(th2)));
        }
        LiteavLog.w(TAG, "not got hevc encoder");
        return false;
    }

    public static boolean isMediaCodecDecodeSupportSWHevc() {
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
            LiteavLog.e(TAG, "get hevc decode error:".concat(String.valueOf(th2)));
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
