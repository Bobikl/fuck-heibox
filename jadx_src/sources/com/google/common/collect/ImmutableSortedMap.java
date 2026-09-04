package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f57394j = Ordering.z();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ImmutableSortedMap<Comparable, Object> f57395k = new ImmutableSortedMap<>(ImmutableSortedSet.s0(Ordering.z()), ImmutableList.B());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient RegularImmutableSortedSet<K> f57396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ImmutableList<V> f57397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    private transient ImmutableSortedMap<K, V> f57398i;

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Comparator<? super K> f57401e;

        SerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.f57401e = immutableSortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(int i10) {
            return new b<>(this.f57401e);
        }
    }

    public class a implements Comparator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f57402b;

        a(Comparator comparator) {
            this.f57402b = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@CheckForNull Map.Entry<K, V> entry, @CheckForNull Map.Entry<K, V> entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f57402b.compare(entry.getKey(), entry2.getKey());
        }
    }

    public static class b<K, V> extends ImmutableMap.b<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private transient Object[] f57403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient Object[] f57404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Comparator<? super K> f57405h;

        public b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private b(Comparator<? super K> comparator, int i10) {
            this.f57405h = (Comparator) com.google.common.base.w.E(comparator);
            this.f57403f = new Object[i10];
            this.f57404g = new Object[i10];
        }

        private void f(int i10) {
            Object[] objArr = this.f57403f;
            if (i10 > objArr.length) {
                int iF = ImmutableCollection.b.f(objArr.length, i10);
                this.f57403f = Arrays.copyOf(this.f57403f, iF);
                this.f57404g = Arrays.copyOf(this.f57404g, iF);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.e
        @Deprecated
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedMap<K, V> c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> d() {
            int i10 = this.f57302c;
            if (i10 == 0) {
                return ImmutableSortedMap.l0(this.f57405h);
            }
            if (i10 == 1) {
                Comparator<? super K> comparator = this.f57405h;
                Object obj = this.f57403f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f57404g[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.I0(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f57403f, i10);
            Arrays.sort(objArrCopyOf, this.f57405h);
            Object[] objArr = new Object[this.f57302c];
            for (int i11 = 0; i11 < this.f57302c; i11++) {
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f57405h.compare(objArrCopyOf[i12], objArrCopyOf[i11]) == 0) {
                        String strValueOf = String.valueOf(objArrCopyOf[i12]);
                        String strValueOf2 = String.valueOf(objArrCopyOf[i11]);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
                        sb2.append("keys required to be distinct but compared as equal: ");
                        sb2.append(strValueOf);
                        sb2.append(" and ");
                        sb2.append(strValueOf2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                Object obj3 = this.f57403f[i11];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f57405h);
                Object obj4 = this.f57404g[i11];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m(objArrCopyOf), this.f57405h), ImmutableList.m(objArr));
        }

        @s9.a
        b<K, V> q(b<K, V> bVar) {
            f(this.f57302c + bVar.f57302c);
            System.arraycopy(bVar.f57403f, 0, this.f57403f, this.f57302c, bVar.f57302c);
            System.arraycopy(bVar.f57404g, 0, this.f57404g, this.f57302c, bVar.f57302c);
            this.f57302c += bVar.f57302c;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        @Deprecated
        @o9.a
        @s9.e("Always throws UnsupportedOperationException")
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final b<K, V> h(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b<K, V> i(K k10, V v10) {
            f(this.f57302c + 1);
            n.a(k10, v10);
            Object[] objArr = this.f57403f;
            int i10 = this.f57302c;
            objArr[i10] = k10;
            this.f57404g[i10] = v10;
            this.f57302c = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @o9.a
        @s9.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, @CheckForNull ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f57396g = regularImmutableSortedSet;
        this.f57397h = immutableList;
        this.f57398i = immutableSortedMap;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap A0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap C0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap D0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5), ImmutableMap.k(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap E0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5), ImmutableMap.k(comparable6, obj6), ImmutableMap.k(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap F0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5), ImmutableMap.k(comparable6, obj6), ImmutableMap.k(comparable7, obj7), ImmutableMap.k(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap G0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5), ImmutableMap.k(comparable6, obj6), ImmutableMap.k(comparable7, obj7), ImmutableMap.k(comparable8, obj8), ImmutableMap.k(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap H0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3), ImmutableMap.k(comparable4, obj4), ImmutableMap.k(comparable5, obj5), ImmutableMap.k(comparable6, obj6), ImmutableMap.k(comparable7, obj7), ImmutableMap.k(comparable8, obj8), ImmutableMap.k(comparable9, obj9), ImmutableMap.k(comparable10, obj10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> ImmutableSortedMap<K, V> I0(Comparator<? super K> comparator, K k10, V v10) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.D(k10), (Comparator) com.google.common.base.w.E(comparator)), ImmutableList.D(v10));
    }

    public static <K, V> b<K, V> J0(Comparator<K> comparator) {
        return new b<>(comparator);
    }

    public static <K extends Comparable<?>, V> b<K, V> K0() {
        return new b<>(Ordering.z().E());
    }

    @o9.a
    public static <K, V> ImmutableSortedMap<K, V> c0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return d0(iterable, (Ordering) f57394j);
    }

    @o9.a
    public static <K, V> ImmutableSortedMap<K, V> d0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return m0((Comparator) com.google.common.base.w.E(comparator), false, iterable);
    }

    public static <K, V> ImmutableSortedMap<K, V> e0(Map<? extends K, ? extends V> map) {
        return g0(map, (Ordering) f57394j);
    }

    public static <K, V> ImmutableSortedMap<K, V> f0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return g0(map, (Comparator) com.google.common.base.w.E(comparator));
    }

    private static <K, V> ImmutableSortedMap<K, V> g0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals;
        boolean z10 = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f57394j) {
                zEquals = true;
            }
            z10 = zEquals;
        }
        if (z10 && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.p()) {
                return immutableSortedMap;
            }
        }
        return m0(comparator, z10, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> h0(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f57394j;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.p()) {
                return immutableSortedMap;
            }
        }
        return m0(comparator, true, sortedMap.entrySet());
    }

    static <K, V> ImmutableSortedMap<K, V> l0(Comparator<? super K> comparator) {
        return Ordering.z().equals(comparator) ? v0() : new ImmutableSortedMap<>(ImmutableSortedSet.s0(comparator), ImmutableList.B());
    }

    private static <K, V> ImmutableSortedMap<K, V> m0(Comparator<? super K> comparator, boolean z10, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) l1.R(iterable, ImmutableMap.f57287f);
        return n0(comparator, z10, entryArr, entryArr.length);
    }

    private static <K, V> ImmutableSortedMap<K, V> n0(Comparator<? super K> comparator, boolean z10, Map.Entry<K, V>[] entryArr, int i10) {
        if (i10 == 0) {
            return l0(comparator);
        }
        if (i10 == 1) {
            Map.Entry<K, V> entry = entryArr[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return I0(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        if (z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                Map.Entry<K, V> entry3 = entryArr[i11];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                K key = entry4.getKey();
                V value = entry4.getValue();
                n.a(key, value);
                objArr[i11] = key;
                objArr2[i11] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i10, new a(comparator));
            Map.Entry<K, V> entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Map.Entry<K, V> entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            V value2 = entry6.getValue();
            objArr2[0] = value2;
            n.a(objArr[0], value2);
            int i12 = 1;
            while (i12 < i10) {
                Map.Entry<K, V> entry7 = entryArr[i12 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry<K, V> entry8 = entry7;
                Map.Entry<K, V> entry9 = entryArr[i12];
                Objects.requireNonNull(entry9);
                Map.Entry<K, V> entry10 = entry9;
                Object key3 = entry10.getKey();
                V value3 = entry10.getValue();
                n.a(key3, value3);
                objArr[i12] = key3;
                objArr2[i12] = value3;
                ImmutableMap.d(comparator.compare(key2, key3) != 0, "key", entry8, entry10);
                i12++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m(objArr), comparator), ImmutableList.m(objArr2));
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> o0(Map.Entry<K, V>... entryArr) {
        return n0(Ordering.z(), false, entryArr, entryArr.length);
    }

    private ImmutableSortedMap<K, V> p0(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 == i11 ? l0(comparator()) : new ImmutableSortedMap<>(this.f57396g.U0(i10, i11), this.f57397h.subList(i10, i11));
    }

    public static <K extends Comparable<?>, V> b<K, V> t0() {
        return new b<>(Ordering.z());
    }

    public static <K, V> ImmutableSortedMap<K, V> v0() {
        return (ImmutableSortedMap<K, V>) f57395k;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap x0(Comparable comparable, Object obj) {
        return I0(Ordering.z(), comparable, obj);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap y0(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap z0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return o0(ImmutableMap.k(comparable, obj), ImmutableMap.k(comparable2, obj2), ImmutableMap.k(comparable3, obj3));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.l
    /* JADX INFO: renamed from: H */
    public ImmutableCollection<V> values() {
        return this.f57397h;
    }

    @Override // com.google.common.collect.ImmutableMap
    Object I() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> subMap(K k10, K k11) {
        return subMap(k10, true, k11, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(k11);
        com.google.common.base.w.y(comparator().compare(k10, k11) <= 0, "expected fromKey <= toKey but %s > %s", k10, k11);
        return headMap(k11, z11).tailMap(k10, z10);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> tailMap(K k10) {
        return tailMap(k10, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> tailMap(K k10, boolean z10) {
        return p0(this.f57396g.W0((K) com.google.common.base.w.E(k10), z10), size());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(K k10) {
        return tailMap(k10, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(K k10) {
        return (K) Maps.T(ceilingEntry(k10));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().a().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(K k10) {
        return headMap(k10, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(K k10) {
        return (K) Maps.T(floorEntry(k10));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iIndexOf = this.f57396g.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f57397h.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<Map.Entry<K, V>> h() {
        return isEmpty() ? ImmutableSet.D() : new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet
            ImmutableList<Map.Entry<K, V>> A() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // java.util.List
                    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
                    public Map.Entry<K, V> get(int i10) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f57396g.a().get(i10), ImmutableSortedMap.this.f57397h.get(i10));
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    boolean i() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            ImmutableMap<K, V> N() {
                return ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
            /* JADX INFO: renamed from: j */
            public b3<Map.Entry<K, V>> iterator() {
                return a().iterator();
            }
        };
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(K k10) {
        return tailMap(k10, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(K k10) {
        return (K) Maps.T(higherEntry(k10));
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<K> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection<V> j() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f57396g.descendingSet();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f57398i;
        if (immutableSortedMap == null) {
            return isEmpty() ? l0(Ordering.i(comparator()).E()) : new ImmutableSortedMap<>((RegularImmutableSortedSet) this.f57396g.descendingSet(), this.f57397h.U(), this);
        }
        return immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /* JADX INFO: renamed from: l */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().a().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(K k10) {
        return headMap(k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(K k10) {
        return (K) Maps.T(lowerEntry(k10));
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean p() {
        return this.f57396g.i() || this.f57397h.i();
    }

    @Override // java.util.NavigableMap
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> headMap(K k10) {
        return headMap(k10, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> headMap(K k10, boolean z10) {
        return p0(0, this.f57396g.V0((K) com.google.common.base.w.E(k10), z10));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> keySet() {
        return this.f57396g;
    }

    @Override // java.util.Map
    public int size() {
        return this.f57397h.size();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f57396g;
    }
}
