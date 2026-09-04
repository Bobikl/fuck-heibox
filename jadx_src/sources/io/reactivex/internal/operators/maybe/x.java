package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeIgnoreElementCompletable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class x<T> extends io.reactivex.a implements lh.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121717b;

    /* JADX INFO: compiled from: MaybeIgnoreElementCompletable.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f121718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121719c;

        a(io.reactivex.d dVar) {
            this.f121718b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121719c.dispose();
            this.f121719c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121719c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121719c = DisposableHelper.DISPOSED;
            this.f121718b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121719c = DisposableHelper.DISPOSED;
            this.f121718b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121719c, bVar)) {
                this.f121719c = bVar;
                this.f121718b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121719c = DisposableHelper.DISPOSED;
            this.f121718b.onComplete();
        }
    }

    public x(io.reactivex.w<T> wVar) {
        this.f121717b = wVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f121717b.f(new a(dVar));
    }

    @Override // lh.c
    public io.reactivex.q<T> b() {
        return io.reactivex.plugins.a.Q(new w(this.f121717b));
    }
}
