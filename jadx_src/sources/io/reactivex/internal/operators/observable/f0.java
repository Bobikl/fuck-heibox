package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableEmpty.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends io.reactivex.z<Object> implements lh.m<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.reactivex.z<Object> f122882b = new f0();

    private f0() {
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super Object> g0Var) {
        EmptyDisposable.complete(g0Var);
    }

    @Override // lh.m, java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
