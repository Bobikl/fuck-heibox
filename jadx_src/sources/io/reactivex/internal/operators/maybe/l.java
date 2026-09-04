package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: MaybeErrorCallable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class l<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends Throwable> f121683b;

    public l(Callable<? extends Throwable> callable) {
        this.f121683b = callable;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        tVar.onSubscribe(io.reactivex.disposables.c.a());
        try {
            th = (Throwable) io.reactivex.internal.functions.a.g(this.f121683b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.a.b(th);
        }
        tVar.onError(th);
    }
}
