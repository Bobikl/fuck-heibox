package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: compiled from: TwoDimDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public class k7 {
    public static double a(u6 u6Var, u6 u6Var2) {
        return Math.atan2(u6Var2.c() - u6Var.c(), u6Var2.b() - u6Var.b());
    }

    public static byte[] a(p pVar, Map<l1, Object> map, s6 s6Var, int[] iArr, double[] dArr) throws a {
        if (pVar == null) {
            return null;
        }
        Collection collection = map != null ? (Collection) map.get(l1.POSSIBLE_FORMATS) : null;
        if (!(collection == null || collection.contains(BarcodeFormat.QR_CODE) || collection.contains(BarcodeFormat.PDF_417)) || s6Var == null || s6Var.k() != null) {
            iArr[0] = pVar.e();
            iArr[1] = pVar.c();
            return pVar.d();
        }
        if (collection != null) {
            collection.clear();
            l1 l1Var = l1.POSSIBLE_FORMATS;
            map.remove(l1Var);
            collection.add(s6Var.c());
            map.put(l1Var, collection);
        } else if (map != null) {
            l1 l1Var2 = l1.POSSIBLE_FORMATS;
            map.remove(l1Var2);
            Vector vector = new Vector();
            vector.add(s6Var.c());
            map.put(l1Var2, vector);
        }
        float f10 = 3.0f / r3.f62283i;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        dArr[5] = f10;
        return a(pVar, s6Var.j(), dArr, iArr);
    }

    private static byte[] a(p pVar, u6[] u6VarArr, double[] dArr, int[] iArr) throws a {
        if (u6VarArr == null) {
            iArr[0] = pVar.e();
            iArr[1] = pVar.c();
            return pVar.d();
        }
        int iE = pVar.e();
        int iB = iE;
        int iC = pVar.c();
        int iB2 = 0;
        int iC2 = 0;
        for (u6 u6Var : u6VarArr) {
            if (u6Var != null) {
                if (((int) u6Var.b()) < iB) {
                    iB = (int) u6Var.b();
                }
                if (((int) u6Var.c()) < iC) {
                    iC = (int) u6Var.c();
                }
                if (((int) u6Var.b()) > iB2) {
                    iB2 = (int) u6Var.b();
                }
                if (((int) u6Var.c()) > iC2) {
                    iC2 = (int) u6Var.c();
                }
            }
        }
        return a(u6VarArr, pVar, iArr, Math.max(iB2 - iB, iC2 - iC), dArr);
    }

    private static byte[] a(u6[] u6VarArr, p pVar, int[] iArr, float f10, double[] dArr) throws a {
        float fB = u6VarArr[0].b();
        float fB2 = u6VarArr[1].b();
        float fB3 = u6VarArr[2].b();
        float fC = u6VarArr[0].c();
        float fC2 = u6VarArr[1].c();
        float fC3 = u6VarArr[2].c();
        if (fB < 0.0f || fB2 < 0.0f || fB3 < 0.0f || fC < 0.0f || fC2 < 0.0f || fC3 < 0.0f || fB > pVar.e() || fB2 > pVar.e() || fB3 > pVar.e() || fC > pVar.c() || fC2 > pVar.c() || fC3 > pVar.c()) {
            iArr[0] = pVar.e();
            iArr[1] = pVar.c();
            throw a.a();
        }
        int i10 = ((int) (fC + fC3)) / 2;
        int i11 = (int) ((((int) (fB + fB3)) / 2) - f10);
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = (int) (i10 - f10);
        if (i12 < 0) {
            i12 = 0;
        }
        int iC = ((int) f10) * 2;
        int iE = i11 + iC <= pVar.e() ? iC : pVar.e() - i11;
        if (i12 + iC > pVar.c()) {
            iC = pVar.c() - i12;
        }
        p pVarA = pVar.a(i11, i12, iE, iC);
        double degrees = dArr[0] + Math.toDegrees(a(u6VarArr[0], u6VarArr[1])) + 90.0d;
        dArr[0] = degrees;
        dArr[1] = i11;
        dArr[2] = i12;
        double d10 = iE;
        dArr[3] = d10;
        double d11 = iC;
        dArr[4] = d11;
        double radians = Math.toRadians(degrees);
        int iAbs = (int) (((Math.abs(Math.sin(radians)) * d10) + (Math.abs(Math.cos(radians)) * d11)) * dArr[5]);
        int iAbs2 = (int) (((d11 * Math.abs(Math.sin(radians))) + (d10 * Math.abs(Math.cos(radians)))) * dArr[5]);
        iArr[0] = iAbs2;
        iArr[1] = iAbs;
        byte[] bArrImageRotate = LoadOpencvJNIUtil.imageRotate(pVarA.d(), pVarA.c(), pVarA.e(), iAbs, iAbs2, (float) dArr[0], dArr[5]);
        if (bArrImageRotate != null) {
            return bArrImageRotate;
        }
        iArr[0] = pVar.e();
        iArr[1] = pVar.c();
        return pVar.d();
    }

    public static u6[] a(u6[] u6VarArr, int i10, int i11, double[] dArr) {
        u6[] u6VarArr2;
        int i12;
        u6 u6Var = null;
        if (u6VarArr == null) {
            return null;
        }
        double d10 = dArr[3];
        int i13 = d10 != 0.0d ? (int) d10 : i10;
        double d11 = dArr[4];
        int i14 = d11 != 0.0d ? (int) d11 : i11;
        double d12 = dArr[5];
        u6[] u6VarArr3 = new u6[u6VarArr.length];
        int i15 = 0;
        double radians = Math.toRadians(dArr[0]);
        double dCos = Math.cos(radians) * d12;
        double dSin = Math.sin(radians) * d12;
        double d13 = i14;
        double d14 = i13;
        double dAbs = (((Math.abs(dSin) - dSin) * d13) + ((Math.abs(dCos) - dCos) * d14)) / 2.0d;
        double d15 = -dSin;
        double dAbs2 = ((d13 * (Math.abs(dCos) - dCos)) + (d14 * (Math.abs(dSin) + dSin))) / 2.0d;
        while (i15 < u6VarArr.length) {
            u6 u6Var2 = u6VarArr[i15];
            if (u6Var2 != null) {
                u6VarArr2 = u6VarArr3;
                i12 = i15;
                double dB = (((((double) u6Var2.b()) - dAbs) * dCos) + ((dAbs2 - ((double) u6Var2.c())) * dSin)) / ((dCos * dCos) - (dSin * d15));
                u6VarArr2[i12] = new u6(Math.round(dB) + ((long) ((int) dArr[1])), Math.round(dSin == 0.0d ? (((double) u6Var2.c()) - dAbs2) / dCos : ((((double) u6Var2.b()) - dAbs) - (dCos * dB)) / dSin) + ((long) ((int) dArr[2])));
                u6Var = null;
            } else {
                u6VarArr2 = u6VarArr3;
                i12 = i15;
                u6VarArr2[i12] = u6Var;
            }
            i15 = i12 + 1;
            d15 = d15;
            u6VarArr3 = u6VarArr2;
        }
        return u6VarArr3;
    }
}
