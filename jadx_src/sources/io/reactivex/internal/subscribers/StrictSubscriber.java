package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class StrictSubscriber<T> extends AtomicInteger implements o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.d<? super T> f123784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicThrowable f123785c = new AtomicThrowable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f123786d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.e> f123787e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f123788f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f123789g;

    public StrictSubscriber(org.reactivestreams.d<? super T> dVar) {
        this.f123784b = dVar;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        if (this.f123789g) {
            return;
        }
        SubscriptionHelper.cancel(this.f123787e);
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        this.f123789g = true;
        io.reactivex.internal.util.g.b(this.f123784b, this, this.f123785c);
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        this.f123789g = true;
        io.reactivex.internal.util.g.d(this.f123784b, th2, this, this.f123785c);
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.util.g.f(this.f123784b, t10, this, this.f123785c);
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (this.f123788f.compareAndSet(false, true)) {
            this.f123784b.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f123787e, this.f123786d, eVar);
        } else {
            eVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.f123787e, this.f123786d, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
