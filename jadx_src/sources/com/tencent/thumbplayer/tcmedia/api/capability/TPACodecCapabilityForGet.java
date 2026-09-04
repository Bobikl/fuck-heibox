package com.tencent.thumbplayer.tcmedia.api.capability;

/* JADX INFO: loaded from: classes4.dex */
public class TPACodecCapabilityForGet {
    private int maxBitrate;
    private int maxChannels;
    private int maxLevel;
    private int maxProfile;
    private int maxSamplerate;

    public TPACodecCapabilityForGet(int i10, int i11, int i12, int i13, int i14) {
        this.maxSamplerate = i10;
        this.maxChannels = i11;
        this.maxBitrate = i12;
        this.maxProfile = i13;
        this.maxLevel = i14;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getMaxChannels() {
        return this.maxChannels;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public int getMaxProfile() {
        return this.maxProfile;
    }

    public int getMaxSamplerate() {
        return this.maxSamplerate;
    }
}
