package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<U> f120102d;

    public static final class MainSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 2259811067697317255L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f120104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final MainSubscriber<T>.OtherSubscriber f120105d = new OtherSubscriber();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120106e = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            @Override // org.reactivestreams.d
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.a();
                }
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.f120103b.onError(th2);
                } else {
                    io.reactivex.plugins.a.Y(th2);
                }
            }

            @Override // org.reactivestreams.d
            public void onNext(Object obj) {
                org.reactivestreams.e eVar = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (eVar != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    eVar.cancel();
                    MainSubscriber.this.a();
                }
            }

            @Override // io.reactivex.o, org.reactivestreams.d
            public void onSubscribe(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.setOnce(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }
        }

        MainSubscriber(org.reactivestreams.d<? super T> dVar, org.reactivestreams.c<? extends T> cVar) {
            this.f120103b = dVar;
            this.f120104c = cVar;
        }

        void a() {
            this.f120104c.g(this);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120105d);
            SubscriptionHelper.cancel(this.f120106e);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120103b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120103b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120103b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120106e, this, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                SubscriptionHelper.deferredRequest(this.f120106e, this, j10);
            }
        }
    }

    public FlowableDelaySubscriptionOther(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<U> cVar2) {
        this.f120101c = cVar;
        this.f120102d = cVar2;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        MainSubscriber mainSubscriber = new MainSubscriber(dVar, this.f120101c);
        dVar.onSubscribe(mainSubscriber);
        this.f120102d.g(mainSubscriber.f120105d);
    }
}
