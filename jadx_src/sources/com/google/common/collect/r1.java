package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.f("Use ImmutableMultimap, HashMultimap, or another implementation")
@u
public interface r1<K, V> {
    @s9.a
    boolean A(r1<? extends K, ? extends V> r1Var);

    boolean D0(@CheckForNull @s9.c("K") Object obj, @CheckForNull @s9.c(androidx.exifinterface.media.a.X4) Object obj2);

    @s9.a
    Collection<V> a(@CheckForNull @s9.c("K") Object obj);

    @s9.a
    Collection<V> b(@x1 K k10, Iterable<? extends V> iterable);

    void clear();

    boolean containsKey(@CheckForNull @s9.c("K") Object obj);

    boolean containsValue(@CheckForNull @s9.c(androidx.exifinterface.media.a.X4) Object obj);

    Map<K, Collection<V>> e();

    boolean equals(@CheckForNull Object obj);

    /* JADX INFO: renamed from: get */
    Collection<V> v(@x1 K k10);

    int hashCode();

    Collection<Map.Entry<K, V>> i();

    boolean isEmpty();

    Set<K> keySet();

    s1<K> n0();

    @s9.a
    boolean put(@x1 K k10, @x1 V v10);

    @s9.a
    boolean remove(@CheckForNull @s9.c("K") Object obj, @CheckForNull @s9.c(androidx.exifinterface.media.a.X4) Object obj2);

    int size();

    @s9.a
    boolean t0(@x1 K k10, Iterable<? extends V> iterable);

    Collection<V> values();
}
