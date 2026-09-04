package com.lzy.okserver.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class PriorityBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6903933977591709194L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f64878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f64879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient PriorityBlockingQueue<E>.b<E> f64880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient PriorityBlockingQueue<E>.b<E> f64881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReentrantLock f64882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Condition f64883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ReentrantLock f64884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Condition f64885i;

    public class a implements Iterator<E> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PriorityBlockingQueue<E>.b<E> f64886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PriorityBlockingQueue<E>.b<E> f64887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private E f64888d;

        a() {
            PriorityBlockingQueue.this.e();
            try {
                PriorityBlockingQueue<E>.b<E> bVar = PriorityBlockingQueue.this.f64880d.f64892c;
                this.f64886b = bVar;
                if (bVar != null) {
                    this.f64888d = bVar.b();
                }
            } finally {
                PriorityBlockingQueue.this.g();
            }
        }

        private PriorityBlockingQueue<E>.b<E> a(PriorityBlockingQueue<E>.b<E> bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30658ge, new Class[]{b.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            while (true) {
                PriorityBlockingQueue<E>.b<E> bVar2 = bVar.f64892c;
                if (bVar2 == bVar) {
                    return PriorityBlockingQueue.this.f64880d.f64892c;
                }
                if (bVar2 == null || bVar2.b() != null) {
                    return bVar2;
                }
                bVar = bVar2;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64886b != null;
        }

        @Override // java.util.Iterator
        public E next() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30681he, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return (E) patchProxyResultProxy.result;
            }
            PriorityBlockingQueue.this.e();
            try {
                PriorityBlockingQueue<E>.b<E> bVar = this.f64886b;
                if (bVar == null) {
                    throw new NoSuchElementException();
                }
                E e10 = this.f64888d;
                this.f64887c = bVar;
                PriorityBlockingQueue<E>.b<E> bVarA = a(bVar);
                this.f64886b = bVarA;
                this.f64888d = bVarA == null ? null : bVarA.b();
                PriorityBlockingQueue.this.g();
                return e10;
            } catch (Throwable th2) {
                PriorityBlockingQueue.this.g();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            b bVar;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30704ie, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f64887c == null) {
                throw new IllegalStateException();
            }
            PriorityBlockingQueue.this.e();
            try {
                PriorityBlockingQueue<E>.b<E> bVar2 = this.f64887c;
                this.f64887c = null;
                b bVar3 = PriorityBlockingQueue.this.f64880d;
                do {
                    bVar = bVar3;
                    bVar3 = bVar3.f64892c;
                    if (bVar3 != null) {
                    }
                } while (bVar3 != bVar2);
                PriorityBlockingQueue.this.m(bVar3, bVar);
            } finally {
                PriorityBlockingQueue.this.g();
            }
        }
    }

    public class b<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f64890a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.lzy.okserver.task.a<?> f64891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        PriorityBlockingQueue<E>.b<T> f64892c;

        b(T t10) {
            c(t10);
        }

        public int a() {
            return this.f64891b.f64894b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.lzy.okserver.task.a, com.lzy.okserver.task.a<?>] */
        public T b() {
            ?? r10 = (T) this.f64891b;
            if (r10 == 0) {
                return null;
            }
            return this.f64890a ? r10 : r10.f64895c;
        }

        public void c(T t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.f30727je, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (t10 == 0) {
                this.f64891b = null;
            } else if (!(t10 instanceof com.lzy.okserver.task.a)) {
                this.f64891b = new com.lzy.okserver.task.a<>(0, t10);
            } else {
                this.f64891b = (com.lzy.okserver.task.a) t10;
                this.f64890a = true;
            }
        }
    }

    public PriorityBlockingQueue() {
        this(Integer.MAX_VALUE);
    }

    public PriorityBlockingQueue(int i10) {
        this.f64879c = new AtomicInteger();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f64882f = reentrantLock;
        this.f64883g = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f64884h = reentrantLock2;
        this.f64885i = reentrantLock2.newCondition();
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f64878b = i10;
        PriorityBlockingQueue<E>.b<E> bVar = new b<>(null);
        this.f64880d = bVar;
        this.f64881e = bVar;
    }

    public PriorityBlockingQueue(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.f64884h;
        reentrantLock.lock();
        int i10 = 0;
        try {
            for (E e10 : collection) {
                if (e10 == null) {
                    throw new NullPointerException();
                }
                if (i10 == this.f64878b) {
                    throw new IllegalStateException("Queue full");
                }
                h(new b<>(e10));
                i10++;
            }
            this.f64879c.set(i10);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private E a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Jd, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        PriorityBlockingQueue<E>.b<E> bVar = this.f64880d;
        PriorityBlockingQueue<E>.b<E> bVar2 = (PriorityBlockingQueue<E>.b<E>) bVar.f64892c;
        bVar.f64892c = bVar;
        this.f64880d = bVar2;
        E eB = bVar2.b();
        bVar2.c(null);
        return eB;
    }

    private void b(PriorityBlockingQueue<E>.b<E> bVar) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.Id, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        b bVar2 = this.f64880d;
        while (true) {
            PriorityBlockingQueue<E>.b<T> bVar3 = bVar2.f64892c;
            if (bVar3 == 0) {
                z10 = false;
                break;
            } else {
                if (bVar3.a() < bVar.a()) {
                    bVar2.f64892c = bVar;
                    bVar.f64892c = bVar3;
                    break;
                }
                bVar2 = bVar2.f64892c;
            }
        }
        if (z10) {
            return;
        }
        this.f64881e.f64892c = bVar;
        this.f64881e = bVar;
    }

    private synchronized E h(PriorityBlockingQueue<E>.b<E> bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.Hd, new Class[]{b.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        if (bVar == null) {
            return a();
        }
        b(bVar);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        if (PatchProxy.proxy(new Object[]{objectInputStream}, this, changeQuickRedirect, false, bb.c.b.f30635fe, new Class[]{ObjectInputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        objectInputStream.defaultReadObject();
        this.f64879c.set(0);
        PriorityBlockingQueue<E>.b<E> bVar = new b<>(null);
        this.f64880d = bVar;
        this.f64881e = bVar;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                add(object);
            }
        }
    }

    private void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Fd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lock();
        try {
            this.f64883g.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Gd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ReentrantLock reentrantLock = this.f64884h;
        reentrantLock.lock();
        try {
            this.f64885i.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void o(ObjectOutputStream objectOutputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{objectOutputStream}, this, changeQuickRedirect, false, bb.c.b.f30612ee, new Class[]{ObjectOutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        e();
        try {
            objectOutputStream.defaultWriteObject();
            b bVar = this.f64880d;
            while (true) {
                bVar = bVar.f64892c;
                if (bVar == null) {
                    objectOutputStream.writeObject(null);
                    return;
                }
                objectOutputStream.writeObject(bVar.b());
            }
        } finally {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.lzy.okserver.task.PriorityBlockingQueue$b, com.lzy.okserver.task.PriorityBlockingQueue<E>$b<T>] */
    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30519ae, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e();
        try {
            ?? r10 = this.f64880d;
            while (true) {
                b bVar = r10.f64892c;
                if (bVar == null) {
                    break;
                }
                r10.f64892c = r10;
                bVar.c(null);
                r10 = (PriorityBlockingQueue<E>.b<E>) bVar;
            }
            this.f64880d = this.f64881e;
            if (this.f64879c.getAndSet(0) == this.f64878b) {
                this.f64885i.signal();
            }
        } finally {
            g();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Xd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        e();
        try {
            b bVar = this.f64880d;
            do {
                bVar = bVar.f64892c;
                if (bVar == null) {
                    return false;
                }
            } while (!obj.equals(bVar.b()));
            return true;
        } finally {
            g();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collection}, this, changeQuickRedirect, false, bb.c.b.f30542be, new Class[]{Collection.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : drainTo(collection, Integer.MAX_VALUE);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        boolean z10 = false;
        Object[] objArr = {collection, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30565ce, new Class[]{Collection.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        if (i10 <= 0) {
            return 0;
        }
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lock();
        try {
            int iMin = Math.min(i10, this.f64879c.get());
            PriorityBlockingQueue<E>.b<E> bVar = this.f64880d;
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    b bVar2 = bVar.f64892c;
                    collection.add((Object) bVar2.b());
                    bVar2.c(null);
                    bVar.f64892c = (PriorityBlockingQueue<E>.b<T>) bVar;
                    i11++;
                    bVar = (PriorityBlockingQueue<E>.b<E>) bVar2;
                } catch (Throwable th2) {
                    if (i11 > 0) {
                        this.f64880d = (PriorityBlockingQueue<E>.b<E>) bVar;
                        if (this.f64879c.getAndAdd(-i11) == this.f64878b) {
                        }
                    }
                    throw th2;
                }
            }
            if (i11 > 0) {
                this.f64880d = (PriorityBlockingQueue<E>.b<E>) bVar;
                if (this.f64879c.getAndAdd(-i11) == this.f64878b) {
                    z10 = true;
                }
            }
            reentrantLock.unlock();
            if (z10) {
                l();
            }
            return iMin;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            if (0 != 0) {
                l();
            }
            throw th3;
        }
    }

    void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64884h.lock();
        this.f64882f.lock();
    }

    void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ld, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64882f.unlock();
        this.f64884h.unlock();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30589de, new Class[0], Iterator.class);
        return patchProxyResultProxy.isSupported ? (Iterator) patchProxyResultProxy.result : new a();
    }

    void m(PriorityBlockingQueue<E>.b<E> bVar, PriorityBlockingQueue<E>.b<E> bVar2) {
        if (PatchProxy.proxy(new Object[]{bVar, bVar2}, this, changeQuickRedirect, false, bb.c.b.Vd, new Class[]{b.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.c(null);
        bVar2.f64892c = bVar.f64892c;
        if (this.f64881e == bVar) {
            this.f64881e = bVar2;
        }
        if (this.f64879c.getAndDecrement() == this.f64878b) {
            this.f64885i.signal();
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.b.Qd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        e10.getClass();
        AtomicInteger atomicInteger = this.f64879c;
        if (atomicInteger.get() == this.f64878b) {
            return false;
        }
        int andIncrement = -1;
        PriorityBlockingQueue<E>.b<E> bVar = new b<>(e10);
        ReentrantLock reentrantLock = this.f64884h;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.f64878b) {
                h(bVar);
                andIncrement = atomicInteger.getAndIncrement();
                if (andIncrement + 1 < this.f64878b) {
                    this.f64885i.signal();
                }
            }
            reentrantLock.unlock();
            if (andIncrement == 0) {
                j();
            }
            return andIncrement >= 0;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10, new Long(j10), timeUnit}, this, changeQuickRedirect, false, bb.c.b.Pd, new Class[]{Object.class, Long.TYPE, TimeUnit.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        e10.getClass();
        long nanos = timeUnit.toNanos(j10);
        ReentrantLock reentrantLock = this.f64884h;
        AtomicInteger atomicInteger = this.f64879c;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f64878b) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f64885i.awaitNanos(nanos);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        h(new b<>(e10));
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f64878b) {
            this.f64885i.signal();
        }
        reentrantLock.unlock();
        if (andIncrement == 0) {
            j();
        }
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ud, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        if (this.f64879c.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lock();
        try {
            PriorityBlockingQueue<E>.b<E> bVar = this.f64880d.f64892c;
            if (bVar == null) {
                return null;
            }
            return bVar.b();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Td, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        AtomicInteger atomicInteger = this.f64879c;
        E eH = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        int andDecrement = -1;
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                eH = h(null);
                andDecrement = atomicInteger.getAndDecrement();
                if (andDecrement > 1) {
                    this.f64883g.signal();
                }
            }
            reentrantLock.unlock();
            if (andDecrement == this.f64878b) {
                l();
            }
            return eH;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), timeUnit}, this, changeQuickRedirect, false, bb.c.b.Sd, new Class[]{Long.TYPE, TimeUnit.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        long nanos = timeUnit.toNanos(j10);
        AtomicInteger atomicInteger = this.f64879c;
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.f64883g.awaitNanos(nanos);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E eH = h(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f64883g.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f64878b) {
            l();
        }
        return eH;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.b.Od, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        e10.getClass();
        PriorityBlockingQueue<E>.b<E> bVar = new b<>(e10);
        ReentrantLock reentrantLock = this.f64884h;
        AtomicInteger atomicInteger = this.f64879c;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f64878b) {
            try {
                this.f64885i.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        h(bVar);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f64878b) {
            this.f64885i.signal();
        }
        reentrantLock.unlock();
        if (andIncrement == 0) {
            j();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Nd, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f64878b - this.f64879c.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        b bVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Wd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        e();
        try {
            b bVar2 = this.f64880d;
            do {
                bVar = bVar2;
                bVar2 = bVar2.f64892c;
                if (bVar2 == null) {
                    return false;
                }
            } while (!obj.equals(bVar2.b()));
            m(bVar2, bVar);
            return true;
        } finally {
            g();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Md, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f64879c.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Rd, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        AtomicInteger atomicInteger = this.f64879c;
        ReentrantLock reentrantLock = this.f64882f;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                this.f64883g.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E eH = h(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f64883g.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f64878b) {
            l();
        }
        return eH;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Yd, new Class[0], Object[].class);
        if (patchProxyResultProxy.isSupported) {
            return (Object[]) patchProxyResultProxy.result;
        }
        e();
        try {
            Object[] objArr = new Object[this.f64879c.get()];
            b bVar = this.f64880d.f64892c;
            while (bVar != null) {
                int i11 = i10 + 1;
                objArr[i10] = bVar.b();
                bVar = bVar.f64892c;
                i10 = i11;
            }
            g();
            return objArr;
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tArr}, this, changeQuickRedirect, false, bb.c.b.Zd, new Class[]{Object[].class}, Object[].class);
        if (patchProxyResultProxy.isSupported) {
            return (T[]) ((Object[]) patchProxyResultProxy.result);
        }
        e();
        try {
            int i11 = this.f64879c.get();
            if (tArr.length < i11) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
            }
            b bVar = this.f64880d.f64892c;
            while (bVar != null) {
                tArr[i10] = bVar.b();
                bVar = bVar.f64892c;
                i10++;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        } finally {
            g();
        }
    }
}
