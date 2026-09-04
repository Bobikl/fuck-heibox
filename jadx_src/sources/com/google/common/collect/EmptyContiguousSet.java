package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    @o9.c
    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DiscreteDomain<C> f57196b;

        private SerializedForm(DiscreteDomain<C> discreteDomain) {
            this.f57196b = discreteDomain;
        }

        private Object a() {
            return new EmptyContiguousSet(this.f57196b);
        }
    }

    EmptyContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    @Override // com.google.common.collect.ImmutableSet
    @o9.c
    boolean B() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<C> a() {
        return ImmutableList.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: c1 */
    public ContiguousSet<C> v0(C c10, boolean z10) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> e1(ContiguousSet<C> contiguousSet) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> f1() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> g1(BoundType boundType, BoundType boundType2) {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @o9.c
    int indexOf(@CheckForNull Object obj) {
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<C> iterator() {
        return Iterators.u();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new SerializedForm(this.f57163i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: m1 */
    public ContiguousSet<C> O0(C c10, boolean z10, C c11, boolean z11) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    @o9.c
    ImmutableSortedSet<C> n0() {
        return ImmutableSortedSet.s0(Ordering.z().E());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: q0 */
    public b3<C> descendingIterator() {
        return Iterators.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: q1 */
    public ContiguousSet<C> R0(C c10, boolean z10) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public String toString() {
        return okhttp3.t.f132643o;
    }
}
