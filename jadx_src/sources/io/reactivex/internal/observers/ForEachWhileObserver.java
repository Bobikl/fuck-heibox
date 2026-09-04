package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import kh.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements g0<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f119613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f119614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f119615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f119616e;

    public ForEachWhileObserver(r<? super T> rVar, kh.g<? super Throwable> gVar, kh.a aVar) {
        this.f119613b = rVar;
        this.f119614c = gVar;
        this.f119615d = aVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f119616e) {
            return;
        }
        this.f119616e = true;
        try {
            this.f119615d.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (this.f119616e) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f119616e = true;
        try {
            this.f119614c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (this.f119616e) {
            return;
        }
        try {
            if (this.f119613b.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
