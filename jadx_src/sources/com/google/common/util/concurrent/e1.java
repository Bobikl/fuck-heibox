package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: RateLimiter.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.a
@o9.c
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private volatile Object f59398b;

    /* JADX INFO: compiled from: RateLimiter.java */
    public static abstract class a {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.e1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RateLimiter.java */
        public class C0489a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final com.google.common.base.a0 f59399a = com.google.common.base.a0.c();

            C0489a() {
            }

            @Override // com.google.common.util.concurrent.e1.a
            protected long b() {
                return this.f59399a.g(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.e1.a
            protected void c(long j10) {
                if (j10 > 0) {
                    v1.k(j10, TimeUnit.MICROSECONDS);
                }
            }
        }

        protected a() {
        }

        public static a a() {
            return new C0489a();
        }

        protected abstract long b();

        protected abstract void c(long j10);
    }

    e1(a aVar) {
        this.f59397a = (a) com.google.common.base.w.E(aVar);
    }

    private boolean c(long j10, long j11) {
        return m(j10) - j11 <= j10;
    }

    private static void d(int i10) {
        com.google.common.base.w.k(i10 > 0, "Requested permits (%s) must be positive", i10);
    }

    public static e1 e(double d10) {
        return h(d10, a.a());
    }

    public static e1 f(double d10, long j10, TimeUnit timeUnit) {
        com.google.common.base.w.p(j10 >= 0, "warmupPeriod must not be negative: %s", j10);
        return g(d10, j10, timeUnit, 3.0d, a.a());
    }

    @o9.d
    static e1 g(double d10, long j10, TimeUnit timeUnit, double d11, a aVar) {
        k1.c cVar = new k1.c(aVar, j10, timeUnit, d11);
        cVar.q(d10);
        return cVar;
    }

    @o9.d
    static e1 h(double d10, a aVar) {
        k1.b bVar = new k1.b(aVar, 1.0d);
        bVar.q(d10);
        return bVar;
    }

    private Object l() {
        Object obj = this.f59398b;
        if (obj == null) {
            synchronized (this) {
                obj = this.f59398b;
                if (obj == null) {
                    obj = new Object();
                    this.f59398b = obj;
                }
            }
        }
        return obj;
    }

    @s9.a
    public double a() {
        return b(1);
    }

    @s9.a
    public double b(int i10) {
        long jN = n(i10);
        this.f59397a.c(jN);
        return (jN * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    abstract double i();

    abstract void j(double d10, long j10);

    public final double k() {
        double dI;
        synchronized (l()) {
            dI = i();
        }
        return dI;
    }

    abstract long m(long j10);

    final long n(int i10) {
        long jO;
        d(i10);
        synchronized (l()) {
            jO = o(i10, this.f59397a.b());
        }
        return jO;
    }

    final long o(int i10, long j10) {
        return Math.max(p(i10, j10) - j10, 0L);
    }

    abstract long p(int i10, long j10);

    public final void q(double d10) {
        com.google.common.base.w.e(d10 > 0.0d && !Double.isNaN(d10), "rate must be positive");
        synchronized (l()) {
            j(d10, this.f59397a.b());
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int i10) {
        return t(i10, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int i10, long j10, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j10), 0L);
        d(i10);
        synchronized (l()) {
            long jB = this.f59397a.b();
            if (!c(jB, jMax)) {
                return false;
            }
            this.f59397a.c(o(i10, jB));
            return true;
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(k()));
    }

    public boolean u(long j10, TimeUnit timeUnit) {
        return t(1, j10, timeUnit);
    }
}
