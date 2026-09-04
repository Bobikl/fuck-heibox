package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: DynamicColor.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function<a0, Double> f53954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<a0, Double> f53955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function<a0, Double> f53956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function<a0, Double> f53957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function<a0, z> f53958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function<a0, Double> f53959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function<a0, Double> f53960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function<a0, x6> f53961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap<a0, b0> f53962i = new HashMap<>();

    /* JADX INFO: compiled from: DynamicColor.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53963a;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            f53963a = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53963a[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53963a[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public z(Function<a0, Double> function, Function<a0, Double> function2, Function<a0, Double> function3, Function<a0, Double> function4, Function<a0, z> function5, Function<a0, Double> function6, Function<a0, Double> function7, Function<a0, x6> function8) {
        this.f53954a = function;
        this.f53955b = function2;
        this.f53956c = function3;
        this.f53957d = function4;
        this.f53958e = function5;
        this.f53959f = function6;
        this.f53960g = function7;
        this.f53961h = function8;
    }

    public static z A(final int i10, Function<a0, Double> function, Function<a0, z> function2, Function<a0, x6> function3) {
        return D(new Function() { // from class: com.google.android.material.color.utilities.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.L(i10, (a0) obj);
            }
        }, function, function2, function3);
    }

    public static z B(Function<a0, w6> function, Function<a0, Double> function2) {
        return D(function, function2, null, null);
    }

    public static z C(Function<a0, w6> function, Function<a0, Double> function2, Function<a0, z> function3) {
        return D(function, function2, function3, null);
    }

    public static z D(final Function<a0, w6> function, final Function<a0, Double> function2, final Function<a0, z> function3, final Function<a0, x6> function4) {
        return new z(new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.M(function, (a0) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.N(function, (a0) obj);
            }
        }, function2, null, function3, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.O(function2, function3, function4, (a0) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.P(function2, function3, function4, (a0) obj);
            }
        }, function4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w6 H(w6 w6Var, a0 a0Var) {
        return w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double I(b0 b0Var, a0 a0Var) {
        return Double.valueOf(b0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w6 J(int i10, a0 a0Var) {
        return w6.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w6 K(int i10, a0 a0Var) {
        return w6.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w6 L(int i10, a0 a0Var) {
        return w6.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double M(Function function, a0 a0Var) {
        return Double.valueOf(((w6) function.apply(a0Var)).f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double N(Function function, a0 a0Var) {
        return Double.valueOf(((w6) function.apply(a0Var)).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double O(Function function, Function function2, Function function3, a0 a0Var) {
        return Double.valueOf(c0(function, function2, a0Var, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double P(Function function, Function function2, Function function3, a0 a0Var) {
        return Double.valueOf(b0(function, function2, a0Var, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double Q(double d10, Double d11, Double d12) {
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z R(z zVar, a0 a0Var) {
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double S(double d10, Double d11) {
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double T(double d10, Double d11) {
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double U(a0 a0Var, z zVar) {
        return Double.valueOf(zVar.G(a0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double V(a0 a0Var, z zVar) {
        return zVar.f53960g.apply(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double W(Function function, a0 a0Var, Double d10, Double d11) {
        return function != null && function.apply(a0Var) != null && ((z) function.apply(a0Var)).f53958e != null && ((z) function.apply(a0Var)).f53958e.apply(a0Var) != null ? Double.valueOf(u(d11.doubleValue(), 7.0d)) : Double.valueOf(u(d11.doubleValue(), Math.max(7.0d, d10.doubleValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double X(a0 a0Var, z zVar) {
        return zVar.f53959f.apply(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double Y(Function function, a0 a0Var, Function function2, Double d10, Double d11) {
        double dDoubleValue = ((Double) function.apply(a0Var)).doubleValue();
        if (d10.doubleValue() >= 7.0d) {
            dDoubleValue = u(d11.doubleValue(), 4.5d);
        } else if (d10.doubleValue() >= 3.0d) {
            dDoubleValue = u(d11.doubleValue(), 3.0d);
        } else {
            if ((function2 == null || function2.apply(a0Var) == null || ((z) function2.apply(a0Var)).f53958e == null || ((z) function2.apply(a0Var)).f53958e.apply(a0Var) == null) ? false : true) {
                dDoubleValue = u(d11.doubleValue(), d10.doubleValue());
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double Z(Double d10) {
        return d10;
    }

    public static boolean a0(double d10) {
        return Math.round(d10) <= 49;
    }

    public static double b0(Function<a0, Double> function, final Function<a0, z> function2, final a0 a0Var, Function<a0, x6> function3) {
        return t(a0Var, function, new Function() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.V(a0Var, (z) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return z.W(function2, a0Var, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, null);
    }

    public static double c0(final Function<a0, Double> function, final Function<a0, z> function2, final a0 a0Var, Function<a0, x6> function3) {
        return t(a0Var, function, new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.X(a0Var, (z) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.u
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return z.Y(function, a0Var, function2, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, new Function() { // from class: com.google.android.material.color.utilities.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.Z((Double) obj);
            }
        });
    }

    public static boolean d0(double d10) {
        return Math.round(d10) <= 60;
    }

    public static double t(a0 a0Var, Function<a0, Double> function, Function<z, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<a0, z> function3, Function<a0, x6> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        double dDoubleValue = function.apply(a0Var).doubleValue();
        z zVarApply = function3 == null ? null : function3.apply(a0Var);
        if (zVarApply == null) {
            return dDoubleValue;
        }
        double dE = d.e(dDoubleValue, zVarApply.f53956c.apply(a0Var).doubleValue());
        double dDoubleValue2 = function2.apply(zVarApply).doubleValue();
        double dDoubleValue3 = biFunction.apply(Double.valueOf(dE), Double.valueOf(dDoubleValue2)).doubleValue();
        double dE2 = d.e(dDoubleValue2, dDoubleValue3);
        double dDoubleValue4 = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(dE)) != null) {
            dDoubleValue4 = function5.apply(Double.valueOf(dE)).doubleValue();
        }
        double dA = b6.a(dDoubleValue4, (function6 == null || function6.apply(Double.valueOf(dE)) == null) ? 21.0d : function6.apply(Double.valueOf(dE)).doubleValue(), dE2);
        if (dA != dE2) {
            dDoubleValue3 = u(dDoubleValue2, dA);
        }
        Function<a0, z> function7 = zVarApply.f53958e;
        return w((function7 == null || function7.apply(a0Var) == null) ? v(dDoubleValue3) : dDoubleValue3, dDoubleValue, a0Var, function4, function2);
    }

    public static double u(double d10, double d11) {
        double d12 = d.d(d10, d11);
        double dB = d.b(d10, d11);
        double dE = d.e(d12, d10);
        double dE2 = d.e(dB, d10);
        if (d0(d10)) {
            return (dE >= d11 || dE >= dE2 || ((Math.abs(dE - dE2) > 0.1d ? 1 : (Math.abs(dE - dE2) == 0.1d ? 0 : -1)) < 0 && (dE > d11 ? 1 : (dE == d11 ? 0 : -1)) < 0 && (dE2 > d11 ? 1 : (dE2 == d11 ? 0 : -1)) < 0)) ? d12 : dB;
        }
        return (dE2 >= d11 || dE2 >= dE) ? dB : d12;
    }

    public static double v(double d10) {
        if (!d0(d10) || a0(d10)) {
            return d10;
        }
        return 49.0d;
    }

    static double w(double d10, double d11, a0 a0Var, Function<a0, x6> function, Function<z, Double> function2) {
        x6 x6VarApply = function == null ? null : function.apply(a0Var);
        if (x6VarApply == null) {
            return d10;
        }
        double d12 = x6VarApply.f53939a;
        double dDoubleValue = function2.apply(x6VarApply.f53940b).doubleValue();
        double dAbs = Math.abs(d10 - dDoubleValue);
        if (dAbs >= d12) {
            return d10;
        }
        int i10 = a.f53963a[x6VarApply.f53941c.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            return b6.a(0.0d, 100.0d, dDoubleValue + d12);
        }
        if (i10 == 2) {
            return b6.a(0.0d, 100.0d, dDoubleValue - d12);
        }
        if (i10 != 3) {
            return d10;
        }
        boolean z11 = d11 > x6VarApply.f53940b.f53956c.apply(a0Var).doubleValue();
        double dAbs2 = Math.abs(dAbs - d12);
        if (!z11 ? d10 >= dAbs2 : d10 + dAbs2 > 100.0d) {
            z10 = false;
        }
        return z10 ? d10 + dAbs2 : d10 - dAbs2;
    }

    public static z x(int i10) {
        final b0 b0VarB = b0.b(i10);
        final w6 w6VarC = w6.c(i10);
        return B(new Function() { // from class: com.google.android.material.color.utilities.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.H(w6VarC, (a0) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.I(b0VarB, (a0) obj);
            }
        });
    }

    public static z y(final int i10, Function<a0, Double> function) {
        return B(new Function() { // from class: com.google.android.material.color.utilities.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.J(i10, (a0) obj);
            }
        }, function);
    }

    public static z z(final int i10, Function<a0, Double> function, Function<a0, z> function2) {
        return C(new Function() { // from class: com.google.android.material.color.utilities.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.K(i10, (a0) obj);
            }
        }, function, function2);
    }

    public int E(a0 a0Var) {
        int iK = F(a0Var).k();
        Function<a0, Double> function = this.f53957d;
        if (function == null) {
            return iK;
        }
        return (b6.b(0, 255, (int) Math.round(function.apply(a0Var).doubleValue() * 255.0d)) << 24) | (iK & 16777215);
    }

    public b0 F(a0 a0Var) {
        b0 b0Var = this.f53962i.get(a0Var);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0VarA = b0.a(this.f53954a.apply(a0Var).doubleValue(), this.f53955b.apply(a0Var).doubleValue(), G(a0Var));
        if (this.f53962i.size() > 4) {
            this.f53962i.clear();
        }
        this.f53962i.put(a0Var, b0VarA);
        return b0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[PHI: r11
  0x00ca: PHI (r11v1 double) = (r11v0 double), (r11v4 double) binds: [B:18:0x0054, B:33:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    public double G(final a0 a0Var) {
        final double dE;
        final double dDoubleValue = this.f53956c.apply(a0Var).doubleValue();
        double d10 = a0Var.f53789e;
        boolean z10 = d10 < 0.0d;
        if (d10 != 0.0d) {
            double dDoubleValue2 = this.f53956c.apply(a0Var).doubleValue();
            dDoubleValue = dDoubleValue2 + (((z10 ? this.f53959f : this.f53960g).apply(a0Var).doubleValue() - dDoubleValue2) * Math.abs(a0Var.f53789e));
        }
        Function<a0, z> function = this.f53958e;
        final z zVarApply = function == null ? null : function.apply(a0Var);
        final double dMin = 1.0d;
        if (zVarApply == null) {
            dE = 21.0d;
        } else {
            Function<a0, z> function2 = zVarApply.f53958e;
            boolean z11 = (function2 == null || function2.apply(a0Var) == null) ? false : true;
            dE = d.e(this.f53956c.apply(a0Var).doubleValue(), zVarApply.f53956c.apply(a0Var).doubleValue());
            if (z10) {
                double dE2 = d.e(this.f53959f.apply(a0Var).doubleValue(), zVarApply.f53959f.apply(a0Var).doubleValue());
                if (z11) {
                    dMin = dE2;
                }
            } else {
                double dE3 = d.e(this.f53960g.apply(a0Var).doubleValue(), zVarApply.f53960g.apply(a0Var).doubleValue());
                dMin = z11 ? Math.min(dE3, dE) : 1.0d;
                if (z11) {
                    dE = Math.max(dE3, dE);
                } else {
                    dE = 21.0d;
                }
            }
        }
        return t(a0Var, this.f53956c, new Function() { // from class: com.google.android.material.color.utilities.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.U(a0Var, (z) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return z.Q(dDoubleValue, (Double) obj, (Double) obj2);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.R(this.f53865a, (a0) obj);
            }
        }, this.f53961h, new Function() { // from class: com.google.android.material.color.utilities.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.S(dMin, (Double) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.T(dE, (Double) obj);
            }
        });
    }
}
