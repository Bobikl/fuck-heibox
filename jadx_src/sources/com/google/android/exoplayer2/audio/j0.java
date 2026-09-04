package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: DtsUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44139a = 192000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44140b = 2250000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f44141c = 2147385345;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44142d = 536864768;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f44143e = -25230976;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44144f = -14745368;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f44145g = 127;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f44146h = 31;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f44147i = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f44148j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f44149k = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f44150l = {-1, 8000, 16000, 32000, -1, -1, bb.c.l.Hk, 22050, 44100, -1, -1, bb.c.m.Ef, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f44151m = {64, 112, 128, 192, 224, 256, bb.c.b.f30966u4, bb.c.b.G5, 512, bb.c.b.f30883q9, 768, bb.c.b.f30796me, 1024, bb.c.b.f30708ij, 1280, bb.c.b.Cq, 1920, 2048, 2304, 2560, bb.c.d.Jb, bb.c.d.f31280he, bb.c.d.f31441oe, bb.c.d.Fg, bb.c.d.f31193dj, bb.c.e.f31800g5, 4096, bb.c.f.Jw, bb.c.i.W0};

    private j0() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    private static com.google.android.exoplayer2.util.d0 b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.google.android.exoplayer2.util.d0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b10;
            }
        }
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.google.android.exoplayer2.util.d0 d0Var2 = new com.google.android.exoplayer2.util.d0(bArrCopyOf);
            while (d0Var2.b() >= 16) {
                d0Var2.s(2);
                d0Var.f(d0Var2.h(14), 14);
            }
        }
        d0Var.o(bArrCopyOf);
        return d0Var;
    }

    private static boolean c(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1;
    }

    public static boolean d(int i10) {
        return i10 == f44141c || i10 == f44143e || i10 == f44142d || i10 == f44144f;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static a2 g(byte[] bArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        com.google.android.exoplayer2.util.d0 d0VarB = b(bArr);
        d0VarB.s(60);
        int i10 = f44149k[d0VarB.h(6)];
        int i11 = f44150l[d0VarB.h(4)];
        int iH = d0VarB.h(5);
        int[] iArr = f44151m;
        int i12 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        d0VarB.s(10);
        return new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.Q).G(i12).H(i10 + (d0VarB.h(2) > 0 ? 1 : 0)).f0(i11).M(drmInitData).V(str2).E();
    }
}
