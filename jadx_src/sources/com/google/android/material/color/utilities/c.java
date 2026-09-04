package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final double[][] f53841a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[][] f53842b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final double[] f53843c = {95.047d, 100.0d, 108.883d};

    private c() {
    }

    public static int a(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int b(double d10, double d11, double d12) {
        double[] dArr = f53843c;
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = d13 - (d12 / 200.0d);
        return f(m((d11 / 500.0d) + d13) * dArr[0], m(d13) * dArr[1], m(d14) * dArr[2]);
    }

    public static int c(double[] dArr) {
        return e(h(dArr[0]), h(dArr[1]), h(dArr[2]));
    }

    public static int d(double d10) {
        int iH = h(t(d10));
        return e(iH, iH, iH);
    }

    public static int e(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | androidx.core.view.j1.f21601t | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static int f(double d10, double d11, double d12) {
        double[][] dArr = f53842b;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        return e(h(d13), h(d14), h((dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12)));
    }

    public static int g(int i10) {
        return i10 & 255;
    }

    public static int h(double d10) {
        double d11 = d10 / 100.0d;
        return b6.b(0, 255, (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int i(int i10) {
        return (i10 >> 8) & 255;
    }

    public static boolean j(int i10) {
        return a(i10) >= 255;
    }

    static double k(double d10) {
        return d10 > 0.008856451679035631d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] l(int i10) {
        double dN = n(q(i10));
        double dN2 = n(i(i10));
        double dN3 = n(g(i10));
        double[][] dArr = f53841a;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[0] * dN) + (dArr2[1] * dN2) + (dArr2[2] * dN3);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[0] * dN) + (dArr3[1] * dN2) + (dArr3[2] * dN3);
        double[] dArr4 = dArr[2];
        double d12 = (dArr4[0] * dN) + (dArr4[1] * dN2) + (dArr4[2] * dN3);
        double[] dArr5 = f53843c;
        double d13 = d10 / dArr5[0];
        double d14 = d11 / dArr5[1];
        double d15 = d12 / dArr5[2];
        double dK = k(d13);
        double dK2 = k(d14);
        return new double[]{(116.0d * dK2) - 16.0d, (dK - dK2) * 500.0d, (dK2 - k(d15)) * 200.0d};
    }

    static double m(double d10) {
        double d11 = d10 * d10 * d10;
        return d11 > 0.008856451679035631d ? d11 : ((d10 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double n(int i10) {
        double d10 = ((double) i10) / 255.0d;
        return (d10 <= 0.040449936d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double o(int i10) {
        return (k(s(i10)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double p(double d10) {
        return (k(d10 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int q(int i10) {
        return (i10 >> 16) & 255;
    }

    public static double[] r() {
        return f53843c;
    }

    public static double[] s(int i10) {
        return b6.e(new double[]{n(q(i10)), n(i(i10)), n(g(i10))}, f53841a);
    }

    public static double t(double d10) {
        return m((d10 + 16.0d) / 116.0d) * 100.0d;
    }
}
