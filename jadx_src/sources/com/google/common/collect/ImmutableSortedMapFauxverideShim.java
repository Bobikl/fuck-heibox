package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class ImmutableSortedMapFauxverideShim<K, V> extends ImmutableMap<K, V> {
    ImmutableSortedMapFauxverideShim() {
    }

    @s9.e("Use naturalOrder")
    @Deprecated
    public static <K, V> ImmutableSortedMap.b<K, V> J() {
        throw new UnsupportedOperationException();
    }

    @s9.e("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> ImmutableSortedMap.b<K, V> K(int i10) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> L(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> M(K k10, V v10, K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> N(K k10, V v10, K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> O(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> P(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> T(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> U(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> V(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> W(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> X(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        throw new UnsupportedOperationException();
    }

    @s9.e("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> Y(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }
}
