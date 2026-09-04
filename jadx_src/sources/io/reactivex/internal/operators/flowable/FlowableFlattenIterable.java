package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlattenIterable<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f120214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120215e;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f120217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120219e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f120221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f120222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120224j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Iterator<? extends R> f120226l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120227m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120228n;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicReference<Throwable> f120225k = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120220f = new AtomicLong();

        FlattenIterableSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar, int i10) {
            this.f120216b = dVar;
            this.f120217c = oVar;
            this.f120218d = i10;
            this.f120219e = i10 - (i10 >> 2);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0124 A[PHI: r6
  0x0124: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:30:0x0080, B:67:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x012b A[SYNTHETIC] */
        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<?> dVar = this.f120216b;
            lh.o<T> oVar = this.f120222h;
            boolean z10 = true;
            boolean z11 = this.f120228n != 1;
            Iterator<? extends R> it = this.f120226l;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z12 = this.f120223i;
                    try {
                        T tPoll = oVar.poll();
                        if (c(z12, tPoll == null ? z10 : false, dVar, oVar)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.f120217c.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.f120226l = it;
                                } else {
                                    d(z11);
                                    it = null;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f120221g.cancel();
                                ExceptionHelper.a(this.f120225k, th2);
                                dVar.onError(ExceptionHelper.c(this.f120225k));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        this.f120221g.cancel();
                        ExceptionHelper.a(this.f120225k, th3);
                        Throwable thC = ExceptionHelper.c(this.f120225k);
                        this.f120226l = null;
                        oVar.clear();
                        dVar.onError(thC);
                        return;
                    }
                }
                if (it != null) {
                    long j10 = this.f120220f.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (c(this.f120223i, false, dVar, oVar)) {
                            return;
                        }
                        try {
                            dVar.onNext((Object) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value"));
                            if (c(this.f120223i, false, dVar, oVar)) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    d(z11);
                                    this.f120226l = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.a.b(th4);
                                this.f120226l = null;
                                this.f120221g.cancel();
                                ExceptionHelper.a(this.f120225k, th4);
                                dVar.onError(ExceptionHelper.c(this.f120225k));
                                return;
                            }
                        } catch (Throwable th5) {
                            io.reactivex.exceptions.a.b(th5);
                            this.f120226l = null;
                            this.f120221g.cancel();
                            ExceptionHelper.a(this.f120225k, th5);
                            dVar.onError(ExceptionHelper.c(this.f120225k));
                            return;
                        }
                    }
                    if (j11 == j10) {
                        if (c(this.f120223i, oVar.isEmpty() && it == null, dVar, oVar)) {
                            return;
                        }
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f120220f.addAndGet(-j11);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                z10 = true;
            }
        }

        boolean c(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, lh.o<?> oVar) {
            if (this.f120224j) {
                this.f120226l = null;
                oVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f120225k.get() == null) {
                if (!z11) {
                    return false;
                }
                dVar.onComplete();
                return true;
            }
            Throwable thC = ExceptionHelper.c(this.f120225k);
            this.f120226l = null;
            oVar.clear();
            dVar.onError(thC);
            return true;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120224j) {
                return;
            }
            this.f120224j = true;
            this.f120221g.cancel();
            if (getAndIncrement() == 0) {
                this.f120222h.clear();
            }
        }

        @Override // lh.o
        public void clear() {
            this.f120226l = null;
            this.f120222h.clear();
        }

        void d(boolean z10) {
            if (z10) {
                int i10 = this.f120227m + 1;
                if (i10 != this.f120219e) {
                    this.f120227m = i10;
                } else {
                    this.f120227m = 0;
                    this.f120221g.request(i10);
                }
            }
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120226l == null && this.f120222h.isEmpty();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120223i) {
                return;
            }
            this.f120223i = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120223i || !ExceptionHelper.a(this.f120225k, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120223i = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120223i) {
                return;
            }
            if (this.f120228n != 0 || this.f120222h.offer(t10)) {
                b();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120221g, eVar)) {
                this.f120221g = eVar;
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f120228n = iRequestFusion;
                        this.f120222h = lVar;
                        this.f120223i = true;
                        this.f120216b.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120228n = iRequestFusion;
                        this.f120222h = lVar;
                        this.f120216b.onSubscribe(this);
                        eVar.request(this.f120218d);
                        return;
                    }
                }
                this.f120222h = new SpscArrayQueue(this.f120218d);
                this.f120216b.onSubscribe(this);
                eVar.request(this.f120218d);
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f120226l;
            while (it == null) {
                T tPoll = this.f120222h.poll();
                if (tPoll != null) {
                    it = this.f120217c.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.f120226l = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f120226l = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120220f, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return ((i10 & 1) == 0 || this.f120228n != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(io.reactivex.j<T> jVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar, int i10) {
        super(jVar);
        this.f120214d = oVar;
        this.f120215e = i10;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super R> dVar) {
        io.reactivex.j<T> jVar = this.f121039c;
        if (!(jVar instanceof Callable)) {
            jVar.j6(new FlattenIterableSubscriber(dVar, this.f120214d, this.f120215e));
            return;
        }
        try {
            Object objCall = ((Callable) jVar).call();
            if (objCall == null) {
                EmptySubscription.complete(dVar);
                return;
            }
            try {
                FlowableFromIterable.M8(dVar, this.f120214d.apply(objCall).iterator());
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptySubscription.error(th2, dVar);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            EmptySubscription.error(th3, dVar);
        }
    }
}
