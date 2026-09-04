package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableThrottleFirstTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120835f;

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f120839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final SequentialDisposable f120841g = new SequentialDisposable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120842h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f120843i;

        DebounceTimedSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f120836b = dVar;
            this.f120837c = j10;
            this.f120838d = timeUnit;
            this.f120839e = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120840f.cancel();
            this.f120839e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120843i) {
                return;
            }
            this.f120843i = true;
            this.f120836b.onComplete();
            this.f120839e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120843i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120843i = true;
            this.f120836b.onError(th2);
            this.f120839e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120843i || this.f120842h) {
                return;
            }
            this.f120842h = true;
            if (get() == 0) {
                this.f120843i = true;
                cancel();
                this.f120836b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.f120836b.onNext(t10);
                io.reactivex.internal.util.b.e(this, 1L);
                io.reactivex.disposables.b bVar = this.f120841g.get();
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f120841g.a(this.f120839e.c(this, this.f120837c, this.f120838d));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120840f, eVar)) {
                this.f120840f = eVar;
                this.f120836b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120842h = false;
        }
    }

    public FlowableThrottleFirstTimed(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(jVar);
        this.f120833d = j10;
        this.f120834e = timeUnit;
        this.f120835f = h0Var;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new DebounceTimedSubscriber(new io.reactivex.subscribers.e(dVar), this.f120833d, this.f120834e, this.f120835f.c()));
    }
}
