package io.reactivex.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResourceSingleObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j<T> implements l0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.b> f123911b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.internal.disposables.b f123912c = new io.reactivex.internal.disposables.b();

    public final void a(@jh.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f123912c.c(bVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (DisposableHelper.dispose(this.f123911b)) {
            this.f123912c.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f123911b.get());
    }

    @Override // io.reactivex.l0
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.f123911b, bVar, getClass())) {
            b();
        }
    }
}
