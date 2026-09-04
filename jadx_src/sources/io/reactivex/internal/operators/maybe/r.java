package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeFromCompletable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class r<T> extends io.reactivex.q<T> implements lh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f121703b;

    /* JADX INFO: compiled from: MaybeFromCompletable.java */
    public static final class a<T> implements io.reactivex.d, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121705c;

        a(io.reactivex.t<? super T> tVar) {
            this.f121704b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121705c.dispose();
            this.f121705c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121705c.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f121705c = DisposableHelper.DISPOSED;
            this.f121704b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f121705c = DisposableHelper.DISPOSED;
            this.f121704b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121705c, bVar)) {
                this.f121705c = bVar;
                this.f121704b.onSubscribe(this);
            }
        }
    }

    public r(io.reactivex.g gVar) {
        this.f121703b = gVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121703b.d(new a(tVar));
    }

    @Override // lh.e
    public io.reactivex.g source() {
        return this.f121703b;
    }
}
