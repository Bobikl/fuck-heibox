package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposeParallelFlowable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.reactivex.parallel.a<T> f104101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.g f104102b;

    k(io.reactivex.parallel.a<T> aVar, io.reactivex.g gVar) {
        this.f104101a = aVar;
        this.f104102b = gVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f104101a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[dVarArr.length];
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                dVarArr2[i10] = new AutoDisposingSubscriberImpl(this.f104102b, dVarArr[i10]);
            }
            this.f104101a.Q(dVarArr2);
        }
    }
}
