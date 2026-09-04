package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: SingleDefer.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends o0<? extends T>> f123500b;

    public c(Callable<? extends o0<? extends T>> callable) {
        this.f123500b = callable;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        try {
            ((o0) io.reactivex.internal.functions.a.g(this.f123500b.call(), "The singleSupplier returned a null SingleSource")).f(l0Var);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
