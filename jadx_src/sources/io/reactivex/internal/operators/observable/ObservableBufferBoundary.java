package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f121984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.e0<? extends Open> f121985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super Open, ? extends io.reactivex.e0<? extends Close>> f121986e;

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super C> f121987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<C> f121988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.e0<? extends Open> f121989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.o<? super Open, ? extends io.reactivex.e0<? extends Close>> f121990e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121994i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f121996k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f121997l;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final io.reactivex.internal.queue.a<C> f121995j = new io.reactivex.internal.queue.a<>(io.reactivex.z.T());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f121991f = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121992g = new AtomicReference<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Map<Long, C> f121998m = new LinkedHashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicThrowable f121993h = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Open>, io.reactivex.disposables.b {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final BufferBoundaryObserver<?, ?, Open, ?> f121999b;

            BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.f121999b = bufferBoundaryObserver;
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.f121999b.f(this);
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                lazySet(DisposableHelper.DISPOSED);
                this.f121999b.a(this, th2);
            }

            @Override // io.reactivex.g0
            public void onNext(Open open) {
                this.f121999b.d(open);
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        BufferBoundaryObserver(io.reactivex.g0<? super C> g0Var, io.reactivex.e0<? extends Open> e0Var, kh.o<? super Open, ? extends io.reactivex.e0<? extends Close>> oVar, Callable<C> callable) {
            this.f121987b = g0Var;
            this.f121988c = callable;
            this.f121989d = e0Var;
            this.f121990e = oVar;
        }

        void a(io.reactivex.disposables.b bVar, Throwable th2) {
            DisposableHelper.dispose(this.f121992g);
            this.f121991f.b(bVar);
            onError(th2);
        }

        void b(BufferCloseObserver<T, C> bufferCloseObserver, long j10) {
            boolean z10;
            this.f121991f.b(bufferCloseObserver);
            if (this.f121991f.h() == 0) {
                DisposableHelper.dispose(this.f121992g);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.f121998m;
                if (map == null) {
                    return;
                }
                this.f121995j.offer(map.remove(Long.valueOf(j10)));
                if (z10) {
                    this.f121994i = true;
                }
                c();
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super C> g0Var = this.f121987b;
            io.reactivex.internal.queue.a<C> aVar = this.f121995j;
            int iAddAndGet = 1;
            while (!this.f121996k) {
                boolean z10 = this.f121994i;
                if (z10 && this.f121993h.get() != null) {
                    aVar.clear();
                    g0Var.onError(this.f121993h.c());
                    return;
                }
                C cPoll = aVar.poll();
                boolean z11 = cPoll == null;
                if (z10 && z11) {
                    g0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g0Var.onNext(cPoll);
                }
            }
            aVar.clear();
        }

        void d(Open open) {
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.f121988c.call(), "The bufferSupplier returned a null Collection");
                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f121990e.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.f121997l;
                this.f121997l = 1 + j10;
                synchronized (this) {
                    Map<Long, C> map = this.f121998m;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j10), (C) collection);
                    BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(this, j10);
                    this.f121991f.c(bufferCloseObserver);
                    e0Var.g(bufferCloseObserver);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                DisposableHelper.dispose(this.f121992g);
                onError(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (DisposableHelper.dispose(this.f121992g)) {
                this.f121996k = true;
                this.f121991f.dispose();
                synchronized (this) {
                    this.f121998m = null;
                }
                if (getAndIncrement() != 0) {
                    this.f121995j.clear();
                }
            }
        }

        void f(BufferOpenObserver<Open> bufferOpenObserver) {
            this.f121991f.b(bufferOpenObserver);
            if (this.f121991f.h() == 0) {
                DisposableHelper.dispose(this.f121992g);
                this.f121994i = true;
                c();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f121992g.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121991f.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f121998m;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.f121995j.offer(it.next());
                }
                this.f121998m = null;
                this.f121994i = true;
                c();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121993h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121991f.dispose();
            synchronized (this) {
                this.f121998m = null;
            }
            this.f121994i = true;
            c();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            synchronized (this) {
                Map<Long, C> map = this.f121998m;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this.f121992g, bVar)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.f121991f.c(bufferOpenObserver);
                this.f121989d.g(bufferOpenObserver);
            }
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BufferBoundaryObserver<T, C, ?, ?> f122000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122001c;

        BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j10) {
            this.f122000b = bufferBoundaryObserver;
            this.f122001c = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                this.f122000b.b(this, this.f122001c);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(disposableHelper);
                this.f122000b.a(this, th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                bVar.dispose();
                this.f122000b.b(this, this.f122001c);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public ObservableBufferBoundary(io.reactivex.e0<T> e0Var, io.reactivex.e0<? extends Open> e0Var2, kh.o<? super Open, ? extends io.reactivex.e0<? extends Close>> oVar, Callable<U> callable) {
        super(e0Var);
        this.f121985d = e0Var2;
        this.f121986e = oVar;
        this.f121984c = callable;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(g0Var, this.f121985d, this.f121986e, this.f121984c);
        g0Var.onSubscribe(bufferBoundaryObserver);
        this.f122785b.g(bufferBoundaryObserver);
    }
}
