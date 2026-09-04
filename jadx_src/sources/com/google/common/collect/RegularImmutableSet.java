package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object[] f57826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final RegularImmutableSet<Object> f57827m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @o9.d
    final transient Object[] f57828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f57829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @o9.d
    final transient Object[] f57830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f57831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f57832k;

    static {
        Object[] objArr = new Object[0];
        f57826l = objArr;
        f57827m = new RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f57828g = objArr;
        this.f57829h = i10;
        this.f57830i = objArr2;
        this.f57831j = i11;
        this.f57832k = i12;
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList<E> A() {
        return ImmutableList.o(this.f57828g, this.f57832k);
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean B() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int b(Object[] objArr, int i10) {
        System.arraycopy(this.f57828g, 0, objArr, i10, this.f57832k);
        return i10 + this.f57832k;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f57830i;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iD = i1.d(obj);
        while (true) {
            int i10 = iD & this.f57831j;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iD = i10 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] e() {
        return this.f57828g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return this.f57832k;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f57829h;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f57832k;
    }
}
