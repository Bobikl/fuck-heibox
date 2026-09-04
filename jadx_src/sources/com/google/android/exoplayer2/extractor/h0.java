package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45018a = "VorbisUtil";

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f45021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f45023e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f45019a = i10;
            this.f45020b = i11;
            this.f45021c = jArr;
            this.f45022d = i12;
            this.f45023e = z10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f45025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45026c;

        public b(String str, String[] strArr, int i10) {
            this.f45024a = str;
            this.f45025b = strArr;
            this.f45026c = i10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45030d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f45027a = z10;
            this.f45028b = i10;
            this.f45029c = i11;
            this.f45030d = i12;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f45036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f45037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f45038h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f45039i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f45040j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f45031a = i10;
            this.f45032b = i11;
            this.f45033c = i12;
            this.f45034d = i13;
            this.f45035e = i14;
            this.f45036f = i15;
            this.f45037g = i16;
            this.f45038h = i17;
            this.f45039i = z10;
            this.f45040j = bArr;
        }
    }

    private h0() {
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    private static a c(g0 g0Var) throws ParserException {
        if (g0Var.e(24) != 5653314) {
            int iC = g0Var.c();
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb2.append(iC);
            throw ParserException.a(sb2.toString(), null);
        }
        int iE = g0Var.e(16);
        int iE2 = g0Var.e(24);
        long[] jArr = new long[iE2];
        boolean zD = g0Var.d();
        long jB = 0;
        if (zD) {
            int iE3 = g0Var.e(5) + 1;
            int i10 = 0;
            while (i10 < iE2) {
                int iE4 = g0Var.e(a(iE2 - i10));
                for (int i11 = 0; i11 < iE4 && i10 < iE2; i11++) {
                    jArr[i10] = iE3;
                    i10++;
                }
                iE3++;
            }
        } else {
            boolean zD2 = g0Var.d();
            for (int i12 = 0; i12 < iE2; i12++) {
                if (!zD2) {
                    jArr[i12] = g0Var.e(5) + 1;
                } else if (g0Var.d()) {
                    jArr[i12] = g0Var.e(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int iE5 = g0Var.e(4);
        if (iE5 > 2) {
            StringBuilder sb3 = new StringBuilder(53);
            sb3.append("lookup type greater than 2 not decodable: ");
            sb3.append(iE5);
            throw ParserException.a(sb3.toString(), null);
        }
        if (iE5 == 1 || iE5 == 2) {
            g0Var.h(32);
            g0Var.h(32);
            int iE6 = g0Var.e(4) + 1;
            g0Var.h(1);
            if (iE5 != 1) {
                jB = ((long) iE2) * ((long) iE);
            } else if (iE != 0) {
                jB = b(iE2, iE);
            }
            g0Var.h((int) (jB * ((long) iE6)));
        }
        return new a(iE, iE2, jArr, iE5, zD);
    }

    private static void d(g0 g0Var) throws ParserException {
        int iE = g0Var.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            int iE2 = g0Var.e(16);
            if (iE2 == 0) {
                g0Var.h(8);
                g0Var.h(16);
                g0Var.h(16);
                g0Var.h(6);
                g0Var.h(8);
                int iE3 = g0Var.e(4) + 1;
                for (int i11 = 0; i11 < iE3; i11++) {
                    g0Var.h(8);
                }
            } else {
                if (iE2 != 1) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("floor type greater than 1 not decodable: ");
                    sb2.append(iE2);
                    throw ParserException.a(sb2.toString(), null);
                }
                int iE4 = g0Var.e(5);
                int i12 = -1;
                int[] iArr = new int[iE4];
                for (int i13 = 0; i13 < iE4; i13++) {
                    int iE5 = g0Var.e(4);
                    iArr[i13] = iE5;
                    if (iE5 > i12) {
                        i12 = iE5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = g0Var.e(3) + 1;
                    int iE6 = g0Var.e(2);
                    if (iE6 > 0) {
                        g0Var.h(8);
                    }
                    for (int i16 = 0; i16 < (1 << iE6); i16++) {
                        g0Var.h(8);
                    }
                }
                g0Var.h(2);
                int iE7 = g0Var.e(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iE4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        g0Var.h(iE7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void e(int i10, g0 g0Var) throws ParserException {
        int iE = g0Var.e(6) + 1;
        for (int i11 = 0; i11 < iE; i11++) {
            int iE2 = g0Var.e(16);
            if (iE2 != 0) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("mapping type other than 0 not supported: ");
                sb2.append(iE2);
                com.google.android.exoplayer2.util.u.d(f45018a, sb2.toString());
            } else {
                int iE3 = g0Var.d() ? g0Var.e(4) + 1 : 1;
                if (g0Var.d()) {
                    int iE4 = g0Var.e(8) + 1;
                    for (int i12 = 0; i12 < iE4; i12++) {
                        int i13 = i10 - 1;
                        g0Var.h(a(i13));
                        g0Var.h(a(i13));
                    }
                }
                if (g0Var.e(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iE3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        g0Var.h(4);
                    }
                }
                for (int i15 = 0; i15 < iE3; i15++) {
                    g0Var.h(8);
                    g0Var.h(8);
                    g0Var.h(8);
                }
            }
        }
    }

    private static c[] f(g0 g0Var) {
        int iE = g0Var.e(6) + 1;
        c[] cVarArr = new c[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            cVarArr[i10] = new c(g0Var.d(), g0Var.e(16), g0Var.e(16), g0Var.e(8));
        }
        return cVarArr;
    }

    private static void g(g0 g0Var) throws ParserException {
        int iE = g0Var.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            if (g0Var.e(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            g0Var.h(24);
            g0Var.h(24);
            g0Var.h(24);
            int iE2 = g0Var.e(6) + 1;
            g0Var.h(8);
            int[] iArr = new int[iE2];
            for (int i11 = 0; i11 < iE2; i11++) {
                iArr[i11] = ((g0Var.d() ? g0Var.e(5) : 0) * 8) + g0Var.e(3);
            }
            for (int i12 = 0; i12 < iE2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        g0Var.h(8);
                    }
                }
            }
        }
    }

    public static b h(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException {
        return i(e0Var, true, true);
    }

    public static b i(com.google.android.exoplayer2.util.e0 e0Var, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            l(3, e0Var, false);
        }
        String strD = e0Var.D((int) e0Var.v());
        int length = 11 + strD.length();
        long jV = e0Var.v();
        String[] strArr = new String[(int) jV];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jV; i10++) {
            String strD2 = e0Var.D((int) e0Var.v());
            strArr[i10] = strD2;
            length2 = length2 + 4 + strD2.length();
        }
        if (z11 && (e0Var.G() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new b(strD, strArr, length2 + 1);
    }

    public static d j(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException {
        l(1, e0Var, false);
        int iX = e0Var.x();
        int iG = e0Var.G();
        int iX2 = e0Var.x();
        int iR = e0Var.r();
        if (iR <= 0) {
            iR = -1;
        }
        int iR2 = e0Var.r();
        if (iR2 <= 0) {
            iR2 = -1;
        }
        int iR3 = e0Var.r();
        if (iR3 <= 0) {
            iR3 = -1;
        }
        int iG2 = e0Var.G();
        return new d(iX, iG, iX2, iR, iR2, iR3, (int) Math.pow(2.0d, iG2 & 15), (int) Math.pow(2.0d, (iG2 & 240) >> 4), (e0Var.G() & 1) > 0, Arrays.copyOf(e0Var.d(), e0Var.f()));
    }

    public static c[] k(com.google.android.exoplayer2.util.e0 e0Var, int i10) throws ParserException {
        l(5, e0Var, false);
        int iG = e0Var.G() + 1;
        g0 g0Var = new g0(e0Var.d());
        g0Var.h(e0Var.e() * 8);
        for (int i11 = 0; i11 < iG; i11++) {
            c(g0Var);
        }
        int iE = g0Var.e(6) + 1;
        for (int i12 = 0; i12 < iE; i12++) {
            if (g0Var.e(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(g0Var);
        g(g0Var);
        e(i10, g0Var);
        c[] cVarArrF = f(g0Var);
        if (g0Var.d()) {
            return cVarArrF;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    public static boolean l(int i10, com.google.android.exoplayer2.util.e0 e0Var, boolean z10) throws ParserException {
        if (e0Var.a() < 7) {
            if (z10) {
                return false;
            }
            int iA = e0Var.a();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(iA);
            throw ParserException.a(sb2.toString(), null);
        }
        if (e0Var.G() != i10) {
            if (z10) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i10));
            throw ParserException.a(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "), null);
        }
        if (e0Var.G() == 118 && e0Var.G() == 111 && e0Var.G() == 114 && e0Var.G() == 98 && e0Var.G() == 105 && e0Var.G() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
