package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import kh.o;

/* JADX INFO: compiled from: ParallelFlatMap.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T, R> extends io.reactivex.parallel.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends org.reactivestreams.c<? extends R>> f123305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f123306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f123307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f123308e;

    public e(io.reactivex.parallel.a<T> aVar, o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10, int i10, int i11) {
        this.f123304a = aVar;
        this.f123305b = oVar;
        this.f123306c = z10;
        this.f123307d = i10;
        this.f123308e = i11;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123304a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super R>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVarArr2[i10] = FlowableFlatMap.M8(dVarArr[i10], this.f123305b, this.f123306c, this.f123307d, this.f123308e);
            }
            this.f123304a.Q(dVarArr2);
        }
    }
}
