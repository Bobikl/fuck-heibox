package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSampleTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f120676g;

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicInteger f120677i;

        SampleTimedEmitLast(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(dVar, j10, timeUnit, h0Var);
            this.f120677i = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        void b() {
            c();
            if (this.f120677i.decrementAndGet() == 0) {
                this.f120678b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120677i.incrementAndGet() == 2) {
                c();
                if (this.f120677i.decrementAndGet() == 0) {
                    this.f120678b.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(dVar, j10, timeUnit, h0Var);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        void b() {
            this.f120678b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            c();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f120681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120682f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final SequentialDisposable f120683g = new SequentialDisposable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f120684h;

        SampleTimedSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f120678b = dVar;
            this.f120679c = j10;
            this.f120680d = timeUnit;
            this.f120681e = h0Var;
        }

        void a() {
            DisposableHelper.dispose(this.f120683g);
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f120682f.get() != 0) {
                    this.f120678b.onNext(andSet);
                    io.reactivex.internal.util.b.e(this.f120682f, 1L);
                } else {
                    cancel();
                    this.f120678b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            a();
            this.f120684h.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            a();
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            a();
            this.f120678b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120684h, eVar)) {
                this.f120684h = eVar;
                this.f120678b.onSubscribe(this);
                SequentialDisposable sequentialDisposable = this.f120683g;
                io.reactivex.h0 h0Var = this.f120681e;
                long j10 = this.f120679c;
                sequentialDisposable.a(h0Var.h(this, j10, j10, this.f120680d));
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120682f, j10);
            }
        }
    }

    public FlowableSampleTimed(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(jVar);
        this.f120673d = j10;
        this.f120674e = timeUnit;
        this.f120675f = h0Var;
        this.f120676g = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        if (this.f120676g) {
            this.f121039c.j6(new SampleTimedEmitLast(eVar, this.f120673d, this.f120674e, this.f120675f));
        } else {
            this.f121039c.j6(new SampleTimedNoLast(eVar, this.f120673d, this.f120674e, this.f120675f));
        }
    }
}
