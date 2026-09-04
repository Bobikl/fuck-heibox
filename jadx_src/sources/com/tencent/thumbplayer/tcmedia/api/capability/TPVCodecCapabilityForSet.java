package com.tencent.thumbplayer.tcmedia.api.capability;

/* JADX INFO: loaded from: classes4.dex */
public class TPVCodecCapabilityForSet {
    private int level;
    private int lowerboundHeight;
    private int lowerboundWidth;
    private int profile;
    private int upperboundHeight;
    private int upperboundWidth;

    public TPVCodecCapabilityForSet(int i10, int i11) {
        this.upperboundWidth = i10;
        this.upperboundHeight = i11;
        this.lowerboundWidth = 0;
        this.lowerboundHeight = 0;
        this.profile = -1;
        this.level = -1;
    }

    public TPVCodecCapabilityForSet(int i10, int i11, int i12) {
        this.upperboundWidth = i10;
        this.upperboundHeight = i11;
        this.profile = i12;
        this.lowerboundWidth = 0;
        this.lowerboundHeight = 0;
        this.level = -1;
    }

    public TPVCodecCapabilityForSet(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.upperboundWidth = i10;
        this.upperboundHeight = i11;
        this.lowerboundWidth = i12;
        this.lowerboundHeight = i13;
        this.profile = i14;
        this.level = i15;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLowerboundHeight() {
        return this.lowerboundHeight;
    }

    public int getLowerboundWidth() {
        return this.lowerboundWidth;
    }

    public int getProfile() {
        return this.profile;
    }

    public int getUpperboundHeight() {
        return this.upperboundHeight;
    }

    public int getUpperboundWidth() {
        return this.upperboundWidth;
    }
}
