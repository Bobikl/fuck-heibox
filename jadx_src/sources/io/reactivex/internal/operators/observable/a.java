package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: AbstractObservableWithUpstream.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T, U> extends io.reactivex.z<U> implements lh.g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.reactivex.e0<T> f122785b;

    a(io.reactivex.e0<T> e0Var) {
        this.f122785b = e0Var;
    }

    @Override // lh.g
    public final io.reactivex.e0<T> source() {
        return this.f122785b;
    }
}
