package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletableError.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Throwable f119810b;

    public g(Throwable th2) {
        this.f119810b = th2;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        EmptyDisposable.error(this.f119810b, dVar);
    }
}
