package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.o;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class BlockingSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T>, org.reactivestreams.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f123752c = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Queue<Object> f123753b;

    public BlockingSubscriber(Queue<Object> queue) {
        this.f123753b = queue;
    }

    public boolean a() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.f123753b.offer(f123752c);
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        this.f123753b.offer(NotificationLite.complete());
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        this.f123753b.offer(NotificationLite.error(th2));
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        this.f123753b.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.setOnce(this, eVar)) {
            this.f123753b.offer(NotificationLite.subscription(this));
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        get().request(j10);
    }
}
