package io.reactivex.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d<T> implements g0<T>, io.reactivex.disposables.b {
    final AtomicReference<io.reactivex.disposables.b> upstream = new AtomicReference<>();

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    protected void onStart() {
    }

    @Override // io.reactivex.g0
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.upstream, bVar, getClass())) {
            onStart();
        }
    }
}
