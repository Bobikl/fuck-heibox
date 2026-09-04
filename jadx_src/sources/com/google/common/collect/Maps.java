package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@com.google.common.collect.u
public final class Maps {

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.common.collect.l<A, B> f57616d;

        BiMapConverter(com.google.common.collect.l<A, B> lVar) {
            this.f57616d = (com.google.common.collect.l) com.google.common.base.w.E(lVar);
        }

        private static <X, Y> Y o(com.google.common.collect.l<X, Y> lVar, X x10) {
            Y y10 = lVar.get(x10);
            com.google.common.base.w.u(y10 != null, "No non-null mapping present for input: %s", x10);
            return y10;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.f57616d.equals(((BiMapConverter) obj).f57616d);
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        protected A h(B b10) {
            return (A) o(this.f57616d.i0(), b10);
        }

        public int hashCode() {
            return this.f57616d.hashCode();
        }

        @Override // com.google.common.base.Converter
        protected B i(A a10) {
            return (B) o(this.f57616d, a10);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f57616d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
            sb2.append("Maps.asConverter(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum EntryFunction implements com.google.common.base.n<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.n
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.n
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ EntryFunction(e eVar) {
            this();
        }
    }

    public static class UnmodifiableBiMap<K, V> extends s0<K, V> implements com.google.common.collect.l<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V> f57617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.collect.l<? extends K, ? extends V> f57618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        @u9.f
        com.google.common.collect.l<V, K> f57619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        transient Set<V> f57620e;

        UnmodifiableBiMap(com.google.common.collect.l<? extends K, ? extends V> lVar, @CheckForNull com.google.common.collect.l<V, K> lVar2) {
            this.f57617b = Collections.unmodifiableMap(lVar);
            this.f57618c = lVar;
            this.f57619d = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s0, com.google.common.collect.y0
        public Map<K, V> H0() {
            return this.f57617b;
        }

        @Override // com.google.common.collect.l
        @CheckForNull
        public V R(@x1 K k10, @x1 V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l
        public com.google.common.collect.l<V, K> i0() {
            com.google.common.collect.l<V, K> lVar = this.f57619d;
            if (lVar != null) {
                return lVar;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f57618c.i0(), this);
            this.f57619d = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
        public Set<V> values() {
            Set<V> set = this.f57620e;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.f57618c.values());
            this.f57620e = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    @o9.c
    public static class UnmodifiableNavigableMap<K, V> extends c1<K, V> implements NavigableMap<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap<K, ? extends V> f57621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private transient UnmodifiableNavigableMap<K, V> f57622c;

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.f57621b = navigableMap;
        }

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.f57621b = navigableMap;
            this.f57622c = unmodifiableNavigableMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c1, com.google.common.collect.s0
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> H0() {
            return Collections.unmodifiableSortedMap(this.f57621b);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(@x1 K k10) {
            return Maps.M0(this.f57621b.ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@x1 K k10) {
            return this.f57621b.ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.O(this.f57621b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.f57622c;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.f57621b.descendingMap(), this);
            this.f57622c = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return Maps.M0(this.f57621b.firstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(@x1 K k10) {
            return Maps.M0(this.f57621b.floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@x1 K k10) {
            return this.f57621b.floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@x1 K k10, boolean z10) {
            return Maps.L0(this.f57621b.headMap(k10, z10));
        }

        @Override // com.google.common.collect.c1, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(@x1 K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(@x1 K k10) {
            return Maps.M0(this.f57621b.higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@x1 K k10) {
            return this.f57621b.higherKey(k10);
        }

        @Override // com.google.common.collect.s0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return Maps.M0(this.f57621b.lastEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(@x1 K k10) {
            return Maps.M0(this.f57621b.lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@x1 K k10) {
            return this.f57621b.lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.O(this.f57621b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return Maps.L0(this.f57621b.subMap(k10, z10, k11, z11));
        }

        @Override // com.google.common.collect.c1, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@x1 K k10, boolean z10) {
            return Maps.L0(this.f57621b.tailMap(k10, z10));
        }

        @Override // com.google.common.collect.c1, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(@x1 K k10) {
            return tailMap(k10, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    public class a<V1, V2> implements com.google.common.base.n<V1, V2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f57623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f57624c;

        a(r rVar, Object obj) {
            this.f57623b = rVar;
            this.f57624c = obj;
        }

        @Override // com.google.common.base.n
        @x1
        public V2 apply(@x1 V1 v10) {
            return (V2) this.f57623b.a(this.f57624c, v10);
        }
    }

    public static class a0<K, V> implements p1<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f57625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V> f57626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<K, V> f57627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<K, p1.a<V>> f57628d;

        a0(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, p1.a<V>> map4) {
            this.f57625a = Maps.K0(map);
            this.f57626b = Maps.K0(map2);
            this.f57627c = Maps.K0(map3);
            this.f57628d = Maps.K0(map4);
        }

        @Override // com.google.common.collect.p1
        public Map<K, p1.a<V>> a() {
            return this.f57628d;
        }

        @Override // com.google.common.collect.p1
        public Map<K, V> b() {
            return this.f57626b;
        }

        @Override // com.google.common.collect.p1
        public Map<K, V> c() {
            return this.f57625a;
        }

        @Override // com.google.common.collect.p1
        public Map<K, V> d() {
            return this.f57627c;
        }

        @Override // com.google.common.collect.p1
        public boolean e() {
            return this.f57625a.isEmpty() && this.f57626b.isEmpty() && this.f57628d.isEmpty();
        }

        @Override // com.google.common.collect.p1
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p1)) {
                return false;
            }
            p1 p1Var = (p1) obj;
            return c().equals(p1Var.c()) && b().equals(p1Var.b()) && d().equals(p1Var.d()) && a().equals(p1Var.a());
        }

        @Override // com.google.common.collect.p1
        public int hashCode() {
            return com.google.common.base.s.b(c(), b(), d(), a());
        }

        public String toString() {
            if (e()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f57625a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f57625a);
            }
            if (!this.f57626b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f57626b);
            }
            if (!this.f57628d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f57628d);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public class b<K, V1, V2> implements com.google.common.base.n<Map.Entry<K, V1>, V2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f57629b;

        b(r rVar) {
            this.f57629b = rVar;
        }

        @Override // com.google.common.base.n
        @x1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f57629b.a(entry.getKey(), entry.getValue());
        }
    }

    @o9.c
    public static final class b0<K, V> extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet<K> f57630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.base.n<? super K, V> f57631c;

        b0(NavigableSet<K> navigableSet, com.google.common.base.n<? super K, V> nVar) {
            this.f57630b = (NavigableSet) com.google.common.base.w.E(navigableSet);
            this.f57631c = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<K, V>> a() {
            return Maps.m(this.f57630b, this.f57631c);
        }

        @Override // com.google.common.collect.e
        Iterator<Map.Entry<K, V>> b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f57630b.clear();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return this.f57630b.comparator();
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.k(this.f57630b.descendingSet(), this.f57631c);
        }

        @Override // com.google.common.collect.e, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            if (com.google.common.collect.o.j(this.f57630b, obj)) {
                return this.f57631c.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@x1 K k10, boolean z10) {
            return Maps.k(this.f57630b.headSet(k10, z10), this.f57631c);
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Maps.l0(this.f57630b);
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57630b.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return Maps.k(this.f57630b.subSet(k10, z10, k11, z11), this.f57631c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@x1 K k10, boolean z10) {
            return Maps.k(this.f57630b.tailSet(k10, z10), this.f57631c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    public class c<K, V2> extends com.google.common.collect.b<K, V2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f57632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f57633c;

        c(Map.Entry entry, r rVar) {
            this.f57632b = entry;
            this.f57633c = rVar;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getKey() {
            return (K) this.f57632b.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V2 getValue() {
            return (V2) this.f57633c.a(this.f57632b.getKey(), this.f57632b.getValue());
        }
    }

    @o9.c
    public static class c0<K, V> extends e0<K, V> implements NavigableSet<K> {
        c0(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(@x1 K k10) {
            return h().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return h().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(@x1 K k10) {
            return h().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@x1 K k10, boolean z10) {
            return h().headMap(k10, z10).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.e0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@x1 K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(@x1 K k10) {
            return h().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.e0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> i() {
            return (NavigableMap) this.f57677b;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(@x1 K k10) {
            return h().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) Maps.T(h().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) Maps.T(h().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return h().subMap(k10, z10, k11, z11).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.e0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@x1 K k10, @x1 K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@x1 K k10, boolean z10) {
            return h().tailMap(k10, z10).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.e0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@x1 K k10) {
            return tailSet(k10, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public class d<K, V1, V2> implements com.google.common.base.n<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f57634b;

        d(r rVar) {
            this.f57634b = rVar;
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return Maps.A0(this.f57634b, entry);
        }
    }

    public static class d0<K, V> extends o<K, V> implements SortedMap<K, V> {
        d0(SortedSet<K> sortedSet, com.google.common.base.n<? super K, V> nVar) {
            super(sortedSet, nVar);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> d() {
            return (SortedSet) super.d();
        }

        @Override // java.util.SortedMap
        @x1
        public K firstKey() {
            return d().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@x1 K k10) {
            return Maps.l(d().headSet(k10), this.f57654f);
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return Maps.n0(d());
        }

        @Override // java.util.SortedMap
        @x1
        public K lastKey() {
            return d().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
            return Maps.l(d().subSet(k10, k11), this.f57654f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@x1 K k10) {
            return Maps.l(d().tailSet(k10), this.f57654f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class e<K, V> extends w2<Map.Entry<K, V>, K> {
        e(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w2
        @x1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    public static class e0<K, V> extends z<K, V> implements SortedSet<K> {
        e0(SortedMap<K, V> sortedMap) {
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
            return new e0(i().headMap(k10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.z
        public SortedMap<K, V> i() {
            return (SortedMap) super.i();
        }

        @Override // java.util.SortedSet
        @x1
        public K last() {
            return i().lastKey();
        }

        public SortedSet<K> subSet(@x1 K k10, @x1 K k11) {
            return new e0(i().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(@x1 K k10) {
            return new e0(i().tailMap(k10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class f<K, V> extends w2<Map.Entry<K, V>, V> {
        f(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w2
        @x1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static class f0<K, V> extends a0<K, V> implements m2<K, V> {
        f0(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, p1.a<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.a0, com.google.common.collect.p1
        public SortedMap<K, p1.a<V>> a() {
            return (SortedMap) super.a();
        }

        @Override // com.google.common.collect.Maps.a0, com.google.common.collect.p1
        public SortedMap<K, V> b() {
            return (SortedMap) super.b();
        }

        @Override // com.google.common.collect.Maps.a0, com.google.common.collect.p1
        public SortedMap<K, V> c() {
            return (SortedMap) super.c();
        }

        @Override // com.google.common.collect.Maps.a0, com.google.common.collect.p1
        public SortedMap<K, V> d() {
            return (SortedMap) super.d();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class g<K, V> extends w2<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f57635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Iterator it, com.google.common.base.n nVar) {
            super(it);
            this.f57635c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@x1 K k10) {
            return Maps.O(k10, this.f57635c.apply(k10));
        }
    }

    public static class g0<K, V1, V2> extends y<K, V2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V1> f57636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final r<? super K, ? super V1, V2> f57637c;

        g0(Map<K, V1> map, r<? super K, ? super V1, V2> rVar) {
            this.f57636b = (Map) com.google.common.base.w.E(map);
            this.f57637c = (r) com.google.common.base.w.E(rVar);
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<K, V2>> a() {
            return Iterators.c0(this.f57636b.entrySet().iterator(), Maps.g(this.f57637c));
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f57636b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57636b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V2 get(@CheckForNull Object obj) {
            V1 v10 = this.f57636b.get(obj);
            if (v10 != null || this.f57636b.containsKey(obj)) {
                return this.f57637c.a(obj, (Object) t1.a(v10));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f57636b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V2 remove(@CheckForNull Object obj) {
            if (this.f57636b.containsKey(obj)) {
                return this.f57637c.a(obj, (Object) t1.a(this.f57636b.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57636b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new m0(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class h<E> extends a1<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57638b;

        h(Set set) {
            this.f57638b = set;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0 */
        public Set<E> H0() {
            return this.f57638b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }
    }

    @o9.c
    public static class h0<K, V1, V2> extends i0<K, V1, V2> implements NavigableMap<K, V2> {
        h0(NavigableMap<K, V1> navigableMap, r<? super K, ? super V1, V2> rVar) {
            super(navigableMap, rVar);
        }

        @CheckForNull
        private Map.Entry<K, V2> g(@CheckForNull Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return Maps.A0(this.f57637c, entry);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Maps.i0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> ceilingEntry(@x1 K k10) {
            return g(b().ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@x1 K k10) {
            return b().ceilingKey(k10);
        }

        @Override // com.google.common.collect.Maps.i0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(@x1 K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return Maps.y0(b().descendingMap(), this.f57637c);
        }

        @Override // com.google.common.collect.Maps.i0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(@x1 K k10, @x1 K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.Maps.i0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(@x1 K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> firstEntry() {
            return g(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> floorEntry(@x1 K k10) {
            return g(b().floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@x1 K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@x1 K k10, boolean z10) {
            return Maps.y0(b().headMap(k10, z10), this.f57637c);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> higherEntry(@x1 K k10) {
            return g(b().higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@x1 K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> lastEntry() {
            return g(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> lowerEntry(@x1 K k10) {
            return g(b().lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@x1 K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> pollFirstEntry() {
            return g(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> pollLastEntry() {
            return g(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return Maps.y0(b().subMap(k10, z10, k11, z11), this.f57637c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@x1 K k10, boolean z10) {
            return Maps.y0(b().tailMap(k10, z10), this.f57637c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class i<E> extends e1<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SortedSet f57639b;

        i(SortedSet sortedSet) {
            this.f57639b = sortedSet;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.e1, com.google.common.collect.a1
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> H0() {
            return this.f57639b;
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> headSet(@x1 E e10) {
            return Maps.n0(super.headSet(e10));
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
            return Maps.n0(super.subSet(e10, e11));
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> tailSet(@x1 E e10) {
            return Maps.n0(super.tailSet(e10));
        }
    }

    public static class i0<K, V1, V2> extends g0<K, V1, V2> implements SortedMap<K, V2> {
        i0(SortedMap<K, V1> sortedMap, r<? super K, ? super V1, V2> rVar) {
            super(sortedMap, rVar);
        }

        protected SortedMap<K, V1> b() {
            return (SortedMap) this.f57636b;
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @x1
        public K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, V2> headMap(@x1 K k10) {
            return Maps.z0(b().headMap(k10), this.f57637c);
        }

        @Override // java.util.SortedMap
        @x1
        public K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, V2> subMap(@x1 K k10, @x1 K k11) {
            return Maps.z0(b().subMap(k10, k11), this.f57637c);
        }

        public SortedMap<K, V2> tailMap(@x1 K k10) {
            return Maps.z0(b().tailMap(k10), this.f57637c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class j<E> extends x0<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavigableSet f57640b;

        j(NavigableSet navigableSet) {
            this.f57640b = navigableSet;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Maps.l0(super.descendingSet());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x0, com.google.common.collect.e1
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public NavigableSet<E> X0() {
            return this.f57640b;
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
            return Maps.l0(super.headSet(e10, z10));
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> headSet(@x1 E e10) {
            return Maps.n0(super.headSet(e10));
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
            return Maps.l0(super.subSet(e10, z10, e11, z11));
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
            return Maps.n0(super.subSet(e10, e11));
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
            return Maps.l0(super.tailSet(e10, z10));
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> tailSet(@x1 E e10) {
            return Maps.n0(super.tailSet(e10));
        }
    }

    public static class j0<K, V> extends com.google.common.collect.h0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<Map.Entry<K, V>> f57641b;

        j0(Collection<Map.Entry<K, V>> collection) {
            this.f57641b = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h0, com.google.common.collect.y0
        public Collection<Map.Entry<K, V>> H0() {
            return this.f57641b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.I0(this.f57641b.iterator());
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return U0();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) V0(tArr);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class k<K, V> extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f57642b;

        k(Map.Entry entry) {
            this.f57642b = entry;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getKey() {
            return (K) this.f57642b.getKey();
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V getValue() {
            return (V) this.f57642b.getValue();
        }
    }

    public static class k0<K, V> extends j0<K, V> implements Set<Map.Entry<K, V>> {
        k0(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.k(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class l<K, V> extends b3<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f57643b;

        l(Iterator it) {
            this.f57643b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return Maps.H0((Map.Entry) this.f57643b.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57643b.hasNext();
        }
    }

    public static class l0<V> implements p1.a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @x1
        private final V f57644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final V f57645b;

        private l0(@x1 V v10, @x1 V v11) {
            this.f57644a = v10;
            this.f57645b = v11;
        }

        static <V> p1.a<V> c(@x1 V v10, @x1 V v11) {
            return new l0(v10, v11);
        }

        @Override // com.google.common.collect.p1.a
        @x1
        public V a() {
            return this.f57644a;
        }

        @Override // com.google.common.collect.p1.a
        @x1
        public V b() {
            return this.f57645b;
        }

        @Override // com.google.common.collect.p1.a
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof p1.a)) {
                return false;
            }
            p1.a aVar = (p1.a) obj;
            return com.google.common.base.s.a(this.f57644a, aVar.a()) && com.google.common.base.s.a(this.f57645b, aVar.b());
        }

        @Override // com.google.common.collect.p1.a
        public int hashCode() {
            return com.google.common.base.s.b(this.f57644a, this.f57645b);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f57644a);
            String strValueOf2 = String.valueOf(this.f57645b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length());
            sb2.append("(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public class m<K, V1, V2> implements r<K, V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f57646a;

        m(com.google.common.base.n nVar) {
            this.f57646a = nVar;
        }

        @Override // com.google.common.collect.Maps.r
        @x1
        public V2 a(@x1 K k10, @x1 V1 v10) {
            return (V2) this.f57646a.apply(v10);
        }
    }

    public static class m0<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final Map<K, V> f57647b;

        m0(Map<K, V> map) {
            this.f57647b = (Map) com.google.common.base.w.E(map);
        }

        final Map<K, V> a() {
            return this.f57647b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.O0(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (com.google.common.base.s.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.w.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetU = Sets.u();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetU.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetU);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.w.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetU = Sets.u();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetU.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetU);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static abstract class n<K, V> extends n0<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<K, V> f57648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final com.google.common.base.x<? super Map.Entry<K, V>> f57649f;

        n(Map<K, V> map, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            this.f57648e = map;
            this.f57649f = xVar;
        }

        @Override // com.google.common.collect.Maps.n0
        Collection<V> c() {
            return new x(this, this.f57648e, this.f57649f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57648e.containsKey(obj) && d(obj, this.f57648e.get(obj));
        }

        boolean d(@CheckForNull Object obj, @x1 V v10) {
            return this.f57649f.apply(Maps.O(obj, v10));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            V v10 = this.f57648e.get(obj);
            if (v10 == null || !d(obj, v10)) {
                return null;
            }
            return v10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(@x1 K k10, @x1 V v10) {
            com.google.common.base.w.d(d(k10, v10));
            return this.f57648e.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.w.d(d(entry.getKey(), entry.getValue()));
            }
            this.f57648e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            if (containsKey(obj)) {
                return this.f57648e.remove(obj);
            }
            return null;
        }
    }

    @o9.b
    public static abstract class n0<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private transient Set<Map.Entry<K, V>> f57650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private transient Set<K> f57651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private transient Collection<V> f57652d;

        n0() {
        }

        abstract Set<Map.Entry<K, V>> a();

        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new z(this);
        }

        Collection<V> c() {
            return new m0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f57650b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f57650b = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            Set<K> set = this.f57651c;
            if (set != null) {
                return set;
            }
            Set<K> setG = g();
            this.f57651c = setG;
            return setG;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f57652d;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionC = c();
            this.f57652d = collectionC;
            return collectionC;
        }
    }

    public static class o<K, V> extends n0<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set<K> f57653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final com.google.common.base.n<? super K, V> f57654f;

        public class a extends q<K, V> {
            a() {
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, V> h() {
                return o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return Maps.m(o.this.d(), o.this.f57654f);
            }
        }

        o(Set<K> set, com.google.common.base.n<? super K, V> nVar) {
            this.f57653e = (Set) com.google.common.base.w.E(set);
            this.f57654f = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: b */
        public Set<K> g() {
            return Maps.m0(d());
        }

        @Override // com.google.common.collect.Maps.n0
        Collection<V> c() {
            return com.google.common.collect.o.m(this.f57653e, this.f57654f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return d().contains(obj);
        }

        Set<K> d() {
            return this.f57653e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            if (com.google.common.collect.o.j(d(), obj)) {
                return this.f57654f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            if (d().remove(obj)) {
                return this.f57654f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return d().size();
        }
    }

    @o9.c
    public static abstract class p<K, V> extends s0<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private transient Comparator<? super K> f57656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private transient Set<Map.Entry<K, V>> f57657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private transient NavigableSet<K> f57658d;

        public class a extends q<K, V> {
            a() {
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, V> h() {
                return p.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return p.this.W0();
            }
        }

        p() {
        }

        private static <T> Ordering<T> Z0(Comparator<T> comparator) {
            return Ordering.i(comparator).E();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s0, com.google.common.collect.y0
        public final Map<K, V> H0() {
            return X0();
        }

        Set<Map.Entry<K, V>> V0() {
            return new a();
        }

        abstract Iterator<Map.Entry<K, V>> W0();

        abstract NavigableMap<K, V> X0();

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(@x1 K k10) {
            return X0().floorEntry(k10);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@x1 K k10) {
            return X0().floorKey(k10);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f57656b;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = X0().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.z();
            }
            Ordering orderingZ0 = Z0(comparator2);
            this.f57656b = orderingZ0;
            return orderingZ0;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return X0().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return X0();
        }

        @Override // com.google.common.collect.s0, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f57657c;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setV0 = V0();
            this.f57657c = setV0;
            return setV0;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return X0().lastEntry();
        }

        @Override // java.util.SortedMap
        @x1
        public K firstKey() {
            return X0().lastKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(@x1 K k10) {
            return X0().ceilingEntry(k10);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@x1 K k10) {
            return X0().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@x1 K k10, boolean z10) {
            return X0().tailMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@x1 K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(@x1 K k10) {
            return X0().lowerEntry(k10);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@x1 K k10) {
            return X0().lowerKey(k10);
        }

        @Override // com.google.common.collect.s0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return X0().firstEntry();
        }

        @Override // java.util.SortedMap
        @x1
        public K lastKey() {
            return X0().firstKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(@x1 K k10) {
            return X0().higherEntry(k10);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@x1 K k10) {
            return X0().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f57658d;
            if (navigableSet != null) {
                return navigableSet;
            }
            c0 c0Var = new c0(this);
            this.f57658d = c0Var;
            return c0Var;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            return X0().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            return X0().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return X0().subMap(k11, z11, k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@x1 K k10, boolean z10) {
            return X0().headMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@x1 K k10) {
            return tailMap(k10, true);
        }

        @Override // com.google.common.collect.y0
        public String toString() {
            return U0();
        }

        @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
        public Collection<V> values() {
            return new m0(this);
        }
    }

    public static abstract class q<K, V> extends Sets.j<Map.Entry<K, V>> {
        q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objP0 = Maps.p0(h(), key);
            if (com.google.common.base.s.a(objP0, entry.getValue())) {
                return objP0 != null || h().containsKey(key);
            }
            return false;
        }

        abstract Map<K, V> h();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return h().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.w.E(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.J(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.w.E(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetY = Sets.y(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetY.add(((Map.Entry) obj).getKey());
                    }
                }
                return h().keySet().retainAll(hashSetY);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h().size();
        }
    }

    public interface r<K, V1, V2> {
        V2 a(@x1 K k10, @x1 V1 v10);
    }

    public static final class s<K, V> extends t<K, V> implements com.google.common.collect.l<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @u9.f
        private final com.google.common.collect.l<V, K> f57660h;

        public class a implements com.google.common.base.x<Map.Entry<V, K>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.common.base.x f57661b;

            a(com.google.common.base.x xVar) {
                this.f57661b = xVar;
            }

            @Override // com.google.common.base.x
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> entry) {
                return this.f57661b.apply(Maps.O(entry.getValue(), entry.getKey()));
            }
        }

        s(com.google.common.collect.l<K, V> lVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            super(lVar, xVar);
            this.f57660h = new s(lVar.i0(), g(xVar), this);
        }

        private s(com.google.common.collect.l<K, V> lVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar, com.google.common.collect.l<V, K> lVar2) {
            super(lVar, xVar);
            this.f57660h = lVar2;
        }

        private static <K, V> com.google.common.base.x<Map.Entry<V, K>> g(com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            return new a(xVar);
        }

        @Override // com.google.common.collect.l
        @CheckForNull
        public V R(@x1 K k10, @x1 V v10) {
            com.google.common.base.w.d(d(k10, v10));
            return h().R(k10, v10);
        }

        com.google.common.collect.l<K, V> h() {
            return (com.google.common.collect.l) this.f57648e;
        }

        @Override // com.google.common.collect.l
        public com.google.common.collect.l<V, K> i0() {
            return this.f57660h;
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f57660h.keySet();
        }
    }

    public static class t<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f57662g;

        public class a extends a1<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Maps$t$a$a, reason: collision with other inner class name */
            public class C0448a extends w2<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: com.google.common.collect.Maps$t$a$a$a, reason: collision with other inner class name */
                public class C0449a extends t0<K, V> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Map.Entry f57665b;

                    C0449a(Map.Entry entry) {
                        this.f57665b = entry;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.t0, com.google.common.collect.y0
                    public Map.Entry<K, V> H0() {
                        return this.f57665b;
                    }

                    @Override // com.google.common.collect.t0, java.util.Map.Entry
                    @x1
                    public V setValue(@x1 V v10) {
                        com.google.common.base.w.d(t.this.d(getKey(), v10));
                        return (V) super.setValue(v10);
                    }
                }

                C0448a(Iterator it) {
                    super(it);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.w2
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> a(Map.Entry<K, V> entry) {
                    return new C0449a(entry);
                }
            }

            private a() {
            }

            /* synthetic */ a(t tVar, e eVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.a1, com.google.common.collect.h0
            /* JADX INFO: renamed from: X0 */
            public Set<Map.Entry<K, V>> H0() {
                return t.this.f57662g;
            }

            @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0448a(t.this.f57662g.iterator());
            }
        }

        public class b extends z<K, V> {
            b() {
                super(t.this);
            }

            @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!t.this.containsKey(obj)) {
                    return false;
                }
                t.this.f57648e.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                t tVar = t.this;
                return t.e(tVar.f57648e, tVar.f57649f, collection);
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                t tVar = t.this;
                return t.f(tVar.f57648e, tVar.f57649f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.s(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.s(iterator()).toArray(tArr);
            }
        }

        t(Map<K, V> map, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            super(map, xVar);
            this.f57662g = Sets.i(map.entrySet(), this.f57649f);
        }

        static <K, V> boolean e(Map<K, V> map, com.google.common.base.x<? super Map.Entry<K, V>> xVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (xVar.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        static <K, V> boolean f(Map<K, V> map, com.google.common.base.x<? super Map.Entry<K, V>> xVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (xVar.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<K, V>> a() {
            return new a(this, null);
        }

        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new b();
        }
    }

    @o9.c
    public static class u<K, V> extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap<K, V> f57668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.base.x<? super Map.Entry<K, V>> f57669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<K, V> f57670d;

        public class a extends c0<K, V> {
            a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return t.e(u.this.f57668b, u.this.f57669c, collection);
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return t.f(u.this.f57668b, u.this.f57669c, collection);
            }
        }

        u(NavigableMap<K, V> navigableMap, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            this.f57668b = (NavigableMap) com.google.common.base.w.E(navigableMap);
            this.f57669c = xVar;
            this.f57670d = new t(navigableMap, xVar);
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<K, V>> a() {
            return Iterators.x(this.f57668b.entrySet().iterator(), this.f57669c);
        }

        @Override // com.google.common.collect.e
        Iterator<Map.Entry<K, V>> b() {
            return Iterators.x(this.f57668b.descendingMap().entrySet().iterator(), this.f57669c);
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f57670d.clear();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return this.f57668b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57670d.containsKey(obj);
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.z(this.f57668b.descendingMap(), this.f57669c);
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f57670d.entrySet();
        }

        @Override // com.google.common.collect.e, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            return this.f57670d.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@x1 K k10, boolean z10) {
            return Maps.z(this.f57668b.headMap(k10, z10), this.f57669c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !l1.c(this.f57668b.entrySet(), this.f57669c);
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) l1.I(this.f57668b.entrySet(), this.f57669c);
        }

        @Override // com.google.common.collect.e, java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) l1.I(this.f57668b.descendingMap().entrySet(), this.f57669c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(@x1 K k10, @x1 V v10) {
            return this.f57670d.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f57670d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            return this.f57670d.remove(obj);
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57670d.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@x1 K k10, boolean z10, @x1 K k11, boolean z11) {
            return Maps.z(this.f57668b.subMap(k10, z10, k11, z11), this.f57669c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@x1 K k10, boolean z10) {
            return Maps.z(this.f57668b.tailMap(k10, z10), this.f57669c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new x(this, this.f57668b, this.f57669c);
        }
    }

    public static class v<K, V> extends t<K, V> implements SortedMap<K, V> {

        public class a extends t<K, V>.b implements SortedSet<K> {
            a() {
                super();
            }

            @Override // java.util.SortedSet
            @CheckForNull
            public Comparator<? super K> comparator() {
                return v.this.i().comparator();
            }

            @Override // java.util.SortedSet
            @x1
            public K first() {
                return (K) v.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@x1 K k10) {
                return (SortedSet) v.this.headMap(k10).keySet();
            }

            @Override // java.util.SortedSet
            @x1
            public K last() {
                return (K) v.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@x1 K k10, @x1 K k11) {
                return (SortedSet) v.this.subMap(k10, k11).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@x1 K k10) {
                return (SortedSet) v.this.tailMap(k10).keySet();
            }
        }

        v(SortedMap<K, V> sortedMap, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            super(sortedMap, xVar);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        @x1
        public K firstKey() {
            return h().iterator().next();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.t, com.google.common.collect.Maps.n0
        public SortedSet<K> g() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            return (SortedSet) super.h();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@x1 K k10) {
            return new v(i().headMap(k10), this.f57649f);
        }

        SortedMap<K, V> i() {
            return (SortedMap) this.f57648e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @x1
        public K lastKey() {
            SortedMap<K, V> sortedMapI = i();
            while (true) {
                K kLastKey = sortedMapI.lastKey();
                if (d(kLastKey, t1.a(this.f57648e.get(kLastKey)))) {
                    return kLastKey;
                }
                sortedMapI = i().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
            return new v(i().subMap(k10, k11), this.f57649f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@x1 K k10) {
            return new v(i().tailMap(k10), this.f57649f);
        }
    }

    public static class w<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final com.google.common.base.x<? super K> f57673g;

        w(Map<K, V> map, com.google.common.base.x<? super K> xVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar2) {
            super(map, xVar2);
            this.f57673g = xVar;
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<K, V>> a() {
            return Sets.i(this.f57648e.entrySet(), this.f57649f);
        }

        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return Sets.i(this.f57648e.keySet(), this.f57673g);
        }

        @Override // com.google.common.collect.Maps.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57648e.containsKey(obj) && this.f57673g.apply(obj);
        }
    }

    public static final class x<K, V> extends m0<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<K, V> f57674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.x<? super Map.Entry<K, V>> f57675d;

        x(Map<K, V> map, Map<K, V> map2, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
            super(map);
            this.f57674c = map2;
            this.f57675d = xVar;
        }

        @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f57674c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f57675d.apply(next) && com.google.common.base.s.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f57674c.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f57675d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f57674c.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f57675d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.s(iterator()).toArray(tArr);
        }
    }

    public static abstract class y<K, V> extends AbstractMap<K, V> {

        public class a extends q<K, V> {
            a() {
            }

            @Override // com.google.common.collect.Maps.q
            Map<K, V> h() {
                return y.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return y.this.a();
            }
        }

        y() {
        }

        abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.h(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    public static class z<K, V> extends Sets.j<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final Map<K, V> f57677b;

        z(Map<K, V> map) {
            this.f57677b = (Map) com.google.common.base.w.E(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return i().containsKey(obj);
        }

        /* JADX INFO: renamed from: h */
        Map<K, V> i() {
            return this.f57677b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.S(i().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            i().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    private Maps() {
    }

    public static <K, V> SortedMap<K, V> A(SortedMap<K, V> sortedMap, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(xVar);
        return sortedMap instanceof v ? E((v) sortedMap, xVar) : new v((SortedMap) com.google.common.base.w.E(sortedMap), xVar);
    }

    static <V2, K, V1> Map.Entry<K, V2> A0(r<? super K, ? super V1, V2> rVar, Map.Entry<K, V1> entry) {
        com.google.common.base.w.E(rVar);
        com.google.common.base.w.E(entry);
        return new c(entry, rVar);
    }

    private static <K, V> com.google.common.collect.l<K, V> B(s<K, V> sVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new s(sVar.h(), Predicates.d(sVar.f57649f, xVar));
    }

    public static <K, V1, V2> Map<K, V2> B0(Map<K, V1> map, com.google.common.base.n<? super V1, V2> nVar) {
        return x0(map, i(nVar));
    }

    private static <K, V> Map<K, V> C(n<K, V> nVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new t(nVar.f57648e, Predicates.d(nVar.f57649f, xVar));
    }

    @o9.c
    public static <K, V1, V2> NavigableMap<K, V2> C0(NavigableMap<K, V1> navigableMap, com.google.common.base.n<? super V1, V2> nVar) {
        return y0(navigableMap, i(nVar));
    }

    @o9.c
    private static <K, V> NavigableMap<K, V> D(u<K, V> uVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new u(((u) uVar).f57668b, Predicates.d(((u) uVar).f57669c, xVar));
    }

    public static <K, V1, V2> SortedMap<K, V2> D0(SortedMap<K, V1> sortedMap, com.google.common.base.n<? super V1, V2> nVar) {
        return z0(sortedMap, i(nVar));
    }

    private static <K, V> SortedMap<K, V> E(v<K, V> vVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        return new v(vVar.i(), Predicates.d(vVar.f57649f, xVar));
    }

    @s9.a
    public static <K, V> ImmutableMap<K, V> E0(Iterable<V> iterable, com.google.common.base.n<? super V, K> nVar) {
        return F0(iterable.iterator(), nVar);
    }

    public static <K, V> com.google.common.collect.l<K, V> F(com.google.common.collect.l<K, V> lVar, com.google.common.base.x<? super K> xVar) {
        com.google.common.base.w.E(xVar);
        return x(lVar, U(xVar));
    }

    @s9.a
    public static <K, V> ImmutableMap<K, V> F0(Iterator<V> it, com.google.common.base.n<? super V, K> nVar) {
        com.google.common.base.w.E(nVar);
        ImmutableMap.b bVarB = ImmutableMap.b();
        while (it.hasNext()) {
            V next = it.next();
            bVarB.i(nVar.apply(next), next);
        }
        try {
            return bVarB.d();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(String.valueOf(e10.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static <K, V> Map<K, V> G(Map<K, V> map, com.google.common.base.x<? super K> xVar) {
        com.google.common.base.w.E(xVar);
        com.google.common.base.x xVarU = U(xVar);
        return map instanceof n ? C((n) map, xVarU) : new w((Map) com.google.common.base.w.E(map), xVar, xVarU);
    }

    public static <K, V> com.google.common.collect.l<K, V> G0(com.google.common.collect.l<? extends K, ? extends V> lVar) {
        return new UnmodifiableBiMap(lVar, null);
    }

    @o9.c
    public static <K, V> NavigableMap<K, V> H(NavigableMap<K, V> navigableMap, com.google.common.base.x<? super K> xVar) {
        return z(navigableMap, U(xVar));
    }

    static <K, V> Map.Entry<K, V> H0(Map.Entry<? extends K, ? extends V> entry) {
        com.google.common.base.w.E(entry);
        return new k(entry);
    }

    public static <K, V> SortedMap<K, V> I(SortedMap<K, V> sortedMap, com.google.common.base.x<? super K> xVar) {
        return A(sortedMap, U(xVar));
    }

    static <K, V> b3<Map.Entry<K, V>> I0(Iterator<Map.Entry<K, V>> it) {
        return new l(it);
    }

    public static <K, V> com.google.common.collect.l<K, V> J(com.google.common.collect.l<K, V> lVar, com.google.common.base.x<? super V> xVar) {
        return x(lVar, Q0(xVar));
    }

    static <K, V> Set<Map.Entry<K, V>> J0(Set<Map.Entry<K, V>> set) {
        return new k0(Collections.unmodifiableSet(set));
    }

    public static <K, V> Map<K, V> K(Map<K, V> map, com.google.common.base.x<? super V> xVar) {
        return y(map, Q0(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> K0(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    @o9.c
    public static <K, V> NavigableMap<K, V> L(NavigableMap<K, V> navigableMap, com.google.common.base.x<? super V> xVar) {
        return z(navigableMap, Q0(xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    public static <K, V> NavigableMap<K, V> L0(NavigableMap<K, ? extends V> navigableMap) {
        com.google.common.base.w.E(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    public static <K, V> SortedMap<K, V> M(SortedMap<K, V> sortedMap, com.google.common.base.x<? super V> xVar) {
        return A(sortedMap, Q0(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public static <K, V> Map.Entry<K, V> M0(@CheckForNull Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return H0(entry);
    }

    @o9.c
    public static ImmutableMap<String, String> N(Properties properties) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            bVarB.i(str, property);
        }
        return bVarB.d();
    }

    static <V> com.google.common.base.n<Map.Entry<?, V>, V> N0() {
        return EntryFunction.VALUE;
    }

    @o9.b(serializable = true)
    public static <K, V> Map.Entry<K, V> O(@x1 K k10, @x1 V v10) {
        return new ImmutableEntry(k10, v10);
    }

    static <K, V> Iterator<V> O0(Iterator<Map.Entry<K, V>> it) {
        return new f(it);
    }

    @o9.b(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> P(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.v();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        com.google.common.collect.n.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((Enum) key, (Object) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            com.google.common.collect.n.a(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return ImmutableEnumMap.K(enumMap);
    }

    @CheckForNull
    static <V> V P0(@CheckForNull Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static <E> ImmutableMap<E, Integer> Q(Collection<E> collection) {
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bVar.i(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return bVar.d();
    }

    static <V> com.google.common.base.x<Map.Entry<?, V>> Q0(com.google.common.base.x<? super V> xVar) {
        return Predicates.h(xVar, N0());
    }

    static <K> com.google.common.base.n<Map.Entry<K, ?>, K> R() {
        return EntryFunction.KEY;
    }

    static <K, V> Iterator<K> S(Iterator<Map.Entry<K, V>> it) {
        return new e(it);
    }

    @CheckForNull
    static <K> K T(@CheckForNull Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static <K> com.google.common.base.x<Map.Entry<K, ?>> U(com.google.common.base.x<? super K> xVar) {
        return Predicates.h(xVar, R());
    }

    public static <K, V> ConcurrentMap<K, V> V() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> W(Class<K> cls) {
        return new EnumMap<>((Class) com.google.common.base.w.E(cls));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> X(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> Y() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> Z(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a0(int i10) {
        return new HashMap<>(o(i10));
    }

    public static <K, V> IdentityHashMap<K, V> b0() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> c0() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> d0(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> e0(int i10) {
        return new LinkedHashMap<>(o(i10));
    }

    public static <A, B> Converter<A, B> f(com.google.common.collect.l<A, B> lVar) {
        return new BiMapConverter(lVar);
    }

    public static <K extends Comparable, V> TreeMap<K, V> f0() {
        return new TreeMap<>();
    }

    static <K, V1, V2> com.google.common.base.n<Map.Entry<K, V1>, Map.Entry<K, V2>> g(r<? super K, ? super V1, V2> rVar) {
        com.google.common.base.w.E(rVar);
        return new d(rVar);
    }

    public static <C, K extends C, V> TreeMap<K, V> g0(@CheckForNull Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    static <K, V1, V2> com.google.common.base.n<Map.Entry<K, V1>, V2> h(r<? super K, ? super V1, V2> rVar) {
        com.google.common.base.w.E(rVar);
        return new b(rVar);
    }

    public static <K, V> TreeMap<K, V> h0(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    static <K, V1, V2> r<K, V1, V2> i(com.google.common.base.n<? super V1, V2> nVar) {
        com.google.common.base.w.E(nVar);
        return new m(nVar);
    }

    static <E> Comparator<? super E> i0(@CheckForNull Comparator<? super E> comparator) {
        return comparator != null ? comparator : Ordering.z();
    }

    public static <K, V> Map<K, V> j(Set<K> set, com.google.common.base.n<? super K, V> nVar) {
        return new o(set, nVar);
    }

    static <K, V> void j0(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @o9.c
    public static <K, V> NavigableMap<K, V> k(NavigableSet<K> navigableSet, com.google.common.base.n<? super K, V> nVar) {
        return new b0(navigableSet, nVar);
    }

    static <K, V> boolean k0(Collection<Map.Entry<K, V>> collection, @CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(H0((Map.Entry) obj));
        }
        return false;
    }

    public static <K, V> SortedMap<K, V> l(SortedSet<K> sortedSet, com.google.common.base.n<? super K, V> nVar) {
        return new d0(sortedSet, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o9.c
    public static <E> NavigableSet<E> l0(NavigableSet<E> navigableSet) {
        return new j(navigableSet);
    }

    static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, com.google.common.base.n<? super K, V> nVar) {
        return new g(set.iterator(), nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> m0(Set<E> set) {
        return new h(set);
    }

    static <K, V1, V2> com.google.common.base.n<V1, V2> n(r<? super K, V1, V2> rVar, @x1 K k10) {
        com.google.common.base.w.E(rVar);
        return new a(rVar, k10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> n0(SortedSet<E> sortedSet) {
        return new i(sortedSet);
    }

    static int o(int i10) {
        if (i10 < 3) {
            com.google.common.collect.n.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static boolean o0(Map<?, ?> map, @CheckForNull Object obj) {
        com.google.common.base.w.E(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <K, V> boolean p(Collection<Map.Entry<K, V>> collection, @CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(H0((Map.Entry) obj));
        }
        return false;
    }

    @CheckForNull
    static <V> V p0(Map<?, V> map, @CheckForNull Object obj) {
        com.google.common.base.w.E(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean q(Map<?, ?> map, @CheckForNull Object obj) {
        return Iterators.q(S(map.entrySet().iterator()), obj);
    }

    @CheckForNull
    static <V> V q0(Map<?, V> map, @CheckForNull Object obj) {
        com.google.common.base.w.E(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean r(Map<?, ?> map, @CheckForNull Object obj) {
        return Iterators.q(O0(map.entrySet().iterator()), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.a
    @o9.c
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> r0(NavigableMap<K, V> navigableMap, Range<K> range) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.z() && range.q() && range.r()) {
            com.google.common.base.w.e(navigableMap.comparator().compare(range.y(), range.K()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.q() && range.r()) {
            Comparable comparableY = range.y();
            BoundType boundTypeX = range.x();
            BoundType boundType = BoundType.CLOSED;
            return navigableMap.subMap(comparableY, boundTypeX == boundType, range.K(), range.J() == boundType);
        }
        if (range.q()) {
            return navigableMap.tailMap(range.y(), range.x() == BoundType.CLOSED);
        }
        if (range.r()) {
            return navigableMap.headMap(range.K(), range.J() == BoundType.CLOSED);
        }
        return (NavigableMap) com.google.common.base.w.E(navigableMap);
    }

    public static <K, V> p1<K, V> s(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? u((SortedMap) map, map2) : t(map, map2, Equivalence.c());
    }

    public static <K, V> com.google.common.collect.l<K, V> s0(com.google.common.collect.l<K, V> lVar) {
        return Synchronized.g(lVar, null);
    }

    public static <K, V> p1<K, V> t(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
        com.google.common.base.w.E(equivalence);
        LinkedHashMap linkedHashMapC0 = c0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapC1 = c0();
        LinkedHashMap linkedHashMapC2 = c0();
        v(map, map2, equivalence, linkedHashMapC0, linkedHashMap, linkedHashMapC1, linkedHashMapC2);
        return new a0(linkedHashMapC0, linkedHashMap, linkedHashMapC1, linkedHashMapC2);
    }

    @o9.c
    public static <K, V> NavigableMap<K, V> t0(NavigableMap<K, V> navigableMap) {
        return Synchronized.o(navigableMap);
    }

    public static <K, V> m2<K, V> u(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        com.google.common.base.w.E(sortedMap);
        com.google.common.base.w.E(map);
        Comparator comparatorI0 = i0(sortedMap.comparator());
        TreeMap treeMapG0 = g0(comparatorI0);
        TreeMap treeMapG1 = g0(comparatorI0);
        treeMapG1.putAll(map);
        TreeMap treeMapG2 = g0(comparatorI0);
        TreeMap treeMapG3 = g0(comparatorI0);
        v(sortedMap, map, Equivalence.c(), treeMapG0, treeMapG1, treeMapG2, treeMapG3);
        return new f0(treeMapG0, treeMapG1, treeMapG2, treeMapG3);
    }

    public static <K, V> ImmutableMap<K, V> u0(Iterable<K> iterable, com.google.common.base.n<? super K, V> nVar) {
        return v0(iterable.iterator(), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void v(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, p1.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) t1.a(map4.remove(key));
                if (equivalence.d(value, aVar)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, l0.c(value, aVar));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static <K, V> ImmutableMap<K, V> v0(Iterator<K> it, com.google.common.base.n<? super K, V> nVar) {
        com.google.common.base.w.E(nVar);
        ImmutableMap.b bVarB = ImmutableMap.b();
        while (it.hasNext()) {
            K next = it.next();
            bVarB.i(next, nVar.apply(next));
        }
        return bVarB.c();
    }

    static boolean w(Map<?, ?> map, @CheckForNull Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String w0(Map<?, ?> map) {
        StringBuilder sbF = com.google.common.collect.o.f(map.size());
        sbF.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbF.append(", ");
            }
            z10 = false;
            sbF.append(entry.getKey());
            sbF.append(n5.a.f132013h);
            sbF.append(entry.getValue());
        }
        sbF.append('}');
        return sbF.toString();
    }

    public static <K, V> com.google.common.collect.l<K, V> x(com.google.common.collect.l<K, V> lVar, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(lVar);
        com.google.common.base.w.E(xVar);
        return lVar instanceof s ? B((s) lVar, xVar) : new s(lVar, xVar);
    }

    public static <K, V1, V2> Map<K, V2> x0(Map<K, V1> map, r<? super K, ? super V1, V2> rVar) {
        return new g0(map, rVar);
    }

    public static <K, V> Map<K, V> y(Map<K, V> map, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(xVar);
        return map instanceof n ? C((n) map, xVar) : new t((Map) com.google.common.base.w.E(map), xVar);
    }

    @o9.c
    public static <K, V1, V2> NavigableMap<K, V2> y0(NavigableMap<K, V1> navigableMap, r<? super K, ? super V1, V2> rVar) {
        return new h0(navigableMap, rVar);
    }

    @o9.c
    public static <K, V> NavigableMap<K, V> z(NavigableMap<K, V> navigableMap, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        com.google.common.base.w.E(xVar);
        return navigableMap instanceof u ? D((u) navigableMap, xVar) : new u((NavigableMap) com.google.common.base.w.E(navigableMap), xVar);
    }

    public static <K, V1, V2> SortedMap<K, V2> z0(SortedMap<K, V1> sortedMap, r<? super K, ? super V1, V2> rVar) {
        return new i0(sortedMap, rVar);
    }
}
