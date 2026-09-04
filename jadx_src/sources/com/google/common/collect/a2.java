package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Queues.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class a2 {
    private a2() {
    }

    @s9.a
    @o9.a
    @o9.c
    public static <E> int a(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i10, long j10, TimeUnit timeUnit) throws InterruptedException {
        com.google.common.base.w.E(collection);
        long jNanoTime = System.nanoTime() + timeUnit.toNanos(j10);
        int iDrainTo = 0;
        while (iDrainTo < i10) {
            iDrainTo += blockingQueue.drainTo(collection, i10 - iDrainTo);
            if (iDrainTo < i10) {
                E ePoll = blockingQueue.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    break;
                }
                collection.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    @o9.a
    @s9.a
    @o9.c
    public static <E> int b(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i10, long j10, TimeUnit timeUnit) {
        E ePoll;
        com.google.common.base.w.E(collection);
        long jNanoTime = System.nanoTime() + timeUnit.toNanos(j10);
        int iDrainTo = 0;
        boolean z10 = false;
        while (iDrainTo < i10) {
            try {
                iDrainTo += blockingQueue.drainTo(collection, i10 - iDrainTo);
                if (iDrainTo < i10) {
                    while (true) {
                        try {
                            ePoll = blockingQueue.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    collection.add(ePoll);
                    iDrainTo++;
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return iDrainTo;
    }

    @o9.c
    public static <E> ArrayBlockingQueue<E> c(int i10) {
        return new ArrayBlockingQueue<>(i10);
    }

    public static <E> ArrayDeque<E> d() {
        return new ArrayDeque<>();
    }

    public static <E> ArrayDeque<E> e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>((Collection) iterable);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        l1.a(arrayDeque, iterable);
        return arrayDeque;
    }

    @o9.c
    public static <E> ConcurrentLinkedQueue<E> f() {
        return new ConcurrentLinkedQueue<>();
    }

    @o9.c
    public static <E> ConcurrentLinkedQueue<E> g(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) iterable);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        l1.a(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    @o9.c
    public static <E> LinkedBlockingDeque<E> h() {
        return new LinkedBlockingDeque<>();
    }

    @o9.c
    public static <E> LinkedBlockingDeque<E> i(int i10) {
        return new LinkedBlockingDeque<>(i10);
    }

    @o9.c
    public static <E> LinkedBlockingDeque<E> j(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) iterable);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        l1.a(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    @o9.c
    public static <E> LinkedBlockingQueue<E> k() {
        return new LinkedBlockingQueue<>();
    }

    @o9.c
    public static <E> LinkedBlockingQueue<E> l(int i10) {
        return new LinkedBlockingQueue<>(i10);
    }

    @o9.c
    public static <E> LinkedBlockingQueue<E> m(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) iterable);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        l1.a(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    @o9.c
    public static <E extends Comparable> PriorityBlockingQueue<E> n() {
        return new PriorityBlockingQueue<>();
    }

    @o9.c
    public static <E extends Comparable> PriorityBlockingQueue<E> o(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) iterable);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        l1.a(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> p() {
        return new PriorityQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> q(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>((Collection) iterable);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        l1.a(priorityQueue, iterable);
        return priorityQueue;
    }

    @o9.c
    public static <E> SynchronousQueue<E> r() {
        return new SynchronousQueue<>();
    }

    public static <E> Deque<E> s(Deque<E> deque) {
        return Synchronized.i(deque, null);
    }

    public static <E> Queue<E> t(Queue<E> queue) {
        return Synchronized.t(queue, null);
    }
}
