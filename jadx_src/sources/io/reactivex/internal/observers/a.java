package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: BasicFuseableObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T, R> implements g0<T>, lh.j<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final g0<? super R> f119626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected io.reactivex.disposables.b f119627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected lh.j<T> f119628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f119629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f119630f;

    public a(g0<? super R> g0Var) {
        this.f119626b = g0Var;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.a.b(th2);
        this.f119627c.dispose();
        onError(th2);
    }

    @Override // lh.o
    public void clear() {
        this.f119628d.clear();
    }

    protected final int d(int i10) {
        lh.j<T> jVar = this.f119628d;
        if (jVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = jVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f119630f = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f119627c.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f119627c.isDisposed();
    }

    @Override // lh.o
    public boolean isEmpty() {
        return this.f119628d.isEmpty();
    }

    @Override // lh.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f119629e) {
            return;
        }
        this.f119629e = true;
        this.f119626b.onComplete();
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (this.f119629e) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f119629e = true;
            this.f119626b.onError(th2);
        }
    }

    @Override // io.reactivex.g0
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f119627c, bVar)) {
            this.f119627c = bVar;
            if (bVar instanceof lh.j) {
                this.f119628d = (lh.j) bVar;
            }
            if (b()) {
                this.f119626b.onSubscribe(this);
                a();
            }
        }
    }
}
