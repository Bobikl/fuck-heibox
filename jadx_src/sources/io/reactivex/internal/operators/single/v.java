package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleMap.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v<T, R> extends i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends R> f123575c;

    /* JADX INFO: compiled from: SingleMap.java */
    public static final class a<T, R> implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super R> f123576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends R> f123577c;

        a(l0<? super R> l0Var, kh.o<? super T, ? extends R> oVar) {
            this.f123576b = l0Var;
            this.f123577c = oVar;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123576b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123576b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                this.f123576b.onSuccess(io.reactivex.internal.functions.a.g(this.f123577c.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }
    }

    public v(o0<? extends T> o0Var, kh.o<? super T, ? extends R> oVar) {
        this.f123574b = o0Var;
        this.f123575c = oVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        this.f123574b.f(new a(l0Var, this.f123575c));
    }
}
