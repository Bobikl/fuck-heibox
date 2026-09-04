package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public final class AsyncSubscription extends AtomicLong implements e, b {
    private static final long serialVersionUID = 7028635084060361255L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<e> f123835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<b> f123836c;

    public AsyncSubscription() {
        this.f123836c = new AtomicReference<>();
        this.f123835b = new AtomicReference<>();
    }

    public AsyncSubscription(b bVar) {
        this();
        this.f123836c.lazySet(bVar);
    }

    public boolean a(b bVar) {
        return DisposableHelper.replace(this.f123836c, bVar);
    }

    public boolean b(b bVar) {
        return DisposableHelper.set(this.f123836c, bVar);
    }

    public void c(e eVar) {
        SubscriptionHelper.deferredSetOnce(this.f123835b, this, eVar);
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this.f123835b);
        DisposableHelper.dispose(this.f123836c);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123835b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f123835b, this, j10);
    }
}
