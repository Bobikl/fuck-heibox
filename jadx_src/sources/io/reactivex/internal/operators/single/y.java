package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleOnErrorReturn.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends T> f123581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f123582d;

    /* JADX INFO: compiled from: SingleOnErrorReturn.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0<? super T> f123583b;

        a(l0<? super T> l0Var) {
            this.f123583b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            T tApply;
            y yVar = y.this;
            kh.o<? super Throwable, ? extends T> oVar = yVar.f123581c;
            if (oVar != null) {
                try {
                    tApply = oVar.apply(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.f123583b.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = yVar.f123582d;
            }
            if (tApply != null) {
                this.f123583b.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f123583b.onError(nullPointerException);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123583b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123583b.onSuccess(t10);
        }
    }

    public y(o0<? extends T> o0Var, kh.o<? super Throwable, ? extends T> oVar, T t10) {
        this.f123580b = o0Var;
        this.f123581c = oVar;
        this.f123582d = t10;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123580b.f(new a(l0Var));
    }
}
