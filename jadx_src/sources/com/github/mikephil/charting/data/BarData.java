package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BarData extends BarLineScatterCandleBubbleData<IBarDataSet> {
    private float mBarWidth;

    public BarData() {
        this.mBarWidth = 0.85f;
    }

    public BarData(List<IBarDataSet> list) {
        super(list);
        this.mBarWidth = 0.85f;
    }

    public BarData(IBarDataSet... iBarDataSetArr) {
        super(iBarDataSetArr);
        this.mBarWidth = 0.85f;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public float getGroupWidth(float f10, float f11) {
        return (this.mDataSets.size() * (this.mBarWidth + f11)) + f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void groupBars(float f10, float f11, float f12) {
        BarEntry barEntry;
        if (this.mDataSets.size() <= 1) {
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int entryCount = ((IBarDataSet) getMaxEntryCountSet()).getEntryCount();
        float f13 = f11 / 2.0f;
        float f14 = f12 / 2.0f;
        float f15 = this.mBarWidth / 2.0f;
        float groupWidth = getGroupWidth(f11, f12);
        for (int i10 = 0; i10 < entryCount; i10++) {
            float f16 = f10 + f13;
            for (T t10 : this.mDataSets) {
                float f17 = f16 + f14 + f15;
                if (i10 < t10.getEntryCount() && (barEntry = (BarEntry) t10.getEntryForIndex(i10)) != null) {
                    barEntry.setX(f17);
                }
                f16 = f17 + f15 + f14;
            }
            float f18 = f16 + f13;
            float f19 = groupWidth - (f18 - f10);
            if (f19 > 0.0f || f19 < 0.0f) {
                f18 += f19;
            }
            f10 = f18;
        }
        notifyDataChanged();
    }

    public void setBarWidth(float f10) {
        this.mBarWidth = f10;
    }
}
