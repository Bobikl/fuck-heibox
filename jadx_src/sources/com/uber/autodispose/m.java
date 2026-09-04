package com.uber.autodispose;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: AutoDisposeSingle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0<T> f104112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.g f104113c;

    m(o0<T> o0Var, io.reactivex.g gVar) {
        this.f104112b = o0Var;
        this.f104113c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f104112b.f(new q(this.f104113c, l0Var));
    }
}
