package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f57147m = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    private transient int[] f57148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private transient int[] f57149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f57150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int f57151l;

    CompactLinkedHashSet() {
    }

    CompactLinkedHashSet(int i10) {
        super(i10);
    }

    public static <E> CompactLinkedHashSet<E> V() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> W(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetY = Y(collection.size());
        compactLinkedHashSetY.addAll(collection);
        return compactLinkedHashSetY;
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> X(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetY = Y(eArr.length);
        Collections.addAll(compactLinkedHashSetY, eArr);
        return compactLinkedHashSetY;
    }

    public static <E> CompactLinkedHashSet<E> Y(int i10) {
        return new CompactLinkedHashSet<>(i10);
    }

    private int Z(int i10) {
        return a0()[i10] - 1;
    }

    private int[] a0() {
        int[] iArr = this.f57148i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] b0() {
        int[] iArr = this.f57149j;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void d0(int i10, int i11) {
        a0()[i10] = i11 + 1;
    }

    private void h0(int i10, int i11) {
        if (i10 == -2) {
            this.f57150k = i11;
        } else {
            i0(i10, i11);
        }
        if (i11 == -2) {
            this.f57151l = i10;
        } else {
            d0(i11, i10);
        }
    }

    private void i0(int i10, int i11) {
        b0()[i10] = i11 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    void A(int i10, @x1 E e10, int i11, int i12) {
        super.A(i10, e10, i11, i12);
        h0(this.f57151l, i10);
        h0(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    void D(int i10, int i11) {
        int size = size() - 1;
        super.D(i10, i11);
        h0(Z(i10), v(i10));
        if (i10 < size) {
            h0(Z(size), i10);
            h0(i10, v(size));
        }
        a0()[size] = 0;
        b0()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    void J(int i10) {
        super.J(i10);
        this.f57148i = Arrays.copyOf(a0(), i10);
        this.f57149j = Arrays.copyOf(b0(), i10);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (E()) {
            return;
        }
        this.f57150k = -2;
        this.f57151l = -2;
        int[] iArr = this.f57148i;
        if (iArr != null && this.f57149j != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f57149j, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    int e(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    int g() {
        int iG = super.g();
        this.f57148i = new int[iG];
        this.f57149j = new int[iG];
        return iG;
    }

    @Override // com.google.common.collect.CompactHashSet
    @s9.a
    Set<E> h() {
        Set<E> setH = super.h();
        this.f57148i = null;
        this.f57149j = null;
        return setH;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return u1.l(this);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u1.m(this, tArr);
    }

    @Override // com.google.common.collect.CompactHashSet
    int u() {
        return this.f57150k;
    }

    @Override // com.google.common.collect.CompactHashSet
    int v(int i10) {
        return b0()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    void y(int i10) {
        super.y(i10);
        this.f57150k = -2;
        this.f57151l = -2;
    }
}
