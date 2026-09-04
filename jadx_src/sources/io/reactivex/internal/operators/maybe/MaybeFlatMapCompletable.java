package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f121485c;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f121486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f121487c;

        FlatMapCompletableObserver(io.reactivex.d dVar, kh.o<? super T, ? extends io.reactivex.g> oVar) {
            this.f121486b = dVar;
            this.f121487c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121486b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121486b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f121487c.apply(t10), "The mapper returned a null CompletableSource");
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

    public MaybeFlatMapCompletable(io.reactivex.w<T> wVar, kh.o<? super T, ? extends io.reactivex.g> oVar) {
        this.f121484b = wVar;
        this.f121485c = oVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(dVar, this.f121485c);
        dVar.onSubscribe(flatMapCompletableObserver);
        this.f121484b.f(flatMapCompletableObserver);
    }
}
