package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AutoDisposingMaybeObserverImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p<T> implements ah.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104119b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104120c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.reactivex.g f104121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.reactivex.t<? super T> f104122e;

    /* JADX INFO: compiled from: AutoDisposingMaybeObserverImpl.java */
    public class a extends io.reactivex.observers.b {
        a() {
        }

        @Override // io.reactivex.d
        public void onComplete() {
            p.this.f104120c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(p.this.f104119b);
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            p.this.f104120c.lazySet(AutoDisposableHelper.DISPOSED);
            p.this.onError(th2);
        }
    }

    p(io.reactivex.g gVar, io.reactivex.t<? super T> tVar) {
        this.f104121d = gVar;
        this.f104122e = tVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AutoDisposableHelper.dispose(this.f104120c);
        AutoDisposableHelper.dispose(this.f104119b);
    }

    @Override // ah.b
    public io.reactivex.t<? super T> e() {
        return this.f104122e;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f104119b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.t
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.f104119b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104120c);
        this.f104122e.onComplete();
    }

    @Override // io.reactivex.t
    public void onError(Throwable th2) {
        if (isDisposed()) {
            return;
        }
        this.f104119b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104120c);
        this.f104122e.onError(th2);
    }

    @Override // io.reactivex.t
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        a aVar = new a();
        if (g.c(this.f104120c, aVar, p.class)) {
            this.f104122e.onSubscribe(this);
            this.f104121d.d(aVar);
            g.c(this.f104119b, bVar, p.class);
        }
    }

    @Override // io.reactivex.t
    public void onSuccess(T t10) {
        if (isDisposed()) {
            return;
        }
        this.f104119b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104120c);
        this.f104122e.onSuccess(t10);
    }
}
