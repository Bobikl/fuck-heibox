package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: MaybeDefer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.w<? extends T>> f121640b;

    public e(Callable<? extends io.reactivex.w<? extends T>> callable) {
        this.f121640b = callable;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        try {
            ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121640b.call(), "The maybeSupplier returned a null MaybeSource")).f(tVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, tVar);
        }
    }
}
