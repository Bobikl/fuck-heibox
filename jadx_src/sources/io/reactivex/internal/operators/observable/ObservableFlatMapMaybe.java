package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapMaybe<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f122173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122174d;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f122176c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f122180g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f122182i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122183j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f122177d = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f122179f = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f122178e = new AtomicInteger(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.a<R>> f122181h = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<R>, io.reactivex.disposables.b {
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

            @Override // io.reactivex.t
            public void onComplete() {
                FlatMapMaybeObserver.this.d(this);
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                FlatMapMaybeObserver.this.f(this, th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.g(this, r10);
            }
        }

        FlatMapMaybeObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar, boolean z10) {
            this.f122175b = g0Var;
            this.f122180g = oVar;
            this.f122176c = z10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.g0<? super R> g0Var = this.f122175b;
            AtomicInteger atomicInteger = this.f122178e;
            AtomicReference<io.reactivex.internal.queue.a<R>> atomicReference = this.f122181h;
            int iAddAndGet = 1;
            while (!this.f122183j) {
                if (!this.f122176c && this.f122179f.get() != null) {
                    Throwable thC = this.f122179f.c();
                    clear();
                    g0Var.onError(thC);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                io.reactivex.internal.queue.a<R> aVar = atomicReference.get();
                a.a.a.a.d.p.d.c.d dVarPoll = aVar != null ? aVar.poll() : null;
                boolean z11 = dVarPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = this.f122179f.c();
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
                io.reactivex.internal.queue.a<R> aVar2 = this.f122181h.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new io.reactivex.internal.queue.a<>(io.reactivex.z.T());
            } while (!androidx.compose.animation.core.s0.a(this.f122181h, null, aVar));
            return aVar;
        }

        void clear() {
            io.reactivex.internal.queue.a<R> aVar = this.f122181h.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        void d(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver) {
            this.f122177d.b(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f122178e.decrementAndGet() == 0;
                    io.reactivex.internal.queue.a<R> aVar = this.f122181h.get();
                    if (!z10 || (aVar != null && !aVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        b();
                        return;
                    } else {
                        Throwable thC = this.f122179f.c();
                        if (thC != null) {
                            this.f122175b.onError(thC);
                            return;
                        } else {
                            this.f122175b.onComplete();
                            return;
                        }
                    }
                }
            }
            this.f122178e.decrementAndGet();
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122183j = true;
            this.f122182i.dispose();
            this.f122177d.dispose();
        }

        void f(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.f122177d.b(innerObserver);
            if (!this.f122179f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122176c) {
                this.f122182i.dispose();
                this.f122177d.dispose();
            }
            this.f122178e.decrementAndGet();
            a();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void g(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver, R r10) {
            io.reactivex.internal.queue.a<R> aVarC;
            this.f122177d.b(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f122175b.onNext(r10);
                    boolean z10 = this.f122178e.decrementAndGet() == 0;
                    io.reactivex.internal.queue.a<R> aVar = this.f122181h.get();
                    if (z10 && (aVar == null || aVar.isEmpty())) {
                        Throwable thC = this.f122179f.c();
                        if (thC != null) {
                            this.f122175b.onError(thC);
                            return;
                        } else {
                            this.f122175b.onComplete();
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
                    this.f122178e.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                aVarC = c();
                synchronized (aVarC) {
                    aVarC.offer(r10);
                    this.f122178e.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122183j;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122178e.decrementAndGet();
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122178e.decrementAndGet();
            if (!this.f122179f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122176c) {
                this.f122177d.dispose();
            }
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                io.reactivex.w wVar = (io.reactivex.w) io.reactivex.internal.functions.a.g(this.f122180g.apply(t10), "The mapper returned a null MaybeSource");
                this.f122178e.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f122183j || !this.f122177d.c(innerObserver)) {
                    return;
                }
                wVar.f(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122182i.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122182i, bVar)) {
                this.f122182i = bVar;
                this.f122175b.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapMaybe(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar, boolean z10) {
        super(e0Var);
        this.f122173c = oVar;
        this.f122174d = z10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        this.f122785b.g(new FlatMapMaybeObserver(g0Var, this.f122173c, this.f122174d));
    }
}
