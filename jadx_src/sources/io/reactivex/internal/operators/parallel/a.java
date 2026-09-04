package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import kh.o;

/* JADX INFO: compiled from: ParallelConcatMap.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T, R> extends io.reactivex.parallel.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends org.reactivestreams.c<? extends R>> f123270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f123271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f123272d;

    public a(io.reactivex.parallel.a<T> aVar, o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, ErrorMode errorMode) {
        this.f123269a = aVar;
        this.f123270b = (o) io.reactivex.internal.functions.a.g(oVar, "mapper");
        this.f123271c = i10;
        this.f123272d = (ErrorMode) io.reactivex.internal.functions.a.g(errorMode, "errorMode");
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123269a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super R>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVarArr2[i10] = FlowableConcatMap.M8(dVarArr[i10], this.f123270b, this.f123271c, this.f123272d);
            }
            this.f123269a.Q(dVarArr2);
        }
    }
}
