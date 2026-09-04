package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: DescendingMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class t<E> extends v0<E> implements o2<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private transient Comparator<? super E> f58172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient NavigableSet<E> f58173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private transient Set<s1.a<E>> f58174d;

    /* JADX INFO: compiled from: DescendingMultiset.java */
    public class a extends Multisets.i<E> {
        a() {
        }

        @Override // com.google.common.collect.Multisets.i
        s1<E> h() {
            return t.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<s1.a<E>> iterator() {
            return t.this.o1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.p1().entrySet().size();
        }
    }

    t() {
    }

    @Override // com.google.common.collect.o2
    public o2<E> F1(@x1 E e10, BoundType boundType) {
        return p1().m0(e10, boundType).e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v0, com.google.common.collect.h0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public s1<E> H0() {
        return p1();
    }

    @Override // com.google.common.collect.v0, com.google.common.collect.s1
    public NavigableSet<E> c() {
        NavigableSet<E> navigableSet = this.f58173c;
        if (navigableSet != null) {
            return navigableSet;
        }
        r2.b bVar = new r2.b(this);
        this.f58173c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.o2, com.google.common.collect.j2
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f58172b;
        if (comparator != null) {
            return comparator;
        }
        Ordering orderingE = Ordering.i(p1().comparator()).E();
        this.f58172b = orderingE;
        return orderingE;
    }

    @Override // com.google.common.collect.o2
    public o2<E> e0() {
        return p1();
    }

    @Override // com.google.common.collect.v0, com.google.common.collect.s1
    public Set<s1.a<E>> entrySet() {
        Set<s1.a<E>> set = this.f58174d;
        if (set != null) {
            return set;
        }
        Set<s1.a<E>> setM1 = m1();
        this.f58174d = setM1;
        return setM1;
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> firstEntry() {
        return p1().lastEntry();
    }

    @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return Multisets.n(this);
    }

    @Override // com.google.common.collect.o2
    public o2<E> j1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2) {
        return p1().j1(e11, boundType2, e10, boundType).e0();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> lastEntry() {
        return p1().firstEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> m0(@x1 E e10, BoundType boundType) {
        return p1().F1(e10, boundType).e0();
    }

    Set<s1.a<E>> m1() {
        return new a();
    }

    abstract Iterator<s1.a<E>> o1();

    abstract o2<E> p1();

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollFirstEntry() {
        return p1().pollLastEntry();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollLastEntry() {
        return p1().pollFirstEntry();
    }

    @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return U0();
    }

    @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) V0(tArr);
    }

    @Override // com.google.common.collect.y0
    public String toString() {
        return entrySet().toString();
    }
}
