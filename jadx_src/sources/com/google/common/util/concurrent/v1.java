package com.google.common.util.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: Uninterruptibles.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public final class v1 {
    private v1() {
    }

    @o9.c
    public static void a(ExecutorService executorService) {
        com.google.common.base.g0.a(b(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @o9.c
    public static boolean b(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwaitTermination = executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwaitTermination;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static void c(CountDownLatch countDownLatch) {
        boolean z10 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @s9.a
    @o9.c
    public static boolean d(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static boolean e(Condition condition, long j10, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = condition.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @s9.a
    @b1
    public static <V> V f(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @s9.a
    @b1
    @o9.c
    public static <V> V g(Future<V> future, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        V v10;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    v10 = future.get(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return v10;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static void h(Thread thread) {
        boolean z10 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @o9.c
    public static void i(Thread thread, long j10, TimeUnit timeUnit) {
        com.google.common.base.w.E(thread);
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static <E> void j(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @o9.c
    public static void k(long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static <E> E l(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z10 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @o9.c
    public static boolean m(Semaphore semaphore, int i10, long j10, TimeUnit timeUnit) {
        boolean zTryAcquire;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryAcquire = semaphore.tryAcquire(i10, nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zTryAcquire;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @o9.c
    public static boolean n(Semaphore semaphore, long j10, TimeUnit timeUnit) {
        return m(semaphore, 1, j10, timeUnit);
    }

    @o9.c
    public static boolean o(Lock lock, long j10, TimeUnit timeUnit) {
        boolean zTryLock;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryLock = lock.tryLock(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }
}
