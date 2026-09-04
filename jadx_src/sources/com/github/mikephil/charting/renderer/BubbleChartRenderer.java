package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BubbleChartRenderer extends BarLineScatterCandleBubbleRenderer {
    private float[] _hsvBuffer;
    protected BubbleDataProvider mChart;
    private float[] pointBuffer;
    private float[] sizeBuffer;

    public BubbleChartRenderer(BubbleDataProvider bubbleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.sizeBuffer = new float[4];
        this.pointBuffer = new float[2];
        this._hsvBuffer = new float[3];
        this.mChart = bubbleDataProvider;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(Utils.convertDpToPixel(1.5f));
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t10 : this.mChart.getBubbleData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(Canvas canvas, IBubbleDataSet iBubbleDataSet) {
        Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mXBounds.set(this.mChart, iBubbleDataSet);
        float[] fArr = this.sizeBuffer;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.pointValuesToPixel(fArr);
        boolean zIsNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
        float[] fArr2 = this.sizeBuffer;
        float fMin = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
        int i10 = this.mXBounds.min;
        while (true) {
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            if (i10 > xBounds.range + xBounds.min) {
                return;
            }
            BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i10);
            this.pointBuffer[0] = bubbleEntry.getX();
            this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
            transformer.pointValuesToPixel(this.pointBuffer);
            float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), fMin, zIsNormalizeSizeEnabled) / 2.0f;
            if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                    return;
                }
                this.mRenderPaint.setColor(iBubbleDataSet.getColor((int) bubbleEntry.getX()));
                float[] fArr3 = this.pointBuffer;
                canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
            }
            i10++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        BubbleData bubbleData = this.mChart.getBubbleData();
        float phaseY = this.mAnimator.getPhaseY();
        for (Highlight highlight : highlightArr) {
            IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) bubbleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBubbleDataSet != null && iBubbleDataSet.isHighlightEnabled()) {
                BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (bubbleEntry.getY() == highlight.getY() && isInBoundsX(bubbleEntry, iBubbleDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    float[] fArr = this.sizeBuffer;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.pointValuesToPixel(fArr);
                    boolean zIsNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
                    float[] fArr2 = this.sizeBuffer;
                    float fMin = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
                    this.pointBuffer[0] = bubbleEntry.getX();
                    this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
                    transformer.pointValuesToPixel(this.pointBuffer);
                    float[] fArr3 = this.pointBuffer;
                    highlight.setDraw(fArr3[0], fArr3[1]);
                    float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), fMin, zIsNormalizeSizeEnabled) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                        if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                            return;
                        }
                        int color = iBubbleDataSet.getColor((int) bubbleEntry.getX());
                        Color.RGBToHSV(Color.red(color), Color.green(color), Color.blue(color), this._hsvBuffer);
                        float[] fArr4 = this._hsvBuffer;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.mHighlightPaint.setColor(Color.HSVToColor(Color.alpha(color), this._hsvBuffer));
                        this.mHighlightPaint.setStrokeWidth(iBubbleDataSet.getHighlightCircleWidth());
                        float[] fArr5 = this.pointBuffer;
                        canvas.drawCircle(fArr5[0], fArr5[1], shapeSize, this.mHighlightPaint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        BubbleData bubbleData = this.mChart.getBubbleData();
        if (bubbleData != null && isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = bubbleData.getDataSets();
            float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "1");
            for (int i10 = 0; i10 < dataSets.size(); i10++) {
                IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) dataSets.get(i10);
                if (shouldDrawValues(iBubbleDataSet)) {
                    applyValueTextStyle(iBubbleDataSet);
                    float fMax = Math.max(0.0f, Math.min(1.0f, this.mAnimator.getPhaseX()));
                    float phaseY = this.mAnimator.getPhaseY();
                    this.mXBounds.set(this.mChart, iBubbleDataSet);
                    Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesBubble = transformer.generateTransformedValuesBubble(iBubbleDataSet, phaseY, xBounds.min, xBounds.max);
                    float f10 = fMax == 1.0f ? phaseY : fMax;
                    MPPointF mPPointF = MPPointF.getInstance(iBubbleDataSet.getIconsOffset());
                    mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                    mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                    int i11 = 0;
                    while (i11 < fArrGenerateTransformedValuesBubble.length) {
                        int i12 = i11 / 2;
                        int valueTextColor = iBubbleDataSet.getValueTextColor(this.mXBounds.min + i12);
                        int iArgb = Color.argb(Math.round(255.0f * f10), Color.red(valueTextColor), Color.green(valueTextColor), Color.blue(valueTextColor));
                        float f11 = fArrGenerateTransformedValuesBubble[i11];
                        float f12 = fArrGenerateTransformedValuesBubble[i11 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f11)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f11) && this.mViewPortHandler.isInBoundsY(f12)) {
                            BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i12 + this.mXBounds.min);
                            if (iBubbleDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iBubbleDataSet.getValueFormatter(), bubbleEntry.getSize(), bubbleEntry, i10, f11, f12 + (0.5f * fCalcTextHeight), iArgb);
                            }
                            if (bubbleEntry.getIcon() != null && iBubbleDataSet.isDrawIconsEnabled()) {
                                Drawable icon = bubbleEntry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f11 + mPPointF.f43143x), (int) (f12 + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i11 = i11;
                            mPPointF = mPPointF;
                        }
                        i11 += 2;
                        mPPointF = mPPointF;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    protected float getShapeSize(float f10, float f11, float f12, boolean z10) {
        if (z10) {
            f10 = f11 == 0.0f ? 1.0f : (float) Math.sqrt(f10 / f11);
        }
        return f12 * f10;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
