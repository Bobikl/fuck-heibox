package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCount<T> extends a<T, Long> {

    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements io.reactivex.o<Object> {
        private static final long serialVersionUID = 4973004223787171406L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        org.reactivestreams.e f120055l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f120056m;

        CountSubscriber(org.reactivestreams.d<? super Long> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120055l.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            c(Long.valueOf(this.f120056m));
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123845b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            this.f120056m++;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120055l, eVar)) {
                this.f120055l = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCount(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super Long> dVar) {
        this.f121039c.j6(new CountSubscriber(dVar));
    }
}
