package io.reactivex.internal.operators.completable;

import io.reactivex.e0;
import io.reactivex.g0;

/* JADX INFO: compiled from: CompletableFromObservable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e0<T> f119814b;

    /* JADX INFO: compiled from: CompletableFromObservable.java */
    public static final class a<T> implements g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119815b;

        a(io.reactivex.d dVar) {
            this.f119815b = dVar;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f119815b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f119815b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119815b.onSubscribe(bVar);
        }
    }

    public k(e0<T> e0Var) {
        this.f119814b = e0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119814b.g(new a(dVar));
    }
}
