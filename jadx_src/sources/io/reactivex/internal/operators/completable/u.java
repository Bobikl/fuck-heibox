package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletableNever.java */
/* JADX INFO: loaded from: classes12.dex */
public final class u extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.reactivex.a f119835b = new u();

    private u() {
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        dVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
