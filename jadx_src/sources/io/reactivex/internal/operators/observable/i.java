package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ObservableAutoConnect.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.observables.a<? extends T> f122913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f122914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f122915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicInteger f122916e = new AtomicInteger();

    public i(io.reactivex.observables.a<? extends T> aVar, int i10, kh.g<? super io.reactivex.disposables.b> gVar) {
        this.f122913b = aVar;
        this.f122914c = i10;
        this.f122915d = gVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122913b.g(g0Var);
        if (this.f122916e.incrementAndGet() == this.f122914c) {
            this.f122913b.l8(this.f122915d);
        }
    }
}
