package com.google.common.collect;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingBlockingDeque.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
@Deprecated
public abstract class g0<E> extends j0<E> implements BlockingDeque<E> {
    protected g0() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return X0().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        return X0().drainTo(collection, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.j0
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> X0();

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().offer(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().offerFirst(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().offerLast(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @CheckForNull
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().poll(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollFirst(long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().pollFirst(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollLast(long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().pollLast(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        X0().put(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e10) throws InterruptedException {
        X0().putFirst(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e10) throws InterruptedException {
        X0().putLast(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return X0().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return X0().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return X0().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return X0().takeLast();
    }
}
