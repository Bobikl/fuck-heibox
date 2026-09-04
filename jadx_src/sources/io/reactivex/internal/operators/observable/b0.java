package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableDoOnLifecycle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b0<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh.g<? super io.reactivex.disposables.b> f122802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kh.a f122803d;

    public b0(io.reactivex.z<T> zVar, kh.g<? super io.reactivex.disposables.b> gVar, kh.a aVar) {
        super(zVar);
        this.f122802c = gVar;
        this.f122803d = aVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new io.reactivex.internal.observers.g(g0Var, this.f122802c, this.f122803d));
    }
}
