package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MapDifference.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.f("Use Maps.difference")
@u
public interface p1<K, V> {

    /* JADX INFO: compiled from: MapDifference.java */
    @s9.f("Use Maps.difference")
    public interface a<V> {
        @x1
        V a();

        @x1
        V b();

        boolean equals(@CheckForNull Object obj);

        int hashCode();
    }

    Map<K, a<V>> a();

    Map<K, V> b();

    Map<K, V> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@CheckForNull Object obj);

    int hashCode();
}
