package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f123393c;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f123394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f123395c;

        FlatMapCompletableObserver(io.reactivex.d dVar, kh.o<? super T, ? extends io.reactivex.g> oVar) {
            this.f123394b = dVar;
            this.f123395c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f123394b.onComplete();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123394b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f123395c.apply(t10), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                gVar.d(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }
    }

    public SingleFlatMapCompletable(o0<T> o0Var, kh.o<? super T, ? extends io.reactivex.g> oVar) {
        this.f123392b = o0Var;
        this.f123393c = oVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(dVar, this.f123393c);
        dVar.onSubscribe(flatMapCompletableObserver);
        this.f123392b.f(flatMapCompletableObserver);
    }
}
