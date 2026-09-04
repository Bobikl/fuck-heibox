package com.alipay.zoloz.toyger;

import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Pool<T> {
    protected final ArrayDeque<T> freeObjects;
    public final int max;
    public int peak;

    public interface Poolable {
        void reset();
    }

    public Pool() {
        this(16, Integer.MAX_VALUE);
    }

    public Pool(int i10) {
        this(i10, Integer.MAX_VALUE);
    }

    public Pool(int i10, int i11) {
        this.freeObjects = new ArrayDeque<>(i10);
        this.max = i11;
    }

    public void clear() {
        this.freeObjects.clear();
    }

    public void free(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        if (this.freeObjects.size() < this.max) {
            this.freeObjects.add(t10);
            this.peak = Math.max(this.peak, this.freeObjects.size());
        }
        if (t10 instanceof Poolable) {
            ((Poolable) t10).reset();
        }
    }

    public void freeAll(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        ArrayDeque<T> arrayDeque = this.freeObjects;
        int i10 = this.max;
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            if (t10 != null) {
                if (arrayDeque.size() < i10) {
                    arrayDeque.add(t10);
                }
                if (t10 instanceof Poolable) {
                    ((Poolable) t10).reset();
                }
            }
        }
        this.peak = Math.max(this.peak, arrayDeque.size());
    }

    public int getFree() {
        return this.freeObjects.size();
    }

    protected abstract T newObject();

    public T obtain() {
        return this.freeObjects.size() == 0 ? newObject() : this.freeObjects.pop();
    }
}
