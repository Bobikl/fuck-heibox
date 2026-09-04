package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class w2<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterator<? extends F> f58220b;

    w2(Iterator<? extends F> it) {
        this.f58220b = (Iterator) com.google.common.base.w.E(it);
    }

    @x1
    abstract T a(@x1 F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58220b.hasNext();
    }

    @Override // java.util.Iterator
    @x1
    public final T next() {
        return a(this.f58220b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f58220b.remove();
    }
}
