package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: compiled from: UPCEANExtension2Support.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62143a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f62144b = new StringBuilder();

    n7() {
    }

    private int a(r rVar, int[] iArr, StringBuilder sb2) throws a {
        int[] iArr2 = this.f62143a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iE = rVar.e();
        int iD = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 2 && iD < iE; i11++) {
            int iA = q7.a(rVar, iArr2, iD, q7.f62266g);
            sb2.append((char) ((iA % 10) + 48));
            for (int i12 : iArr2) {
                iD += i12;
            }
            if (iA >= 10) {
                i10 |= 1 << (1 - i11);
            }
            if (i11 != 1) {
                iD = rVar.d(rVar.c(iD));
            }
        }
        if (sb2.length() != 2) {
            throw a.a();
        }
        try {
            if (Integer.parseInt(sb2.toString()) % 4 == i10) {
                return iD;
            }
            throw a.a();
        } catch (NumberFormatException unused) {
            throw a.a();
        }
    }

    s6 a(int i10, r rVar, int[] iArr) throws a {
        StringBuilder sb2 = this.f62144b;
        sb2.setLength(0);
        float f10 = i10;
        return new s6(sb2.toString(), null, new u6[]{new u6((iArr[0] + iArr[1]) / 2.0f, f10), new u6(a(rVar, iArr, sb2), f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }
}
