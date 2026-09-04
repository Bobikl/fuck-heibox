package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapSingleElement<T, R> extends io.reactivex.q<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends o0<? extends R>> f121513c;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4827726964688405508L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f121514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends o0<? extends R>> f121515c;

        FlatMapMaybeObserver(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends o0<? extends R>> oVar) {
            this.f121514b = tVar;
            this.f121515c = oVar;
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
            this.f121514b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121514b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121514b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                ((o0) io.reactivex.internal.functions.a.g(this.f121515c.apply(t10), "The mapper returned a null SingleSource")).f(new a(this, this.f121514b));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }
    }

    public static final class a<R> implements l0<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.t<? super R> f121517c;

        a(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.t<? super R> tVar) {
            this.f121516b = atomicReference;
            this.f121517c = tVar;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f121517c.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f121516b, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(R r10) {
            this.f121517c.onSuccess(r10);
        }
    }

    public MaybeFlatMapSingleElement(io.reactivex.w<T> wVar, kh.o<? super T, ? extends o0<? extends R>> oVar) {
        this.f121512b = wVar;
        this.f121513c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f121512b.f(new FlatMapMaybeObserver(tVar, this.f121513c));
    }
}
