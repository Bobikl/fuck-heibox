package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n*L\n749#1:1851,3\n*E\n"})
public final class ScatterMap$MapWrapper$values$1<V> implements Collection<V>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScatterMap<K, V> f3515b;

    ScatterMap$MapWrapper$values$1(ScatterMap<K, V> scatterMap) {
        this.f3515b = scatterMap;
    }

    public int a() {
        return this.f3515b.f3491e;
    }

    @Override // java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f3515b.h((V) obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        ScatterMap<K, V> scatterMap = this.f3515b;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!scatterMap.h((V) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f3515b.x();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<V> iterator() {
        return kotlin.sequences.q.a(new ScatterMap$MapWrapper$values$1$iterator$1(this.f3515b, null));
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
    public boolean removeIf(Predicate<? super V> predicate) {
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
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
