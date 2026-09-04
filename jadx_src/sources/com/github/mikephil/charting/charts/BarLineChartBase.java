package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.view.j1;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.jobs.AnimatedMoveViewJob;
import com.github.mikephil.charting.jobs.AnimatedZoomJob;
import com.github.mikephil.charting.jobs.MoveViewJob;
import com.github.mikephil.charting.jobs.ZoomJob;
import com.github.mikephil.charting.listener.BarLineChartTouchListener;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnDrawListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase<T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> extends Chart<T> implements BarLineScatterCandleBubbleDataProvider {
    private long drawCycles;
    protected boolean mAutoScaleMinMaxEnabled;
    protected YAxis mAxisLeft;
    protected YAxisRenderer mAxisRendererLeft;
    protected YAxisRenderer mAxisRendererRight;
    protected YAxis mAxisRight;
    protected Paint mBorderPaint;
    protected boolean mClipValuesToContent;
    private boolean mCustomViewPortEnabled;
    protected boolean mDoubleTapToZoomEnabled;
    private boolean mDragEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected OnDrawListener mDrawListener;
    protected Matrix mFitScreenMatrixBuffer;
    protected float[] mGetPositionBuffer;
    protected Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected Transformer mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    private RectF mOffsetsBuffer;
    protected float[] mOnSizeChangedBuffer;
    protected boolean mPinchZoomEnabled;
    protected Transformer mRightAxisTransformer;
    private boolean mScaleXEnabled;
    private boolean mScaleYEnabled;
    protected XAxisRenderer mXAxisRenderer;
    protected Matrix mZoomMatrixBuffer;
    protected MPPointD posForGetHighestVisibleX;
    protected MPPointD posForGetLowestVisibleX;
    private long totalTime;

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.BarLineChartBase$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    protected void autoScale() {
        ((BarLineScatterCandleBubbleData) this.mData).calcMinMaxY(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.calculate(((BarLineScatterCandleBubbleData) this.mData).getXMin(), ((BarLineScatterCandleBubbleData) this.mData).getXMax());
        if (this.mAxisLeft.isEnabled()) {
            YAxis yAxis = this.mAxisLeft;
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) this.mData;
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            yAxis.calculate(barLineScatterCandleBubbleData.getYMin(axisDependency), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency));
        }
        if (this.mAxisRight.isEnabled()) {
            YAxis yAxis2 = this.mAxisRight;
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData2 = (BarLineScatterCandleBubbleData) this.mData;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
            yAxis2.calculate(barLineScatterCandleBubbleData2.getYMin(axisDependency2), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency2));
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        this.mXAxis.calculate(((BarLineScatterCandleBubbleData) this.mData).getXMin(), ((BarLineScatterCandleBubbleData) this.mData).getXMax());
        YAxis yAxis = this.mAxisLeft;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(barLineScatterCandleBubbleData.getYMin(axisDependency), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData2 = (BarLineScatterCandleBubbleData) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(barLineScatterCandleBubbleData2.getYMin(axisDependency2), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency2));
    }

    protected void calculateLegendOffsets(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.mLegend;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            return;
        }
        int i10 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
        if (i10 == 1) {
            int i11 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
            if (i11 == 1) {
                rectF.left += Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
                return;
            }
            if (i11 == 2) {
                rectF.right += Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
                return;
            }
            if (i11 != 3) {
                return;
            }
            int i12 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
            if (i12 == 1) {
                rectF.top += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                return;
            } else {
                if (i12 != 2) {
                    return;
                }
                rectF.bottom += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        int i13 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
        if (i13 == 1) {
            rectF.top += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
            if (getXAxis().isEnabled() && getXAxis().isDrawLabelsEnabled()) {
                rectF.top += getXAxis().mLabelRotatedHeight;
                return;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        rectF.bottom += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
        if (getXAxis().isEnabled() && getXAxis().isDrawLabelsEnabled()) {
            rectF.bottom += getXAxis().mLabelRotatedHeight;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        if (!this.mCustomViewPortEnabled) {
            calculateLegendOffsets(this.mOffsetsBuffer);
            RectF rectF = this.mOffsetsBuffer;
            float requiredWidthSpace = rectF.left + 0.0f;
            float f10 = rectF.top + 0.0f;
            float requiredWidthSpace2 = rectF.right + 0.0f;
            float f11 = rectF.bottom + 0.0f;
            if (this.mAxisLeft.needsOffset()) {
                requiredWidthSpace += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.needsOffset()) {
                requiredWidthSpace2 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                XAxis xAxis = this.mXAxis;
                float yOffset = xAxis.mLabelRotatedHeight + xAxis.getYOffset();
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                    f11 += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                    f10 += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                    f11 += yOffset;
                    f10 += yOffset;
                }
            }
            float extraTopOffset = f10 + getExtraTopOffset();
            float extraRightOffset = requiredWidthSpace2 + getExtraRightOffset();
            float extraBottomOffset = f11 + getExtraBottomOffset();
            float extraLeftOffset = requiredWidthSpace + getExtraLeftOffset();
            float fConvertDpToPixel = Utils.convertDpToPixel(this.mMinOffset);
            this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel, extraLeftOffset), Math.max(fConvertDpToPixel, extraTopOffset), Math.max(fConvertDpToPixel, extraRightOffset), Math.max(fConvertDpToPixel, extraBottomOffset));
            if (this.mLogEnabled) {
                Log.i(Chart.LOG_TAG, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content: ");
                sb2.append(this.mViewPortHandler.getContentRect().toString());
                Log.i(Chart.LOG_TAG, sb2.toString());
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void centerViewTo(float f10, float f11, YAxis.AxisDependency axisDependency) {
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(MoveViewJob.getInstance(this.mViewPortHandler, f10 - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), f11 + (axisRange / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void centerViewToAnimated(float f10, float f11, YAxis.AxisDependency axisDependency, long j10) {
        MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(AnimatedMoveViewJob.getInstance(this.mViewPortHandler, f10 - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), f11 + (axisRange / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.f43141x, (float) valuesByTouchPoint.f43142y, j10));
        MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void centerViewToY(float f10, YAxis.AxisDependency axisDependency) {
        addViewportJob(MoveViewJob.getInstance(this.mViewPortHandler, 0.0f, f10 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof BarLineChartTouchListener) {
            ((BarLineChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    protected void drawGridBackground(Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mBorderPaint);
        }
    }

    public void fitScreen() {
        Matrix matrix = this.mFitScreenMatrixBuffer;
        this.mViewPortHandler.fitScreen(matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft : this.mAxisRight;
    }

    public YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    protected float getAxisRange(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft.mAxisRange : this.mAxisRight.mAxisRange;
    }

    public YAxis getAxisRight() {
        return this.mAxisRight;
    }

    @Override // com.github.mikephil.charting.charts.Chart, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public /* bridge */ /* synthetic */ BarLineScatterCandleBubbleData getData() {
        return (BarLineScatterCandleBubbleData) super.getData();
    }

    public IBarLineScatterCandleBubbleDataSet getDataSetByTouchPoint(float f10, float f11) {
        Highlight highlightByTouchPoint = getHighlightByTouchPoint(f10, f11);
        if (highlightByTouchPoint != null) {
            return (IBarLineScatterCandleBubbleDataSet) ((BarLineScatterCandleBubbleData) this.mData).getDataSetByIndex(highlightByTouchPoint.getDataSetIndex());
        }
        return null;
    }

    public OnDrawListener getDrawListener() {
        return this.mDrawListener;
    }

    public Entry getEntryByTouchPoint(float f10, float f11) {
        Highlight highlightByTouchPoint = getHighlightByTouchPoint(f10, f11);
        if (highlightByTouchPoint != null) {
            return ((BarLineScatterCandleBubbleData) this.mData).getEntryForHighlight(highlightByTouchPoint);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.posForGetHighestVisibleX);
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.f43141x);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.f43141x);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Paint getPaint(int i10) {
        Paint paint = super.getPaint(i10);
        if (paint != null) {
            return paint;
        }
        if (i10 != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    public MPPointD getPixelForValues(float f10, float f11, YAxis.AxisDependency axisDependency) {
        return getTransformer(axisDependency).getPixelForValues(f10, f11);
    }

    public MPPointF getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.mGetPositionBuffer[0] = entry.getX();
        this.mGetPositionBuffer[1] = entry.getY();
        getTransformer(axisDependency).pointValuesToPixel(this.mGetPositionBuffer);
        float[] fArr = this.mGetPositionBuffer;
        return MPPointF.getInstance(fArr[0], fArr[1]);
    }

    public YAxisRenderer getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public YAxisRenderer getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public XAxisRenderer getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    @Override // android.view.View
    public float getScaleX() {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.getScaleY();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public Transformer getTransformer(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisTransformer : this.mRightAxisTransformer;
    }

    public MPPointD getValuesByTouchPoint(float f10, float f11, YAxis.AxisDependency axisDependency) {
        MPPointD mPPointD = MPPointD.getInstance(0.0d, 0.0d);
        getValuesByTouchPoint(f10, f11, axisDependency, mPPointD);
        return mPPointD;
    }

    public void getValuesByTouchPoint(float f10, float f11, YAxis.AxisDependency axisDependency, MPPointD mPPointD) {
        getTransformer(axisDependency).getValuesByTouchPoint(f10, f11, mPPointD);
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return Math.max(this.mAxisLeft.mAxisMaximum, this.mAxisRight.mAxisMaximum);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return Math.min(this.mAxisLeft.mAxisMinimum, this.mAxisRight.mAxisMinimum);
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.hasNoDragOffset();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mAxisLeft = new YAxis(YAxis.AxisDependency.LEFT);
        this.mAxisRight = new YAxis(YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new Transformer(this.mViewPortHandler);
        this.mRightAxisTransformer = new Transformer(this.mViewPortHandler);
        this.mAxisRendererLeft = new YAxisRenderer(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new YAxisRenderer(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new XAxisRenderer(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new ChartHighlighter(this));
        this.mChartTouchListener = new BarLineChartTouchListener(this, this.mViewPortHandler.getMatrixTouch(), 3.0f);
        Paint paint = new Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setColor(j1.f21601t);
        this.mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
    }

    public boolean isAnyAxisInverted() {
        return this.mAxisLeft.isInverted() || this.mAxisRight.isInverted();
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    public boolean isClipValuesToContentEnabled() {
        return this.mClipValuesToContent;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    public boolean isDrawBordersEnabled() {
        return this.mDrawBorders;
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.isFullyZoomedOut();
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).isInverted();
    }

    public boolean isKeepPositionOnRotation() {
        return this.mKeepPositionOnRotation;
    }

    public boolean isPinchZoomEnabled() {
        return this.mPinchZoomEnabled;
    }

    public boolean isScaleXEnabled() {
        return this.mScaleXEnabled;
    }

    public boolean isScaleYEnabled() {
        return this.mScaleYEnabled;
    }

    public void moveViewTo(float f10, float f11, YAxis.AxisDependency axisDependency) {
        addViewportJob(MoveViewJob.getInstance(this.mViewPortHandler, f10, f11 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void moveViewToAnimated(float f10, float f11, YAxis.AxisDependency axisDependency, long j10) {
        MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(AnimatedMoveViewJob.getInstance(this.mViewPortHandler, f10, f11 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.f43141x, (float) valuesByTouchPoint.f43142y, j10));
        MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void moveViewToX(float f10) {
        addViewportJob(MoveViewJob.getInstance(this.mViewPortHandler, f10, 0.0f, getTransformer(YAxis.AxisDependency.LEFT), this));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            if (this.mLogEnabled) {
                Log.i(Chart.LOG_TAG, "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "Preparing...");
        }
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null) {
            dataRenderer.initBuffers();
        }
        calcMinMax();
        YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
        YAxis yAxis = this.mAxisLeft;
        yAxisRenderer.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
        YAxis yAxis2 = this.mAxisRight;
        yAxisRenderer2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.isInverted());
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        XAxis xAxis = this.mXAxis;
        xAxisRenderer.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        drawGridBackground(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            autoScale();
        }
        if (this.mAxisLeft.isEnabled()) {
            YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
            YAxis yAxis = this.mAxisLeft;
            yAxisRenderer.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        }
        if (this.mAxisRight.isEnabled()) {
            YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
            YAxis yAxis2 = this.mAxisRight;
            yAxisRenderer2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.isInverted());
        }
        if (this.mXAxis.isEnabled()) {
            XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
            XAxis xAxis = this.mXAxis;
            xAxisRenderer.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        this.mXAxisRenderer.renderGridLines(canvas);
        this.mAxisRendererLeft.renderGridLines(canvas);
        this.mAxisRendererRight.renderGridLines(canvas);
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        int iSave = canvas.save();
        canvas.clipRect(this.mViewPortHandler.getContentRect());
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        canvas.restoreToCount(iSave);
        this.mRenderer.drawExtras(canvas);
        if (this.mXAxis.isEnabled() && !this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && !this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && !this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererLeft.renderAxisLabels(canvas);
        this.mAxisRendererRight.renderAxisLabels(canvas);
        if (isClipValuesToContentEnabled()) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.mViewPortHandler.getContentRect());
            this.mRenderer.drawValues(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            this.mRenderer.drawValues(canvas);
        }
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
        if (this.mLogEnabled) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            long j10 = this.totalTime + jCurrentTimeMillis2;
            this.totalTime = j10;
            long j11 = this.drawCycles + 1;
            this.drawCycles = j11;
            Log.i(Chart.LOG_TAG, "Drawtime: " + jCurrentTimeMillis2 + " ms, average: " + (j10 / j11) + " ms, cycles: " + this.drawCycles);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        float[] fArr = this.mOnSizeChangedBuffer;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.contentLeft();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.contentTop();
            getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.mKeepPositionOnRotation) {
            getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.centerViewPort(this.mOnSizeChangedBuffer, this);
        } else {
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            viewPortHandler.refresh(viewPortHandler.getMatrixTouch(), this, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener == null || this.mData == 0 || !this.mTouchEnabled) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    protected void prepareOffsetMatrix() {
        this.mRightAxisTransformer.prepareMatrixOffset(this.mAxisRight.isInverted());
        this.mLeftAxisTransformer.prepareMatrixOffset(this.mAxisLeft.isInverted());
    }

    protected void prepareValuePxMatrix() {
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "Preparing Value-Px Matrix, xmin: " + this.mXAxis.mAxisMinimum + ", xmax: " + this.mXAxis.mAxisMaximum + ", xdelta: " + this.mXAxis.mAxisRange);
        }
        Transformer transformer = this.mRightAxisTransformer;
        XAxis xAxis = this.mXAxis;
        float f10 = xAxis.mAxisMinimum;
        float f11 = xAxis.mAxisRange;
        YAxis yAxis = this.mAxisRight;
        transformer.prepareMatrixValuePx(f10, f11, yAxis.mAxisRange, yAxis.mAxisMinimum);
        Transformer transformer2 = this.mLeftAxisTransformer;
        XAxis xAxis2 = this.mXAxis;
        float f12 = xAxis2.mAxisMinimum;
        float f13 = xAxis2.mAxisRange;
        YAxis yAxis2 = this.mAxisLeft;
        transformer2.prepareMatrixValuePx(f12, f13, yAxis2.mAxisRange, yAxis2.mAxisMinimum);
    }

    public void resetTracking() {
        this.totalTime = 0L;
        this.drawCycles = 0L;
    }

    public void resetViewPortOffsets() {
        this.mCustomViewPortEnabled = false;
        calculateOffsets();
    }

    public void resetZoom() {
        this.mViewPortHandler.resetZoom(this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void setAutoScaleMinMaxEnabled(boolean z10) {
        this.mAutoScaleMinMaxEnabled = z10;
    }

    public void setBorderColor(int i10) {
        this.mBorderPaint.setColor(i10);
    }

    public void setBorderWidth(float f10) {
        this.mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(f10));
    }

    public void setClipValuesToContent(boolean z10) {
        this.mClipValuesToContent = z10;
    }

    public void setDoubleTapToZoomEnabled(boolean z10) {
        this.mDoubleTapToZoomEnabled = z10;
    }

    public void setDragEnabled(boolean z10) {
        this.mDragEnabled = z10;
    }

    public void setDragOffsetX(float f10) {
        this.mViewPortHandler.setDragOffsetX(f10);
    }

    public void setDragOffsetY(float f10) {
        this.mViewPortHandler.setDragOffsetY(f10);
    }

    public void setDrawBorders(boolean z10) {
        this.mDrawBorders = z10;
    }

    public void setDrawGridBackground(boolean z10) {
        this.mDrawGridBackground = z10;
    }

    public void setGridBackgroundColor(int i10) {
        this.mGridBackgroundPaint.setColor(i10);
    }

    public void setHighlightPerDragEnabled(boolean z10) {
        this.mHighlightPerDragEnabled = z10;
    }

    public void setKeepPositionOnRotation(boolean z10) {
        this.mKeepPositionOnRotation = z10;
    }

    public void setMaxVisibleValueCount(int i10) {
        this.mMaxVisibleCount = i10;
    }

    public void setMinOffset(float f10) {
        this.mMinOffset = f10;
    }

    public void setOnDrawListener(OnDrawListener onDrawListener) {
        this.mDrawListener = onDrawListener;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(Paint paint, int i10) {
        super.setPaint(paint, i10);
        if (i10 != 4) {
            return;
        }
        this.mGridBackgroundPaint = paint;
    }

    public void setPinchZoom(boolean z10) {
        this.mPinchZoomEnabled = z10;
    }

    public void setRendererLeftYAxis(YAxisRenderer yAxisRenderer) {
        this.mAxisRendererLeft = yAxisRenderer;
    }

    public void setRendererRightYAxis(YAxisRenderer yAxisRenderer) {
        this.mAxisRendererRight = yAxisRenderer;
    }

    public void setScaleEnabled(boolean z10) {
        this.mScaleXEnabled = z10;
        this.mScaleYEnabled = z10;
    }

    public void setScaleMinima(float f10, float f11) {
        this.mViewPortHandler.setMinimumScaleX(f10);
        this.mViewPortHandler.setMinimumScaleY(f11);
    }

    public void setScaleXEnabled(boolean z10) {
        this.mScaleXEnabled = z10;
    }

    public void setScaleYEnabled(boolean z10) {
        this.mScaleYEnabled = z10;
    }

    public void setViewPortOffsets(final float f10, final float f11, final float f12, final float f13) {
        this.mCustomViewPortEnabled = true;
        post(new Runnable() { // from class: com.github.mikephil.charting.charts.BarLineChartBase.1
            @Override // java.lang.Runnable
            public void run() {
                BarLineChartBase.this.mViewPortHandler.restrainViewPort(f10, f11, f12, f13);
                BarLineChartBase.this.prepareOffsetMatrix();
                BarLineChartBase.this.prepareValuePxMatrix();
            }
        });
    }

    public void setVisibleXRange(float f10, float f11) {
        float f12 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.setMinMaxScaleX(f12 / f10, f12 / f11);
    }

    public void setVisibleXRangeMaximum(float f10) {
        this.mViewPortHandler.setMinimumScaleX(this.mXAxis.mAxisRange / f10);
    }

    public void setVisibleXRangeMinimum(float f10) {
        this.mViewPortHandler.setMaximumScaleX(this.mXAxis.mAxisRange / f10);
    }

    public void setVisibleYRange(float f10, float f11, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleY(getAxisRange(axisDependency) / f10, getAxisRange(axisDependency) / f11);
    }

    public void setVisibleYRangeMaximum(float f10, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleY(getAxisRange(axisDependency) / f10);
    }

    public void setVisibleYRangeMinimum(float f10, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleY(getAxisRange(axisDependency) / f10);
    }

    public void setXAxisRenderer(XAxisRenderer xAxisRenderer) {
        this.mXAxisRenderer = xAxisRenderer;
    }

    public void zoom(float f10, float f11, float f12, float f13) {
        this.mViewPortHandler.zoom(f10, f11, f12, -f13, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f10, float f11, float f12, float f13, YAxis.AxisDependency axisDependency) {
        addViewportJob(ZoomJob.getInstance(this.mViewPortHandler, f10, f11, f12, f13, getTransformer(axisDependency), axisDependency, this));
    }

    @TargetApi(11)
    public void zoomAndCenterAnimated(float f10, float f11, float f12, float f13, YAxis.AxisDependency axisDependency, long j10) {
        MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(AnimatedZoomJob.getInstance(this.mViewPortHandler, this, getTransformer(axisDependency), getAxis(axisDependency), this.mXAxis.mAxisRange, f10, f11, this.mViewPortHandler.getScaleX(), this.mViewPortHandler.getScaleY(), f12, f13, (float) valuesByTouchPoint.f43141x, (float) valuesByTouchPoint.f43142y, j10));
        MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void zoomIn() {
        MPPointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomIn(contentCenter.f43143x, -contentCenter.f43144y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        MPPointF.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        MPPointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomOut(contentCenter.f43143x, -contentCenter.f43144y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        MPPointF.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomToCenter(float f10, float f11) {
        MPPointF centerOffsets = getCenterOffsets();
        Matrix matrix = this.mZoomMatrixBuffer;
        this.mViewPortHandler.zoom(f10, f11, centerOffsets.f43143x, -centerOffsets.f43144y, matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
    }
}
