package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FlowableAutoConnect.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.flowables.a<? extends T> f121111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f121112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f121113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicInteger f121114f = new AtomicInteger();

    public g(io.reactivex.flowables.a<? extends T> aVar, int i10, kh.g<? super io.reactivex.disposables.b> gVar) {
        this.f121111c = aVar;
        this.f121112d = i10;
        this.f121113e = gVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121111c.g(dVar);
        if (this.f121114f.incrementAndGet() == this.f121112d) {
            this.f121111c.Q8(this.f121113e);
        }
    }
}
