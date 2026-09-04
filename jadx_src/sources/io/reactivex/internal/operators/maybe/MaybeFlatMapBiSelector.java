package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.w<? extends U>> f121477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<? super T, ? super U, ? extends R> f121478d;

    public static final class FlatMapBiMainObserver<T, U, R> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.w<? extends U>> f121479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final InnerObserver<T, U, R> f121480c;

        public static final class InnerObserver<T, U, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.t<? super R> f121481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final kh.c<? super T, ? super U, ? extends R> f121482c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            T f121483d;

            InnerObserver(io.reactivex.t<? super R> tVar, kh.c<? super T, ? super U, ? extends R> cVar) {
                this.f121481b = tVar;
                this.f121482c = cVar;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121481b.onComplete();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121481b.onError(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(U u10) {
                T t10 = this.f121483d;
                this.f121483d = null;
                try {
                    this.f121481b.onSuccess(io.reactivex.internal.functions.a.g(this.f121482c.apply(t10, u10), "The resultSelector returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121481b.onError(th2);
                }
            }
        }

        FlatMapBiMainObserver(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends io.reactivex.w<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
            this.f121480c = new InnerObserver<>(tVar, cVar);
            this.f121479b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f121480c);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f121480c.get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121480c.f121481b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121480c.f121481b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this.f121480c, bVar)) {
                this.f121480c.f121481b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                io.reactivex.w wVar = (io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121479b.apply(t10), "The mapper returned a null MaybeSource");
                if (DisposableHelper.replace(this.f121480c, null)) {
                    InnerObserver<T, U, R> innerObserver = this.f121480c;
                    innerObserver.f121483d = t10;
                    wVar.f(innerObserver);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121480c.f121481b.onError(th2);
            }
        }
    }

    public MaybeFlatMapBiSelector(io.reactivex.w<T> wVar, kh.o<? super T, ? extends io.reactivex.w<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        super(wVar);
        this.f121477c = oVar;
        this.f121478d = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f121618b.f(new FlatMapBiMainObserver(tVar, this.f121477c, this.f121478d));
    }
}
