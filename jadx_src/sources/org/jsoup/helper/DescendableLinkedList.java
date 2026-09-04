package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
public class DescendableLinkedList<E> extends LinkedList<E> {

    public class b<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ListIterator<E> f137833b;

        private b(int i10) {
            this.f137833b = DescendableLinkedList.this.listIterator(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f137833b.hasPrevious();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.f137833b.previous();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f137833b.remove();
        }
    }

    @Override // java.util.LinkedList, java.util.Deque
    public Iterator<E> descendingIterator() {
        return new b(size());
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E peekLast() {
        if (size() == 0) {
            return null;
        }
        return getLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E pollLast() {
        if (size() == 0) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void push(E e10) {
        addFirst(e10);
    }
}
