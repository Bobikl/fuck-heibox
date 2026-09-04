package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: StepCurve.java */
/* JADX INFO: loaded from: classes.dex */
public class q extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final boolean f17799q = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    k f17800p;

    q(String str) {
        this.f17654a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f17800p = e(Arrays.copyOf(dArr, i10 + 1));
    }

    private static k d(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = Double.parseDouble(strArrSplit[i10]);
        }
        return e(dArr);
    }

    private static k e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d10 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double d11 = dArr[i10];
            int i11 = i10 + length2;
            dArr2[i11][0] = d11;
            double d12 = ((double) i10) * d10;
            dArr3[i11] = d12;
            if (i10 > 0) {
                int i12 = (length2 * 2) + i10;
                dArr2[i12][0] = d11 + 1.0d;
                dArr3[i12] = d12 + 1.0d;
                int i13 = i10 - 1;
                dArr2[i13][0] = (d11 - 1.0d) - d10;
                dArr3[i13] = (d12 - 1.0d) - d10;
            }
        }
        k kVar = new k(dArr3, dArr2);
        System.out.println(" 0 " + kVar.c(0.0d, 0));
        System.out.println(" 1 " + kVar.c(1.0d, 0));
        return kVar;
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double a(double d10) {
        return this.f17800p.c(d10, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double b(double d10) {
        return this.f17800p.f(d10, 0);
    }
}
