package com.google.common.util.concurrent;

import com.google.common.primitives.Longs;
import com.taobao.accs.common.Constants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Monitor.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f59564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.a("lock")
    private a f59565c;

    /* JADX INFO: compiled from: Monitor.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @u9.g
        final x0 f59566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Condition f59567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @t9.a("monitor.lock")
        int f59568c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        @t9.a("monitor.lock")
        a f59569d;

        protected a(x0 x0Var) {
            this.f59566a = (x0) com.google.common.base.w.F(x0Var, Constants.KEY_MONIROT);
            this.f59567b = x0Var.f59564b.newCondition();
        }

        public abstract boolean a();
    }

    public x0() {
        this(false);
    }

    public x0(boolean z10) {
        this.f59565c = null;
        this.f59563a = z10;
        this.f59564b = new ReentrantLock(z10);
    }

    @t9.a("lock")
    private boolean C(a aVar) {
        try {
            return aVar.a();
        } catch (Throwable th2) {
            F();
            throw th2;
        }
    }

    private static long E(long j10, long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        return j11 - (System.nanoTime() - j10);
    }

    @t9.a("lock")
    private void F() {
        for (a aVar = this.f59565c; aVar != null; aVar = aVar.f59569d) {
            aVar.f59567b.signalAll();
        }
    }

    @t9.a("lock")
    private void G() {
        for (a aVar = this.f59565c; aVar != null; aVar = aVar.f59569d) {
            if (C(aVar)) {
                aVar.f59567b.signal();
                return;
            }
        }
    }

    private static long H(long j10, TimeUnit timeUnit) {
        return Longs.f(timeUnit.toNanos(j10), 0L, 6917529027641081853L);
    }

    @t9.a("lock")
    private void b(a aVar, boolean z10) throws InterruptedException {
        if (z10) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.f59567b.await();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @t9.a("lock")
    private boolean c(a aVar, long j10, boolean z10) throws InterruptedException {
        boolean z11 = true;
        while (j10 > 0) {
            if (z11) {
                if (z10) {
                    try {
                        G();
                    } catch (Throwable th2) {
                        if (!z11) {
                            f(aVar);
                        }
                        throw th2;
                    }
                }
                e(aVar);
                z11 = false;
            }
            j10 = aVar.f59567b.awaitNanos(j10);
            if (aVar.a()) {
                if (!z11) {
                    f(aVar);
                }
                return true;
            }
        }
        if (!z11) {
            f(aVar);
        }
        return false;
    }

    @t9.a("lock")
    private void d(a aVar, boolean z10) {
        if (z10) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.f59567b.awaitUninterruptibly();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @t9.a("lock")
    private void e(a aVar) {
        int i10 = aVar.f59568c;
        aVar.f59568c = i10 + 1;
        if (i10 == 0) {
            aVar.f59569d = this.f59565c;
            this.f59565c = aVar;
        }
    }

    @t9.a("lock")
    private void f(a aVar) {
        int i10 = aVar.f59568c - 1;
        aVar.f59568c = i10;
        if (i10 == 0) {
            a aVar2 = this.f59565c;
            a aVar3 = null;
            while (aVar2 != aVar) {
                aVar3 = aVar2;
                aVar2 = aVar2.f59569d;
            }
            if (aVar3 == null) {
                this.f59565c = aVar2.f59569d;
            } else {
                aVar3.f59569d = aVar2.f59569d;
            }
            aVar2.f59569d = null;
        }
    }

    private static long y(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    public boolean A() {
        return this.f59564b.isLocked();
    }

    public boolean B() {
        return this.f59564b.isHeldByCurrentThread();
    }

    public void D() {
        ReentrantLock reentrantLock = this.f59564b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean I() {
        return this.f59564b.tryLock();
    }

    public boolean J(a aVar) {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zA = aVar.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void K(a aVar) throws InterruptedException {
        if (aVar.f59566a != this || !this.f59564b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return;
        }
        b(aVar, true);
    }

    public boolean L(a aVar, long j10, TimeUnit timeUnit) throws InterruptedException {
        long jH = H(j10, timeUnit);
        if (aVar.f59566a != this || !this.f59564b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return c(aVar, jH, true);
    }

    public void M(a aVar) {
        if (aVar.f59566a != this || !this.f59564b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return;
        }
        d(aVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    public boolean N(a aVar, long j10, TimeUnit timeUnit) throws Throwable {
        long jH = H(j10, timeUnit);
        if (aVar.f59566a != this || !this.f59564b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        boolean z10 = true;
        if (aVar.a()) {
            return true;
        }
        long jY = y(jH);
        boolean zInterrupted = Thread.interrupted();
        long jE = jH;
        boolean z11 = true;
        while (true) {
            try {
                try {
                    boolean zC = c(aVar, jE, z11);
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return zC;
                } catch (Throwable th2) {
                    th = th2;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (InterruptedException unused) {
                if (aVar.a()) {
                    Thread.currentThread().interrupt();
                    return true;
                }
                z11 = false;
                jE = E(jY, jH);
                zInterrupted = true;
            } catch (Throwable th3) {
                th = th3;
                z10 = zInterrupted;
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public void g() {
        this.f59564b.lock();
    }

    public boolean h(long j10, TimeUnit timeUnit) throws Throwable {
        boolean zTryLock;
        long jH = H(j10, timeUnit);
        ReentrantLock reentrantLock = this.f59564b;
        boolean z10 = true;
        if (!this.f59563a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jE = jH;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jE, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jE = E(jNanoTime, jH);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            th = th3;
            z10 = zInterrupted;
        }
    }

    public boolean i(a aVar) {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        reentrantLock.lock();
        try {
            boolean zA = aVar.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean j(a aVar, long j10, TimeUnit timeUnit) {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        if (!h(j10, timeUnit)) {
            return false;
        }
        try {
            boolean zA = aVar.a();
            if (!zA) {
                this.f59564b.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            this.f59564b.unlock();
            throw th2;
        }
    }

    public boolean k(a aVar) throws InterruptedException {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        reentrantLock.lockInterruptibly();
        try {
            boolean zA = aVar.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean l(a aVar, long j10, TimeUnit timeUnit) throws InterruptedException {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        if (!reentrantLock.tryLock(j10, timeUnit)) {
            return false;
        }
        try {
            boolean zA = aVar.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void m() throws InterruptedException {
        this.f59564b.lockInterruptibly();
    }

    public boolean n(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f59564b.tryLock(j10, timeUnit);
    }

    public void o(a aVar) throws InterruptedException {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (aVar.a()) {
                return;
            }
            b(aVar, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public boolean p(a aVar, long j10, TimeUnit timeUnit) throws InterruptedException {
        long jY;
        boolean z10;
        long jH = H(j10, timeUnit);
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        if (this.f59563a) {
            jY = y(jH);
            if (!reentrantLock.tryLock(j10, timeUnit)) {
                return false;
            }
        } else {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (reentrantLock.tryLock()) {
                jY = 0;
            } else {
                jY = y(jH);
                if (!reentrantLock.tryLock(j10, timeUnit)) {
                    return false;
                }
            }
        }
        try {
            if (!aVar.a()) {
                if (jY != 0) {
                    jH = E(jY, jH);
                }
                z10 = c(aVar, jH, zIsHeldByCurrentThread);
            }
            if (!z10) {
                reentrantLock.unlock();
            }
            return z10;
        } catch (Throwable th2) {
            if (!zIsHeldByCurrentThread) {
                try {
                    G();
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw th2;
        }
    }

    public void q(a aVar) {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (aVar.a()) {
                return;
            }
            d(aVar, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    public boolean r(a aVar, long j10, TimeUnit timeUnit) throws Throwable {
        long jY;
        long jE;
        long jH = H(j10, timeUnit);
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f59564b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = Thread.interrupted();
        boolean zC = true;
        try {
            if (this.f59563a || !reentrantLock.tryLock()) {
                jY = y(jH);
                long jE2 = jH;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jE2 = E(jY, jH);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jE2, TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jY = 0;
            }
            while (!aVar.a()) {
                try {
                    if (jY == 0) {
                        jY = y(jH);
                        jE = jH;
                    } else {
                        jE = E(jY, jH);
                    }
                    zC = c(aVar, jE, zIsHeldByCurrentThread);
                } catch (InterruptedException unused2) {
                    zInterrupted = zC;
                    zIsHeldByCurrentThread = false;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            if (!zC) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zC;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public int s() {
        return this.f59564b.getHoldCount();
    }

    public int t() {
        return this.f59564b.getQueueLength();
    }

    public int u(a aVar) {
        if (aVar.f59566a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f59564b.lock();
        try {
            return aVar.f59568c;
        } finally {
            this.f59564b.unlock();
        }
    }

    public boolean v(Thread thread) {
        return this.f59564b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.f59564b.hasQueuedThreads();
    }

    public boolean x(a aVar) {
        return u(aVar) > 0;
    }

    public boolean z() {
        return this.f59563a;
    }
}
