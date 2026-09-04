package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAny<T> extends a<T, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f119891d;

    public static final class AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -2311252482644620661L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final kh.r<? super T> f119892l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.e f119893m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f119894n;

        AnySubscriber(org.reactivestreams.d<? super Boolean> dVar, kh.r<? super T> rVar) {
            super(dVar);
            this.f119892l = rVar;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f119893m.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119894n) {
                return;
            }
            this.f119894n = true;
            c(Boolean.FALSE);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119894n) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119894n = true;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119894n) {
                return;
            }
            try {
                if (this.f119892l.test(t10)) {
                    this.f119894n = true;
                    this.f119893m.cancel();
                    c(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119893m.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119893m, eVar)) {
                this.f119893m = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAny(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f119891d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super Boolean> dVar) {
        this.f121039c.j6(new AnySubscriber(dVar, this.f119891d));
    }
}
