package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import okio.Utf8;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44079a = 80000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44080b = 768000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44081c = 3062500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44082d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44083e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44084f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f44085g = 1536;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f44086h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f44087i = {48000, 44100, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f44088j = {24000, 22050, 16000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f44089k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f44090l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, bb.c.b.f30693i3, bb.c.b.f30966u4, bb.c.b.G5, 512, bb.c.b.f30606e8, bb.c.b.f30883q9};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f44091m = {69, 87, 104, 121, 139, bb.c.b.f30918s0, 208, bb.c.b.J1, bb.c.b.f30920s2, bb.c.b.K3, bb.c.b.f30533b5, bb.c.b.f30946t6, bb.c.b.L7, 696, bb.c.b.f30588dd, bb.c.b.Nf, 1114, bb.c.b.f30642fl, bb.c.b.Pn};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class C0371b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f44092g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f44093h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f44094i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f44095j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f44096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f44101f;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b$b$a */
        /* JADX INFO: compiled from: Ac3Util.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private C0371b(@androidx.annotation.p0 String str, int i10, int i11, int i12, int i13, int i14) {
            this.f44096a = str;
            this.f44097b = i10;
            this.f44099d = i11;
            this.f44098c = i12;
            this.f44100e = i13;
            this.f44101f = i14;
        }
    }

    private b() {
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((com.google.android.exoplayer2.util.u0.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f44087i;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f44091m;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f44090l[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static a2 c(com.google.android.exoplayer2.util.e0 e0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        int i10 = f44087i[(e0Var.G() & 192) >> 6];
        int iG = e0Var.G();
        int i11 = f44089k[(iG & 56) >> 3];
        if ((iG & 4) != 0) {
            i11++;
        }
        return new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.L).H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f44086h[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & org.apache.tools.tar.c.F) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0371b e(com.google.android.exoplayer2.util.d0 d0Var) {
        int iB;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int iH;
        int i14;
        int i15;
        int i16;
        int i17;
        int iE = d0Var.e();
        d0Var.s(40);
        boolean z10 = d0Var.h(5) > 10;
        d0Var.q(iE);
        int i18 = -1;
        if (z10) {
            d0Var.s(16);
            int iH2 = d0Var.h(2);
            if (iH2 == 0) {
                i18 = 0;
            } else if (iH2 == 1) {
                i18 = 1;
            } else if (iH2 == 2) {
                i18 = 2;
            }
            d0Var.s(3);
            iB = (d0Var.h(11) + 1) * 2;
            int iH3 = d0Var.h(2);
            if (iH3 == 3) {
                i10 = f44088j[d0Var.h(2)];
                i14 = 6;
                iH = 3;
            } else {
                iH = d0Var.h(2);
                i14 = f44086h[iH];
                i10 = f44087i[iH3];
            }
            i11 = i14 * 256;
            int iH4 = d0Var.h(3);
            boolean zG = d0Var.g();
            i12 = f44089k[iH4] + (zG ? 1 : 0);
            d0Var.s(10);
            if (d0Var.g()) {
                d0Var.s(8);
            }
            if (iH4 == 0) {
                d0Var.s(5);
                if (d0Var.g()) {
                    d0Var.s(8);
                }
            }
            if (i18 == 1 && d0Var.g()) {
                d0Var.s(16);
            }
            if (d0Var.g()) {
                if (iH4 > 2) {
                    d0Var.s(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    d0Var.s(6);
                }
                if ((iH4 & 4) != 0) {
                    d0Var.s(i16);
                }
                if (zG && d0Var.g()) {
                    d0Var.s(5);
                }
                if (i18 == 0) {
                    if (d0Var.g()) {
                        i17 = 6;
                        d0Var.s(6);
                    } else {
                        i17 = 6;
                    }
                    if (iH4 == 0 && d0Var.g()) {
                        d0Var.s(i17);
                    }
                    if (d0Var.g()) {
                        d0Var.s(i17);
                    }
                    int iH5 = d0Var.h(2);
                    if (iH5 == 1) {
                        d0Var.s(5);
                    } else if (iH5 == 2) {
                        d0Var.s(12);
                    } else if (iH5 == 3) {
                        int iH6 = d0Var.h(5);
                        if (d0Var.g()) {
                            d0Var.s(5);
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                d0Var.s(4);
                            }
                            if (d0Var.g()) {
                                if (d0Var.g()) {
                                    d0Var.s(4);
                                }
                                if (d0Var.g()) {
                                    d0Var.s(4);
                                }
                            }
                        }
                        if (d0Var.g()) {
                            d0Var.s(5);
                            if (d0Var.g()) {
                                d0Var.s(7);
                                if (d0Var.g()) {
                                    d0Var.s(8);
                                }
                            }
                        }
                        d0Var.s((iH6 + 2) * 8);
                        d0Var.c();
                    }
                    if (iH4 < 2) {
                        if (d0Var.g()) {
                            d0Var.s(14);
                        }
                        if (iH4 == 0 && d0Var.g()) {
                            d0Var.s(14);
                        }
                    }
                    if (d0Var.g()) {
                        if (iH == 0) {
                            d0Var.s(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (d0Var.g()) {
                                    d0Var.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (d0Var.g()) {
                d0Var.s(5);
                if (iH4 == 2) {
                    d0Var.s(4);
                }
                if (iH4 >= 6) {
                    d0Var.s(2);
                }
                if (d0Var.g()) {
                    d0Var.s(8);
                }
                if (iH4 == 0 && d0Var.g()) {
                    d0Var.s(8);
                }
                if (iH3 < 3) {
                    d0Var.r();
                }
            }
            if (i18 == 0 && iH != 3) {
                d0Var.r();
            }
            if (i18 == 2 && (iH == 3 || d0Var.g())) {
                i15 = 6;
                d0Var.s(6);
            } else {
                i15 = 6;
            }
            str = (d0Var.g() && d0Var.h(i15) == 1 && d0Var.h(8) == 1) ? com.google.android.exoplayer2.util.y.N : com.google.android.exoplayer2.util.y.M;
            i13 = i18;
        } else {
            d0Var.s(32);
            int iH7 = d0Var.h(2);
            String str2 = iH7 == 3 ? null : com.google.android.exoplayer2.util.y.L;
            iB = b(iH7, d0Var.h(6));
            d0Var.s(8);
            int iH8 = d0Var.h(3);
            if ((iH8 & 1) != 0 && iH8 != 1) {
                d0Var.s(2);
            }
            if ((iH8 & 4) != 0) {
                d0Var.s(2);
            }
            if (iH8 == 2) {
                d0Var.s(2);
            }
            int[] iArr = f44087i;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = 1536;
            i12 = f44089k[iH8] + (d0Var.g() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new C0371b(str, i13, i12, i10, iB, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return b((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
    }

    public static a2 g(com.google.android.exoplayer2.util.e0 e0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        e0Var.T(2);
        int i10 = f44087i[(e0Var.G() & 192) >> 6];
        int iG = e0Var.G();
        int i11 = f44089k[(iG & 14) >> 1];
        if ((iG & 1) != 0) {
            i11++;
        }
        if (((e0Var.G() & 30) >> 1) > 0 && (2 & e0Var.G()) != 0) {
            i11 += 2;
        }
        return new a2.b().S(str).e0((e0Var.a() <= 0 || (e0Var.G() & 1) == 0) ? com.google.android.exoplayer2.util.y.M : com.google.android.exoplayer2.util.y.N).H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
