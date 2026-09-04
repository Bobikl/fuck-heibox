package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final String TAG = "LimitQueue";
    private static final long serialVersionUID = -4636313759149307798L;
    private boolean deduplication;
    private int limit;

    public LimitQueue(int i10) {
        this.deduplication = false;
        this.limit = i10;
    }

    public LimitQueue(int i10, boolean z10) {
        this.limit = i10;
        this.deduplication = z10;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z10) {
        this(collection.size(), z10);
        addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        if (this.deduplication) {
            super.remove(e10);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.add(e10);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.limit) {
            return false;
        }
        if (this.deduplication) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.limit; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i10) {
        Iterator<E> it = iterator();
        E next = null;
        for (int i11 = 0; i11 <= i10 && it.hasNext(); i11++) {
            next = it.next();
        }
        return next;
    }

    public int getLimit() {
        return this.limit;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e10) {
        if (this.deduplication) {
            super.remove(e10);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.offer(e10);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E next = null;
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.w(TAG, "remove failed, limitQueue is empty");
            return null;
        }
    }
}
