package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableError.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b0<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends Throwable> f121049c;

    public b0(Callable<? extends Throwable> callable) {
        this.f121049c = callable;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            th = (Throwable) io.reactivex.internal.functions.a.g(this.f121049c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.a.b(th);
        }
        EmptySubscription.error(th, dVar);
    }
}
