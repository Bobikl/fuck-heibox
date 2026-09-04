package com.tencent.thumbplayer.tcmedia.api.capability;

/* JADX INFO: loaded from: classes4.dex */
public class TPVCodecCapabilityForGet {
    private static final int MAX_FRAME_RATE_FOR_LUMA_SAMPLES_DEFAULT = -1;
    private static final int MAX_LEVEL_DEFAULT = -1;
    private static final int MAX_LUMA_SAMPLES_DEFAULT = -1;
    private static final int MAX_PROFILE_DEFAULT = -1;
    public static final TPVCodecCapabilityForGet mDefaultVCodecCapability = new TPVCodecCapabilityForGet(-1, -1, -1, -1);
    private int maxFramerateFormaxLumaSamples;
    private int maxLevel;
    private int maxLumaSamples;
    private int maxProfile;

    public TPVCodecCapabilityForGet(int i10, int i11, int i12, int i13) {
        this.maxLumaSamples = i10;
        this.maxProfile = i11;
        this.maxLevel = i12;
        this.maxFramerateFormaxLumaSamples = i13;
    }

    public int getMaxFramerateFormaxLumaSamples() {
        return this.maxFramerateFormaxLumaSamples;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public int getMaxLumaSamples() {
        return this.maxLumaSamples;
    }

    public int getMaxProfile() {
        return this.maxProfile;
    }
}
