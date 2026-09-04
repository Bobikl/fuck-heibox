package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapNotification<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f121497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends io.reactivex.w<? extends R>> f121498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<? extends io.reactivex.w<? extends R>> f121499e;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f121500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f121501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends io.reactivex.w<? extends R>> f121502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Callable<? extends io.reactivex.w<? extends R>> f121503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f121504f;

        public final class a implements io.reactivex.t<R> {
            a() {
            }

            @Override // io.reactivex.t
            public void onComplete() {
                FlatMapMaybeObserver.this.f121500b.onComplete();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                FlatMapMaybeObserver.this.f121500b.onError(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.f121500b.onSuccess(r10);
            }
        }

        FlatMapMaybeObserver(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar, kh.o<? super Throwable, ? extends io.reactivex.w<? extends R>> oVar2, Callable<? extends io.reactivex.w<? extends R>> callable) {
            this.f121500b = tVar;
            this.f121501c = oVar;
            this.f121502d = oVar2;
            this.f121503e = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f121504f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            try {
                ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121503e.call(), "The onCompleteSupplier returned a null MaybeSource")).f(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f121500b.onError(e10);
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            try {
                ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121502d.apply(th2), "The onErrorMapper returned a null MaybeSource")).f(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f121500b.onError(new CompositeException(th2, e10));
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121504f, bVar)) {
                this.f121504f = bVar;
                this.f121500b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121501c.apply(t10), "The onSuccessMapper returned a null MaybeSource")).f(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f121500b.onError(e10);
            }
        }
    }

    public MaybeFlatMapNotification(io.reactivex.w<T> wVar, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar, kh.o<? super Throwable, ? extends io.reactivex.w<? extends R>> oVar2, Callable<? extends io.reactivex.w<? extends R>> callable) {
        super(wVar);
        this.f121497c = oVar;
        this.f121498d = oVar2;
        this.f121499e = callable;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f121618b.f(new FlatMapMaybeObserver(tVar, this.f121497c, this.f121498d, this.f121499e));
    }
}
