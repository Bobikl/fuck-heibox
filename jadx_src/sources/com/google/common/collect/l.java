package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: BiMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface l<K, V> extends Map<K, V> {
    @s9.a
    @CheckForNull
    V R(@x1 K k10, @x1 V v10);

    l<V, K> i0();

    @s9.a
    @CheckForNull
    V put(@x1 K k10, @x1 V v10);

    void putAll(Map<? extends K, ? extends V> map);

    /* bridge */ /* synthetic */ Collection values();

    Set<V> values();
}
