package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ErrorMode;

/* JADX INFO: compiled from: FlowableConcatMapEagerPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class m<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f121258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f121259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ErrorMode f121262g;

    public m(org.reactivestreams.c<T> cVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, int i11, ErrorMode errorMode) {
        this.f121258c = cVar;
        this.f121259d = oVar;
        this.f121260e = i10;
        this.f121261f = i11;
        this.f121262g = errorMode;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121258c.g(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(dVar, this.f121259d, this.f121260e, this.f121261f, this.f121262g));
    }
}
