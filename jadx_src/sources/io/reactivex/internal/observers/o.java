package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResumeSingleObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o<T> implements l0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f119674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l0<? super T> f119675c;

    public o(AtomicReference<io.reactivex.disposables.b> atomicReference, l0<? super T> l0Var) {
        this.f119674b = atomicReference;
        this.f119675c = l0Var;
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        this.f119675c.onError(th2);
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.replace(this.f119674b, bVar);
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        this.f119675c.onSuccess(t10);
    }
}
