package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: CompletableDoOnEvent.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f119806c;

    /* JADX INFO: compiled from: CompletableDoOnEvent.java */
    public final class a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.d f119807b;

        a(io.reactivex.d dVar) {
            this.f119807b = dVar;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            try {
                e.this.f119806c.accept(null);
                this.f119807b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119807b.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            try {
                e.this.f119806c.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f119807b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119807b.onSubscribe(bVar);
        }
    }

    public e(io.reactivex.g gVar, kh.g<? super Throwable> gVar2) {
        this.f119805b = gVar;
        this.f119806c = gVar2;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119805b.d(new a(dVar));
    }
}
