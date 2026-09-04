package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: SingleError.java */
/* JADX INFO: loaded from: classes5.dex */
public final class o<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends Throwable> f123559b;

    public o(Callable<? extends Throwable> callable) {
        this.f123559b = callable;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        try {
            th = (Throwable) io.reactivex.internal.functions.a.g(this.f123559b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.a.b(th);
        }
        EmptyDisposable.error(th, l0Var);
    }
}
