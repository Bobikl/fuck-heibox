package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Hct.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f53837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f53838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f53839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53840d;

    private b0(int i10) {
        i(i10);
    }

    public static b0 a(double d10, double d11, double d12) {
        return new b0(c0.r(d10, d11, d12));
    }

    public static b0 b(int i10) {
        return new b0(i10);
    }

    private void i(int i10) {
        this.f53840d = i10;
        b bVarB = b.b(i10);
        this.f53837a = bVarB.l();
        this.f53838b = bVarB.k();
        this.f53839c = c.o(i10);
    }

    public double c() {
        return this.f53838b;
    }

    public double d() {
        return this.f53837a;
    }

    public double e() {
        return this.f53839c;
    }

    public b0 f(y6 y6Var) {
        double[] dArrT = b.b(k()).t(y6Var, null);
        b bVarH = b.h(dArrT[0], dArrT[1], dArrT[2], y6.f53943k);
        return a(bVarH.l(), bVarH.k(), c.p(dArrT[1]));
    }

    public void g(double d10) {
        i(c0.r(this.f53837a, d10, this.f53839c));
    }

    public void h(double d10) {
        i(c0.r(d10, this.f53838b, this.f53839c));
    }

    public void j(double d10) {
        i(c0.r(this.f53837a, this.f53838b, d10));
    }

    public int k() {
        return this.f53840d;
    }
}
