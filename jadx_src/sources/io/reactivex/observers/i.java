package io.reactivex.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResourceObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i<T> implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.b> f123909b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.internal.disposables.b f123910c = new io.reactivex.internal.disposables.b();

    public final void a(@jh.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f123910c.c(bVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (DisposableHelper.dispose(this.f123909b)) {
            this.f123910c.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f123909b.get());
    }

    @Override // io.reactivex.g0
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.c(this.f123909b, bVar, getClass())) {
            b();
        }
    }
}
