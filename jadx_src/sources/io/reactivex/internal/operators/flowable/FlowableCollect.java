package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCollect<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends U> f119963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.b<? super U, ? super T> f119964e;

    public static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -3589550218733891694L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final kh.b<? super U, ? super T> f119965l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final U f119966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.e f119967n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f119968o;

        CollectSubscriber(org.reactivestreams.d<? super U> dVar, U u10, kh.b<? super U, ? super T> bVar) {
            super(dVar);
            this.f119965l = bVar;
            this.f119966m = u10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f119967n.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119968o) {
                return;
            }
            this.f119968o = true;
            c(this.f119966m);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119968o) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119968o = true;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119968o) {
                return;
            }
            try {
                this.f119965l.accept(this.f119966m, t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119967n.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119967n, eVar)) {
                this.f119967n = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollect(io.reactivex.j<T> jVar, Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        super(jVar);
        this.f119963d = callable;
        this.f119964e = bVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        try {
            this.f121039c.j6(new CollectSubscriber(dVar, io.reactivex.internal.functions.a.g(this.f119963d.call(), "The initial value supplied is null"), this.f119964e));
        } catch (Throwable th2) {
            EmptySubscription.error(th2, dVar);
        }
    }
}
