package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingQueue.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class z0<E> extends h0<E> implements Queue<E> {
    protected z0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h0
    public abstract Queue<E> X0();

    protected boolean Z0(@x1 E e10) {
        try {
            return add(e10);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @CheckForNull
    protected E a1() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @CheckForNull
    protected E b1() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // java.util.Queue
    @x1
    public E element() {
        return X0().element();
    }

    @s9.a
    public boolean offer(@x1 E e10) {
        return X0().offer(e10);
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        return X0().peek();
    }

    @Override // java.util.Queue
    @s9.a
    @CheckForNull
    public E poll() {
        return X0().poll();
    }

    @Override // java.util.Queue
    @x1
    @s9.a
    public E remove() {
        return X0().remove();
    }
}
