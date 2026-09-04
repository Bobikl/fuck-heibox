package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class ImmutableSortedSetFauxverideShim<E> extends ImmutableSet<E> {
    ImmutableSortedSetFauxverideShim() {
    }

    @s9.e("Use naturalOrder")
    @Deprecated
    public static <E> ImmutableSortedSet.a<E> N() {
        throw new UnsupportedOperationException();
    }

    @s9.e("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> ImmutableSortedSet.a<E> Q(int i10) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> R(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass a parameter of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> S(E e10) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> T(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> U(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> V(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> W(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> X(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
