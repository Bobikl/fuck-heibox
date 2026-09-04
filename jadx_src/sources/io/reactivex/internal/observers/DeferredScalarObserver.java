package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements g0<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected io.reactivex.disposables.b f119612i;

    public DeferredScalarObserver(g0<? super R> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
    public void dispose() {
        super.dispose();
        this.f119612i.dispose();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        T t10 = this.f119611c;
        if (t10 == null) {
            a();
        } else {
            this.f119611c = null;
            b(t10);
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        this.f119611c = null;
        c(th2);
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f119612i, bVar)) {
            this.f119612i = bVar;
            this.f119610b.onSubscribe(this);
        }
    }
}
