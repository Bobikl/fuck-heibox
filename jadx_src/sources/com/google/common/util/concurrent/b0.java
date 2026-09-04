package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: ForwardingCondition.java */
/* JADX INFO: loaded from: classes7.dex */
@u
public abstract class b0 implements Condition {
    b0() {
    }

    abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j10, TimeUnit timeUnit) throws InterruptedException {
        return a().await(j10, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j10) throws InterruptedException {
        return a().awaitNanos(j10);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        a().signalAll();
    }
}
