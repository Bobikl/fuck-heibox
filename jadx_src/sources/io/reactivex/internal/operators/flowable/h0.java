package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableFromPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h0<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f121125c;

    public h0(org.reactivestreams.c<? extends T> cVar) {
        this.f121125c = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121125c.g(dVar);
    }
}
