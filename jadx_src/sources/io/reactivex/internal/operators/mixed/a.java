package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.t;
import io.reactivex.y;
import jh.d;

/* JADX INFO: compiled from: MaterializeSingleObserver.java */
/* JADX INFO: loaded from: classes12.dex */
@d
public final class a<T> implements l0<T>, t<T>, io.reactivex.d, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l0<? super y<T>> f121950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.b f121951c;

    public a(l0<? super y<T>> l0Var) {
        this.f121950b = l0Var;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f121951c.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f121951c.isDisposed();
    }

    @Override // io.reactivex.t
    public void onComplete() {
        this.f121950b.onSuccess(y.a());
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        this.f121950b.onSuccess(y.b(th2));
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f121951c, bVar)) {
            this.f121951c = bVar;
            this.f121950b.onSubscribe(this);
        }
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        this.f121950b.onSuccess(y.c(t10));
    }
}
