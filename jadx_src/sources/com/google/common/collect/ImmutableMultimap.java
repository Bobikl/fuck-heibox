package com.google.common.collect;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class ImmutableMultimap<K, V> extends j<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f57318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final transient int f57319h;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @u9.g
        final ImmutableMultimap<K, V> f57320c;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.f57320c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f57320c.D0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return this.f57320c.x();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<Map.Entry<K, V>> iterator() {
            return this.f57320c.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f57320c.size();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        Keys() {
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.f57318g.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        @o9.c
        Object l() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.s1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<K> c() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        s1.a<K> y(int i10) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.f57318g.entrySet().a().get(i10);
            return Multisets.k(entry.getKey(), entry.getValue().size());
        }
    }

    @o9.c
    public static final class KeysSerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMultimap<?, ?> f57322b;

        KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.f57322b = immutableMultimap;
        }

        Object a() {
            return this.f57322b.n0();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @u9.g
        private final transient ImmutableMultimap<K, V> f57323c;

        Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f57323c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @o9.c
        int b(Object[] objArr, int i10) {
            b3<? extends ImmutableCollection<V>> it = this.f57323c.f57318g.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().b(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57323c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<V> iterator() {
            return this.f57323c.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f57323c.size();
        }
    }

    public class a extends b3<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f57324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        K f57325c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<V> f57326d = Iterators.u();

        a() {
            this.f57324b = ImmutableMultimap.this.f57318g.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f57326d.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f57324b.next();
                this.f57325c = next.getKey();
                this.f57326d = next.getValue().iterator();
            }
            K k10 = this.f57325c;
            Objects.requireNonNull(k10);
            return Maps.O(k10, this.f57326d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57326d.hasNext() || this.f57324b.hasNext();
        }
    }

    public class b extends b3<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<? extends ImmutableCollection<V>> f57328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator<V> f57329c = Iterators.u();

        b() {
            this.f57328b = ImmutableMultimap.this.f57318g.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57329c.hasNext() || this.f57328b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f57329c.hasNext()) {
                this.f57329c = this.f57328b.next().iterator();
            }
            return this.f57329c.next();
        }
    }

    @s9.f
    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, Collection<V>> f57331a = z1.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        Comparator<? super K> f57332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Comparator<? super V> f57333c;

        public ImmutableMultimap<K, V> a() {
            Collection collectionEntrySet = this.f57331a.entrySet();
            Comparator<? super K> comparator = this.f57332b;
            if (comparator != null) {
                collectionEntrySet = Ordering.i(comparator).C().l(collectionEntrySet);
            }
            return ImmutableListMultimap.P(collectionEntrySet, this.f57333c);
        }

        @s9.a
        c<K, V> b(c<K, V> cVar) {
            for (Map.Entry<K, Collection<V>> entry : cVar.f57331a.entrySet()) {
                j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        Collection<V> c() {
            return new ArrayList();
        }

        @s9.a
        public c<K, V> d(Comparator<? super K> comparator) {
            this.f57332b = (Comparator) com.google.common.base.w.E(comparator);
            return this;
        }

        @s9.a
        public c<K, V> e(Comparator<? super V> comparator) {
            this.f57333c = (Comparator) com.google.common.base.w.E(comparator);
            return this;
        }

        @s9.a
        public c<K, V> f(K k10, V v10) {
            n.a(k10, v10);
            Collection<V> collection = this.f57331a.get(k10);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f57331a;
                Collection<V> collectionC = c();
                map.put(k10, collectionC);
                collection = collectionC;
            }
            collection.add(v10);
            return this;
        }

        @s9.a
        public c<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        @s9.a
        public c<K, V> h(r1<? extends K, ? extends V> r1Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : r1Var.e().entrySet()) {
                j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @o9.a
        @s9.a
        public c<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @s9.a
        public c<K, V> j(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                String strValueOf = String.valueOf(l1.T(iterable));
                throw new NullPointerException(strValueOf.length() != 0 ? "null key in entry: null=".concat(strValueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f57331a.get(k10);
            if (collection != null) {
                for (V v10 : iterable) {
                    n.a(k10, v10);
                    collection.add(v10);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionC = c();
            while (it.hasNext()) {
                V next = it.next();
                n.a(k10, next);
                collectionC.add(next);
            }
            this.f57331a.put(k10, collectionC);
            return this;
        }

        @s9.a
        public c<K, V> k(K k10, V... vArr) {
            return j(k10, Arrays.asList(vArr));
        }
    }

    @o9.c
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2.b<ImmutableMultimap> f57334a = g2.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g2.b<ImmutableMultimap> f57335b = g2.a(ImmutableMultimap.class, UiKitSpanObj.TYPE_SIZE);

        d() {
        }
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i10) {
        this.f57318g = immutableMap;
        this.f57319h = i10;
    }

    public static <K, V> ImmutableMultimap<K, V> B() {
        return ImmutableListMultimap.T();
    }

    public static <K, V> ImmutableMultimap<K, V> C(K k10, V v10) {
        return ImmutableListMultimap.V(k10, v10);
    }

    public static <K, V> ImmutableMultimap<K, V> D(K k10, V v10, K k11, V v11) {
        return ImmutableListMultimap.W(k10, v10, k11, v11);
    }

    public static <K, V> ImmutableMultimap<K, V> E(K k10, V v10, K k11, V v11, K k12, V v12) {
        return ImmutableListMultimap.X(k10, v10, k11, v11, k12, v12);
    }

    public static <K, V> ImmutableMultimap<K, V> F(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return ImmutableListMultimap.Y(k10, v10, k11, v11, k12, v12, k13, v13);
    }

    public static <K, V> ImmutableMultimap<K, V> G(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return ImmutableListMultimap.Z(k10, v10, k11, v11, k12, v12, k13, v13, k14, v14);
    }

    public static <K, V> c<K, V> n() {
        return new c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> o(r1<? extends K, ? extends V> r1Var) {
        if (r1Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) r1Var;
            if (!immutableMultimap.x()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.N(r1Var);
    }

    @o9.a
    public static <K, V> ImmutableMultimap<K, V> p(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.O(iterable);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean A(r1<? extends K, ? extends V> r1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.D0(obj, obj2);
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: H */
    public ImmutableCollection<V> a(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: J */
    public ImmutableCollection<V> b(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b3<V> l() {
        return new b();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.c
    Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.r1
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        return this.f57318g.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public boolean containsValue(@CheckForNull Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    Set<K> f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<K, Collection<V>> e() {
        return this.f57318g;
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<Map.Entry<K, V>> d() {
        return new EntryCollection(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ImmutableMultiset<K> h() {
        return new Keys();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> j() {
        return new Values(this);
    }

    @Override // com.google.common.collect.r1
    public int size() {
        return this.f57319h;
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<Map.Entry<K, V>> i() {
        return (ImmutableCollection) super.i();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean t0(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b3<Map.Entry<K, V>> k() {
        return new a();
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public abstract ImmutableCollection<V> v(K k10);

    public abstract ImmutableMultimap<V, K> w();

    boolean x() {
        return this.f57318g.p();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        return this.f57318g.keySet();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ImmutableMultiset<K> n0() {
        return (ImmutableMultiset) super.n0();
    }
}
