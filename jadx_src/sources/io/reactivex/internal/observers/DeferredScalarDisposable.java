package io.reactivex.internal.observers;

import io.reactivex.g0;

/* JADX INFO: loaded from: classes9.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f119605d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f119606e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f119607f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f119608g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f119609h = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final g0<? super T> f119610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected T f119611c;

    public DeferredScalarDisposable(g0<? super T> g0Var) {
        this.f119610b = g0Var;
    }

    public final void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f119610b.onComplete();
    }

    public final void b(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        g0<? super T> g0Var = this.f119610b;
        if (i10 == 8) {
            this.f119611c = t10;
            lazySet(16);
            g0Var.onNext(null);
        } else {
            lazySet(2);
            g0Var.onNext(t10);
        }
        if (get() != 4) {
            g0Var.onComplete();
        }
    }

    public final void c(Throwable th2) {
        if ((get() & 54) != 0) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            lazySet(2);
            this.f119610b.onError(th2);
        }
    }

    @Override // lh.o
    public final void clear() {
        lazySet(32);
        this.f119611c = null;
    }

    public final boolean d() {
        return getAndSet(4) != 4;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        set(4);
        this.f119611c = null;
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // lh.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // lh.o
    @jh.f
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f119611c;
        this.f119611c = null;
        lazySet(32);
        return t10;
    }

    @Override // lh.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
