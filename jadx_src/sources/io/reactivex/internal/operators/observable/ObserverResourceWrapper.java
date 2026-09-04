package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? super T> f122783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f122784c = new AtomicReference<>();

    public ObserverResourceWrapper(io.reactivex.g0<? super T> g0Var) {
        this.f122783b = g0Var;
    }

    public void a(io.reactivex.disposables.b bVar) {
        DisposableHelper.set(this, bVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this.f122784c);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f122784c.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        dispose();
        this.f122783b.onComplete();
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        dispose();
        this.f122783b.onError(th2);
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        this.f122783b.onNext(t10);
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.setOnce(this.f122784c, bVar)) {
            this.f122783b.onSubscribe(this);
        }
    }
}
