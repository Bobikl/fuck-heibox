package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import jh.f;

/* JADX INFO: compiled from: SerialDisposable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<b> f119532b;

    public d() {
        this.f119532b = new AtomicReference<>();
    }

    public d(@f b bVar) {
        this.f119532b = new AtomicReference<>(bVar);
    }

    @f
    public b a() {
        b bVar = this.f119532b.get();
        return bVar == DisposableHelper.DISPOSED ? c.a() : bVar;
    }

    public boolean b(@f b bVar) {
        return DisposableHelper.replace(this.f119532b, bVar);
    }

    public boolean c(@f b bVar) {
        return DisposableHelper.set(this.f119532b, bVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this.f119532b);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f119532b.get());
    }
}
