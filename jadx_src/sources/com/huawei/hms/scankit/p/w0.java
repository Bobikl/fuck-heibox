package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: Code93Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public class w0 extends h5 {
    private static int a(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static int a(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
        return 9;
    }

    private static void a(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        a(v0.f62431d[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iA = a(zArr, 0, iArr);
        for (int i10 = 0; i10 < length; i10++) {
            int iIndexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i10));
            if (iIndexOf < 0) {
                throw new IllegalArgumentException("Bad contents: please check contents");
            }
            a(v0.f62431d[iIndexOf], iArr);
            iA += a(zArr, iA, iArr);
        }
        int iA2 = a(str, 20);
        int[] iArr2 = v0.f62431d;
        a(iArr2[iA2], iArr);
        int iA3 = iA + a(zArr, iA, iArr);
        a(iArr2[a(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iA2), 15)], iArr);
        int iA4 = iA3 + a(zArr, iA3, iArr);
        a(iArr2[47], iArr);
        zArr[iA4 + a(zArr, iA4, iArr)] = true;
        return zArr;
    }
}
