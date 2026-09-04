package com.uber.autodispose;

import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AutoDisposingSingleObserverImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q<T> implements ah.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104124b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104125c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.reactivex.g f104126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0<? super T> f104127e;

    /* JADX INFO: compiled from: AutoDisposingSingleObserverImpl.java */
    public class a extends io.reactivex.observers.b {
        a() {
        }

        @Override // io.reactivex.d
        public void onComplete() {
            q.this.f104125c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(q.this.f104124b);
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            q.this.f104125c.lazySet(AutoDisposableHelper.DISPOSED);
            q.this.onError(th2);
        }
    }

    q(io.reactivex.g gVar, l0<? super T> l0Var) {
        this.f104126d = gVar;
        this.f104127e = l0Var;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AutoDisposableHelper.dispose(this.f104125c);
        AutoDisposableHelper.dispose(this.f104124b);
    }

    @Override // ah.d
    public l0<? super T> e() {
        return this.f104127e;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f104124b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        if (isDisposed()) {
            return;
        }
        this.f104124b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104125c);
        this.f104127e.onError(th2);
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        a aVar = new a();
        if (g.c(this.f104125c, aVar, q.class)) {
            this.f104127e.onSubscribe(this);
            this.f104126d.d(aVar);
            g.c(this.f104124b, bVar, q.class);
        }
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        if (isDisposed()) {
            return;
        }
        this.f104124b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104125c);
        this.f104127e.onSuccess(t10);
    }
}
