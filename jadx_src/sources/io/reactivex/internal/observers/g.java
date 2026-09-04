package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: DisposableLambdaObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g<T> implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g0<? super T> f119639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f119640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f119641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    io.reactivex.disposables.b f119642e;

    public g(g0<? super T> g0Var, kh.g<? super io.reactivex.disposables.b> gVar, kh.a aVar) {
        this.f119639b = g0Var;
        this.f119640c = gVar;
        this.f119641d = aVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        io.reactivex.disposables.b bVar = this.f119642e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar != disposableHelper) {
            this.f119642e = disposableHelper;
            try {
                this.f119641d.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            bVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f119642e.isDisposed();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        io.reactivex.disposables.b bVar = this.f119642e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar != disposableHelper) {
            this.f119642e = disposableHelper;
            this.f119639b.onComplete();
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.disposables.b bVar = this.f119642e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar == disposableHelper) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f119642e = disposableHelper;
            this.f119639b.onError(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        this.f119639b.onNext(t10);
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        try {
            this.f119640c.accept(bVar);
            if (DisposableHelper.validate(this.f119642e, bVar)) {
                this.f119642e = bVar;
                this.f119639b.onSubscribe(this);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            bVar.dispose();
            this.f119642e = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, this.f119639b);
        }
    }
}
