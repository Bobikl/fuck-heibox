package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipUntil<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<U> f120754d;

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements lh.a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -6270983465606289181L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120756c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f120757d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SkipUntilMainSubscriber<T>.OtherSubscriber f120758e = new OtherSubscriber();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f120759f = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f120760g;

        public final class OtherSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            OtherSubscriber() {
            }

            @Override // org.reactivestreams.d
            public void onComplete() {
                SkipUntilMainSubscriber.this.f120760g = true;
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(SkipUntilMainSubscriber.this.f120756c);
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                io.reactivex.internal.util.g.d(skipUntilMainSubscriber.f120755b, th2, skipUntilMainSubscriber, skipUntilMainSubscriber.f120759f);
            }

            @Override // org.reactivestreams.d
            public void onNext(Object obj) {
                SkipUntilMainSubscriber.this.f120760g = true;
                get().cancel();
            }

            @Override // io.reactivex.o, org.reactivestreams.d
            public void onSubscribe(org.reactivestreams.e eVar) {
                SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
            }
        }

        SkipUntilMainSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120755b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120756c);
            SubscriptionHelper.cancel(this.f120758e);
        }

        @Override // lh.a
        public boolean m(T t10) {
            if (!this.f120760g) {
                return false;
            }
            io.reactivex.internal.util.g.f(this.f120755b, t10, this, this.f120759f);
            return true;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            SubscriptionHelper.cancel(this.f120758e);
            io.reactivex.internal.util.g.b(this.f120755b, this, this.f120759f);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f120758e);
            io.reactivex.internal.util.g.d(this.f120755b, th2, this, this.f120759f);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10)) {
                return;
            }
            this.f120756c.get().request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120756c, this.f120757d, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120756c, this.f120757d, j10);
        }
    }

    public FlowableSkipUntil(io.reactivex.j<T> jVar, org.reactivestreams.c<U> cVar) {
        super(jVar);
        this.f120754d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        SkipUntilMainSubscriber skipUntilMainSubscriber = new SkipUntilMainSubscriber(dVar);
        dVar.onSubscribe(skipUntilMainSubscriber);
        this.f120754d.g(skipUntilMainSubscriber.f120758e);
        this.f121039c.j6(skipUntilMainSubscriber);
    }
}
