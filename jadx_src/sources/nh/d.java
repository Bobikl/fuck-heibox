package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.f;
import kotlin.jvm.internal.f0;
import zh.h;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<E> extends f<E> implements Set<E>, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final MapBuilder<E, ?> f132100b;

    public d(@dl.d MapBuilder<E, ?> backing) {
        f0.p(backing, "backing");
        this.f132100b = backing;
    }

    @Override // kotlin.collections.f
    public int a() {
        return this.f132100b.size();
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f132100b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f132100b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f132100b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<E> iterator() {
        return this.f132100b.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f132100b.P(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132100b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f132100b.l();
        return super.retainAll(elements);
    }
}
