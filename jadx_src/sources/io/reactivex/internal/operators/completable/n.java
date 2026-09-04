package io.reactivex.internal.operators.completable;

import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: CompletableFromSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class n<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f119820b;

    /* JADX INFO: compiled from: CompletableFromSingle.java */
    public static final class a<T> implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119821b;

        a(io.reactivex.d dVar) {
            this.f119821b = dVar;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f119821b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119821b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f119821b.onComplete();
        }
    }

    public n(o0<T> o0Var) {
        this.f119820b = o0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119820b.f(new a(dVar));
    }
}
