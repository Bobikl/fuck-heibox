package com.google.common.math;

import com.google.common.base.w;
import com.google.common.primitives.Doubles;

/* JADX INFO: compiled from: PairedStatsAccumulator.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.a
@o9.c
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f58786a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f58787b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f58788c = 0.0d;

    private static double d(double d10) {
        return Doubles.f(d10, -1.0d, 1.0d);
    }

    private double e(double d10) {
        if (d10 > 0.0d) {
            return d10;
        }
        return Double.MIN_VALUE;
    }

    public void a(double d10, double d11) {
        this.f58786a.a(d10);
        if (!Doubles.n(d10) || !Doubles.n(d11)) {
            this.f58788c = Double.NaN;
        } else if (this.f58786a.j() > 1) {
            this.f58788c += (d10 - this.f58786a.l()) * (d11 - this.f58787b.l());
        }
        this.f58787b.a(d11);
    }

    public void b(PairedStats pairedStats) {
        if (pairedStats.a() == 0) {
            return;
        }
        this.f58786a.b(pairedStats.k());
        if (this.f58787b.j() == 0) {
            this.f58788c = pairedStats.i();
        } else {
            this.f58788c += pairedStats.i() + ((pairedStats.k().d() - this.f58786a.l()) * (pairedStats.l().d() - this.f58787b.l()) * pairedStats.a());
        }
        this.f58787b.b(pairedStats.l());
    }

    public long c() {
        return this.f58786a.j();
    }

    public final g f() {
        w.g0(c() > 1);
        if (Double.isNaN(this.f58788c)) {
            return g.a();
        }
        double dU = this.f58786a.u();
        if (dU > 0.0d) {
            return this.f58787b.u() > 0.0d ? g.f(this.f58786a.l(), this.f58787b.l()).b(this.f58788c / dU) : g.b(this.f58787b.l());
        }
        w.g0(this.f58787b.u() > 0.0d);
        return g.i(this.f58786a.l());
    }

    public final double g() {
        w.g0(c() > 1);
        if (Double.isNaN(this.f58788c)) {
            return Double.NaN;
        }
        double dU = this.f58786a.u();
        double dU2 = this.f58787b.u();
        w.g0(dU > 0.0d);
        w.g0(dU2 > 0.0d);
        return d(this.f58788c / Math.sqrt(e(dU * dU2)));
    }

    public double h() {
        w.g0(c() != 0);
        return this.f58788c / c();
    }

    public final double i() {
        w.g0(c() > 1);
        return this.f58788c / (c() - 1);
    }

    public PairedStats j() {
        return new PairedStats(this.f58786a.s(), this.f58787b.s(), this.f58788c);
    }

    public Stats k() {
        return this.f58786a.s();
    }

    public Stats l() {
        return this.f58787b.s();
    }
}
