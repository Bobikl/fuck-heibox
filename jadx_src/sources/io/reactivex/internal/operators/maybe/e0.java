package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybeNever.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends io.reactivex.q<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f121641b = new e0();

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super Object> tVar) {
        tVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
