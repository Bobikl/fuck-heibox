package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapSingle<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.o0<? extends R>> f122185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122186d;

    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f122188c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.o0<? extends R>> f122192g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f122194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122195j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f122189d = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f122191f = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f122190e = new AtomicInteger(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.a<R>> f122193h = new AtomicReference<>();

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
                FlatMapSingleObserver.this.d(this, th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                FlatMapSingleObserver.this.f(this, r10);
            }
        }

        FlatMapSingleObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.o0<? extends R>> oVar, boolean z10) {
            this.f122187b = g0Var;
            this.f122192g = oVar;
            this.f122188c = z10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.g0<? super R> g0Var = this.f122187b;
            AtomicInteger atomicInteger = this.f122190e;
            AtomicReference<io.reactivex.internal.queue.a<R>> atomicReference = this.f122193h;
            int iAddAndGet = 1;
            while (!this.f122195j) {
                if (!this.f122188c && this.f122191f.get() != null) {
                    Throwable thC = this.f122191f.c();
                    clear();
                    g0Var.onError(thC);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                io.reactivex.internal.queue.a<R> aVar = atomicReference.get();
                a.a.a.a.d.p.d.c.d dVarPoll = aVar != null ? aVar.poll() : null;
                boolean z11 = dVarPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = this.f122191f.c();
                    if (thC2 != null) {
                        g0Var.onError(thC2);
                        return;
                    } else {
                        g0Var.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g0Var.onNext(dVarPoll);
                }
            }
            clear();
        }

        io.reactivex.internal.queue.a<R> c() {
            io.reactivex.internal.queue.a<R> aVar;
            do {
                io.reactivex.internal.queue.a<R> aVar2 = this.f122193h.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new io.reactivex.internal.queue.a<>(io.reactivex.z.T());
            } while (!androidx.compose.animation.core.s0.a(this.f122193h, null, aVar));
            return aVar;
        }

        void clear() {
            io.reactivex.internal.queue.a<R> aVar = this.f122193h.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        void d(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.f122189d.b(innerObserver);
            if (!this.f122191f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122188c) {
                this.f122194i.dispose();
                this.f122189d.dispose();
            }
            this.f122190e.decrementAndGet();
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122195j = true;
            this.f122194i.dispose();
            this.f122189d.dispose();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void f(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, R r10) {
            io.reactivex.internal.queue.a<R> aVarC;
            this.f122189d.b(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f122187b.onNext(r10);
                    boolean z10 = this.f122190e.decrementAndGet() == 0;
                    io.reactivex.internal.queue.a<R> aVar = this.f122193h.get();
                    if (z10 && (aVar == null || aVar.isEmpty())) {
                        Throwable thC = this.f122191f.c();
                        if (thC != null) {
                            this.f122187b.onError(thC);
                            return;
                        } else {
                            this.f122187b.onComplete();
                            return;
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
                    this.f122190e.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                aVarC = c();
                synchronized (aVarC) {
                    aVarC.offer(r10);
                    this.f122190e.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122195j;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122190e.decrementAndGet();
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122190e.decrementAndGet();
            if (!this.f122191f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122188c) {
                this.f122189d.dispose();
            }
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                io.reactivex.o0 o0Var = (io.reactivex.o0) io.reactivex.internal.functions.a.g(this.f122192g.apply(t10), "The mapper returned a null SingleSource");
                this.f122190e.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f122195j || !this.f122189d.c(innerObserver)) {
                    return;
                }
                o0Var.f(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122194i.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122194i, bVar)) {
                this.f122194i = bVar;
                this.f122187b.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapSingle(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.o0<? extends R>> oVar, boolean z10) {
        super(e0Var);
        this.f122185c = oVar;
        this.f122186d = z10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        this.f122785b.g(new FlatMapSingleObserver(g0Var, this.f122185c, this.f122186d));
    }
}
