package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    UNKNOWN(65535),
    IDR(0),
    P(1),
    B(6),
    P_MULTI_REF(7),
    I(8),
    SEI(17),
    SPS(18),
    PPS(19),
    VPS(20);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c[] f100321k = values();
    public final int mValue;

    c(int i10) {
        this.mValue = i10;
    }

    public static c a(int i10) {
        for (c cVar : f100321k) {
            if (cVar.mValue == i10) {
                return cVar;
            }
        }
        return UNKNOWN;
    }

    public final boolean a() {
        return this == IDR;
    }
}
