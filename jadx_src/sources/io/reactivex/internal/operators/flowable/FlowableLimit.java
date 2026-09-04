package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableLimit<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120379d;

    public static final class LimitSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 2288246011222124525L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f120381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120382d;

        LimitSubscriber(org.reactivestreams.d<? super T> dVar, long j10) {
            this.f120380b = dVar;
            this.f120381c = j10;
            lazySet(j10);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120382d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120381c > 0) {
                this.f120381c = 0L;
                this.f120380b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120381c <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120381c = 0L;
                this.f120380b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f120381c;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.f120381c = j11;
                this.f120380b.onNext(t10);
                if (j11 == 0) {
                    this.f120382d.cancel();
                    this.f120380b.onComplete();
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120382d, eVar)) {
                if (this.f120381c == 0) {
                    eVar.cancel();
                    EmptySubscription.complete(this.f120380b);
                } else {
                    this.f120382d = eVar;
                    this.f120380b.onSubscribe(this);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    } else {
                        j12 = j11 <= j10 ? j11 : j10;
                    }
                } while (!compareAndSet(j11, j11 - j12));
                this.f120382d.request(j12);
            }
        }
    }

    public FlowableLimit(io.reactivex.j<T> jVar, long j10) {
        super(jVar);
        this.f120379d = j10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new LimitSubscriber(dVar, this.f120379d));
    }
}
