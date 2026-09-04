package com.google.common.math;

import com.google.common.base.w;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: compiled from: StatsAccumulator.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.a
@o9.c
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f58794a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f58795b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f58796c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f58797d = Double.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f58798e = Double.NaN;

    static double i(double d10, double d11) {
        if (Doubles.n(d10)) {
            return d11;
        }
        if (Doubles.n(d11) || d10 == d11) {
            return d10;
        }
        return Double.NaN;
    }

    private void m(long j10, double d10, double d11, double d12, double d13) {
        long j11 = this.f58794a;
        if (j11 == 0) {
            this.f58794a = j10;
            this.f58795b = d10;
            this.f58796c = d11;
            this.f58797d = d12;
            this.f58798e = d13;
            return;
        }
        this.f58794a = j11 + j10;
        if (Doubles.n(this.f58795b) && Doubles.n(d10)) {
            double d14 = this.f58795b;
            double d15 = d10 - d14;
            double d16 = j10;
            double d17 = d14 + ((d15 * d16) / this.f58794a);
            this.f58795b = d17;
            this.f58796c += d11 + (d15 * (d10 - d17) * d16);
        } else {
            this.f58795b = i(this.f58795b, d10);
            this.f58796c = Double.NaN;
        }
        this.f58797d = Math.min(this.f58797d, d12);
        this.f58798e = Math.max(this.f58798e, d13);
    }

    public void a(double d10) {
        long j10 = this.f58794a;
        if (j10 == 0) {
            this.f58794a = 1L;
            this.f58795b = d10;
            this.f58797d = d10;
            this.f58798e = d10;
            if (Doubles.n(d10)) {
                return;
            }
            this.f58796c = Double.NaN;
            return;
        }
        this.f58794a = j10 + 1;
        if (Doubles.n(d10) && Doubles.n(this.f58795b)) {
            double d11 = this.f58795b;
            double d12 = d10 - d11;
            double d13 = d11 + (d12 / this.f58794a);
            this.f58795b = d13;
            this.f58796c += d12 * (d10 - d13);
        } else {
            this.f58795b = i(this.f58795b, d10);
            this.f58796c = Double.NaN;
        }
        this.f58797d = Math.min(this.f58797d, d10);
        this.f58798e = Math.max(this.f58798e, d10);
    }

    public void b(Stats stats) {
        if (stats.a() == 0) {
            return;
        }
        m(stats.a(), stats.d(), stats.v(), stats.j(), stats.c());
    }

    public void c(l lVar) {
        if (lVar.j() == 0) {
            return;
        }
        m(lVar.j(), lVar.l(), lVar.u(), lVar.n(), lVar.k());
    }

    public void d(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void e(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void f(double... dArr) {
        for (double d10 : dArr) {
            a(d10);
        }
    }

    public void g(int... iArr) {
        for (int i10 : iArr) {
            a(i10);
        }
    }

    public void h(long... jArr) {
        for (long j10 : jArr) {
            a(j10);
        }
    }

    public long j() {
        return this.f58794a;
    }

    public double k() {
        w.g0(this.f58794a != 0);
        return this.f58798e;
    }

    public double l() {
        w.g0(this.f58794a != 0);
        return this.f58795b;
    }

    public double n() {
        w.g0(this.f58794a != 0);
        return this.f58797d;
    }

    public final double o() {
        return Math.sqrt(p());
    }

    public final double p() {
        w.g0(this.f58794a != 0);
        if (Double.isNaN(this.f58796c)) {
            return Double.NaN;
        }
        if (this.f58794a == 1) {
            return 0.0d;
        }
        return d.b(this.f58796c) / this.f58794a;
    }

    public final double q() {
        return Math.sqrt(r());
    }

    public final double r() {
        w.g0(this.f58794a > 1);
        if (Double.isNaN(this.f58796c)) {
            return Double.NaN;
        }
        return d.b(this.f58796c) / (this.f58794a - 1);
    }

    public Stats s() {
        return new Stats(this.f58794a, this.f58795b, this.f58796c, this.f58797d, this.f58798e);
    }

    public final double t() {
        return this.f58795b * this.f58794a;
    }

    double u() {
        return this.f58796c;
    }
}
