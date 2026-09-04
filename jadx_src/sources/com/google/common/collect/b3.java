package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: UnmodifiableIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class b3<E> implements Iterator<E> {
    protected b3() {
    }

    @Override // java.util.Iterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
