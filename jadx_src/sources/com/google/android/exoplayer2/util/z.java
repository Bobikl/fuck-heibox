package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51617a = "NalUnitUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51619c = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51621e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51622f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51623g = 39;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f51618b = {0, 0, 0, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f51620d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f51624h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int[] f51625i = new int[10];

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f51630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f51631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f51632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f51633h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f51634i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f51635j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f51626a = i10;
            this.f51627b = z10;
            this.f51628c = i11;
            this.f51629d = i12;
            this.f51630e = iArr;
            this.f51631f = i13;
            this.f51632g = i14;
            this.f51633h = i15;
            this.f51634i = i16;
            this.f51635j = f10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51638c;

        public b(int i10, int i11, boolean z10) {
            this.f51636a = i10;
            this.f51637b = i11;
            this.f51638c = z10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f51643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f51644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f51645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f51647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f51648j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f51649k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f51650l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f51651m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f51639a = i10;
            this.f51640b = i11;
            this.f51641c = i12;
            this.f51642d = i13;
            this.f51643e = i14;
            this.f51644f = i15;
            this.f51645g = f10;
            this.f51646h = z10;
            this.f51647i = z11;
            this.f51648j = i16;
            this.f51649k = i17;
            this.f51650l = i18;
            this.f51651m = z12;
        }
    }

    private z() {
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        com.google.android.exoplayer2.util.a.i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(@androidx.annotation.p0 String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        f0 f0Var = new f0(bArr, i10, i11);
        f0Var.l(4);
        int iE = f0Var.e(3);
        f0Var.k();
        int iE2 = f0Var.e(2);
        boolean zD = f0Var.d();
        int iE3 = f0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (f0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = f0Var.e(8);
        }
        int iE4 = f0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < iE; i16++) {
            if (f0Var.d()) {
                i15 += 89;
            }
            if (f0Var.d()) {
                i15 += 8;
            }
        }
        f0Var.l(i15);
        if (iE > 0) {
            f0Var.l((8 - iE) * 2);
        }
        int iH = f0Var.h();
        int iH2 = f0Var.h();
        if (iH2 == 3) {
            f0Var.k();
        }
        int iH3 = f0Var.h();
        int iH4 = f0Var.h();
        if (f0Var.d()) {
            int iH5 = f0Var.h();
            int iH6 = f0Var.h();
            int iH7 = f0Var.h();
            int iH8 = f0Var.h();
            iH3 -= ((iH2 == 1 || iH2 == 2) ? 2 : 1) * (iH5 + iH6);
            iH4 -= (iH2 == 1 ? 2 : 1) * (iH7 + iH8);
        }
        f0Var.h();
        f0Var.h();
        int iH9 = f0Var.h();
        for (int i17 = f0Var.d() ? 0 : iE; i17 <= iE; i17++) {
            f0Var.h();
            f0Var.h();
            f0Var.h();
        }
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        if (f0Var.d() && f0Var.d()) {
            n(f0Var);
        }
        f0Var.l(2);
        if (f0Var.d()) {
            f0Var.l(8);
            f0Var.h();
            f0Var.h();
            f0Var.k();
        }
        p(f0Var);
        if (f0Var.d()) {
            for (int i18 = 0; i18 < f0Var.h(); i18++) {
                f0Var.l(iH9 + 4 + 1);
            }
        }
        f0Var.l(2);
        float f10 = 1.0f;
        if (f0Var.d()) {
            if (f0Var.d()) {
                int iE5 = f0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = f0Var.e(16);
                    int iE7 = f0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = f51620d;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(iE5);
                        u.m(f51617a, sb2.toString());
                    }
                }
            }
            if (f0Var.d()) {
                f0Var.k();
            }
            if (f0Var.d()) {
                f0Var.l(4);
                if (f0Var.d()) {
                    f0Var.l(24);
                }
            }
            if (f0Var.d()) {
                f0Var.h();
                f0Var.h();
            }
            f0Var.k();
            if (f0Var.d()) {
                iH4 *= 2;
            }
        }
        return new a(iE2, zD, iE3, i12, iArr, iE4, iH, iH3, iH4, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        f0 f0Var = new f0(bArr, i10, i11);
        int iH = f0Var.h();
        int iH2 = f0Var.h();
        f0Var.k();
        return new b(iH, iH2, f0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0161 A[PHI: r1
  0x0161: PHI (r1v8 float) = (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v10 float) binds: [B:71:0x011c, B:73:0x0122, B:83:0x0149, B:77:0x0138, B:78:0x013a, B:79:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    public static c m(byte[] bArr, int i10, int i11) {
        int iH;
        boolean zD;
        int iH2;
        boolean z10;
        boolean zD2;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        int i16;
        f0 f0Var = new f0(bArr, i10, i11);
        int iE = f0Var.e(8);
        int iE2 = f0Var.e(8);
        int iE3 = f0Var.e(8);
        int iH3 = f0Var.h();
        int i17 = 1;
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = f0Var.h();
            zD = iH == 3 ? f0Var.d() : false;
            f0Var.h();
            f0Var.h();
            f0Var.k();
            if (f0Var.d()) {
                int i18 = iH != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (f0Var.d()) {
                        o(f0Var, i19 < 6 ? 16 : 64);
                    }
                    i19++;
                }
            }
        } else {
            iH = 1;
            zD = false;
        }
        int iH4 = f0Var.h() + 4;
        int iH5 = f0Var.h();
        if (iH5 != 0) {
            if (iH5 == 1) {
                boolean zD3 = f0Var.d();
                f0Var.g();
                f0Var.g();
                long jH = f0Var.h();
                for (int i20 = 0; i20 < jH; i20++) {
                    f0Var.h();
                }
                z10 = zD3;
                iH2 = 0;
            } else {
                iH2 = 0;
            }
            f0Var.h();
            f0Var.k();
            int iH6 = f0Var.h() + 1;
            int iH7 = f0Var.h() + 1;
            zD2 = f0Var.d();
            int i21 = (2 - (zD2 ? 1 : 0)) * iH7;
            if (!zD2) {
                f0Var.k();
            }
            f0Var.k();
            i12 = iH6 * 16;
            i13 = i21 * 16;
            if (f0Var.d()) {
                int iH8 = f0Var.h();
                int iH9 = f0Var.h();
                int iH10 = f0Var.h();
                int iH11 = f0Var.h();
                if (iH == 0) {
                    i16 = 2 - (zD2 ? 1 : 0);
                } else {
                    if (iH == 3) {
                        i15 = 1;
                        i14 = 1;
                    } else {
                        i14 = 2;
                        i15 = 1;
                    }
                    if (iH == i15) {
                        i15 = 2;
                    }
                    i16 = (2 - (zD2 ? 1 : 0)) * i15;
                    i17 = i14;
                }
                i12 -= (iH8 + iH9) * i17;
                i13 -= (iH10 + iH11) * i16;
            }
            int i22 = i13;
            int i23 = i12;
            f10 = 1.0f;
            if (f0Var.d() || !f0Var.d()) {
                f11 = f10;
            } else {
                int iE4 = f0Var.e(8);
                if (iE4 == 255) {
                    int iE5 = f0Var.e(16);
                    int iE6 = f0Var.e(16);
                    if (iE5 != 0 && iE6 != 0) {
                        f10 = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f51620d;
                    if (iE4 < fArr.length) {
                        f11 = fArr[iE4];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(iE4);
                        u.m(f51617a, sb2.toString());
                    }
                }
                f11 = f10;
            }
            return new c(iE, iE2, iE3, iH3, i23, i22, f11, zD, zD2, iH4, iH5, iH2, z10);
        }
        iH2 = f0Var.h() + 4;
        z10 = false;
        f0Var.h();
        f0Var.k();
        int iH12 = f0Var.h() + 1;
        int iH13 = f0Var.h() + 1;
        zD2 = f0Var.d();
        int i24 = (2 - (zD2 ? 1 : 0)) * iH13;
        if (!zD2) {
            f0Var.k();
        }
        f0Var.k();
        i12 = iH12 * 16;
        i13 = i24 * 16;
        if (f0Var.d()) {
            int iH14 = f0Var.h();
            int iH15 = f0Var.h();
            int iH16 = f0Var.h();
            int iH17 = f0Var.h();
            if (iH == 0) {
                i16 = 2 - (zD2 ? 1 : 0);
            } else {
                if (iH == 3) {
                    i15 = 1;
                    i14 = 1;
                } else {
                    i14 = 2;
                    i15 = 1;
                }
                if (iH == i15) {
                    i15 = 2;
                }
                i16 = (2 - (zD2 ? 1 : 0)) * i15;
                i17 = i14;
            }
            i12 -= (iH14 + iH15) * i17;
            i13 -= (iH16 + iH17) * i16;
        }
        int i25 = i13;
        int i26 = i12;
        f10 = 1.0f;
        if (f0Var.d()) {
            f11 = f10;
        } else {
            f11 = f10;
        }
        return new c(iE, iE2, iE3, iH3, i26, i25, f11, zD, zD2, iH4, iH5, iH2, z10);
    }

    private static void n(f0 f0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (f0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        f0Var.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        f0Var.g();
                    }
                } else {
                    f0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(f0 f0Var, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((f0Var.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    private static void p(f0 f0Var) {
        int iH = f0Var.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = f0Var.d();
            }
            if (zD) {
                f0Var.k();
                f0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (f0Var.d()) {
                        f0Var.k();
                    }
                }
            } else {
                int iH2 = f0Var.h();
                int iH3 = f0Var.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    f0Var.h();
                    f0Var.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    f0Var.h();
                    f0Var.k();
                }
                i10 = i13;
            }
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f51624h) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f51625i;
                        if (iArr.length <= i12) {
                            f51625i = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f51625i[i12] = iD;
                        iD += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f51625i[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }
}
