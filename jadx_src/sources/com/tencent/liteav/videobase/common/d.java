package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    UNKNOWN(0),
    BASELINE(1),
    MAIN(2),
    HIGH(3),
    BASELINE_RPS(11),
    MAIN_RPS(12),
    HIGH_RPS(13);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d[] f100330h = values();
    public final int mValue;

    d(int i10) {
        this.mValue = i10;
    }

    public static d a(int i10) {
        for (d dVar : f100330h) {
            if (dVar.mValue == i10) {
                return dVar;
            }
        }
        return UNKNOWN;
    }
}
