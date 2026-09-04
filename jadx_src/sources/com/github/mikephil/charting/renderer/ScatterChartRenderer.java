package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    protected ScatterDataProvider mChart;
    float[] mPixelBuffer;

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mPixelBuffer = new float[2];
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t10 : this.mChart.getScatterData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
        if (shapeRenderer == null) {
            Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
            return;
        }
        int iMin = (int) Math.min(Math.ceil(iScatterDataSet.getEntryCount() * this.mAnimator.getPhaseX()), iScatterDataSet.getEntryCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i10);
            this.mPixelBuffer[0] = entryForIndex.getX();
            this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.mPixelBuffer);
            if (!viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                return;
            }
            if (viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) && viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                this.mRenderPaint.setColor(iScatterDataSet.getColor(i10 / 2));
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float[] fArr = this.mPixelBuffer;
                shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        ScatterData scatterData = this.mChart.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.f43141x, (float) pixelForValues.f43142y);
                    drawHighlightLines(canvas, (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, iScatterDataSet);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i10 = 0; i10 < this.mChart.getScatterData().getDataSetCount(); i10++) {
                IScatterDataSet iScatterDataSet = (IScatterDataSet) dataSets.get(i10);
                if (shouldDrawValues(iScatterDataSet)) {
                    applyValueTextStyle(iScatterDataSet);
                    this.mXBounds.set(this.mChart, iScatterDataSet);
                    Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesScatter = transformer.generateTransformedValuesScatter(iScatterDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    MPPointF mPPointF = MPPointF.getInstance(iScatterDataSet.getIconsOffset());
                    mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                    mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                    int i11 = 0;
                    while (i11 < fArrGenerateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesScatter[i11])) {
                        if (this.mViewPortHandler.isInBoundsLeft(fArrGenerateTransformedValuesScatter[i11])) {
                            int i12 = i11 + 1;
                            if (this.mViewPortHandler.isInBoundsY(fArrGenerateTransformedValuesScatter[i12])) {
                                int i13 = i11 / 2;
                                ?? entryForIndex = iScatterDataSet.getEntryForIndex(this.mXBounds.min + i13);
                                if (iScatterDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, iScatterDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i10, fArrGenerateTransformedValuesScatter[i11], fArrGenerateTransformedValuesScatter[i12] - fConvertDpToPixel, iScatterDataSet.getValueTextColor(i13 + this.mXBounds.min));
                                }
                                if (entryForIndex.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entryForIndex.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (fArrGenerateTransformedValuesScatter[i11] + mPPointF.f43143x), (int) (fArrGenerateTransformedValuesScatter[i12] + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i11 = i11;
                                mPPointF = mPPointF;
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
