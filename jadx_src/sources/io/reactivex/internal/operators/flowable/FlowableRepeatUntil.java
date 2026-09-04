package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRepeatUntil<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.e f120586d;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements io.reactivex.o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SubscriptionArbiter f120588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f120589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.e f120590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f120591f;

        RepeatSubscriber(org.reactivestreams.d<? super T> dVar, kh.e eVar, SubscriptionArbiter subscriptionArbiter, org.reactivestreams.c<? extends T> cVar) {
            this.f120587b = dVar;
            this.f120588c = subscriptionArbiter;
            this.f120589d = cVar;
            this.f120590e = eVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f120588c.e()) {
                    long j10 = this.f120591f;
                    if (j10 != 0) {
                        this.f120591f = 0L;
                        this.f120588c.g(j10);
                    }
                    this.f120589d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            try {
                if (this.f120590e.a()) {
                    this.f120587b.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120587b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120587b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120591f++;
            this.f120587b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120588c.h(eVar);
        }
    }

    public FlowableRepeatUntil(io.reactivex.j<T> jVar, kh.e eVar) {
        super(jVar);
        this.f120586d = eVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        dVar.onSubscribe(subscriptionArbiter);
        new RepeatSubscriber(dVar, this.f120586d, subscriptionArbiter, this.f121039c).a();
    }
}
