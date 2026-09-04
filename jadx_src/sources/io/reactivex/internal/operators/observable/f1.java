package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableReduceWithSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f1<T, R> extends io.reactivex.i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<R> f122884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<R, ? super T, R> f122885d;

    public f1(io.reactivex.e0<T> e0Var, Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        this.f122883b = e0Var;
        this.f122884c = callable;
        this.f122885d = cVar;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super R> l0Var) {
        try {
            this.f122883b.g(new e1.a(l0Var, this.f122885d, io.reactivex.internal.functions.a.g(this.f122884c.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
