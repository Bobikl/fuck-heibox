package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f61879b;

    public h2(s sVar) {
        this.f61878a = sVar;
    }

    private static float a(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private static void a(f3 f3Var, f3 f3Var2, f3 f3Var3, float[] fArr) {
        float fB = f3Var.b() - f3Var2.b();
        float fC = f3Var.c() - f3Var2.c();
        float f10 = (fB * fB) + (fC * fC);
        float fB2 = f3Var.b() - f3Var3.b();
        float fC2 = f3Var.c() - f3Var3.c();
        float f11 = (fB2 * fB2) + (fC2 * fC2);
        float fB3 = f3Var2.b() - f3Var3.b();
        float fC3 = f3Var2.c() - f3Var3.c();
        float f12 = (fB3 * fB3) + (fC3 * fC3);
        if (f10 > f12 && f10 > f11) {
            fArr[0] = f10;
            fArr[1] = f11;
            fArr[2] = f12;
        } else if (f12 <= f10 || f12 <= f11) {
            fArr[0] = f11;
            fArr[1] = f10;
            fArr[2] = f12;
        } else {
            fArr[0] = f12;
            fArr[1] = f10;
            fArr[2] = f11;
        }
    }

    public static boolean a(f3 f3Var, f3 f3Var2, f3 f3Var3) {
        float[] fArr = new float[3];
        a(f3Var, f3Var2, f3Var3, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = (float) Math.sqrt(f11);
        float fSqrt2 = (float) Math.sqrt(f12);
        float fSqrt3 = (float) Math.sqrt(f10);
        if (fSqrt / fSqrt2 >= 1.8f || fSqrt2 / fSqrt >= 1.8f || b(fSqrt, fSqrt2, fSqrt3) <= a(f3Var.e(), f3Var2.e(), f3Var3.e()) * 6.0f) {
            return false;
        }
        float f13 = ((f11 + f12) - f10) / ((fSqrt * 2.0f) * fSqrt2);
        float f14 = fSqrt3 * 2.0f;
        float f15 = ((f10 + f11) - f12) / (fSqrt * f14);
        float f16 = ((f10 + f12) - f11) / (f14 * fSqrt2);
        return Math.abs(f13) <= 0.342f && f15 >= 0.5736f && f15 <= 0.8191f && f16 >= 0.5736f && f16 <= 0.8191f;
    }

    public static boolean a(f3[] f3VarArr, f3[] f3VarArr2, int[] iArr) {
        f3 f3Var = f3VarArr[0];
        f3 f3Var2 = f3VarArr[1];
        f3 f3Var3 = f3VarArr[2];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        float fB = (f3Var3.b() - f3Var2.b()) + f3Var.b();
        float fC = (f3Var3.c() - f3Var2.c()) + f3Var.c();
        float fE = ((f3Var.e() + f3Var2.e()) + f3Var3.e()) / 3.0f;
        for (int i13 = 0; i13 < f3VarArr2.length; i13++) {
            if (i13 != i10 && i13 != i11 && i13 != i12) {
                f3 f3Var4 = f3VarArr2[i13];
                float fB2 = fB - f3Var4.b();
                float fC2 = fC - f3Var4.c();
                if (((float) Math.sqrt((fB2 * fB2) + (fC2 * fC2))) < 10.0f * fE) {
                    return true;
                }
            }
        }
        return false;
    }

    private static float b(float f10, float f11, float f12) {
        return Math.min(Math.min(f10, f11), f12);
    }

    public final f3[] a(Map<l1, ?> map) throws a {
        v6 v6Var = map == null ? null : (v6) map.get(l1.NEED_RESULT_POINT_CALLBACK);
        this.f61879b = v6Var;
        return new j3(this.f61878a, v6Var).a(map);
    }
}
