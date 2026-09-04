package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class ImmutableSortedMultisetFauxverideShim<E> extends ImmutableMultiset<E> {
    ImmutableSortedMultisetFauxverideShim() {
    }

    @s9.e("Use naturalOrder.")
    @Deprecated
    public static <E> ImmutableSortedMultiset.a<E> I() {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> J(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> L(E e10) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> N(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> Q(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> R(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> S(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @s9.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> T(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
