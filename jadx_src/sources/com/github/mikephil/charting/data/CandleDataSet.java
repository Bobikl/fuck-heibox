package com.github.mikephil.charting.data;

import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CandleDataSet extends LineScatterCandleRadarDataSet<CandleEntry> implements ICandleDataSet {
    private float mBarSpace;
    protected int mDecreasingColor;
    protected Paint.Style mDecreasingPaintStyle;
    protected int mIncreasingColor;
    protected Paint.Style mIncreasingPaintStyle;
    protected int mNeutralColor;
    protected int mShadowColor;
    private boolean mShadowColorSameAsCandle;
    private float mShadowWidth;
    private boolean mShowCandleBar;

    public CandleDataSet(List<CandleEntry> list, String str) {
        super(list, str);
        this.mShadowWidth = 3.0f;
        this.mShowCandleBar = true;
        this.mBarSpace = 0.1f;
        this.mShadowColorSameAsCandle = false;
        this.mIncreasingPaintStyle = Paint.Style.STROKE;
        this.mDecreasingPaintStyle = Paint.Style.FILL;
        this.mNeutralColor = ColorTemplate.COLOR_SKIP;
        this.mIncreasingColor = ColorTemplate.COLOR_SKIP;
        this.mDecreasingColor = ColorTemplate.COLOR_SKIP;
        this.mShadowColor = ColorTemplate.COLOR_SKIP;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(CandleEntry candleEntry) {
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        calcMinMaxX(candleEntry);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMaxY(CandleEntry candleEntry) {
        if (candleEntry.getHigh() < this.mYMin) {
            this.mYMin = candleEntry.getHigh();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getLow() > this.mYMax) {
            this.mYMax = candleEntry.getLow();
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<CandleEntry> copy() {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < this.mValues.size(); i10++) {
            arrayList.add(((CandleEntry) this.mValues.get(i10)).copy());
        }
        CandleDataSet candleDataSet = new CandleDataSet(arrayList, getLabel());
        candleDataSet.mColors = this.mColors;
        candleDataSet.mShadowWidth = this.mShadowWidth;
        candleDataSet.mShowCandleBar = this.mShowCandleBar;
        candleDataSet.mBarSpace = this.mBarSpace;
        candleDataSet.mHighLightColor = this.mHighLightColor;
        candleDataSet.mIncreasingPaintStyle = this.mIncreasingPaintStyle;
        candleDataSet.mDecreasingPaintStyle = this.mDecreasingPaintStyle;
        candleDataSet.mShadowColor = this.mShadowColor;
        return candleDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getBarSpace() {
        return this.mBarSpace;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getDecreasingColor() {
        return this.mDecreasingColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public Paint.Style getDecreasingPaintStyle() {
        return this.mDecreasingPaintStyle;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getIncreasingColor() {
        return this.mIncreasingColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public Paint.Style getIncreasingPaintStyle() {
        return this.mIncreasingPaintStyle;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getNeutralColor() {
        return this.mNeutralColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getShadowColor() {
        return this.mShadowColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShadowColorSameAsCandle() {
        return this.mShadowColorSameAsCandle;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getShadowWidth() {
        return this.mShadowWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShowCandleBar() {
        return this.mShowCandleBar;
    }

    public void setBarSpace(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 0.45f) {
            f10 = 0.45f;
        }
        this.mBarSpace = f10;
    }

    public void setDecreasingColor(int i10) {
        this.mDecreasingColor = i10;
    }

    public void setDecreasingPaintStyle(Paint.Style style) {
        this.mDecreasingPaintStyle = style;
    }

    public void setIncreasingColor(int i10) {
        this.mIncreasingColor = i10;
    }

    public void setIncreasingPaintStyle(Paint.Style style) {
        this.mIncreasingPaintStyle = style;
    }

    public void setNeutralColor(int i10) {
        this.mNeutralColor = i10;
    }

    public void setShadowColor(int i10) {
        this.mShadowColor = i10;
    }

    public void setShadowColorSameAsCandle(boolean z10) {
        this.mShadowColorSameAsCandle = z10;
    }

    public void setShadowWidth(float f10) {
        this.mShadowWidth = Utils.convertDpToPixel(f10);
    }

    public void setShowCandleBar(boolean z10) {
        this.mShowCandleBar = z10;
    }
}
