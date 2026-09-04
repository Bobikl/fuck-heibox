package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDefer.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.e0<? extends T>> f123058b;

    public s(Callable<? extends io.reactivex.e0<? extends T>> callable) {
        this.f123058b = callable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            ((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f123058b.call(), "null ObservableSource supplied")).g(g0Var);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}
