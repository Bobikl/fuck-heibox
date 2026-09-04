package com.umeng.analytics.pro;

/* JADX INFO: compiled from: EncodingUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class aq {
    public static final byte a(byte b10, int i10, boolean z10) {
        return (byte) a((int) b10, i10, z10);
    }

    public static final int a(int i10, int i11, boolean z10) {
        return z10 ? i10 | (1 << i11) : b(i10, i11);
    }

    public static final int a(byte[] bArr) {
        return a(bArr, 0);
    }

    public static final int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static final long a(long j10, int i10, boolean z10) {
        return z10 ? j10 | (1 << i10) : b(j10, i10);
    }

    public static final short a(short s10, int i10, boolean z10) {
        return (short) a((int) s10, i10, z10);
    }

    public static final void a(int i10, byte[] bArr) {
        a(i10, bArr, 0);
    }

    public static final void a(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
    }

    public static final boolean a(byte b10, int i10) {
        return a((int) b10, i10);
    }

    public static final boolean a(int i10, int i11) {
        return (i10 & (1 << i11)) != 0;
    }

    public static final boolean a(long j10, int i10) {
        return (j10 & (1 << i10)) != 0;
    }

    public static final boolean a(short s10, int i10) {
        return a((int) s10, i10);
    }

    public static final byte b(byte b10, int i10) {
        return (byte) b((int) b10, i10);
    }

    public static final int b(int i10, int i11) {
        return i10 & (~(1 << i11));
    }

    public static final long b(long j10, int i10) {
        return j10 & (~(1 << i10));
    }

    public static final short b(short s10, int i10) {
        return (short) b((int) s10, i10);
    }
}
