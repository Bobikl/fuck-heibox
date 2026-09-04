package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: Comparators.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class q {
    private q() {
    }

    public static <T> boolean a(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.w.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean b(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.w.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T, S extends T> Comparator<Iterable<S>> c(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) com.google.common.base.w.E(comparator));
    }

    public static <T extends Comparable<? super T>> T d(T t10, T t11) {
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }

    @x1
    public static <T> T e(@x1 T t10, @x1 T t11, Comparator<T> comparator) {
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }

    public static <T extends Comparable<? super T>> T f(T t10, T t11) {
        return t10.compareTo(t11) <= 0 ? t10 : t11;
    }

    @x1
    public static <T> T g(@x1 T t10, @x1 T t11, Comparator<T> comparator) {
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }
}
