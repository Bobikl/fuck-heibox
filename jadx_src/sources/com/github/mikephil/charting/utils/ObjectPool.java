package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId = NO_OWNER;

        protected abstract Poolable instantiate();
    }

    private ObjectPool(int i10, T t10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.desiredCapacity = i10;
        this.objects = new Object[i10];
        this.objectsPointer = 0;
        this.modelObject = t10;
        this.replenishPercentage = 1.0f;
        refillPool();
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] com.github.mikephil.charting.utils.ObjectPool.class) */
    public static synchronized ObjectPool create(int i10, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(i10, poolable);
            int i11 = ids;
            objectPool.poolId = i11;
            ids = i11 + 1;
        }
        return objectPool;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void refillPool(float f10) {
        int i10 = this.desiredCapacity;
        int i11 = (int) (i10 * f10);
        if (i11 < 1) {
            i10 = 1;
        } else if (i11 <= i10) {
            i10 = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            this.objects[i12] = this.modelObject.instantiate();
        }
        this.objectsPointer = i10 - 1;
    }

    private void resizePool() {
        int i10 = this.desiredCapacity;
        int i11 = i10 * 2;
        this.desiredCapacity = i11;
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            objArr[i12] = this.objects[i12];
        }
        this.objects = objArr;
    }

    public synchronized T get() {
        T t10;
        if (this.objectsPointer == -1 && this.replenishPercentage > 0.0f) {
            refillPool();
        }
        Object[] objArr = this.objects;
        int i10 = this.objectsPointer;
        t10 = (T) objArr[i10];
        t10.currentOwnerId = Poolable.NO_OWNER;
        this.objectsPointer = i10 - 1;
        return t10;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(T t10) {
        int i10 = t10.currentOwnerId;
        if (i10 != Poolable.NO_OWNER) {
            if (i10 == this.poolId) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t10.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int i11 = this.objectsPointer + 1;
        this.objectsPointer = i11;
        if (i11 >= this.objects.length) {
            resizePool();
        }
        t10.currentOwnerId = this.poolId;
        this.objects[this.objectsPointer] = t10;
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            resizePool();
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            int i11 = t10.currentOwnerId;
            if (i11 != Poolable.NO_OWNER) {
                if (i11 == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t10.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            t10.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer + 1 + i10] = t10;
        }
        this.objectsPointer += size;
    }

    public void setReplenishPercentage(float f10) {
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.replenishPercentage = f10;
    }
}
