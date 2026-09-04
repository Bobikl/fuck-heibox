package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j0<T> implements Iterator<h0<? extends T>>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Iterator<T> f124626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124627c;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@dl.d Iterator<? extends T> iterator) {
        kotlin.jvm.internal.f0.p(iterator, "iterator");
        this.f124626b = iterator;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h0<T> next() {
        int i10 = this.f124627c;
        this.f124627c = i10 + 1;
        if (i10 < 0) {
            CollectionsKt__CollectionsKt.W();
        }
        return new h0<>(i10, this.f124626b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f124626b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
