package io.reactivex.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableCompletableObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements io.reactivex.d, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f123902b = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f123902b);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f123902b.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.d
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.f123902b, bVar, getClass())) {
            a();
        }
    }
}
