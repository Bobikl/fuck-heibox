package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CombinedHighlighter extends ChartHighlighter<CombinedDataProvider> implements IHighlighter {
    protected BarHighlighter barHighlighter;

    public CombinedHighlighter(CombinedDataProvider combinedDataProvider, BarDataProvider barDataProvider) {
        super(combinedDataProvider);
        this.barHighlighter = barDataProvider.getBarData() == null ? null : new BarHighlighter(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected List<Highlight> getHighlightsAtXValue(float f10, float f11, float f12) {
        this.mHighlightBuffer.clear();
        List<BarLineScatterCandleBubbleData> allData = ((CombinedDataProvider) this.mChart).getCombinedData().getAllData();
        for (int i10 = 0; i10 < allData.size(); i10++) {
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = allData.get(i10);
            BarHighlighter barHighlighter = this.barHighlighter;
            if (barHighlighter == null || !(barLineScatterCandleBubbleData instanceof BarData)) {
                int dataSetCount = barLineScatterCandleBubbleData.getDataSetCount();
                for (int i11 = 0; i11 < dataSetCount; i11++) {
                    IDataSet dataSetByIndex = allData.get(i10).getDataSetByIndex(i11);
                    if (dataSetByIndex.isHighlightEnabled()) {
                        for (Highlight highlight : buildHighlights(dataSetByIndex, i11, f10, DataSet.Rounding.CLOSEST)) {
                            highlight.setDataIndex(i10);
                            this.mHighlightBuffer.add(highlight);
                        }
                    }
                }
            } else {
                Highlight highlight2 = barHighlighter.getHighlight(f11, f12);
                if (highlight2 != null) {
                    highlight2.setDataIndex(i10);
                    this.mHighlightBuffer.add(highlight2);
                }
            }
        }
        return this.mHighlightBuffer;
    }
}
