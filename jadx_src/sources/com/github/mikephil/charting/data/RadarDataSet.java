package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RadarDataSet extends LineRadarDataSet<RadarEntry> implements IRadarDataSet {
    protected boolean mDrawHighlightCircleEnabled;
    protected int mHighlightCircleFillColor;
    protected float mHighlightCircleInnerRadius;
    protected float mHighlightCircleOuterRadius;
    protected int mHighlightCircleStrokeAlpha;
    protected int mHighlightCircleStrokeColor;
    protected float mHighlightCircleStrokeWidth;

    public RadarDataSet(List<RadarEntry> list, String str) {
        super(list, str);
        this.mDrawHighlightCircleEnabled = false;
        this.mHighlightCircleFillColor = -1;
        this.mHighlightCircleStrokeColor = ColorTemplate.COLOR_NONE;
        this.mHighlightCircleStrokeAlpha = 76;
        this.mHighlightCircleInnerRadius = 3.0f;
        this.mHighlightCircleOuterRadius = 4.0f;
        this.mHighlightCircleStrokeWidth = 2.0f;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<RadarEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.mValues.size(); i10++) {
            arrayList.add(((RadarEntry) this.mValues.get(i10)).copy());
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList, getLabel());
        radarDataSet.mColors = this.mColors;
        radarDataSet.mHighLightColor = this.mHighLightColor;
        return radarDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleFillColor() {
        return this.mHighlightCircleFillColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleInnerRadius() {
        return this.mHighlightCircleInnerRadius;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleOuterRadius() {
        return this.mHighlightCircleOuterRadius;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeAlpha() {
        return this.mHighlightCircleStrokeAlpha;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeColor() {
        return this.mHighlightCircleStrokeColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleStrokeWidth() {
        return this.mHighlightCircleStrokeWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public boolean isDrawHighlightCircleEnabled() {
        return this.mDrawHighlightCircleEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public void setDrawHighlightCircleEnabled(boolean z10) {
        this.mDrawHighlightCircleEnabled = z10;
    }

    public void setHighlightCircleFillColor(int i10) {
        this.mHighlightCircleFillColor = i10;
    }

    public void setHighlightCircleInnerRadius(float f10) {
        this.mHighlightCircleInnerRadius = f10;
    }

    public void setHighlightCircleOuterRadius(float f10) {
        this.mHighlightCircleOuterRadius = f10;
    }

    public void setHighlightCircleStrokeAlpha(int i10) {
        this.mHighlightCircleStrokeAlpha = i10;
    }

    public void setHighlightCircleStrokeColor(int i10) {
        this.mHighlightCircleStrokeColor = i10;
    }

    public void setHighlightCircleStrokeWidth(float f10) {
        this.mHighlightCircleStrokeWidth = f10;
    }
}
