package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final MapBuilder<K, V> f132099b;

    public c(@dl.d MapBuilder<K, V> backing) {
        f0.p(backing, "backing");
        this.f132099b = backing;
    }

    @Override // kotlin.collections.f
    public int a() {
        return this.f132099b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@dl.d Collection<? extends Map.Entry<K, V>> elements) {
        f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f132099b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        return this.f132099b.p(elements);
    }

    @Override // nh.a
    public boolean e(@dl.d Map.Entry<? extends K, ? extends V> element) {
        f0.p(element, "element");
        return this.f132099b.r(element);
    }

    @Override // nh.a
    public boolean g(@dl.d Map.Entry element) {
        f0.p(element, "element");
        return this.f132099b.N(element);
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(@dl.d Map.Entry<K, V> element) {
        f0.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @dl.d
    public final MapBuilder<K, V> i() {
        return this.f132099b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f132099b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f132099b.x();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132099b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132099b.l();
        return super.retainAll(elements);
    }
}
