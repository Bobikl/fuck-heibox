package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableMapPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class q0<T, U> extends io.reactivex.j<U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f121301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends U> f121302d;

    public q0(org.reactivestreams.c<T> cVar, kh.o<? super T, ? extends U> oVar) {
        this.f121301c = cVar;
        this.f121302d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        this.f121301c.g(new p0.b(dVar, this.f121302d));
    }
}
