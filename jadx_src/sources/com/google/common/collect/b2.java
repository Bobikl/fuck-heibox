package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: RangeMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f("Use ImmutableRangeMap or TreeRangeMap")
@o9.c
@u
public interface b2<K extends Comparable, V> {
    void b(Range<K> range);

    Range<K> c();

    void clear();

    b2<K, V> d(Range<K> range);

    Map<Range<K>, V> e();

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    Map.Entry<Range<K>, V> f(K k10);

    Map<Range<K>, V> g();

    void h(b2<K, V> b2Var);

    int hashCode();

    void i(Range<K> range, V v10);

    @CheckForNull
    V j(K k10);

    void k(Range<K> range, V v10);

    String toString();
}
