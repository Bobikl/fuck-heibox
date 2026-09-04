package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatWithSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.o0<? extends T> f122094c;

    public static final class ConcatWithObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.o0<? extends T> f122096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122097d;

        ConcatWithObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.o0<? extends T> o0Var) {
            this.f122095b = g0Var;
            this.f122096c = o0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122097d = true;
            DisposableHelper.replace(this, null);
            io.reactivex.o0<? extends T> o0Var = this.f122096c;
            this.f122096c = null;
            o0Var.f(this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122095b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122095b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (!DisposableHelper.setOnce(this, bVar) || this.f122097d) {
                return;
            }
            this.f122095b.onSubscribe(this);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f122095b.onNext(t10);
            this.f122095b.onComplete();
        }
    }

    public ObservableConcatWithSingle(io.reactivex.z<T> zVar, io.reactivex.o0<? extends T> o0Var) {
        super(zVar);
        this.f122094c = o0Var;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new ConcatWithObserver(g0Var, this.f122094c));
    }
}
