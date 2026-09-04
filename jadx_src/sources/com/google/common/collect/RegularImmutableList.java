package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final ImmutableList<Object> f57797f = new RegularImmutableList(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @o9.d
    final transient Object[] f57798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f57799e;

    RegularImmutableList(Object[] objArr, int i10) {
        this.f57798d = objArr;
        this.f57799e = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int b(Object[] objArr, int i10) {
        System.arraycopy(this.f57798d, 0, objArr, i10, this.f57799e);
        return i10 + this.f57799e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] e() {
        return this.f57798d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return this.f57799e;
    }

    @Override // java.util.List
    public E get(int i10) {
        com.google.common.base.w.C(i10, this.f57799e);
        E e10 = (E) this.f57798d[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57799e;
    }
}
