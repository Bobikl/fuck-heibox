package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: EAN13Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p2 extends r7 {
    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + q7.b(str);
            } catch (a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
            try {
                if (!q7.a((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (a unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = o2.f62187j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iA = h5.a(zArr, 0, q7.f62262c, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iA += h5.a(zArr, iA, q7.f62266g[iDigit], false);
        }
        int iA2 = iA + h5.a(zArr, iA, q7.f62263d, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iA2 += h5.a(zArr, iA2, q7.f62265f[Character.digit(str.charAt(i12), 10)], true);
        }
        h5.a(zArr, iA2, q7.f62262c, true);
        return zArr;
    }
}
