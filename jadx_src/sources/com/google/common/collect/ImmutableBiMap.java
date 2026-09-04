package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements l<K, V> {

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(int i10) {
            return new a<>(i10);
        }
    }

    public static final class a<K, V> extends ImmutableMap.b<K, V> {
        public a() {
        }

        a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.e
        @Deprecated
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> d() {
            int i10 = this.f57302c;
            if (i10 == 0) {
                return ImmutableBiMap.P();
            }
            if (this.f57300a != null) {
                if (this.f57303d) {
                    this.f57301b = Arrays.copyOf(this.f57301b, i10 * 2);
                }
                ImmutableMap.b.m(this.f57301b, this.f57302c, this.f57300a);
            }
            this.f57303d = true;
            return new RegularImmutableBiMap(this.f57301b, this.f57302c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(ImmutableMap.b<K, V> bVar) {
            super.e(bVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @o9.a
        @s9.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> comparator) {
            super.h(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K k10, V v10) {
            super.i(k10, v10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @o9.a
        @s9.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @s9.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }
    }

    ImmutableBiMap() {
    }

    public static <K, V> a<K, V> J() {
        return new a<>();
    }

    @o9.a
    public static <K, V> a<K, V> K(int i10) {
        n.b(i10, "expectedSize");
        return new a<>(i10);
    }

    @o9.a
    public static <K, V> ImmutableBiMap<K, V> L(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).k(iterable).a();
    }

    public static <K, V> ImmutableBiMap<K, V> M(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.p()) {
                return immutableBiMap;
            }
        }
        return L(map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> P() {
        return RegularImmutableBiMap.f57791l;
    }

    public static <K, V> ImmutableBiMap<K, V> T(K k10, V v10) {
        n.a(k10, v10);
        return new RegularImmutableBiMap(new Object[]{k10, v10}, 1);
    }

    public static <K, V> ImmutableBiMap<K, V> U(K k10, V v10, K k11, V v11) {
        n.a(k10, v10);
        n.a(k11, v11);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11}, 2);
    }

    public static <K, V> ImmutableBiMap<K, V> V(K k10, V v10, K k11, V v11, K k12, V v12) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> W(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> X(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> Y(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> Z(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> a0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        n.a(k17, v17);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> b0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        n.a(k10, v10);
        n.a(k11, v11);
        n.a(k12, v12);
        n.a(k13, v13);
        n.a(k14, v14);
        n.a(k15, v15);
        n.a(k16, v16);
        n.a(k17, v17);
        n.a(k18, v18);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> c0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
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
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 10);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> d0(Map.Entry<? extends K, ? extends V>... entryArr) {
        return L(Arrays.asList(entryArr));
    }

    @Override // com.google.common.collect.ImmutableMap
    Object I() {
        return new SerializedForm(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<V> j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.l
    /* JADX INFO: renamed from: O */
    public abstract ImmutableBiMap<V, K> i0();

    @Override // com.google.common.collect.l
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final V R(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.l
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<V> values() {
        return i0().keySet();
    }
}
