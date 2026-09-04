package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: compiled from: AztecWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements l8 {
    private static s a(f fVar, int i10, int i11, int i12) throws Exception {
        s sVarA = fVar.a();
        if (sVarA == null) {
            throw new IllegalStateException();
        }
        int iE = sVarA.e();
        int iC = sVarA.c();
        int i13 = i12 * 2;
        int i14 = iE + i13;
        int i15 = i13 + iC;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iE * iMin)) / 2;
        int i17 = (iMax2 - (iC * iMin)) / 2;
        s sVar = new s(iMax, iMax2);
        int i18 = 0;
        while (i18 < iC) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iE) {
                if (sVarA.b(i19, i18)) {
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

    private static s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Charset charset, int i12, int i13, int i14) throws Exception {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return a(x2.a(str.getBytes(charset), i12, i13), i10, i11, i14);
        }
        try {
            throw new IllegalArgumentException("Can only encode AZTEC, but got " + barcodeFormat);
        } catch (Exception e10) {
            throw e10;
        }
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws Exception {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        int i14 = 4;
        if (map != null) {
            u2 u2Var = u2.CHARACTER_SET;
            if (map.containsKey(u2Var)) {
                charsetForName = Charset.forName(map.get(u2Var).toString());
            }
            u2 u2Var2 = u2.ERROR_CORRECTION;
            if (map.containsKey(u2Var2)) {
                try {
                    i12 = Integer.parseInt(map.get(u2Var2).toString());
                } catch (Exception e10) {
                    throw e10;
                }
            }
            u2 u2Var3 = u2.AZTEC_LAYERS;
            if (map.containsKey(u2Var3)) {
                try {
                    i13 = Integer.parseInt(map.get(u2Var3).toString());
                } catch (Exception e11) {
                    throw e11;
                }
            }
            u2 u2Var4 = u2.MARGIN;
            if (map.containsKey(u2Var4)) {
                try {
                    i14 = Integer.parseInt(map.get(u2Var4).toString());
                } catch (Exception e12) {
                    throw e12;
                }
            }
        }
        return a(str, barcodeFormat, i10, i11, charsetForName, i12, i13, i14);
    }
}
