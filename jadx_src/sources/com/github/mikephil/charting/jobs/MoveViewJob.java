package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class MoveViewJob extends ViewPortJob {
    private static ObjectPool<MoveViewJob> pool;

    static {
        ObjectPool<MoveViewJob> objectPoolCreate = ObjectPool.create(2, new MoveViewJob(null, 0.0f, 0.0f, null, null));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public MoveViewJob(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view) {
        super(viewPortHandler, f10, f11, transformer, view);
    }

    public static MoveViewJob getInstance(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view) {
        MoveViewJob moveViewJob = (MoveViewJob) pool.get();
        moveViewJob.mViewPortHandler = viewPortHandler;
        moveViewJob.xValue = f10;
        moveViewJob.yValue = f11;
        moveViewJob.mTrans = transformer;
        moveViewJob.view = view;
        return moveViewJob;
    }

    public static void recycleInstance(MoveViewJob moveViewJob) {
        pool.recycle(moveViewJob);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected ObjectPool.Poolable instantiate() {
        return new MoveViewJob(this.mViewPortHandler, this.xValue, this.yValue, this.mTrans, this.view);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.pts;
        fArr[0] = this.xValue;
        fArr[1] = this.yValue;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
        recycleInstance(this);
    }
}
