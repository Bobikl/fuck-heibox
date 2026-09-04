package io.reactivex.internal.observers;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class CallbackCompletableObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b, kh.g<Throwable>, io.reactivex.observers.f {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super Throwable> f119601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f119602c;

    public CallbackCompletableObserver(kh.a aVar) {
        this.f119601b = this;
        this.f119602c = aVar;
    }

    public CallbackCompletableObserver(kh.g<? super Throwable> gVar, kh.a aVar) {
        this.f119601b = gVar;
        this.f119602c = aVar;
    }

    @Override // io.reactivex.observers.f
    public boolean a() {
        return this.f119601b != this;
    }

    @Override // kh.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        io.reactivex.plugins.a.Y(new OnErrorNotImplementedException(th2));
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.d
    public void onComplete() {
        try {
            this.f119602c.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        try {
            this.f119601b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(th3);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
