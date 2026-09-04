package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: compiled from: PDF417Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u5 implements l8 {
    private static s a(l5 l5Var, String str, int i10, int i11, int i12, int i13) throws Exception {
        l5Var.a(str, i10);
        byte[][] bArrA = l5Var.a().a(1, 4);
        int length = i11 / bArrA[0].length;
        int length2 = i12 / bArrA.length;
        if (length >= length2) {
            length = length2;
        }
        return length > 1 ? a(l5Var.a().a(length, length * 4), i13) : a(bArrA, i13);
    }

    private static s a(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        s sVar = new s(bArr[0].length + i11, bArr.length + i11);
        sVar.a();
        int iC = (sVar.c() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    sVar.c(i13 + i10, iC);
                }
            }
            i12++;
            iC--;
        }
        return sVar;
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws Exception {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
        }
        l5 l5Var = new l5();
        int i12 = 30;
        int i13 = 2;
        if (map != null) {
            u2 u2Var = u2.PDF417_COMPACT;
            if (map.containsKey(u2Var)) {
                l5Var.a(Boolean.valueOf(map.get(u2Var).toString()).booleanValue());
            }
            u2 u2Var2 = u2.PDF417_COMPACTION;
            if (map.containsKey(u2Var2)) {
                l5Var.a(y0.valueOf(map.get(u2Var2).toString()));
            }
            u2 u2Var3 = u2.PDF417_DIMENSIONS;
            if (map.containsKey(u2Var3)) {
                m2 m2Var = (m2) map.get(u2Var3);
                l5Var.b(m2Var.a(), m2Var.c(), m2Var.b(), m2Var.d());
            }
            u2 u2Var4 = u2.MARGIN;
            if (map.containsKey(u2Var4)) {
                try {
                    i12 = Integer.parseInt(map.get(u2Var4).toString());
                } catch (Exception e10) {
                    throw e10;
                }
            }
            u2 u2Var5 = u2.ERROR_CORRECTION;
            if (map.containsKey(u2Var5)) {
                try {
                    i13 = Integer.parseInt(map.get(u2Var5).toString());
                } catch (Exception e11) {
                    throw e11;
                }
            }
            u2 u2Var6 = u2.CHARACTER_SET;
            if (map.containsKey(u2Var6)) {
                l5Var.a(Charset.forName(map.get(u2Var6).toString()));
            }
        }
        return a(l5Var, str, i13, i10, i11, i12);
    }
}
