package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* JADX INFO: compiled from: FlowableNever.java */
/* JADX INFO: loaded from: classes12.dex */
public final class r0 extends io.reactivex.j<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.reactivex.j<Object> f121308c = new r0();

    private r0() {
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Object> dVar) {
        dVar.onSubscribe(EmptySubscription.INSTANCE);
    }
}
