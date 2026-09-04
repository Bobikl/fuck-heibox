package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableFromFuture.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l0<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Future<? extends T> f122947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122949d;

    public l0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f122947b = future;
        this.f122948c = j10;
        this.f122949d = timeUnit;
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
            TimeUnit timeUnit = this.f122949d;
            deferredScalarDisposable.b(io.reactivex.internal.functions.a.g(timeUnit != null ? this.f122947b.get(this.f122948c, timeUnit) : this.f122947b.get(), "Future returned null"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            g0Var.onError(th2);
        }
    }
}
