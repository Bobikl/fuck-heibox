package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n*L\n712#1:1851,3\n*E\n"})
public final class ScatterMap$MapWrapper$entries$1<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScatterMap<K, V> f3493b;

    ScatterMap$MapWrapper$entries$1(ScatterMap<K, V> scatterMap) {
        this.f3493b = scatterMap;
    }

    public boolean a(Map.Entry<? extends K, ? extends V> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(@dl.d Map.Entry<? extends K, ? extends V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return kotlin.jvm.internal.f0.g(this.f3493b.p(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        ScatterMap<K, V> scatterMap = this.f3493b;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!kotlin.jvm.internal.f0.g(scatterMap.p((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f3493b.f3491e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f3493b.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return kotlin.sequences.q.a(new ScatterMap$MapWrapper$entries$1$iterator$1(this.f3493b, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
