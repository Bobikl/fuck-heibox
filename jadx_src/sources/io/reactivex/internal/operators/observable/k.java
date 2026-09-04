package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends io.reactivex.e0<B>> f122932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f122933d;

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f122934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122935c;

        a(b<T, U, B> bVar) {
            this.f122934b = bVar;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122935c) {
                return;
            }
            this.f122935c = true;
            this.f122934b.n();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122935c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122935c = true;
                this.f122934b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(B b10) {
            if (this.f122935c) {
                return;
            }
            this.f122935c = true;
            dispose();
            this.f122934b.n();
        }
    }

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.observers.k<T, U, U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        final Callable<U> L;
        final Callable<? extends io.reactivex.e0<B>> M;
        io.reactivex.disposables.b N;
        final AtomicReference<io.reactivex.disposables.b> O;
        U P;

        b(io.reactivex.g0<? super U> g0Var, Callable<U> callable, Callable<? extends io.reactivex.e0<B>> callable2) {
            super(g0Var, new MpscLinkedQueue());
            this.O = new AtomicReference<>();
            this.L = callable;
            this.M = callable2;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.N.dispose();
            m();
            if (b()) {
                this.H.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.k, io.reactivex.internal.util.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.g0<? super U> g0Var, U u10) {
            this.G.onNext((Object) u10);
        }

        void m() {
            DisposableHelper.dispose(this.O);
        }

        void n() {
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                try {
                    io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.M.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.O, aVar)) {
                        synchronized (this) {
                            U u11 = this.P;
                            if (u11 == null) {
                                return;
                            }
                            this.P = u10;
                            e0Var.g(aVar);
                            j(u11, false, this);
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.I = true;
                    this.N.dispose();
                    this.G.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                dispose();
                this.G.onError(th3);
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            synchronized (this) {
                U u10 = this.P;
                if (u10 == null) {
                    return;
                }
                this.P = null;
                this.H.offer(u10);
                this.J = true;
                if (b()) {
                    io.reactivex.internal.util.n.d(this.H, this.G, false, this, this);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            dispose();
            this.G.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.P;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.N, bVar)) {
                this.N = bVar;
                io.reactivex.g0<? super V> g0Var = this.G;
                try {
                    this.P = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.M.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.O.set(aVar);
                        g0Var.onSubscribe(this);
                        if (this.I) {
                            return;
                        }
                        e0Var.g(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.I = true;
                        bVar.dispose();
                        EmptyDisposable.error(th2, g0Var);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.I = true;
                    bVar.dispose();
                    EmptyDisposable.error(th3, g0Var);
                }
            }
        }
    }

    public k(io.reactivex.e0<T> e0Var, Callable<? extends io.reactivex.e0<B>> callable, Callable<U> callable2) {
        super(e0Var);
        this.f122932c = callable;
        this.f122933d = callable2;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        this.f122785b.g(new b(new io.reactivex.observers.l(g0Var), this.f122933d, this.f122932c));
    }
}
