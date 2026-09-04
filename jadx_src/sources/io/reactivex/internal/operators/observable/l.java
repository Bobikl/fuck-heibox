package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<B> f122944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f122945d;

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f122946b;

        a(b<T, U, B> bVar) {
            this.f122946b = bVar;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122946b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122946b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(B b10) {
            this.f122946b.m();
        }
    }

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.observers.k<T, U, U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        final Callable<U> L;
        final io.reactivex.e0<B> M;
        io.reactivex.disposables.b N;
        io.reactivex.disposables.b O;
        U P;

        b(io.reactivex.g0<? super U> g0Var, Callable<U> callable, io.reactivex.e0<B> e0Var) {
            super(g0Var, new MpscLinkedQueue());
            this.L = callable;
            this.M = e0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.O.dispose();
            this.N.dispose();
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
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u11 = this.P;
                    if (u11 == null) {
                        return;
                    }
                    this.P = u10;
                    j(u11, false, this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                this.G.onError(th2);
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
                try {
                    this.P = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.O = aVar;
                    this.G.onSubscribe(this);
                    if (this.I) {
                        return;
                    }
                    this.M.g(aVar);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.I = true;
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.G);
                }
            }
        }
    }

    public l(io.reactivex.e0<T> e0Var, io.reactivex.e0<B> e0Var2, Callable<U> callable) {
        super(e0Var);
        this.f122944c = e0Var2;
        this.f122945d = callable;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        this.f122785b.g(new b(new io.reactivex.observers.l(g0Var), this.f122945d, this.f122944c));
    }
}
