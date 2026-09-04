package com.google.common.hash;

import com.google.common.base.w;
import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: FarmHashFingerprint64.java */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class i extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final k f58576b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f58577c = -4348849565147123417L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f58578d = -5435081209227447693L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f58579e = -7286425919675154353L;

    i() {
    }

    @o9.d
    static long l(byte[] bArr, int i10, int i11) {
        if (i11 <= 32) {
            return i11 <= 16 ? m(bArr, i10, i11) : o(bArr, i10, i11);
        }
        return i11 <= 64 ? p(bArr, i10, i11) : q(bArr, i10, i11);
    }

    private static long m(byte[] bArr, int i10, int i11) {
        if (i11 >= 8) {
            long j10 = ((long) (i11 * 2)) + f58579e;
            long jB = LittleEndianByteArray.b(bArr, i10) + f58579e;
            long jB2 = LittleEndianByteArray.b(bArr, (i10 + i11) - 8);
            return n((Long.rotateRight(jB2, 37) * j10) + jB, (Long.rotateRight(jB, 25) + jB2) * j10, j10);
        }
        if (i11 >= 4) {
            return n(((long) i11) + ((((long) LittleEndianByteArray.a(bArr, i10)) & KeyboardMap.kValueMask) << 3), ((long) LittleEndianByteArray.a(bArr, (i10 + i11) - 4)) & KeyboardMap.kValueMask, ((long) (i11 * 2)) + f58579e);
        }
        if (i11 <= 0) {
            return f58579e;
        }
        return r((((long) ((bArr[i10] & 255) + ((bArr[(i11 >> 1) + i10] & 255) << 8))) * f58579e) ^ (((long) (i11 + ((bArr[i10 + (i11 - 1)] & 255) << 2))) * f58577c)) * f58579e;
    }

    private static long n(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    private static long o(byte[] bArr, int i10, int i11) {
        long j10 = ((long) (i11 * 2)) + f58579e;
        long jB = LittleEndianByteArray.b(bArr, i10) * f58578d;
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jB3 = LittleEndianByteArray.b(bArr, i12 - 8) * j10;
        return n((LittleEndianByteArray.b(bArr, i12 - 16) * f58579e) + Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30), jB + Long.rotateRight(jB2 + f58579e, 18) + jB3, j10);
    }

    private static long p(byte[] bArr, int i10, int i11) {
        long j10 = ((long) (i11 * 2)) + f58579e;
        long jB = LittleEndianByteArray.b(bArr, i10) * f58579e;
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jB3 = LittleEndianByteArray.b(bArr, i12 - 8) * j10;
        long jRotateRight = Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (LittleEndianByteArray.b(bArr, i12 - 16) * f58579e);
        long jN = n(jRotateRight, jB3 + Long.rotateRight(jB2 + f58579e, 18) + jB, j10);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 16) * j10;
        long jB5 = LittleEndianByteArray.b(bArr, i10 + 24);
        long jB6 = (jRotateRight + LittleEndianByteArray.b(bArr, i12 - 32)) * j10;
        return n(((jN + LittleEndianByteArray.b(bArr, i12 - 24)) * j10) + Long.rotateRight(jB4 + jB5, 43) + Long.rotateRight(jB6, 30), jB4 + Long.rotateRight(jB5 + jB, 18) + jB6, j10);
    }

    private static long q(byte[] bArr, int i10, int i11) {
        long j10 = 81;
        long j11 = (j10 * f58578d) + 113;
        long jR = r((j11 * f58579e) + 113) * f58579e;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jB = (j10 * f58579e) + LittleEndianByteArray.b(bArr, i10);
        int i12 = i11 - 1;
        int i13 = i10 + ((i12 / 64) * 64);
        int i14 = i12 & 63;
        int i15 = (i13 + i14) - 63;
        int i16 = i10;
        while (true) {
            long jRotateRight = Long.rotateRight(jB + j11 + jArr[0] + LittleEndianByteArray.b(bArr, i16 + 8), 37) * f58578d;
            long jRotateRight2 = Long.rotateRight(j11 + jArr[1] + LittleEndianByteArray.b(bArr, i16 + 48), 42) * f58578d;
            long j12 = jRotateRight ^ jArr2[1];
            long jB2 = jRotateRight2 + jArr[0] + LittleEndianByteArray.b(bArr, i16 + 40);
            long jRotateRight3 = Long.rotateRight(jR + jArr2[0], 33) * f58578d;
            s(bArr, i16, jArr[1] * f58578d, j12 + jArr2[0], jArr);
            s(bArr, i16 + 32, jRotateRight3 + jArr2[1], jB2 + LittleEndianByteArray.b(bArr, i16 + 16), jArr2);
            int i17 = i16 + 64;
            if (i17 == i13) {
                long j13 = f58578d + ((j12 & 255) << 1);
                long j14 = jArr2[0] + ((long) i14);
                jArr2[0] = j14;
                long j15 = jArr[0] + j14;
                jArr[0] = j15;
                jArr2[0] = jArr2[0] + j15;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jB2 + jArr[0] + LittleEndianByteArray.b(bArr, i15 + 8), 37) * j13;
                long jRotateRight5 = Long.rotateRight(jB2 + jArr[1] + LittleEndianByteArray.b(bArr, i15 + 48), 42) * j13;
                long j16 = jRotateRight4 ^ (jArr2[1] * 9);
                long jB3 = jRotateRight5 + (jArr[0] * 9) + LittleEndianByteArray.b(bArr, i15 + 40);
                long jRotateRight6 = Long.rotateRight(j12 + jArr2[0], 33) * j13;
                s(bArr, i15, jArr[1] * j13, j16 + jArr2[0], jArr);
                s(bArr, i15 + 32, jRotateRight6 + jArr2[1], jB3 + LittleEndianByteArray.b(bArr, i15 + 16), jArr2);
                return n(n(jArr[0], jArr2[0], j13) + (r(jB3) * f58577c) + j16, n(jArr[1], jArr2[1], j13) + jRotateRight6, j13);
            }
            i16 = i17;
            jR = j12;
            j11 = jB2;
            jB = jRotateRight3;
        }
    }

    private static long r(long j10) {
        return j10 ^ (j10 >>> 47);
    }

    private static void s(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jB = LittleEndianByteArray.b(bArr, i10);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        long jB3 = LittleEndianByteArray.b(bArr, i10 + 16);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 24);
        long j12 = j10 + jB;
        long j13 = jB2 + j12 + jB3;
        long jRotateRight = Long.rotateRight(j11 + j12 + jB4, 21) + Long.rotateRight(j13, 44);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
