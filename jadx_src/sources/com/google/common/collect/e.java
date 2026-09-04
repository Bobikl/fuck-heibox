package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractNavigableMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class e<K, V> extends Maps.y<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: compiled from: AbstractNavigableMap.java */
    public final class b extends Maps.p<K, V> {
        private b() {
        }

        @Override // com.google.common.collect.Maps.p
        Iterator<Map.Entry<K, V>> W0() {
            return e.this.b();
        }

        @Override // com.google.common.collect.Maps.p
        NavigableMap<K, V> X0() {
            return e.this;
        }
    }

    e() {
    }

    abstract Iterator<Map.Entry<K, V>> b();

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@x1 K k10) {
        return tailMap(k10, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@x1 K k10) {
        return (K) Maps.T(ceilingEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.J(a(), null);
    }

    @Override // java.util.SortedMap
    @x1
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@x1 K k10) {
        return headMap(k10, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@x1 K k10) {
        return (K) Maps.T(floorEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@x1 K k10) {
        return headMap(k10, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@x1 K k10) {
        return tailMap(k10, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@x1 K k10) {
        return (K) Maps.T(higherEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.J(b(), null);
    }

    @Override // java.util.SortedMap
    @x1
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@x1 K k10) {
        return headMap(k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@x1 K k10) {
        return (K) Maps.T(lowerEntry(k10));
    }

    public NavigableSet<K> navigableKeySet() {
        return new Maps.c0(this);
    }

    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.U(a());
    }

    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.U(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
        return subMap(k10, true, k11, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@x1 K k10) {
        return tailMap(k10, true);
    }
}
