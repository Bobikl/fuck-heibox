package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeLastOne<T> extends a<T, T> {

    public static final class TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -5467847744262967226L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        org.reactivestreams.e f120807l;

        TakeLastOneSubscriber(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120807l.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            T t10 = this.f123846c;
            if (t10 != null) {
                c(t10);
            } else {
                this.f123845b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123846c = null;
            this.f123845b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123846c = t10;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120807l, eVar)) {
                this.f120807l = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableTakeLastOne(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new TakeLastOneSubscriber(dVar));
    }
}
