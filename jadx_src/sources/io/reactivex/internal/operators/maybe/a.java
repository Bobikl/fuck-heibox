package io.reactivex.internal.operators.maybe;

/* JADX INFO: compiled from: AbstractMaybeWithUpstream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a<T, R> extends io.reactivex.q<R> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.reactivex.w<T> f121618b;

    a(io.reactivex.w<T> wVar) {
        this.f121618b = wVar;
    }

    @Override // lh.f
    public final io.reactivex.w<T> source() {
        return this.f121618b;
    }
}
