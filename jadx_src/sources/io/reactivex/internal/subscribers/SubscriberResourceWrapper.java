package io.reactivex.internal.subscribers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<io.reactivex.disposables.b> implements o<T>, io.reactivex.disposables.b, org.reactivestreams.e {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.d<? super T> f123790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.e> f123791c = new AtomicReference<>();

    public SubscriberResourceWrapper(org.reactivestreams.d<? super T> dVar) {
        this.f123790b = dVar;
    }

    public void a(io.reactivex.disposables.b bVar) {
        DisposableHelper.set(this, bVar);
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this.f123791c);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123791c.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.f123790b.onComplete();
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        DisposableHelper.dispose(this);
        this.f123790b.onError(th2);
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        this.f123790b.onNext(t10);
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.setOnce(this.f123791c, eVar)) {
            this.f123790b.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            this.f123791c.get().request(j10);
        }
    }
}
