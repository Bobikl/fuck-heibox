package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipLastTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f120741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f120742h;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f120746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f120747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f120748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f120749h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f120750i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120751j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120752k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Throwable f120753l;

        SkipLastTimedSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
            this.f120743b = dVar;
            this.f120744c = j10;
            this.f120745d = timeUnit;
            this.f120746e = h0Var;
            this.f120747f = new io.reactivex.internal.queue.a<>(i10);
            this.f120748g = z10;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.d<? super T> dVar, boolean z12) {
            if (this.f120751j) {
                this.f120747f.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f120753l;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f120753l;
            if (th3 != null) {
                this.f120747f.clear();
                dVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f120743b;
            io.reactivex.internal.queue.a<Object> aVar = this.f120747f;
            boolean z10 = this.f120748g;
            TimeUnit timeUnit = this.f120745d;
            io.reactivex.h0 h0Var = this.f120746e;
            long j10 = this.f120744c;
            int iAddAndGet = 1;
            do {
                long j11 = this.f120750i.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f120752k;
                    Long l10 = (Long) aVar.peek();
                    boolean z12 = l10 == null;
                    boolean z13 = (z12 || l10.longValue() <= h0Var.d(timeUnit) - j10) ? z12 : true;
                    if (a(z11, z13, dVar, z10)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    aVar.poll();
                    dVar.onNext(aVar.poll());
                    j12++;
                }
                if (j12 != 0) {
                    io.reactivex.internal.util.b.e(this.f120750i, j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120751j) {
                return;
            }
            this.f120751j = true;
            this.f120749h.cancel();
            if (getAndIncrement() == 0) {
                this.f120747f.clear();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120752k = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120753l = th2;
            this.f120752k = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120747f.offer(Long.valueOf(this.f120746e.d(this.f120745d)), t10);
            b();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120749h, eVar)) {
                this.f120749h = eVar;
                this.f120743b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120750i, j10);
                b();
            }
        }
    }

    public FlowableSkipLastTimed(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
        super(jVar);
        this.f120738d = j10;
        this.f120739e = timeUnit;
        this.f120740f = h0Var;
        this.f120741g = i10;
        this.f120742h = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new SkipLastTimedSubscriber(dVar, this.f120738d, this.f120739e, this.f120740f, this.f120741g, this.f120742h));
    }
}
