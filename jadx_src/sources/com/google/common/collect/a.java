package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class a<E> extends c3<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58041c;

    protected a(int i10) {
        this(i10, 0);
    }

    protected a(int i10, int i11) {
        com.google.common.base.w.d0(i11, i10);
        this.f58040b = i10;
        this.f58041c = i11;
    }

    @x1
    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f58041c < this.f58040b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f58041c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @x1
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f58041c;
        this.f58041c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f58041c;
    }

    @Override // java.util.ListIterator
    @x1
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f58041c - 1;
        this.f58041c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f58041c - 1;
    }
}
