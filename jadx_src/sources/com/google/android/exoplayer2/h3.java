package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f46245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f46247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z3 f46248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f46250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f46251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f46253i = j.f46377b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f46254j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f46257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46258n;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
        void e(h3 h3Var);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void h(int i10, @androidx.annotation.p0 Object obj) throws ExoPlaybackException;
    }

    public h3(a aVar, b bVar, z3 z3Var, int i10, com.google.android.exoplayer2.util.e eVar, Looper looper) {
        this.f46246b = aVar;
        this.f46245a = bVar;
        this.f46248d = z3Var;
        this.f46251g = looper;
        this.f46247c = eVar;
        this.f46252h = i10;
    }

    public synchronized boolean a() throws InterruptedException {
        com.google.android.exoplayer2.util.a.i(this.f46255k);
        com.google.android.exoplayer2.util.a.i(this.f46251g.getThread() != Thread.currentThread());
        while (!this.f46257m) {
            wait();
        }
        return this.f46256l;
    }

    public synchronized boolean b(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        com.google.android.exoplayer2.util.a.i(this.f46255k);
        com.google.android.exoplayer2.util.a.i(this.f46251g.getThread() != Thread.currentThread());
        long jB = this.f46247c.b() + j10;
        while (true) {
            z10 = this.f46257m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f46247c.d();
            wait(j10);
            j10 = jB - this.f46247c.b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f46256l;
    }

    public synchronized h3 c() {
        com.google.android.exoplayer2.util.a.i(this.f46255k);
        this.f46258n = true;
        m(false);
        return this;
    }

    public boolean d() {
        return this.f46254j;
    }

    public Looper e() {
        return this.f46251g;
    }

    public int f() {
        return this.f46252h;
    }

    @androidx.annotation.p0
    public Object g() {
        return this.f46250f;
    }

    public long h() {
        return this.f46253i;
    }

    public b i() {
        return this.f46245a;
    }

    public z3 j() {
        return this.f46248d;
    }

    public int k() {
        return this.f46249e;
    }

    public synchronized boolean l() {
        return this.f46258n;
    }

    public synchronized void m(boolean z10) {
        this.f46256l = z10 | this.f46256l;
        this.f46257m = true;
        notifyAll();
    }

    public h3 n() {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        if (this.f46253i == j.f46377b) {
            com.google.android.exoplayer2.util.a.a(this.f46254j);
        }
        this.f46255k = true;
        this.f46246b.e(this);
        return this;
    }

    public h3 o(boolean z10) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        this.f46254j = z10;
        return this;
    }

    @Deprecated
    public h3 p(Handler handler) {
        return q(handler.getLooper());
    }

    public h3 q(Looper looper) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        this.f46251g = looper;
        return this;
    }

    public h3 r(@androidx.annotation.p0 Object obj) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        this.f46250f = obj;
        return this;
    }

    public h3 s(int i10, long j10) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        com.google.android.exoplayer2.util.a.a(j10 != j.f46377b);
        if (i10 < 0 || (!this.f46248d.x() && i10 >= this.f46248d.w())) {
            throw new IllegalSeekPositionException(this.f46248d, i10, j10);
        }
        this.f46252h = i10;
        this.f46253i = j10;
        return this;
    }

    public h3 t(long j10) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        this.f46253i = j10;
        return this;
    }

    public h3 u(int i10) {
        com.google.android.exoplayer2.util.a.i(!this.f46255k);
        this.f46249e = i10;
        return this;
    }
}
