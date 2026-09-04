package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletableEmpty.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.reactivex.a f119809b = new f();

    private f() {
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        EmptyDisposable.complete(dVar);
    }
}
