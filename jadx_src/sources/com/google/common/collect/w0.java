package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingNavigableMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class w0<K, V> extends c1<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: compiled from: ForwardingNavigableMap.java */
    @o9.a
    public class a extends Maps.p<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.w0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ForwardingNavigableMap.java */
        public class C0467a implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @CheckForNull
            private Map.Entry<K, V> f58213b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            private Map.Entry<K, V> f58214c;

            C0467a() {
                this.f58214c = a.this.X0().lastEntry();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.f58214c;
                if (entry == null) {
                    throw new NoSuchElementException();
                }
                this.f58213b = entry;
                this.f58214c = a.this.X0().lowerEntry(this.f58214c.getKey());
                return entry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f58214c != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f58213b == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                a.this.X0().remove(this.f58213b.getKey());
                this.f58213b = null;
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.Maps.p
        protected Iterator<Map.Entry<K, V>> W0() {
            return new C0467a();
        }

        @Override // com.google.common.collect.Maps.p
        NavigableMap<K, V> X0() {
            return w0.this;
        }
    }

    /* JADX INFO: compiled from: ForwardingNavigableMap.java */
    @o9.a
    public class b extends Maps.c0<K, V> {
        public b(w0 w0Var) {
            super(w0Var);
        }
    }

    protected w0() {
    }

    @Override // com.google.common.collect.c1
    protected SortedMap<K, V> W0(@x1 K k10, @x1 K k11) {
        return subMap(k10, true, k11, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.c1
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> X0();

    @CheckForNull
    protected Map.Entry<K, V> a1(@x1 K k10) {
        return tailMap(k10, true).firstEntry();
    }

    @CheckForNull
    protected K b1(@x1 K k10) {
        return (K) Maps.T(ceilingEntry(k10));
    }

    @o9.a
    protected NavigableSet<K> c1() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@x1 K k10) {
        return H0().ceilingEntry(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@x1 K k10) {
        return H0().ceilingKey(k10);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return H0().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return H0().descendingMap();
    }

    @CheckForNull
    protected Map.Entry<K, V> e1() {
        return (Map.Entry) l1.v(entrySet(), null);
    }

    protected K f1() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return H0().firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@x1 K k10) {
        return H0().floorEntry(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@x1 K k10) {
        return H0().floorKey(k10);
    }

    @CheckForNull
    protected Map.Entry<K, V> g1(@x1 K k10) {
        return headMap(k10, true).lastEntry();
    }

    @CheckForNull
    protected K h1(@x1 K k10) {
        return (K) Maps.T(floorEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@x1 K k10, boolean z10) {
        return H0().headMap(k10, z10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@x1 K k10) {
        return H0().higherEntry(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@x1 K k10) {
        return H0().higherKey(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return H0().lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@x1 K k10) {
        return H0().lowerEntry(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@x1 K k10) {
        return H0().lowerKey(k10);
    }

    protected SortedMap<K, V> m1(@x1 K k10) {
        return headMap(k10, false);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return H0().navigableKeySet();
    }

    @CheckForNull
    protected Map.Entry<K, V> o1(@x1 K k10) {
        return tailMap(k10, false).firstEntry();
    }

    @CheckForNull
    protected K p1(@x1 K k10) {
        return (K) Maps.T(higherEntry(k10));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return H0().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return H0().pollLastEntry();
    }

    @CheckForNull
    protected Map.Entry<K, V> q1() {
        return (Map.Entry) l1.v(descendingMap().entrySet(), null);
    }

    protected K r1() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    protected Map.Entry<K, V> s1(@x1 K k10) {
        return headMap(k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
        return H0().subMap(k10, z10, k11, z11);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@x1 K k10, boolean z10) {
        return H0().tailMap(k10, z10);
    }

    @CheckForNull
    protected K u1(@x1 K k10) {
        return (K) Maps.T(lowerEntry(k10));
    }

    @CheckForNull
    protected Map.Entry<K, V> v1() {
        return (Map.Entry) Iterators.U(entrySet().iterator());
    }

    @CheckForNull
    protected Map.Entry<K, V> w1() {
        return (Map.Entry) Iterators.U(descendingMap().entrySet().iterator());
    }

    protected SortedMap<K, V> x1(@x1 K k10) {
        return tailMap(k10, true);
    }
}
