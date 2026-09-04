package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureError<T> extends a<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3176480756392482682L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f120487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120488d;

        BackpressureErrorSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120486b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120487c.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120488d) {
                return;
            }
            this.f120488d = true;
            this.f120486b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120488d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120488d = true;
                this.f120486b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120488d) {
                return;
            }
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.f120486b.onNext(t10);
                io.reactivex.internal.util.b.e(this, 1L);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120487c, eVar)) {
                this.f120487c = eVar;
                this.f120486b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }
    }

    public FlowableOnBackpressureError(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new BackpressureErrorSubscriber(dVar));
    }
}
