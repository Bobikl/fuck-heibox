package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;

/* JADX INFO: compiled from: ImageResize.java */
/* JADX INFO: loaded from: classes7.dex */
public class l4 {
    public static int a(int i10, int i11, int i12) {
        if (i10 >= i11) {
            return i11;
        }
        return i10 <= i12 ? i12 : i10;
    }

    public static p a(p pVar) {
        int iE = pVar.e();
        int iC = pVar.c();
        byte[] bArrD = pVar.d();
        byte[] bArr = new byte[iE * iC];
        for (int i10 = 0; i10 < iC; i10++) {
            for (int i11 = 0; i11 < iE; i11++) {
                bArr[(((i11 * iC) + iC) - i10) - 1] = bArrD[(i10 * iE) + i11];
            }
        }
        return new p(new e4(new e6(bArr, iC, iE, 0, 0, iC, iE, false)));
    }

    public static p a(p pVar, float f10) {
        if (f10 == 1.0f) {
            return pVar;
        }
        int iC = pVar.c();
        int iE = pVar.e();
        int i10 = (int) (iE / f10);
        int i11 = (int) (iC / f10);
        byte[] bArrD = pVar.d();
        int i12 = i10 * i11;
        byte[] bArr = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            double dA = a(i14 % i10, i10 - 1, i13) * f10;
            double dA2 = a(i14 / i10, i11 - 1, i13) * f10;
            double dFloor = Math.floor(dA);
            int i15 = i14;
            double dFloor2 = Math.floor(dA2);
            double d10 = dA - dFloor;
            double d11 = dA2 - dFloor2;
            int i16 = iE - 1;
            int i17 = i12;
            int iA = a((int) dFloor, i16, 0);
            int i18 = iC - 1;
            int iA2 = a((int) dFloor2, i18, 0);
            int i19 = iA2 * iE;
            int i20 = iC;
            int i21 = i10;
            double d12 = 1.0d - d10;
            double d13 = 1.0d - d11;
            int i22 = iA + 1;
            byte[] bArr2 = bArr;
            int i23 = iA2 + 1;
            bArr2[i15] = (byte) (((int) ((((double) (bArrD[i19 + iA] & 255)) * d12 * d13) + (((double) (bArrD[i19 + a(i22, i16, 0)] & 255)) * d10 * d13) + (((double) (bArrD[(a(i23, i18, 0) * iE) + iA] & 255)) * d12 * d11) + (((double) (bArrD[(a(i23, i18, 0) * iE) + a(i22, i16, 0)] & 255)) * d10 * d11))) & 255);
            i14 = i15 + 1;
            i13 = 0;
            i12 = i17;
            i10 = i21;
            iC = i20;
            i11 = i11;
            bArr = bArr2;
        }
        return new p(new e4(new e6(bArr, i10, i11, 0, 0, i10, i11, false)));
    }

    public static p a(boolean z10, p pVar, float f10) {
        if (f10 == 1.0f) {
            return pVar;
        }
        int iC = pVar.c();
        int iE = pVar.e();
        int i10 = (int) (iE / f10);
        int i11 = (int) (iC / f10);
        return new p(new e4(new e6(LoadOpencvJNIUtil.imageResize(pVar.d(), iC, iE, i11, i10), i10, i11, 0, 0, i10, i11, false)));
    }
}
