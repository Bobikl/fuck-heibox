package kotlin.collections;

import java.util.List;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes5.dex */
public class z0<T> extends b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<T> f124655b;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(@dl.d List<? extends T> delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.f124655b = delegate;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i10) {
        return this.f124655b.get(y.Y0(this, i10));
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getF140741e() {
        return this.f124655b.size();
    }
}
