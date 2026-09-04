package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: CompletableHide.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119823b;

    /* JADX INFO: compiled from: CompletableHide.java */
    public static final class a implements io.reactivex.d, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f119825c;

        a(io.reactivex.d dVar) {
            this.f119824b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119825c.dispose();
            this.f119825c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119825c.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119824b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119824b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119825c, bVar)) {
                this.f119825c = bVar;
                this.f119824b.onSubscribe(this);
            }
        }
    }

    public p(io.reactivex.g gVar) {
        this.f119823b = gVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119823b.d(new a(dVar));
    }
}
