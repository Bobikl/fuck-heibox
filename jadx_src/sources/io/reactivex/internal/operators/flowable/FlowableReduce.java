package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReduce<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<T, T, T> f120562d;

    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -4663883003264602070L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final kh.c<T, T, T> f120563l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.e f120564m;

        ReduceSubscriber(org.reactivestreams.d<? super T> dVar, kh.c<T, T, T> cVar) {
            super(dVar);
            this.f120563l = cVar;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120564m.cancel();
            this.f120564m = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            org.reactivestreams.e eVar = this.f120564m;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar == subscriptionHelper) {
                return;
            }
            this.f120564m = subscriptionHelper;
            T t10 = this.f123846c;
            if (t10 != null) {
                c(t10);
            } else {
                this.f123845b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            org.reactivestreams.e eVar = this.f120564m;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar == subscriptionHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120564m = subscriptionHelper;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120564m == SubscriptionHelper.CANCELLED) {
                return;
            }
            T t11 = this.f123846c;
            if (t11 == null) {
                this.f123846c = t10;
                return;
            }
            try {
                this.f123846c = (T) io.reactivex.internal.functions.a.g(this.f120563l.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120564m.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120564m, eVar)) {
                this.f120564m = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduce(io.reactivex.j<T> jVar, kh.c<T, T, T> cVar) {
        super(jVar);
        this.f120562d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ReduceSubscriber(dVar, this.f120562d));
    }
}
