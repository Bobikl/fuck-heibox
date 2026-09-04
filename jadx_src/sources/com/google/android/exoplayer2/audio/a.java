package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.ParserException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44040a = "AacUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44041b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44042c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44043d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44044e = 512;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44045f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44046g = 16000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44047h = 7000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44048i = 256000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44049j = 8000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44050k = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44052m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44054o = "mp4a.40.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44055p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44056q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f44057r = 22;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44058s = 23;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44059t = 29;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f44060u = 31;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f44061v = 42;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f44051l = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, bb.c.m.Ef, bb.c.l.Hk, 8000, bb.c.g.Lf};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f44053n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: AacUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: AacUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f44064c;

        private c(int i10, int i11, String str) {
            this.f44062a = i10;
            this.f44063b = i11;
            this.f44064c = str;
        }
    }

    private a() {
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f44051l;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f44053n;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i14, i15);
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Invalid sample rate or number of channels: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & bb.c.b.O1) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(com.google.android.exoplayer2.util.d0 d0Var) {
        int iH = d0Var.h(5);
        return iH == 31 ? d0Var.h(6) + 32 : iH;
    }

    private static int d(com.google.android.exoplayer2.util.d0 d0Var) throws ParserException {
        int iH = d0Var.h(4);
        if (iH == 15) {
            return d0Var.h(24);
        }
        if (iH < 13) {
            return f44051l[iH];
        }
        throw ParserException.a(null, null);
    }

    public static c e(com.google.android.exoplayer2.util.d0 d0Var, boolean z10) throws ParserException {
        int iC = c(d0Var);
        int iD = d(d0Var);
        int iH = d0Var.h(4);
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(f44054o);
        sb2.append(iC);
        String string = sb2.toString();
        if (iC == 5 || iC == 29) {
            iD = d(d0Var);
            iC = c(d0Var);
            if (iC == 22) {
                iH = d0Var.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(42);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(iC);
                        throw ParserException.e(sb3.toString());
                }
            }
            g(d0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = d0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        StringBuilder sb4 = new StringBuilder(33);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(iH2);
                        throw ParserException.e(sb4.toString());
                    }
                    break;
            }
        }
        int i10 = f44053n[iH];
        if (i10 != -1) {
            return new c(iD, i10, string);
        }
        throw ParserException.a(null, null);
    }

    public static c f(byte[] bArr) throws ParserException {
        return e(new com.google.android.exoplayer2.util.d0(bArr), false);
    }

    private static void g(com.google.android.exoplayer2.util.d0 d0Var, int i10, int i11) {
        if (d0Var.g()) {
            com.google.android.exoplayer2.util.u.m(f44040a, "Unexpected frameLengthFlag = 1");
        }
        if (d0Var.g()) {
            d0Var.s(14);
        }
        boolean zG = d0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            d0Var.s(3);
        }
        if (zG) {
            if (i10 == 22) {
                d0Var.s(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                d0Var.s(3);
            }
            d0Var.s(1);
        }
    }
}
