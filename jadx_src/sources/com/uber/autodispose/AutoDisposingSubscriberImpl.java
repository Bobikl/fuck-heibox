package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoDisposingSubscriberImpl<T> extends AtomicInteger implements ah.e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.e> f104048b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f104049c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicThrowable f104050d = new AtomicThrowable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<org.reactivestreams.e> f104051e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f104052f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.reactivex.g f104053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final org.reactivestreams.d<? super T> f104054h;

    public class a extends io.reactivex.observers.b {
        a() {
        }

        @Override // io.reactivex.d
        public void onComplete() {
            AutoDisposingSubscriberImpl.this.f104049c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoSubscriptionHelper.cancel(AutoDisposingSubscriberImpl.this.f104048b);
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            AutoDisposingSubscriberImpl.this.f104049c.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposingSubscriberImpl.this.onError(th2);
        }
    }

    AutoDisposingSubscriberImpl(io.reactivex.g gVar, org.reactivestreams.d<? super T> dVar) {
        this.f104053g = gVar;
        this.f104054h = dVar;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        AutoDisposableHelper.dispose(this.f104049c);
        AutoSubscriptionHelper.cancel(this.f104048b);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        cancel();
    }

    @Override // ah.e
    public org.reactivestreams.d<? super T> i() {
        return this.f104054h;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f104048b.get() == AutoSubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.f104048b.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.f104049c);
        t.b(this.f104054h, this, this.f104050d);
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (isDisposed()) {
            return;
        }
        this.f104048b.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.f104049c);
        t.d(this.f104054h, th2, this, this.f104050d);
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (isDisposed() || !t.f(this.f104054h, t10, this, this.f104050d)) {
            return;
        }
        this.f104048b.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.f104049c);
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        a aVar = new a();
        if (g.c(this.f104049c, aVar, AutoDisposingSubscriberImpl.class)) {
            this.f104054h.onSubscribe(this);
            this.f104053g.d(aVar);
            if (g.d(this.f104048b, eVar, AutoDisposingSubscriberImpl.class)) {
                AutoSubscriptionHelper.deferredSetOnce(this.f104051e, this.f104052f, eVar);
            }
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        AutoSubscriptionHelper.deferredRequest(this.f104051e, this.f104052f, j10);
    }
}
