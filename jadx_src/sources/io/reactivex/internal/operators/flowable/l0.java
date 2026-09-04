package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.ScalarSubscription;

/* JADX INFO: compiled from: FlowableJust.java */
/* JADX INFO: loaded from: classes12.dex */
public final class l0<T> extends io.reactivex.j<T> implements lh.m<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f121257c;

    public l0(T t10) {
        this.f121257c = t10;
    }

    @Override // lh.m, java.util.concurrent.Callable
    public T call() {
        return this.f121257c;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        dVar.onSubscribe(new ScalarSubscription(dVar, this.f121257c));
    }
}
