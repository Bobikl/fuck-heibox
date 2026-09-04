package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryBiPredicate<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super Integer, ? super Throwable> f120646d;

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements io.reactivex.o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SubscriptionArbiter f120648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f120649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.d<? super Integer, ? super Throwable> f120650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f120651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f120652g;

        RetryBiSubscriber(org.reactivestreams.d<? super T> dVar, kh.d<? super Integer, ? super Throwable> dVar2, SubscriptionArbiter subscriptionArbiter, org.reactivestreams.c<? extends T> cVar) {
            this.f120647b = dVar;
            this.f120648c = subscriptionArbiter;
            this.f120649d = cVar;
            this.f120650e = dVar2;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f120648c.e()) {
                    long j10 = this.f120652g;
                    if (j10 != 0) {
                        this.f120652g = 0L;
                        this.f120648c.g(j10);
                    }
                    this.f120649d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120647b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            try {
                kh.d<? super Integer, ? super Throwable> dVar = this.f120650e;
                int i10 = this.f120651f + 1;
                this.f120651f = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f120647b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f120647b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120652g++;
            this.f120647b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120648c.h(eVar);
        }
    }

    public FlowableRetryBiPredicate(io.reactivex.j<T> jVar, kh.d<? super Integer, ? super Throwable> dVar) {
        super(jVar);
        this.f120646d = dVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        dVar.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(dVar, this.f120646d, subscriptionArbiter, this.f121039c).a();
    }
}
