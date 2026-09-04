package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.n0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleLift.java */
/* JADX INFO: loaded from: classes5.dex */
public final class u<T, R> extends i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final n0<? extends R, ? super T> f123573c;

    public u(o0<T> o0Var, n0<? extends R, ? super T> n0Var) {
        this.f123572b = o0Var;
        this.f123573c = n0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        try {
            this.f123572b.f((l0) io.reactivex.internal.functions.a.g(this.f123573c.a(l0Var), "The onLift returned a null SingleObserver"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
