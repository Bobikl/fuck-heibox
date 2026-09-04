package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableReduceWithSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class u0<T, R> extends io.reactivex.i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<T> f121339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<R> f121340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<R, ? super T, R> f121341d;

    public u0(org.reactivestreams.c<T> cVar, Callable<R> callable, kh.c<R, ? super T, R> cVar2) {
        this.f121339b = cVar;
        this.f121340c = callable;
        this.f121341d = cVar2;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super R> l0Var) {
        try {
            this.f121339b.g(new t0.a(l0Var, this.f121341d, io.reactivex.internal.functions.a.g(this.f121340c.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
