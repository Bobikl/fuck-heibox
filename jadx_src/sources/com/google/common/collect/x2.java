package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: TransformedListIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class x2<F, T> extends w2<F, T> implements ListIterator<T> {
    x2(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> b() {
        return Iterators.f(this.f58220b);
    }

    @Override // java.util.ListIterator
    public void add(@x1 T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    @x1
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(@x1 T t10) {
        throw new UnsupportedOperationException();
    }
}
