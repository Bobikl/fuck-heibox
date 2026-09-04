package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class RadarChartRenderer extends LineRadarRenderer {
    protected RadarChart mChart;
    protected Path mDrawDataSetSurfacePathBuffer;
    protected Path mDrawHighlightCirclePathBuffer;
    protected Paint mHighlightCirclePaint;
    protected Paint mWebPaint;

    public RadarChartRenderer(RadarChart radarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mDrawDataSetSurfacePathBuffer = new Path();
        this.mDrawHighlightCirclePathBuffer = new Path();
        this.mChart = radarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.mWebPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mHighlightCirclePaint = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        RadarData radarData = (RadarData) this.mChart.getData();
        int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                drawDataSet(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(Canvas canvas, IRadarDataSet iRadarDataSet, int i10) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        boolean z10 = false;
        for (int i11 = 0; i11 < iRadarDataSet.getEntryCount(); i11++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i11));
            Utils.getPosition(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i11)).getY() - this.mChart.getYChartMin()) * factor * phaseY, (i11 * sliceAngle * phaseX) + this.mChart.getRotationAngle(), mPPointF);
            if (!Float.isNaN(mPPointF.f43143x)) {
                if (z10) {
                    path.lineTo(mPPointF.f43143x, mPPointF.f43144y);
                } else {
                    path.moveTo(mPPointF.f43143x, mPPointF.f43144y);
                    z10 = true;
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i10) {
            path.lineTo(centerOffsets.f43143x, centerOffsets.f43144y);
        }
        path.close();
        if (iRadarDataSet.isDrawFilledEnabled()) {
            Drawable fillDrawable = iRadarDataSet.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, iRadarDataSet.getFillColor(), iRadarDataSet.getFillAlpha());
            }
        }
        this.mRenderPaint.setStrokeWidth(iRadarDataSet.getLineWidth());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (!iRadarDataSet.isDrawFilledEnabled() || iRadarDataSet.getFillAlpha() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, MPPointF mPPointF, float f10, float f11, int i10, int i11, float f12) {
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(f11);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(f10);
        if (i10 != 1122867) {
            Path path = this.mDrawHighlightCirclePathBuffer;
            path.reset();
            path.addCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel, Path.Direction.CW);
            if (fConvertDpToPixel2 > 0.0f) {
                path.addCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel2, Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i10);
            this.mHighlightCirclePaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i11 != 1122867) {
            this.mHighlightCirclePaint.setColor(i11);
            this.mHighlightCirclePaint.setStyle(Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(Utils.convertDpToPixel(f12));
            canvas.drawCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        RadarData radarData = (RadarData) this.mChart.getData();
        int length = highlightArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            Highlight highlight = highlightArr[i11];
            IRadarDataSet dataSetByIndex = radarData.getDataSetByIndex(highlight.getDataSetIndex());
            if (dataSetByIndex != null && dataSetByIndex.isHighlightEnabled()) {
                Entry entry = (RadarEntry) dataSetByIndex.getEntryForIndex((int) highlight.getX());
                if (isInBoundsX(entry, dataSetByIndex)) {
                    Utils.getPosition(centerOffsets, (entry.getY() - this.mChart.getYChartMin()) * factor * this.mAnimator.getPhaseY(), (highlight.getX() * sliceAngle * this.mAnimator.getPhaseX()) + this.mChart.getRotationAngle(), mPPointF);
                    highlight.setDraw(mPPointF.f43143x, mPPointF.f43144y);
                    drawHighlightLines(canvas, mPPointF.f43143x, mPPointF.f43144y, dataSetByIndex);
                    if (dataSetByIndex.isDrawHighlightCircleEnabled() && !Float.isNaN(mPPointF.f43143x) && !Float.isNaN(mPPointF.f43144y)) {
                        int highlightCircleStrokeColor = dataSetByIndex.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = dataSetByIndex.getColor(i10);
                        }
                        if (dataSetByIndex.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = ColorTemplate.colorWithAlpha(highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeAlpha());
                        }
                        drawHighlightCircle(canvas, mPPointF, dataSetByIndex.getHighlightCircleInnerRadius(), dataSetByIndex.getHighlightCircleOuterRadius(), dataSetByIndex.getHighlightCircleFillColor(), highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeWidth());
                    }
                }
            }
            i11++;
            i10 = i10;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        MPPointF mPPointF;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF3 = MPPointF.getInstance(0.0f, 0.0f);
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i11 = 0;
        while (i11 < ((RadarData) this.mChart.getData()).getDataSetCount()) {
            IRadarDataSet dataSetByIndex = ((RadarData) this.mChart.getData()).getDataSetByIndex(i11);
            if (shouldDrawValues(dataSetByIndex)) {
                applyValueTextStyle(dataSetByIndex);
                MPPointF mPPointF4 = MPPointF.getInstance(dataSetByIndex.getIconsOffset());
                mPPointF4.f43143x = Utils.convertDpToPixel(mPPointF4.f43143x);
                mPPointF4.f43144y = Utils.convertDpToPixel(mPPointF4.f43144y);
                int i12 = 0;
                while (i12 < dataSetByIndex.getEntryCount()) {
                    RadarEntry radarEntry = (RadarEntry) dataSetByIndex.getEntryForIndex(i12);
                    float f12 = i12 * sliceAngle * phaseX;
                    Utils.getPosition(centerOffsets, (radarEntry.getY() - this.mChart.getYChartMin()) * factor * phaseY, f12 + this.mChart.getRotationAngle(), mPPointF2);
                    if (dataSetByIndex.isDrawValuesEnabled()) {
                        drawValue(canvas, dataSetByIndex.getValueFormatter(), radarEntry.getY(), radarEntry, i11, mPPointF2.f43143x, mPPointF2.f43144y - fConvertDpToPixel, dataSetByIndex.getValueTextColor(i12));
                    }
                    if (radarEntry.getIcon() != null && dataSetByIndex.isDrawIconsEnabled()) {
                        Drawable icon = radarEntry.getIcon();
                        Utils.getPosition(centerOffsets, (radarEntry.getY() * factor * phaseY) + mPPointF4.f43144y, f12 + this.mChart.getRotationAngle(), mPPointF3);
                        float f13 = mPPointF3.f43144y + mPPointF4.f43143x;
                        mPPointF3.f43144y = f13;
                        Utils.drawImage(canvas, icon, (int) mPPointF3.f43143x, (int) f13, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i12++;
                    mPPointF4 = mPPointF4;
                    mPPointF3 = mPPointF3;
                    sliceAngle = sliceAngle;
                    i11 = i11;
                    phaseX = phaseX;
                    dataSetByIndex = dataSetByIndex;
                }
                i10 = i11;
                f10 = phaseX;
                f11 = sliceAngle;
                mPPointF = mPPointF3;
                MPPointF.recycleInstance(mPPointF4);
            } else {
                i10 = i11;
                f10 = phaseX;
                f11 = sliceAngle;
                mPPointF = mPPointF3;
            }
            i11 = i10 + 1;
            mPPointF3 = mPPointF;
            sliceAngle = f11;
            phaseX = f10;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF2);
        MPPointF.recycleInstance(mPPointF3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawWeb(Canvas canvas) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        float rotationAngle = this.mChart.getRotationAngle();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int skipWebLineCount = this.mChart.getSkipWebLineCount() + 1;
        int entryCount = ((RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i10 = 0; i10 < entryCount; i10 += skipWebLineCount) {
            Utils.getPosition(centerOffsets, this.mChart.getYRange() * factor, (i10 * sliceAngle) + rotationAngle, mPPointF);
            canvas.drawLine(centerOffsets.f43143x, centerOffsets.f43144y, mPPointF.f43143x, mPPointF.f43144y, this.mWebPaint);
        }
        MPPointF.recycleInstance(mPPointF);
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidthInner());
        this.mWebPaint.setColor(this.mChart.getWebColorInner());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int i11 = this.mChart.getYAxis().mEntryCount;
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF3 = MPPointF.getInstance(0.0f, 0.0f);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            while (i13 < ((RadarData) this.mChart.getData()).getEntryCount()) {
                float yChartMin = (this.mChart.getYAxis().mEntries[i12] - this.mChart.getYChartMin()) * factor;
                Utils.getPosition(centerOffsets, yChartMin, (i13 * sliceAngle) + rotationAngle, mPPointF2);
                i13++;
                Utils.getPosition(centerOffsets, yChartMin, (i13 * sliceAngle) + rotationAngle, mPPointF3);
                canvas.drawLine(mPPointF2.f43143x, mPPointF2.f43144y, mPPointF3.f43143x, mPPointF3.f43144y, this.mWebPaint);
            }
        }
        MPPointF.recycleInstance(mPPointF2);
        MPPointF.recycleInstance(mPPointF3);
    }

    public Paint getWebPaint() {
        return this.mWebPaint;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
