package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f51493e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f51494f = 9223372036854775806L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f51495g = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f51496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f51497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f51498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f51499d = new ThreadLocal<>();

    public n0(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long j(long j10) {
        return i(j10) % f51495g;
    }

    public synchronized long a(long j10) {
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        if (this.f51497b == com.google.android.exoplayer2.j.f46377b) {
            long jLongValue = this.f51496a;
            if (jLongValue == f51494f) {
                jLongValue = ((Long) a.g(this.f51499d.get())).longValue();
            }
            this.f51497b = jLongValue - j10;
            notifyAll();
        }
        this.f51498c = j10;
        return j10 + this.f51497b;
    }

    public synchronized long b(long j10) {
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        long j11 = this.f51498c;
        if (j11 != com.google.android.exoplayer2.j.f46377b) {
            long jI = i(j11);
            long j12 = (4294967296L + jI) / f51495g;
            long j13 = ((j12 - 1) * f51495g) + j10;
            j10 += j12 * f51495g;
            if (Math.abs(j13 - jI) < Math.abs(j10 - jI)) {
                j10 = j13;
            }
        }
        return a(f(j10));
    }

    public synchronized long c() {
        long j10;
        j10 = this.f51496a;
        if (j10 == Long.MAX_VALUE || j10 == f51494f) {
            j10 = com.google.android.exoplayer2.j.f46377b;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        j10 = this.f51498c;
        return j10 != com.google.android.exoplayer2.j.f46377b ? j10 + this.f51497b : c();
    }

    public synchronized long e() {
        return this.f51497b;
    }

    public synchronized void g(long j10) {
        this.f51496a = j10;
        this.f51497b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f51498c = com.google.android.exoplayer2.j.f46377b;
    }

    public synchronized void h(boolean z10, long j10) throws InterruptedException {
        a.i(this.f51496a == f51494f);
        if (this.f51497b != com.google.android.exoplayer2.j.f46377b) {
            return;
        }
        if (z10) {
            this.f51499d.set(Long.valueOf(j10));
        } else {
            while (this.f51497b == com.google.android.exoplayer2.j.f46377b) {
                wait();
            }
        }
    }
}
