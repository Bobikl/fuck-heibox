package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;

/* JADX INFO: loaded from: classes6.dex */
public class PieHighlighter extends PieRadarHighlighter<PieChart> {
    public PieHighlighter(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected Highlight getClosestHighlight(int i10, float f10, float f11) {
        IPieDataSet dataSet = ((PieData) ((PieChart) this.mChart).getData()).getDataSet();
        return new Highlight(i10, dataSet.getEntryForIndex(i10).getY(), f10, f11, 0, dataSet.getAxisDependency());
    }
}
