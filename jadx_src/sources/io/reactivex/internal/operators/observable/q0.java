package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableHide.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: compiled from: ObservableHide.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123035c;

        a(io.reactivex.g0<? super T> g0Var) {
            this.f123034b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123035c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123035c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123034b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123034b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123034b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123035c, bVar)) {
                this.f123035c = bVar;
                this.f123034b.onSubscribe(this);
            }
        }
    }

    public q0(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}
