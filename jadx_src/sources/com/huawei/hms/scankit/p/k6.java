package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: QRCodeWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k6 implements l8 {
    private static s a(h6 h6Var, int i10, int i11, int i12, boolean z10) throws Exception {
        int iMax;
        int iMax2;
        int iMin;
        c0 c0VarA = h6Var.a();
        if (c0VarA == null) {
            throw new IllegalStateException();
        }
        int iC = c0VarA.c();
        int iB = c0VarA.b();
        if (z10) {
            iMax = Math.max(i10, iC);
            iMax2 = Math.max(i11, iB);
            int i13 = i12 * 2;
            iMin = Math.min((iMax - i13) / iC, (iMax2 - i13) / iB);
        } else {
            int i14 = i12 * 2;
            int i15 = iC + i14;
            int i16 = i14 + iB;
            iMax = Math.max(i10, i15);
            iMax2 = Math.max(i11, i16);
            iMin = Math.min(iMax / i15, iMax2 / i16);
        }
        int i17 = (iMax - (iC * iMin)) / 2;
        int i18 = (iMax2 - (iB * iMin)) / 2;
        s sVar = new s(iMax, iMax2);
        int i19 = 0;
        while (i19 < iB) {
            int i20 = 0;
            int i21 = i17;
            while (i20 < iC) {
                if (c0VarA.a(i20, i19) == 1) {
                    sVar.a(i21, i18, iMin, iMin);
                }
                i20++;
                i21 += iMin;
            }
            i19++;
            i18 += iMin;
        }
        return sVar;
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws Exception {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        b3 b3VarValueOf = b3.L;
        int i12 = 4;
        Boolean bool = Boolean.FALSE;
        if (map != null) {
            u2 u2Var = u2.ERROR_CORRECTION;
            if (map.containsKey(u2Var)) {
                b3VarValueOf = b3.valueOf(map.get(u2Var).toString());
            }
            u2 u2Var2 = u2.MARGIN;
            if (map.containsKey(u2Var2)) {
                try {
                    i12 = Integer.parseInt(map.get(u2Var2).toString());
                } catch (Exception e10) {
                    throw e10;
                }
            }
            u2 u2Var3 = u2.LOGO;
            if (map.containsKey(u2Var3)) {
                try {
                    bool = (Boolean) map.get(u2Var3);
                } catch (Exception e11) {
                    throw e11;
                }
            }
        }
        return a(w2.a(str, b3VarValueOf, map), i10, i11, i12, bool.booleanValue());
    }
}
