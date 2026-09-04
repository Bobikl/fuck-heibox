package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoOnSuccess.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f123545c;

    /* JADX INFO: compiled from: SingleDoOnSuccess.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123546b;

        a(l0<? super T> l0Var) {
            this.f123546b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123546b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123546b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                l.this.f123545c.accept(t10);
                this.f123546b.onSuccess(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123546b.onError(th2);
            }
        }
    }

    public l(o0<T> o0Var, kh.g<? super T> gVar) {
        this.f123544b = o0Var;
        this.f123545c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123544b.f(new a(l0Var));
    }
}
