package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToObservable<T> extends io.reactivex.z<T> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121595b;

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f121596i;

        MaybeToObservableObserver(io.reactivex.g0<? super T> g0Var) {
            super(g0Var);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.f121596i.dispose();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            c(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121596i, bVar)) {
                this.f121596i = bVar;
                this.f119610b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            b(t10);
        }
    }

    public MaybeToObservable(io.reactivex.w<T> wVar) {
        this.f121595b = wVar;
    }

    public static <T> io.reactivex.t<T> h8(io.reactivex.g0<? super T> g0Var) {
        return new MaybeToObservableObserver(g0Var);
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f121595b.f(h8(g0Var));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121595b;
    }
}
