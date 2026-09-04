package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableFlatMapPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d0<T, U> extends io.reactivex.j<U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f121078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> f121079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f121080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f121082g;

    public d0(org.reactivestreams.c<T> cVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, boolean z10, int i10, int i11) {
        this.f121078c = cVar;
        this.f121079d = oVar;
        this.f121080e = z10;
        this.f121081f = i10;
        this.f121082g = i11;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        if (v0.b(this.f121078c, dVar, this.f121079d)) {
            return;
        }
        this.f121078c.g(FlowableFlatMap.M8(dVar, this.f121079d, this.f121080e, this.f121081f, this.f121082g));
    }
}
