package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingList.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class p0<E> extends h0<E> implements List<E> {
    protected p0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h0
    public abstract List<E> X0();

    protected boolean Z0(@x1 E e10) {
        add(size(), e10);
        return true;
    }

    protected boolean a1(int i10, Iterable<? extends E> iterable) {
        return Lists.a(this, i10, iterable);
    }

    @Override // java.util.List
    public void add(int i10, @x1 E e10) {
        X0().add(i10, e10);
    }

    @Override // java.util.List
    @s9.a
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return X0().addAll(i10, collection);
    }

    @o9.a
    protected boolean b1(@CheckForNull Object obj) {
        return Lists.j(this, obj);
    }

    @o9.a
    protected int c1() {
        return Lists.k(this);
    }

    protected int e1(@CheckForNull Object obj) {
        return Lists.l(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || X0().equals(obj);
    }

    protected Iterator<E> f1() {
        return listIterator();
    }

    protected int g1(@CheckForNull Object obj) {
        return Lists.n(this, obj);
    }

    @Override // java.util.List
    @x1
    public E get(int i10) {
        return X0().get(i10);
    }

    protected ListIterator<E> h1() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return X0().hashCode();
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        return X0().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        return X0().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return X0().listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return X0().listIterator(i10);
    }

    @o9.a
    protected ListIterator<E> m1(int i10) {
        return Lists.p(this, i10);
    }

    @o9.a
    protected List<E> o1(int i10, int i11) {
        return Lists.C(this, i10, i11);
    }

    @Override // java.util.List
    @x1
    @s9.a
    public E remove(int i10) {
        return X0().remove(i10);
    }

    @Override // java.util.List
    @x1
    @s9.a
    public E set(int i10, @x1 E e10) {
        return X0().set(i10, e10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return X0().subList(i10, i11);
    }
}
