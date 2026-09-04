package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b
@u
public final class EvictingQueue<E> extends z0<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<E> f57214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @o9.d
    final int f57215c;

    private EvictingQueue(int i10) {
        com.google.common.base.w.k(i10 >= 0, "maxSize (%s) must >= 0", i10);
        this.f57214b = new ArrayDeque(i10);
        this.f57215c = i10;
    }

    public static <E> EvictingQueue<E> c1(int i10) {
        return new EvictingQueue<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.z0, com.google.common.collect.h0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public Queue<E> H0() {
        return this.f57214b;
    }

    @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
    @s9.a
    public boolean add(E e10) {
        com.google.common.base.w.E(e10);
        if (this.f57215c == 0) {
            return true;
        }
        if (size() == this.f57215c) {
            this.f57214b.remove();
        }
        this.f57214b.add(e10);
        return true;
    }

    @Override // com.google.common.collect.h0, java.util.Collection
    @s9.a
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.f57215c) {
            return J0(collection);
        }
        clear();
        return l1.a(this, l1.N(collection, size - this.f57215c));
    }

    @Override // com.google.common.collect.z0, java.util.Queue
    @s9.a
    public boolean offer(E e10) {
        return add(e10);
    }

    public int remainingCapacity() {
        return this.f57215c - size();
    }

    @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }
}
