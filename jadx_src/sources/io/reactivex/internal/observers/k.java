package io.reactivex.internal.observers;

import io.reactivex.g0;

/* JADX INFO: compiled from: QueueDrainObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k<T, U, V> extends m implements g0<T>, io.reactivex.internal.util.j<U, V> {
    protected final g0<? super V> G;
    protected final lh.n<U> H;
    protected volatile boolean I;
    protected volatile boolean J;
    protected Throwable K;

    public k(g0<? super V> g0Var, lh.n<U> nVar) {
        this.G = g0Var;
        this.H = nVar;
    }

    @Override // io.reactivex.internal.util.j
    public final int a(int i10) {
        return this.f119673q.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.j
    public final boolean b() {
        return this.f119673q.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.j
    public final boolean c() {
        return this.J;
    }

    @Override // io.reactivex.internal.util.j
    public final boolean d() {
        return this.I;
    }

    @Override // io.reactivex.internal.util.j
    public void f(g0<? super V> g0Var, U u10) {
    }

    public final boolean g() {
        return this.f119673q.get() == 0 && this.f119673q.compareAndSet(0, 1);
    }

    @Override // io.reactivex.internal.util.j
    public final Throwable h() {
        return this.K;
    }

    protected final void j(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        g0<? super V> g0Var = this.G;
        lh.n<U> nVar = this.H;
        if (this.f119673q.get() == 0 && this.f119673q.compareAndSet(0, 1)) {
            f(g0Var, u10);
            if (a(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        }
        io.reactivex.internal.util.n.d(nVar, g0Var, z10, bVar, this);
    }

    protected final void k(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        g0<? super V> g0Var = this.G;
        lh.n<U> nVar = this.H;
        if (this.f119673q.get() != 0 || !this.f119673q.compareAndSet(0, 1)) {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        } else if (nVar.isEmpty()) {
            f(g0Var, u10);
            if (a(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
        }
        io.reactivex.internal.util.n.d(nVar, g0Var, z10, bVar, this);
    }
}
