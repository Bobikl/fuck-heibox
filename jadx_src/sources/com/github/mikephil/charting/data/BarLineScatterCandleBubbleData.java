package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BarLineScatterCandleBubbleData<T extends IBarLineScatterCandleBubbleDataSet<? extends Entry>> extends ChartData<T> {
    public BarLineScatterCandleBubbleData() {
    }

    public BarLineScatterCandleBubbleData(List<T> list) {
        super(list);
    }

    public BarLineScatterCandleBubbleData(T... tArr) {
        super(tArr);
    }
}
