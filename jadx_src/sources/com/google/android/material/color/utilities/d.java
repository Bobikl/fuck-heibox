package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Contrast.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f53848a = 1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f53849b = 21.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f53850c = 3.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f53851d = 4.5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f53852e = 7.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f53853f = 0.04d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f53854g = 0.4d;

    private d() {
    }

    public static double a(double d10, double d11) {
        if (d10 >= 0.0d && d10 <= 100.0d) {
            double dT = c.t(d10);
            double d12 = ((dT + 5.0d) / d11) - 5.0d;
            if (d12 >= 0.0d && d12 <= 100.0d) {
                double dF = f(dT, d12);
                double dAbs = Math.abs(dF - d11);
                if (dF < d11 && dAbs > f53853f) {
                    return -1.0d;
                }
                double dP = c.p(d12) - f53854g;
                if (dP >= 0.0d && dP <= 100.0d) {
                    return dP;
                }
            }
        }
        return -1.0d;
    }

    public static double b(double d10, double d11) {
        return Math.max(0.0d, a(d10, d11));
    }

    public static double c(double d10, double d11) {
        if (d10 >= 0.0d && d10 <= 100.0d) {
            double dT = c.t(d10);
            double d12 = ((dT + 5.0d) * d11) - 5.0d;
            if (d12 >= 0.0d && d12 <= 100.0d) {
                double dF = f(d12, dT);
                double dAbs = Math.abs(dF - d11);
                if (dF < d11 && dAbs > f53853f) {
                    return -1.0d;
                }
                double dP = c.p(d12) + f53854g;
                if (dP >= 0.0d && dP <= 100.0d) {
                    return dP;
                }
            }
        }
        return -1.0d;
    }

    public static double d(double d10, double d11) {
        double dC = c(d10, d11);
        if (dC < 0.0d) {
            return 100.0d;
        }
        return dC;
    }

    public static double e(double d10, double d11) {
        return f(c.t(d10), c.t(d11));
    }

    public static double f(double d10, double d11) {
        double dMax = Math.max(d10, d11);
        if (dMax != d11) {
            d10 = d11;
        }
        return (dMax + 5.0d) / (d10 + 5.0d);
    }
}
