package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@s9.f("Use ImmutableMap.of or another implementation")
@u
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f57287f = new Map.Entry[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableSet<Map.Entry<K, V>> f57288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableSet<K> f57289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableCollection<V> f57290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient ImmutableSetMultimap<K, V> f57291e;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        IteratorBasedImmutableMap() {
        }

        abstract b3<Map.Entry<K, V>> J();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<Map.Entry<K, V>> h() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                ImmutableMap<K, V> N() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
                /* JADX INFO: renamed from: j */
                public b3<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.J();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<K> i() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableCollection<V> j() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.l
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        public class a extends b3<Map.Entry<K, ImmutableSet<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f57294b;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a, reason: collision with other inner class name */
            public class C0447a extends com.google.common.collect.b<K, ImmutableSet<V>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f57295b;

                C0447a(a aVar, Map.Entry entry) {
                    this.f57295b = entry;
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.E(this.f57295b.getValue());
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f57295b.getKey();
                }
            }

            a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f57294b = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C0447a(this, (Map.Entry) this.f57294b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57294b.hasNext();
            }
        }

        private MapViewOfValuesAsSingletonSets() {
        }

        /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        b3<Map.Entry<K, ImmutableSet<V>>> J() {
            return new a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.E(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet<K> i() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean n() {
            return ImmutableMap.this.n();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean p() {
            return ImmutableMap.this.p();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final boolean f57296d = true;
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f57297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f57298c;

        SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            b3<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f57297b = objArr;
            this.f57298c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object a() {
            Object[] objArr = (Object[]) this.f57297b;
            Object[] objArr2 = (Object[]) this.f57298c;
            b<K, V> bVarB = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                bVarB.i(objArr[i10], objArr2[i10]);
            }
            return bVarB.d();
        }

        b<K, V> b(int i10) {
            return new b<>(i10);
        }

        final Object c() {
            Object obj = this.f57297b;
            if (!(obj instanceof ImmutableSet)) {
                return a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.f57298c;
            b<K, V> bVarB = b(immutableSet.size());
            b3 it = immutableSet.iterator();
            b3 it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                bVarB.i(it.next(), it2.next());
            }
            return bVarB.d();
        }
    }

    public class a extends b3<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b3 f57299b;

        a(ImmutableMap immutableMap, b3 b3Var) {
            this.f57299b = b3Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57299b.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f57299b.next()).getKey();
        }
    }

    @s9.f
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        Comparator<? super V> f57300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f57301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f57303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f57304e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f57305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f57306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f57307c;

            a(Object obj, Object obj2, Object obj3) {
                this.f57305a = obj;
                this.f57306b = obj2;
                this.f57307c = obj3;
            }

            IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f57305a);
                String strValueOf2 = String.valueOf(this.f57306b);
                String strValueOf3 = String.valueOf(this.f57305a);
                String strValueOf4 = String.valueOf(this.f57307c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(strValueOf);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(strValueOf2);
                sb2.append(" and ");
                sb2.append(strValueOf3);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(strValueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public b() {
            this(4);
        }

        b(int i10) {
            this.f57301b = new Object[i10 * 2];
            this.f57302c = 0;
            this.f57303d = false;
        }

        private ImmutableMap<K, V> b(boolean z10) {
            Object[] objArrG;
            a aVar;
            a aVar2;
            if (z10 && (aVar2 = this.f57304e) != null) {
                throw aVar2.a();
            }
            int length = this.f57302c;
            if (this.f57300a == null) {
                objArrG = this.f57301b;
            } else {
                if (this.f57303d) {
                    this.f57301b = Arrays.copyOf(this.f57301b, length * 2);
                }
                objArrG = this.f57301b;
                if (!z10) {
                    objArrG = g(objArrG, this.f57302c);
                    if (objArrG.length < this.f57301b.length) {
                        length = objArrG.length >>> 1;
                    }
                }
                m(objArrG, length, this.f57300a);
            }
            this.f57303d = true;
            RegularImmutableMap regularImmutableMapK = RegularImmutableMap.K(length, objArrG, this);
            if (!z10 || (aVar = this.f57304e) == null) {
                return regularImmutableMapK;
            }
            throw aVar.a();
        }

        private void f(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f57301b;
            if (i11 > objArr.length) {
                this.f57301b = Arrays.copyOf(objArr, ImmutableCollection.b.f(objArr.length, i11));
                this.f57303d = false;
            }
        }

        private Object[] g(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void m(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, Ordering.i(comparator).D(Maps.N0()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public ImmutableMap<K, V> a() {
            return d();
        }

        public ImmutableMap<K, V> c() {
            return b(false);
        }

        public ImmutableMap<K, V> d() {
            return b(true);
        }

        @s9.a
        b<K, V> e(b<K, V> bVar) {
            com.google.common.base.w.E(bVar);
            f(this.f57302c + bVar.f57302c);
            System.arraycopy(bVar.f57301b, 0, this.f57301b, this.f57302c * 2, bVar.f57302c * 2);
            this.f57302c += bVar.f57302c;
            return this;
        }

        @o9.a
        @s9.a
        public b<K, V> h(Comparator<? super V> comparator) {
            com.google.common.base.w.h0(this.f57300a == null, "valueComparator was already set");
            this.f57300a = (Comparator) com.google.common.base.w.F(comparator, "valueComparator");
            return this;
        }

        @s9.a
        public b<K, V> i(K k10, V v10) {
            f(this.f57302c + 1);
            n.a(k10, v10);
            Object[] objArr = this.f57301b;
            int i10 = this.f57302c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f57302c = i10 + 1;
            return this;
        }

        @s9.a
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @o9.a
        @s9.a
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                f(this.f57302c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @s9.a
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }
    }

    ImmutableMap() {
    }

    public static <K, V> ImmutableMap<K, V> A(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        return RegularImmutableMap.J(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> ImmutableMap<K, V> B(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        return RegularImmutableMap.J(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> ImmutableMap<K, V> C(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        return RegularImmutableMap.J(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> ImmutableMap<K, V> D(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        n.a(k17, v17);
        return RegularImmutableMap.J(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }

    public static <K, V> ImmutableMap<K, V> E(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        n.a(k17, v17);
        n.a(k18, v18);
        return RegularImmutableMap.J(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> ImmutableMap<K, V> F(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        n.a(k17, v17);
        n.a(k18, v18);
        n.a(k19, v19);
        return RegularImmutableMap.J(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> G(Map.Entry<? extends K, ? extends V>... entryArr) {
        return f(Arrays.asList(entryArr));
    }

    public static <K, V> b<K, V> b() {
        return new b<>();
    }

    @o9.a
    public static <K, V> b<K, V> c(int i10) {
        n.b(i10, "expectedSize");
        return new b<>(i10);
    }

    static void d(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw e(str, obj, obj2);
        }
    }

    static IllegalArgumentException e(String str, Object obj, Object obj2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + strValueOf.length() + strValueOf2.length());
        sb2.append("Multiple entries with same ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(strValueOf);
        sb2.append(" and ");
        sb2.append(strValueOf2);
        return new IllegalArgumentException(sb2.toString());
    }

    @o9.a
    public static <K, V> ImmutableMap<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.k(iterable);
        return bVar.a();
    }

    public static <K, V> ImmutableMap<K, V> g(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.p()) {
                return immutableMap;
            }
        }
        return f(map.entrySet());
    }

    static <K, V> Map.Entry<K, V> k(K k10, V v10) {
        n.a(k10, v10);
        return new AbstractMap.SimpleImmutableEntry(k10, v10);
    }

    public static <K, V> ImmutableMap<K, V> v() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f57805o;
    }

    public static <K, V> ImmutableMap<K, V> w(K k10, V v10) {
        n.a(k10, v10);
        return RegularImmutableMap.J(1, new Object[]{k10, v10});
    }

    public static <K, V> ImmutableMap<K, V> x(K k10, V v10, K k11, V v11) {
        n.a(k10, v10);
        n.a(k11, v11);
        return RegularImmutableMap.J(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> ImmutableMap<K, V> y(K k10, V v10, K k11, V v11, K k12, V v12) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        return RegularImmutableMap.J(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> ImmutableMap<K, V> z(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        return RegularImmutableMap.J(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    @Override // java.util.Map, com.google.common.collect.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f57290d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionJ = j();
        this.f57290d = immutableCollectionJ;
        return immutableCollectionJ;
    }

    Object I() {
        return new SerializedForm(this);
    }

    public ImmutableSetMultimap<K, V> a() {
        if (isEmpty()) {
            return ImmutableSetMultimap.X();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f57291e;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(this, null), size(), null);
        this.f57291e = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.w(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract ImmutableSet<Map.Entry<K, V>> h();

    @Override // java.util.Map
    public int hashCode() {
        return Sets.k(entrySet());
    }

    abstract ImmutableSet<K> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract ImmutableCollection<V> j();

    @Override // java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f57288b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetH = h();
        this.f57288b = immutableSetH;
        return immutableSetH;
    }

    boolean n() {
        return false;
    }

    abstract boolean p();

    @Override // java.util.Map
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    b3<K> r() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    @s9.a
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.w0(this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f57289c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetI = i();
        this.f57289c = immutableSetI;
        return immutableSetI;
    }
}
