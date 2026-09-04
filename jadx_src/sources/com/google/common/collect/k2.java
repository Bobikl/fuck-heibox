package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: SortedIterables.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class k2 {
    private k2() {
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.z() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        com.google.common.base.w.E(comparator);
        com.google.common.base.w.E(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof j2)) {
                return false;
            }
            comparator2 = ((j2) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
