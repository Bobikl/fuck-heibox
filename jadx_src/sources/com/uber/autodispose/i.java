package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposeMaybe.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.w<T> f104097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.g f104098c;

    i(io.reactivex.w<T> wVar, io.reactivex.g gVar) {
        this.f104097b = wVar;
        this.f104098c = gVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f104097b.f(new p(this.f104098c, tVar));
    }
}
