package io.reactivex.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableSingleObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e<T> implements l0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f123904b = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f123904b);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f123904b.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.l0
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.f123904b, bVar, getClass())) {
            a();
        }
    }
}
