package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeUntil<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<? extends U> f120826d;

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4945480365982832967L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f120828c = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120829d = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final TakeUntilMainSubscriber<T>.OtherSubscriber f120831f = new OtherSubscriber();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f120830e = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            OtherSubscriber() {
            }

            @Override // org.reactivestreams.d
            public void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.f120829d);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.g.b(takeUntilMainSubscriber.f120827b, takeUntilMainSubscriber, takeUntilMainSubscriber.f120830e);
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.f120829d);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.g.d(takeUntilMainSubscriber.f120827b, th2, takeUntilMainSubscriber, takeUntilMainSubscriber.f120830e);
            }

            @Override // org.reactivestreams.d
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // io.reactivex.o, org.reactivestreams.d
            public void onSubscribe(org.reactivestreams.e eVar) {
                SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
            }
        }

        TakeUntilMainSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120827b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120829d);
            SubscriptionHelper.cancel(this.f120831f);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            SubscriptionHelper.cancel(this.f120831f);
            io.reactivex.internal.util.g.b(this.f120827b, this, this.f120830e);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f120831f);
            io.reactivex.internal.util.g.d(this.f120827b, th2, this, this.f120830e);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            io.reactivex.internal.util.g.f(this.f120827b, t10, this, this.f120830e);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120829d, this.f120828c, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120829d, this.f120828c, j10);
        }
    }

    public FlowableTakeUntil(io.reactivex.j<T> jVar, org.reactivestreams.c<? extends U> cVar) {
        super(jVar);
        this.f120826d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(dVar);
        dVar.onSubscribe(takeUntilMainSubscriber);
        this.f120826d.g(takeUntilMainSubscriber.f120831f);
        this.f121039c.j6(takeUntilMainSubscriber);
    }
}
