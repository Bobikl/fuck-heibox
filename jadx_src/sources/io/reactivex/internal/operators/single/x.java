package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;

/* JADX INFO: compiled from: SingleNever.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x extends i0<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0<Object> f123579b = new x();

    private x() {
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Object> l0Var) {
        l0Var.onSubscribe(EmptyDisposable.NEVER);
    }
}
