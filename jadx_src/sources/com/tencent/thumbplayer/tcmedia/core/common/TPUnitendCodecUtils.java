package com.tencent.thumbplayer.tcmedia.core.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPUnitendCodecUtils {
    private static int DolbyVisionProfileDvavPen = 1;
    private static int DolbyVisionProfileDvavPer = 0;
    private static int DolbyVisionProfileDvavSe = 9;
    private static int DolbyVisionProfileDvheDen = 3;
    private static int DolbyVisionProfileDvheDer = 2;
    private static int DolbyVisionProfileDvheDtb = 7;
    private static int DolbyVisionProfileDvheDth = 6;
    private static int DolbyVisionProfileDvheDtr = 4;
    private static int DolbyVisionProfileDvheSt = 8;
    private static int DolbyVisionProfileDvheStn = 5;
    private static HashMap<String, String> mSecureDecoderNameMaps;

    public static int convertOmxProfileToDolbyVision(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = DolbyVisionProfileDvavPer;
        } else if (i10 == 2) {
            i11 = DolbyVisionProfileDvavPen;
        } else if (i10 == 4) {
            i11 = DolbyVisionProfileDvheDer;
        } else if (i10 == 8) {
            i11 = DolbyVisionProfileDvheDen;
        } else if (i10 == 16) {
            i11 = DolbyVisionProfileDvheDtr;
        } else if (i10 == 32) {
            i11 = DolbyVisionProfileDvheStn;
        } else if (i10 == 64) {
            i11 = DolbyVisionProfileDvheDth;
        } else if (i10 == 128) {
            i11 = DolbyVisionProfileDvheDtb;
        } else if (i10 != 256) {
            i11 = i10 != 512 ? 0 : DolbyVisionProfileDvavSe;
        } else {
            i11 = DolbyVisionProfileDvheSt;
        }
        TPNativeLog.printLog(2, "TPUnitendCodecUtils", "convertOmxProfileToDolbyVision omxProfile:" + i10 + " dolbyVisionProfile:" + i11);
        return i11;
    }

    public static synchronized String getDolbyVisionDecoderName(String str, int i10, int i11, boolean z10) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities codecCapabilities = null;
        if (!TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        int length = codecInfos.length;
        String name = null;
        int i12 = 0;
        while (i12 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i12];
            TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:" + mediaCodecInfo.getName());
            if (!mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                } catch (Exception unused) {
                    capabilitiesForType = codecCapabilities;
                }
                if (capabilitiesForType != null) {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    for (int i13 = 0; i13 < codecProfileLevelArr.length; i13++) {
                        int iConvertOmxProfileToDolbyVision = convertOmxProfileToDolbyVision(codecProfileLevelArr[i13].profile);
                        if (iConvertOmxProfileToDolbyVision == i10) {
                            TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName i:" + i13 + " profile:" + iConvertOmxProfileToDolbyVision + " dvProfile:" + i10 + " bSecure:" + z10 + " name:" + mediaCodecInfo.getName());
                            if (!z10 || capabilitiesForType.isFeatureSupported("secure-playback")) {
                                name = mediaCodecInfo.getName();
                                break;
                            }
                        }
                    }
                    if (name != null) {
                        TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:".concat(name));
                        break;
                    }
                } else {
                    continue;
                }
            }
            i12++;
            codecCapabilities = null;
        }
        return name;
    }

    public static synchronized String getSecureDecoderName(String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        String name = null;
        if (!TextUtils.equals("video/avc", str) && !TextUtils.equals("video/hevc", str) && !TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        if (mSecureDecoderNameMaps == null) {
            mSecureDecoderNameMaps = new HashMap<>();
        }
        if (mSecureDecoderNameMaps.containsKey(str)) {
            return mSecureDecoderNameMaps.get(str);
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                } catch (Exception unused) {
                    capabilitiesForType = null;
                }
                if (capabilitiesForType != null && capabilitiesForType.isFeatureSupported("secure-playback")) {
                    name = mediaCodecInfo.getName();
                    break;
                }
            }
        }
        mSecureDecoderNameMaps.put(str, name);
        return name;
    }
}
