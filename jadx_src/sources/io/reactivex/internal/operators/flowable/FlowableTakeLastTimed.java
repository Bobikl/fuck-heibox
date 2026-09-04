package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeLastTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f120810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final io.reactivex.h0 f120811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f120812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f120813i;

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f120816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final TimeUnit f120817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.h0 f120818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f120819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f120820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.e f120821i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f120822j = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120823k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120824l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Throwable f120825m;

        TakeLastTimedSubscriber(org.reactivestreams.d<? super T> dVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
            this.f120814b = dVar;
            this.f120815c = j10;
            this.f120816d = j11;
            this.f120817e = timeUnit;
            this.f120818f = h0Var;
            this.f120819g = new io.reactivex.internal.queue.a<>(i10);
            this.f120820h = z10;
        }

        boolean a(boolean z10, org.reactivestreams.d<? super T> dVar, boolean z11) {
            if (this.f120823k) {
                this.f120819g.clear();
                return true;
            }
            if (z11) {
                if (!z10) {
                    return false;
                }
                Throwable th2 = this.f120825m;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f120825m;
            if (th3 != null) {
                this.f120819g.clear();
                dVar.onError(th3);
                return true;
            }
            if (!z10) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f120814b;
            io.reactivex.internal.queue.a<Object> aVar = this.f120819g;
            boolean z10 = this.f120820h;
            int iAddAndGet = 1;
            do {
                if (this.f120824l) {
                    if (a(aVar.isEmpty(), dVar, z10)) {
                        return;
                    }
                    long j10 = this.f120822j.get();
                    long j11 = 0;
                    while (true) {
                        if (a(aVar.peek() == null, dVar, z10)) {
                            return;
                        }
                        if (j10 == j11) {
                            if (j11 == 0) {
                                break;
                            }
                            io.reactivex.internal.util.b.e(this.f120822j, j11);
                            break;
                        } else {
                            aVar.poll();
                            dVar.onNext(aVar.poll());
                            j11++;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void c(long j10, io.reactivex.internal.queue.a<Object> aVar) {
            long j11 = this.f120816d;
            long j12 = this.f120815c;
            boolean z10 = j12 == Long.MAX_VALUE;
            while (!aVar.isEmpty()) {
                if (((Long) aVar.peek()).longValue() >= j10 - j11 && (z10 || (aVar.p() >> 1) <= j12)) {
                    return;
                }
                aVar.poll();
                aVar.poll();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120823k) {
                return;
            }
            this.f120823k = true;
            this.f120821i.cancel();
            if (getAndIncrement() == 0) {
                this.f120819g.clear();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            c(this.f120818f.d(this.f120817e), this.f120819g);
            this.f120824l = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120820h) {
                c(this.f120818f.d(this.f120817e), this.f120819g);
            }
            this.f120825m = th2;
            this.f120824l = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            io.reactivex.internal.queue.a<Object> aVar = this.f120819g;
            long jD = this.f120818f.d(this.f120817e);
            aVar.offer(Long.valueOf(jD), t10);
            c(jD, aVar);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120821i, eVar)) {
                this.f120821i = eVar;
                this.f120814b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120822j, j10);
                b();
            }
        }
    }

    public FlowableTakeLastTimed(io.reactivex.j<T> jVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
        super(jVar);
        this.f120808d = j10;
        this.f120809e = j11;
        this.f120810f = timeUnit;
        this.f120811g = h0Var;
        this.f120812h = i10;
        this.f120813i = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new TakeLastTimedSubscriber(dVar, this.f120808d, this.f120809e, this.f120810f, this.f120811g, this.f120812h, this.f120813i));
    }
}
