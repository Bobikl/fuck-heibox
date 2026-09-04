package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final DiscreteDomain<C> f57163i;

    ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.z());
        this.f57163i = discreteDomain;
    }

    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> ImmutableSortedSet.a<E> N() {
        throw new UnsupportedOperationException();
    }

    @o9.a
    public static ContiguousSet<Integer> U0(int i10, int i11) {
        return Z0(Range.f(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.c());
    }

    @o9.a
    public static ContiguousSet<Long> V0(long j10, long j11) {
        return Z0(Range.f(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.d());
    }

    @o9.a
    public static ContiguousSet<Integer> W0(int i10, int i11) {
        return Z0(Range.g(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.c());
    }

    @o9.a
    public static ContiguousSet<Long> X0(long j10, long j11) {
        return Z0(Range.g(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.d());
    }

    public static <C extends Comparable> ContiguousSet<C> Z0(Range<C> range, DiscreteDomain<C> discreteDomain) {
        com.google.common.base.w.E(range);
        com.google.common.base.w.E(discreteDomain);
        try {
            Range<C> rangeS = !range.q() ? range.s(Range.c(discreteDomain.f())) : range;
            if (!range.r()) {
                rangeS = rangeS.s(Range.d(discreteDomain.e()));
            }
            boolean z10 = true;
            if (!rangeS.u()) {
                Comparable comparableL = range.f57775b.l(discreteDomain);
                Objects.requireNonNull(comparableL);
                Comparable comparableJ = range.f57776c.j(discreteDomain);
                Objects.requireNonNull(comparableJ);
                if (Range.h(comparableL, comparableJ) <= 0) {
                    z10 = false;
                }
            }
            return z10 ? new EmptyContiguousSet(discreteDomain) : new RegularContiguousSet(rangeS, discreteDomain);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> headSet(C c10) {
        return v0((Comparable) com.google.common.base.w.E(c10), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @o9.c
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> headSet(C c10, boolean z10) {
        return v0((Comparable) com.google.common.base.w.E(c10), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet<C> v0(C c10, boolean z10);

    public abstract ContiguousSet<C> e1(ContiguousSet<C> contiguousSet);

    public abstract Range<C> f1();

    public abstract Range<C> g1(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> subSet(C c10, C c11) {
        com.google.common.base.w.E(c10);
        com.google.common.base.w.E(c11);
        com.google.common.base.w.d(comparator().compare(c10, c11) <= 0);
        return O0(c10, true, c11, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> subSet(C c10, boolean z10, C c11, boolean z11) {
        com.google.common.base.w.E(c10);
        com.google.common.base.w.E(c11);
        com.google.common.base.w.d(comparator().compare(c10, c11) <= 0);
        return O0(c10, z10, c11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet<C> O0(C c10, boolean z10, C c11, boolean z11);

    @Override // com.google.common.collect.ImmutableSortedSet
    @o9.c
    ImmutableSortedSet<C> n0() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> tailSet(C c10) {
        return R0((Comparable) com.google.common.base.w.E(c10), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> tailSet(C c10, boolean z10) {
        return R0((Comparable) com.google.common.base.w.E(c10), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet<C> R0(C c10, boolean z10);

    @Override // java.util.AbstractCollection
    public String toString() {
        return f1().toString();
    }
}
