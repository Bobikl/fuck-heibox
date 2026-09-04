package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class HorizontalBarHighlighter extends BarHighlighter {
    public HorizontalBarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected List<Highlight> buildHighlights(IDataSet iDataSet, int i10, float f10, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f10);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f10, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() == 0) {
            return arrayList;
        }
        for (Entry entry : entriesForXValue) {
            MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getY(), entry.getX());
            arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, i10, iDataSet.getAxisDependency()));
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float f10, float f11, float f12, float f13) {
        return Math.abs(f11 - f13);
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f10, float f11) {
        BarData barData = ((BarDataProvider) this.mChart).getBarData();
        MPPointD valsForTouch = getValsForTouch(f11, f10);
        Highlight highlightForX = getHighlightForX((float) valsForTouch.f43142y, f11, f10);
        if (highlightForX == null) {
            return null;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlightForX.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlightForX, iBarDataSet, (float) valsForTouch.f43142y, (float) valsForTouch.f43141x);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlightForX;
    }
}
