package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableNever.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a1 extends io.reactivex.z<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.reactivex.z<Object> f122797b = new a1();

    private a1() {
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super Object> g0Var) {
        g0Var.onSubscribe(EmptyDisposable.NEVER);
    }
}
