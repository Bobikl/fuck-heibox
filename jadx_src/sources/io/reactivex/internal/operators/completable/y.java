package io.reactivex.internal.operators.completable;

/* JADX INFO: compiled from: CompletableToFlowable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class y<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f119863c;

    public y(io.reactivex.g gVar) {
        this.f119863c = gVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f119863c.d(new io.reactivex.internal.observers.p(dVar));
    }
}
