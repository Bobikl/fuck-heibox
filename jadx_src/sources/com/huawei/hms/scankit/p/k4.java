package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: ITFWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k4 extends h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f62040a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f62041b = {3, 1, 1};

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iA = h5.a(zArr, 0, f62040a, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iDigit = Character.digit(str.charAt(i10), 10);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = j4.f61995f;
                iArr[i12] = iArr2[iDigit][i11];
                iArr[i12 + 1] = iArr2[iDigit2][i11];
            }
            iA += h5.a(zArr, iA, iArr, true);
        }
        h5.a(zArr, iA, f62041b, true);
        return zArr;
    }
}
