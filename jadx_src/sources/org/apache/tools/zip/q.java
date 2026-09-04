package org.apache.tools.zip;

import java.math.BigInteger;

/* JADX INFO: compiled from: ZipEightByteInteger.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f137444b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137445c = 65280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f137446d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f137447e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f137448f = 16711680;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f137449g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f137450h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f137451i = 4278190080L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f137452j = 24;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f137453k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f137454l = 1095216660480L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f137455m = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f137456n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f137457o = 280375465082880L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f137458p = 40;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f137459q = 6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f137460r = 71776119061217280L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f137461s = 48;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f137462t = 7;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f137463u = 9151314442816847872L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f137464v = 56;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f137465w = 63;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte f137466x = -128;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q f137467y = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigInteger f137468a;

    public q(long j10) {
        this(BigInteger.valueOf(j10));
    }

    public q(BigInteger bigInteger) {
        this.f137468a = bigInteger;
    }

    public q(byte[] bArr) {
        this(bArr, 0);
    }

    public q(byte[] bArr, int i10) {
        this.f137468a = i(bArr, i10);
    }

    public static byte[] b(long j10) {
        return c(BigInteger.valueOf(j10));
    }

    public static byte[] c(BigInteger bigInteger) {
        long jLongValue = bigInteger.longValue();
        byte[] bArr = {(byte) (255 & jLongValue), (byte) ((65280 & jLongValue) >> 8), (byte) ((16711680 & jLongValue) >> 16), (byte) ((f137451i & jLongValue) >> 24), (byte) ((f137454l & jLongValue) >> 32), (byte) ((f137457o & jLongValue) >> 40), (byte) ((f137460r & jLongValue) >> 48), (byte) ((jLongValue & f137463u) >> 56)};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | (-128));
        }
        return bArr;
    }

    public static long e(byte[] bArr) {
        return f(bArr, 0);
    }

    public static long f(byte[] bArr, int i10) {
        return i(bArr, i10).longValue();
    }

    public static BigInteger h(byte[] bArr) {
        return i(bArr, 0);
    }

    public static BigInteger i(byte[] bArr, int i10) {
        int i11 = i10 + 7;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(((((long) bArr[i11]) << 56) & f137463u) + ((((long) bArr[i10 + 6]) << 48) & f137460r) + ((((long) bArr[i10 + 5]) << 40) & f137457o) + ((((long) bArr[i10 + 4]) << 32) & f137454l) + ((((long) bArr[i10 + 3]) << 24) & f137451i) + ((((long) bArr[i10 + 2]) << 16) & 16711680) + ((((long) bArr[i10 + 1]) << 8) & 65280) + (((long) bArr[i10]) & 255));
        return (bArr[i11] & (-128)) == -128 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public byte[] a() {
        return c(this.f137468a);
    }

    public long d() {
        return this.f137468a.longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && this.f137468a.equals(((q) obj).g());
    }

    public BigInteger g() {
        return this.f137468a;
    }

    public int hashCode() {
        return this.f137468a.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.f137468a;
    }
}
