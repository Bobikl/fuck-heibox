package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: EAN8Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r2 extends r7 {
    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + q7.b(str);
            } catch (a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + length);
            }
            try {
                if (!q7.a((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (a unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iA = h5.a(zArr, 0, q7.f62262c, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            iA += h5.a(zArr, iA, q7.f62265f[Character.digit(str.charAt(i10), 10)], false);
        }
        int iA2 = iA + h5.a(zArr, iA, q7.f62263d, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iA2 += h5.a(zArr, iA2, q7.f62265f[Character.digit(str.charAt(i11), 10)], true);
        }
        h5.a(zArr, iA2, q7.f62262c, true);
        return zArr;
    }
}
