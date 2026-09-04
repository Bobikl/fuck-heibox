package com.google.common.util.concurrent;

import com.google.common.math.LongMath;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SmoothRateLimiter.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public abstract class k1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f59499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f59500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f59501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59502f;

    /* JADX INFO: compiled from: SmoothRateLimiter.java */
    public static final class b extends k1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final double f59503g;

        b(e1.a aVar, double d10) {
            super(aVar);
            this.f59503g = d10;
        }

        @Override // com.google.common.util.concurrent.k1
        double v() {
            return this.f59501e;
        }

        @Override // com.google.common.util.concurrent.k1
        void w(double d10, double d11) {
            double d12 = this.f59500d;
            double d13 = this.f59503g * d10;
            this.f59500d = d13;
            if (d12 == Double.POSITIVE_INFINITY) {
                this.f59499c = d13;
            } else {
                this.f59499c = d12 != 0.0d ? (this.f59499c * d13) / d12 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.k1
        long y(double d10, double d11) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: SmoothRateLimiter.java */
    public static final class c extends k1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f59504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f59505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private double f59506i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private double f59507j;

        c(e1.a aVar, long j10, TimeUnit timeUnit, double d10) {
            super(aVar);
            this.f59504g = timeUnit.toMicros(j10);
            this.f59507j = d10;
        }

        private double z(double d10) {
            return this.f59501e + (d10 * this.f59505h);
        }

        @Override // com.google.common.util.concurrent.k1
        double v() {
            return this.f59504g / this.f59500d;
        }

        @Override // com.google.common.util.concurrent.k1
        void w(double d10, double d11) {
            double d12 = this.f59500d;
            double d13 = this.f59507j * d11;
            long j10 = this.f59504g;
            double d14 = (j10 * 0.5d) / d11;
            this.f59506i = d14;
            double d15 = ((j10 * 2.0d) / (d11 + d13)) + d14;
            this.f59500d = d15;
            this.f59505h = (d13 - d11) / (d15 - d14);
            if (d12 == Double.POSITIVE_INFINITY) {
                this.f59499c = 0.0d;
                return;
            }
            if (d12 != 0.0d) {
                d15 = (this.f59499c * d15) / d12;
            }
            this.f59499c = d15;
        }

        @Override // com.google.common.util.concurrent.k1
        long y(double d10, double d11) {
            long jZ;
            double d12 = d10 - this.f59506i;
            if (d12 > 0.0d) {
                double dMin = Math.min(d12, d11);
                jZ = (long) (((z(d12) + z(d12 - dMin)) * dMin) / 2.0d);
                d11 -= dMin;
            } else {
                jZ = 0;
            }
            return jZ + ((long) (this.f59501e * d11));
        }
    }

    private k1(e1.a aVar) {
        super(aVar);
        this.f59502f = 0L;
    }

    @Override // com.google.common.util.concurrent.e1
    final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f59501e;
    }

    @Override // com.google.common.util.concurrent.e1
    final void j(double d10, long j10) {
        x(j10);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d10;
        this.f59501e = micros;
        w(d10, micros);
    }

    @Override // com.google.common.util.concurrent.e1
    final long m(long j10) {
        return this.f59502f;
    }

    @Override // com.google.common.util.concurrent.e1
    final long p(int i10, long j10) {
        x(j10);
        long j11 = this.f59502f;
        double d10 = i10;
        double dMin = Math.min(d10, this.f59499c);
        this.f59502f = LongMath.x(this.f59502f, y(this.f59499c, dMin) + ((long) ((d10 - dMin) * this.f59501e)));
        this.f59499c -= dMin;
        return j11;
    }

    abstract double v();

    abstract void w(double d10, double d11);

    void x(long j10) {
        long j11 = this.f59502f;
        if (j10 > j11) {
            this.f59499c = Math.min(this.f59500d, this.f59499c + ((j10 - j11) / v()));
            this.f59502f = j10;
        }
    }

    abstract long y(double d10, double d11);
}
