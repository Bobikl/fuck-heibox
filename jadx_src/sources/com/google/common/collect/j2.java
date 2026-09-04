package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: SortedIterable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface j2<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    Iterator<T> iterator();
}
