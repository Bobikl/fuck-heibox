package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class d<E> extends AbstractCollection<E> implements s1<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Set<E> f58065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Set<s1.a<E>> f58066c;

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class a extends Multisets.h<E> {
        a() {
        }

        @Override // com.google.common.collect.Multisets.h
        s1<E> h() {
            return d.this;
        }

        @Override // com.google.common.collect.Multisets.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return d.this.g();
        }
    }

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class b extends Multisets.i<E> {
        b() {
        }

        @Override // com.google.common.collect.Multisets.i
        s1<E> h() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<s1.a<E>> iterator() {
            return d.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.e();
        }
    }

    d() {
    }

    @s9.a
    public int I0(@x1 E e10, int i10) {
        return Multisets.v(this, e10, i10);
    }

    Set<E> a() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    @s9.a
    public final boolean add(@x1 E e10) {
        c0(e10, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.c(this, collection);
    }

    Set<s1.a<E>> b() {
        return new b();
    }

    public Set<E> c() {
        Set<E> set = this.f58065b;
        if (set != null) {
            return set;
        }
        Set<E> setA = a();
        this.f58065b = setA;
        return setA;
    }

    @s9.a
    public int c0(@x1 E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public boolean contains(@CheckForNull Object obj) {
        return E1(obj) > 0;
    }

    abstract int e();

    public Set<s1.a<E>> entrySet() {
        Set<s1.a<E>> set = this.f58066c;
        if (set != null) {
            return set;
        }
        Set<s1.a<E>> setB = b();
        this.f58066c = setB;
        return setB;
    }

    @Override // java.util.Collection, com.google.common.collect.s1
    public final boolean equals(@CheckForNull Object obj) {
        return Multisets.i(this, obj);
    }

    abstract Iterator<E> g();

    @s9.a
    public boolean g0(@x1 E e10, int i10, int i11) {
        return Multisets.w(this, e10, i10, i11);
    }

    abstract Iterator<s1.a<E>> h();

    @Override // java.util.Collection, com.google.common.collect.s1
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @s9.a
    public int n1(@CheckForNull Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    @s9.a
    public final boolean remove(@CheckForNull Object obj) {
        return n1(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    @s9.a
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.p(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    @s9.a
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.s(this, collection);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.s1
    public final String toString() {
        return entrySet().toString();
    }
}
