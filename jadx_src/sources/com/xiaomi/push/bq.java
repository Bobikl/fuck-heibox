package com.xiaomi.push;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class bq<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f106879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f106882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f106883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f106884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f106887i;

    public bq(long j10, long j11) {
        this.f106887i = j10 * 1000000;
        this.f106879a = j11;
    }

    public long a() {
        return this.f106881c;
    }

    public T a(Callable<T> callable) {
        long j10 = this.f106880b;
        long j11 = this.f106887i;
        if (j10 > j11) {
            long j12 = (j10 / j11) * this.f106879a;
            this.f106880b = 0L;
            if (j12 > 0) {
                try {
                    Thread.sleep(j12);
                } catch (Exception unused) {
                }
            }
        }
        long jNanoTime = System.nanoTime();
        if (this.f106885g <= 0) {
            this.f106885g = jNanoTime;
        }
        T tCall = null;
        try {
            tCall = callable.call();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        this.f106886h = System.nanoTime();
        this.f106883e++;
        if (this.f106881c < jNanoTime2) {
            this.f106881c = jNanoTime2;
        }
        if (jNanoTime2 > 0) {
            this.f106884f += jNanoTime2;
            long j13 = this.f106882d;
            if (j13 == 0 || j13 > jNanoTime2) {
                this.f106882d = jNanoTime2;
            }
        }
        this.f106880b += Math.max(jNanoTime2, 0L);
        return tCall;
    }

    public long b() {
        return this.f106882d;
    }

    public long c() {
        long j10 = this.f106884f;
        if (j10 > 0) {
            long j11 = this.f106883e;
            if (j11 > 0) {
                return j10 / j11;
            }
        }
        return 0L;
    }

    public long d() {
        long j10 = this.f106886h;
        long j11 = this.f106885g;
        if (j10 > j11) {
            return j10 - j11;
        }
        return 0L;
    }
}
