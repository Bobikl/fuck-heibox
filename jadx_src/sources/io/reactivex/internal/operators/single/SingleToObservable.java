package io.reactivex.internal.operators.single;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleToObservable<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123465b;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements l0<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f123466i;

        SingleToObservableObserver(g0<? super T> g0Var) {
            super(g0Var);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.f123466i.dispose();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            c(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123466i, bVar)) {
                this.f123466i = bVar;
                this.f119610b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            b(t10);
        }
    }

    public SingleToObservable(o0<? extends T> o0Var) {
        this.f123465b = o0Var;
    }

    public static <T> l0<T> h8(g0<? super T> g0Var) {
        return new SingleToObservableObserver(g0Var);
    }

    @Override // io.reactivex.z
    public void H5(g0<? super T> g0Var) {
        this.f123465b.f(h8(g0Var));
    }
}
