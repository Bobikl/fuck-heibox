package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableFromCallable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e0<T> extends io.reactivex.j<T> implements Callable<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends T> f121091c;

    public e0(Callable<? extends T> callable) {
        this.f121091c = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) io.reactivex.internal.functions.a.g(this.f121091c.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(dVar);
        dVar.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.c(io.reactivex.internal.functions.a.g(this.f121091c.call(), "The callable returned a null value"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (deferredScalarSubscription.d()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
