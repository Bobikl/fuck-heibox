package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"NewApi"})
public class AnimatedZoomJob extends AnimatedViewPortJob implements Animator.AnimatorListener {
    private static ObjectPool<AnimatedZoomJob> pool = ObjectPool.create(8, new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    protected Matrix mOnAnimationUpdateMatrixBuffer;
    protected float xAxisRange;
    protected YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    @SuppressLint({"NewApi"})
    public AnimatedZoomJob(ViewPortHandler viewPortHandler, View view, Transformer transformer, YAxis yAxis, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10) {
        super(viewPortHandler, f11, f12, transformer, view, f13, f14, j10);
        this.mOnAnimationUpdateMatrixBuffer = new Matrix();
        this.zoomCenterX = f15;
        this.zoomCenterY = f16;
        this.zoomOriginX = f17;
        this.zoomOriginY = f18;
        this.animator.addListener(this);
        this.yAxis = yAxis;
        this.xAxisRange = f10;
    }

    public static AnimatedZoomJob getInstance(ViewPortHandler viewPortHandler, View view, Transformer transformer, YAxis yAxis, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10) {
        AnimatedZoomJob animatedZoomJob = (AnimatedZoomJob) pool.get();
        animatedZoomJob.mViewPortHandler = viewPortHandler;
        animatedZoomJob.xValue = f11;
        animatedZoomJob.yValue = f12;
        animatedZoomJob.mTrans = transformer;
        animatedZoomJob.view = view;
        animatedZoomJob.xOrigin = f13;
        animatedZoomJob.yOrigin = f14;
        animatedZoomJob.resetAnimator();
        animatedZoomJob.animator.setDuration(j10);
        return animatedZoomJob;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected ObjectPool.Poolable instantiate() {
        return new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10 = this.xOrigin;
        float f11 = this.xValue - f10;
        float f12 = this.phase;
        float f13 = f10 + (f11 * f12);
        float f14 = this.yOrigin;
        float f15 = f14 + ((this.yValue - f14) * f12);
        Matrix matrix = this.mOnAnimationUpdateMatrixBuffer;
        this.mViewPortHandler.setZoom(f13, f15, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f16 = this.zoomOriginX;
        float f17 = (this.zoomCenterX - (scaleX / 2.0f)) - f16;
        float f18 = this.phase;
        fArr[0] = f16 + (f17 * f18);
        float f19 = this.zoomOriginY;
        fArr[1] = f19 + (((this.zoomCenterY + (scaleY / 2.0f)) - f19) * f18);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, true);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
    }
}
