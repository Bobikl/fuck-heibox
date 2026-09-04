package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAll<T> extends a<T, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f119877d;

    public static final class AllSubscriber<T> extends DeferredScalarSubscription<Boolean> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -3521127104134758517L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final kh.r<? super T> f119878l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.e f119879m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f119880n;

        AllSubscriber(org.reactivestreams.d<? super Boolean> dVar, kh.r<? super T> rVar) {
            super(dVar);
            this.f119878l = rVar;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f119879m.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119880n) {
                return;
            }
            this.f119880n = true;
            c(Boolean.TRUE);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119880n) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119880n = true;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119880n) {
                return;
            }
            try {
                if (this.f119878l.test(t10)) {
                    return;
                }
                this.f119880n = true;
                this.f119879m.cancel();
                c(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119879m.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119879m, eVar)) {
                this.f119879m = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAll(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f119877d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super Boolean> dVar) {
        this.f121039c.j6(new AllSubscriber(dVar, this.f119877d));
    }
}
