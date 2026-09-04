package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybeLift.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b0<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.v<? extends R, ? super T> f121626c;

    public b0(io.reactivex.w<T> wVar, io.reactivex.v<? extends R, ? super T> vVar) {
        super(wVar);
        this.f121626c = vVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        try {
            this.f121618b.f((io.reactivex.t) io.reactivex.internal.functions.a.g(this.f121626c.a(tVar), "The operator returned a null MaybeObserver"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, tVar);
        }
    }
}
