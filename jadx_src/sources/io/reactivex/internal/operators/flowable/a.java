package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: AbstractFlowableWithUpstream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a<T, R> extends io.reactivex.j<R> implements lh.h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final io.reactivex.j<T> f121039c;

    a(io.reactivex.j<T> jVar) {
        this.f121039c = (io.reactivex.j) io.reactivex.internal.functions.a.g(jVar, "source is null");
    }

    @Override // lh.h
    public final org.reactivestreams.c<T> source() {
        return this.f121039c;
    }
}
