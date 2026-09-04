package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SequentialDisposable extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public SequentialDisposable(io.reactivex.disposables.b bVar) {
        lazySet(bVar);
    }

    public boolean a(io.reactivex.disposables.b bVar) {
        return DisposableHelper.replace(this, bVar);
    }

    public boolean b(io.reactivex.disposables.b bVar) {
        return DisposableHelper.set(this, bVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }
}
