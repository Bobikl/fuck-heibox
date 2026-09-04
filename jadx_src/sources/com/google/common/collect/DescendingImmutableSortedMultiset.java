package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient ImmutableSortedMultiset<E> f57188f;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f57188f = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o2
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> F1(E e10, BoundType boundType) {
        return this.f57188f.m0(e10, boundType).e0();
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        return this.f57188f.E1(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o2
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> e0() {
        return this.f57188f;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> c() {
        return this.f57188f.c().descendingSet();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> firstEntry() {
        return this.f57188f.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return this.f57188f.i();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> m0(E e10, BoundType boundType) {
        return this.f57188f.F1(e10, boundType).e0();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> lastEntry() {
        return this.f57188f.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        return this.f57188f.size();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    s1.a<E> y(int i10) {
        return this.f57188f.entrySet().a().U().get(i10);
    }
}
