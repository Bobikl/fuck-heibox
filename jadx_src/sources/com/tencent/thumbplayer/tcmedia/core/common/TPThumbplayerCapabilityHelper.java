package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPThumbplayerCapabilityHelper {
    public static boolean addACodecBlacklist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecBlacklist(i10, i11, tPACodecPropertyRange);
    }

    public static boolean addACodecWhitelist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecWhitelist(i10, i11, tPACodecPropertyRange);
    }

    public static boolean addDRMLevel1Blacklist(int i10) {
        return TPPlayerDecoderCapability.addDRMLevel1Blacklist(i10);
    }

    public static boolean addHDRBlackList(int i10, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRBlackList(i10, tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i10, int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRVideoDecoderTypeWhiteList(i10, i11, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i10, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRWhiteList(i10, tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecBlacklist(i10, i11, tPVCodecPropertyRange);
    }

    public static boolean addVCodecWhitelist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecWhitelist(i10, i11, tPVCodecPropertyRange);
    }

    public static int[] getDRMCapabilities() {
        return TPDrm.getDRMCapabilities();
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i10) {
        return TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(i10);
    }

    public static TPCodecCapability.TPCodecMaxCapability getVCodecMaxCapability(int i10) throws TPNativeLibraryException {
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability;
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2;
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap = TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(102);
        HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap2 = TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(101);
        if (vCodecDecoderMaxCapabilityMap != null && (tPCodecMaxCapability2 = vCodecDecoderMaxCapabilityMap.get(Integer.valueOf(i10))) != null) {
            tPCodecMaxCapability3 = tPCodecMaxCapability2;
        }
        return (vCodecDecoderMaxCapabilityMap2 == null || (tPCodecMaxCapability = vCodecDecoderMaxCapabilityMap2.get(Integer.valueOf(i10))) == null || tPCodecMaxCapability.maxLumaSamples <= tPCodecMaxCapability3.maxLumaSamples) ? tPCodecMaxCapability3 : tPCodecMaxCapability;
    }

    public static synchronized void init(Context context, boolean z10) {
        TPPlayerDecoderCapability.init(context, z10);
    }

    public static boolean isACodecCapabilityCanSupport(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (isACodecCapabilitySupport(1, i10, i11, i12, i13, i14, i15)) {
            return true;
        }
        return isACodecCapabilitySupport(102, i10, i11, i12, i13, i14, i15);
    }

    public static boolean isACodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return TPPlayerDecoderCapability.isACodecCapabilitySupport(i10, i11, i12, i13, i14, i15, i16);
    }

    public static boolean isDDPlusSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDDSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDRMsupport(int i10) {
        int[] dRMCapabilities = getDRMCapabilities();
        if (dRMCapabilities.length == 0) {
            return false;
        }
        for (int i11 : dRMCapabilities) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDolbyDSSupported() {
        return TPPlayerDecoderCapability.isDolbyDSSupported();
    }

    public static boolean isFeatureSupport(int i10) {
        return TPFeatureCapability.isFeatureSupport(i10);
    }

    public static boolean isHDRsupport(int i10, int i11, int i12) {
        return TPPlayerDecoderCapability.isHDRsupport(i10, i11, i12);
    }

    public static boolean isSupportMediaCodecRotateInternal() {
        return true;
    }

    public static boolean isSupportNativeMediaCodec() {
        return true;
    }

    public static boolean isSupportSetOutputSurfaceApi() {
        return true;
    }

    @Deprecated
    public static boolean isVCodecCapabilityCanSupport(int i10, int i11, int i12, int i13, int i14) {
        return isVCodecCapabilityCanSupport(i10, i11, i12, i13, i14, 30);
    }

    public static boolean isVCodecCapabilityCanSupport(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (isVCodecCapabilitySupport(101, i10, i11, i12, i13, i14, i15)) {
            return true;
        }
        return isVCodecCapabilitySupport(102, i10, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public static boolean isVCodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15) {
        return isVCodecCapabilitySupport(i10, i11, i12, i13, i14, i15, 30);
    }

    public static boolean isVCodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return TPPlayerDecoderCapability.isVCodecCapabilitySupport(i10, i11, i12, i13, i14, i15, i16);
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z10) {
        TPPlayerDecoderCapability.setMediaCodecPreferredSoftwareComponent(z10);
    }
}
