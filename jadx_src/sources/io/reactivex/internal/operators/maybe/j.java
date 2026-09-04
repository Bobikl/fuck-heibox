package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybeEmpty.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j extends io.reactivex.q<Object> implements lh.m<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f121678b = new j();

    @Override // lh.m, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super Object> tVar) {
        EmptyDisposable.complete(tVar);
    }
}
