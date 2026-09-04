package io.reactivex.internal.operators.parallel;

/* JADX INFO: compiled from: ParallelFromArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.c<T>[] f123309a;

    public f(org.reactivestreams.c<T>[] cVarArr) {
        this.f123309a = cVarArr;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123309a.length;
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f123309a[i10].g(dVarArr[i10]);
            }
        }
    }
}
