package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FlowableFromFuture.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f0<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Future<? extends T> f121103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f121105e;

    public f0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f121103c = future;
        this.f121104d = j10;
        this.f121105e = timeUnit;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(dVar);
        dVar.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f121105e;
            T t10 = timeUnit != null ? this.f121103c.get(this.f121104d, timeUnit) : this.f121103c.get();
            if (t10 == null) {
                dVar.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.c(t10);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (deferredScalarSubscription.d()) {
                return;
            }
            dVar.onError(th2);
        }
    }
}
