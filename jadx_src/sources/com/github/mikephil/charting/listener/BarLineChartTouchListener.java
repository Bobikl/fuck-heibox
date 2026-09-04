package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class BarLineChartTouchListener extends ChartTouchListener<BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {
    private IDataSet mClosestDataSetToTouch;
    private MPPointF mDecelerationCurrentPoint;
    private long mDecelerationLastTime;
    private MPPointF mDecelerationVelocity;
    private float mDragTriggerDist;
    private Matrix mMatrix;
    private float mMinScalePointerDistance;
    private float mSavedDist;
    private Matrix mSavedMatrix;
    private float mSavedXDist;
    private float mSavedYDist;
    private MPPointF mTouchPointCenter;
    private MPPointF mTouchStartPoint;
    private VelocityTracker mVelocityTracker;

    public BarLineChartTouchListener(BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase, Matrix matrix, float f10) {
        super(barLineChartBase);
        this.mMatrix = new Matrix();
        this.mSavedMatrix = new Matrix();
        this.mTouchStartPoint = MPPointF.getInstance(0.0f, 0.0f);
        this.mTouchPointCenter = MPPointF.getInstance(0.0f, 0.0f);
        this.mSavedXDist = 1.0f;
        this.mSavedYDist = 1.0f;
        this.mSavedDist = 1.0f;
        this.mDecelerationLastTime = 0L;
        this.mDecelerationCurrentPoint = MPPointF.getInstance(0.0f, 0.0f);
        this.mDecelerationVelocity = MPPointF.getInstance(0.0f, 0.0f);
        this.mMatrix = matrix;
        this.mDragTriggerDist = Utils.convertDpToPixel(f10);
        this.mMinScalePointerDistance = Utils.convertDpToPixel(3.5f);
    }

    private static float getXDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float getYDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    private boolean inverted() {
        IDataSet iDataSet;
        return (this.mClosestDataSetToTouch == null && ((BarLineChartBase) this.mChart).isAnyAxisInverted()) || ((iDataSet = this.mClosestDataSetToTouch) != null && ((BarLineChartBase) this.mChart).isInverted(iDataSet.getAxisDependency()));
    }

    private static void midPoint(MPPointF mPPointF, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) + motionEvent.getX(1);
        float y10 = motionEvent.getY(0) + motionEvent.getY(1);
        mPPointF.f43143x = x10 / 2.0f;
        mPPointF.f43144y = y10 / 2.0f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    private void performDrag(MotionEvent motionEvent) {
        float x10;
        float y10;
        float f10;
        float f11;
        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
        this.mMatrix.set(this.mSavedMatrix);
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (inverted()) {
            if (this.mChart instanceof HorizontalBarChart) {
                x10 = -(motionEvent.getX() - this.mTouchStartPoint.f43143x);
                y10 = motionEvent.getY();
                f10 = this.mTouchStartPoint.f43144y;
            } else {
                x10 = motionEvent.getX() - this.mTouchStartPoint.f43143x;
                f11 = -(motionEvent.getY() - this.mTouchStartPoint.f43144y);
            }
            this.mMatrix.postTranslate(x10, f11);
            if (onChartGestureListener != null) {
                onChartGestureListener.onChartTranslate(motionEvent, x10, f11);
            }
        }
        x10 = motionEvent.getX() - this.mTouchStartPoint.f43143x;
        y10 = motionEvent.getY();
        f10 = this.mTouchStartPoint.f43144y;
        f11 = y10 - f10;
        this.mMatrix.postTranslate(x10, f11);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, x10, f11);
        }
    }

    private void performHighlightDrag(MotionEvent motionEvent) {
        Highlight highlightByTouchPoint = ((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint == null || highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
            return;
        }
        this.mLastHighlighted = highlightByTouchPoint;
        ((BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
    }

    private void performZoom(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
            float fSpacing = spacing(motionEvent);
            if (fSpacing > this.mMinScalePointerDistance) {
                MPPointF mPPointF = this.mTouchPointCenter;
                MPPointF trans = getTrans(mPPointF.f43143x, mPPointF.f43144y);
                ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
                int i10 = this.mTouchMode;
                if (i10 == 4) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f10 = fSpacing / this.mSavedDist;
                    boolean z10 = f10 < 1.0f;
                    boolean zCanZoomOutMoreX = z10 ? viewPortHandler.canZoomOutMoreX() : viewPortHandler.canZoomInMoreX();
                    boolean zCanZoomOutMoreY = z10 ? viewPortHandler.canZoomOutMoreY() : viewPortHandler.canZoomInMoreY();
                    float f11 = ((BarLineChartBase) this.mChart).isScaleXEnabled() ? f10 : 1.0f;
                    float f12 = ((BarLineChartBase) this.mChart).isScaleYEnabled() ? f10 : 1.0f;
                    if (zCanZoomOutMoreY || zCanZoomOutMoreX) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(f11, f12, trans.f43143x, trans.f43144y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, f11, f12);
                        }
                    }
                } else if (i10 == 2 && ((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.X_ZOOM;
                    float xDist = getXDist(motionEvent) / this.mSavedXDist;
                    if (xDist < 1.0f ? viewPortHandler.canZoomOutMoreX() : viewPortHandler.canZoomInMoreX()) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(xDist, 1.0f, trans.f43143x, trans.f43144y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, xDist, 1.0f);
                        }
                    }
                } else if (this.mTouchMode == 3 && ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float yDist = getYDist(motionEvent) / this.mSavedYDist;
                    if (yDist < 1.0f ? viewPortHandler.canZoomOutMoreY() : viewPortHandler.canZoomInMoreY()) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(1.0f, yDist, trans.f43143x, trans.f43144y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, 1.0f, yDist);
                        }
                    }
                }
                MPPointF.recycleInstance(trans);
            }
        }
    }

    private void saveTouchStart(MotionEvent motionEvent) {
        this.mSavedMatrix.set(this.mMatrix);
        this.mTouchStartPoint.f43143x = motionEvent.getX();
        this.mTouchStartPoint.f43144y = motionEvent.getY();
        this.mClosestDataSetToTouch = ((BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private static float spacing(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x10 * x10) + (y10 * y10));
    }

    public void computeScroll() {
        MPPointF mPPointF = this.mDecelerationVelocity;
        if (mPPointF.f43143x == 0.0f && mPPointF.f43144y == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationVelocity.f43143x *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        this.mDecelerationVelocity.f43144y *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f10 = (jCurrentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f;
        MPPointF mPPointF2 = this.mDecelerationVelocity;
        float f11 = mPPointF2.f43143x * f10;
        float f12 = mPPointF2.f43144y * f10;
        MPPointF mPPointF3 = this.mDecelerationCurrentPoint;
        float f13 = mPPointF3.f43143x + f11;
        mPPointF3.f43143x = f13;
        float f14 = mPPointF3.f43144y + f12;
        mPPointF3.f43144y = f14;
        MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f13, f14, 0);
        performDrag(motionEventObtain);
        motionEventObtain.recycle();
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, false);
        this.mDecelerationLastTime = jCurrentAnimationTimeMillis;
        if (Math.abs(this.mDecelerationVelocity.f43143x) >= 0.01d || Math.abs(this.mDecelerationVelocity.f43144y) >= 0.01d) {
            Utils.postInvalidateOnAnimation(this.mChart);
            return;
        }
        ((BarLineChartBase) this.mChart).calculateOffsets();
        ((BarLineChartBase) this.mChart).postInvalidate();
        stopDeceleration();
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public MPPointF getTrans(float f10, float f11) {
        ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
        return MPPointF.getInstance(f10 - viewPortHandler.offsetLeft(), inverted() ? -(f11 - viewPortHandler.offsetTop()) : -((((BarLineChartBase) this.mChart).getMeasuredHeight() - f11) - viewPortHandler.offsetBottom()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (((BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((BarLineScatterCandleBubbleData) ((BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            MPPointF trans = getTrans(motionEvent.getX(), motionEvent.getY());
            T t10 = this.mChart;
            ((BarLineChartBase) t10).zoom(((BarLineChartBase) t10).isScaleXEnabled() ? 1.4f : 1.0f, ((BarLineChartBase) this.mChart).isScaleYEnabled() ? 1.4f : 1.0f, trans.f43143x, trans.f43144y);
            if (((BarLineChartBase) this.mChart).isLogEnabled()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + trans.f43143x + ", y: " + trans.f43144y);
            }
            MPPointF.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.mLastGesture = ChartTouchListener.ChartGesture.FLING;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f10, f11);
        }
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isDragEnabled() && !((BarLineChartBase) this.mChart).isScaleXEnabled() && !((BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            startAction(motionEvent);
            stopDeceleration();
            saveTouchStart(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, Utils.getMaximumFlingVelocity());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > Utils.getMinimumFlingVelocity() || Math.abs(yVelocity) > Utils.getMinimumFlingVelocity()) && this.mTouchMode == 1 && ((BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                stopDeceleration();
                this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                this.mDecelerationCurrentPoint.f43143x = motionEvent.getX();
                this.mDecelerationCurrentPoint.f43144y = motionEvent.getY();
                MPPointF mPPointF = this.mDecelerationVelocity;
                mPPointF.f43143x = xVelocity;
                mPPointF.f43144y = yVelocity;
                Utils.postInvalidateOnAnimation(this.mChart);
            }
            int i10 = this.mTouchMode;
            if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                ((BarLineChartBase) this.mChart).calculateOffsets();
                ((BarLineChartBase) this.mChart).postInvalidate();
            }
            this.mTouchMode = 0;
            ((BarLineChartBase) this.mChart).enableScroll();
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.mVelocityTracker = null;
            }
            endAction(motionEvent);
        } else if (action == 2) {
            int i11 = this.mTouchMode;
            if (i11 == 1) {
                ((BarLineChartBase) this.mChart).disableScroll();
                performDrag(motionEvent);
            } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                ((BarLineChartBase) this.mChart).disableScroll();
                if (((BarLineChartBase) this.mChart).isScaleXEnabled() || ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    performZoom(motionEvent);
                }
            } else if (i11 == 0 && Math.abs(ChartTouchListener.distance(motionEvent.getX(), this.mTouchStartPoint.f43143x, motionEvent.getY(), this.mTouchStartPoint.f43144y)) > this.mDragTriggerDist) {
                if (((BarLineChartBase) this.mChart).hasNoDragOffset()) {
                    if (((BarLineChartBase) this.mChart).isFullyZoomedOut() || !((BarLineChartBase) this.mChart).isDragEnabled()) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                        if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                            performHighlightDrag(motionEvent);
                        }
                    } else {
                        this.mTouchMode = 1;
                    }
                } else if (((BarLineChartBase) this.mChart).isDragEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                    this.mTouchMode = 1;
                }
            }
        } else if (action == 3) {
            this.mTouchMode = 0;
            endAction(motionEvent);
        } else if (action != 5) {
            if (action == 6) {
                Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.mVelocityTracker);
                this.mTouchMode = 5;
            }
        } else if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.mChart).disableScroll();
            saveTouchStart(motionEvent);
            this.mSavedXDist = getXDist(motionEvent);
            this.mSavedYDist = getYDist(motionEvent);
            float fSpacing = spacing(motionEvent);
            this.mSavedDist = fSpacing;
            if (fSpacing > 10.0f) {
                if (((BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                    this.mTouchMode = 4;
                } else if (((BarLineChartBase) this.mChart).isScaleXEnabled() != ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mTouchMode = ((BarLineChartBase) this.mChart).isScaleXEnabled() ? 2 : 3;
                } else {
                    this.mTouchMode = this.mSavedXDist > this.mSavedYDist ? 2 : 3;
                }
            }
            midPoint(this.mTouchPointCenter, motionEvent);
        }
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, true);
        return true;
    }

    public void setDragTriggerDist(float f10) {
        this.mDragTriggerDist = Utils.convertDpToPixel(f10);
    }

    public void stopDeceleration() {
        MPPointF mPPointF = this.mDecelerationVelocity;
        mPPointF.f43143x = 0.0f;
        mPPointF.f43144y = 0.0f;
    }
}
