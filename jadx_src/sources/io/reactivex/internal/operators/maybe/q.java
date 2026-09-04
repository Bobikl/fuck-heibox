package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: MaybeFromCallable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class q<T> extends io.reactivex.q<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f121702b;

    public q(Callable<? extends T> callable) {
        this.f121702b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f121702b.call();
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        tVar.onSubscribe(bVarB);
        if (bVarB.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f121702b.call();
            if (bVarB.isDisposed()) {
                return;
            }
            if (tCall == null) {
                tVar.onComplete();
            } else {
                tVar.onSuccess(tCall);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (bVarB.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                tVar.onError(th2);
            }
        }
    }
}
