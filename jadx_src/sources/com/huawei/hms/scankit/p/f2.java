package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f61802a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f61803b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f61804c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f61805d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f61806e = false;

    private static float a(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static o5 a(p pVar, Map<l1, ?> map, boolean z10) throws a {
        s sVarB = pVar.b();
        a(false);
        List<u6[]> listA = a(z10, sVarB);
        if (listA.isEmpty()) {
            sVarB = sVarB.clone();
            sVarB.f();
            listA = a(z10, sVarB);
            a(true);
        }
        return new o5(sVarB, listA);
    }

    private static List<u6[]> a(boolean z10, s sVar) {
        int iB;
        float fC;
        ArrayList<u6[]> arrayList = new ArrayList();
        int iMax = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10;
            while (iMax < sVar.c()) {
                u6[] u6VarArrA = a(sVar, iMax, i10);
                if (u6VarArrA[0] == null && u6VarArrA[3] == null) {
                    if (i11 == 0) {
                        break;
                    }
                    for (u6[] u6VarArr : arrayList) {
                        u6 u6Var = u6VarArr[1];
                        if (u6Var != null) {
                            iMax = (int) Math.max(iMax, u6Var.c());
                        }
                        u6 u6Var2 = u6VarArr[3];
                        if (u6Var2 != null) {
                            iMax = Math.max(iMax, (int) u6Var2.c());
                        }
                    }
                    iMax += 5;
                    i10 = 0;
                } else {
                    arrayList.add(u6VarArrA);
                    if (!z10) {
                        break loop0;
                    }
                    u6 u6Var3 = u6VarArrA[2];
                    if (u6Var3 != null) {
                        iB = (int) u6Var3.b();
                        fC = u6VarArrA[2].c();
                    } else {
                        iB = (int) u6VarArrA[4].b();
                        fC = u6VarArrA[4].c();
                    }
                    iMax = (int) fC;
                    i10 = iB;
                    i11 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    public static void a(boolean z10) {
        f61806e = z10;
    }

    private static void a(u6[] u6VarArr, u6[] u6VarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            u6VarArr[iArr[i10]] = u6VarArr2[i10];
        }
    }

    public static boolean a() {
        return f61806e;
    }

    private static int[] a(s sVar, int i10, int i11, int i12, boolean z10, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (sVar.b(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i15 = 0;
        int i16 = i10;
        while (i10 < i12) {
            if (sVar.b(i10, i11) != z11) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (a(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i16, i10};
                    }
                    i16 += iArr2[0] + iArr2[1];
                    int i17 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z11 = !z11;
            }
            i10++;
        }
        if (i15 != length - 1 || a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i10 - 1};
    }

    private static u6[] a(s sVar, int i10, int i11) {
        int iC = sVar.c();
        int iE = sVar.e();
        u6[] u6VarArr = new u6[8];
        a(u6VarArr, a(sVar, iC, iE, i10, i11, f61804c), f61802a);
        u6 u6Var = u6VarArr[4];
        if (u6Var != null) {
            i11 = (int) u6Var.b();
            i10 = (int) u6VarArr[4].c();
        }
        a(u6VarArr, a(sVar, iC, iE, i10, i11, f61805d), f61803b);
        return u6VarArr;
    }

    private static u6[] a(s sVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        u6[] u6VarArr = new u6[4];
        int[] iArr2 = new int[iArr.length];
        int i17 = i12;
        while (true) {
            if (i17 >= i10) {
                z10 = false;
                break;
            }
            int[] iArrA = a(sVar, i13, i17, i11, false, iArr, iArr2);
            if (iArrA != null) {
                int i18 = i17;
                int[] iArr3 = iArrA;
                int i19 = i18;
                while (true) {
                    if (i19 <= 0) {
                        i16 = i19;
                        break;
                    }
                    int i20 = i19 - 1;
                    int[] iArrA2 = a(sVar, i13, i20, i11, false, iArr, iArr2);
                    if (iArrA2 == null) {
                        i16 = i20 + 1;
                        break;
                    }
                    iArr3 = iArrA2;
                    i19 = i20;
                }
                float f10 = i16;
                u6VarArr[0] = new u6(iArr3[0], f10);
                u6VarArr[1] = new u6(iArr3[1], f10);
                z10 = true;
                i17 = i16;
                break;
            }
            i17 += 5;
        }
        int i21 = i17 + 1;
        if (z10) {
            int[] iArr4 = {(int) u6VarArr[0].b(), (int) u6VarArr[1].b()};
            int i22 = i21;
            int i23 = 0;
            while (true) {
                if (i22 >= i10) {
                    i14 = i23;
                    i15 = i22;
                    break;
                }
                i14 = i23;
                i15 = i22;
                int[] iArrA3 = a(sVar, iArr4[0], i22, i11, false, iArr, iArr2);
                if (iArrA3 != null && Math.abs(iArr4[0] - iArrA3[0]) < 5 && Math.abs(iArr4[1] - iArrA3[1]) < 5) {
                    iArr4 = iArrA3;
                    i23 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i23 = i14 + 1;
                }
                i22 = i15 + 1;
            }
            i21 = i15 - (i14 + 1);
            float f11 = i21;
            u6VarArr[2] = new u6(iArr4[0], f11);
            u6VarArr[3] = new u6(iArr4[1], f11);
        }
        if (i21 - i17 < 10) {
            Arrays.fill(u6VarArr, (Object) null);
        }
        return u6VarArr;
    }
}
