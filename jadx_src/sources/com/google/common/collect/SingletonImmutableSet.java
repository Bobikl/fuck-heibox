package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient E f57885g;

    SingletonImmutableSet(E e10) {
        this.f57885g = (E) com.google.common.base.w.E(e10);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> a() {
        return ImmutableList.D(this.f57885g);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int b(Object[] objArr, int i10) {
        objArr[i10] = this.f57885g;
        return i10 + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f57885g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f57885g.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return Iterators.Y(this.f57885g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f57885g.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
