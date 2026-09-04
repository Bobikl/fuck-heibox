package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes6.dex */
public interface ILineRadarDataSet<T extends Entry> extends ILineScatterCandleRadarDataSet<T> {
    int getFillAlpha();

    int getFillColor();

    Drawable getFillDrawable();

    float getLineWidth();

    boolean isDrawFilledEnabled();

    void setDrawFilled(boolean z10);
}
