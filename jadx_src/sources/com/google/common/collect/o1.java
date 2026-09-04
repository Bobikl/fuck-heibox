package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ListMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface o1<K, V> extends r1<K, V> {
    @s9.a
    /* bridge */ /* synthetic */ Collection a(@CheckForNull Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    List<V> a(@CheckForNull Object obj);

    @s9.a
    /* bridge */ /* synthetic */ Collection b(@x1 Object obj, Iterable iterable);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    List<V> b(@x1 K k10, Iterable<? extends V> iterable);

    Map<K, Collection<V>> e();

    boolean equals(@CheckForNull Object obj);

    /* JADX INFO: renamed from: get */
    /* bridge */ /* synthetic */ Collection v(@x1 Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    List<V> v(@x1 K k10);
}
