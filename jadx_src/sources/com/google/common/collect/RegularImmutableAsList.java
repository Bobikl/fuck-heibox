package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public class RegularImmutableAsList<E> extends ImmutableAsList<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableCollection<E> f57789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableList<? extends E> f57790e;

    RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.f57789d = immutableCollection;
        this.f57790e = immutableList;
    }

    RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.m(objArr));
    }

    RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr, int i10) {
        this(immutableCollection, ImmutableList.o(objArr, i10));
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    /* JADX INFO: renamed from: A */
    public c3<E> listIterator(int i10) {
        return this.f57790e.listIterator(i10);
    }

    @Override // com.google.common.collect.ImmutableAsList
    ImmutableCollection<E> Z() {
        return this.f57789d;
    }

    ImmutableList<? extends E> a0() {
        return this.f57790e;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @o9.c
    int b(Object[] objArr, int i10) {
        return this.f57790e.b(objArr, i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    Object[] e() {
        return this.f57790e.e();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return this.f57790e.g();
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f57790e.get(i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int h() {
        return this.f57790e.h();
    }
}
