package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51462e = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f51463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f51464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51466d;

    public m0() {
        this(10);
    }

    public m0(int i10) {
        this.f51463a = new long[i10];
        this.f51464b = (V[]) f(i10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f51465c;
        int i11 = this.f51466d;
        V[] vArr = this.f51464b;
        int length = (i10 + i11) % vArr.length;
        this.f51463a[length] = j10;
        vArr[length] = v10;
        this.f51466d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f51466d;
        if (i10 > 0) {
            if (j10 <= this.f51463a[((this.f51465c + i10) - 1) % this.f51464b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f51464b.length;
        if (this.f51466d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f51465c;
        int i12 = length - i11;
        System.arraycopy(this.f51463a, i11, jArr, 0, i12);
        System.arraycopy(this.f51464b, this.f51465c, vArr, 0, i12);
        int i13 = this.f51465c;
        if (i13 > 0) {
            System.arraycopy(this.f51463a, 0, jArr, i12, i13);
            System.arraycopy(this.f51464b, 0, vArr, i12, this.f51465c);
        }
        this.f51463a = jArr;
        this.f51464b = vArr;
        this.f51465c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    @androidx.annotation.p0
    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f51466d > 0) {
            long j12 = j10 - this.f51463a[this.f51465c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    @androidx.annotation.p0
    private V k() {
        a.i(this.f51466d > 0);
        V[] vArr = this.f51464b;
        int i10 = this.f51465c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f51465c = (i10 + 1) % vArr.length;
        this.f51466d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f51465c = 0;
        this.f51466d = 0;
        Arrays.fill(this.f51464b, (Object) null);
    }

    @androidx.annotation.p0
    public synchronized V g(long j10) {
        return h(j10, false);
    }

    @androidx.annotation.p0
    public synchronized V i() {
        return this.f51466d == 0 ? null : k();
    }

    @androidx.annotation.p0
    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f51466d;
    }
}
