package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import sh.f;
import xh.h;

/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "LocksKt")
public final class a {
    @f
    private static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, yh.a<? extends T> action) {
        f0.p(reentrantReadWriteLock, "<this>");
        f0.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            c0.d(1);
            lock.unlock();
            c0.c(1);
        }
    }

    @f
    private static final <T> T b(Lock lock, yh.a<? extends T> action) {
        f0.p(lock, "<this>");
        f0.p(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            c0.d(1);
            lock.unlock();
            c0.c(1);
        }
    }

    @f
    private static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, yh.a<? extends T> action) {
        f0.p(reentrantReadWriteLock, "<this>");
        f0.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            c0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            c0.c(1);
        }
    }
}
