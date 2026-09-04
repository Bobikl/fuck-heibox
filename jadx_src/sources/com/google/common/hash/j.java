package com.google.common.hash;

import com.google.common.base.w;

/* JADX INFO: compiled from: Fingerprint2011.java */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class j extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final k f58580b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f58581c = -6505348102511208375L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f58582d = -8261664234251669945L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f58583e = -4288712594273399085L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f58584f = -4132994306676758123L;

    j() {
    }

    @o9.d
    static long l(byte[] bArr, int i10, int i11) {
        long jO;
        if (i11 <= 32) {
            jO = p(bArr, i10, i11, -1397348546323613475L);
        } else {
            jO = i11 <= 64 ? o(bArr, i10, i11) : m(bArr, i10, i11);
        }
        long jB = f58581c;
        long jB2 = i11 >= 8 ? LittleEndianByteArray.b(bArr, i10) : -6505348102511208375L;
        if (i11 >= 9) {
            jB = LittleEndianByteArray.b(bArr, (i10 + i11) - 8);
        }
        long jN = n(jO + jB, jB2);
        return (jN == 0 || jN == 1) ? jN - 2 : jN;
    }

    private static long m(byte[] bArr, int i10, int i11) {
        long jB = LittleEndianByteArray.b(bArr, i10);
        int i12 = i10 + i11;
        long jB2 = LittleEndianByteArray.b(bArr, i12 - 16) ^ f58582d;
        long jB3 = LittleEndianByteArray.b(bArr, i12 - 56) ^ f58581c;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j10 = i11;
        r(bArr, i12 - 64, j10, jB2, jArr);
        r(bArr, i12 - 32, j10 * f58582d, f58581c, jArr2);
        long jQ = jB3 + (q(jArr[1]) * f58582d);
        long jRotateRight = Long.rotateRight(jQ + jB, 39) * f58582d;
        long jRotateRight2 = Long.rotateRight(jB2, 33) * f58582d;
        int i13 = i10;
        int i14 = (i11 - 1) & (-64);
        while (true) {
            long jRotateRight3 = Long.rotateRight(jRotateRight + jRotateRight2 + jArr[0] + LittleEndianByteArray.b(bArr, i13 + 16), 37) * f58582d;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.b(bArr, i13 + 48), 42) * f58582d;
            long j11 = jRotateRight3 ^ jArr2[1];
            long j12 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(jQ ^ jArr2[0], 33);
            r(bArr, i13, jArr[1] * f58582d, j11 + jArr2[0], jArr);
            r(bArr, i13 + 32, jArr2[1] + jRotateRight5, j12, jArr2);
            i13 += 64;
            i14 -= 64;
            if (i14 == 0) {
                return n(n(jArr[0], jArr2[0]) + (q(j12) * f58582d) + j11, n(jArr[1], jArr2[1]) + jRotateRight5);
            }
            jRotateRight = jRotateRight5;
            jQ = j11;
            jRotateRight2 = j12;
        }
    }

    @o9.d
    static long n(long j10, long j11) {
        long j12 = (j11 ^ j10) * f58584f;
        long j13 = (j10 ^ (j12 ^ (j12 >>> 47))) * f58584f;
        return (j13 ^ (j13 >>> 47)) * f58584f;
    }

    private static long o(byte[] bArr, int i10, int i11) {
        long jB = LittleEndianByteArray.b(bArr, i10 + 24);
        int i12 = i10 + i11;
        int i13 = i12 - 16;
        long jB2 = LittleEndianByteArray.b(bArr, i10) + ((((long) i11) + LittleEndianByteArray.b(bArr, i13)) * f58581c);
        long jRotateRight = Long.rotateRight(jB2 + jB, 52);
        long jRotateRight2 = Long.rotateRight(jB2, 37);
        long jB3 = jB2 + LittleEndianByteArray.b(bArr, i10 + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jB3, 7);
        int i14 = i10 + 16;
        long jB4 = jB3 + LittleEndianByteArray.b(bArr, i14);
        long j10 = jB + jB4;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jB4, 31) + jRotateRight3;
        long jB5 = LittleEndianByteArray.b(bArr, i14) + LittleEndianByteArray.b(bArr, i12 - 32);
        long jB6 = LittleEndianByteArray.b(bArr, i12 - 8);
        long jRotateRight5 = Long.rotateRight(jB5 + jB6, 52);
        long jRotateRight6 = Long.rotateRight(jB5, 37);
        long jB7 = jB5 + LittleEndianByteArray.b(bArr, i12 - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jB7, 7);
        long jB8 = jB7 + LittleEndianByteArray.b(bArr, i13);
        return q((q(((j10 + jRotateRight5 + Long.rotateRight(jB8, 31) + jRotateRight7) * f58583e) + ((jB6 + jB8 + jRotateRight4) * f58581c)) * f58581c) + jRotateRight4) * f58583e;
    }

    @o9.d
    static long p(byte[] bArr, int i10, int i11, long j10) {
        int i12 = i11 & (-8);
        int i13 = i11 & 7;
        long jC = j10 ^ (((long) i11) * f58584f);
        for (int i14 = 0; i14 < i12; i14 += 8) {
            jC = (jC ^ (q(LittleEndianByteArray.b(bArr, i10 + i14) * f58584f) * f58584f)) * f58584f;
        }
        if (i13 != 0) {
            jC = (LittleEndianByteArray.c(bArr, i10 + i12, i13) ^ jC) * f58584f;
        }
        return q(q(jC) * f58584f);
    }

    private static long q(long j10) {
        return j10 ^ (j10 >>> 47);
    }

    private static void r(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jB = LittleEndianByteArray.b(bArr, i10);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        long jB3 = LittleEndianByteArray.b(bArr, i10 + 16);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 24);
        long j12 = j10 + jB;
        long j13 = jB2 + j12 + jB3;
        long jRotateRight = Long.rotateRight(j11 + j12 + jB4, 51) + Long.rotateRight(j13, 23);
        jArr[0] = j13 + jB4;
        jArr[1] = jRotateRight + j12;
    }

    @Override // com.google.common.hash.k
    public int h() {
        return 64;
    }

    @Override // com.google.common.hash.e, com.google.common.hash.c, com.google.common.hash.k
    public HashCode k(byte[] bArr, int i10, int i11) {
        w.f0(i10, i10 + i11, bArr.length);
        return HashCode.j(l(bArr, i10, i11));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
