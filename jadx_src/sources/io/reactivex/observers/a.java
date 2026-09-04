package io.reactivex.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: DefaultObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> implements g0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.reactivex.disposables.b f123901b;

    protected final void a() {
        io.reactivex.disposables.b bVar = this.f123901b;
        this.f123901b = DisposableHelper.DISPOSED;
        bVar.dispose();
    }

    protected void b() {
    }

    @Override // io.reactivex.g0
    public final void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.e(this.f123901b, bVar, getClass())) {
            this.f123901b = bVar;
            b();
        }
    }
}
