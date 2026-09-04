package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: HyperSpline.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f17665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a[][] f17666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double[] f17668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f17669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double[][] f17670f;

    /* JADX INFO: compiled from: HyperSpline.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f17671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f17672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f17673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f17674d;

        public a(double d10, double d11, double d12, double d13) {
            this.f17671a = d10;
            this.f17672b = d11;
            this.f17673c = d12;
            this.f17674d = d13;
        }

        public double a(double d10) {
            return (((((this.f17674d * d10) + this.f17673c) * d10) + this.f17672b) * d10) + this.f17671a;
        }

        public double b(double d10) {
            return (((this.f17674d * 3.0d * d10) + (this.f17673c * 2.0d)) * d10) + this.f17672b;
        }
    }

    public f() {
    }

    public f(double[][] dArr) {
        g(dArr);
    }

    static a[] b(int i10, double[] dArr) {
        double[] dArr2 = new double[i10];
        double[] dArr3 = new double[i10];
        double[] dArr4 = new double[i10];
        int i11 = i10 - 1;
        int i12 = 0;
        dArr2[0] = 0.5d;
        int i13 = 1;
        for (int i14 = 1; i14 < i11; i14++) {
            dArr2[i14] = 1.0d / (4.0d - dArr2[i14 - 1]);
        }
        int i15 = i11 - 1;
        dArr2[i11] = 1.0d / (2.0d - dArr2[i15]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i13 < i11) {
            int i16 = i13 + 1;
            int i17 = i13 - 1;
            dArr3[i13] = (((dArr[i16] - dArr[i17]) * 3.0d) - dArr3[i17]) * dArr2[i13];
            i13 = i16;
        }
        double d10 = (((dArr[i11] - dArr[i15]) * 3.0d) - dArr3[i15]) * dArr2[i11];
        dArr3[i11] = d10;
        dArr4[i11] = d10;
        while (i15 >= 0) {
            dArr4[i15] = dArr3[i15] - (dArr2[i15] * dArr4[i15 + 1]);
            i15--;
        }
        a[] aVarArr = new a[i11];
        while (i12 < i11) {
            double d11 = dArr[i12];
            double d12 = dArr4[i12];
            int i18 = i12 + 1;
            double d13 = dArr[i18];
            double d14 = dArr4[i18];
            aVarArr[i12] = new a((float) d11, d12, (((d13 - d11) * 3.0d) - (d12 * 2.0d)) - d14, ((d11 - d13) * 2.0d) + d12 + d14);
            i12 = i18;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i10;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d10 = 0.0d;
        double d11 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i10 = 0;
            if (d11 >= 1.0d) {
                break;
            }
            double d12 = 0.0d;
            while (i10 < aVarArr.length) {
                double d13 = dArr[i10];
                double dA = aVarArr[i10].a(d11);
                dArr[i10] = dA;
                double d14 = d13 - dA;
                d12 += d14 * d14;
                i10++;
            }
            if (d11 > 0.0d) {
                dSqrt += Math.sqrt(d12);
            }
            d11 += 0.1d;
        }
        while (i10 < aVarArr.length) {
            double d15 = dArr[i10];
            double dA2 = aVarArr[i10].a(1.0d);
            dArr[i10] = dA2;
            double d16 = d15 - dA2;
            d10 += d16 * d16;
            i10++;
        }
        return dSqrt + Math.sqrt(d10);
    }

    public double c(double d10, int i10) {
        double[] dArr;
        double d11 = d10 * this.f17669e;
        int i11 = 0;
        while (true) {
            dArr = this.f17668d;
            if (i11 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i11];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i11++;
        }
        return this.f17666b[i10][i11].a(d11 / dArr[i11]);
    }

    public void d(double d10, double[] dArr) {
        double d11 = d10 * this.f17669e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f17668d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f17666b[i11][i10].a(d11 / this.f17668d[i10]);
        }
    }

    public void e(double d10, float[] fArr) {
        double d11 = d10 * this.f17669e;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f17668d;
            if (i10 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = (float) this.f17666b[i11][i10].a(d11 / this.f17668d[i10]);
        }
    }

    public void f(double d10, double[] dArr) {
        double d11 = d10 * this.f17669e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f17668d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f17666b[i11][i10].b(d11 / this.f17668d[i10]);
        }
    }

    public void g(double[][] dArr) {
        int i10;
        int length = dArr[0].length;
        this.f17667c = length;
        int length2 = dArr.length;
        this.f17665a = length2;
        this.f17670f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f17666b = new a[this.f17667c][];
        for (int i11 = 0; i11 < this.f17667c; i11++) {
            for (int i12 = 0; i12 < this.f17665a; i12++) {
                this.f17670f[i11][i12] = dArr[i12][i11];
            }
        }
        int i13 = 0;
        while (true) {
            i10 = this.f17667c;
            if (i13 >= i10) {
                break;
            }
            a[][] aVarArr = this.f17666b;
            double[] dArr2 = this.f17670f[i13];
            aVarArr[i13] = b(dArr2.length, dArr2);
            i13++;
        }
        this.f17668d = new double[this.f17665a - 1];
        this.f17669e = 0.0d;
        a[] aVarArr2 = new a[i10];
        for (int i14 = 0; i14 < this.f17668d.length; i14++) {
            for (int i15 = 0; i15 < this.f17667c; i15++) {
                aVarArr2[i15] = this.f17666b[i15][i14];
            }
            double d10 = this.f17669e;
            double[] dArr3 = this.f17668d;
            double dA = a(aVarArr2);
            dArr3[i14] = dA;
            this.f17669e = d10 + dA;
        }
    }
}
