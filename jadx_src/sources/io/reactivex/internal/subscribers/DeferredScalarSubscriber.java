package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements o<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected org.reactivestreams.e f123761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f123762m;

    public DeferredScalarSubscriber(org.reactivestreams.d<? super R> dVar) {
        super(dVar);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
    public void cancel() {
        super.cancel();
        this.f123761l.cancel();
    }

    public void onComplete() {
        if (this.f123762m) {
            c(this.f123846c);
        } else {
            this.f123845b.onComplete();
        }
    }

    public void onError(Throwable th2) {
        this.f123846c = null;
        this.f123845b.onError(th2);
    }

    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f123761l, eVar)) {
            this.f123761l = eVar;
            this.f123845b.onSubscribe(this);
            eVar.request(Long.MAX_VALUE);
        }
    }
}
