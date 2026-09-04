package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SortedMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public interface o2<E> extends q2<E>, j2<E> {
    o2<E> F1(@x1 E e10, BoundType boundType);

    @Override // com.google.common.collect.q2, com.google.common.collect.s1
    NavigableSet<E> c();

    @Override // com.google.common.collect.q2, com.google.common.collect.s1
    /* bridge */ /* synthetic */ Set c();

    @Override // com.google.common.collect.q2, com.google.common.collect.s1
    /* bridge */ /* synthetic */ SortedSet c();

    Comparator<? super E> comparator();

    o2<E> e0();

    @Override // com.google.common.collect.s1
    Set<s1.a<E>> entrySet();

    @CheckForNull
    s1.a<E> firstEntry();

    @Override // com.google.common.collect.s1, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    o2<E> j1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2);

    @CheckForNull
    s1.a<E> lastEntry();

    o2<E> m0(@x1 E e10, BoundType boundType);

    @CheckForNull
    s1.a<E> pollFirstEntry();

    @CheckForNull
    s1.a<E> pollLastEntry();
}
