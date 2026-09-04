package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapSingle<T, R> extends io.reactivex.i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends o0<? extends R>> f121507c;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4827726964688405508L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super R> f121508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends o0<? extends R>> f121509c;

        FlatMapMaybeObserver(l0<? super R> l0Var, kh.o<? super T, ? extends o0<? extends R>> oVar) {
            this.f121508b = l0Var;
            this.f121509c = oVar;
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
            this.f121508b.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121508b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121508b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f121509c.apply(t10), "The mapper returned a null SingleSource");
                if (isDisposed()) {
                    return;
                }
                o0Var.f(new a(this, this.f121508b));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }
    }

    public static final class a<R> implements l0<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final l0<? super R> f121511c;

        a(AtomicReference<io.reactivex.disposables.b> atomicReference, l0<? super R> l0Var) {
            this.f121510b = atomicReference;
            this.f121511c = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f121511c.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f121510b, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(R r10) {
            this.f121511c.onSuccess(r10);
        }
    }

    public MaybeFlatMapSingle(io.reactivex.w<T> wVar, kh.o<? super T, ? extends o0<? extends R>> oVar) {
        this.f121506b = wVar;
        this.f121507c = oVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        this.f121506b.f(new FlatMapMaybeObserver(l0Var, this.f121507c));
    }
}
