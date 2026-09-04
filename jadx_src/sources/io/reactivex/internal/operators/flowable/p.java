package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableDefer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.c<? extends T>> f121282c;

    public p(Callable<? extends org.reactivestreams.c<? extends T>> callable) {
        this.f121282c = callable;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            ((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f121282c.call(), "The publisher supplied is null")).g(dVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
