package com.github.mikephil.charting.utils;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class FSize extends ObjectPool.Poolable {
    private static ObjectPool<FSize> pool;
    public float height;
    public float width;

    static {
        ObjectPool<FSize> objectPoolCreate = ObjectPool.create(256, new FSize(0.0f, 0.0f));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public FSize() {
    }

    public FSize(float f10, float f11) {
        this.width = f10;
        this.height = f11;
    }

    public static FSize getInstance(float f10, float f11) {
        FSize fSize = (FSize) pool.get();
        fSize.width = f10;
        fSize.height = f11;
        return fSize;
    }

    public static void recycleInstance(FSize fSize) {
        pool.recycle(fSize);
    }

    public static void recycleInstances(List<FSize> list) {
        pool.recycle(list);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FSize)) {
            return false;
        }
        FSize fSize = (FSize) obj;
        return this.width == fSize.width && this.height == fSize.height;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.width) ^ Float.floatToIntBits(this.height);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected ObjectPool.Poolable instantiate() {
        return new FSize(0.0f, 0.0f);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
