package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: PeekingIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.f("Use Iterators.peekingIterator")
@u
public interface y1<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @x1
    @s9.a
    E next();

    @x1
    E peek();

    @Override // java.util.Iterator
    void remove();
}
