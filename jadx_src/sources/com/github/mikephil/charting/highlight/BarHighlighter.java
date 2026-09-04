package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointD;

/* JADX INFO: loaded from: classes6.dex */
public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    protected int getClosestStackIndex(Range[] rangeArr, float f10) {
        if (rangeArr == null || rangeArr.length == 0) {
            return 0;
        }
        int i10 = 0;
        for (Range range : rangeArr) {
            if (range.contains(f10)) {
                return i10;
            }
            i10++;
        }
        int iMax = Math.max(rangeArr.length - 1, 0);
        if (f10 > rangeArr[iMax].to) {
            return iMax;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected BarLineScatterCandleBubbleData getData() {
        return ((BarDataProvider) this.mChart).getBarData();
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float f10, float f11, float f12, float f13) {
        return Math.abs(f10 - f12);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f10, float f11) {
        Highlight highlight = super.getHighlight(f10, f11);
        if (highlight == null) {
            return null;
        }
        MPPointD valsForTouch = getValsForTouch(f10, f11);
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlight, iBarDataSet, (float) valsForTouch.f43141x, (float) valsForTouch.f43142y);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Highlight getStackedHighlight(Highlight highlight, IBarDataSet iBarDataSet, float f10, float f11) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(f10, f11);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return highlight;
        }
        Range[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int closestStackIndex = getClosestStackIndex(ranges, f11);
        MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).getPixelForValues(highlight.getX(), ranges[closestStackIndex].to);
        Highlight highlight2 = new Highlight(barEntry.getX(), barEntry.getY(), (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, highlight.getDataSetIndex(), closestStackIndex, highlight.getAxis());
        MPPointD.recycleInstance(pixelForValues);
        return highlight2;
    }
}
