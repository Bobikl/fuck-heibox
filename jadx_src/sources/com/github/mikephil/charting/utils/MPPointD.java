package com.github.mikephil.charting.utils;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f43141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f43142y;

    static {
        ObjectPool<MPPointD> objectPoolCreate = ObjectPool.create(64, new MPPointD(0.0d, 0.0d));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d10, double d11) {
        this.f43141x = d10;
        this.f43142y = d11;
    }

    public static MPPointD getInstance(double d10, double d11) {
        MPPointD mPPointD = (MPPointD) pool.get();
        mPPointD.f43141x = d10;
        mPPointD.f43142y = d11;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected ObjectPool.Poolable instantiate() {
        return new MPPointD(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f43141x + ", y: " + this.f43142y;
    }
}
