package io.reactivex.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableMaybeObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> implements t<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f123903b = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f123903b);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f123903b.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.t
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.f123903b, bVar, getClass())) {
            a();
        }
    }
}
