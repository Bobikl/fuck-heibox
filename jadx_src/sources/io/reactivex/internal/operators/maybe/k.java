package io.reactivex.internal.operators.maybe;

/* JADX INFO: compiled from: MaybeError.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Throwable f121679b;

    public k(Throwable th2) {
        this.f121679b = th2;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        tVar.onSubscribe(io.reactivex.disposables.c.a());
        tVar.onError(this.f121679b);
    }
}
