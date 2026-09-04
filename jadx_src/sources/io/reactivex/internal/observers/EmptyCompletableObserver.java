package io.reactivex.internal.observers;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class EmptyCompletableObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b, io.reactivex.observers.f {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.observers.f
    public boolean a() {
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.d
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        lazySet(DisposableHelper.DISPOSED);
        io.reactivex.plugins.a.Y(new OnErrorNotImplementedException(th2));
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
