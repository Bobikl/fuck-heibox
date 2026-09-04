package kotlin.collections;

import java.util.List;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y0<T> extends d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<T> f124654b;

    public y0(@dl.d List<T> delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.f124654b = delegate;
    }

    @Override // kotlin.collections.d
    public int a() {
        return this.f124654b.size();
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        this.f124654b.add(y.Z0(this, i10), t10);
    }

    @Override // kotlin.collections.d
    public T b(int i10) {
        return this.f124654b.remove(y.Y0(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f124654b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f124654b.get(y.Y0(this, i10));
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        return this.f124654b.set(y.Y0(this, i10), t10);
    }
}
