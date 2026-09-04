package com.umeng.commonsdk.config;

/* JADX INFO: compiled from: BitUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean a(int i10, int i11) {
        return i11 >= 0 && i11 <= 31 && (i10 & (1 << i11)) != 0;
    }

    public static boolean a(long j10, int i10) {
        return i10 >= 0 && i10 <= 63 && (j10 & (1 << i10)) != 0;
    }

    public static int b(int i10, int i11) {
        return i10 | (1 << i11);
    }

    public static long b(long j10, int i10) {
        return (i10 < 0 || i10 > 63) ? j10 : j10 | (1 << i10);
    }

    public static int c(int i10, int i11) {
        return i10 & (~(1 << i11));
    }

    public static long c(long j10, int i10) {
        return (i10 < 0 || i10 > 63) ? j10 : j10 & (~(1 << i10));
    }
}
