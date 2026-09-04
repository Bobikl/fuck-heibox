package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableUnsubscribeOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.h0 f120910d;

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0 f120912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120913d;

        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeSubscriber.this.f120913d.cancel();
            }
        }

        UnsubscribeSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.h0 h0Var) {
            this.f120911b = dVar;
            this.f120912c = h0Var;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f120912c.f(new a());
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f120911b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120911b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f120911b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120913d, eVar)) {
                this.f120913d = eVar;
                this.f120911b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120913d.request(j10);
        }
    }

    public FlowableUnsubscribeOn(io.reactivex.j<T> jVar, io.reactivex.h0 h0Var) {
        super(jVar);
        this.f120910d = h0Var;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new UnsubscribeSubscriber(dVar, this.f120910d));
    }
}
