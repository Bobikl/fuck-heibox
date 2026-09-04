package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingNavigableSet.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class x0<E> extends e1<E> implements NavigableSet<E> {

    /* JADX INFO: compiled from: ForwardingNavigableSet.java */
    @o9.a
    public class a extends Sets.f<E> {
        public a(x0 x0Var) {
            super(x0Var);
        }
    }

    protected x0() {
    }

    @Override // com.google.common.collect.e1
    protected SortedSet<E> c1(@x1 E e10, @x1 E e11) {
        return subSet(e10, true, e11, false);
    }

    @CheckForNull
    public E ceiling(@x1 E e10) {
        return H0().ceiling(e10);
    }

    public Iterator<E> descendingIterator() {
        return H0().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return H0().descendingSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.e1
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> X0();

    @CheckForNull
    protected E f1(@x1 E e10) {
        return (E) Iterators.J(tailSet(e10, true).iterator(), null);
    }

    @CheckForNull
    public E floor(@x1 E e10) {
        return H0().floor(e10);
    }

    @x1
    protected E g1() {
        return iterator().next();
    }

    @CheckForNull
    protected E h1(@x1 E e10) {
        return (E) Iterators.J(headSet(e10, true).descendingIterator(), null);
    }

    public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
        return H0().headSet(e10, z10);
    }

    @CheckForNull
    public E higher(@x1 E e10) {
        return H0().higher(e10);
    }

    @CheckForNull
    public E lower(@x1 E e10) {
        return H0().lower(e10);
    }

    protected SortedSet<E> m1(@x1 E e10) {
        return headSet(e10, false);
    }

    @CheckForNull
    protected E o1(@x1 E e10) {
        return (E) Iterators.J(tailSet(e10, false).iterator(), null);
    }

    @x1
    protected E p1() {
        return descendingIterator().next();
    }

    @CheckForNull
    public E pollFirst() {
        return H0().pollFirst();
    }

    @CheckForNull
    public E pollLast() {
        return H0().pollLast();
    }

    @CheckForNull
    protected E q1(@x1 E e10) {
        return (E) Iterators.J(headSet(e10, false).descendingIterator(), null);
    }

    @CheckForNull
    protected E r1() {
        return (E) Iterators.U(iterator());
    }

    @CheckForNull
    protected E s1() {
        return (E) Iterators.U(descendingIterator());
    }

    public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
        return H0().subSet(e10, z10, e11, z11);
    }

    public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
        return H0().tailSet(e10, z10);
    }

    @o9.a
    protected NavigableSet<E> u1(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
        return tailSet(e10, z10).headSet(e11, z11);
    }

    protected SortedSet<E> v1(@x1 E e10) {
        return tailSet(e10, true);
    }
}
