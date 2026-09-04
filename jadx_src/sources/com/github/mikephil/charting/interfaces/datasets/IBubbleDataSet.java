package com.github.mikephil.charting.interfaces.datasets;

import com.github.mikephil.charting.data.BubbleEntry;

/* JADX INFO: loaded from: classes6.dex */
public interface IBubbleDataSet extends IBarLineScatterCandleBubbleDataSet<BubbleEntry> {
    float getHighlightCircleWidth();

    float getMaxSize();

    boolean isNormalizeSizeEnabled();

    void setHighlightCircleWidth(float f10);
}
