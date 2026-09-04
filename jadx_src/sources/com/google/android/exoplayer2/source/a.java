package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<f0.b> f47450b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<f0.b> f47451c = new HashSet<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0.a f47452d = new n0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.s.a f47453e = new com.google.android.exoplayer2.drm.s.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Looper f47454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f47455g;

    protected void B() {
    }

    protected final boolean C() {
        return !this.f47451c.isEmpty();
    }

    protected abstract void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var);

    protected final void E(z3 z3Var) {
        this.f47455g = z3Var;
        Iterator<f0.b> it = this.f47450b.iterator();
        while (it.hasNext()) {
            it.next().e(this, z3Var);
        }
    }

    protected abstract void F();

    @Override // com.google.android.exoplayer2.source.f0
    public final void a(f0.b bVar) {
        this.f47450b.remove(bVar);
        if (!this.f47450b.isEmpty()) {
            m(bVar);
            return;
        }
        this.f47454f = null;
        this.f47455g = null;
        this.f47451c.clear();
        F();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void b(n0 n0Var) {
        this.f47452d.C(n0Var);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void d(f0.b bVar, @androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f47454f;
        com.google.android.exoplayer2.util.a.a(looper == null || looper == looperMyLooper);
        z3 z3Var = this.f47455g;
        this.f47450b.add(bVar);
        if (this.f47454f == null) {
            this.f47454f = looperMyLooper;
            this.f47451c.add(bVar);
            D(u0Var);
        } else if (z3Var != null) {
            l(bVar);
            bVar.e(this, z3Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public /* synthetic */ z3 g() {
        return e0.a(this);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void j(Handler handler, n0 n0Var) {
        com.google.android.exoplayer2.util.a.g(handler);
        com.google.android.exoplayer2.util.a.g(n0Var);
        this.f47452d.g(handler, n0Var);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void l(f0.b bVar) {
        com.google.android.exoplayer2.util.a.g(this.f47454f);
        boolean zIsEmpty = this.f47451c.isEmpty();
        this.f47451c.add(bVar);
        if (zIsEmpty) {
            B();
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void m(f0.b bVar) {
        boolean z10 = !this.f47451c.isEmpty();
        this.f47451c.remove(bVar);
        if (z10 && this.f47451c.isEmpty()) {
            z();
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void o(Handler handler, com.google.android.exoplayer2.drm.s sVar) {
        com.google.android.exoplayer2.util.a.g(handler);
        com.google.android.exoplayer2.util.a.g(sVar);
        this.f47453e.g(handler, sVar);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public final void r(com.google.android.exoplayer2.drm.s sVar) {
        this.f47453e.t(sVar);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public /* synthetic */ boolean t() {
        return e0.b(this);
    }

    protected final com.google.android.exoplayer2.drm.s.a u(int i10, @androidx.annotation.p0 f0.a aVar) {
        return this.f47453e.u(i10, aVar);
    }

    protected final com.google.android.exoplayer2.drm.s.a v(@androidx.annotation.p0 f0.a aVar) {
        return this.f47453e.u(0, aVar);
    }

    protected final n0.a w(int i10, @androidx.annotation.p0 f0.a aVar, long j10) {
        return this.f47452d.F(i10, aVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n0.a x(@androidx.annotation.p0 f0.a aVar) {
        return this.f47452d.F(0, aVar, 0L);
    }

    protected final n0.a y(f0.a aVar, long j10) {
        com.google.android.exoplayer2.util.a.g(aVar);
        return this.f47452d.F(0, aVar, j10);
    }

    protected void z() {
    }
}
