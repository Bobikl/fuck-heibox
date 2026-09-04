package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractSortedMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class h<E> extends d<E> implements o2<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @h1
    final Comparator<? super E> f58080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private transient o2<E> f58081e;

    /* JADX INFO: compiled from: AbstractSortedMultiset.java */
    public class a extends t<E> {
        a() {
        }

        @Override // com.google.common.collect.t, com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return h.this.descendingIterator();
        }

        @Override // com.google.common.collect.t
        Iterator<s1.a<E>> o1() {
            return h.this.l();
        }

        @Override // com.google.common.collect.t
        o2<E> p1() {
            return h.this;
        }
    }

    h() {
        this(Ordering.z());
    }

    h(Comparator<? super E> comparator) {
        this.f58080d = (Comparator) com.google.common.base.w.E(comparator);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }

    public Comparator<? super E> comparator() {
        return this.f58080d;
    }

    Iterator<E> descendingIterator() {
        return Multisets.n(e0());
    }

    public o2<E> e0() {
        o2<E> o2Var = this.f58081e;
        if (o2Var != null) {
            return o2Var;
        }
        o2<E> o2VarI = i();
        this.f58081e = o2VarI;
        return o2VarI;
    }

    @CheckForNull
    public s1.a<E> firstEntry() {
        Iterator<s1.a<E>> itH = h();
        if (itH.hasNext()) {
            return itH.next();
        }
        return null;
    }

    o2<E> i() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> a() {
        return new r2.b(this);
    }

    public o2<E> j1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2) {
        com.google.common.base.w.E(boundType);
        com.google.common.base.w.E(boundType2);
        return F1(e10, boundType).m0(e11, boundType2);
    }

    abstract Iterator<s1.a<E>> l();

    @CheckForNull
    public s1.a<E> lastEntry() {
        Iterator<s1.a<E>> itL = l();
        if (itL.hasNext()) {
            return itL.next();
        }
        return null;
    }

    @CheckForNull
    public s1.a<E> pollFirstEntry() {
        Iterator<s1.a<E>> itH = h();
        if (!itH.hasNext()) {
            return null;
        }
        s1.a<E> next = itH.next();
        s1.a<E> aVarK = Multisets.k(next.a(), next.getCount());
        itH.remove();
        return aVarK;
    }

    @CheckForNull
    public s1.a<E> pollLastEntry() {
        Iterator<s1.a<E>> itL = l();
        if (!itL.hasNext()) {
            return null;
        }
        s1.a<E> next = itL.next();
        s1.a<E> aVarK = Multisets.k(next.a(), next.getCount());
        itL.remove();
        return aVarK;
    }
}
