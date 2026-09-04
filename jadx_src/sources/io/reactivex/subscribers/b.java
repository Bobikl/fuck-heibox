package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<T> implements o<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.e> f124169b = new AtomicReference<>();

    protected final void a() {
        dispose();
    }

    protected void b() {
        this.f124169b.get().request(Long.MAX_VALUE);
    }

    protected final void c(long j10) {
        this.f124169b.get().request(j10);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        SubscriptionHelper.cancel(this.f124169b);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f124169b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (f.d(this.f124169b, eVar, getClass())) {
            b();
        }
    }
}
