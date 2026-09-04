package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleUsing<T, U> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<U> f123472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super U, ? extends o0<? extends T>> f123473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super U> f123474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f123475e;

    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5331524057054083935L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super U> f123477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f123478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123479e;

        UsingSingleObserver(l0<? super T> l0Var, U u10, boolean z10, kh.g<? super U> gVar) {
            super(u10);
            this.f123476b = l0Var;
            this.f123478d = z10;
            this.f123477c = gVar;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f123477c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123479e.dispose();
            this.f123479e = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123479e.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123479e = DisposableHelper.DISPOSED;
            if (this.f123478d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f123477c.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f123476b.onError(th2);
            if (this.f123478d) {
                return;
            }
            a();
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123479e, bVar)) {
                this.f123479e = bVar;
                this.f123476b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123479e = DisposableHelper.DISPOSED;
            if (this.f123478d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f123477c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f123476b.onError(th2);
                    return;
                }
            }
            this.f123476b.onSuccess(t10);
            if (this.f123478d) {
                return;
            }
            a();
        }
    }

    public SingleUsing(Callable<U> callable, kh.o<? super U, ? extends o0<? extends T>> oVar, kh.g<? super U> gVar, boolean z10) {
        this.f123472b = callable;
        this.f123473c = oVar;
        this.f123474d = gVar;
        this.f123475e = z10;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        try {
            U uCall = this.f123472b.call();
            try {
                ((o0) io.reactivex.internal.functions.a.g(this.f123473c.apply(uCall), "The singleFunction returned a null SingleSource")).f(new UsingSingleObserver(l0Var, uCall, this.f123475e, this.f123474d));
            } catch (Throwable th2) {
                th = th2;
                io.reactivex.exceptions.a.b(th);
                if (this.f123475e) {
                    try {
                        this.f123474d.accept(uCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        th = new CompositeException(th, th3);
                    }
                }
                EmptyDisposable.error(th, l0Var);
                if (this.f123475e) {
                    return;
                }
                try {
                    this.f123474d.accept(uCall);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.a.b(th4);
                    io.reactivex.plugins.a.Y(th4);
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.a.b(th5);
            EmptyDisposable.error(th5, l0Var);
        }
    }
}
