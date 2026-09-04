package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* JADX INFO: compiled from: FlowableEmpty.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends io.reactivex.j<Object> implements lh.m<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.reactivex.j<Object> f121040c = new a0();

    private a0() {
    }

    @Override // lh.m, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Object> dVar) {
        EmptySubscription.complete(dVar);
    }
}
