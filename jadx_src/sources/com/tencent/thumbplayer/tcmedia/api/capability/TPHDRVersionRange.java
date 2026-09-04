package com.tencent.thumbplayer.tcmedia.api.capability;

/* JADX INFO: loaded from: classes4.dex */
public class TPHDRVersionRange {
    public int lowerboundAndroidAPILevel;
    public int lowerboundPatchVersion;
    public int lowerboundSystemVersion;
    public int upperboundAndroidAPILevel;
    public int upperboundPatchVersion;
    public int upperboundSystemVersion;

    public TPHDRVersionRange(int i10, int i11) {
        this.upperboundAndroidAPILevel = i10;
        this.lowerboundAndroidAPILevel = i11;
    }

    public TPHDRVersionRange(int i10, int i11, int i12, int i13) {
        this.upperboundSystemVersion = i10;
        this.lowerboundSystemVersion = i11;
        this.upperboundPatchVersion = i12;
        this.lowerboundPatchVersion = i13;
    }
}
