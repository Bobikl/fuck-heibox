package io.reactivex.internal.operators.maybe;

/* JADX INFO: compiled from: MaybeJust.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a0<T> extends io.reactivex.q<T> implements lh.m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f121619b;

    public a0(T t10) {
        this.f121619b = t10;
    }

    @Override // lh.m, java.util.concurrent.Callable
    public T call() {
        return this.f121619b;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        tVar.onSubscribe(io.reactivex.disposables.c.a());
        tVar.onSuccess(this.f121619b);
    }
}
