package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CandleStickChartRenderer extends LineScatterCandleRadarRenderer {
    private float[] mBodyBuffers;
    protected CandleDataProvider mChart;
    private float[] mCloseBuffers;
    private float[] mOpenBuffers;
    private float[] mRangeBuffers;
    private float[] mShadowBuffers;

    public CandleStickChartRenderer(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mShadowBuffers = new float[8];
        this.mBodyBuffers = new float[4];
        this.mRangeBuffers = new float[4];
        this.mOpenBuffers = new float[4];
        this.mCloseBuffers = new float[4];
        this.mChart = candleDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t10 : this.mChart.getCandleData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(Canvas canvas, ICandleDataSet iCandleDataSet) {
        int color;
        Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        boolean showCandleBar = iCandleDataSet.getShowCandleBar();
        this.mXBounds.set(this.mChart, iCandleDataSet);
        this.mRenderPaint.setStrokeWidth(iCandleDataSet.getShadowWidth());
        int i10 = this.mXBounds.min;
        while (true) {
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            if (i10 > xBounds.range + xBounds.min) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i10);
            if (candleEntry != null) {
                float x10 = candleEntry.getX();
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (showCandleBar) {
                    float[] fArr = this.mShadowBuffers;
                    fArr[0] = x10;
                    fArr[2] = x10;
                    fArr[4] = x10;
                    fArr[6] = x10;
                    if (open > close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[1] = high * phaseY;
                        float f10 = open * phaseY;
                        fArr[3] = f10;
                        fArr[5] = low * phaseY;
                        fArr[7] = f10;
                    }
                    transformer.pointValuesToPixel(fArr);
                    if (!iCandleDataSet.getShadowColorSameAsCandle()) {
                        this.mRenderPaint.setColor(iCandleDataSet.getShadowColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getShadowColor());
                    } else if (open > close) {
                        this.mRenderPaint.setColor(iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getDecreasingColor());
                    } else if (open < close) {
                        this.mRenderPaint.setColor(iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getIncreasingColor());
                    } else {
                        this.mRenderPaint.setColor(iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getNeutralColor());
                    }
                    this.mRenderPaint.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.mShadowBuffers, this.mRenderPaint);
                    float[] fArr2 = this.mBodyBuffers;
                    fArr2[0] = (x10 - 0.5f) + barSpace;
                    fArr2[1] = close * phaseY;
                    fArr2[2] = (x10 + 0.5f) - barSpace;
                    fArr2[3] = open * phaseY;
                    transformer.pointValuesToPixel(fArr2);
                    if (open > close) {
                        if (iCandleDataSet.getDecreasingColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i10));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getDecreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getDecreasingPaintStyle());
                        float[] fArr3 = this.mBodyBuffers;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.mRenderPaint);
                    } else if (open < close) {
                        if (iCandleDataSet.getIncreasingColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i10));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getIncreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getIncreasingPaintStyle());
                        float[] fArr4 = this.mBodyBuffers;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        if (iCandleDataSet.getNeutralColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i10));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getNeutralColor());
                        }
                        float[] fArr5 = this.mBodyBuffers;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    float[] fArr6 = this.mRangeBuffers;
                    fArr6[0] = x10;
                    fArr6[1] = high * phaseY;
                    fArr6[2] = x10;
                    fArr6[3] = low * phaseY;
                    float[] fArr7 = this.mOpenBuffers;
                    fArr7[0] = (x10 - 0.5f) + barSpace;
                    float f11 = open * phaseY;
                    fArr7[1] = f11;
                    fArr7[2] = x10;
                    fArr7[3] = f11;
                    float[] fArr8 = this.mCloseBuffers;
                    fArr8[0] = (0.5f + x10) - barSpace;
                    float f12 = close * phaseY;
                    fArr8[1] = f12;
                    fArr8[2] = x10;
                    fArr8[3] = f12;
                    transformer.pointValuesToPixel(fArr6);
                    transformer.pointValuesToPixel(this.mOpenBuffers);
                    transformer.pointValuesToPixel(this.mCloseBuffers);
                    if (open > close) {
                        color = iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getDecreasingColor();
                    } else if (open < close) {
                        color = iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getIncreasingColor();
                    } else {
                        color = iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i10) : iCandleDataSet.getNeutralColor();
                    }
                    this.mRenderPaint.setColor(color);
                    float[] fArr9 = this.mRangeBuffers;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.mOpenBuffers;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.mCloseBuffers;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
            i10++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        CandleData candleData = this.mChart.getCandleData();
        for (Highlight highlight : highlightArr) {
            ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet = (ICandleDataSet) candleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineScatterCandleRadarDataSet != null && iLineScatterCandleRadarDataSet.isHighlightEnabled()) {
                CandleEntry candleEntry = (CandleEntry) iLineScatterCandleRadarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(candleEntry, iLineScatterCandleRadarDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineScatterCandleRadarDataSet.getAxisDependency()).getPixelForValues(candleEntry.getX(), ((candleEntry.getLow() * this.mAnimator.getPhaseY()) + (candleEntry.getHigh() * this.mAnimator.getPhaseY())) / 2.0f);
                    highlight.setDraw((float) pixelForValues.f43141x, (float) pixelForValues.f43142y);
                    drawHighlightLines(canvas, (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, iLineScatterCandleRadarDataSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getCandleData().getDataSets();
            for (int i10 = 0; i10 < dataSets.size(); i10++) {
                ICandleDataSet iCandleDataSet = (ICandleDataSet) dataSets.get(i10);
                if (shouldDrawValues(iCandleDataSet)) {
                    applyValueTextStyle(iCandleDataSet);
                    Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
                    this.mXBounds.set(this.mChart, iCandleDataSet);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesCandle = transformer.generateTransformedValuesCandle(iCandleDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
                    MPPointF mPPointF = MPPointF.getInstance(iCandleDataSet.getIconsOffset());
                    mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                    mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                    int i11 = 0;
                    while (i11 < fArrGenerateTransformedValuesCandle.length) {
                        float f10 = fArrGenerateTransformedValuesCandle[i11];
                        float f11 = fArrGenerateTransformedValuesCandle[i11 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f10)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f10) && this.mViewPortHandler.isInBoundsY(f11)) {
                            int i12 = i11 / 2;
                            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(this.mXBounds.min + i12);
                            if (iCandleDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iCandleDataSet.getValueFormatter(), candleEntry.getHigh(), candleEntry, i10, f10, f11 - fConvertDpToPixel, iCandleDataSet.getValueTextColor(i12));
                            }
                            if (candleEntry.getIcon() != null && iCandleDataSet.isDrawIconsEnabled()) {
                                Drawable icon = candleEntry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f10 + mPPointF.f43143x), (int) (f11 + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
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

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
