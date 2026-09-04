package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposeCompletable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.a f104093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.g f104094c;

    e(io.reactivex.a aVar, io.reactivex.g gVar) {
        this.f104093b = aVar;
        this.f104094c = gVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f104093b.d(new o(this.f104094c, dVar));
    }
}
