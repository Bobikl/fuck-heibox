package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingDeque.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class j0<E> extends z0<E> implements Deque<E> {
    protected j0() {
    }

    @Override // java.util.Deque
    public void addFirst(@x1 E e10) {
        X0().addFirst(e10);
    }

    @Override // java.util.Deque
    public void addLast(@x1 E e10) {
        X0().addLast(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.z0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> X0();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return X0().descendingIterator();
    }

    @Override // java.util.Deque
    @x1
    public E getFirst() {
        return X0().getFirst();
    }

    @Override // java.util.Deque
    @x1
    public E getLast() {
        return X0().getLast();
    }

    @Override // java.util.Deque
    @s9.a
    public boolean offerFirst(@x1 E e10) {
        return X0().offerFirst(e10);
    }

    @Override // java.util.Deque
    @s9.a
    public boolean offerLast(@x1 E e10) {
        return X0().offerLast(e10);
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekFirst() {
        return X0().peekFirst();
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekLast() {
        return X0().peekLast();
    }

    @Override // java.util.Deque
    @s9.a
    @CheckForNull
    public E pollFirst() {
        return X0().pollFirst();
    }

    @Override // java.util.Deque
    @s9.a
    @CheckForNull
    public E pollLast() {
        return X0().pollLast();
    }

    @Override // java.util.Deque
    @x1
    @s9.a
    public E pop() {
        return X0().pop();
    }

    @Override // java.util.Deque
    public void push(@x1 E e10) {
        X0().push(e10);
    }

    @Override // java.util.Deque
    @x1
    @s9.a
    public E removeFirst() {
        return X0().removeFirst();
    }

    @Override // java.util.Deque
    @s9.a
    public boolean removeFirstOccurrence(@CheckForNull Object obj) {
        return X0().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @x1
    @s9.a
    public E removeLast() {
        return X0().removeLast();
    }

    @Override // java.util.Deque
    @s9.a
    public boolean removeLastOccurrence(@CheckForNull Object obj) {
        return X0().removeLastOccurrence(obj);
    }
}
