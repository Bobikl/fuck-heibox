package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CompletableDefer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.g> f119795b;

    public b(Callable<? extends io.reactivex.g> callable) {
        this.f119795b = callable;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        try {
            ((io.reactivex.g) io.reactivex.internal.functions.a.g(this.f119795b.call(), "The completableSupplier returned a null CompletableSource")).d(dVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, dVar);
        }
    }
}
