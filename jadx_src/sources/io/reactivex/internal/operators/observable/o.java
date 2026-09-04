package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollectSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class o<T, U> extends io.reactivex.i0<U> implements lh.d<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends U> f122999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.b<? super U, ? super T> f123000d;

    /* JADX INFO: compiled from: ObservableCollectSingle.java */
    public static final class a<T, U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super U> f123001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.b<? super U, ? super T> f123002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final U f123003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123005f;

        a(io.reactivex.l0<? super U> l0Var, U u10, kh.b<? super U, ? super T> bVar) {
            this.f123001b = l0Var;
            this.f123002c = bVar;
            this.f123003d = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123004e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123004e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123005f) {
                return;
            }
            this.f123005f = true;
            this.f123001b.onSuccess(this.f123003d);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123005f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123005f = true;
                this.f123001b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123005f) {
                return;
            }
            try {
                this.f123002c.accept(this.f123003d, t10);
            } catch (Throwable th2) {
                this.f123004e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123004e, bVar)) {
                this.f123004e = bVar;
                this.f123001b.onSubscribe(this);
            }
        }
    }

    public o(io.reactivex.e0<T> e0Var, Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        this.f122998b = e0Var;
        this.f122999c = callable;
        this.f123000d = bVar;
    }

    @Override // lh.d
    public io.reactivex.z<U> a() {
        return io.reactivex.plugins.a.R(new n(this.f122998b, this.f122999c, this.f123000d));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super U> l0Var) {
        try {
            this.f122998b.g(new a(l0Var, io.reactivex.internal.functions.a.g(this.f122999c.call(), "The initialSupplier returned a null value"), this.f123000d));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
