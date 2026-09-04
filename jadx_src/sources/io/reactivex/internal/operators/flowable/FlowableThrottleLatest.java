package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableThrottleLatest<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f120847g;

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f120851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f120852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f120853g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f120854h = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.e f120855i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120856j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f120857k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120858l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f120859m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f120860n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f120861o;

        ThrottleLatestSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, boolean z10) {
            this.f120848b = dVar;
            this.f120849c = j10;
            this.f120850d = timeUnit;
            this.f120851e = cVar;
            this.f120852f = z10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f120853g;
            AtomicLong atomicLong = this.f120854h;
            org.reactivestreams.d<? super T> dVar = this.f120848b;
            int iAddAndGet = 1;
            while (!this.f120858l) {
                boolean z10 = this.f120856j;
                if (z10 && this.f120857k != null) {
                    atomicReference.lazySet(null);
                    dVar.onError(this.f120857k);
                    this.f120851e.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    if (z11 || !this.f120852f) {
                        atomicReference.lazySet(null);
                        dVar.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j10 = this.f120860n;
                        if (j10 != atomicLong.get()) {
                            this.f120860n = j10 + 1;
                            dVar.onNext(andSet);
                            dVar.onComplete();
                        } else {
                            dVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.f120851e.dispose();
                    return;
                }
                if (z11) {
                    if (this.f120859m) {
                        this.f120861o = false;
                        this.f120859m = false;
                    }
                } else if (!this.f120861o || this.f120859m) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j11 = this.f120860n;
                    if (j11 == atomicLong.get()) {
                        this.f120855i.cancel();
                        dVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.f120851e.dispose();
                        return;
                    } else {
                        dVar.onNext(andSet2);
                        this.f120860n = j11 + 1;
                        this.f120859m = false;
                        this.f120861o = true;
                        this.f120851e.c(this, this.f120849c, this.f120850d);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120858l = true;
            this.f120855i.cancel();
            this.f120851e.dispose();
            if (getAndIncrement() == 0) {
                this.f120853g.lazySet(null);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120856j = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120857k = th2;
            this.f120856j = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120853g.set(t10);
            a();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120855i, eVar)) {
                this.f120855i = eVar;
                this.f120848b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120854h, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120859m = true;
            a();
        }
    }

    public FlowableThrottleLatest(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(jVar);
        this.f120844d = j10;
        this.f120845e = timeUnit;
        this.f120846f = h0Var;
        this.f120847g = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ThrottleLatestSubscriber(dVar, this.f120844d, this.f120845e, this.f120846f.c(), this.f120847g));
    }
}
