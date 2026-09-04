package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Cam16.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final double[][] f53825k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final double[][] f53826l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f53827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f53828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f53829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f53830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f53831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f53832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f53833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f53834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f53835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double[] f53836j = {0.0d, 0.0d, 0.0d};

    private b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f53827a = d10;
        this.f53828b = d11;
        this.f53829c = d12;
        this.f53830d = d13;
        this.f53831e = d14;
        this.f53832f = d15;
        this.f53833g = d16;
        this.f53834h = d17;
        this.f53835i = d18;
    }

    public static b b(int i10) {
        return c(i10, y6.f53943k);
    }

    static b c(int i10, y6 y6Var) {
        double dN = c.n((16711680 & i10) >> 16);
        double dN2 = c.n((65280 & i10) >> 8);
        double dN3 = c.n(i10 & 255);
        return h((0.41233895d * dN) + (0.35762064d * dN2) + (0.18051042d * dN3), (0.2126d * dN) + (0.7152d * dN2) + (0.0722d * dN3), (dN * 0.01932141d) + (dN2 * 0.11916382d) + (dN3 * 0.95034478d), y6Var);
    }

    static b d(double d10, double d11, double d12) {
        return e(d10, d11, d12, y6.f53943k);
    }

    private static b e(double d10, double d11, double d12, y6 y6Var) {
        double d13 = d10 / 100.0d;
        double dC = (4.0d / y6Var.c()) * Math.sqrt(d13) * (y6Var.b() + 4.0d) * y6Var.e();
        double dE = d11 * y6Var.e();
        double dSqrt = Math.sqrt(((d11 / Math.sqrt(d13)) * y6Var.c()) / (y6Var.b() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d12);
        double d14 = (1.7000000000000002d * d10) / ((0.007d * d10) + 1.0d);
        double dLog1p = 43.859649122807014d * Math.log1p(dE * 0.0228d);
        return new b(d12, d11, d10, dC, dE, dSqrt, d14, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static b f(double d10, double d11, double d12) {
        return g(d10, d11, d12, y6.f53943k);
    }

    public static b g(double d10, double d11, double d12, y6 y6Var) {
        double dExpm1 = (Math.expm1(Math.hypot(d11, d12) * 0.0228d) / 0.0228d) / y6Var.e();
        double dAtan2 = Math.atan2(d12, d11) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return e(d10 / (1.0d - ((d10 - 100.0d) * 0.007d)), dExpm1, dAtan2, y6Var);
    }

    static b h(double d10, double d11, double d12, y6 y6Var) {
        double[][] dArr = f53825k;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        double d15 = (dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12);
        double d16 = y6Var.j()[0] * d13;
        double d17 = y6Var.j()[1] * d14;
        double d18 = y6Var.j()[2] * d15;
        double dPow = Math.pow((y6Var.d() * Math.abs(d16)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((y6Var.d() * Math.abs(d17)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((y6Var.d() * Math.abs(d18)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d16) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d17) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d18) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d19 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d20 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d21 = dSignum2 * 20.0d;
        double d22 = (((dSignum * 20.0d) + d21) + (21.0d * dSignum3)) / 20.0d;
        double d23 = (((dSignum * 40.0d) + d21) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d20, d19));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d24 = degrees;
        double radians = Math.toRadians(d24);
        double dPow4 = Math.pow((d23 * y6Var.g()) / y6Var.b(), y6Var.c() * y6Var.k()) * 100.0d;
        double d25 = dPow4 / 100.0d;
        double dC = (4.0d / y6Var.c()) * Math.sqrt(d25) * (y6Var.b() + 4.0d) * y6Var.e();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, y6Var.f()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d24 < 20.14d ? d24 + 360.0d : d24) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * y6Var.h()) * y6Var.i()) * Math.hypot(d19, d20)) / (d22 + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d25) * dPow5;
        double dE = dSqrt * y6Var.e();
        double dLog1p = Math.log1p(dE * 0.0228d) * 43.859649122807014d;
        return new b(d24, dSqrt, dPow4, dC, dE, Math.sqrt((dPow5 * y6Var.c()) / (y6Var.b() + 4.0d)) * 50.0d, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    double a(b bVar) {
        double dN = n() - bVar.n();
        double dI = i() - bVar.i();
        double dJ = j() - bVar.j();
        return Math.pow(Math.sqrt((dN * dN) + (dI * dI) + (dJ * dJ)), 0.63d) * 1.41d;
    }

    public double i() {
        return this.f53834h;
    }

    public double j() {
        return this.f53835i;
    }

    public double k() {
        return this.f53828b;
    }

    public double l() {
        return this.f53827a;
    }

    public double m() {
        return this.f53829c;
    }

    public double n() {
        return this.f53833g;
    }

    public double o() {
        return this.f53831e;
    }

    public double p() {
        return this.f53830d;
    }

    public double q() {
        return this.f53832f;
    }

    public int r() {
        return s(y6.f53943k);
    }

    int s(y6 y6Var) {
        double[] dArrT = t(y6Var, this.f53836j);
        return c.f(dArrT[0], dArrT[1], dArrT[2]);
    }

    double[] t(y6 y6Var, double[] dArr) {
        double dPow = Math.pow(((k() == 0.0d || m() == 0.0d) ? 0.0d : k() / Math.sqrt(m() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, y6Var.f()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(l());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dB = y6Var.b() * Math.pow(m() / 100.0d, (1.0d / y6Var.c()) / y6Var.k());
        double dH = dCos * 3846.153846153846d * y6Var.h() * y6Var.i();
        double dG = dB / y6Var.g();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d10 = (((0.305d + dG) * 23.0d) * dPow) / (((dH * 23.0d) + ((11.0d * dPow) * dCos2)) + ((dPow * 108.0d) * dSin));
        double d11 = dCos2 * d10;
        double d12 = d10 * dSin;
        double d13 = dG * 460.0d;
        double d14 = (((451.0d * d11) + d13) + (288.0d * d12)) / 1403.0d;
        double d15 = ((d13 - (891.0d * d11)) - (261.0d * d12)) / 1403.0d;
        double d16 = ((d13 - (d11 * 220.0d)) - (d12 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d14) * (100.0d / y6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d14) * 27.13d) / (400.0d - Math.abs(d14))), 2.380952380952381d);
        double dSignum2 = Math.signum(d15) * (100.0d / y6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d);
        double dSignum3 = Math.signum(d16) * (100.0d / y6Var.d()) * Math.pow(Math.max(0.0d, (Math.abs(d16) * 27.13d) / (400.0d - Math.abs(d16))), 2.380952380952381d);
        double d17 = dSignum / y6Var.j()[0];
        double d18 = dSignum2 / y6Var.j()[1];
        double d19 = dSignum3 / y6Var.j()[2];
        double[][] dArr2 = f53826l;
        double[] dArr3 = dArr2[0];
        double d20 = (dArr3[0] * d17) + (dArr3[1] * d18) + (dArr3[2] * d19);
        double[] dArr4 = dArr2[1];
        double d21 = (dArr4[0] * d17) + (dArr4[1] * d18) + (dArr4[2] * d19);
        double[] dArr5 = dArr2[2];
        double d22 = (d17 * dArr5[0]) + (d18 * dArr5[1]) + (d19 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d20, d21, d22};
        }
        dArr[0] = d20;
        dArr[1] = d21;
        dArr[2] = d22;
        return dArr;
    }
}
