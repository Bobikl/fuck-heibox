package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableLastMaybe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class u0<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f123097b;

    /* JADX INFO: compiled from: ObservableLastMaybe.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f123098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f123100d;

        a(io.reactivex.t<? super T> tVar) {
            this.f123098b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123099c.dispose();
            this.f123099c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123099c == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123099c = DisposableHelper.DISPOSED;
            T t10 = this.f123100d;
            if (t10 == null) {
                this.f123098b.onComplete();
            } else {
                this.f123100d = null;
                this.f123098b.onSuccess(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123099c = DisposableHelper.DISPOSED;
            this.f123100d = null;
            this.f123098b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123100d = t10;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123099c, bVar)) {
                this.f123099c = bVar;
                this.f123098b.onSubscribe(this);
            }
        }
    }

    public u0(io.reactivex.e0<T> e0Var) {
        this.f123097b = e0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f123097b.g(new a(tVar));
    }
}
