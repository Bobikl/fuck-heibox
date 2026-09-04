package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class PieRadarChartTouchListener extends ChartTouchListener<PieRadarChartBase<?>> {
    private ArrayList<AngularVelocitySample> _velocitySamples;
    private float mDecelerationAngularVelocity;
    private long mDecelerationLastTime;
    private float mStartAngle;
    private MPPointF mTouchStartPoint;

    public class AngularVelocitySample {
        public float angle;
        public long time;

        public AngularVelocitySample(long j10, float f10) {
            this.time = j10;
            this.angle = f10;
        }
    }

    public PieRadarChartTouchListener(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.mTouchStartPoint = MPPointF.getInstance(0.0f, 0.0f);
        this.mStartAngle = 0.0f;
        this._velocitySamples = new ArrayList<>();
        this.mDecelerationLastTime = 0L;
        this.mDecelerationAngularVelocity = 0.0f;
    }

    private float calculateVelocity() {
        if (this._velocitySamples.isEmpty()) {
            return 0.0f;
        }
        AngularVelocitySample angularVelocitySample = this._velocitySamples.get(0);
        ArrayList<AngularVelocitySample> arrayList = this._velocitySamples;
        AngularVelocitySample angularVelocitySample2 = arrayList.get(arrayList.size() - 1);
        AngularVelocitySample angularVelocitySample3 = angularVelocitySample;
        for (int size = this._velocitySamples.size() - 1; size >= 0; size--) {
            angularVelocitySample3 = this._velocitySamples.get(size);
            if (angularVelocitySample3.angle != angularVelocitySample2.angle) {
                break;
            }
        }
        float f10 = (angularVelocitySample2.time - angularVelocitySample.time) / 1000.0f;
        if (f10 == 0.0f) {
            f10 = 0.1f;
        }
        float f11 = angularVelocitySample2.angle;
        float f12 = angularVelocitySample3.angle;
        boolean z10 = f11 >= f12;
        if (Math.abs(f11 - f12) > 270.0d) {
            z10 = !z10;
        }
        float f13 = angularVelocitySample2.angle;
        float f14 = angularVelocitySample.angle;
        if (f13 - f14 > 180.0d) {
            angularVelocitySample.angle = (float) (((double) f14) + 360.0d);
        } else if (f14 - f13 > 180.0d) {
            angularVelocitySample2.angle = (float) (((double) f13) + 360.0d);
        }
        float fAbs = Math.abs((angularVelocitySample2.angle - angularVelocitySample.angle) / f10);
        return !z10 ? -fAbs : fAbs;
    }

    private void resetVelocity() {
        this._velocitySamples.clear();
    }

    private void sampleVelocity(float f10, float f11) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this._velocitySamples.add(new AngularVelocitySample(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f10, f11)));
        for (int size = this._velocitySamples.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this._velocitySamples.get(0).time > 1000; size--) {
            this._velocitySamples.remove(0);
        }
    }

    public void computeScroll() {
        if (this.mDecelerationAngularVelocity == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationAngularVelocity *= ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f10 = (jCurrentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f;
        T t10 = this.mChart;
        ((PieRadarChartBase) t10).setRotationAngle(((PieRadarChartBase) t10).getRotationAngle() + (this.mDecelerationAngularVelocity * f10));
        this.mDecelerationLastTime = jCurrentAnimationTimeMillis;
        if (Math.abs(this.mDecelerationAngularVelocity) >= 0.001d) {
            Utils.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x10, y10);
                }
                setGestureStartAngle(x10, y10);
                MPPointF mPPointF = this.mTouchStartPoint;
                mPPointF.f43143x = x10;
                mPPointF.f43144y = y10;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    sampleVelocity(x10, y10);
                    float fCalculateVelocity = calculateVelocity();
                    this.mDecelerationAngularVelocity = fCalculateVelocity;
                    if (fCalculateVelocity != 0.0f) {
                        this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                        Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x10, y10);
                }
                if (this.mTouchMode == 0) {
                    MPPointF mPPointF2 = this.mTouchStartPoint;
                    if (ChartTouchListener.distance(x10, mPPointF2.f43143x, y10, mPPointF2.f43144y) > Utils.convertDpToPixel(8.0f)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                        this.mTouchMode = 6;
                        ((PieRadarChartBase) this.mChart).disableScroll();
                    } else if (this.mTouchMode == 6) {
                        updateGestureRotation(x10, y10);
                        ((PieRadarChartBase) this.mChart).invalidate();
                    }
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x10, y10);
                    ((PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    public void setGestureStartAngle(float f10, float f11) {
        this.mStartAngle = ((PieRadarChartBase) this.mChart).getAngleForPoint(f10, f11) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void stopDeceleration() {
        this.mDecelerationAngularVelocity = 0.0f;
    }

    public void updateGestureRotation(float f10, float f11) {
        T t10 = this.mChart;
        ((PieRadarChartBase) t10).setRotationAngle(((PieRadarChartBase) t10).getAngleForPoint(f10, f11) - this.mStartAngle);
    }
}
