package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> implements Collection<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final T[] f124614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f124615c;

    public h(@dl.d T[] values, boolean z10) {
        kotlin.jvm.internal.f0.p(values, "values");
        this.f124614b = values;
        this.f124615c = z10;
    }

    public int a() {
        return this.f124614b.length;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @dl.d
    public final T[] b() {
        return this.f124614b;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return ArraysKt___ArraysKt.T8(this.f124614b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.f124615c;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f124614b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return kotlin.jvm.internal.h.a(this.f124614b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    @dl.d
    public final Object[] toArray() {
        return s.h(this.f124614b, this.f124615c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
