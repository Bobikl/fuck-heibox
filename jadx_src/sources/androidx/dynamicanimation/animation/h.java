package androidx.dynamicanimation.animation;

import androidx.annotation.RestrictTo;
import androidx.annotation.x;

/* JADX INFO: compiled from: SpringForce.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f22909k = 10000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f22910l = 1500.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f22911m = 200.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f22912n = 50.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f22913o = 0.2f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f22914p = 0.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f22915q = 0.75f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f22916r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final double f22917s = 62.5d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f22918t = Double.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f22919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f22920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f22922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f22923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f22924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f22925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f22926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f22927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b.p f22928j;

    public h() {
        this.f22919a = Math.sqrt(1500.0d);
        this.f22920b = 0.5d;
        this.f22921c = false;
        this.f22927i = Double.MAX_VALUE;
        this.f22928j = new b.p();
    }

    public h(float f10) {
        this.f22919a = Math.sqrt(1500.0d);
        this.f22920b = 0.5d;
        this.f22921c = false;
        this.f22927i = Double.MAX_VALUE;
        this.f22928j = new b.p();
        this.f22927i = f10;
    }

    private void f() {
        if (this.f22921c) {
            return;
        }
        if (this.f22927i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f22920b;
        if (d10 > 1.0d) {
            double d11 = this.f22919a;
            this.f22924f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f22920b;
            double d13 = this.f22919a;
            this.f22925g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f22926h = this.f22919a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f22921c = true;
    }

    @Override // androidx.dynamicanimation.animation.f
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float a(float f10, float f11) {
        float fD = f10 - d();
        double d10 = this.f22919a;
        return (float) (((-(d10 * d10)) * ((double) fD)) - (((d10 * 2.0d) * this.f22920b) * ((double) f11)));
    }

    @Override // androidx.dynamicanimation.animation.f
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean b(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f22923e && ((double) Math.abs(f10 - d())) < this.f22922d;
    }

    public float c() {
        return (float) this.f22920b;
    }

    public float d() {
        return (float) this.f22927i;
    }

    public float e() {
        double d10 = this.f22919a;
        return (float) (d10 * d10);
    }

    public h g(@x(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f22920b = f10;
        this.f22921c = false;
        return this;
    }

    public h h(float f10) {
        this.f22927i = f10;
        return this;
    }

    public h i(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f22919a = Math.sqrt(f10);
        this.f22921c = false;
        return this;
    }

    void j(double d10) {
        double dAbs = Math.abs(d10);
        this.f22922d = dAbs;
        this.f22923e = dAbs * f22917s;
    }

    b.p k(double d10, double d11, long j10) {
        double dCos;
        double dPow;
        f();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f22927i;
        double d14 = this.f22920b;
        if (d14 > 1.0d) {
            double d15 = this.f22925g;
            double d16 = this.f22924f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f22924f * d12) * d18);
            double d19 = this.f22925g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f22924f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f22919a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f22919a) * d12);
            double d24 = this.f22919a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f22926h;
            double d26 = this.f22919a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            double dPow4 = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f22926h * d12) * d13) + (Math.sin(this.f22926h * d12) * d27));
            double d28 = this.f22919a;
            double d29 = this.f22920b;
            double d30 = (-d28) * dPow4 * d29;
            double dPow5 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.f22926h;
            double dSin = (-d31) * d13 * Math.sin(d31 * d12);
            double d32 = this.f22926h;
            dCos = d30 + (dPow5 * (dSin + (d27 * d32 * Math.cos(d32 * d12))));
            dPow = dPow4;
        }
        b.p pVar = this.f22928j;
        pVar.f22899a = (float) (dPow + this.f22927i);
        pVar.f22900b = (float) dCos;
        return pVar;
    }
}
