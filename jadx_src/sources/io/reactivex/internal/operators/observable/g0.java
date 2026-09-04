package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableError.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g0<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends Throwable> f122891b;

    public g0(Callable<? extends Throwable> callable) {
        this.f122891b = callable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            th = (Throwable) io.reactivex.internal.functions.a.g(this.f122891b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.a.b(th);
        }
        EmptyDisposable.error(th, g0Var);
    }
}
