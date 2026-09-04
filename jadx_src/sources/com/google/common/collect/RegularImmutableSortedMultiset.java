package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long[] f57833j = {0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final ImmutableSortedMultiset<Comparable> f57834k = new RegularImmutableSortedMultiset(Ordering.z());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @o9.d
    final transient RegularImmutableSortedSet<E> f57835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient long[] f57836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f57837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f57838i;

    RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i10, int i11) {
        this.f57835f = regularImmutableSortedSet;
        this.f57836g = jArr;
        this.f57837h = i10;
        this.f57838i = i11;
    }

    RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.f57835f = ImmutableSortedSet.s0(comparator);
        this.f57836g = f57833j;
        this.f57837h = 0;
        this.f57838i = 0;
    }

    private int B0(int i10) {
        long[] jArr = this.f57836g;
        int i11 = this.f57837h;
        return (int) (jArr[(i11 + i10) + 1] - jArr[i11 + i10]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o2
    /* JADX INFO: renamed from: A0 */
    public ImmutableSortedMultiset<E> F1(E e10, BoundType boundType) {
        return C0(this.f57835f.W0(e10, com.google.common.base.w.E(boundType) == BoundType.CLOSED), this.f57838i);
    }

    ImmutableSortedMultiset<E> C0(int i10, int i11) {
        com.google.common.base.w.f0(i10, i11, this.f57838i);
        if (i10 == i11) {
            return ImmutableSortedMultiset.h0(comparator());
        }
        return (i10 == 0 && i11 == this.f57838i) ? this : new RegularImmutableSortedMultiset(this.f57835f.U0(i10, i11), this.f57836g, this.f57837h + i10, i11 - i10);
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        int iIndexOf = this.f57835f.indexOf(obj);
        if (iIndexOf >= 0) {
            return B0(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: d0 */
    public ImmutableSortedSet<E> c() {
        return this.f57835f;
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return y(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return this.f57837h > 0 || this.f57838i < this.f57836g.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o2
    /* JADX INFO: renamed from: i0 */
    public ImmutableSortedMultiset<E> m0(E e10, BoundType boundType) {
        return C0(0, this.f57835f.V0(e10, com.google.common.base.w.E(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return y(this.f57838i - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        long[] jArr = this.f57836g;
        int i10 = this.f57837h;
        return Ints.x(jArr[this.f57838i + i10] - jArr[i10]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    s1.a<E> y(int i10) {
        return Multisets.k(this.f57835f.a().get(i10), B0(i10));
    }
}
