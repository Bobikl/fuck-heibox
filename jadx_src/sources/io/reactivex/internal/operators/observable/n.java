package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollect.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends U> f122983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.b<? super U, ? super T> f122984d;

    /* JADX INFO: compiled from: ObservableCollect.java */
    public static final class a<T, U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f122985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.b<? super U, ? super T> f122986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final U f122987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122989f;

        a(io.reactivex.g0<? super U> g0Var, U u10, kh.b<? super U, ? super T> bVar) {
            this.f122985b = g0Var;
            this.f122986c = bVar;
            this.f122987d = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122988e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122988e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122989f) {
                return;
            }
            this.f122989f = true;
            this.f122985b.onNext(this.f122987d);
            this.f122985b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122989f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122989f = true;
                this.f122985b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122989f) {
                return;
            }
            try {
                this.f122986c.accept(this.f122987d, t10);
            } catch (Throwable th2) {
                this.f122988e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122988e, bVar)) {
                this.f122988e = bVar;
                this.f122985b.onSubscribe(this);
            }
        }
    }

    public n(io.reactivex.e0<T> e0Var, Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        super(e0Var);
        this.f122983c = callable;
        this.f122984d = bVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        try {
            this.f122785b.g(new a(g0Var, io.reactivex.internal.functions.a.g(this.f122983c.call(), "The initialSupplier returned a null value"), this.f122984d));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, g0Var);
        }
    }
}
