package com.igexin.a.a.d;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile int f63272g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ f f63274i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ReentrantLock f63268c = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue<e> f63266a = new SynchronousQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HashMap<Integer, i> f63267b = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile long f63270e = TimeUnit.SECONDS.toNanos(60);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile int f63271f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ThreadFactory f63269d = new j(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile int f63273h = Integer.MAX_VALUE;

    public h(f fVar) {
        this.f63274i = fVar;
    }

    final e a() {
        while (true) {
            try {
                e eVarPoll = this.f63272g > this.f63271f ? this.f63266a.poll(this.f63270e, TimeUnit.NANOSECONDS) : this.f63266a.take();
                if (eVarPoll != null) {
                    return eVarPoll;
                }
                if (this.f63266a.isEmpty()) {
                    return null;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    final void a(e eVar) {
        eVar.getClass();
        if (eVar.f63246y != 0) {
            ReentrantLock reentrantLock = this.f63268c;
            reentrantLock.lock();
            try {
                i iVar = this.f63267b.get(Integer.valueOf(eVar.f63246y));
                if (iVar != null) {
                    iVar.f63275a.offer(eVar);
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        b(eVar);
    }

    final boolean a(i iVar) {
        ReentrantLock reentrantLock = this.f63268c;
        reentrantLock.lock();
        try {
            int i10 = this.f63272g - 1;
            this.f63272g = i10;
            if (i10 == 0 && !this.f63266a.isEmpty()) {
                Thread threadF = f(null);
                if (threadF != null) {
                    threadF.start();
                }
            } else if (!iVar.f63275a.isEmpty()) {
                return true;
            }
            this.f63267b.remove(Integer.valueOf(iVar.f63278d));
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    final void b(e eVar) {
        if (this.f63272g >= this.f63271f || !c(eVar)) {
            if (!this.f63266a.offer(eVar)) {
                d(eVar);
            } else if (this.f63272g == 0) {
                e(eVar);
            }
        }
    }

    final boolean c(e eVar) {
        ReentrantLock reentrantLock = this.f63268c;
        reentrantLock.lock();
        try {
            Thread threadF = this.f63272g < this.f63271f ? f(eVar) : null;
            reentrantLock.unlock();
            if (threadF == null) {
                return false;
            }
            threadF.start();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    final boolean d(e eVar) {
        ReentrantLock reentrantLock = this.f63268c;
        reentrantLock.lock();
        try {
            Thread threadF = this.f63272g < this.f63273h ? f(eVar) : null;
            reentrantLock.unlock();
            if (threadF == null) {
                return false;
            }
            threadF.start();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    final void e(e eVar) {
        ReentrantLock reentrantLock = this.f63268c;
        reentrantLock.lock();
        try {
            Thread threadF = null;
            if (this.f63272g < Math.max(this.f63271f, 1) && !this.f63266a.isEmpty()) {
                threadF = f(null);
            }
            reentrantLock.unlock();
            if (threadF != null) {
                threadF.start();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    final Thread f(e eVar) {
        int i10;
        i iVar = new i(this, eVar);
        if (eVar != null && (i10 = eVar.f63246y) != 0) {
            this.f63267b.put(Integer.valueOf(i10), iVar);
        }
        Thread threadNewThread = this.f63269d.newThread(iVar);
        if (threadNewThread != null) {
            this.f63272g++;
        }
        return threadNewThread;
    }
}
