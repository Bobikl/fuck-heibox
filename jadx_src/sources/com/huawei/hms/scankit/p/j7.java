package com.huawei.hms.scankit.p;

import java.util.HashMap;

/* JADX INFO: compiled from: ToneMapping.java */
/* JADX INFO: loaded from: classes7.dex */
public class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f62005a = 2.51f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f62006b = 0.03f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f62007c = 2.43f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static float f62008d = 0.59f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static float f62009e = 0.14f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HashMap<Integer, Integer> f62010f = new HashMap<>(255);

    private static int a(int i10, float f10) {
        if (f62010f.containsKey(Integer.valueOf(i10))) {
            return f62010f.get(Integer.valueOf(i10)).intValue();
        }
        float f11 = i10 / f10;
        int i11 = (int) ((f10 * (((f62005a * f11) + f62006b) * f11)) / ((f11 * ((f62007c * f11) + f62008d)) + f62009e));
        f62010f.put(Integer.valueOf(i10), Integer.valueOf(i11));
        return i11;
    }

    private static int a(p4 p4Var) {
        byte[] bArrB = p4Var.b();
        if (bArrB == null) {
            return 1;
        }
        long j10 = 0;
        int iC = p4Var.c();
        int iA = p4Var.a();
        for (int i10 = iA / 4; i10 < (iA * 3) / 4; i10++) {
            for (int i11 = iC / 4; i11 < (iC * 3) / 4; i11++) {
                j10 += (long) (bArrB[(i10 * iC) + i11] & 255);
            }
        }
        return (int) ((j10 / ((long) bArrB.length)) * 4);
    }

    public static p4 b(p4 p4Var) {
        int iA = a(p4Var);
        int iC = p4Var.c();
        int iA2 = p4Var.a();
        byte[] bArrB = p4Var.b();
        byte[] bArr = new byte[iA2 * iC];
        for (int i10 = 0; i10 < iA2; i10++) {
            for (int i11 = 0; i11 < iC; i11++) {
                int i12 = (i10 * iC) + i11;
                bArr[i12] = (byte) (a(bArrB[i12] & 255, iA) & 255);
            }
        }
        f62010f = new HashMap<>(255);
        return new e6(bArr, iC, iA2, 0, 0, iC, iA2, false);
    }
}
