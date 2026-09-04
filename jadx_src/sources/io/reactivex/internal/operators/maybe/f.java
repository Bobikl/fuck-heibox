package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeDetach.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: compiled from: MaybeDetach.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.t<? super T> f121642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121643c;

        a(io.reactivex.t<? super T> tVar) {
            this.f121642b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121642b = null;
            this.f121643c.dispose();
            this.f121643c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121643c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121643c = DisposableHelper.DISPOSED;
            io.reactivex.t<? super T> tVar = this.f121642b;
            if (tVar != null) {
                this.f121642b = null;
                tVar.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121643c = DisposableHelper.DISPOSED;
            io.reactivex.t<? super T> tVar = this.f121642b;
            if (tVar != null) {
                this.f121642b = null;
                tVar.onError(th2);
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121643c, bVar)) {
                this.f121643c = bVar;
                this.f121642b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121643c = DisposableHelper.DISPOSED;
            io.reactivex.t<? super T> tVar = this.f121642b;
            if (tVar != null) {
                this.f121642b = null;
                tVar.onSuccess(t10);
            }
        }
    }

    public f(io.reactivex.w<T> wVar) {
        super(wVar);
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar));
    }
}
