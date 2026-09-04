package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: SingleFromCallable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f123560b;

    public p(Callable<? extends T> callable) {
        this.f123560b = callable;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        l0Var.onSubscribe(bVarB);
        if (bVarB.isDisposed()) {
            return;
        }
        try {
            a.a.a.a.d.p.d.c.d dVar = (Object) io.reactivex.internal.functions.a.g(this.f123560b.call(), "The callable returned a null value");
            if (bVarB.isDisposed()) {
                return;
            }
            l0Var.onSuccess(dVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (bVarB.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                l0Var.onError(th2);
            }
        }
    }
}
