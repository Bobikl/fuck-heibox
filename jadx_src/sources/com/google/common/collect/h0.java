package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingCollection.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class h0<E> extends y0 implements Collection<E> {
    protected h0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    /* JADX INFO: renamed from: H0 */
    public abstract Collection<E> X0();

    protected boolean J0(Collection<? extends E> collection) {
        return Iterators.a(this, collection.iterator());
    }

    protected void L0() {
        Iterators.h(iterator());
    }

    protected boolean N0(@CheckForNull Object obj) {
        return Iterators.q(iterator(), obj);
    }

    protected boolean O0(Collection<?> collection) {
        return o.b(this, collection);
    }

    protected boolean P0() {
        return !iterator().hasNext();
    }

    protected boolean R0(@CheckForNull Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (com.google.common.base.s.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean S0(Collection<?> collection) {
        return Iterators.V(iterator(), collection);
    }

    protected boolean T0(Collection<?> collection) {
        return Iterators.X(iterator(), collection);
    }

    protected Object[] U0() {
        return toArray(new Object[size()]);
    }

    protected <T> T[] V0(T[] tArr) {
        return (T[]) u1.m(this, tArr);
    }

    protected String W0() {
        return o.l(this);
    }

    @s9.a
    public boolean add(@x1 E e10) {
        return X0().add(e10);
    }

    @s9.a
    public boolean addAll(Collection<? extends E> collection) {
        return X0().addAll(collection);
    }

    public void clear() {
        X0().clear();
    }

    public boolean contains(@CheckForNull Object obj) {
        return X0().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return X0().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return X0().isEmpty();
    }

    public Iterator<E> iterator() {
        return X0().iterator();
    }

    @s9.a
    public boolean remove(@CheckForNull Object obj) {
        return X0().remove(obj);
    }

    @s9.a
    public boolean removeAll(Collection<?> collection) {
        return X0().removeAll(collection);
    }

    @s9.a
    public boolean retainAll(Collection<?> collection) {
        return X0().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return X0().size();
    }

    public Object[] toArray() {
        return X0().toArray();
    }

    @s9.a
    public <T> T[] toArray(T[] tArr) {
        return (T[]) X0().toArray(tArr);
    }
}
