package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeMap.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends R> f121632c;

    /* JADX INFO: compiled from: MaybeMap.java */
    public static final class a<T, R> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f121633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends R> f121634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121635d;

        a(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends R> oVar) {
            this.f121633b = tVar;
            this.f121634c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f121635d;
            this.f121635d = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121635d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121633b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121633b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121635d, bVar)) {
                this.f121635d = bVar;
                this.f121633b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                this.f121633b.onSuccess(io.reactivex.internal.functions.a.g(this.f121634c.apply(t10), "The mapper returned a null item"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121633b.onError(th2);
            }
        }
    }

    public c0(io.reactivex.w<T> wVar, kh.o<? super T, ? extends R> oVar) {
        super(wVar);
        this.f121632c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f121618b.f(new a(tVar, this.f121632c));
    }
}
