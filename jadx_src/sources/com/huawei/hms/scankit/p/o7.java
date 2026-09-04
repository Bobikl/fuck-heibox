package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: compiled from: UPCEANExtension5Support.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f62208c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62209a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f62210b = new StringBuilder();

    o7() {
    }

    private static int a(int i10) throws a {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f62208c[i11]) {
                return i11;
            }
        }
        throw a.a();
    }

    private int a(r rVar, int[] iArr, StringBuilder sb2) throws a {
        int[] iArr2 = this.f62209a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iE = rVar.e();
        int iD = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 5 && iD < iE; i11++) {
            int iA = q7.a(rVar, iArr2, iD, q7.f62266g);
            sb2.append((char) ((iA % 10) + 48));
            for (int i12 : iArr2) {
                iD += i12;
            }
            if (iA >= 10) {
                i10 |= 1 << (4 - i11);
            }
            if (i11 != 4) {
                iD = rVar.d(rVar.c(iD));
            }
        }
        if (sb2.length() != 5) {
            throw a.a();
        }
        if (a(sb2.toString()) == a(i10)) {
            return iD;
        }
        throw a.a();
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            iCharAt += charSequence.charAt(i10) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            iCharAt2 += charSequence.charAt(i11) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    s6 a(int i10, r rVar, int[] iArr) throws a {
        StringBuilder sb2 = this.f62210b;
        sb2.setLength(0);
        float f10 = i10;
        return new s6(sb2.toString(), null, new u6[]{new u6((iArr[0] + iArr[1]) / 2.0f, f10), new u6(a(rVar, iArr, sb2), f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }
}
