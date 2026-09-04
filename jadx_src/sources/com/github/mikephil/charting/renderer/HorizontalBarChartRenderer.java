package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mBarShadowRectBuffer = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
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
                rectF.top = x10 - barWidth;
                rectF.bottom = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
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
            int i13 = i12 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i13])) {
                return;
            }
            int i14 = i12 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i14])) {
                if (!z11) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i12 / 4));
                }
                float[] fArr = barBuffer.buffer;
                int i15 = i12 + 2;
                canvas.drawRect(fArr[i12], fArr[i14], fArr[i15], fArr[i13], this.mRenderPaint);
                if (z10) {
                    float[] fArr2 = barBuffer.buffer;
                    canvas.drawRect(fArr2[i12], fArr2[i14], fArr2[i15], fArr2[i13], this.mBarBorderPaint);
                }
            }
        }
    }

    protected void drawValue(Canvas canvas, String str, float f10, float f11, int i10) {
        this.mValuePaint.setColor(i10);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x00f5: MOVE (r3v15 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        MPPointF mPPointF;
        float[] fArr;
        float f10;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i10 = 0;
            while (i10 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i10);
                if (shouldDrawValues(iBarDataSet)) {
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f11 = 2.0f;
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "10") / 2.0f;
                    IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer = this.mBarBuffers[i10];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.f43143x = Utils.convertDpToPixel(mPPointF2.f43143x);
                    mPPointF2.f43144y = Utils.convertDpToPixel(mPPointF2.f43144y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        mPPointF = mPPointF2;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i11 = 0;
                        int length = 0;
                        while (i11 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i11);
                            int valueTextColor = iBarDataSet.getValueTextColor(i11);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i12 = length + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i12])) {
                                    break;
                                }
                                if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[length]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i12])) {
                                    String formattedValue = valueFormatter.getFormattedValue(barEntry.getY(), barEntry, i10, this.mViewPortHandler);
                                    float fCalcTextWidth = Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                    float f12 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth + fConvertDpToPixel);
                                    fArr = yVals;
                                    float f13 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + fConvertDpToPixel) : fConvertDpToPixel;
                                    if (zIsInverted) {
                                        f12 = (-f12) - fCalcTextWidth;
                                        f13 = (-f13) - fCalcTextWidth;
                                    }
                                    float f14 = f12;
                                    float f15 = f13;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        drawValue(canvas, formattedValue, barBuffer.buffer[length + 2] + (barEntry.getY() >= 0.0f ? f14 : f15), barBuffer.buffer[i12] + fCalcTextHeight, valueTextColor);
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon = barEntry.getIcon();
                                        float f16 = barBuffer.buffer[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f14 = f15;
                                        }
                                        Utils.drawImage(canvas, icon, (int) (f16 + f14 + mPPointF.f43143x), (int) (barBuffer.buffer[i12] + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i11 = i11;
                                zIsInverted = zIsInverted;
                                fArr = yVals;
                                int length2 = fArr.length * 2;
                                float[] fArr2 = new float[length2];
                                float f17 = -barEntry.getNegativeSum();
                                float f18 = 0.0f;
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 < length2) {
                                    float f19 = fArr[i14];
                                    if (f19 == 0.0f && (f18 == 0.0f || f17 == 0.0f)) {
                                        float f20 = f17;
                                        f17 = f19;
                                        f10 = f20;
                                    } else if (f19 >= 0.0f) {
                                        f18 += f19;
                                        f10 = f17;
                                        f17 = f18;
                                    } else {
                                        f10 = f17 - f19;
                                    }
                                    fArr2[i13] = f17 * phaseY;
                                    i13 += 2;
                                    i14++;
                                    f17 = f10;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < length2) {
                                        float f21 = fArr[i15 / 2];
                                        String formattedValue2 = valueFormatter.getFormattedValue(f21, barEntry, i10, this.mViewPortHandler);
                                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mValuePaint, formattedValue2);
                                        float f22 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth2 + fConvertDpToPixel);
                                        int i16 = length2;
                                        float f23 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + fConvertDpToPixel) : fConvertDpToPixel;
                                        if (zIsInverted) {
                                            f22 = (-f22) - fCalcTextWidth2;
                                            f23 = (-f23) - fCalcTextWidth2;
                                        }
                                        boolean z10 = (f21 == 0.0f && f17 == 0.0f && f18 > 0.0f) || f21 < 0.0f;
                                        float f24 = fArr2[i15];
                                        if (z10) {
                                            f22 = f23;
                                        }
                                        float f25 = f24 + f22;
                                        float[] fArr3 = barBuffer.buffer;
                                        float f26 = (fArr3[length + 1] + fArr3[length + 3]) / 2.0f;
                                        if (!this.mViewPortHandler.isInBoundsTop(f26)) {
                                            break;
                                        }
                                        if (this.mViewPortHandler.isInBoundsX(f25) && this.mViewPortHandler.isInBoundsBottom(f26)) {
                                            if (iBarDataSet.isDrawValuesEnabled()) {
                                                drawValue(canvas, formattedValue2, f25, f26 + fCalcTextHeight, valueTextColor);
                                            }
                                            if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                                Drawable icon2 = barEntry.getIcon();
                                                Utils.drawImage(canvas, icon2, (int) (f25 + mPPointF.f43143x), (int) (f26 + mPPointF.f43144y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                            }
                                        } else {
                                            i15 = i15;
                                            fArr2 = fArr2;
                                        }
                                        i15 += 2;
                                        length2 = i16;
                                        fArr2 = fArr2;
                                    }
                                }
                                if (fArr == null) {
                                    length += 4;
                                } else {
                                    length += fArr.length * 4;
                                }
                                i11++;
                                zIsInverted = zIsInverted;
                            }
                            if (fArr == null) {
                                length += 4;
                            } else {
                                length += fArr.length * 4;
                            }
                            i11++;
                            zIsInverted = zIsInverted;
                        }
                    } else {
                        int i17 = 0;
                        while (i17 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            float[] fArr4 = barBuffer.buffer;
                            int i18 = i17 + 1;
                            float f27 = fArr4[i18];
                            float f28 = (fArr4[i17 + 3] + f27) / f11;
                            if (!this.mViewPortHandler.isInBoundsTop(f27)) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i17]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i18])) {
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i17 / 4);
                                float y10 = barEntry2.getY();
                                String formattedValue3 = valueFormatter.getFormattedValue(y10, barEntry2, i10, this.mViewPortHandler);
                                float fCalcTextWidth3 = Utils.calcTextWidth(this.mValuePaint, formattedValue3);
                                float f29 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                float f30 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel;
                                if (zIsInverted) {
                                    f29 = (-f29) - fCalcTextWidth3;
                                    f30 = (-f30) - fCalcTextWidth3;
                                }
                                float f31 = f29;
                                float f32 = f30;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, formattedValue3, (y10 >= 0.0f ? f31 : f32) + barBuffer.buffer[i17 + 2], f28 + fCalcTextHeight, iBarDataSet.getValueTextColor(i17 / 2));
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry2.getIcon();
                                    float f33 = barBuffer.buffer[i17 + 2];
                                    if (y10 < 0.0f) {
                                        f31 = f32;
                                    }
                                    Utils.drawImage(canvas, icon3, (int) (f33 + f31 + r20.f43143x), (int) (f28 + r20.f43144y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i17 = i17;
                                barBuffer = barBuffer;
                                dataSets = dataSets;
                                fCalcTextHeight = fCalcTextHeight;
                                valueFormatter = valueFormatter;
                            }
                            i17 += 4;
                            mPPointF2 = mPPointF2;
                            barBuffer = barBuffer;
                            valueFormatter = valueFormatter;
                            dataSets = dataSets;
                            fCalcTextHeight = fCalcTextHeight;
                            f11 = 2.0f;
                        }
                        list = dataSets;
                        mPPointF = mPPointF2;
                    }
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                }
                i10++;
                dataSets = list;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i10 = 0; i10 < this.mBarBuffers.length; i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            this.mBarBuffers[i10] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    protected boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f11, f10 - f13, f12, f10 + f13);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
