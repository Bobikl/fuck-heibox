package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeIsEmpty.java */
/* JADX INFO: loaded from: classes12.dex */
public final class y<T> extends io.reactivex.internal.operators.maybe.a<T, Boolean> {

    /* JADX INFO: compiled from: MaybeIsEmpty.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super Boolean> f121720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121721c;

        a(io.reactivex.t<? super Boolean> tVar) {
            this.f121720b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121721c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121721c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121720b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121720b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121721c, bVar)) {
                this.f121721c = bVar;
                this.f121720b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121720b.onSuccess(Boolean.FALSE);
        }
    }

    public y(io.reactivex.w<T> wVar) {
        super(wVar);
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super Boolean> tVar) {
        this.f121618b.f(new a(tVar));
    }
}
