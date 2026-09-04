package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResourceSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> implements o<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<org.reactivestreams.e> f124170b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.internal.disposables.b f124171c = new io.reactivex.internal.disposables.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f124172d = new AtomicLong();

    public final void a(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f124171c.c(bVar);
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j10) {
        SubscriptionHelper.deferredRequest(this.f124170b, this.f124172d, j10);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (SubscriptionHelper.cancel(this.f124170b)) {
            this.f124171c.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f124170b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (f.d(this.f124170b, eVar, getClass())) {
            long andSet = this.f124172d.getAndSet(0L);
            if (andSet != 0) {
                eVar.request(andSet);
            }
            b();
        }
    }
}
