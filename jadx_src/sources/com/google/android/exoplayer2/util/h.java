package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f51406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51407b;

    public h() {
        this(e.f51387a);
    }

    public h(e eVar) {
        this.f51406a = eVar;
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f51407b) {
            wait();
        }
    }

    public synchronized boolean b(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.f51407b;
            }
            long jB = this.f51406a.b();
            long j11 = j10 + jB;
            if (j11 < jB) {
                a();
            } else {
                while (!this.f51407b && jB < j11) {
                    wait(j11 - jB);
                    jB = this.f51406a.b();
                }
            }
            return this.f51407b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        boolean z10 = false;
        while (!this.f51407b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f51407b;
        this.f51407b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f51407b;
    }

    public synchronized boolean f() {
        if (this.f51407b) {
            return false;
        }
        this.f51407b = true;
        notifyAll();
        return true;
    }
}
