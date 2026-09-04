package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class Synchronized {

    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        transient Set<Map.Entry<K, Collection<V>>> f57932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        transient Collection<Collection<V>> f57933h;

        SynchronizedAsMap(Map<K, Collection<V>> map, @CheckForNull Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f57955c) {
                if (this.f57932g == null) {
                    this.f57932g = new SynchronizedAsMapEntries(v().entrySet(), this.f57955c);
                }
                set = this.f57932g;
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        @CheckForNull
        public Collection<V> get(@CheckForNull Object obj) {
            Collection<V> collectionA;
            synchronized (this.f57955c) {
                Collection collection = (Collection) super.get(obj);
                collectionA = collection == null ? null : Synchronized.A(collection, this.f57955c);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f57955c) {
                if (this.f57933h == null) {
                    this.f57933h = new SynchronizedAsMapValues(v().values(), this.f57955c);
                }
                collection = this.f57933h;
            }
            return collection;
        }
    }

    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        public class a extends w2<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$a$a, reason: collision with other inner class name */
            public class C0462a extends t0<K, Collection<V>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f57935b;

                C0462a(Map.Entry entry) {
                    this.f57935b = entry;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.t0, com.google.common.collect.y0
                public Map.Entry<K, Collection<V>> H0() {
                    return this.f57935b;
                }

                @Override // com.google.common.collect.t0, java.util.Map.Entry
                /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return Synchronized.A((Collection) this.f57935b.getValue(), SynchronizedAsMapEntries.this.f57955c);
                }
            }

            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.w2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
                return new C0462a(entry);
            }
        }

        SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, @CheckForNull Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            boolean zP;
            synchronized (this.f57955c) {
                zP = Maps.p(w(), obj);
            }
            return zP;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zB;
            synchronized (this.f57955c) {
                zB = o.b(w(), collection);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            boolean zG;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zG = Sets.g(w(), obj);
            }
            return zG;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            boolean zK0;
            synchronized (this.f57955c) {
                zK0 = Maps.k0(w(), obj);
            }
            return zK0;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zV;
            synchronized (this.f57955c) {
                zV = Iterators.V(w().iterator(), collection);
            }
            return zV;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zX;
            synchronized (this.f57955c) {
                zX = Iterators.X(w().iterator(), collection);
            }
            return zX;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrL;
            synchronized (this.f57955c) {
                objArrL = u1.l(w());
            }
            return objArrL;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f57955c) {
                tArr2 = (T[]) u1.m(w(), tArr);
            }
            return tArr2;
        }
    }

    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        public class a extends w2<Collection<V>, Collection<V>> {
            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.w2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> a(Collection<V> collection) {
                return Synchronized.A(collection, SynchronizedAsMapValues.this.f57955c);
            }
        }

        SynchronizedAsMapValues(Collection<Collection<V>> collection, @CheckForNull Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    @o9.d
    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements l<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        private transient Set<V> f57938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        @u9.f
        private transient l<V, K> f57939h;

        private SynchronizedBiMap(l<K, V> lVar, @CheckForNull Object obj, @CheckForNull l<V, K> lVar2) {
            super(lVar, obj);
            this.f57939h = lVar2;
        }

        @Override // com.google.common.collect.l
        @CheckForNull
        public V R(K k10, V v10) {
            V vR;
            synchronized (this.f57955c) {
                vR = l().R(k10, v10);
            }
            return vR;
        }

        @Override // com.google.common.collect.l
        public l<V, K> i0() {
            l<V, K> lVar;
            synchronized (this.f57955c) {
                if (this.f57939h == null) {
                    this.f57939h = new SynchronizedBiMap(l().i0(), this.f57955c, this);
                }
                lVar = this.f57939h;
            }
            return lVar;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f57955c) {
                if (this.f57938g == null) {
                    this.f57938g = Synchronized.u(l().values(), this.f57955c);
                }
                set = this.f57938g;
            }
            return set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public l<K, V> v() {
            return (l) super.v();
        }
    }

    @o9.d
    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        private SynchronizedCollection(Collection<E> collection, @CheckForNull Object obj) {
            super(collection, obj);
        }

        @Override // java.util.Collection
        public boolean add(E e10) {
            boolean zAdd;
            synchronized (this.f57955c) {
                zAdd = w().add(e10);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f57955c) {
                zAddAll = w().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f57955c) {
                w().clear();
            }
        }

        public boolean contains(@CheckForNull Object obj) {
            boolean zContains;
            synchronized (this.f57955c) {
                zContains = w().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.f57955c) {
                zContainsAll = w().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f57955c) {
                zIsEmpty = w().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return w().iterator();
        }

        public boolean remove(@CheckForNull Object obj) {
            boolean zRemove;
            synchronized (this.f57955c) {
                zRemove = w().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f57955c) {
                zRemoveAll = w().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f57955c) {
                zRetainAll = w().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f57955c) {
                size = w().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f57955c) {
                array = w().toArray();
            }
            return array;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f57955c) {
                tArr2 = (T[]) w().toArray(tArr);
            }
            return tArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* JADX INFO: renamed from: v */
        public Collection<E> v() {
            return (Collection) super.v();
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        SynchronizedDeque(Deque<E> deque, @CheckForNull Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e10) {
            synchronized (this.f57955c) {
                v().addFirst(e10);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e10) {
            synchronized (this.f57955c) {
                v().addLast(e10);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f57955c) {
                itDescendingIterator = v().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.f57955c) {
                first = v().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.f57955c) {
                last = v().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e10) {
            boolean zOfferFirst;
            synchronized (this.f57955c) {
                zOfferFirst = v().offerFirst(e10);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e10) {
            boolean zOfferLast;
            synchronized (this.f57955c) {
                zOfferLast = v().offerLast(e10);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.f57955c) {
                ePeekFirst = v().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E peekLast() {
            E ePeekLast;
            synchronized (this.f57955c) {
                ePeekLast = v().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f57955c) {
                ePollFirst = v().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E pollLast() {
            E ePollLast;
            synchronized (this.f57955c) {
                ePollLast = v().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.f57955c) {
                ePop = v().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e10) {
            synchronized (this.f57955c) {
                v().push(e10);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.f57955c) {
                eRemoveFirst = v().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@CheckForNull Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f57955c) {
                zRemoveFirstOccurrence = v().removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.f57955c) {
                eRemoveLast = v().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@CheckForNull Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f57955c) {
                zRemoveLastOccurrence = v().removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> w() {
            return (Deque) super.w();
        }
    }

    @o9.c
    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(Map.Entry<K, V> entry, @CheckForNull Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f57955c) {
                key = v().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f57955c) {
                value = v().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V value;
            synchronized (this.f57955c) {
                value = v().setValue(v10);
            }
            return value;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map.Entry<K, V> v() {
            return (Map.Entry) super.v();
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(List<E> list, @CheckForNull Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i10, E e10) {
            synchronized (this.f57955c) {
                v().add(i10, e10);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f57955c) {
                zAddAll = v().addAll(i10, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int i10) {
            E e10;
            synchronized (this.f57955c) {
                e10 = v().get(i10);
            }
            return e10;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            synchronized (this.f57955c) {
                iIndexOf = v().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iLastIndexOf;
            synchronized (this.f57955c) {
                iLastIndexOf = v().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return v().listIterator();
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i10) {
            return v().listIterator(i10);
        }

        @Override // java.util.List
        public E remove(int i10) {
            E eRemove;
            synchronized (this.f57955c) {
                eRemove = v().remove(i10);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int i10, E e10) {
            E e11;
            synchronized (this.f57955c) {
                e11 = v().set(i10, e10);
            }
            return e11;
        }

        @Override // java.util.List
        public List<E> subList(int i10, int i11) {
            List<E> listJ;
            synchronized (this.f57955c) {
                listJ = Synchronized.j(v().subList(i10, i11), this.f57955c);
            }
            return listJ;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public List<E> w() {
            return (List) super.w();
        }
    }

    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements o1<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedListMultimap(o1<K, V> o1Var, @CheckForNull Object obj) {
            super(o1Var, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V> a(@CheckForNull Object obj) {
            List<V> listA;
            synchronized (this.f57955c) {
                listA = w().a(obj);
            }
            return listA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V> b(K k10, Iterable<? extends V> iterable) {
            List<V> listB;
            synchronized (this.f57955c) {
                listB = w().b((Object) k10, (Iterable) iterable);
            }
            return listB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public List<V> v(K k10) {
            List<V> listJ;
            synchronized (this.f57955c) {
                listJ = Synchronized.j(w().v((Object) k10), this.f57955c);
            }
            return listJ;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        public o1<K, V> v() {
            return (o1) super.v();
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient Set<K> f57940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        transient Collection<V> f57941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        transient Set<Map.Entry<K, V>> f57942f;

        SynchronizedMap(Map<K, V> map, @CheckForNull Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f57955c) {
                v().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            boolean zContainsKey;
            synchronized (this.f57955c) {
                zContainsKey = v().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(@CheckForNull Object obj) {
            boolean zContainsValue;
            synchronized (this.f57955c) {
                zContainsValue = v().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f57955c) {
                if (this.f57942f == null) {
                    this.f57942f = Synchronized.u(v().entrySet(), this.f57955c);
                }
                set = this.f57942f;
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        @CheckForNull
        public V get(@CheckForNull Object obj) {
            V v10;
            synchronized (this.f57955c) {
                v10 = v().get(obj);
            }
            return v10;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f57955c) {
                zIsEmpty = v().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f57955c) {
                if (this.f57940d == null) {
                    this.f57940d = Synchronized.u(v().keySet(), this.f57955c);
                }
                set = this.f57940d;
            }
            return set;
        }

        @Override // java.util.Map
        @CheckForNull
        public V put(K k10, V v10) {
            V vPut;
            synchronized (this.f57955c) {
                vPut = v().put(k10, v10);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f57955c) {
                v().putAll(map);
            }
        }

        @Override // java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            V vRemove;
            synchronized (this.f57955c) {
                vRemove = v().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f57955c) {
                size = v().size();
            }
            return size;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map<K, V> v() {
            return (Map) super.v();
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f57955c) {
                if (this.f57941e == null) {
                    this.f57941e = Synchronized.h(v().values(), this.f57955c);
                }
                collection = this.f57941e;
            }
            return collection;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements r1<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient Set<K> f57943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        transient Collection<V> f57944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        transient Collection<Map.Entry<K, V>> f57945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        transient Map<K, Collection<V>> f57946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        transient s1<K> f57947h;

        SynchronizedMultimap(r1<K, V> r1Var, @CheckForNull Object obj) {
            super(r1Var, obj);
        }

        @Override // com.google.common.collect.r1
        public boolean A(r1<? extends K, ? extends V> r1Var) {
            boolean zA;
            synchronized (this.f57955c) {
                zA = v().A(r1Var);
            }
            return zA;
        }

        @Override // com.google.common.collect.r1
        public boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
            boolean zD0;
            synchronized (this.f57955c) {
                zD0 = v().D0(obj, obj2);
            }
            return zD0;
        }

        public Collection<V> a(@CheckForNull Object obj) {
            Collection<V> collectionA;
            synchronized (this.f57955c) {
                collectionA = v().a(obj);
            }
            return collectionA;
        }

        public Collection<V> b(K k10, Iterable<? extends V> iterable) {
            Collection<V> collectionB;
            synchronized (this.f57955c) {
                collectionB = v().b(k10, iterable);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.r1
        public void clear() {
            synchronized (this.f57955c) {
                v().clear();
            }
        }

        @Override // com.google.common.collect.r1
        public boolean containsKey(@CheckForNull Object obj) {
            boolean zContainsKey;
            synchronized (this.f57955c) {
                zContainsKey = v().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.r1
        public boolean containsValue(@CheckForNull Object obj) {
            boolean zContainsValue;
            synchronized (this.f57955c) {
                zContainsValue = v().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        public Map<K, Collection<V>> e() {
            Map<K, Collection<V>> map;
            synchronized (this.f57955c) {
                if (this.f57946g == null) {
                    this.f57946g = new SynchronizedAsMap(v().e(), this.f57955c);
                }
                map = this.f57946g;
            }
            return map;
        }

        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        /* JADX INFO: renamed from: get */
        public Collection<V> v(K k10) {
            Collection<V> collectionA;
            synchronized (this.f57955c) {
                collectionA = Synchronized.A(v().v(k10), this.f57955c);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.r1
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.r1
        public Collection<Map.Entry<K, V>> i() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f57955c) {
                if (this.f57945f == null) {
                    this.f57945f = Synchronized.A(v().i(), this.f57955c);
                }
                collection = this.f57945f;
            }
            return collection;
        }

        @Override // com.google.common.collect.r1
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f57955c) {
                zIsEmpty = v().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.r1
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f57955c) {
                if (this.f57943d == null) {
                    this.f57943d = Synchronized.B(v().keySet(), this.f57955c);
                }
                set = this.f57943d;
            }
            return set;
        }

        @Override // com.google.common.collect.r1
        public s1<K> n0() {
            s1<K> s1Var;
            synchronized (this.f57955c) {
                if (this.f57947h == null) {
                    this.f57947h = Synchronized.n(v().n0(), this.f57955c);
                }
                s1Var = this.f57947h;
            }
            return s1Var;
        }

        @Override // com.google.common.collect.r1
        public boolean put(K k10, V v10) {
            boolean zPut;
            synchronized (this.f57955c) {
                zPut = v().put(k10, v10);
            }
            return zPut;
        }

        @Override // com.google.common.collect.r1
        public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            boolean zRemove;
            synchronized (this.f57955c) {
                zRemove = v().remove(obj, obj2);
            }
            return zRemove;
        }

        @Override // com.google.common.collect.r1
        public int size() {
            int size;
            synchronized (this.f57955c) {
                size = v().size();
            }
            return size;
        }

        @Override // com.google.common.collect.r1
        public boolean t0(K k10, Iterable<? extends V> iterable) {
            boolean zT0;
            synchronized (this.f57955c) {
                zT0 = v().t0(k10, iterable);
            }
            return zT0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public r1<K, V> v() {
            return (r1) super.v();
        }

        @Override // com.google.common.collect.r1
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f57955c) {
                if (this.f57944e == null) {
                    this.f57944e = Synchronized.h(v().values(), this.f57955c);
                }
                collection = this.f57944e;
            }
            return collection;
        }
    }

    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements s1<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient Set<E> f57948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        transient Set<s1.a<E>> f57949e;

        SynchronizedMultiset(s1<E> s1Var, @CheckForNull Object obj) {
            super(s1Var, obj);
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            int iE1;
            synchronized (this.f57955c) {
                iE1 = v().E1(obj);
            }
            return iE1;
        }

        @Override // com.google.common.collect.s1
        public int I0(E e10, int i10) {
            int iI0;
            synchronized (this.f57955c) {
                iI0 = v().I0(e10, i10);
            }
            return iI0;
        }

        @Override // com.google.common.collect.s1
        public Set<E> c() {
            Set<E> set;
            synchronized (this.f57955c) {
                if (this.f57948d == null) {
                    this.f57948d = Synchronized.B(v().c(), this.f57955c);
                }
                set = this.f57948d;
            }
            return set;
        }

        @Override // com.google.common.collect.s1
        public int c0(E e10, int i10) {
            int iC0;
            synchronized (this.f57955c) {
                iC0 = v().c0(e10, i10);
            }
            return iC0;
        }

        @Override // com.google.common.collect.s1
        public Set<s1.a<E>> entrySet() {
            Set<s1.a<E>> set;
            synchronized (this.f57955c) {
                if (this.f57949e == null) {
                    this.f57949e = Synchronized.B(v().entrySet(), this.f57955c);
                }
                set = this.f57949e;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.s1
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.s1
        public boolean g0(E e10, int i10, int i11) {
            boolean zG0;
            synchronized (this.f57955c) {
                zG0 = v().g0(e10, i10, i11);
            }
            return zG0;
        }

        @Override // java.util.Collection, com.google.common.collect.s1
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.s1
        public int n1(@CheckForNull Object obj, int i10) {
            int iN1;
            synchronized (this.f57955c) {
                iN1 = v().n1(obj, i10);
            }
            return iN1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public s1<E> w() {
            return (s1) super.w();
        }
    }

    @o9.c
    @o9.d
    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        transient NavigableSet<K> f57950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        transient NavigableMap<K, V> f57951h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        transient NavigableSet<K> f57952i;

        SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, @CheckForNull Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().ceilingEntry(k10), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(K k10) {
            K kCeilingKey;
            synchronized (this.f57955c) {
                kCeilingKey = w().ceilingKey(k10);
            }
            return kCeilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f57955c) {
                NavigableSet<K> navigableSet = this.f57950g;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetR = Synchronized.r(w().descendingKeySet(), this.f57955c);
                this.f57950g = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f57955c) {
                NavigableMap<K, V> navigableMap = this.f57951h;
                if (navigableMap != null) {
                    return navigableMap;
                }
                NavigableMap<K, V> navigableMapP = Synchronized.p(w().descendingMap(), this.f57955c);
                this.f57951h = navigableMapP;
                return navigableMapP;
            }
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().firstEntry(), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().floorEntry(k10), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(K k10) {
            K kFloorKey;
            synchronized (this.f57955c) {
                kFloorKey = w().floorKey(k10);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f57955c) {
                navigableMapP = Synchronized.p(w().headMap(k10, z10), this.f57955c);
            }
            return navigableMapP;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().higherEntry(k10), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(K k10) {
            K kHigherKey;
            synchronized (this.f57955c) {
                kHigherKey = w().higherKey(k10);
            }
            return kHigherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().lastEntry(), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().lowerEntry(k10), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(K k10) {
            K kLowerKey;
            synchronized (this.f57955c) {
                kLowerKey = w().lowerKey(k10);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f57955c) {
                NavigableSet<K> navigableSet = this.f57952i;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetR = Synchronized.r(w().navigableKeySet(), this.f57955c);
                this.f57952i = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().pollFirstEntry(), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f57955c) {
                entryS = Synchronized.s(w().pollLastEntry(), this.f57955c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f57955c) {
                navigableMapP = Synchronized.p(w().subMap(k10, z10, k11, z11), this.f57955c);
            }
            return navigableMapP;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f57955c) {
                navigableMapP = Synchronized.p(w().tailMap(k10, z10), this.f57955c);
            }
            return navigableMapP;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> v() {
            return (NavigableMap) super.v();
        }
    }

    @o9.c
    @o9.d
    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient NavigableSet<E> f57953d;

        SynchronizedNavigableSet(NavigableSet<E> navigableSet, @CheckForNull Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(E e10) {
            E eCeiling;
            synchronized (this.f57955c) {
                eCeiling = v().ceiling(e10);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return v().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f57955c) {
                NavigableSet<E> navigableSet = this.f57953d;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<E> navigableSetR = Synchronized.r(v().descendingSet(), this.f57955c);
                this.f57953d = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(E e10) {
            E eFloor;
            synchronized (this.f57955c) {
                eFloor = v().floor(e10);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f57955c) {
                navigableSetR = Synchronized.r(v().headSet(e10, z10), this.f57955c);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e10) {
            return headSet(e10, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(E e10) {
            E eHigher;
            synchronized (this.f57955c) {
                eHigher = v().higher(e10);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(E e10) {
            E eLower;
            synchronized (this.f57955c) {
                eLower = v().lower(e10);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f57955c) {
                ePollFirst = v().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            E ePollLast;
            synchronized (this.f57955c) {
                ePollLast = v().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f57955c) {
                navigableSetR = Synchronized.r(v().subSet(e10, z10, e11, z11), this.f57955c);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e10, E e11) {
            return subSet(e10, true, e11, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f57955c) {
                navigableSetR = Synchronized.r(v().tailSet(e10, z10), this.f57955c);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e10) {
            return tailSet(e10, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> v() {
            return (NavigableSet) super.v();
        }
    }

    public static class SynchronizedObject implements Serializable {

        @o9.c
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f57954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f57955c;

        SynchronizedObject(Object obj, @CheckForNull Object obj2) {
            this.f57954b = com.google.common.base.w.E(obj);
            this.f57955c = obj2 == null ? this : obj2;
        }

        @o9.c
        private void u(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f57955c) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* JADX INFO: renamed from: l */
        Object v() {
            return this.f57954b;
        }

        public String toString() {
            String string;
            synchronized (this.f57955c) {
                string = this.f57954b.toString();
            }
            return string;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        SynchronizedQueue(Queue<E> queue, @CheckForNull Object obj) {
            super(queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.f57955c) {
                eElement = w().element();
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e10) {
            boolean zOffer;
            synchronized (this.f57955c) {
                zOffer = w().offer(e10);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        @CheckForNull
        public E peek() {
            E ePeek;
            synchronized (this.f57955c) {
                ePeek = w().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        @CheckForNull
        public E poll() {
            E ePoll;
            synchronized (this.f57955c) {
                ePoll = w().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.f57955c) {
                eRemove = w().remove();
            }
            return eRemove;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public Queue<E> w() {
            return (Queue) super.w();
        }
    }

    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(List<E> list, @CheckForNull Object obj) {
            super(list, obj);
        }
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(Set<E> set, @CheckForNull Object obj) {
            super(set, obj);
        }

        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = w().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = w().hashCode();
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public Set<E> w() {
            return (Set) super.w();
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements i2<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        transient Set<Map.Entry<K, V>> f57956i;

        SynchronizedSetMultimap(i2<K, V> i2Var, @CheckForNull Object obj) {
            super(i2Var, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> a(@CheckForNull Object obj) {
            Set<V> setA;
            synchronized (this.f57955c) {
                setA = w().a(obj);
            }
            return setA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> b(K k10, Iterable<? extends V> iterable) {
            Set<V> setB;
            synchronized (this.f57955c) {
                setB = w().b((Object) k10, (Iterable) iterable);
            }
            return setB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public Set<V> v(K k10) {
            Set<V> setU;
            synchronized (this.f57955c) {
                setU = Synchronized.u(w().v((Object) k10), this.f57955c);
            }
            return setU;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1
        public Set<Map.Entry<K, V>> i() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f57955c) {
                if (this.f57956i == null) {
                    this.f57956i = Synchronized.u(w().i(), this.f57955c);
                }
                set = this.f57956i;
            }
            return set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        public i2<K, V> v() {
            return (i2) super.v();
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(SortedMap<K, V> sortedMap, @CheckForNull Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f57955c) {
                comparator = v().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.f57955c) {
                kFirstKey = v().firstKey();
            }
            return kFirstKey;
        }

        public SortedMap<K, V> headMap(K k10) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f57955c) {
                sortedMapW = Synchronized.w(v().headMap(k10), this.f57955c);
            }
            return sortedMapW;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.f57955c) {
                kLastKey = v().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K k10, K k11) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f57955c) {
                sortedMapW = Synchronized.w(v().subMap(k10, k11), this.f57955c);
            }
            return sortedMapW;
        }

        public SortedMap<K, V> tailMap(K k10) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f57955c) {
                sortedMapW = Synchronized.w(v().tailMap(k10), this.f57955c);
            }
            return sortedMapW;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> v() {
            return (SortedMap) super.v();
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(SortedSet<E> sortedSet, @CheckForNull Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f57955c) {
                comparator = v().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.f57955c) {
                eFirst = v().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E e10) {
            SortedSet<E> sortedSetX;
            synchronized (this.f57955c) {
                sortedSetX = Synchronized.x(v().headSet(e10), this.f57955c);
            }
            return sortedSetX;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.f57955c) {
                eLast = v().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e10, E e11) {
            SortedSet<E> sortedSetX;
            synchronized (this.f57955c) {
                sortedSetX = Synchronized.x(v().subSet(e10, e11), this.f57955c);
            }
            return sortedSetX;
        }

        public SortedSet<E> tailSet(E e10) {
            SortedSet<E> sortedSetX;
            synchronized (this.f57955c) {
                sortedSetX = Synchronized.x(v().tailSet(e10), this.f57955c);
            }
            return sortedSetX;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> w() {
            return (SortedSet) super.w();
        }
    }

    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements t2<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSetMultimap(t2<K, V> t2Var, @CheckForNull Object obj) {
            super(t2Var, obj);
        }

        @Override // com.google.common.collect.t2
        @CheckForNull
        public Comparator<? super V> I() {
            Comparator<? super V> comparatorI;
            synchronized (this.f57955c) {
                comparatorI = w().I();
            }
            return comparatorI;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public SortedSet<V> a(@CheckForNull Object obj) {
            SortedSet<V> sortedSetA;
            synchronized (this.f57955c) {
                sortedSetA = w().a(obj);
            }
            return sortedSetA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        public SortedSet<V> b(K k10, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetB;
            synchronized (this.f57955c) {
                sortedSetB = w().b((Object) k10, (Iterable) iterable);
            }
            return sortedSetB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public SortedSet<V> v(K k10) {
            SortedSet<V> sortedSetX;
            synchronized (this.f57955c) {
                sortedSetX = Synchronized.x(w().v((Object) k10), this.f57955c);
            }
            return sortedSetX;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public t2<K, V> w() {
            return (t2) super.w();
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements u2<R, C, V> {

        public class a implements com.google.common.base.n<Map<C, V>, Map<C, V>> {
            a() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> map) {
                return Synchronized.l(map, SynchronizedTable.this.f57955c);
            }
        }

        public class b implements com.google.common.base.n<Map<R, V>, Map<R, V>> {
            b() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> map) {
                return Synchronized.l(map, SynchronizedTable.this.f57955c);
            }
        }

        SynchronizedTable(u2<R, C, V> u2Var, @CheckForNull Object obj) {
            super(u2Var, obj);
        }

        @Override // com.google.common.collect.u2
        public boolean A0(@CheckForNull Object obj) {
            boolean zA0;
            synchronized (this.f57955c) {
                zA0 = v().A0(obj);
            }
            return zA0;
        }

        @Override // com.google.common.collect.u2
        public Map<C, V> E0(R r10) {
            Map<C, V> mapL;
            synchronized (this.f57955c) {
                mapL = Synchronized.l(v().E0(r10), this.f57955c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.u2
        @CheckForNull
        public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
            V vY;
            synchronized (this.f57955c) {
                vY = v().Y(obj, obj2);
            }
            return vY;
        }

        @Override // com.google.common.collect.u2
        public boolean Z(@CheckForNull Object obj) {
            boolean Z;
            synchronized (this.f57955c) {
                Z = v().Z(obj);
            }
            return Z;
        }

        @Override // com.google.common.collect.u2
        public Map<C, Map<R, V>> a0() {
            Map<C, Map<R, V>> mapL;
            synchronized (this.f57955c) {
                mapL = Synchronized.l(Maps.B0(v().a0(), new b()), this.f57955c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.u2
        public Map<R, V> b0(C c10) {
            Map<R, V> mapL;
            synchronized (this.f57955c) {
                mapL = Synchronized.l(v().b0(c10), this.f57955c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.u2
        public void clear() {
            synchronized (this.f57955c) {
                v().clear();
            }
        }

        @Override // com.google.common.collect.u2
        public boolean containsValue(@CheckForNull Object obj) {
            boolean zContainsValue;
            synchronized (this.f57955c) {
                zContainsValue = v().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.u2
        @CheckForNull
        public V d0(R r10, C c10, V v10) {
            V vD0;
            synchronized (this.f57955c) {
                vD0 = v().d0(r10, c10, v10);
            }
            return vD0;
        }

        @Override // com.google.common.collect.u2
        public boolean equals(@CheckForNull Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f57955c) {
                zEquals = v().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.u2
        public Map<R, Map<C, V>> h() {
            Map<R, Map<C, V>> mapL;
            synchronized (this.f57955c) {
                mapL = Synchronized.l(Maps.B0(v().h(), new a()), this.f57955c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.u2
        public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
            boolean zH0;
            synchronized (this.f57955c) {
                zH0 = v().h0(obj, obj2);
            }
            return zH0;
        }

        @Override // com.google.common.collect.u2
        public int hashCode() {
            int iHashCode;
            synchronized (this.f57955c) {
                iHashCode = v().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.u2
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f57955c) {
                zIsEmpty = v().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.u2
        public Set<R> j() {
            Set<R> setU;
            synchronized (this.f57955c) {
                setU = Synchronized.u(v().j(), this.f57955c);
            }
            return setU;
        }

        @Override // com.google.common.collect.u2
        @CheckForNull
        public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            V vRemove;
            synchronized (this.f57955c) {
                vRemove = v().remove(obj, obj2);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.u2
        public void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
            synchronized (this.f57955c) {
                v().s0(u2Var);
            }
        }

        @Override // com.google.common.collect.u2
        public int size() {
            int size;
            synchronized (this.f57955c) {
                size = v().size();
            }
            return size;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public u2<R, C, V> v() {
            return (u2) super.v();
        }

        @Override // com.google.common.collect.u2
        public Set<u2.a<R, C, V>> v0() {
            Set<u2.a<R, C, V>> setU;
            synchronized (this.f57955c) {
                setU = Synchronized.u(v().v0(), this.f57955c);
            }
            return setU;
        }

        @Override // com.google.common.collect.u2
        public Collection<V> values() {
            Collection<V> collectionH;
            synchronized (this.f57955c) {
                collectionH = Synchronized.h(v().values(), this.f57955c);
            }
            return collectionH;
        }

        @Override // com.google.common.collect.u2
        public Set<C> y0() {
            Set<C> setU;
            synchronized (this.f57955c) {
                setU = Synchronized.u(v().y0(), this.f57955c);
            }
            return setU;
        }
    }

    private Synchronized() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> A(Collection<E> collection, @CheckForNull Object obj) {
        if (collection instanceof SortedSet) {
            return x((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return u((Set) collection, obj);
        }
        return collection instanceof List ? j((List) collection, obj) : h(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> B(Set<E> set, @CheckForNull Object obj) {
        return set instanceof SortedSet ? x((SortedSet) set, obj) : u(set, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> l<K, V> g(l<K, V> lVar, @CheckForNull Object obj) {
        return ((lVar instanceof SynchronizedBiMap) || (lVar instanceof ImmutableBiMap)) ? lVar : new SynchronizedBiMap(lVar, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> h(Collection<E> collection, @CheckForNull Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    static <E> Deque<E> i(Deque<E> deque, @CheckForNull Object obj) {
        return new SynchronizedDeque(deque, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> List<E> j(List<E> list, @CheckForNull Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    static <K, V> o1<K, V> k(o1<K, V> o1Var, @CheckForNull Object obj) {
        return ((o1Var instanceof SynchronizedListMultimap) || (o1Var instanceof j)) ? o1Var : new SynchronizedListMultimap(o1Var, obj);
    }

    @o9.d
    static <K, V> Map<K, V> l(Map<K, V> map, @CheckForNull Object obj) {
        return new SynchronizedMap(map, obj);
    }

    static <K, V> r1<K, V> m(r1<K, V> r1Var, @CheckForNull Object obj) {
        return ((r1Var instanceof SynchronizedMultimap) || (r1Var instanceof j)) ? r1Var : new SynchronizedMultimap(r1Var, obj);
    }

    static <E> s1<E> n(s1<E> s1Var, @CheckForNull Object obj) {
        return ((s1Var instanceof SynchronizedMultiset) || (s1Var instanceof ImmutableMultiset)) ? s1Var : new SynchronizedMultiset(s1Var, obj);
    }

    @o9.c
    static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return p(navigableMap, null);
    }

    @o9.c
    static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @CheckForNull Object obj) {
        return new SynchronizedNavigableMap(navigableMap, obj);
    }

    @o9.c
    static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return r(navigableSet, null);
    }

    @o9.c
    static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @CheckForNull Object obj) {
        return new SynchronizedNavigableSet(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    @o9.c
    public static <K, V> Map.Entry<K, V> s(@CheckForNull Map.Entry<K, V> entry, @CheckForNull Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    static <E> Queue<E> t(Queue<E> queue, @CheckForNull Object obj) {
        return queue instanceof SynchronizedQueue ? queue : new SynchronizedQueue(queue, obj);
    }

    @o9.d
    static <E> Set<E> u(Set<E> set, @CheckForNull Object obj) {
        return new SynchronizedSet(set, obj);
    }

    static <K, V> i2<K, V> v(i2<K, V> i2Var, @CheckForNull Object obj) {
        return ((i2Var instanceof SynchronizedSetMultimap) || (i2Var instanceof j)) ? i2Var : new SynchronizedSetMultimap(i2Var, obj);
    }

    static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @CheckForNull Object obj) {
        return new SynchronizedSortedMap(sortedMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> x(SortedSet<E> sortedSet, @CheckForNull Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    static <K, V> t2<K, V> y(t2<K, V> t2Var, @CheckForNull Object obj) {
        return t2Var instanceof SynchronizedSortedSetMultimap ? t2Var : new SynchronizedSortedSetMultimap(t2Var, obj);
    }

    static <R, C, V> u2<R, C, V> z(u2<R, C, V> u2Var, @CheckForNull Object obj) {
        return new SynchronizedTable(u2Var, obj);
    }
}
