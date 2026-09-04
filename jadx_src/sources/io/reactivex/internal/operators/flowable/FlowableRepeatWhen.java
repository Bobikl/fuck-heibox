package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRepeatWhen<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super io.reactivex.j<Object>, ? extends org.reactivestreams.c<?>> f120592d;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.processors.a<Object> aVar, org.reactivestreams.e eVar) {
            super(dVar, aVar, eVar);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            j(0);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120599l.cancel();
            this.f120597j.onError(th2);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements io.reactivex.o<Object>, org.reactivestreams.e {
        private static final long serialVersionUID = 2827772011130406689L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.c<T> f120593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120594c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f120595d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        WhenSourceSubscriber<T, U> f120596e;

        WhenReceiver(org.reactivestreams.c<T> cVar) {
            this.f120593b = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120594c);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120596e.cancel();
            this.f120596e.f120597j.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120596e.cancel();
            this.f120596e.f120597j.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f120594c.get() != SubscriptionHelper.CANCELLED) {
                    this.f120593b.g(this.f120596e);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120594c, this.f120595d, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120594c, this.f120595d, j10);
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements io.reactivex.o<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected final org.reactivestreams.d<? super T> f120597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final io.reactivex.processors.a<U> f120598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected final org.reactivestreams.e f120599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f120600m;

        WhenSourceSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.processors.a<U> aVar, org.reactivestreams.e eVar) {
            super(false);
            this.f120597j = dVar;
            this.f120598k = aVar;
            this.f120599l = eVar;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f120599l.cancel();
        }

        protected final void j(U u10) {
            h(EmptySubscription.INSTANCE);
            long j10 = this.f120600m;
            if (j10 != 0) {
                this.f120600m = 0L;
                g(j10);
            }
            this.f120599l.request(1L);
            this.f120598k.onNext(u10);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            this.f120600m++;
            this.f120597j.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public final void onSubscribe(org.reactivestreams.e eVar) {
            h(eVar);
        }
    }

    public FlowableRepeatWhen(io.reactivex.j<T> jVar, kh.o<? super io.reactivex.j<Object>, ? extends org.reactivestreams.c<?>> oVar) {
        super(jVar);
        this.f120592d = oVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        io.reactivex.processors.a<T> aVarQ8 = UnicastProcessor.T8(8).Q8();
        try {
            org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120592d.apply(aVarQ8), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.f121039c);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(eVar, aVarQ8, whenReceiver);
            whenReceiver.f120596e = repeatWhenSubscriber;
            dVar.onSubscribe(repeatWhenSubscriber);
            cVar.g(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
