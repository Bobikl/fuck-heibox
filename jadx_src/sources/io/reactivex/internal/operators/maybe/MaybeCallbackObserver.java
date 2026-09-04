package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b, io.reactivex.observers.f {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super T> f121408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f121409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f121410d;

    public MaybeCallbackObserver(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        this.f121408b = gVar;
        this.f121409c = gVar2;
        this.f121410d = aVar;
    }

    @Override // io.reactivex.observers.f
    public boolean a() {
        return this.f121409c != Functions.f119561f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // io.reactivex.t
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f121410d.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.t
    public void onError(Throwable th2) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f121409c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.t
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // io.reactivex.t
    public void onSuccess(T t10) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f121408b.accept(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
