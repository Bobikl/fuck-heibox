package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class LambdaObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements g0<T>, io.reactivex.disposables.b, io.reactivex.observers.f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super T> f119622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f119623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f119624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f119625e;

    public LambdaObserver(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super io.reactivex.disposables.b> gVar3) {
        this.f119622b = gVar;
        this.f119623c = gVar2;
        this.f119624d = aVar;
        this.f119625e = gVar3;
    }

    @Override // io.reactivex.observers.f
    public boolean a() {
        return this.f119623c != Functions.f119561f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f119624d.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (isDisposed()) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f119623c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f119622b.accept(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.f119625e.accept(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
