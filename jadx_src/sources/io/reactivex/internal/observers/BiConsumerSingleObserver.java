package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = 4943102778943297569L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.b<? super T, ? super Throwable> f119598b;

    public BiConsumerSingleObserver(kh.b<? super T, ? super Throwable> bVar) {
        this.f119598b = bVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f119598b.accept(null, th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f119598b.accept(t10, null);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
