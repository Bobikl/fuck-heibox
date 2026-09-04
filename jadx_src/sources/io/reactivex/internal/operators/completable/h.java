package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CompletableErrorSupplier.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends Throwable> f119811b;

    public h(Callable<? extends Throwable> callable) {
        this.f119811b = callable;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        try {
            th = (Throwable) io.reactivex.internal.functions.a.g(this.f119811b.call(), "The error returned is null");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.a.b(th);
        }
        EmptyDisposable.error(th, dVar);
    }
}
