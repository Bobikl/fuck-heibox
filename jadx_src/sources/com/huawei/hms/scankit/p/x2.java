package com.huawei.hms.scankit.p;

import java.util.Locale;

/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f62546a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(byte[] bArr, int i10, int i11) throws Exception {
        r rVarA;
        int i12;
        boolean z10;
        int iAbs;
        int iA;
        int i13;
        r rVarA2 = new c4(bArr).a();
        int iE = ((rVarA2.e() * i10) / 100) + 11;
        int iE2 = rVarA2.e() + iE;
        int i14 = 4;
        int i15 = 0;
        if (i11 != 0) {
            boolean z11 = i11 < 0;
            iAbs = Math.abs(i11);
            if (iAbs > (z11 ? 4 : 32)) {
                try {
                    throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Illegal value %s for layers", Integer.valueOf(i11)));
                } catch (Exception e10) {
                    throw e10;
                }
            }
            iA = a(iAbs, z11);
            i12 = f62546a[iAbs];
            int i16 = iA - (iA % i12);
            rVarA = a(rVarA2, i12);
            if (rVarA.e() + iE > i16) {
                try {
                    z10 = z11;
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } catch (Exception e11) {
                    throw e11;
                }
            }
            if (z11) {
                z10 = z11;
                if (rVarA.e() > i12 * 64) {
                    try {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    } catch (Exception e12) {
                        throw e12;
                    }
                }
            }
        } else {
            r rVarA3 = null;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (i17 > 32) {
                    try {
                        throw new IllegalArgumentException("Data too large for an Aztec code");
                    } catch (Exception e13) {
                        throw e13;
                    }
                }
                boolean z12 = i17 <= 3 ? 1 : i15;
                int i19 = z12 != 0 ? i17 + 1 : i17;
                int iA2 = a(i19, z12);
                if (iE2 <= iA2) {
                    if (rVarA3 == null || i18 != f62546a[i19]) {
                        int i20 = f62546a[i19];
                        i18 = i20;
                        rVarA3 = a(rVarA2, i20);
                    }
                    int i21 = iA2 - (iA2 % i18);
                    if ((z12 == 0 || rVarA3.e() <= i18 * 64) && rVarA3.e() + iE <= i21) {
                        rVarA = rVarA3;
                        i12 = i18;
                        z10 = z12;
                        iAbs = i19;
                        iA = iA2;
                        break;
                    }
                }
                i17++;
                i14 = 4;
                i15 = 0;
            }
        }
        r rVarB = b(rVarA, iA, i12);
        int iE3 = rVarA.e() / i12;
        r rVarA4 = a(z10, iAbs, iE3);
        int i22 = (z10 ? 11 : 14) + (iAbs * 4);
        int[] iArr = new int[i22];
        int i23 = 2;
        if (z10) {
            for (int i24 = i15; i24 < i22; i24++) {
                iArr[i24] = i24;
            }
            i13 = i22;
        } else {
            int i25 = i22 / 2;
            i13 = i22 + 1 + (((i25 - 1) / 15) * 2);
            int i26 = i13 / 2;
            for (int i27 = i15; i27 < i25; i27++) {
                int i28 = (i27 / 15) + i27;
                iArr[(i25 - i27) - 1] = (i26 - i28) - 1;
                iArr[i25 + i27] = i28 + i26 + 1;
            }
        }
        s sVar = new s(i13);
        int i29 = i15;
        int i30 = i29;
        while (i29 < iAbs) {
            int i31 = ((iAbs - i29) * i14) + (z10 ? 9 : 12);
            int i32 = i15;
            while (i32 < i31) {
                int i33 = i32 * 2;
                while (i15 < i23) {
                    if (rVarB.b(i30 + i33 + i15)) {
                        int i34 = i29 * 2;
                        sVar.c(iArr[i34 + i15], iArr[i34 + i32]);
                    }
                    if (rVarB.b((i31 * 2) + i30 + i33 + i15)) {
                        int i35 = i29 * 2;
                        sVar.c(iArr[i35 + i32], iArr[((i22 - 1) - i35) - i15]);
                    }
                    if (rVarB.b((i31 * 4) + i30 + i33 + i15)) {
                        int i36 = (i22 - 1) - (i29 * 2);
                        sVar.c(iArr[i36 - i15], iArr[i36 - i32]);
                    }
                    if (rVarB.b((i31 * 6) + i30 + i33 + i15)) {
                        int i37 = i29 * 2;
                        sVar.c(iArr[((i22 - 1) - i37) - i32], iArr[i37 + i15]);
                    }
                    i15++;
                    i23 = 2;
                }
                i32++;
                i15 = 0;
                i23 = 2;
            }
            i30 += i31 * 8;
            i29++;
            i14 = 4;
            i15 = 0;
            i23 = 2;
        }
        a(sVar, z10, i13, rVarA4);
        if (z10) {
            a(sVar, i13 / 2, 5);
        } else {
            int i38 = i13 / 2;
            a(sVar, i38, 7);
            int i39 = 0;
            int i40 = 0;
            while (i39 < (i22 / 2) - 1) {
                for (int i41 = i38 & 1; i41 < i13; i41 += 2) {
                    int i42 = i38 - i40;
                    sVar.c(i42, i41);
                    int i43 = i38 + i40;
                    sVar.c(i43, i41);
                    sVar.c(i41, i42);
                    sVar.c(i41, i43);
                }
                i39 += 15;
                i40 += 16;
            }
        }
        f fVar = new f();
        fVar.a(z10);
        fVar.c(i13);
        fVar.b(iAbs);
        fVar.a(iE3);
        fVar.a(sVar);
        return fVar;
    }

    private static o3 a(int i10) throws Exception {
        if (i10 == 4) {
            return o3.f62193k;
        }
        if (i10 == 6) {
            return o3.f62192j;
        }
        if (i10 == 8) {
            return o3.f62196n;
        }
        if (i10 == 10) {
            return o3.f62191i;
        }
        if (i10 == 12) {
            return o3.f62190h;
        }
        try {
            throw new IllegalArgumentException("Unsupported word size " + i10);
        } catch (Exception e10) {
            throw e10;
        }
    }

    static r a(r rVar, int i10) throws Exception {
        r rVar2 = new r();
        int iE = rVar.e();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < iE) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= iE || rVar.b(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                rVar2.a(i16, i10);
            } else {
                if (i16 == 0) {
                    rVar2.a(i13 | 1, i10);
                } else {
                    rVar2.a(i13, i10);
                }
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return rVar2;
    }

    static r a(boolean z10, int i10, int i11) throws Exception {
        r rVar = new r();
        if (z10) {
            rVar.a(i10 - 1, 2);
            rVar.a(i11 - 1, 6);
            return b(rVar, 28, 4);
        }
        rVar.a(i10 - 1, 5);
        rVar.a(i11 - 1, 11);
        return b(rVar, 40, 4);
    }

    private static void a(s sVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    sVar.c(i14, i13);
                    sVar.c(i14, i15);
                    sVar.c(i13, i14);
                    sVar.c(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        sVar.c(i16, i16);
        int i17 = i16 + 1;
        sVar.c(i17, i16);
        sVar.c(i16, i17);
        int i18 = i10 + i11;
        sVar.c(i18, i16);
        sVar.c(i18, i17);
        sVar.c(i18, i18 - 1);
    }

    private static void a(s sVar, boolean z10, int i10, r rVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (rVar.b(i12)) {
                    sVar.c(i13, i11 - 5);
                }
                if (rVar.b(i12 + 7)) {
                    sVar.c(i11 + 5, i13);
                }
                if (rVar.b(20 - i12)) {
                    sVar.c(i13, i11 + 5);
                }
                if (rVar.b(27 - i12)) {
                    sVar.c(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (rVar.b(i12)) {
                sVar.c(i14, i11 - 7);
            }
            if (rVar.b(i12 + 10)) {
                sVar.c(i11 + 7, i14);
            }
            if (rVar.b(29 - i12)) {
                sVar.c(i14, i11 + 7);
            }
            if (rVar.b(39 - i12)) {
                sVar.c(i11 - 7, i14);
            }
            i12++;
        }
    }

    private static int[] a(r rVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int iE = rVar.e() / i10;
        for (int i12 = 0; i12 < iE; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= rVar.b((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static r b(r rVar, int i10, int i11) throws Exception {
        int iE = rVar.e() / i11;
        q6 q6Var = new q6(a(i11));
        int i12 = i10 / i11;
        int[] iArrA = a(rVar, i11, i12);
        q6Var.a(iArrA, i12 - iE);
        r rVar2 = new r();
        rVar2.a(0, i10 % i11);
        for (int i13 : iArrA) {
            rVar2.a(i13, i11);
        }
        return rVar2;
    }
}
