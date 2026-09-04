package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: Easing.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17641c = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17642d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f17643e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17644f = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17645g = "cubic(0.36, 0, 0.66, -0.56)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f17646h = "cubic(0.34, 1.56, 0.64, 1)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f17650l = "linear";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f17651m = "anticipate";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f17652n = "overshoot";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f17654a = "identity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static d f17640b = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f17649k = "standard";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f17648j = "accelerate";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f17647i = "decelerate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String[] f17653o = {f17649k, f17648j, f17647i, "linear"};

    /* JADX INFO: compiled from: Easing.java */
    public static class a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static double f17655t = 0.01d;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static double f17656u = 1.0E-4d;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f17657p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        double f17658q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        double f17659r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        double f17660s;

        public a(double d10, double d11, double d12, double d13) {
            h(d10, d11, d12, d13);
        }

        a(String str) {
            this.f17654a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f17657p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f17658q = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f17659r = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f17660s = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        private double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f17657p;
            double d13 = this.f17659r;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        private double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f17658q;
            double d13 = this.f17660s;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        private double f(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f17657p * d11 * d12 * d10) + (this.f17659r * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        private double g(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f17658q * d11 * d12 * d10) + (this.f17660s * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f17655t) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double dF = f(d13);
            double d14 = d12 + d11;
            double dF2 = f(d14);
            double dG = g(d13);
            return (((g(d14) - dG) * (d10 - dF)) / (dF2 - dF)) + dG;
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f17656u) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (g(d14) - g(d13)) / (f(d14) - f(d13));
        }

        void h(double d10, double d11, double d12, double d13) {
            this.f17657p = d10;
            this.f17658q = d11;
            this.f17659r = d12;
            this.f17660s = d13;
        }
    }

    public static d c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new q(str);
        }
        if (str.startsWith("Schlick")) {
            return new n(str);
        }
        switch (str) {
            case "accelerate":
                return new a(f17642d);
            case "decelerate":
                return new a(f17643e);
            case "anticipate":
                return new a(f17645g);
            case "linear":
                return new a(f17644f);
            case "overshoot":
                return new a(f17646h);
            case "standard":
                return new a(f17641c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f17653o));
                return f17640b;
        }
    }

    public double a(double d10) {
        return d10;
    }

    public double b(double d10) {
        return 1.0d;
    }

    public String toString() {
        return this.f17654a;
    }
}
