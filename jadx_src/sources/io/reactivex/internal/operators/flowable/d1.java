package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableTakePublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d1<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f121083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121084d;

    public d1(org.reactivestreams.c<T> cVar, long j10) {
        this.f121083c = cVar;
        this.f121084d = j10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121083c.g(new FlowableTake.TakeSubscriber(dVar, this.f121084d));
    }
}
