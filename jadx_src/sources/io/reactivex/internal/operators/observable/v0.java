package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableLastSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v0<T> extends io.reactivex.i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f123110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f123111c;

    /* JADX INFO: compiled from: ObservableLastSingle.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f123112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f123113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f123115e;

        a(io.reactivex.l0<? super T> l0Var, T t10) {
            this.f123112b = l0Var;
            this.f123113c = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123114d.dispose();
            this.f123114d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123114d == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123114d = DisposableHelper.DISPOSED;
            T t10 = this.f123115e;
            if (t10 != null) {
                this.f123115e = null;
                this.f123112b.onSuccess(t10);
                return;
            }
            T t11 = this.f123113c;
            if (t11 != null) {
                this.f123112b.onSuccess(t11);
            } else {
                this.f123112b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123114d = DisposableHelper.DISPOSED;
            this.f123115e = null;
            this.f123112b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123115e = t10;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123114d, bVar)) {
                this.f123114d = bVar;
                this.f123112b.onSubscribe(this);
            }
        }
    }

    public v0(io.reactivex.e0<T> e0Var, T t10) {
        this.f123110b = e0Var;
        this.f123111c = t10;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super T> l0Var) {
        this.f123110b.g(new a(l0Var, this.f123111c));
    }
}
