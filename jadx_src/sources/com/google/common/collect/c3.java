package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: UnmodifiableListIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class c3<E> extends b3<E> implements ListIterator<E> {
    protected c3() {
    }

    @Override // java.util.ListIterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@x1 E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@x1 E e10) {
        throw new UnsupportedOperationException();
    }
}
