package nh;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e<V> extends kotlin.collections.c<V> implements Collection<V>, zh.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final MapBuilder<?, V> f132101b;

    public e(@dl.d MapBuilder<?, V> backing) {
        f0.p(backing, "backing");
        this.f132101b = backing;
    }

    @Override // kotlin.collections.c
    public int a() {
        return this.f132101b.size();
    }

    @Override // kotlin.collections.c, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@dl.d Collection<? extends V> elements) {
        f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @dl.d
    public final MapBuilder<?, V> b() {
        return this.f132101b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f132101b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f132101b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f132101b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<V> iterator() {
        return this.f132101b.V();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f132101b.U(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132101b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132101b.l();
        return super.retainAll(elements);
    }
}
