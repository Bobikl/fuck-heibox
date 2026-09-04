package io.reactivex.internal.operators.mixed;

import io.reactivex.e0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapObservable<T, R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f121946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends e0<? extends R>> f121947c;

    public static final class FlatMapObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements g0<R>, l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends e0<? extends R>> f121949c;

        FlatMapObserver(g0<? super R> g0Var, o<? super T, ? extends e0<? extends R>> oVar) {
            this.f121948b = g0Var;
            this.f121949c = oVar;
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
            this.f121948b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121948b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(R r10) {
            this.f121948b.onNext(r10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                ((e0) io.reactivex.internal.functions.a.g(this.f121949c.apply(t10), "The mapper returned a null Publisher")).g(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121948b.onError(th2);
            }
        }
    }

    public SingleFlatMapObservable(o0<T> o0Var, o<? super T, ? extends e0<? extends R>> oVar) {
        this.f121946b = o0Var;
        this.f121947c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(g0Var, this.f121947c);
        g0Var.onSubscribe(flatMapObserver);
        this.f121946b.f(flatMapObserver);
    }
}
