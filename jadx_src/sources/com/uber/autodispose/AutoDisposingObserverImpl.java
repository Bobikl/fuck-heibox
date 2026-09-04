package com.uber.autodispose;

import io.reactivex.g0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoDisposingObserverImpl<T> extends AtomicInteger implements ah.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104042b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104043c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicThrowable f104044d = new AtomicThrowable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.reactivex.g f104045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0<? super T> f104046f;

    public class a extends io.reactivex.observers.b {
        a() {
        }

        @Override // io.reactivex.d
        public void onComplete() {
            AutoDisposingObserverImpl.this.f104043c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(AutoDisposingObserverImpl.this.f104042b);
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            AutoDisposingObserverImpl.this.f104043c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposingObserverImpl.this.onError(th2);
        }
    }

    AutoDisposingObserverImpl(io.reactivex.g gVar, g0<? super T> g0Var) {
        this.f104045e = gVar;
        this.f104046f = g0Var;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AutoDisposableHelper.dispose(this.f104043c);
        AutoDisposableHelper.dispose(this.f104042b);
    }

    @Override // ah.c
    public g0<? super T> e() {
        return this.f104046f;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f104042b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.f104042b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104043c);
        t.a(this.f104046f, this, this.f104044d);
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (isDisposed()) {
            return;
        }
        this.f104042b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104043c);
        t.c(this.f104046f, th2, this, this.f104044d);
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (isDisposed() || !t.e(this.f104046f, t10, this, this.f104044d)) {
            return;
        }
        this.f104042b.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f104043c);
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        a aVar = new a();
        if (g.c(this.f104043c, aVar, AutoDisposingObserverImpl.class)) {
            this.f104046f.onSubscribe(this);
            this.f104045e.d(aVar);
            g.c(this.f104042b, bVar, AutoDisposingObserverImpl.class);
        }
    }
}
