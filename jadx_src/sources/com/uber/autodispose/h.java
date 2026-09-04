package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposeFlowable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.reactivestreams.c<T> f104095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.reactivex.g f104096d;

    h(org.reactivestreams.c<T> cVar, io.reactivex.g gVar) {
        this.f104095c = cVar;
        this.f104096d = gVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f104095c.g(new AutoDisposingSubscriberImpl(this.f104096d, dVar));
    }
}
