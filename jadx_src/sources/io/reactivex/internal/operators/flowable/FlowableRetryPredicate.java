package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryPredicate<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super Throwable> f120653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120654e;

    public static final class RetrySubscriber<T> extends AtomicInteger implements io.reactivex.o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SubscriptionArbiter f120656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f120657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.r<? super Throwable> f120658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f120659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f120660g;

        RetrySubscriber(org.reactivestreams.d<? super T> dVar, long j10, kh.r<? super Throwable> rVar, SubscriptionArbiter subscriptionArbiter, org.reactivestreams.c<? extends T> cVar) {
            this.f120655b = dVar;
            this.f120656c = subscriptionArbiter;
            this.f120657d = cVar;
            this.f120658e = rVar;
            this.f120659f = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f120656c.e()) {
                    long j10 = this.f120660g;
                    if (j10 != 0) {
                        this.f120660g = 0L;
                        this.f120656c.g(j10);
                    }
                    this.f120657d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120655b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            long j10 = this.f120659f;
            if (j10 != Long.MAX_VALUE) {
                this.f120659f = j10 - 1;
            }
            if (j10 == 0) {
                this.f120655b.onError(th2);
                return;
            }
            try {
                if (this.f120658e.test(th2)) {
                    a();
                } else {
                    this.f120655b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f120655b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120660g++;
            this.f120655b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120656c.h(eVar);
        }
    }

    public FlowableRetryPredicate(io.reactivex.j<T> jVar, long j10, kh.r<? super Throwable> rVar) {
        super(jVar);
        this.f120653d = rVar;
        this.f120654e = j10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        dVar.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(dVar, this.f120654e, this.f120653d, subscriptionArbiter, this.f121039c).a();
    }
}
