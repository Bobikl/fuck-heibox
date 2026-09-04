package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes7.dex */
@u
@ReflectionSupport(ReflectionSupport.Level.FULL)
@o9.b(emulated = true)
public abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f59314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Runnable f59315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f59316d = 1000;

    @o9.d
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterruptibleTask<?> f59317b;

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.f59317b = interruptibleTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f59317b.toString();
        }
    }

    public static final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f59314b = new b();
        f59315c = new b();
    }

    InterruptibleTask() {
    }

    private void g(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof Blocker;
            if (!z11 && runnable != f59315c) {
                break;
            }
            if (z11) {
                blocker = (Blocker) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f59315c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th2);

    abstract void b(@b1 T t10);

    final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.b(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f59314b) == f59315c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    @b1
    abstract T e() throws Exception;

    abstract String f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z10 = !d();
            if (z10) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    if (!compareAndSet(threadCurrentThread, f59314b)) {
                        g(threadCurrentThread);
                    }
                    if (z10) {
                        a(th2);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, f59314b)) {
                g(threadCurrentThread);
            }
            if (z10) {
                b(z0.a(objE));
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == f59314b) {
            string = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strF = f();
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strF).length());
        sb3.append(string);
        sb3.append(", ");
        sb3.append(strF);
        return sb3.toString();
    }
}
