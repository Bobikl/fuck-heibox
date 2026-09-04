package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoOnError.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f123532c;

    /* JADX INFO: compiled from: SingleDoOnError.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0<? super T> f123533b;

        a(l0<? super T> l0Var) {
            this.f123533b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            try {
                i.this.f123532c.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f123533b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123533b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123533b.onSuccess(t10);
        }
    }

    public i(o0<T> o0Var, kh.g<? super Throwable> gVar) {
        this.f123531b = o0Var;
        this.f123532c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123531b.f(new a(l0Var));
    }
}
