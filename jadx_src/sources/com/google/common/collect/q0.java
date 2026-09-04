package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: ForwardingListIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class q0<E> extends o0<E> implements ListIterator<E> {
    protected q0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.o0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> X0();

    @Override // java.util.ListIterator
    public void add(@x1 E e10) {
        X0().add(e10);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return X0().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return X0().nextIndex();
    }

    @Override // java.util.ListIterator
    @x1
    @s9.a
    public E previous() {
        return X0().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return X0().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@x1 E e10) {
        X0().set(e10);
    }
}
