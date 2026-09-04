package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleFromUnsafeSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123567b;

    public r(o0<T> o0Var) {
        this.f123567b = o0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123567b.f(l0Var);
    }
}
