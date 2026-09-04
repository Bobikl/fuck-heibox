package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.List;

/* JADX INFO: compiled from: DetectorRotate.java */
/* JADX INFO: loaded from: classes7.dex */
public class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d5 f62035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p f62036b;

    private static u6 a(float f10, float f11, i2 i2Var) {
        float[] fArr = i2Var.f61931m;
        if (fArr == null || fArr.length != 5) {
            return new u6(f10, f11);
        }
        float f12 = -fArr[4];
        double d10 = f10 - fArr[0];
        double d11 = f12;
        double dCos = (d10 * Math.cos(d11)) + (((double) (f11 - i2Var.f61931m[1])) * Math.sin(d11));
        float f13 = i2Var.f61931m[0];
        int i10 = (int) (dCos + ((double) f13));
        int iSin = (int) ((((double) (-(f10 - f13))) * Math.sin(d11)) + (((double) (f11 - i2Var.f61931m[1])) * Math.cos(d11)) + ((double) i2Var.f61931m[1]));
        float[] fArr2 = i2Var.f61931m;
        return new u6((i10 - fArr2[2]) + i2Var.f61936r, (iSin - fArr2[3]) + i2Var.f61937s);
    }

    public static List<i2> a(boolean z10, p pVar, int i10, boolean z11) {
        int iE = pVar.e();
        int iC = pVar.c();
        byte[] bArrB = pVar.a().c().b();
        d5 d5Var = new d5();
        f62035a = d5Var;
        d5Var.a(z10, bArrB, iC, iE, i10, z11);
        return f62035a.f61669a;
    }

    private static void a(p pVar, float f10, i2 i2Var, float[] fArr) {
        float fMin;
        float fMax;
        float radians = (float) Math.toRadians(f10);
        double d10 = radians;
        int iAbs = (int) ((((double) i2Var.f61934p) * Math.abs(Math.sin(d10))) + (((double) i2Var.f61935q) * Math.abs(Math.cos(d10))));
        int iAbs2 = (int) ((((double) i2Var.f61935q) * Math.abs(Math.sin(d10))) + (((double) i2Var.f61934p) * Math.abs(Math.cos(d10))));
        float[] fArr2 = i2Var.f61931m;
        fArr2[0] = iAbs2 * 0.5f;
        fArr2[1] = iAbs * 0.5f;
        fArr2[2] = (iAbs2 - i2Var.f61934p) * 0.5f;
        fArr2[3] = (iAbs - i2Var.f61935q) * 0.5f;
        fArr2[4] = radians;
        byte[] bArrRemoveMoirePattern = !r3.f62276b ? LoadOpencvJNIUtil.removeMoirePattern(pVar.a().c().b(), i2Var.f61935q, i2Var.f61934p) : pVar.a().c().b();
        if (f10 == 0.0f) {
            i2Var.f61938t = 0;
            i2Var.f61939u = 0;
            int i10 = i2Var.f61934p;
            int i11 = i2Var.f61935q;
            i2Var.f61930l = new p(new q3(new e6(bArrRemoveMoirePattern, i10, i11, 0, 0, i10, i11, false)));
            return;
        }
        p pVar2 = new p(new q3(new e6(LoadOpencvJNIUtil.imageRotate(bArrRemoveMoirePattern, i2Var.f61935q, i2Var.f61934p, iAbs, iAbs2, f10, 1.0d), iAbs2, iAbs, 0, 0, iAbs2, iAbs, false)));
        if ((i2Var.g() == 3.0f || i2Var.g() == 4.0f) && pVar2.c() > pVar2.e()) {
            fMin = Math.min(fArr[2], fArr[3]);
            fMax = Math.max(fArr[2], fArr[3]);
        } else {
            fMin = Math.max(fArr[2], fArr[3]);
            fMax = Math.min(fArr[2], fArr[3]);
        }
        i2Var.f61938t = (int) Math.max((((double) iAbs2) * 0.5d) - (((double) fMin) * 0.5d), 0.0d);
        i2Var.f61939u = (int) Math.max((((double) iAbs) * 0.5d) - (((double) fMax) * 0.5d), 0.0d);
        i2Var.f61930l = pVar2.a(i2Var.f61938t, i2Var.f61939u, Math.min(iAbs2 - i2Var.f61938t, (int) fMin), Math.min(iAbs - i2Var.f61939u, (int) fMax));
    }

    public static void a(s sVar, s6 s6Var, float f10, i2 i2Var) {
        int iC;
        int iC2;
        u6[] u6VarArrJ = s6Var.j();
        float fMin = Math.min(u6VarArrJ[0].b(), u6VarArrJ[1].b());
        float fMax = Math.max(u6VarArrJ[0].b(), u6VarArrJ[1].b());
        float fC = u6VarArrJ[0].c();
        if (fMax > sVar.e() - 1) {
            fMax = sVar.e() - 1;
        }
        float f11 = fMax;
        float fC2 = fC > ((float) (sVar.c() - 1)) ? sVar.c() - 1 : fC;
        int iC3 = sVar.c();
        try {
            int[] iArrA = a(sVar, u6VarArrJ, fMin, f11, fC2, iC3, new int[iC3]);
            iC = iArrA[0];
            iC2 = iArrA[1];
        } catch (IndexOutOfBoundsException unused) {
            iC = (int) u6VarArrJ[0].c();
            iC2 = (int) u6VarArrJ[0].c();
        }
        float f12 = iC;
        float f13 = iC2;
        u6[] u6VarArr = {new u6(fMin, f12), new u6(f11, f12), new u6(f11, f13), new u6(fMin, f13)};
        if (i2Var != null) {
            a(u6VarArr, f10, i2Var);
        }
        s6Var.a();
        s6Var.a(u6VarArr);
    }

    public static void a(u6[] u6VarArr, float f10, i2 i2Var) {
        if (i2Var == null || u6VarArr == null) {
            return;
        }
        for (int i10 = 0; i10 < u6VarArr.length; i10++) {
            u6VarArr[i10] = a((u6VarArr[i10].b() * f10) + i2Var.f61938t, (u6VarArr[i10].c() * f10) + i2Var.f61939u, i2Var);
        }
    }

    public static boolean a(boolean z10, p pVar, i2 i2Var) throws a {
        float fI;
        int iE = pVar.e();
        int iC = pVar.c();
        float[] fArr = {i2Var.j(), i2Var.k(), i2Var.f(), i2Var.c()};
        if (z10) {
            i2Var.f61932n = Math.max(i2Var.m(), i2Var.l());
            i2Var.f61933o = Math.min(i2Var.m(), i2Var.l());
            fI = i2Var.i();
            if (i2Var.g() == 11.0f || i2Var.g() == 0.0f) {
                fI = 0.0f;
            }
            i2Var.f61940v = Math.max(fArr[2], fArr[3]);
            i2Var.f61936r = (int) Math.max(((double) fArr[0]) - (((double) fArr[2]) * 0.5d), 0.0d);
            i2Var.f61937s = (int) Math.max(((double) fArr[1]) - (((double) fArr[3]) * 0.5d), 0.0d);
        } else {
            fI = i2Var.i();
            i2Var.f61940v = Math.max(fArr[2], fArr[3]);
            i2Var.f61936r = (int) i2Var.d();
            i2Var.f61937s = (int) i2Var.e();
        }
        i2Var.f61934p = Math.min(iE - i2Var.f61936r, (int) fArr[2]);
        int iMin = Math.min(iC - i2Var.f61937s, (int) fArr[3]);
        i2Var.f61935q = iMin;
        int i10 = i2Var.f61934p;
        if (i10 <= 0 || iMin <= 0) {
            throw a.a("crop_w <= 0 || crop_h <= 0");
        }
        p pVarA = pVar.a(i2Var.f61936r, i2Var.f61937s, i10, iMin);
        f62036b = pVarA;
        a(pVarA, fI, i2Var, fArr);
        return true;
    }

    private static int[] a(s sVar, u6[] u6VarArr, float f10, float f11, float f12, int i10, int[] iArr) {
        int i11;
        int iC;
        int iC2;
        int i12 = (int) f10;
        int i13 = i12;
        int i14 = 0;
        while (true) {
            i11 = ((int) f11) - 1;
            if (i13 >= i11) {
                break;
            }
            int i15 = (int) f12;
            boolean zB = sVar.b(i13, i15);
            i13++;
            if (sVar.b(i13, i15) ^ zB) {
                i14++;
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = i12;
            int i19 = 0;
            while (i18 < i11) {
                boolean zB2 = sVar.b(i18, i17);
                i18++;
                if (zB2 ^ sVar.b(i18, i17)) {
                    i19++;
                }
            }
            float f13 = i14;
            if (i19 > 1.5f * f13) {
                i19 = 0;
            }
            if (i19 < f13 * 0.5f) {
                i19 = 0;
            }
            iArr[i17] = i19;
            if (i19 > i16) {
                i16 = i19;
            }
        }
        if (i16 > 0) {
            float[] fArr = new float[i10];
            for (int i20 = 0; i20 < i10; i20++) {
                fArr[i20] = iArr[i20] / i16;
            }
            float f14 = 0.0f;
            for (int i21 = 0; i21 < i10; i21++) {
                f14 += fArr[i21];
            }
            float f15 = f14 / i10;
            if (f15 > 1.0d) {
                f15 = 0.99f;
            }
            iC = (int) f12;
            iC2 = iC;
            while (true) {
                if (iC2 < 0) {
                    iC2 = 0;
                    break;
                }
                if (fArr[iC2] < f15) {
                    break;
                }
                iC2--;
            }
            while (true) {
                if (iC >= i10) {
                    iC = 0;
                    break;
                }
                if (fArr[iC] < f15) {
                    break;
                }
                iC++;
            }
        } else {
            iC = 0;
            iC2 = 0;
        }
        if (iC2 == 0 && iC == 0) {
            iC2 = ((int) u6VarArr[0].c()) + (-10) < 0 ? 0 : ((int) u6VarArr[0].c()) - 10;
            iC = i10 - 1;
            if (((int) u6VarArr[0].c()) + 10 <= iC) {
                iC = ((int) u6VarArr[0].c()) + 10;
            }
        }
        return new int[]{iC2, iC};
    }
}
