package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapSingle<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.o0<? extends R>> f120199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120201f;

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f120203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120204d;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.o0<? extends R>> f120209i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        org.reactivestreams.e f120211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120212l;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f120205e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f120206f = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicThrowable f120208h = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f120207g = new AtomicInteger(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.a<R>> f120210j = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.l0<R>, io.reactivex.disposables.b {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                FlatMapSingleSubscriber.this.d(this, th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                FlatMapSingleSubscriber.this.e(this, r10);
            }
        }

        FlatMapSingleSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends io.reactivex.o0<? extends R>> oVar, boolean z10, int i10) {
            this.f120202b = dVar;
            this.f120209i = oVar;
            this.f120203c = z10;
            this.f120204d = i10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            org.reactivestreams.d<? super R> dVar = this.f120202b;
            AtomicInteger atomicInteger = this.f120207g;
            AtomicReference<io.reactivex.internal.queue.a<R>> atomicReference = this.f120210j;
            int iAddAndGet = 1;
            do {
                long j10 = this.f120205e.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f120212l) {
                        clear();
                        return;
                    }
                    if (!this.f120203c && this.f120208h.get() != null) {
                        Throwable thC = this.f120208h.c();
                        clear();
                        dVar.onError(thC);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.a<R> aVar = atomicReference.get();
                    a.a.a.a.d.p.d.c.d dVarPoll = aVar != null ? aVar.poll() : null;
                    boolean z11 = dVarPoll == null;
                    if (z10 && z11) {
                        Throwable thC2 = this.f120208h.c();
                        if (thC2 != null) {
                            dVar.onError(thC2);
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(dVarPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f120212l) {
                        clear();
                        return;
                    }
                    if (!this.f120203c && this.f120208h.get() != null) {
                        Throwable thC3 = this.f120208h.c();
                        clear();
                        dVar.onError(thC3);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.a<R> aVar2 = atomicReference.get();
                    boolean z13 = aVar2 == null || aVar2.isEmpty();
                    if (z12 && z13) {
                        Throwable thC4 = this.f120208h.c();
                        if (thC4 != null) {
                            dVar.onError(thC4);
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.b.e(this.f120205e, j11);
                    if (this.f120204d != Integer.MAX_VALUE) {
                        this.f120211k.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        io.reactivex.internal.queue.a<R> c() {
            io.reactivex.internal.queue.a<R> aVar;
            do {
                io.reactivex.internal.queue.a<R> aVar2 = this.f120210j.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new io.reactivex.internal.queue.a<>(io.reactivex.j.Y());
            } while (!androidx.compose.animation.core.s0.a(this.f120210j, null, aVar));
            return aVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120212l = true;
            this.f120211k.cancel();
            this.f120206f.dispose();
        }

        void clear() {
            io.reactivex.internal.queue.a<R> aVar = this.f120210j.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        void d(FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.f120206f.b(innerObserver);
            if (!this.f120208h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120203c) {
                this.f120211k.cancel();
                this.f120206f.dispose();
            } else if (this.f120204d != Integer.MAX_VALUE) {
                this.f120211k.request(1L);
            }
            this.f120207g.decrementAndGet();
            a();
        }

        /* JADX WARN: Code duplicated, block: B:34:0x007a  */
        /* JADX WARN: Code duplicated, block: B:40:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void e(FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, R r10) {
            io.reactivex.internal.queue.a<R> aVarC;
            this.f120206f.b(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f120207g.decrementAndGet() == 0;
                    if (this.f120205e.get() != 0) {
                        this.f120202b.onNext(r10);
                        io.reactivex.internal.queue.a<R> aVar = this.f120210j.get();
                        if (z10 && (aVar == null || aVar.isEmpty())) {
                            Throwable thC = this.f120208h.c();
                            if (thC != null) {
                                this.f120202b.onError(thC);
                                return;
                            } else {
                                this.f120202b.onComplete();
                                return;
                            }
                        }
                        io.reactivex.internal.util.b.e(this.f120205e, 1L);
                        if (this.f120204d != Integer.MAX_VALUE) {
                            this.f120211k.request(1L);
                        }
                    } else {
                        io.reactivex.internal.queue.a<R> aVarC2 = c();
                        synchronized (aVarC2) {
                            aVarC2.offer(r10);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    aVarC = c();
                    synchronized (aVarC) {
                        aVarC.offer(r10);
                    }
                    this.f120207g.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                aVarC = c();
                synchronized (aVarC) {
                    aVarC.offer(r10);
                    this.f120207g.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            b();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120207g.decrementAndGet();
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120207g.decrementAndGet();
            if (!this.f120208h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120203c) {
                this.f120206f.dispose();
            }
            a();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            try {
                io.reactivex.o0 o0Var = (io.reactivex.o0) io.reactivex.internal.functions.a.g(this.f120209i.apply(t10), "The mapper returned a null SingleSource");
                this.f120207g.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f120212l || !this.f120206f.c(innerObserver)) {
                    return;
                }
                o0Var.f(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120211k.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120211k, eVar)) {
                this.f120211k = eVar;
                this.f120202b.onSubscribe(this);
                int i10 = this.f120204d;
                if (i10 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120205e, j10);
                a();
            }
        }
    }

    public FlowableFlatMapSingle(io.reactivex.j<T> jVar, kh.o<? super T, ? extends io.reactivex.o0<? extends R>> oVar, boolean z10, int i10) {
        super(jVar);
        this.f120199d = oVar;
        this.f120200e = z10;
        this.f120201f = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121039c.j6(new FlatMapSingleSubscriber(dVar, this.f120199d, this.f120200e, this.f120201f));
    }
}
