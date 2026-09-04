package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleContains.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends i0<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f123496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<Object, Object> f123497d;

    /* JADX INFO: compiled from: SingleContains.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0<? super Boolean> f123498b;

        a(l0<? super Boolean> l0Var) {
            this.f123498b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123498b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123498b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                b bVar = b.this;
                this.f123498b.onSuccess(Boolean.valueOf(bVar.f123497d.test(t10, bVar.f123496c)));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123498b.onError(th2);
            }
        }
    }

    public b(o0<T> o0Var, Object obj, kh.d<Object, Object> dVar) {
        this.f123495b = o0Var;
        this.f123496c = obj;
        this.f123497d = dVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Boolean> l0Var) {
        this.f123495b.f(new a(l0Var));
    }
}
