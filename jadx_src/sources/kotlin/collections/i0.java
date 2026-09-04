package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0<T> implements Iterable<h0<? extends T>>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<Iterator<T>> f124625b;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(@dl.d yh.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.f0.p(iteratorFactory, "iteratorFactory");
        this.f124625b = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<h0<T>> iterator() {
        return new j0(this.f124625b.invoke());
    }
}
