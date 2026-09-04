package com.igexin.a.a.d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends a {
    protected static f D;
    public Exception A;
    public Object B;
    public com.igexin.a.a.d.a.f C;
    protected final ReentrantLock E;
    protected final Condition F;
    Thread G;
    protected volatile boolean H;
    int I;
    protected com.igexin.a.a.d.a.c J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f63231a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected volatile boolean f63232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected volatile boolean f63233k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected volatile boolean f63234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected volatile boolean f63235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected volatile boolean f63236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected volatile boolean f63237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected volatile boolean f63238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected volatile boolean f63239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected volatile boolean f63240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected volatile long f63241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    volatile int f63242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f63243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f63244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f63245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f63246y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f63247z;

    public e(int i10) {
        this(i10, null);
    }

    public e(int i10, com.igexin.a.a.d.a.c cVar) {
        this.f63246y = i10;
        this.J = cVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.E = reentrantLock;
        this.F = reentrantLock.newCondition();
    }

    public final int a(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            int iA = D.f63254k.a(this, j10, timeUnit);
            if (iA == -2) {
                return -2;
            }
            if (iA == -1) {
                this.f63241t = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
                return -1;
            }
            if (iA == 1) {
                return 1;
            }
        }
        return 0;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(o(), TimeUnit.MILLISECONDS);
    }

    public final void a(int i10) {
        this.f63231a = (byte) (((i10 & 15) << 4) | ((byte) (this.f63231a & 15)));
    }

    public final void a(int i10, com.igexin.a.a.d.a.f fVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException("second must > 0");
        }
        this.f63245x = i10;
        this.C = fVar;
    }

    public final void a(com.igexin.a.a.d.a.c cVar) {
        this.J = cVar;
    }

    public void b() throws Exception {
        this.G = Thread.currentThread();
        this.f63236o = true;
    }

    public void c() {
        if (this.f63232j || this.f63233k) {
            f();
        }
    }

    public final void c(long j10) {
        this.f63243v = j10;
    }

    public void d() {
        this.f63239r = true;
    }

    protected abstract void e();

    protected void e_() {
        if (!this.f63235n && !this.f63237p && !this.f63238q) {
            this.f63232j = true;
        } else if ((!this.f63237p || this.f63232j) && (!this.f63235n || this.f63234m || this.f63232j)) {
            return;
        }
        this.f63236o = false;
    }

    public void f() {
        this.B = null;
        this.A = null;
        this.G = null;
    }

    protected void g() throws Exception {
    }

    final void n() {
        this.I = (this.I + 1) & 1090519038;
    }

    long o() {
        return this.f63241t - System.currentTimeMillis();
    }

    public final void p() {
        this.f63232j = true;
    }

    public final boolean q() {
        return this.f63234m;
    }

    public final boolean r() {
        return this.f63233k;
    }

    public final Thread s() {
        return this.G;
    }

    protected void t() {
        com.igexin.a.a.d.a.c cVar = this.J;
        if (cVar != null) {
            cVar.a(com.igexin.a.a.d.a.d.error);
        }
    }
}
