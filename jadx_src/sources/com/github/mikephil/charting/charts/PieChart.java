package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.PieHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PieChart extends PieRadarChartBase<PieData> {
    private float[] mAbsoluteAngles;
    private CharSequence mCenterText;
    private MPPointF mCenterTextOffset;
    private float mCenterTextRadiusPercent;
    private RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawEntryLabels;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    public PieChart(Context context) {
        super(context);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    private float calcAngle(float f10) {
        return calcAngle(f10, ((PieData) this.mData).getYValueSum());
    }

    private float calcAngle(float f10, float f11) {
        return (f10 / f11) * this.mMaxAngle;
    }

    private void calcAngles() {
        int entryCount = ((PieData) this.mData).getEntryCount();
        if (this.mDrawAngles.length != entryCount) {
            this.mDrawAngles = new float[entryCount];
        } else {
            for (int i10 = 0; i10 < entryCount; i10++) {
                this.mDrawAngles[i10] = 0.0f;
            }
        }
        if (this.mAbsoluteAngles.length != entryCount) {
            this.mAbsoluteAngles = new float[entryCount];
        } else {
            for (int i11 = 0; i11 < entryCount; i11++) {
                this.mAbsoluteAngles[i11] = 0.0f;
            }
        }
        float yValueSum = ((PieData) this.mData).getYValueSum();
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        int i12 = 0;
        for (int i13 = 0; i13 < ((PieData) this.mData).getDataSetCount(); i13++) {
            IPieDataSet iPieDataSet = dataSets.get(i13);
            for (int i14 = 0; i14 < iPieDataSet.getEntryCount(); i14++) {
                this.mDrawAngles[i12] = calcAngle(Math.abs(iPieDataSet.getEntryForIndex(i14).getY()), yValueSum);
                if (i12 == 0) {
                    this.mAbsoluteAngles[i12] = this.mDrawAngles[i12];
                } else {
                    float[] fArr = this.mAbsoluteAngles;
                    fArr[i12] = fArr[i12 - 1] + this.mDrawAngles[i12];
                }
                i12++;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        calcAngles();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        MPPointF centerOffsets = getCenterOffsets();
        float selectionShift = ((PieData) this.mData).getDataSet().getSelectionShift();
        RectF rectF = this.mCircleBox;
        float f10 = centerOffsets.f43143x;
        float f11 = centerOffsets.f43144y;
        rectF.set((f10 - diameter) + selectionShift, (f11 - diameter) + selectionShift, (f10 + diameter) - selectionShift, (f11 + diameter) - selectionShift);
        MPPointF.recycleInstance(centerOffsets);
    }

    public float[] getAbsoluteAngles() {
        return this.mAbsoluteAngles;
    }

    public MPPointF getCenterCircleBox() {
        return MPPointF.getInstance(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public CharSequence getCenterText() {
        return this.mCenterText;
    }

    public MPPointF getCenterTextOffset() {
        MPPointF mPPointF = this.mCenterTextOffset;
        return MPPointF.getInstance(mPPointF.f43143x, mPPointF.f43144y);
    }

    public float getCenterTextRadiusPercent() {
        return this.mCenterTextRadiusPercent;
    }

    public RectF getCircleBox() {
        return this.mCircleBox;
    }

    public int getDataSetIndexForIndex(int i10) {
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        for (int i11 = 0; i11 < dataSets.size(); i11++) {
            if (dataSets.get(i11).getEntryForXValue(i10, Float.NaN) != null) {
                return i11;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.mDrawAngles;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f10) {
        float normalizedAngle = Utils.getNormalizedAngle(f10 - getRotationAngle());
        int i10 = 0;
        while (true) {
            float[] fArr = this.mAbsoluteAngles;
            if (i10 >= fArr.length) {
                return -1;
            }
            if (fArr[i10] > normalizedAngle) {
                return i10;
            }
            i10++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(Highlight highlight) {
        MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            holeRadius = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f10 = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int x10 = (int) highlight.getX();
        float f11 = this.mDrawAngles[x10] / 2.0f;
        double d10 = f10;
        float fCos = (float) ((Math.cos(Math.toRadians(((this.mAbsoluteAngles[x10] + rotationAngle) - f11) * this.mAnimator.getPhaseY())) * d10) + ((double) centerCircleBox.f43143x));
        float fSin = (float) ((d10 * Math.sin(Math.toRadians(((rotationAngle + this.mAbsoluteAngles[x10]) - f11) * this.mAnimator.getPhaseY()))) + ((double) centerCircleBox.f43144y));
        MPPointF.recycleInstance(centerCircleBox);
        return new float[]{fCos, fSin};
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new PieHighlighter(this);
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.mDrawEntryLabels;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public boolean needsHighlight(int i10) {
        if (!valuesToHighlight()) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i11 >= highlightArr.length) {
                return false;
            }
            if (((int) highlightArr[i11].getX()) == i10) {
                return true;
            }
            i11++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null && (dataRenderer instanceof PieChartRenderer)) {
            ((PieChartRenderer) dataRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mCenterText = "";
        } else {
            this.mCenterText = charSequence;
        }
    }

    public void setCenterTextColor(int i10) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setColor(i10);
    }

    public void setCenterTextOffset(float f10, float f11) {
        this.mCenterTextOffset.f43143x = Utils.convertDpToPixel(f10);
        this.mCenterTextOffset.f43144y = Utils.convertDpToPixel(f11);
    }

    public void setCenterTextRadiusPercent(float f10) {
        this.mCenterTextRadiusPercent = f10;
    }

    public void setCenterTextSize(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(Utils.convertDpToPixel(f10));
    }

    public void setCenterTextSizePixels(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(f10);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z10) {
        this.mDrawCenterText = z10;
    }

    public void setDrawEntryLabels(boolean z10) {
        this.mDrawEntryLabels = z10;
    }

    public void setDrawHoleEnabled(boolean z10) {
        this.mDrawHole = z10;
    }

    @Deprecated
    public void setDrawSliceText(boolean z10) {
        this.mDrawEntryLabels = z10;
    }

    public void setDrawSlicesUnderHole(boolean z10) {
        this.mDrawSlicesUnderHole = z10;
    }

    public void setEntryLabelColor(int i10) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setColor(i10);
    }

    public void setEntryLabelTextSize(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTextSize(Utils.convertDpToPixel(f10));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
    }

    public void setHoleColor(int i10) {
        ((PieChartRenderer) this.mRenderer).getPaintHole().setColor(i10);
    }

    public void setHoleRadius(float f10) {
        this.mHoleRadiusPercent = f10;
    }

    public void setMaxAngle(float f10) {
        if (f10 > 360.0f) {
            f10 = 360.0f;
        }
        if (f10 < 90.0f) {
            f10 = 90.0f;
        }
        this.mMaxAngle = f10;
    }

    public void setTransparentCircleAlpha(int i10) {
        ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle().setAlpha(i10);
    }

    public void setTransparentCircleColor(int i10) {
        Paint paintTransparentCircle = ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i10);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f10) {
        this.mTransparentCircleRadiusPercent = f10;
    }

    public void setUsePercentValues(boolean z10) {
        this.mUsePercentValues = z10;
    }
}
