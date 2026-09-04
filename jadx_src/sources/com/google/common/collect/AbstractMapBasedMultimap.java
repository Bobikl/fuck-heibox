package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.c<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Map<K, Collection<V>> f57031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f57032h;

    public class a extends AbstractMapBasedMultimap<K, V>.d<V> {
        a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        @x1
        V a(@x1 K k10, @x1 V v10) {
            return v10;
        }
    }

    public class b extends AbstractMapBasedMultimap<K, V>.d<Map.Entry<K, V>> {
        b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@x1 K k10, @x1 V v10) {
            return Maps.O(k10, v10);
        }
    }

    public class c extends Maps.n0<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final transient Map<K, Collection<V>> f57033e;

        public class a extends Maps.q<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return com.google.common.collect.o.j(c.this.f57033e.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, Collection<V>> h() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.C(entry.getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f57036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            Collection<V> f57037c;

            b() {
                this.f57036b = c.this.f57033e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f57036b.next();
                this.f57037c = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57036b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.w.h0(this.f57037c != null, "no calls to next() since the last call to remove()");
                this.f57036b.remove();
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, this.f57037c.size());
                this.f57037c.clear();
                this.f57037c = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f57033e = map;
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f57033e == AbstractMapBasedMultimap.this.f57031g) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.h(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return Maps.o0(this.f57033e, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object obj) {
            Collection<V> collection = (Collection) Maps.p0(this.f57033e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.F(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object obj) {
            Collection<V> collectionRemove = this.f57033e.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionU = AbstractMapBasedMultimap.this.u();
            collectionU.addAll(collectionRemove);
            AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionU;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f57033e.equals(obj);
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.O(key, AbstractMapBasedMultimap.this.F(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f57033e.hashCode();
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57033e.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f57033e.toString();
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f57039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        K f57040c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        Collection<V> f57041d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Iterator<V> f57042e = Iterators.w();

        d() {
            this.f57039b = AbstractMapBasedMultimap.this.f57031g.entrySet().iterator();
        }

        abstract T a(@x1 K k10, @x1 V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57039b.hasNext() || this.f57042e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f57042e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f57039b.next();
                this.f57040c = next.getKey();
                Collection<V> value = next.getValue();
                this.f57041d = value;
                this.f57042e = value.iterator();
            }
            return a(t1.a(this.f57040c), this.f57042e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f57042e.remove();
            Collection<V> collection = this.f57041d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f57039b.remove();
            }
            AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this);
        }
    }

    public class e extends Maps.z<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @CheckForNull
            Map.Entry<K, Collection<V>> f57045b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f57046c;

            a(Iterator it) {
                this.f57046c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57046c.hasNext();
            }

            @Override // java.util.Iterator
            @x1
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f57046c.next();
                this.f57045b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.w.h0(this.f57045b != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f57045b.getValue();
                this.f57046c.remove();
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f57045b = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.h(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || i().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return i().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(i().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int size;
            Collection<V> collectionRemove = i().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class f extends AbstractMapBasedMultimap<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> ceilingEntry(@x1 K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@x1 K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> floorEntry(@x1 K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@x1 K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@x1 K k10, boolean z10) {
            return new f(i().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> higherEntry(@x1 K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@x1 K k10) {
            return i().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(@x1 K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, com.google.common.collect.AbstractMapBasedMultimap.c, com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return (NavigableSet) super.h();
        }

        @CheckForNull
        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionU = AbstractMapBasedMultimap.this.u();
            collectionU.addAll(next.getValue());
            it.remove();
            return Maps.O(next.getKey(), AbstractMapBasedMultimap.this.E(collectionU));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lowerEntry(@x1 K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@x1 K k10) {
            return i().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(@x1 K k10, @x1 K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(@x1 K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return new f(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@x1 K k10, boolean z10) {
            return new f(i().tailMap(k10, z10));
        }
    }

    public class g extends AbstractMapBasedMultimap<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(@x1 K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(i().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(@x1 K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@x1 K k10, boolean z10) {
            return new g(i().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(@x1 K k10) {
            return i().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(@x1 K k10) {
            return headSet(k10, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(@x1 K k10) {
            return i().lowerKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(@x1 K k10, @x1 K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(@x1 K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) Iterators.U(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) Iterators.U(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return new g(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@x1 K k10, boolean z10) {
            return new g(i().tailMap(k10, z10));
        }
    }

    public class h extends AbstractMapBasedMultimap<K, V>.l implements RandomAccess {
        h(@x1 AbstractMapBasedMultimap abstractMapBasedMultimap, K k10, @CheckForNull List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    public class i extends AbstractMapBasedMultimap<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        SortedSet<K> f57050g;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        @x1
        public K firstKey() {
            return i().firstKey();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.n0
        public SortedSet<K> g() {
            return new j(i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c, com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            SortedSet<K> sortedSet = this.f57050g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f57050g = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(@x1 K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f57033e;
        }

        @Override // java.util.SortedMap
        @x1
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@x1 K k10, @x1 K k11) {
            return new i(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(@x1 K k10) {
            return new i(i().tailMap(k10));
        }
    }

    public class j extends AbstractMapBasedMultimap<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedSet
        @x1
        public K first() {
            return i().firstKey();
        }

        public SortedSet<K> headSet(@x1 K k10) {
            return new j(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) super.i();
        }

        @Override // java.util.SortedSet
        @x1
        public K last() {
            return i().lastKey();
        }

        public SortedSet<K> subSet(@x1 K k10, @x1 K k11) {
            return new j(i().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(@x1 K k10) {
            return new j(i().tailMap(k10));
        }
    }

    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f57053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection<V> f57054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        final AbstractMapBasedMultimap<K, V>.k f57055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        final Collection<V> f57056e;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator<V> f57058b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Collection<V> f57059c;

            a() {
                Collection<V> collection = k.this.f57054c;
                this.f57059c = collection;
                this.f57058b = AbstractMapBasedMultimap.B(collection);
            }

            a(Iterator<V> it) {
                this.f57059c = k.this.f57054c;
                this.f57058b = it;
            }

            Iterator<V> a() {
                b();
                return this.f57058b;
            }

            void b() {
                k.this.h();
                if (k.this.f57054c != this.f57059c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f57058b.hasNext();
            }

            @Override // java.util.Iterator
            @x1
            public V next() {
                b();
                return this.f57058b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f57058b.remove();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this);
                k.this.i();
            }
        }

        k(K k10, @CheckForNull Collection<V> collection, AbstractMapBasedMultimap<K, V>.k kVar) {
            this.f57053b = k10;
            this.f57054c = collection;
            this.f57055d = kVar;
            this.f57056e = kVar == null ? null : kVar.e();
        }

        void a() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f57055d;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractMapBasedMultimap.this.f57031g.put(this.f57053b, this.f57054c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@x1 V v10) {
            h();
            boolean zIsEmpty = this.f57054c.isEmpty();
            boolean zAdd = this.f57054c.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f57054c.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, this.f57054c.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @CheckForNull
        AbstractMapBasedMultimap<K, V>.k b() {
            return this.f57055d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f57054c.clear();
            AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, size);
            i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            h();
            return this.f57054c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            h();
            return this.f57054c.containsAll(collection);
        }

        Collection<V> e() {
            return this.f57054c;
        }

        @Override // java.util.Collection
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f57054c.equals(obj);
        }

        @x1
        K g() {
            return this.f57053b;
        }

        void h() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.k kVar = this.f57055d;
            if (kVar != null) {
                kVar.h();
                if (this.f57055d.e() != this.f57056e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f57054c.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f57031g.get(this.f57053b)) == null) {
                    return;
                }
                this.f57054c = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            h();
            return this.f57054c.hashCode();
        }

        void i() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f57055d;
            if (kVar != null) {
                kVar.i();
            } else if (this.f57054c.isEmpty()) {
                AbstractMapBasedMultimap.this.f57031g.remove(this.f57053b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            h();
            boolean zRemove = this.f57054c.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this);
                i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f57054c.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, this.f57054c.size() - size);
                i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.w.E(collection);
            int size = size();
            boolean zRetainAll = this.f57054c.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, this.f57054c.size() - size);
                i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            h();
            return this.f57054c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            h();
            return this.f57054c.toString();
        }
    }

    public class l extends AbstractMapBasedMultimap<K, V>.k implements List<V> {

        public class a extends AbstractMapBasedMultimap<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(l.this.j().listIterator(i10));
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(@x1 V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v10);
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            @x1
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@x1 V v10) {
                c().set(v10);
            }
        }

        l(K k10, @CheckForNull List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, @x1 V v10) {
            h();
            boolean zIsEmpty = e().isEmpty();
            j().add(i10, v10);
            AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = j().addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, e().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        @x1
        public V get(int i10) {
            h();
            return j().get(i10);
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object obj) {
            h();
            return j().indexOf(obj);
        }

        List<V> j() {
            return (List) e();
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            h();
            return j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            h();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            h();
            return new a(i10);
        }

        @Override // java.util.List
        @x1
        public V remove(int i10) {
            h();
            V vRemove = j().remove(i10);
            AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this);
            i();
            return vRemove;
        }

        @Override // java.util.List
        @x1
        public V set(int i10, @x1 V v10) {
            h();
            return j().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            h();
            return AbstractMapBasedMultimap.this.G(g(), j().subList(i10, i11), b() == null ? this : b());
        }
    }

    public class m extends AbstractMapBasedMultimap<K, V>.o implements NavigableSet<V> {
        m(K k10, @CheckForNull NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, navigableSet, kVar);
        }

        private NavigableSet<V> m(NavigableSet<V> navigableSet) {
            return new m(this.f57053b, navigableSet, b() == null ? this : b());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V ceiling(@x1 V v10) {
            return j().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(j().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m(j().descendingSet());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V floor(@x1 V v10) {
            return j().floor(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@x1 V v10, boolean z10) {
            return m(j().headSet(v10, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V higher(@x1 V v10) {
            return j().higher(v10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.o
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> j() {
            return (NavigableSet) super.j();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V lower(@x1 V v10) {
            return j().lower(v10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V pollFirst() {
            return (V) Iterators.U(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V pollLast() {
            return (V) Iterators.U(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@x1 V v10, boolean z10, @x1 V v11, boolean z11) {
            return m(j().subSet(v10, z10, v11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@x1 V v10, boolean z10) {
            return m(j().tailSet(v10, z10));
        }
    }

    public class n extends AbstractMapBasedMultimap<K, V>.k implements Set<V> {
        n(K k10, Set<V> set) {
            super(k10, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zI = Sets.I((Set) this.f57054c, collection);
            if (zI) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, this.f57054c.size() - size);
                i();
            }
            return zI;
        }
    }

    public class o extends AbstractMapBasedMultimap<K, V>.k implements SortedSet<V> {
        o(K k10, @CheckForNull SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super V> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        @x1
        public V first() {
            h();
            return j().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@x1 V v10) {
            h();
            return new o(g(), j().headSet(v10), b() == null ? this : b());
        }

        SortedSet<V> j() {
            return (SortedSet) e();
        }

        @Override // java.util.SortedSet
        @x1
        public V last() {
            h();
            return j().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@x1 V v10, @x1 V v11) {
            h();
            return new o(g(), j().subSet(v10, v11), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@x1 V v10) {
            h();
            return new o(g(), j().tailSet(v10), b() == null ? this : b());
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        com.google.common.base.w.d(map.isEmpty());
        this.f57031g = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> B(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(@CheckForNull Object obj) {
        Collection collection = (Collection) Maps.q0(this.f57031g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f57032h -= size;
        }
    }

    static /* synthetic */ int o(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f57032h;
        abstractMapBasedMultimap.f57032h = i10 + 1;
        return i10;
    }

    static /* synthetic */ int p(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f57032h;
        abstractMapBasedMultimap.f57032h = i10 - 1;
        return i10;
    }

    static /* synthetic */ int q(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f57032h + i10;
        abstractMapBasedMultimap.f57032h = i11;
        return i11;
    }

    static /* synthetic */ int r(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f57032h - i10;
        abstractMapBasedMultimap.f57032h = i11;
        return i11;
    }

    private Collection<V> z(@x1 K k10) {
        Collection<V> collection = this.f57031g.get(k10);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionV = v(k10);
        this.f57031g.put(k10, collectionV);
        return collectionV;
    }

    final void D(Map<K, Collection<V>> map) {
        this.f57031g = map;
        this.f57032h = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.w.d(!collection.isEmpty());
            this.f57032h += collection.size();
        }
    }

    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    Collection<V> F(@x1 K k10, Collection<V> collection) {
        return new k(k10, collection, null);
    }

    final List<V> G(@x1 K k10, List<V> list, @CheckForNull AbstractMapBasedMultimap<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public Collection<V> a(@CheckForNull Object obj) {
        Collection<V> collectionRemove = this.f57031g.remove(obj);
        if (collectionRemove == null) {
            return y();
        }
        Collection collectionU = u();
        collectionU.addAll(collectionRemove);
        this.f57032h -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) E(collectionU);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public Collection<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return a(k10);
        }
        Collection<V> collectionZ = z(k10);
        Collection<V> collectionU = u();
        collectionU.addAll(collectionZ);
        this.f57032h -= collectionZ.size();
        collectionZ.clear();
        while (it.hasNext()) {
            if (collectionZ.add(it.next())) {
                this.f57032h++;
            }
        }
        return (Collection<V>) E(collectionU);
    }

    @Override // com.google.common.collect.c
    Map<K, Collection<V>> c() {
        return new c(this.f57031g);
    }

    @Override // com.google.common.collect.r1
    public void clear() {
        Iterator<Collection<V>> it = this.f57031g.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f57031g.clear();
        this.f57032h = 0;
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        return this.f57031g.containsKey(obj);
    }

    @Override // com.google.common.collect.c
    Collection<Map.Entry<K, V>> d() {
        return this instanceof i2 ? new com.google.common.collect.c.b(this) : new com.google.common.collect.c.a();
    }

    @Override // com.google.common.collect.c
    Set<K> f() {
        return new e(this.f57031g);
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public Collection<V> v(@x1 K k10) {
        Collection<V> collectionV = this.f57031g.get(k10);
        if (collectionV == null) {
            collectionV = v(k10);
        }
        return F(k10, collectionV);
    }

    @Override // com.google.common.collect.c
    s1<K> h() {
        return new Multimaps.c(this);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public Collection<Map.Entry<K, V>> i() {
        return super.i();
    }

    @Override // com.google.common.collect.c
    Collection<V> j() {
        return new com.google.common.collect.c.C0464c();
    }

    @Override // com.google.common.collect.c
    Iterator<Map.Entry<K, V>> k() {
        return new b(this);
    }

    @Override // com.google.common.collect.c
    Iterator<V> l() {
        return new a(this);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public boolean put(@x1 K k10, @x1 V v10) {
        Collection<V> collection = this.f57031g.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f57032h++;
            return true;
        }
        Collection<V> collectionV = v(k10);
        if (!collectionV.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f57032h++;
        this.f57031g.put(k10, collectionV);
        return true;
    }

    @Override // com.google.common.collect.r1
    public int size() {
        return this.f57032h;
    }

    Map<K, Collection<V>> t() {
        return this.f57031g;
    }

    abstract Collection<V> u();

    Collection<V> v(@x1 K k10) {
        return u();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public Collection<V> values() {
        return super.values();
    }

    final Map<K, Collection<V>> w() {
        Map<K, Collection<V>> map = this.f57031g;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f57031g);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f57031g) : new c(this.f57031g);
    }

    final Set<K> x() {
        Map<K, Collection<V>> map = this.f57031g;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f57031g);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f57031g) : new e(this.f57031g);
    }

    Collection<V> y() {
        return (Collection<V>) E(u());
    }
}
