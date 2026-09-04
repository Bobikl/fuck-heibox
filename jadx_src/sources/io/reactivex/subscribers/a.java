package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import io.reactivex.o;

/* JADX INFO: compiled from: DefaultSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> implements o<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    org.reactivestreams.e f124168b;

    protected final void a() {
        org.reactivestreams.e eVar = this.f124168b;
        this.f124168b = SubscriptionHelper.CANCELLED;
        eVar.cancel();
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j10) {
        org.reactivestreams.e eVar = this.f124168b;
        if (eVar != null) {
            eVar.request(j10);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (f.f(this.f124168b, eVar, getClass())) {
            this.f124168b = eVar;
            b();
        }
    }
}
