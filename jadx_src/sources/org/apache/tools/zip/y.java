package org.apache.tools.zip;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: ZipLong.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137529c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f137530d = 65280;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f137531e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f137532f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f137533g = 16711680;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f137534h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f137535i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f137536j = 4278190080L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f137537k = 24;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f137538l = new y(33639248);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y f137539m = new y(67324752);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y f137540n = new y(134695760);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final y f137541o = new y(KeyboardMap.kValueMask);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f137542b;

    public y(long j10) {
        this.f137542b = j10;
    }

    public y(byte[] bArr) {
        this(bArr, 0);
    }

    public y(byte[] bArr, int i10) {
        this.f137542b = e(bArr, i10);
    }

    public static byte[] b(long j10) {
        byte[] bArr = new byte[4];
        f(j10, bArr, 0);
        return bArr;
    }

    public static long d(byte[] bArr) {
        return e(bArr, 0);
    }

    public static long e(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] << com.google.common.base.a.B)) & f137536j) + ((long) ((bArr[i10 + 2] << 16) & f137533g)) + ((long) ((bArr[i10 + 1] << 8) & 65280)) + ((long) (bArr[i10] & 255));
    }

    public static void f(long j10, byte[] bArr, int i10) {
        int i11 = i10 + 1;
        bArr[i10] = (byte) (255 & j10);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((65280 & j10) >> 8);
        bArr[i12] = (byte) ((16711680 & j10) >> 16);
        bArr[i12 + 1] = (byte) ((j10 & f137536j) >> 24);
    }

    public byte[] a() {
        return b(this.f137542b);
    }

    public long c() {
        return this.f137542b;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && this.f137542b == ((y) obj).c();
    }

    public void g(byte[] bArr, int i10) {
        f(this.f137542b, bArr, i10);
    }

    public int hashCode() {
        return (int) this.f137542b;
    }

    public String toString() {
        return "ZipLong value: " + this.f137542b;
    }
}
