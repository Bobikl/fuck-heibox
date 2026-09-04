package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CompletableFromCallable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<?> f119813b;

    public j(Callable<?> callable) {
        this.f119813b = callable;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        dVar.onSubscribe(bVarB);
        try {
            this.f119813b.call();
            if (bVarB.isDisposed()) {
                return;
            }
            dVar.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (bVarB.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
