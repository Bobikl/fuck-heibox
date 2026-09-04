package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: Code39Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends h5 {
    private static void a(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        int[] iArr = new int[9];
        int i10 = length + 25;
        for (int i11 = 0; i11 < length; i11++) {
            int iIndexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11));
            if (iIndexOf < 0) {
                throw new IllegalArgumentException("Bad contents: error contents");
            }
            a(t0.f62363e[iIndexOf], iArr);
            for (int i12 = 0; i12 < 9; i12++) {
                i10 += iArr[i12];
            }
        }
        boolean[] zArr = new boolean[i10];
        a(148, iArr);
        int iA = h5.a(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iA2 = iA + h5.a(zArr, iA, iArr2, false);
        for (int i13 = 0; i13 < length; i13++) {
            a(t0.f62363e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))], iArr);
            int iA3 = iA2 + h5.a(zArr, iA2, iArr, true);
            iA2 = iA3 + h5.a(zArr, iA3, iArr2, false);
        }
        a(148, iArr);
        h5.a(zArr, iA2, iArr, true);
        return zArr;
    }
}
