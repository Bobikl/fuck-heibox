package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> implements IHighlighter {
    protected T mChart;
    protected List<Highlight> mHighlightBuffer = new ArrayList();

    public ChartHighlighter(T t10) {
        this.mChart = t10;
    }

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
            MPPointD pixelForValues = this.mChart.getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
            arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, i10, iDataSet.getAxisDependency()));
        }
        return arrayList;
    }

    public Highlight getClosestHighlightByPixel(List<Highlight> list, float f10, float f11, YAxis.AxisDependency axisDependency, float f12) {
        Highlight highlight = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Highlight highlight2 = list.get(i10);
            if (axisDependency == null || highlight2.getAxis() == axisDependency) {
                float distance = getDistance(f10, f11, highlight2.getXPx(), highlight2.getYPx());
                if (distance < f12) {
                    highlight = highlight2;
                    f12 = distance;
                }
            }
        }
        return highlight;
    }

    protected BarLineScatterCandleBubbleData getData() {
        return this.mChart.getData();
    }

    protected float getDistance(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f10 - f12, f11 - f13);
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f10, float f11) {
        MPPointD valsForTouch = getValsForTouch(f10, f11);
        float f12 = (float) valsForTouch.f43141x;
        MPPointD.recycleInstance(valsForTouch);
        return getHighlightForX(f12, f10, f11);
    }

    protected Highlight getHighlightForX(float f10, float f11, float f12) {
        List<Highlight> highlightsAtXValue = getHighlightsAtXValue(f10, f11, f12);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float minimumDistance = getMinimumDistance(highlightsAtXValue, f12, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return getClosestHighlightByPixel(highlightsAtXValue, f11, f12, minimumDistance < getMinimumDistance(highlightsAtXValue, f12, axisDependency2) ? axisDependency : axisDependency2, this.mChart.getMaxHighlightDistance());
    }

    protected float getHighlightPos(Highlight highlight) {
        return highlight.getYPx();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    protected List<Highlight> getHighlightsAtXValue(float f10, float f11, float f12) {
        this.mHighlightBuffer.clear();
        BarLineScatterCandleBubbleData data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i10 = 0; i10 < dataSetCount; i10++) {
            ?? dataSetByIndex = data.getDataSetByIndex(i10);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i10, f10, DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    protected float getMinimumDistance(List<Highlight> list, float f10, YAxis.AxisDependency axisDependency) {
        float f11 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Highlight highlight = list.get(i10);
            if (highlight.getAxis() == axisDependency) {
                float fAbs = Math.abs(getHighlightPos(highlight) - f10);
                if (fAbs < f11) {
                    f11 = fAbs;
                }
            }
        }
        return f11;
    }

    protected MPPointD getValsForTouch(float f10, float f11) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f10, f11);
    }
}
