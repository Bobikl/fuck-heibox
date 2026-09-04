package io.reactivex.internal.operators.mixed;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.j;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.n;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapSingle<T, R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j<T> f121775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final o<? super T, ? extends o0<? extends R>> f121776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ErrorMode f121777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121778f;

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, e {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f121779q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f121780r = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f121781s = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super R> f121782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends o0<? extends R>> f121783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f121784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121785e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f121786f = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ConcatMapSingleObserver<R> f121787g = new ConcatMapSingleObserver<>(this);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final n<T> f121788h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final ErrorMode f121789i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e f121790j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f121791k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f121792l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f121793m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121794n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        R f121795o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        volatile int f121796p;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements l0<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapSingleSubscriber<?, R> f121797b;

            ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.f121797b = concatMapSingleSubscriber;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f121797b.b(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                this.f121797b.c(r10);
            }
        }

        ConcatMapSingleSubscriber(d<? super R> dVar, o<? super T, ? extends o0<? extends R>> oVar, int i10, ErrorMode errorMode) {
            this.f121782b = dVar;
            this.f121783c = oVar;
            this.f121784d = i10;
            this.f121789i = errorMode;
            this.f121788h = new SpscArrayQueue(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            d<? super R> dVar = this.f121782b;
            ErrorMode errorMode = this.f121789i;
            n<T> nVar = this.f121788h;
            AtomicThrowable atomicThrowable = this.f121786f;
            AtomicLong atomicLong = this.f121785e;
            int i10 = this.f121784d;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.f121792l) {
                    int i12 = this.f121796p;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f121791k;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = atomicThrowable.c();
                            if (thC == null) {
                                dVar.onComplete();
                                return;
                            } else {
                                dVar.onError(thC);
                                return;
                            }
                        }
                        if (!z11) {
                            int i13 = this.f121794n + 1;
                            if (i13 == i11) {
                                this.f121794n = 0;
                                this.f121790j.request(i11);
                            } else {
                                this.f121794n = i13;
                            }
                            try {
                                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f121783c.apply(tPoll), "The mapper returned a null SingleSource");
                                this.f121796p = 1;
                                o0Var.f(this.f121787g);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f121790j.cancel();
                                nVar.clear();
                                atomicThrowable.a(th2);
                                dVar.onError(atomicThrowable.c());
                                return;
                            }
                        }
                    } else if (i12 == 2) {
                        long j10 = this.f121793m;
                        if (j10 != atomicLong.get()) {
                            R r10 = this.f121795o;
                            this.f121795o = null;
                            dVar.onNext(r10);
                            this.f121793m = j10 + 1;
                            this.f121796p = 0;
                        }
                    }
                } else {
                    nVar.clear();
                    this.f121795o = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f121795o = null;
            dVar.onError(atomicThrowable.c());
        }

        void b(Throwable th2) {
            if (!this.f121786f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121789i != ErrorMode.END) {
                this.f121790j.cancel();
            }
            this.f121796p = 0;
            a();
        }

        void c(R r10) {
            this.f121795o = r10;
            this.f121796p = 2;
            a();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121792l = true;
            this.f121790j.cancel();
            this.f121787g.a();
            if (getAndIncrement() == 0) {
                this.f121788h.clear();
                this.f121795o = null;
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121791k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121786f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121789i == ErrorMode.IMMEDIATE) {
                this.f121787g.a();
            }
            this.f121791k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121788h.offer(t10)) {
                a();
            } else {
                this.f121790j.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121790j, eVar)) {
                this.f121790j = eVar;
                this.f121782b.onSubscribe(this);
                eVar.request(this.f121784d);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f121785e, j10);
            a();
        }
    }

    public FlowableConcatMapSingle(j<T> jVar, o<? super T, ? extends o0<? extends R>> oVar, ErrorMode errorMode, int i10) {
        this.f121775c = jVar;
        this.f121776d = oVar;
        this.f121777e = errorMode;
        this.f121778f = i10;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super R> dVar) {
        this.f121775c.j6(new ConcatMapSingleSubscriber(dVar, this.f121776d, this.f121778f, this.f121777e));
    }
}
