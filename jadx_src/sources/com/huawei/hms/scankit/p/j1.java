package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: DataMatrixWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j1 implements l8 {
    private static s a(c0 c0Var, int i10, int i11, int i12) throws Exception {
        s sVar;
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i13 = i12 * 2;
        int i14 = iC + i13;
        int i15 = i13 + iB;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iC * iMin)) / 2;
        int i17 = (iMax2 - (iB * iMin)) / 2;
        if (i11 < iB || i10 < iC) {
            sVar = new s(iC, iB);
            i16 = 0;
            i17 = 0;
        } else {
            sVar = new s(i10, i11);
        }
        sVar.a();
        int i18 = 0;
        while (i18 < iB) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iC) {
                if (c0Var.a(i19, i18) == 1) {
                    sVar.a(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return sVar;
    }

    private static s a(y1 y1Var, d7 d7Var, int i10, int i11, int i12) {
        int iF = d7Var.f();
        int iE = d7Var.e();
        c0 c0Var = new c0(d7Var.h(), d7Var.g());
        int i13 = 0;
        for (int i14 = 0; i14 < iE; i14++) {
            if (i14 % d7Var.f61700e == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < d7Var.h(); i16++) {
                    c0Var.a(i15, i13, i16 % 2 == 0);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < iF; i18++) {
                if (i18 % d7Var.f61699d == 0) {
                    c0Var.a(i17, i13, true);
                    i17++;
                }
                c0Var.a(i17, i13, y1Var.a(i18, i14));
                i17++;
                int i19 = d7Var.f61699d;
                if (i18 % i19 == i19 - 1) {
                    c0Var.a(i17, i13, i14 % 2 == 0);
                    i17++;
                }
            }
            i13++;
            int i20 = d7Var.f61700e;
            if (i14 % i20 == i20 - 1) {
                int i21 = 0;
                for (int i22 = 0; i22 < d7Var.h(); i22++) {
                    c0Var.a(i21, i13, true);
                    i21++;
                }
                i13++;
            }
        }
        return a(c0Var, i10, i11, i12);
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws Exception {
        l2 l2Var;
        if (str.isEmpty()) {
            try {
                throw new IllegalArgumentException("Found empty contents");
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            try {
                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
            } catch (Exception e11) {
                throw e11;
            }
        }
        if (i10 < 0 || i11 < 0) {
            try {
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
            } catch (Exception e12) {
                throw e12;
            }
        }
        e7 e7Var = e7.FORCE_SQUARE;
        int i12 = 4;
        l2 l2Var2 = null;
        if (map != null) {
            e7 e7Var2 = (e7) map.get(u2.DATA_MATRIX_SHAPE);
            if (e7Var2 != null) {
                e7Var = e7Var2;
            }
            l2 l2Var3 = (l2) map.get(u2.MIN_SIZE);
            if (l2Var3 == null) {
                l2Var3 = null;
            }
            l2 l2Var4 = (l2) map.get(u2.MAX_SIZE);
            l2Var2 = l2Var4 != null ? l2Var4 : null;
            u2 u2Var = u2.MARGIN;
            if (map.containsKey(u2Var)) {
                try {
                    i12 = Integer.parseInt(map.get(u2Var).toString());
                } catch (Exception e13) {
                    throw e13;
                }
            }
            l2Var = l2Var2;
            l2Var2 = l2Var3;
        } else {
            l2Var = null;
        }
        String strA = d4.a(str, e7Var, l2Var2, l2Var);
        d7 d7VarA = d7.a(strA.length(), e7Var, l2Var2, l2Var, true);
        y1 y1Var = new y1(z2.a(strA, d7VarA), d7VarA.f(), d7VarA.e());
        y1Var.a();
        return a(y1Var, d7VarA, i10, i11, i12);
    }
}
