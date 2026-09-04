package com.tencent.thumbplayer.tcmedia.api.capability;

import com.tencent.thumbplayer.tcmedia.adapter.a.b.a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPNativeException;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecCapability;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPCapability {
    public static boolean addACodecBlacklist(@TPCommonEnum.TP_AUDIO_DECODER_TYPE int i10, @TPCommonEnum.TP_AUDIO_CODEC_TYPE int i11, TPACodecCapabilityForSet tPACodecCapabilityForSet) throws TPNativeException {
        TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange = new TPCodecCapability.TPACodecPropertyRange();
        tPACodecPropertyRange.set(tPACodecCapabilityForSet.getUpperboundSamplerate(), tPACodecCapabilityForSet.getUpperboundChannels(), tPACodecCapabilityForSet.getUpperboundBitrate(), tPACodecCapabilityForSet.getLowerboundSamplerate(), tPACodecCapabilityForSet.getLowerboundChannels(), tPACodecCapabilityForSet.getLowerboundBitrate(), tPACodecCapabilityForSet.getProfileForSet(), tPACodecCapabilityForSet.getLevelForSet());
        try {
            return TPThumbplayerCapabilityHelper.addACodecBlacklist(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapAudioDecoderType.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapAudioCodecType.class, i11), tPACodecPropertyRange);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean addACodecWhitelist(@TPCommonEnum.TP_AUDIO_DECODER_TYPE int i10, @TPCommonEnum.TP_AUDIO_CODEC_TYPE int i11, TPACodecCapabilityForSet tPACodecCapabilityForSet) throws TPNativeException {
        TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange = new TPCodecCapability.TPACodecPropertyRange();
        tPACodecPropertyRange.set(tPACodecCapabilityForSet.getUpperboundSamplerate(), tPACodecCapabilityForSet.getUpperboundChannels(), tPACodecCapabilityForSet.getUpperboundBitrate(), tPACodecCapabilityForSet.getLowerboundSamplerate(), tPACodecCapabilityForSet.getLowerboundChannels(), tPACodecCapabilityForSet.getLowerboundBitrate(), tPACodecCapabilityForSet.getProfileForSet(), tPACodecCapabilityForSet.getLevelForSet());
        try {
            return TPThumbplayerCapabilityHelper.addACodecWhitelist(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapAudioDecoderType.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapAudioCodecType.class, i11), tPACodecPropertyRange);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean addDRMLevel1Blacklist(@TPCommonEnum.TP_DRM_TYPE int i10) {
        return TPThumbplayerCapabilityHelper.addDRMLevel1Blacklist(i10);
    }

    public static boolean addHDRBlackList(@TPCommonEnum.TP_HDR_TYPE int i10, TPHDRVersionRange tPHDRVersionRange) {
        return TPThumbplayerCapabilityHelper.addHDRBlackList(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapHdrType.class, i10), new TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion));
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(@TPCommonEnum.TP_HDR_TYPE int i10, @TPCommonEnum.TP_VIDEO_DECODER_TYPE int i11, TPHDRVersionRange tPHDRVersionRange) {
        TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = new TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion);
        tPHdrSupportVersionRange.lowerboundAndroidAPILevel = 0;
        tPHdrSupportVersionRange.upperboundAndroidAPILevel = 999;
        return TPThumbplayerCapabilityHelper.addHDRVideoDecoderTypeWhiteList(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapHdrType.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapVideoDecoderType.class, i11), tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(@TPCommonEnum.TP_HDR_TYPE int i10, TPHDRVersionRange tPHDRVersionRange) {
        return TPThumbplayerCapabilityHelper.addHDRWhiteList(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapHdrType.class, i10), new TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion));
    }

    public static boolean addVCodecBlacklist(@TPCommonEnum.TP_VIDEO_DECODER_TYPE int i10, @TPCommonEnum.TP_VIDEO_CODEC_TYPE int i11, TPVCodecCapabilityForSet tPVCodecCapabilityForSet) throws TPNativeException {
        TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange = new TPCodecCapability.TPVCodecPropertyRange();
        tPVCodecPropertyRange.set(tPVCodecCapabilityForSet.getUpperboundWidth(), tPVCodecCapabilityForSet.getUpperboundHeight(), tPVCodecCapabilityForSet.getLowerboundWidth(), tPVCodecCapabilityForSet.getLowerboundHeight(), tPVCodecCapabilityForSet.getProfile(), tPVCodecCapabilityForSet.getLevel());
        try {
            return TPThumbplayerCapabilityHelper.addVCodecBlacklist(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapVideoDecoderType.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, i11), tPVCodecPropertyRange);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean addVCodecWhitelist(@TPCommonEnum.TP_VIDEO_DECODER_TYPE int i10, @TPCommonEnum.TP_VIDEO_CODEC_TYPE int i11, TPVCodecCapabilityForSet tPVCodecCapabilityForSet) throws TPNativeException {
        TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange = new TPCodecCapability.TPVCodecPropertyRange();
        tPVCodecPropertyRange.set(tPVCodecCapabilityForSet.getUpperboundWidth(), tPVCodecCapabilityForSet.getUpperboundHeight(), tPVCodecCapabilityForSet.getLowerboundWidth(), tPVCodecCapabilityForSet.getLowerboundHeight(), tPVCodecCapabilityForSet.getProfile(), tPVCodecCapabilityForSet.getLevel());
        try {
            return TPThumbplayerCapabilityHelper.addVCodecWhitelist(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapVideoDecoderType.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, i11), tPVCodecPropertyRange);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static int[] getDRMCapabilities() {
        return a.a();
    }

    public static TPVCodecCapabilityForGet getThumbPlayerVCodecMaxCapability(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i10) throws TPNativeException {
        if (!TPPlayerMgr.isThumbPlayerEnable()) {
            return TPVCodecCapabilityForGet.mDefaultVCodecCapability;
        }
        try {
            TPCodecCapability.TPCodecMaxCapability vCodecMaxCapability = TPThumbplayerCapabilityHelper.getVCodecMaxCapability(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, i10));
            return vCodecMaxCapability == null ? TPVCodecCapabilityForGet.mDefaultVCodecCapability : new TPVCodecCapabilityForGet(vCodecMaxCapability.maxLumaSamples, vCodecMaxCapability.maxProfile, vCodecMaxCapability.maxLevel, vCodecMaxCapability.maxFramerateFormaxLumaSamples);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static TPVCodecCapabilityForGet getThumbPlayerVCodecTypeMaxCapability(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i10, @TPCommonEnum.TP_VIDEO_DECODER_TYPE int i11) throws TPNativeException {
        if (!TPNativeLibraryLoader.isLibLoadedAndTryToLoad()) {
            return TPVCodecCapabilityForGet.mDefaultVCodecCapability;
        }
        try {
            HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap = TPThumbplayerCapabilityHelper.getVCodecDecoderMaxCapabilityMap(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapVideoDecoderType.class, i11));
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, i10);
            if (vCodecDecoderMaxCapabilityMap == null || vCodecDecoderMaxCapabilityMap.isEmpty()) {
                return TPVCodecCapabilityForGet.mDefaultVCodecCapability;
            }
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = vCodecDecoderMaxCapabilityMap.get(Integer.valueOf(nativeIntValue));
            return tPCodecMaxCapability == null ? TPVCodecCapabilityForGet.mDefaultVCodecCapability : new TPVCodecCapabilityForGet(tPCodecMaxCapability.maxLumaSamples, tPCodecMaxCapability.maxProfile, tPCodecMaxCapability.maxLevel, tPCodecMaxCapability.maxFramerateFormaxLumaSamples);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean isACodecCapabilityCanSupport(@TPCommonEnum.TP_AUDIO_CODEC_TYPE int i10, int i11, int i12, int i13, int i14, int i15) throws TPNativeException {
        if (!TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return TPThumbplayerCapabilityHelper.isACodecCapabilityCanSupport(i10, i11, i12, i13, i14, i15);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean isDDPlusSupported() {
        if (TPPlayerMgr.isThumbPlayerEnable()) {
            return TPThumbplayerCapabilityHelper.isDDPlusSupported();
        }
        return false;
    }

    public static boolean isDDSupported() {
        if (TPPlayerMgr.isThumbPlayerEnable()) {
            return TPThumbplayerCapabilityHelper.isDDSupported();
        }
        return false;
    }

    public static boolean isDRMsupport(@TPCommonEnum.TP_DRM_TYPE int i10) {
        return a.a(i10);
    }

    public static boolean isDolbyDSSupported() {
        if (TPPlayerMgr.isThumbPlayerEnable()) {
            return TPThumbplayerCapabilityHelper.isDolbyDSSupported();
        }
        return false;
    }

    public static boolean isDolbyVisionSupported() {
        return false;
    }

    public static boolean isFeatureSupport(@TPCommonEnum.InnerFeatureType int i10) throws TPNativeException {
        if (!TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return TPThumbplayerCapabilityHelper.isFeatureSupport(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapFeatureType.class, i10));
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean isHDRsupport(@TPCommonEnum.TP_HDR_TYPE int i10, int i11, int i12) {
        if (TPPlayerMgr.isThumbPlayerEnable()) {
            return TPThumbplayerCapabilityHelper.isHDRsupport(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapHdrType.class, i10), i11, i12);
        }
        return false;
    }

    public static boolean isVCodecCapabilityCanSupport(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i10, int i11, int i12, int i13, int i14, int i15) throws TPNativeException {
        if (!TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilityCanSupport(i10, i11, i12, 0, 0, i15);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static boolean isVCodecCapabilityCanSupport(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws TPNativeException {
        if (!TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(i11, i10, i12, i13, 0, 0, i16);
        } catch (TPNativeLibraryException e10) {
            throw new TPNativeException(e10);
        }
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z10) {
        if (TPPlayerMgr.isThumbPlayerEnable()) {
            TPThumbplayerCapabilityHelper.setMediaCodecPreferredSoftwareComponent(z10);
        }
    }
}
