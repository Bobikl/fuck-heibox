package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SortedSetMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface t2<K, V> extends i2<K, V> {
    @CheckForNull
    Comparator<? super V> I();

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Collection a(@CheckForNull Object obj);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Set a(@CheckForNull Object obj);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    SortedSet<V> a(@CheckForNull Object obj);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Collection b(@x1 Object obj, Iterable iterable);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    /* bridge */ /* synthetic */ Set b(@x1 Object obj, Iterable iterable);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    SortedSet<V> b(@x1 K k10, Iterable<? extends V> iterable);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    Map<K, Collection<V>> e();

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    /* bridge */ /* synthetic */ Collection v(@x1 Object obj);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    /* bridge */ /* synthetic */ Set v(@x1 Object obj);

    @Override // com.google.common.collect.i2, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    SortedSet<V> v(@x1 K k10);
}
