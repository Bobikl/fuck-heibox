package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Schlick.java */
/* JADX INFO: loaded from: classes.dex */
public class n extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f17769s = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    double f17770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    double f17771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    double f17772r;

    n(String str) {
        this.f17654a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f17770p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f17771q = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    private double d(double d10) {
        double d11 = this.f17771q;
        if (d10 < d11) {
            double d12 = this.f17770p;
            return ((d12 * d11) * d11) / ((((d11 - d10) * d12) + d10) * ((d12 * (d11 - d10)) + d10));
        }
        double d13 = this.f17770p;
        return (((d11 - 1.0d) * d13) * (d11 - 1.0d)) / (((((-d13) * (d11 - d10)) - d10) + 1.0d) * ((((-d13) * (d11 - d10)) - d10) + 1.0d));
    }

    private double e(double d10) {
        double d11 = this.f17771q;
        return d10 < d11 ? (d11 * d10) / (d10 + (this.f17770p * (d11 - d10))) : ((1.0d - d11) * (d10 - 1.0d)) / ((1.0d - d10) - (this.f17770p * (d11 - d10)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double a(double d10) {
        return e(d10);
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double b(double d10) {
        return d(d10);
    }
}
