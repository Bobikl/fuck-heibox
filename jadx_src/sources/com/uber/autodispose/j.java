package com.uber.autodispose;

import io.reactivex.e0;
import io.reactivex.g0;

/* JADX INFO: compiled from: AutoDisposeObservable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0<T> f104099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.g f104100c;

    j(e0<T> e0Var, io.reactivex.g gVar) {
        this.f104099b = e0Var;
        this.f104100c = gVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        this.f104099b.g(new AutoDisposingObserverImpl(this.f104100c, g0Var));
    }
}
