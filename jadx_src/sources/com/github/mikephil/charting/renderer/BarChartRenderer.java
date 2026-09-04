package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new RectF();
        this.mBarShadowRectBuffer = new RectF();
        this.mChart = barDataProvider;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i10 = 0; i10 < barData.getDataSetCount(); i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i10) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z10 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i11 = 0; i11 < iMin; i11++) {
                float x10 = ((BarEntry) iBarDataSet.getEntryForIndex(i11)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.left = x10 - barWidth;
                rectF.right = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i10];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i10);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z11 = iBarDataSet.getColors().size() == 1;
        if (z11) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i12 = 0; i12 < barBuffer.size(); i12 += 4) {
            int i13 = i12 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i13])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i12])) {
                    return;
                }
                if (!z11) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i12 / 4));
                }
                float[] fArr = barBuffer.buffer;
                int i14 = i12 + 1;
                int i15 = i12 + 3;
                canvas.drawRect(fArr[i12], fArr[i14], fArr[i13], fArr[i15], this.mRenderPaint);
                if (z10) {
                    float[] fArr2 = barBuffer.buffer;
                    canvas.drawRect(fArr2[i12], fArr2[i14], fArr2[i13], fArr2[i15], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y10;
        float f10;
        float f11;
        float f12;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() >= 0 && barEntry.isStacked()) {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            y10 = barEntry.getPositiveSum();
                            f10 = -barEntry.getNegativeSum();
                        } else {
                            Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            f12 = range.from;
                            f11 = range.to;
                        }
                        prepareBarHighlight(barEntry.getX(), f12, f11, barData.getBarWidth() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    } else {
                        y10 = barEntry.getY();
                        f10 = 0.0f;
                    }
                    f11 = f10;
                    f12 = y10;
                    prepareBarHighlight(barEntry.getX(), f12, f11, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        MPPointF mPPointF;
        List list;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i10 = 0;
            while (i10 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i10);
                if (shouldDrawValues(iBarDataSet)) {
                    applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
                    float f15 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f16 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f15 = (-f15) - fCalcTextHeight;
                        f16 = (-f16) - fCalcTextHeight;
                    }
                    float f17 = f15;
                    float f18 = f16;
                    BarBuffer barBuffer = this.mBarBuffers[i10];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.f43143x = Utils.convertDpToPixel(mPPointF2.f43143x);
                    mPPointF2.f43144y = Utils.convertDpToPixel(mPPointF2.f43144y);
                    if (iBarDataSet.isStacked()) {
                        mPPointF = mPPointF2;
                        list = dataSets;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i11 = 0;
                        int length = 0;
                        while (i11 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i11);
                            float[] yVals = barEntry.getYVals();
                            float[] fArr = barBuffer.buffer;
                            float f19 = (fArr[length] + fArr[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i11);
                            if (yVals != null) {
                                i11 = i11;
                                fConvertDpToPixel = fConvertDpToPixel;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                yVals = yVals;
                                transformer = transformer;
                                float f20 = f19;
                                int length2 = yVals.length * 2;
                                float[] fArr2 = new float[length2];
                                float f21 = -barEntry.getNegativeSum();
                                float f22 = 0.0f;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < length2) {
                                    float f23 = yVals[i13];
                                    if (f23 == 0.0f && (f22 == 0.0f || f21 == 0.0f)) {
                                        float f24 = f21;
                                        f21 = f23;
                                        f11 = f24;
                                    } else if (f23 >= 0.0f) {
                                        f22 += f23;
                                        f11 = f21;
                                        f21 = f22;
                                    } else {
                                        f11 = f21 - f23;
                                    }
                                    fArr2[i12 + 1] = f21 * phaseY;
                                    i12 += 2;
                                    i13++;
                                    f21 = f11;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i14 = 0;
                                while (i14 < length2) {
                                    int i15 = i14 / 2;
                                    float f25 = yVals[i15];
                                    float f26 = fArr2[i14 + 1] + (((f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) == 0 && (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1)) == 0 && (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1)) > 0) || (f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) < 0 ? f18 : f17);
                                    if (!this.mViewPortHandler.isInBoundsRight(f20)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f26) && this.mViewPortHandler.isInBoundsLeft(f20)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f10 = f26;
                                            drawValue(canvas, iBarDataSet.getValueFormatter(), yVals[i15], barEntry, i10, f20, f10, valueTextColor);
                                        } else {
                                            f10 = f26;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon = barEntry.getIcon();
                                            Utils.drawImage(canvas, icon, (int) (f20 + mPPointF.f43143x), (int) (f10 + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                        }
                                    } else {
                                        i14 = i14;
                                        fArr2 = fArr2;
                                        length2 = length2;
                                        f20 = f20;
                                    }
                                    i14 += 2;
                                    fArr2 = fArr2;
                                    length2 = length2;
                                    f20 = f20;
                                }
                            } else {
                                if (!this.mViewPortHandler.isInBoundsRight(f19)) {
                                    break;
                                }
                                int i16 = length + 1;
                                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i16]) && this.mViewPortHandler.isInBoundsLeft(f19)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f12 = f19;
                                        drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry.getY(), barEntry, i10, f12, barBuffer.buffer[i16] + (barEntry.getY() >= 0.0f ? f17 : f18), valueTextColor);
                                    } else {
                                        f12 = f19;
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon2 = barEntry.getIcon();
                                        Utils.drawImage(canvas, icon2, (int) (f12 + mPPointF.f43143x), (int) (barBuffer.buffer[i16] + (barEntry.getY() >= 0.0f ? f17 : f18) + mPPointF.f43144y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                    }
                                } else {
                                    transformer = transformer;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    fConvertDpToPixel = fConvertDpToPixel;
                                    i11 = i11;
                                }
                            }
                            length = yVals == null ? length + 4 : length + (yVals.length * 4);
                            i11++;
                            transformer = transformer;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            fConvertDpToPixel = fConvertDpToPixel;
                        }
                    } else {
                        int i17 = 0;
                        while (i17 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            float[] fArr3 = barBuffer.buffer;
                            float f27 = (fArr3[i17] + fArr3[i17 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f27)) {
                                break;
                            }
                            int i18 = i17 + 1;
                            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i18]) && this.mViewPortHandler.isInBoundsLeft(f27)) {
                                int i19 = i17 / 4;
                                Entry entry = (BarEntry) iBarDataSet.getEntryForIndex(i19);
                                float y10 = entry.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    f14 = f27;
                                    drawValue(canvas, iBarDataSet.getValueFormatter(), y10, entry, i10, f14, y10 >= 0.0f ? barBuffer.buffer[i18] + f17 : barBuffer.buffer[i17 + 3] + f18, iBarDataSet.getValueTextColor(i19));
                                } else {
                                    f14 = f27;
                                }
                                if (entry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = entry.getIcon();
                                    Utils.drawImage(canvas, icon3, (int) (f14 + mPPointF2.f43143x), (int) ((y10 >= 0.0f ? barBuffer.buffer[i18] + f17 : barBuffer.buffer[i17 + 3] + f18) + mPPointF2.f43144y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i17 = i17;
                                mPPointF2 = mPPointF2;
                                dataSets = dataSets;
                                barBuffer = barBuffer;
                            }
                            i17 += 4;
                            barBuffer = barBuffer;
                            mPPointF2 = mPPointF2;
                            dataSets = dataSets;
                        }
                        mPPointF = mPPointF2;
                        list = dataSets;
                    }
                    f13 = fConvertDpToPixel;
                    z10 = zIsDrawValueAboveBarEnabled;
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f13 = fConvertDpToPixel;
                    z10 = zIsDrawValueAboveBarEnabled;
                }
                i10++;
                dataSets = list;
                zIsDrawValueAboveBarEnabled = z10;
                fConvertDpToPixel = f13;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i10 = 0; i10 < this.mBarBuffers.length; i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            this.mBarBuffers[i10] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    protected void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f10 - f13, f11, f10 + f13, f12);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
