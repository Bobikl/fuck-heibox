package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeIgnoreElement.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: compiled from: MaybeIgnoreElement.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121716c;

        a(io.reactivex.t<? super T> tVar) {
            this.f121715b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121716c.dispose();
            this.f121716c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121716c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121716c = DisposableHelper.DISPOSED;
            this.f121715b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121716c = DisposableHelper.DISPOSED;
            this.f121715b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121716c, bVar)) {
                this.f121716c = bVar;
                this.f121715b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121716c = DisposableHelper.DISPOSED;
            this.f121715b.onComplete();
        }
    }

    public w(io.reactivex.w<T> wVar) {
        super(wVar);
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar));
    }
}
