package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements i2<K, V> {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient ImmutableSet<V> f57389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableSetMultimap<V, K> f57390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableSet<Map.Entry<K, V>> f57391k;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        private final transient ImmutableSetMultimap<K, V> f57392g;

        EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f57392g = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f57392g.D0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<Map.Entry<K, V>> iterator() {
            return this.f57392g.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f57392g.size();
        }
    }

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.c
        Collection<V> c() {
            return z1.h();
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableSetMultimap<K, V> a() {
            Collection collectionEntrySet = this.f57331a.entrySet();
            Comparator<? super K> comparator = this.f57332b;
            if (comparator != null) {
                collectionEntrySet = Ordering.i(comparator).C().l(collectionEntrySet);
            }
            return ImmutableSetMultimap.S(collectionEntrySet, this.f57333c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(ImmutableMultimap.c<K, V> cVar) {
            super.b(cVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> d(Comparator<? super K> comparator) {
            super.d(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(Comparator<? super V> comparator) {
            super.e(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k10, V v10) {
            super.f(k10, v10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(r1<? extends K, ? extends V> r1Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : r1Var.e().entrySet()) {
                j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @o9.a
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(K k10, Iterable<? extends V> iterable) {
            super.j(k10, iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(K k10, V... vArr) {
            return j(k10, Arrays.asList(vArr));
        }
    }

    @o9.c
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2.b<ImmutableSetMultimap> f57393a = g2.a(ImmutableSetMultimap.class, "emptySet");

        private b() {
        }
    }

    ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i10, @CheckForNull Comparator<? super V> comparator) {
        super(immutableMap, i10);
        this.f57389i = Q(comparator);
    }

    public static <K, V> a<K, V> M() {
        return new a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> N(r1<? extends K, ? extends V> r1Var) {
        return O(r1Var, null);
    }

    private static <K, V> ImmutableSetMultimap<K, V> O(r1<? extends K, ? extends V> r1Var, @CheckForNull Comparator<? super V> comparator) {
        com.google.common.base.w.E(r1Var);
        if (r1Var.isEmpty() && comparator == null) {
            return X();
        }
        if (r1Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) r1Var;
            if (!immutableSetMultimap.x()) {
                return immutableSetMultimap;
            }
        }
        return S(r1Var.e().entrySet(), comparator);
    }

    @o9.a
    public static <K, V> ImmutableSetMultimap<K, V> P(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().i(iterable).a();
    }

    private static <V> ImmutableSet<V> Q(@CheckForNull Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.D() : ImmutableSortedSet.s0(comparator);
    }

    static <K, V> ImmutableSetMultimap<K, V> S(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @CheckForNull Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return X();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetG0 = g0(comparator, entry.getValue());
            if (!immutableSetG0.isEmpty()) {
                bVar.i(key, immutableSetG0);
                size += immutableSetG0.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.d(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> W() {
        a aVarM = M();
        b3 it = i().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarM.f(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapA = aVarM.a();
        immutableSetMultimapA.f57390j = this;
        return immutableSetMultimapA;
    }

    public static <K, V> ImmutableSetMultimap<K, V> X() {
        return EmptyImmutableSetMultimap.f57198l;
    }

    public static <K, V> ImmutableSetMultimap<K, V> Y(K k10, V v10) {
        a aVarM = M();
        aVarM.f(k10, v10);
        return aVarM.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> Z(K k10, V v10, K k11, V v11) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        return aVarM.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> a0(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        return aVarM.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> b0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        aVarM.f(k13, v13);
        return aVarM.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> c0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        aVarM.f(k13, v13);
        aVarM.f(k14, v14);
        return aVarM.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    private void d0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(i10);
            throw new InvalidObjectException(sb2.toString());
        }
        ImmutableMap.b bVarB = ImmutableMap.b();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Invalid value count ");
                sb3.append(i13);
                throw new InvalidObjectException(sb3.toString());
            }
            ImmutableSet.a aVarH0 = h0(comparator);
            for (int i14 = 0; i14 < i13; i14++) {
                aVarH0.g(objectInputStream.readObject());
            }
            ImmutableSet immutableSetE = aVarH0.e();
            if (immutableSetE.size() != i13) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb4 = new StringBuilder(strValueOf.length() + 40);
                sb4.append("Duplicate key-value pairs exist for key ");
                sb4.append(strValueOf);
                throw new InvalidObjectException(sb4.toString());
            }
            bVarB.i(object, immutableSetE);
            i11 += i13;
        }
        try {
            ImmutableMultimap.d.f57334a.b(this, bVarB.d());
            ImmutableMultimap.d.f57335b.a(this, i11);
            b.f57393a.b(this, Q(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private static <V> ImmutableSet<V> g0(@CheckForNull Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.w(collection) : ImmutableSortedSet.d0(comparator, collection);
    }

    private static <V> ImmutableSet.a<V> h0(@CheckForNull Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.a<>() : new ImmutableSortedSet.a(comparator);
    }

    @o9.c
    private void i0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(I());
        g2.j(this, objectOutputStream);
    }

    @CheckForNull
    Comparator<? super V> I() {
        ImmutableSet<V> immutableSet = this.f57389i;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> i() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f57391k;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f57391k = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<V> v(K k10) {
        return (ImmutableSet) com.google.common.base.q.a((ImmutableSet) this.f57318g.get(k10), this.f57389i);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public ImmutableSetMultimap<V, K> w() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.f57390j;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapW = W();
        this.f57390j = immutableSetMultimapW;
        return immutableSetMultimapW;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<V> a(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<V> b(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
