package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BubbleDataSet extends BarLineScatterCandleBubbleDataSet<BubbleEntry> implements IBubbleDataSet {
    private float mHighlightCircleWidth;
    protected float mMaxSize;
    protected boolean mNormalizeSize;

    public BubbleDataSet(List<BubbleEntry> list, String str) {
        super(list, str);
        this.mNormalizeSize = true;
        this.mHighlightCircleWidth = 2.5f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(BubbleEntry bubbleEntry) {
        super.calcMinMax(bubbleEntry);
        float size = bubbleEntry.getSize();
        if (size > this.mMaxSize) {
            this.mMaxSize = size;
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<BubbleEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.mValues.size(); i10++) {
            arrayList.add(((BubbleEntry) this.mValues.get(i10)).copy());
        }
        BubbleDataSet bubbleDataSet = new BubbleDataSet(arrayList, getLabel());
        bubbleDataSet.mColors = this.mColors;
        bubbleDataSet.mHighLightColor = this.mHighLightColor;
        return bubbleDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getHighlightCircleWidth() {
        return this.mHighlightCircleWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getMaxSize() {
        return this.mMaxSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public boolean isNormalizeSizeEnabled() {
        return this.mNormalizeSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public void setHighlightCircleWidth(float f10) {
        this.mHighlightCircleWidth = Utils.convertDpToPixel(f10);
    }

    public void setNormalizeSizeEnabled(boolean z10) {
        this.mNormalizeSize = z10;
    }
}
