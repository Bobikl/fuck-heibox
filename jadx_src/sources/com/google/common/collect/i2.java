package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SetMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface i2<K, V> extends r1<K, V> {
    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Collection a(@CheckForNull Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    Set<V> a(@CheckForNull Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Collection b(@x1 Object obj, Iterable iterable);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    Set<V> b(@x1 K k10, Iterable<? extends V> iterable);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    Map<K, Collection<V>> e();

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    boolean equals(@CheckForNull Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    /* bridge */ /* synthetic */ Collection v(@x1 Object obj);

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    Set<V> v(@x1 K k10);

    @Override // com.google.common.collect.r1
    /* bridge */ /* synthetic */ Collection i();

    @Override // com.google.common.collect.r1
    Set<Map.Entry<K, V>> i();
}
