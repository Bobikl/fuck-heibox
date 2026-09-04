package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingBlockingQueue.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.a
@o9.c
public abstract class a0<E> extends com.google.common.collect.z0<E> implements BlockingQueue<E> {
    protected a0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.z0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> X0();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return X0().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        return X0().drainTo(collection, i10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().offer(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CheckForNull
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        return X0().poll(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        X0().put(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return X0().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return X0().take();
    }
}
