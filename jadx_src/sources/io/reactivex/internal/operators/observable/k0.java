package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableFromCallable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k0<T> extends io.reactivex.z<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f122936b;

    public k0(Callable<? extends T> callable) {
        this.f122936b = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(g0Var);
        g0Var.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.b(io.reactivex.internal.functions.a.g(this.f122936b.call(), "Callable returned null"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                g0Var.onError(th2);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) io.reactivex.internal.functions.a.g(this.f122936b.call(), "The callable returned a null value");
    }
}
