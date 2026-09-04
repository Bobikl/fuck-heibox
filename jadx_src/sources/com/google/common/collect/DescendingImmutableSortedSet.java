package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImmutableSortedSet<E> f57189i;

    DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.i(immutableSortedSet.comparator()).E());
        this.f57189i = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> O0(E e10, boolean z10, E e11, boolean z11) {
        return this.f57189i.subSet(e11, z11, e10, z10).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> R0(E e10, boolean z10) {
        return this.f57189i.headSet(e10, z10).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e10) {
        return this.f57189i.floor(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f57189i.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E e10) {
        return this.f57189i.ceiling(e10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E e10) {
        return this.f57189i.lower(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return this.f57189i.i();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@CheckForNull Object obj) {
        int iIndexOf = this.f57189i.indexOf(obj);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return this.f57189i.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E e10) {
        return this.f57189i.higher(e10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @o9.c("NavigableSet")
    ImmutableSortedSet<E> n0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c("NavigableSet")
    /* JADX INFO: renamed from: q0 */
    public b3<E> descendingIterator() {
        return this.f57189i.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c("NavigableSet")
    /* JADX INFO: renamed from: r0 */
    public ImmutableSortedSet<E> descendingSet() {
        return this.f57189i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f57189i.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> v0(E e10, boolean z10) {
        return this.f57189i.tailSet(e10, z10).descendingSet();
    }
}
