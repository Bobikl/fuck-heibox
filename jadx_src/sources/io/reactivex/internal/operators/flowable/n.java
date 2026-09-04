package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ErrorMode;

/* JADX INFO: compiled from: FlowableConcatMapPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class n<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f121267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f121268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ErrorMode f121270f;

    public n(org.reactivestreams.c<T> cVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, ErrorMode errorMode) {
        this.f121267c = cVar;
        this.f121268d = oVar;
        this.f121269e = i10;
        this.f121270f = errorMode;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        if (v0.b(this.f121267c, dVar, this.f121268d)) {
            return;
        }
        this.f121267c.g(FlowableConcatMap.M8(dVar, this.f121268d, this.f121269e, this.f121270f));
    }
}
