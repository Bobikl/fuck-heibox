package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: CompletableDetach.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119796b;

    /* JADX INFO: compiled from: CompletableDetach.java */
    public static final class a implements io.reactivex.d, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.d f119797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f119798c;

        a(io.reactivex.d dVar) {
            this.f119797b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119797b = null;
            this.f119798c.dispose();
            this.f119798c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119798c.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119798c = DisposableHelper.DISPOSED;
            io.reactivex.d dVar = this.f119797b;
            if (dVar != null) {
                this.f119797b = null;
                dVar.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119798c = DisposableHelper.DISPOSED;
            io.reactivex.d dVar = this.f119797b;
            if (dVar != null) {
                this.f119797b = null;
                dVar.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119798c, bVar)) {
                this.f119798c = bVar;
                this.f119797b.onSubscribe(this);
            }
        }
    }

    public c(io.reactivex.g gVar) {
        this.f119796b = gVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119796b.d(new a(dVar));
    }
}
