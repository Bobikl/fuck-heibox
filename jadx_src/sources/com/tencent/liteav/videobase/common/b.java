package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    UNKNOWN(-1),
    HDR10(0),
    HLG(1),
    UNSUPPORTED(2);

    final int mValue;

    b(int i10) {
        this.mValue = i10;
    }

    public static b a(int i10) {
        if (i10 == 0) {
            return HDR10;
        }
        if (i10 != 1) {
            return i10 != 2 ? UNKNOWN : UNSUPPORTED;
        }
        return HLG;
    }
}
