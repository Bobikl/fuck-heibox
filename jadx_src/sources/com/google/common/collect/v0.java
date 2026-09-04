package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class v0<E> extends h0<E> implements s1<E> {

    /* JADX INFO: compiled from: ForwardingMultiset.java */
    @o9.a
    public class a extends Multisets.h<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.h
        s1<E> h() {
            return v0.this;
        }

        @Override // com.google.common.collect.Multisets.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.h(h().entrySet().iterator());
        }
    }

    protected v0() {
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        return X0().E1(obj);
    }

    @s9.a
    public int I0(@x1 E e10, int i10) {
        return X0().I0(e10, i10);
    }

    @Override // com.google.common.collect.h0
    @o9.a
    protected boolean J0(Collection<? extends E> collection) {
        return Multisets.c(this, collection);
    }

    @Override // com.google.common.collect.h0
    protected void L0() {
        Iterators.h(entrySet().iterator());
    }

    @Override // com.google.common.collect.h0
    protected boolean N0(@CheckForNull Object obj) {
        return E1(obj) > 0;
    }

    @Override // com.google.common.collect.h0
    protected boolean R0(@CheckForNull Object obj) {
        return n1(obj, 1) > 0;
    }

    @Override // com.google.common.collect.h0
    protected boolean S0(Collection<?> collection) {
        return Multisets.p(this, collection);
    }

    @Override // com.google.common.collect.h0
    protected boolean T0(Collection<?> collection) {
        return Multisets.s(this, collection);
    }

    @Override // com.google.common.collect.h0
    protected String W0() {
        return entrySet().toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h0
    public abstract s1<E> H0();

    protected boolean Z0(@x1 E e10) {
        c0(e10, 1);
        return true;
    }

    @o9.a
    protected int a1(@CheckForNull Object obj) {
        for (s1.a<E> aVar : entrySet()) {
            if (com.google.common.base.s.a(aVar.a(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    protected boolean b1(@CheckForNull Object obj) {
        return Multisets.i(this, obj);
    }

    public Set<E> c() {
        return X0().c();
    }

    @s9.a
    public int c0(@x1 E e10, int i10) {
        return X0().c0(e10, i10);
    }

    protected int c1() {
        return entrySet().hashCode();
    }

    protected Iterator<E> e1() {
        return Multisets.n(this);
    }

    public Set<s1.a<E>> entrySet() {
        return X0().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.s1
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || X0().equals(obj);
    }

    protected int f1(@x1 E e10, int i10) {
        return Multisets.v(this, e10, i10);
    }

    @s9.a
    public boolean g0(@x1 E e10, int i10, int i11) {
        return X0().g0(e10, i10, i11);
    }

    protected boolean g1(@x1 E e10, int i10, int i11) {
        return Multisets.w(this, e10, i10, i11);
    }

    protected int h1() {
        return Multisets.o(this);
    }

    @Override // java.util.Collection, com.google.common.collect.s1
    public int hashCode() {
        return X0().hashCode();
    }

    @s9.a
    public int n1(@CheckForNull Object obj, int i10) {
        return X0().n1(obj, i10);
    }
}
