package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;

/* JADX INFO: compiled from: SingleMaterialize.java */
/* JADX INFO: loaded from: classes5.dex */
@jh.d
public final class w<T> extends i0<io.reactivex.y<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i0<T> f123578b;

    public w(i0<T> i0Var) {
        this.f123578b = i0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super io.reactivex.y<T>> l0Var) {
        this.f123578b.f(new io.reactivex.internal.operators.mixed.a(l0Var));
    }
}
