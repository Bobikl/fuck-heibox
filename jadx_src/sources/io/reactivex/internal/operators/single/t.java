package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;

/* JADX INFO: compiled from: SingleJust.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f123571b;

    public t(T t10) {
        this.f123571b = t10;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        l0Var.onSubscribe(io.reactivex.disposables.c.a());
        l0Var.onSuccess(this.f123571b);
    }
}
