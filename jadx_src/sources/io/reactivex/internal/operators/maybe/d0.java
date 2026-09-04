package io.reactivex.internal.operators.maybe;

import io.reactivex.l0;

/* JADX INFO: compiled from: MaybeMaterialize.java */
/* JADX INFO: loaded from: classes12.dex */
@jh.d
public final class d0<T> extends io.reactivex.i0<io.reactivex.y<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q<T> f121639b;

    public d0(io.reactivex.q<T> qVar) {
        this.f121639b = qVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super io.reactivex.y<T>> l0Var) {
        this.f121639b.f(new io.reactivex.internal.operators.mixed.a(l0Var));
    }
}
