package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableJust.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t0<T> extends io.reactivex.z<T> implements lh.m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f123082b;

    public t0(T t10) {
        this.f123082b = t10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(g0Var, this.f123082b);
        g0Var.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    @Override // lh.m, java.util.concurrent.Callable
    public T call() {
        return this.f123082b;
    }
}
