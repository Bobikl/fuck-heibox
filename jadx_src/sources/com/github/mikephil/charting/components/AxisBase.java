package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AxisBase extends ComponentBase {
    protected IAxisValueFormatter mAxisValueFormatter;
    public int mDecimals;
    public int mEntryCount;
    protected List<LimitLine> mLimitLines;
    private int mGridColor = -7829368;
    private float mGridLineWidth = 1.0f;
    private int mAxisLineColor = -7829368;
    private float mAxisLineWidth = 1.0f;
    public float[] mEntries = new float[0];
    public float[] mCenteredEntries = new float[0];
    private int mLabelCount = 6;
    protected float mGranularity = 1.0f;
    protected boolean mGranularityEnabled = false;
    protected boolean mForceLabels = false;
    protected boolean mDrawGridLines = true;
    protected boolean mDrawAxisLine = true;
    protected boolean mDrawLabels = true;
    protected boolean mCenterAxisLabels = false;
    private DashPathEffect mAxisLineDashPathEffect = null;
    private DashPathEffect mGridDashPathEffect = null;
    protected boolean mDrawLimitLineBehindData = false;
    protected float mSpaceMin = 0.0f;
    protected float mSpaceMax = 0.0f;
    protected boolean mCustomAxisMin = false;
    protected boolean mCustomAxisMax = false;
    public float mAxisMaximum = 0.0f;
    public float mAxisMinimum = 0.0f;
    public float mAxisRange = 0.0f;

    public AxisBase() {
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(5.0f);
        this.mLimitLines = new ArrayList();
    }

    public void addLimitLine(LimitLine limitLine) {
        this.mLimitLines.add(limitLine);
        if (this.mLimitLines.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void calculate(float f10, float f11) {
        float f12 = this.mCustomAxisMin ? this.mAxisMinimum : f10 - this.mSpaceMin;
        float f13 = this.mCustomAxisMax ? this.mAxisMaximum : f11 + this.mSpaceMax;
        if (Math.abs(f13 - f12) == 0.0f) {
            f13 += 1.0f;
            f12 -= 1.0f;
        }
        this.mAxisMinimum = f12;
        this.mAxisMaximum = f13;
        this.mAxisRange = Math.abs(f13 - f12);
    }

    public void disableAxisLineDashedLine() {
        this.mAxisLineDashPathEffect = null;
    }

    public void disableGridDashedLine() {
        this.mGridDashPathEffect = null;
    }

    public void enableAxisLineDashedLine(float f10, float f11, float f12) {
        this.mAxisLineDashPathEffect = new DashPathEffect(new float[]{f10, f11}, f12);
    }

    public void enableGridDashedLine(float f10, float f11, float f12) {
        this.mGridDashPathEffect = new DashPathEffect(new float[]{f10, f11}, f12);
    }

    public int getAxisLineColor() {
        return this.mAxisLineColor;
    }

    public DashPathEffect getAxisLineDashPathEffect() {
        return this.mAxisLineDashPathEffect;
    }

    public float getAxisLineWidth() {
        return this.mAxisLineWidth;
    }

    public float getAxisMaximum() {
        return this.mAxisMaximum;
    }

    public float getAxisMinimum() {
        return this.mAxisMinimum;
    }

    public String getFormattedLabel(int i10) {
        return (i10 < 0 || i10 >= this.mEntries.length) ? "" : getValueFormatter().getFormattedValue(this.mEntries[i10], this);
    }

    public float getGranularity() {
        return this.mGranularity;
    }

    public int getGridColor() {
        return this.mGridColor;
    }

    public DashPathEffect getGridDashPathEffect() {
        return this.mGridDashPathEffect;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public int getLabelCount() {
        return this.mLabelCount;
    }

    public List<LimitLine> getLimitLines() {
        return this.mLimitLines;
    }

    public String getLongestLabel() {
        String str = "";
        for (int i10 = 0; i10 < this.mEntries.length; i10++) {
            String formattedLabel = getFormattedLabel(i10);
            if (formattedLabel != null && str.length() < formattedLabel.length()) {
                str = formattedLabel;
            }
        }
        return str;
    }

    public float getSpaceMax() {
        return this.mSpaceMax;
    }

    public float getSpaceMin() {
        return this.mSpaceMin;
    }

    public IAxisValueFormatter getValueFormatter() {
        IAxisValueFormatter iAxisValueFormatter = this.mAxisValueFormatter;
        if (iAxisValueFormatter == null || ((iAxisValueFormatter instanceof DefaultAxisValueFormatter) && ((DefaultAxisValueFormatter) iAxisValueFormatter).getDecimalDigits() != this.mDecimals)) {
            this.mAxisValueFormatter = new DefaultAxisValueFormatter(this.mDecimals);
        }
        return this.mAxisValueFormatter;
    }

    public boolean isAxisLineDashedLineEnabled() {
        return this.mAxisLineDashPathEffect != null;
    }

    public boolean isAxisMaxCustom() {
        return this.mCustomAxisMax;
    }

    public boolean isAxisMinCustom() {
        return this.mCustomAxisMin;
    }

    public boolean isCenterAxisLabelsEnabled() {
        return this.mCenterAxisLabels && this.mEntryCount > 0;
    }

    public boolean isDrawAxisLineEnabled() {
        return this.mDrawAxisLine;
    }

    public boolean isDrawGridLinesEnabled() {
        return this.mDrawGridLines;
    }

    public boolean isDrawLabelsEnabled() {
        return this.mDrawLabels;
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
        return this.mDrawLimitLineBehindData;
    }

    public boolean isForceLabelsEnabled() {
        return this.mForceLabels;
    }

    public boolean isGranularityEnabled() {
        return this.mGranularityEnabled;
    }

    public boolean isGridDashedLineEnabled() {
        return this.mGridDashPathEffect != null;
    }

    public void removeAllLimitLines() {
        this.mLimitLines.clear();
    }

    public void removeLimitLine(LimitLine limitLine) {
        this.mLimitLines.remove(limitLine);
    }

    public void resetAxisMaximum() {
        this.mCustomAxisMax = false;
    }

    public void resetAxisMinimum() {
        this.mCustomAxisMin = false;
    }

    public void setAxisLineColor(int i10) {
        this.mAxisLineColor = i10;
    }

    public void setAxisLineDashedLine(DashPathEffect dashPathEffect) {
        this.mAxisLineDashPathEffect = dashPathEffect;
    }

    public void setAxisLineWidth(float f10) {
        this.mAxisLineWidth = Utils.convertDpToPixel(f10);
    }

    @Deprecated
    public void setAxisMaxValue(float f10) {
        setAxisMaximum(f10);
    }

    public void setAxisMaximum(float f10) {
        this.mCustomAxisMax = true;
        this.mAxisMaximum = f10;
        this.mAxisRange = Math.abs(f10 - this.mAxisMinimum);
    }

    @Deprecated
    public void setAxisMinValue(float f10) {
        setAxisMinimum(f10);
    }

    public void setAxisMinimum(float f10) {
        this.mCustomAxisMin = true;
        this.mAxisMinimum = f10;
        this.mAxisRange = Math.abs(this.mAxisMaximum - f10);
    }

    public void setCenterAxisLabels(boolean z10) {
        this.mCenterAxisLabels = z10;
    }

    public void setDrawAxisLine(boolean z10) {
        this.mDrawAxisLine = z10;
    }

    public void setDrawGridLines(boolean z10) {
        this.mDrawGridLines = z10;
    }

    public void setDrawLabels(boolean z10) {
        this.mDrawLabels = z10;
    }

    public void setDrawLimitLinesBehindData(boolean z10) {
        this.mDrawLimitLineBehindData = z10;
    }

    public void setGranularity(float f10) {
        this.mGranularity = f10;
        this.mGranularityEnabled = true;
    }

    public void setGranularityEnabled(boolean z10) {
        this.mGranularityEnabled = z10;
    }

    public void setGridColor(int i10) {
        this.mGridColor = i10;
    }

    public void setGridDashedLine(DashPathEffect dashPathEffect) {
        this.mGridDashPathEffect = dashPathEffect;
    }

    public void setGridLineWidth(float f10) {
        this.mGridLineWidth = Utils.convertDpToPixel(f10);
    }

    public void setLabelCount(int i10) {
        if (i10 > 25) {
            i10 = 25;
        }
        if (i10 < 2) {
            i10 = 2;
        }
        this.mLabelCount = i10;
        this.mForceLabels = false;
    }

    public void setLabelCount(int i10, boolean z10) {
        setLabelCount(i10);
        this.mForceLabels = z10;
    }

    public void setSpaceMax(float f10) {
        this.mSpaceMax = f10;
    }

    public void setSpaceMin(float f10) {
        this.mSpaceMin = f10;
    }

    public void setValueFormatter(IAxisValueFormatter iAxisValueFormatter) {
        if (iAxisValueFormatter == null) {
            this.mAxisValueFormatter = new DefaultAxisValueFormatter(this.mDecimals);
        } else {
            this.mAxisValueFormatter = iAxisValueFormatter;
        }
    }
}
