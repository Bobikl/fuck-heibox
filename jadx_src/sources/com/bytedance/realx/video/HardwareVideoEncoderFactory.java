package com.bytedance.realx.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class HardwareVideoEncoderFactory {
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HwVideoEncoderFactory";

    /* JADX INFO: renamed from: com.bytedance.realx.video.HardwareVideoEncoderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard;

        static {
            int[] iArr = new int[RXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard = iArr;
            try {
                iArr[RXVideoCodecStandard.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.ByteVC1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @CalledByNative
    @p0
    public static VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = standard.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat == null) {
            Log.e(TAG, "surfaceColorFormat is null object.");
            return null;
        }
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(name.contains("OMX.hisi.") ? MediaCodecUtils.ENCODER_COLOR_FORMATS_FOR_HISI : MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat2 != null) {
            return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc, numSelectColorFormat, numSelectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name));
        }
        Log.e(TAG, "yuvColorFormat is null object.");
        return null;
    }

    @p0
    private static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo codecInfoAt;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                } catch (IllegalArgumentException e10) {
                    Log.e(TAG, "Cannot retrieve encoder codec info", e10);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && codecInfoAt.isEncoder() && !isSoftwareOnly(codecInfoAt) && isSupportedCodec(codecInfoAt, rXVideoCodecStandard)) {
                    return codecInfoAt;
                }
            }
            return null;
        } catch (Exception e11) {
            Log.e(TAG, "Cannot getCodecCount", e11);
            return null;
        }
    }

    private static int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard != RXVideoCodecStandard.VP8 || !str.startsWith("OMX.qcom.")) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return 20000;
        }
        return i10 > 23 ? 15000 : 0;
    }

    private static int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        int i10 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 720;
        }
        if (i10 == 3 || i10 == 4) {
            return 100;
        }
        throw new IllegalArgumentException("Unsupported VideoCodecType " + rXVideoCodecStandard);
    }

    @CalledByNative
    public static RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.ByteVC1, RXVideoCodecStandard.H264, RXVideoCodecStandard.VP8};
        for (int i10 = 0; i10 < 3; i10++) {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[i10];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(rXVideoCodecStandard);
            if (mediaCodecInfoFindCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.ByteVC1 && isSupportedCodec(mediaCodecInfoFindCodecForType, rXVideoCodecStandard)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ByteVC1ProfileMain));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264) {
                    if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                        arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                    }
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.VP8) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.VP8ProfileMain));
                }
            }
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    @w0(api = 21)
    public static boolean isBitrateModeSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard, int i10) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        if (capabilitiesForType == null) {
            RXLogging.e(TAG, "get capability return null.");
            return false;
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            return encoderCapabilities.isBitrateModeSupported(i10);
        }
        RXLogging.e(TAG, "get EncoderCapabilities return null.");
        return false;
    }

    private static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String strGetDeviceModel = RXDeviceInfoAndroid.GetDeviceModel();
        String strGetDeviceBrand = RXDeviceInfoAndroid.GetDeviceBrand();
        if (RXDeviceInfoAndroid.GetCpuModel().contains("Amlogic")) {
            return false;
        }
        return !(strGetDeviceModel.equalsIgnoreCase("T730") && strGetDeviceBrand.equalsIgnoreCase("VHD")) && Build.VERSION.SDK_INT > 23;
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        int i10 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i10 == 1) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i10 == 2) {
            return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
        }
        if (i10 != 3) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkVP8(mediaCodecInfo);
    }

    private static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.sprd.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    private static boolean isHardwareSupportedInCurrentSdkVP8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        name.startsWith("OMX.Intel.");
        return true;
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
        } catch (Exception e10) {
            RXLogging.e(TAG, "check encoder softonly error.", e10);
            return false;
        }
    }

    private static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
