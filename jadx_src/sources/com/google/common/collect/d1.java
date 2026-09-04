package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b(emulated = true)
@u
public abstract class d1<E> extends v0<E> implements o2<E> {

    /* JADX INFO: compiled from: ForwardingSortedMultiset.java */
    public abstract class a extends t<E> {
        public a() {
        }

        @Override // com.google.common.collect.t
        o2<E> p1() {
            return d1.this;
        }
    }

    /* JADX INFO: compiled from: ForwardingSortedMultiset.java */
    public class b extends r2.b<E> {
        public b(d1 d1Var) {
            super(d1Var);
        }
    }

    protected d1() {
    }

    @Override // com.google.common.collect.o2
    public o2<E> F1(@x1 E e10, BoundType boundType) {
        return H0().F1(e10, boundType);
    }

    @Override // com.google.common.collect.v0, com.google.common.collect.s1
    public NavigableSet<E> c() {
        return H0().c();
    }

    @Override // com.google.common.collect.o2, com.google.common.collect.j2
    public Comparator<? super E> comparator() {
        return H0().comparator();
    }

    @Override // com.google.common.collect.o2
    public o2<E> e0() {
        return H0().e0();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> firstEntry() {
        return H0().firstEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> j1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2) {
        return H0().j1(e10, boundType, e11, boundType2);
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> lastEntry() {
        return H0().lastEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> m0(@x1 E e10, BoundType boundType) {
        return H0().m0(e10, boundType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v0
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public abstract o2<E> H0();

    @CheckForNull
    protected s1.a<E> o1() {
        Iterator<s1.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        s1.a<E> next = it.next();
        return Multisets.k(next.a(), next.getCount());
    }

    @CheckForNull
    protected s1.a<E> p1() {
        Iterator<s1.a<E>> it = e0().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        s1.a<E> next = it.next();
        return Multisets.k(next.a(), next.getCount());
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollFirstEntry() {
        return H0().pollFirstEntry();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollLastEntry() {
        return H0().pollLastEntry();
    }

    @CheckForNull
    protected s1.a<E> q1() {
        Iterator<s1.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        s1.a<E> next = it.next();
        s1.a<E> aVarK = Multisets.k(next.a(), next.getCount());
        it.remove();
        return aVarK;
    }

    @CheckForNull
    protected s1.a<E> r1() {
        Iterator<s1.a<E>> it = e0().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        s1.a<E> next = it.next();
        s1.a<E> aVarK = Multisets.k(next.a(), next.getCount());
        it.remove();
        return aVarK;
    }

    protected o2<E> s1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2) {
        return F1(e10, boundType).m0(e11, boundType2);
    }
}
