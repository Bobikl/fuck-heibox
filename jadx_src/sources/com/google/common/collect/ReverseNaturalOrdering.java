package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final ReverseNaturalOrdering f57843d = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object Q() {
        return f57843d;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> E() {
        return Ordering.z();
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.w.E(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E s(E e10, E e11) {
        return (E) NaturalOrdering.f57763f.w(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E t(E e10, E e11, E e12, E... eArr) {
        return (E) NaturalOrdering.f57763f.x(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E r(Iterable<E> iterable) {
        return (E) NaturalOrdering.f57763f.v(iterable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E u(Iterator<E> it) {
        return (E) NaturalOrdering.f57763f.y(it);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E w(E e10, E e11) {
        return (E) NaturalOrdering.f57763f.s(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E x(E e10, E e11, E e12, E... eArr) {
        return (E) NaturalOrdering.f57763f.t(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E v(Iterable<E> iterable) {
        return (E) NaturalOrdering.f57763f.r(iterable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E y(Iterator<E> it) {
        return (E) NaturalOrdering.f57763f.u(it);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
