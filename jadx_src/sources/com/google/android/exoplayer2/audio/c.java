package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44102a = 44096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44103b = 44097;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44104c = 336000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44105d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44106e = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44107f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f44108g = {2002, 2000, 1920, bb.c.b.Pr, 1600, 1001, 1000, bb.c.b.f31065yf, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44113e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f44109a = i10;
            this.f44111c = i11;
            this.f44110b = i12;
            this.f44112d = i13;
            this.f44113e = i14;
        }
    }

    private c() {
    }

    public static void a(int i10, com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.O(7);
        byte[] bArrD = e0Var.d();
        bArrD[0] = -84;
        bArrD[1] = SignedBytes.f59068a;
        bArrD[2] = -1;
        bArrD[3] = -1;
        bArrD[4] = (byte) ((i10 >> 16) & 255);
        bArrD[5] = (byte) ((i10 >> 8) & 255);
        bArrD[6] = (byte) (i10 & 255);
    }

    public static a2 b(com.google.android.exoplayer2.util.e0 e0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        e0Var.T(1);
        return new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.O).H(2).f0(((e0Var.G() & 32) >> 5) == 1 ? 48000 : 44100).M(drmInitData).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new com.google.android.exoplayer2.util.d0(bArr)).f44113e;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    public static b d(com.google.android.exoplayer2.util.d0 d0Var) {
        int i10;
        int i11;
        int iH = d0Var.h(16);
        int iH2 = d0Var.h(16);
        if (iH2 == 65535) {
            iH2 = d0Var.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iH2 + i10;
        if (iH == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iH3 = d0Var.h(2);
        if (iH3 == 3) {
            iH3 += f(d0Var, 2);
        }
        int i14 = iH3;
        int iH4 = d0Var.h(10);
        if (d0Var.g() && d0Var.h(3) > 0) {
            d0Var.s(2);
        }
        int i15 = d0Var.g() ? 48000 : 44100;
        int iH5 = d0Var.h(4);
        int i16 = 0;
        if (i15 == 44100 && iH5 == 13) {
            i11 = f44108g[iH5];
        } else {
            if (i15 == 48000) {
                int[] iArr = f44108g;
                if (iH5 < iArr.length) {
                    i16 = iArr[iH5];
                    int i17 = iH4 % 5;
                    if (i17 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i16++;
                        }
                    } else if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                                i16++;
                            }
                        } else if (iH5 != 3) {
                            i16++;
                        } else {
                            i16++;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i16++;
                    }
                }
            }
            i11 = i16;
        }
        return new b(i14, 2, i15, i13, i11);
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int f(com.google.android.exoplayer2.util.d0 d0Var, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + d0Var.h(i10);
            if (!d0Var.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }
}
