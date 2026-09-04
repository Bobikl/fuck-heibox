package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTake<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120793d;

    public static final class TakeSubscriber<T> extends AtomicBoolean implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5636543848937116287L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f120797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f120798f;

        TakeSubscriber(org.reactivestreams.d<? super T> dVar, long j10) {
            this.f120794b = dVar;
            this.f120795c = j10;
            this.f120798f = j10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120797e.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120796d) {
                return;
            }
            this.f120796d = true;
            this.f120794b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120796d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120796d = true;
            this.f120797e.cancel();
            this.f120794b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120796d) {
                return;
            }
            long j10 = this.f120798f;
            long j11 = j10 - 1;
            this.f120798f = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f120794b.onNext(t10);
                if (z10) {
                    this.f120797e.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120797e, eVar)) {
                this.f120797e = eVar;
                if (this.f120795c != 0) {
                    this.f120794b.onSubscribe(this);
                    return;
                }
                eVar.cancel();
                this.f120796d = true;
                EmptySubscription.complete(this.f120794b);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (get() || !compareAndSet(false, true) || j10 < this.f120795c) {
                    this.f120797e.request(j10);
                } else {
                    this.f120797e.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(io.reactivex.j<T> jVar, long j10) {
        super(jVar);
        this.f120793d = j10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new TakeSubscriber(dVar, this.f120793d));
    }
}
