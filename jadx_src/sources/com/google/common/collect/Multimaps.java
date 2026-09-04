package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {

        @o9.c
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient com.google.common.base.c0<? extends List<V>> f57700i;

        CustomListMultimap(Map<K, Collection<V>> map, com.google.common.base.c0<? extends List<V>> c0Var) {
            super(map);
            this.f57700i = (com.google.common.base.c0) com.google.common.base.w.E(c0Var);
        }

        @o9.c
        private void K(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f57700i = (com.google.common.base.c0) objectInputStream.readObject();
            D((Map) objectInputStream.readObject());
        }

        @o9.c
        private void L(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f57700i);
            objectOutputStream.writeObject(t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: H */
        public List<V> u() {
            return this.f57700i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Map<K, Collection<V>> c() {
            return w();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Set<K> f() {
            return x();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {

        @o9.c
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient com.google.common.base.c0<? extends Collection<V>> f57701i;

        CustomMultimap(Map<K, Collection<V>> map, com.google.common.base.c0<? extends Collection<V>> c0Var) {
            super(map);
            this.f57701i = (com.google.common.base.c0) com.google.common.base.w.E(c0Var);
        }

        @o9.c
        private void H(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f57701i = (com.google.common.base.c0) objectInputStream.readObject();
            D((Map) objectInputStream.readObject());
        }

        @o9.c
        private void J(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f57701i);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        <E> Collection<E> E(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.O((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        Collection<V> F(@x1 K k10, Collection<V> collection) {
            if (collection instanceof List) {
                return G(k10, (List) collection, null);
            }
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.m(k10, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.o(k10, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new AbstractMapBasedMultimap.n(k10, (Set) collection) : new AbstractMapBasedMultimap.k(k10, collection, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Map<K, Collection<V>> c() {
            return w();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Set<K> f() {
            return x();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        protected Collection<V> u() {
            return this.f57701i.get();
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {

        @o9.c
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient com.google.common.base.c0<? extends Set<V>> f57702i;

        CustomSetMultimap(Map<K, Collection<V>> map, com.google.common.base.c0<? extends Set<V>> c0Var) {
            super(map);
            this.f57702i = (com.google.common.base.c0) com.google.common.base.w.E(c0Var);
        }

        @o9.c
        private void K(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f57702i = (com.google.common.base.c0) objectInputStream.readObject();
            D((Map) objectInputStream.readObject());
        }

        @o9.c
        private void L(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f57702i);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        <E> Collection<E> E(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.O((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        Collection<V> F(@x1 K k10, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.m(k10, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.o(k10, (SortedSet) collection, null) : new AbstractMapBasedMultimap.n(k10, (Set) collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: H */
        public Set<V> u() {
            return this.f57702i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Map<K, Collection<V>> c() {
            return w();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Set<K> f() {
            return x();
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {

        @o9.c
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient com.google.common.base.c0<? extends SortedSet<V>> f57703i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @CheckForNull
        transient Comparator<? super V> f57704j;

        CustomSortedSetMultimap(Map<K, Collection<V>> map, com.google.common.base.c0<? extends SortedSet<V>> c0Var) {
            super(map);
            this.f57703i = (com.google.common.base.c0) com.google.common.base.w.E(c0Var);
            this.f57704j = c0Var.get().comparator();
        }

        @o9.c
        private void N(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            com.google.common.base.c0<? extends SortedSet<V>> c0Var = (com.google.common.base.c0) objectInputStream.readObject();
            this.f57703i = c0Var;
            this.f57704j = c0Var.get().comparator();
            D((Map) objectInputStream.readObject());
        }

        @o9.c
        private void O(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f57703i);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.t2
        @CheckForNull
        public Comparator<? super V> I() {
            return this.f57704j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> u() {
            return this.f57703i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Map<K, Collection<V>> c() {
            return w();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        Set<K> f() {
            return x();
        }
    }

    public static class MapMultimap<K, V> extends com.google.common.collect.c<K, V> implements i2<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<K, V> f57705g;

        public class a extends Sets.j<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f57706b;

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$a$a, reason: collision with other inner class name */
            public class C0451a implements Iterator<V> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f57708b;

                C0451a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f57708b == 0) {
                        a aVar = a.this;
                        if (MapMultimap.this.f57705g.containsKey(aVar.f57706b)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @x1
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f57708b++;
                    a aVar = a.this;
                    return (V) t1.a(MapMultimap.this.f57705g.get(aVar.f57706b));
                }

                @Override // java.util.Iterator
                public void remove() {
                    n.e(this.f57708b == 1);
                    this.f57708b = -1;
                    a aVar = a.this;
                    MapMultimap.this.f57705g.remove(aVar.f57706b);
                }
            }

            a(Object obj) {
                this.f57706b = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0451a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapMultimap.this.f57705g.containsKey(this.f57706b) ? 1 : 0;
            }
        }

        MapMultimap(Map<K, V> map) {
            this.f57705g = (Map) com.google.common.base.w.E(map);
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean A(r1<? extends K, ? extends V> r1Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57705g.entrySet().contains(Maps.O(obj, obj2));
        }

        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> a(@CheckForNull Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f57705g.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f57705g.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.c
        Map<K, Collection<V>> c() {
            return new a(this);
        }

        @Override // com.google.common.collect.r1
        public void clear() {
            this.f57705g.clear();
        }

        @Override // com.google.common.collect.r1
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57705g.containsKey(obj);
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean containsValue(@CheckForNull Object obj) {
            return this.f57705g.containsValue(obj);
        }

        @Override // com.google.common.collect.c
        Collection<Map.Entry<K, V>> d() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.c
        Set<K> f() {
            return this.f57705g.keySet();
        }

        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public Set<V> v(@x1 K k10) {
            return new a(k10);
        }

        @Override // com.google.common.collect.c
        s1<K> h() {
            return new c(this);
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public int hashCode() {
            return this.f57705g.hashCode();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public Set<Map.Entry<K, V>> i() {
            return this.f57705g.entrySet();
        }

        @Override // com.google.common.collect.c
        Collection<V> j() {
            return this.f57705g.values();
        }

        @Override // com.google.common.collect.c
        Iterator<Map.Entry<K, V>> k() {
            return this.f57705g.entrySet().iterator();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean put(@x1 K k10, @x1 V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57705g.entrySet().remove(Maps.O(obj, obj2));
        }

        @Override // com.google.common.collect.r1
        public int size() {
            return this.f57705g.size();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean t0(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements o1<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableListMultimap(o1<K, V> o1Var) {
            super(o1Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public o1<K, V> H0() {
            return (o1) super.H0();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V> a(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V> b(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public List<V> v(@x1 K k10) {
            return Collections.unmodifiableList(X0().v((Object) k10));
        }
    }

    public static class UnmodifiableMultimap<K, V> extends u0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r1<K, V> f57710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        @t9.b
        transient Collection<Map.Entry<K, V>> f57711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        @t9.b
        transient s1<K> f57712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        @t9.b
        transient Set<K> f57713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        @t9.b
        transient Collection<V> f57714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        @t9.b
        transient Map<K, Collection<V>> f57715g;

        public class a implements com.google.common.base.n<Collection<V>, Collection<V>> {
            a(UnmodifiableMultimap unmodifiableMultimap) {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return Multimaps.O(collection);
            }
        }

        UnmodifiableMultimap(r1<K, V> r1Var) {
            this.f57710b = (r1) com.google.common.base.w.E(r1Var);
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public boolean A(r1<? extends K, ? extends V> r1Var) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.u0, com.google.common.collect.y0
        public r1<K, V> H0() {
            return this.f57710b;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public Collection<V> a(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public Collection<V> b(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public Map<K, Collection<V>> e() {
            Map<K, Collection<V>> map = this.f57715g;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(Maps.B0(this.f57710b.e(), new a(this)));
            this.f57715g = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public Collection<V> v(@x1 K k10) {
            return Multimaps.O(this.f57710b.v(k10));
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public Collection<Map.Entry<K, V>> i() {
            Collection<Map.Entry<K, V>> collection = this.f57711c;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionG = Multimaps.G(this.f57710b.i());
            this.f57711c = collectionG;
            return collectionG;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public Set<K> keySet() {
            Set<K> set = this.f57713e;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.f57710b.keySet());
            this.f57713e = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public s1<K> n0() {
            s1<K> s1Var = this.f57712d;
            if (s1Var != null) {
                return s1Var;
            }
            s1<K> s1VarA = Multisets.A(this.f57710b.n0());
            this.f57712d = s1VarA;
            return s1VarA;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public boolean put(@x1 K k10, @x1 V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public boolean t0(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.r1
        public Collection<V> values() {
            Collection<V> collection = this.f57714f;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f57710b.values());
            this.f57714f = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements i2<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSetMultimap(i2<K, V> i2Var) {
            super(i2Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
        public i2<K, V> H0() {
            return (i2) super.H0();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> a(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public Set<V> v(@x1 K k10) {
            return Collections.unmodifiableSet(H0().v((Object) k10));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1
        public Set<Map.Entry<K, V>> i() {
            return Maps.J0(H0().i());
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements t2<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSortedSetMultimap(t2<K, V> t2Var) {
            super(t2Var);
        }

        @Override // com.google.common.collect.t2
        @CheckForNull
        public Comparator<? super V> I() {
            return H0().I();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public t2<K, V> H0() {
            return (t2) super.H0();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public SortedSet<V> a(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        public SortedSet<V> b(@x1 K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public SortedSet<V> v(@x1 K k10) {
            return Collections.unmodifiableSortedSet(H0().v((Object) k10));
        }
    }

    public static final class a<K, V> extends Maps.n0<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @u9.g
        private final r1<K, V> f57716e;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a, reason: collision with other inner class name */
        public class C0452a extends Maps.q<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a$a, reason: collision with other inner class name */
            public class C0453a implements com.google.common.base.n<K, Collection<V>> {
                C0453a() {
                }

                @Override // com.google.common.base.n
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(@x1 K k10) {
                    return a.this.f57716e.v(k10);
                }
            }

            C0452a() {
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, Collection<V>> h() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.m(a.this.f57716e.keySet(), new C0453a());
            }

            @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.g(entry.getKey());
                return true;
            }
        }

        a(r1<K, V> r1Var) {
            this.f57716e = (r1) com.google.common.base.w.E(r1Var);
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new C0452a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f57716e.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57716e.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object obj) {
            if (containsKey(obj)) {
                return this.f57716e.v(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object obj) {
            if (containsKey(obj)) {
                return this.f57716e.a(obj);
            }
            return null;
        }

        void g(@CheckForNull Object obj) {
            this.f57716e.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f57716e.isEmpty();
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return this.f57716e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57716e.keySet().size();
        }
    }

    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        abstract r1<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().D0(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static class c<K, V> extends com.google.common.collect.d<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @u9.g
        final r1<K, V> f57719d;

        public class a extends w2<Map.Entry<K, Collection<V>>, s1.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c$a$a, reason: collision with other inner class name */
            public class C0454a extends Multisets.f<K> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f57720b;

                C0454a(a aVar, Map.Entry entry) {
                    this.f57720b = entry;
                }

                @Override // com.google.common.collect.s1.a
                @x1
                public K a() {
                    return (K) this.f57720b.getKey();
                }

                @Override // com.google.common.collect.s1.a
                public int getCount() {
                    return ((Collection) this.f57720b.getValue()).size();
                }
            }

            a(c cVar, Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.w2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public s1.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0454a(this, entry);
            }
        }

        c(r1<K, V> r1Var) {
            this.f57719d = r1Var;
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            Collection collection = (Collection) Maps.p0(this.f57719d.e(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.s1
        public Set<K> c() {
            return this.f57719d.keySet();
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f57719d.clear();
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public boolean contains(@CheckForNull Object obj) {
            return this.f57719d.containsKey(obj);
        }

        @Override // com.google.common.collect.d
        int e() {
            return this.f57719d.e().size();
        }

        @Override // com.google.common.collect.d
        Iterator<K> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<K>> h() {
            return new a(this, this.f57719d.e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
        public Iterator<K> iterator() {
            return Maps.S(this.f57719d.i().iterator());
        }

        @Override // com.google.common.collect.d, com.google.common.collect.s1
        public int n1(@CheckForNull Object obj, int i10) {
            n.b(i10, "occurrences");
            if (i10 == 0) {
                return E1(obj);
            }
            Collection collection = (Collection) Maps.p0(this.f57719d.e(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i10 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i11 = 0; i11 < i10; i11++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public int size() {
            return this.f57719d.size();
        }
    }

    public static final class d<K, V1, V2> extends e<K, V1, V2> implements o1<K, V2> {
        d(o1<K, V1> o1Var, Maps.r<? super K, ? super V1, V2> rVar) {
            super(o1Var, rVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.e, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V2> a(@CheckForNull Object obj) {
            return m(obj, this.f57721g.a(obj));
        }

        @Override // com.google.common.collect.Multimaps.e, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
        public List<V2> b(@x1 K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.e, com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public List<V2> v(@x1 K k10) {
            return m(k10, this.f57721g.v(k10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multimaps.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<V2> m(@x1 K k10, Collection<V1> collection) {
            return Lists.D((List) collection, Maps.n(this.f57722h, k10));
        }
    }

    public static class e<K, V1, V2> extends com.google.common.collect.c<K, V2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final r1<K, V1> f57721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Maps.r<? super K, ? super V1, V2> f57722h;

        public class a implements Maps.r<K, Collection<V1>, Collection<V2>> {
            a() {
            }

            @Override // com.google.common.collect.Maps.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V2> a(@x1 K k10, Collection<V1> collection) {
                return e.this.m(k10, collection);
            }
        }

        e(r1<K, V1> r1Var, Maps.r<? super K, ? super V1, V2> rVar) {
            this.f57721g = (r1) com.google.common.base.w.E(r1Var);
            this.f57722h = (Maps.r) com.google.common.base.w.E(rVar);
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean A(r1<? extends K, ? extends V2> r1Var) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        public Collection<V2> a(@CheckForNull Object obj) {
            return m(obj, this.f57721g.a(obj));
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
        public Collection<V2> b(@x1 K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.c
        Map<K, Collection<V2>> c() {
            return Maps.x0(this.f57721g.e(), new a());
        }

        @Override // com.google.common.collect.r1
        public void clear() {
            this.f57721g.clear();
        }

        @Override // com.google.common.collect.r1
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57721g.containsKey(obj);
        }

        @Override // com.google.common.collect.c
        Collection<Map.Entry<K, V2>> d() {
            return new com.google.common.collect.c.a();
        }

        @Override // com.google.common.collect.c
        Set<K> f() {
            return this.f57721g.keySet();
        }

        @Override // com.google.common.collect.r1, com.google.common.collect.o1
        /* JADX INFO: renamed from: get */
        public Collection<V2> v(@x1 K k10) {
            return m(k10, this.f57721g.v(k10));
        }

        @Override // com.google.common.collect.c
        s1<K> h() {
            return this.f57721g.n0();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean isEmpty() {
            return this.f57721g.isEmpty();
        }

        @Override // com.google.common.collect.c
        Collection<V2> j() {
            return o.m(this.f57721g.i(), Maps.h(this.f57722h));
        }

        @Override // com.google.common.collect.c
        Iterator<Map.Entry<K, V2>> k() {
            return Iterators.c0(this.f57721g.i().iterator(), Maps.g(this.f57722h));
        }

        Collection<V2> m(@x1 K k10, Collection<V1> collection) {
            com.google.common.base.n nVarN = Maps.n(this.f57722h, k10);
            return collection instanceof List ? Lists.D((List) collection, nVarN) : o.m(collection, nVarN);
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean put(@x1 K k10, @x1 V2 v10) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return v(obj).remove(obj2);
        }

        @Override // com.google.common.collect.r1
        public int size() {
            return this.f57721g.size();
        }

        @Override // com.google.common.collect.c, com.google.common.collect.r1
        public boolean t0(@x1 K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    private Multimaps() {
    }

    public static <K, V> i2<K, V> A(i2<K, V> i2Var) {
        return Synchronized.v(i2Var, null);
    }

    public static <K, V> t2<K, V> B(t2<K, V> t2Var) {
        return Synchronized.y(t2Var, null);
    }

    public static <K, V1, V2> o1<K, V2> C(o1<K, V1> o1Var, Maps.r<? super K, ? super V1, V2> rVar) {
        return new d(o1Var, rVar);
    }

    public static <K, V1, V2> r1<K, V2> D(r1<K, V1> r1Var, Maps.r<? super K, ? super V1, V2> rVar) {
        return new e(r1Var, rVar);
    }

    public static <K, V1, V2> o1<K, V2> E(o1<K, V1> o1Var, com.google.common.base.n<? super V1, V2> nVar) {
        com.google.common.base.w.E(nVar);
        return C(o1Var, Maps.i(nVar));
    }

    public static <K, V1, V2> r1<K, V2> F(r1<K, V1> r1Var, com.google.common.base.n<? super V1, V2> nVar) {
        com.google.common.base.w.E(nVar);
        return D(r1Var, Maps.i(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> G(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? Maps.J0((Set) collection) : new Maps.j0(Collections.unmodifiableCollection(collection));
    }

    @Deprecated
    public static <K, V> o1<K, V> H(ImmutableListMultimap<K, V> immutableListMultimap) {
        return (o1) com.google.common.base.w.E(immutableListMultimap);
    }

    public static <K, V> o1<K, V> I(o1<K, V> o1Var) {
        return ((o1Var instanceof UnmodifiableListMultimap) || (o1Var instanceof ImmutableListMultimap)) ? o1Var : new UnmodifiableListMultimap(o1Var);
    }

    @Deprecated
    public static <K, V> r1<K, V> J(ImmutableMultimap<K, V> immutableMultimap) {
        return (r1) com.google.common.base.w.E(immutableMultimap);
    }

    public static <K, V> r1<K, V> K(r1<K, V> r1Var) {
        return ((r1Var instanceof UnmodifiableMultimap) || (r1Var instanceof ImmutableMultimap)) ? r1Var : new UnmodifiableMultimap(r1Var);
    }

    @Deprecated
    public static <K, V> i2<K, V> L(ImmutableSetMultimap<K, V> immutableSetMultimap) {
        return (i2) com.google.common.base.w.E(immutableSetMultimap);
    }

    public static <K, V> i2<K, V> M(i2<K, V> i2Var) {
        return ((i2Var instanceof UnmodifiableSetMultimap) || (i2Var instanceof ImmutableSetMultimap)) ? i2Var : new UnmodifiableSetMultimap(i2Var);
    }

    public static <K, V> t2<K, V> N(t2<K, V> t2Var) {
        return t2Var instanceof UnmodifiableSortedSetMultimap ? t2Var : new UnmodifiableSortedSetMultimap(t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> O(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    @o9.a
    public static <K, V> Map<K, List<V>> c(o1<K, V> o1Var) {
        return o1Var.e();
    }

    @o9.a
    public static <K, V> Map<K, Collection<V>> d(r1<K, V> r1Var) {
        return r1Var.e();
    }

    @o9.a
    public static <K, V> Map<K, Set<V>> e(i2<K, V> i2Var) {
        return i2Var.e();
    }

    @o9.a
    public static <K, V> Map<K, SortedSet<V>> f(t2<K, V> t2Var) {
        return t2Var.e();
    }

    static boolean g(r1<?, ?> r1Var, @CheckForNull Object obj) {
        if (obj == r1Var) {
            return true;
        }
        if (obj instanceof r1) {
            return r1Var.e().equals(((r1) obj).e());
        }
        return false;
    }

    public static <K, V> r1<K, V> h(r1<K, V> r1Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(xVar);
        if (r1Var instanceof i2) {
            return i((i2) r1Var, xVar);
        }
        return r1Var instanceof b0 ? j((b0) r1Var, xVar) : new v((r1) com.google.common.base.w.E(r1Var), xVar);
    }

    public static <K, V> i2<K, V> i(i2<K, V> i2Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(xVar);
        return i2Var instanceof e0 ? k((e0) i2Var, xVar) : new x((i2) com.google.common.base.w.E(i2Var), xVar);
    }

    private static <K, V> r1<K, V> j(b0<K, V> b0Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new v(b0Var.g(), Predicates.d(b0Var.U(), xVar));
    }

    private static <K, V> i2<K, V> k(e0<K, V> e0Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new x(e0Var.g(), Predicates.d(e0Var.U(), xVar));
    }

    public static <K, V> o1<K, V> l(o1<K, V> o1Var, com.google.common.base.x<? super K> xVar) {
        if (!(o1Var instanceof y)) {
            return new y(o1Var, xVar);
        }
        y yVar = (y) o1Var;
        return new y(yVar.g(), Predicates.d(yVar.f58222h, xVar));
    }

    public static <K, V> r1<K, V> m(r1<K, V> r1Var, com.google.common.base.x<? super K> xVar) {
        if (r1Var instanceof i2) {
            return n((i2) r1Var, xVar);
        }
        if (r1Var instanceof o1) {
            return l((o1) r1Var, xVar);
        }
        if (!(r1Var instanceof z)) {
            return r1Var instanceof b0 ? j((b0) r1Var, Maps.U(xVar)) : new z(r1Var, xVar);
        }
        z zVar = (z) r1Var;
        return new z(zVar.f58221g, Predicates.d(zVar.f58222h, xVar));
    }

    public static <K, V> i2<K, V> n(i2<K, V> i2Var, com.google.common.base.x<? super K> xVar) {
        if (!(i2Var instanceof a0)) {
            return i2Var instanceof e0 ? k((e0) i2Var, Maps.U(xVar)) : new a0(i2Var, xVar);
        }
        a0 a0Var = (a0) i2Var;
        return new a0(a0Var.g(), Predicates.d(a0Var.f58222h, xVar));
    }

    public static <K, V> r1<K, V> o(r1<K, V> r1Var, com.google.common.base.x<? super V> xVar) {
        return h(r1Var, Maps.Q0(xVar));
    }

    public static <K, V> i2<K, V> p(i2<K, V> i2Var, com.google.common.base.x<? super V> xVar) {
        return i(i2Var, Maps.Q0(xVar));
    }

    public static <K, V> i2<K, V> q(Map<K, V> map) {
        return new MapMultimap(map);
    }

    public static <K, V> ImmutableListMultimap<K, V> r(Iterable<V> iterable, com.google.common.base.n<? super V, K> nVar) {
        return s(iterable.iterator(), nVar);
    }

    public static <K, V> ImmutableListMultimap<K, V> s(Iterator<V> it, com.google.common.base.n<? super V, K> nVar) {
        com.google.common.base.w.E(nVar);
        ImmutableListMultimap.a aVarM = ImmutableListMultimap.M();
        while (it.hasNext()) {
            V next = it.next();
            com.google.common.base.w.F(next, it);
            aVarM.f(nVar.apply(next), next);
        }
        return aVarM.a();
    }

    @s9.a
    public static <K, V, M extends r1<K, V>> M t(r1<? extends V, ? extends K> r1Var, M m10) {
        com.google.common.base.w.E(m10);
        for (Map.Entry<? extends V, ? extends K> entry : r1Var.i()) {
            m10.put(entry.getValue(), entry.getKey());
        }
        return m10;
    }

    public static <K, V> o1<K, V> u(Map<K, Collection<V>> map, com.google.common.base.c0<? extends List<V>> c0Var) {
        return new CustomListMultimap(map, c0Var);
    }

    public static <K, V> r1<K, V> v(Map<K, Collection<V>> map, com.google.common.base.c0<? extends Collection<V>> c0Var) {
        return new CustomMultimap(map, c0Var);
    }

    public static <K, V> i2<K, V> w(Map<K, Collection<V>> map, com.google.common.base.c0<? extends Set<V>> c0Var) {
        return new CustomSetMultimap(map, c0Var);
    }

    public static <K, V> t2<K, V> x(Map<K, Collection<V>> map, com.google.common.base.c0<? extends SortedSet<V>> c0Var) {
        return new CustomSortedSetMultimap(map, c0Var);
    }

    public static <K, V> o1<K, V> y(o1<K, V> o1Var) {
        return Synchronized.k(o1Var, null);
    }

    public static <K, V> r1<K, V> z(r1<K, V> r1Var) {
        return Synchronized.m(r1Var, null);
    }
}
