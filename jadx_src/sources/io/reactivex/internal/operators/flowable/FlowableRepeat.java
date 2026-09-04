package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRepeat<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120580d;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements io.reactivex.o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SubscriptionArbiter f120582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f120583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f120584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f120585f;

        RepeatSubscriber(org.reactivestreams.d<? super T> dVar, long j10, SubscriptionArbiter subscriptionArbiter, org.reactivestreams.c<? extends T> cVar) {
            this.f120581b = dVar;
            this.f120582c = subscriptionArbiter;
            this.f120583d = cVar;
            this.f120584e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f120582c.e()) {
                    long j10 = this.f120585f;
                    if (j10 != 0) {
                        this.f120585f = 0L;
                        this.f120582c.g(j10);
                    }
                    this.f120583d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            long j10 = this.f120584e;
            if (j10 != Long.MAX_VALUE) {
                this.f120584e = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f120581b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120581b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120585f++;
            this.f120581b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120582c.h(eVar);
        }
    }

    public FlowableRepeat(io.reactivex.j<T> jVar, long j10) {
        super(jVar);
        this.f120580d = j10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        dVar.onSubscribe(subscriptionArbiter);
        long j10 = this.f120580d;
        new RepeatSubscriber(dVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.f121039c).a();
    }
}
