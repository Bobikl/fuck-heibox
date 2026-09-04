package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoOnEvent.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.b<? super T, ? super Throwable> f123536c;

    /* JADX INFO: compiled from: SingleDoOnEvent.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0<? super T> f123537b;

        a(l0<? super T> l0Var) {
            this.f123537b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            try {
                j.this.f123536c.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f123537b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123537b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                j.this.f123536c.accept(t10, null);
                this.f123537b.onSuccess(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123537b.onError(th2);
            }
        }
    }

    public j(o0<T> o0Var, kh.b<? super T, ? super Throwable> bVar) {
        this.f123535b = o0Var;
        this.f123536c = bVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123535b.f(new a(l0Var));
    }
}
