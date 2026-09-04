package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FilteredEntryMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public class v<K, V> extends com.google.common.collect.c<K, V> implements b0<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final r1<K, V> f58176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.google.common.base.x<? super Map.Entry<K, V>> f58177h;

    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    public class a extends Maps.n0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        public class C0465a extends Maps.q<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.v$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FilteredEntryMultimap.java */
            public class C0466a extends AbstractIterator<Map.Entry<K, Collection<V>>> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final Iterator<Map.Entry<K, Collection<V>>> f58180d;

                C0466a() {
                    this.f58180d = v.this.f58176g.e().entrySet().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> a() {
                    while (this.f58180d.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f58180d.next();
                        K key = next.getKey();
                        Collection collectionN = v.n(next.getValue(), new c(key));
                        if (!collectionN.isEmpty()) {
                            return Maps.O(key, collectionN);
                        }
                    }
                    return b();
                }
            }

            C0465a() {
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, Collection<V>> h() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0466a();
            }

            @Override // com.google.common.collect.Maps.q, com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.this.o(Predicates.n(collection));
            }

            @Override // com.google.common.collect.Maps.q, com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.this.o(Predicates.q(Predicates.n(collection)));
            }

            @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Iterators.Z(iterator());
            }
        }

        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        public class b extends Maps.z<K, Collection<V>> {
            b() {
                super(a.this);
            }

            @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                return a.this.remove(obj) != null;
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.this.o(Maps.U(Predicates.n(collection)));
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.this.o(Maps.U(Predicates.q(Predicates.n(collection))));
            }
        }

        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        public class c extends Maps.m0<K, Collection<V>> {
            c() {
                super(a.this);
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<K, Collection<V>>> it = v.this.f58176g.e().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection collectionN = v.n(next.getValue(), new c(next.getKey()));
                    if (!collectionN.isEmpty() && collection.equals(collectionN)) {
                        if (collectionN.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        collectionN.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return v.this.o(Maps.Q0(Predicates.n(collection)));
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return v.this.o(Maps.Q0(Predicates.q(Predicates.n(collection))));
            }
        }

        a() {
        }

        @Override // com.google.common.collect.Maps.n0
        Set<Map.Entry<K, Collection<V>>> a() {
            return new C0465a();
        }

        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new b();
        }

        @Override // com.google.common.collect.Maps.n0
        Collection<Collection<V>> c() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object obj) {
            Collection<V> collection = v.this.f58176g.e().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionN = v.n(collection, new c(obj));
            if (collectionN.isEmpty()) {
                return null;
            }
            return collectionN;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object obj) {
            Collection<V> collection = v.this.f58176g.e().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListQ = Lists.q();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (v.this.p(obj, next)) {
                    it.remove();
                    arrayListQ.add(next);
                }
            }
            if (arrayListQ.isEmpty()) {
                return null;
            }
            return v.this.f58176g instanceof i2 ? Collections.unmodifiableSet(Sets.B(arrayListQ)) : Collections.unmodifiableList(arrayListQ);
        }
    }

    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    public class b extends Multimaps.c<K, V> {

        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        public class a extends Multisets.i<K> {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean j(com.google.common.base.x xVar, Map.Entry entry) {
                return xVar.apply(Multisets.k(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            private boolean l(final com.google.common.base.x<? super s1.a<K>> xVar) {
                return v.this.o(new com.google.common.base.x() { // from class: com.google.common.collect.w
                    @Override // com.google.common.base.x
                    public final boolean apply(Object obj) {
                        return v.b.a.j(xVar, (Map.Entry) obj);
                    }
                });
            }

            @Override // com.google.common.collect.Multisets.i
            s1<K> h() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<s1.a<K>> iterator() {
                return b.this.h();
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return l(Predicates.n(collection));
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return l(Predicates.q(Predicates.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return v.this.keySet().size();
            }
        }

        b() {
            super(v.this);
        }

        @Override // com.google.common.collect.d, com.google.common.collect.s1
        public Set<s1.a<K>> entrySet() {
            return new a();
        }

        @Override // com.google.common.collect.Multimaps.c, com.google.common.collect.d, com.google.common.collect.s1
        public int n1(@CheckForNull Object obj, int i10) {
            n.b(i10, "occurrences");
            if (i10 == 0) {
                return E1(obj);
            }
            Collection<V> collection = v.this.f58176g.e().get(obj);
            int i11 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (v.this.p(obj, it.next()) && (i11 = i11 + 1) <= i10) {
                    it.remove();
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    public final class c implements com.google.common.base.x<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final K f58186b;

        c(K k10) {
            this.f58186b = k10;
        }

        @Override // com.google.common.base.x
        public boolean apply(@x1 V v10) {
            return v.this.p(this.f58186b, v10);
        }
    }

    v(r1<K, V> r1Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        this.f58176g = (r1) com.google.common.base.w.E(r1Var);
        this.f58177h = (com.google.common.base.x) com.google.common.base.w.E(xVar);
    }

    static <E> Collection<E> n(Collection<E> collection, com.google.common.base.x<? super E> xVar) {
        return collection instanceof Set ? Sets.i((Set) collection, xVar) : o.d(collection, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(@x1 K k10, @x1 V v10) {
        return this.f58177h.apply(Maps.O(k10, v10));
    }

    @Override // com.google.common.collect.b0
    public com.google.common.base.x<? super Map.Entry<K, V>> U() {
        return this.f58177h;
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public Collection<V> a(@CheckForNull Object obj) {
        return (Collection) com.google.common.base.q.a(e().remove(obj), q());
    }

    @Override // com.google.common.collect.c
    Map<K, Collection<V>> c() {
        return new a();
    }

    @Override // com.google.common.collect.r1
    public void clear() {
        i().clear();
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        return e().get(obj) != null;
    }

    @Override // com.google.common.collect.c
    Collection<Map.Entry<K, V>> d() {
        return n(this.f58176g.i(), this.f58177h);
    }

    @Override // com.google.common.collect.c
    Set<K> f() {
        return e().keySet();
    }

    @Override // com.google.common.collect.b0, com.google.common.collect.e0
    public r1<K, V> g() {
        return this.f58176g;
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public Collection<V> v(@x1 K k10) {
        return n(this.f58176g.v(k10), new c(k10));
    }

    @Override // com.google.common.collect.c
    s1<K> h() {
        return new b();
    }

    @Override // com.google.common.collect.c
    Collection<V> j() {
        return new c0(this);
    }

    @Override // com.google.common.collect.c
    Iterator<Map.Entry<K, V>> k() {
        throw new AssertionError("should never be called");
    }

    boolean o(com.google.common.base.x<? super Map.Entry<K, Collection<V>>> xVar) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f58176g.e().entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionN = n(next.getValue(), new c(key));
            if (!collectionN.isEmpty() && xVar.apply(Maps.O(key, collectionN))) {
                if (collectionN.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionN.clear();
                }
                z10 = true;
            }
        }
        return z10;
    }

    Collection<V> q() {
        return this.f58176g instanceof i2 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.r1
    public int size() {
        return i().size();
    }
}
