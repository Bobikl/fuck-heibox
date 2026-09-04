package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableMaterialize.java */
/* JADX INFO: loaded from: classes5.dex */
public final class z0<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.y<T>> {

    /* JADX INFO: compiled from: ObservableMaterialize.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.y<T>> f123176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123177c;

        a(io.reactivex.g0<? super io.reactivex.y<T>> g0Var) {
            this.f123176b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123177c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123177c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123176b.onNext(io.reactivex.y.a());
            this.f123176b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123176b.onNext(io.reactivex.y.b(th2));
            this.f123176b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123176b.onNext(io.reactivex.y.c(t10));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123177c, bVar)) {
                this.f123177c = bVar;
                this.f123176b.onSubscribe(this);
            }
        }
    }

    public z0(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.y<T>> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}
