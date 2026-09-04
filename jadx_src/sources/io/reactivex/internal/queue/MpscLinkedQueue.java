package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import jh.f;
import lh.n;

/* JADX INFO: loaded from: classes5.dex */
public final class MpscLinkedQueue<T> implements n<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<LinkedQueueNode<T>> f123588b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<LinkedQueueNode<T>> f123589c = new AtomicReference<>();

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private E f123590b;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e10) {
            e(e10);
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public E b() {
            return this.f123590b;
        }

        public LinkedQueueNode<E> c() {
            return get();
        }

        public void d(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void e(E e10) {
            this.f123590b = e10;
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        d(linkedQueueNode);
        e(linkedQueueNode);
    }

    LinkedQueueNode<T> a() {
        return this.f123589c.get();
    }

    LinkedQueueNode<T> b() {
        return this.f123589c.get();
    }

    LinkedQueueNode<T> c() {
        return this.f123588b.get();
    }

    @Override // lh.o
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(LinkedQueueNode<T> linkedQueueNode) {
        this.f123589c.lazySet(linkedQueueNode);
    }

    LinkedQueueNode<T> e(LinkedQueueNode<T> linkedQueueNode) {
        return this.f123588b.getAndSet(linkedQueueNode);
    }

    @Override // lh.o
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // lh.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t10);
        e(linkedQueueNode).d(linkedQueueNode);
        return true;
    }

    @Override // lh.o
    public boolean offer(T t10, T t11) {
        offer(t10);
        offer(t11);
        return true;
    }

    @Override // lh.n, lh.o
    @f
    public T poll() {
        LinkedQueueNode<T> linkedQueueNodeC;
        LinkedQueueNode<T> linkedQueueNodeA = a();
        LinkedQueueNode<T> linkedQueueNodeC2 = linkedQueueNodeA.c();
        if (linkedQueueNodeC2 != null) {
            T tA = linkedQueueNodeC2.a();
            d(linkedQueueNodeC2);
            return tA;
        }
        if (linkedQueueNodeA == c()) {
            return null;
        }
        do {
            linkedQueueNodeC = linkedQueueNodeA.c();
        } while (linkedQueueNodeC == null);
        T tA2 = linkedQueueNodeC.a();
        d(linkedQueueNodeC);
        return tA2;
    }
}
