package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMapMaybe<T, R> extends io.reactivex.q<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f123414c;

    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5843758257109742742L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f123415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f123416c;

        FlatMapSingleObserver(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar) {
            this.f123415b = tVar;
            this.f123416c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123415b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123415b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                io.reactivex.w wVar = (io.reactivex.w) io.reactivex.internal.functions.a.g(this.f123416c.apply(t10), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                wVar.f(new a(this, this.f123415b));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }
    }

    public static final class a<R> implements io.reactivex.t<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f123417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.t<? super R> f123418c;

        a(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.t<? super R> tVar) {
            this.f123417b = atomicReference;
            this.f123418c = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f123418c.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f123418c.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f123417b, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(R r10) {
            this.f123418c.onSuccess(r10);
        }
    }

    public SingleFlatMapMaybe(o0<? extends T> o0Var, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar) {
        this.f123414c = oVar;
        this.f123413b = o0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f123413b.f(new FlatMapSingleObserver(tVar, this.f123414c));
    }
}
