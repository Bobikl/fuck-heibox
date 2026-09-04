package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryWhen<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super io.reactivex.j<Throwable>, ? extends org.reactivestreams.c<?>> f120661d;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.processors.a<Throwable> aVar, org.reactivestreams.e eVar) {
            super(dVar, aVar, eVar);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120599l.cancel();
            this.f120597j.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            j(th2);
        }
    }

    public FlowableRetryWhen(io.reactivex.j<T> jVar, kh.o<? super io.reactivex.j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        super(jVar);
        this.f120661d = oVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        io.reactivex.processors.a<T> aVarQ8 = UnicastProcessor.T8(8).Q8();
        try {
            org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120661d.apply(aVarQ8), "handler returned a null Publisher");
            FlowableRepeatWhen.WhenReceiver whenReceiver = new FlowableRepeatWhen.WhenReceiver(this.f121039c);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(eVar, aVarQ8, whenReceiver);
            whenReceiver.f120596e = retryWhenSubscriber;
            dVar.onSubscribe(retryWhenSubscriber);
            cVar.g(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
