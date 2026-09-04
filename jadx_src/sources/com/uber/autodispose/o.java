package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AutoDisposingCompletableObserverImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements ah.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104114b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104115c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.reactivex.g f104116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.reactivex.d f104117e;

    /* JADX INFO: compiled from: AutoDisposingCompletableObserverImpl.java */
    public class a extends io.reactivex.observers.b {
        a() {
        }

        @Override // io.reactivex.d
        public void onComplete() {
            o.this.f104115c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(o.this.f104114b);
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            o.this.f104115c.lazySet(AutoDisposableHelper.DISPOSED);
            o.this.onError(th2);
        }
    }

    o(io.reactivex.g gVar, io.reactivex.d dVar) {
        this.f104116d = gVar;
        this.f104117e = dVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AutoDisposableHelper.dispose(this.f104115c);
        AutoDisposableHelper.dispose(this.f104114b);
    }

    @Override // ah.a
    public io.reactivex.d e() {
        return this.f104117e;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f104114b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.d
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.f104114b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104115c);
        this.f104117e.onComplete();
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        if (isDisposed()) {
            return;
        }
        this.f104114b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104115c);
        this.f104117e.onError(th2);
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        a aVar = new a();
        if (g.c(this.f104115c, aVar, o.class)) {
            this.f104117e.onSubscribe(this);
            this.f104116d.d(aVar);
            g.c(this.f104114b, bVar, o.class);
        }
    }
}
