package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: CompletableOnErrorComplete.java */
/* JADX INFO: loaded from: classes12.dex */
public final class v extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super Throwable> f119837c;

    /* JADX INFO: compiled from: CompletableOnErrorComplete.java */
    public final class a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.d f119838b;

        a(io.reactivex.d dVar) {
            this.f119838b = dVar;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119838b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            try {
                if (v.this.f119837c.test(th2)) {
                    this.f119838b.onComplete();
                } else {
                    this.f119838b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f119838b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119838b.onSubscribe(bVar);
        }
    }

    public v(io.reactivex.g gVar, kh.r<? super Throwable> rVar) {
        this.f119836b = gVar;
        this.f119837c = rVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119836b.d(new a(dVar));
    }
}
