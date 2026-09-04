package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RadarHighlighter extends PieRadarHighlighter<RadarChart> {
    public RadarHighlighter(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected Highlight getClosestHighlight(int i10, float f10, float f11) {
        List<Highlight> highlightsAtIndex = getHighlightsAtIndex(i10);
        float fDistanceToCenter = ((RadarChart) this.mChart).distanceToCenter(f10, f11) / ((RadarChart) this.mChart).getFactor();
        Highlight highlight = null;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < highlightsAtIndex.size(); i11++) {
            Highlight highlight2 = highlightsAtIndex.get(i11);
            float fAbs = Math.abs(highlight2.getY() - fDistanceToCenter);
            if (fAbs < f12) {
                highlight = highlight2;
                f12 = fAbs;
            }
        }
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected List<Highlight> getHighlightsAtIndex(int i10) {
        this.mHighlightBuffer.clear();
        float phaseX = ((RadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((RadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((RadarChart) this.mChart).getSliceAngle();
        float factor = ((RadarChart) this.mChart).getFactor();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i11 = 0; i11 < ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetCount(); i11++) {
            IRadarDataSet dataSetByIndex = ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetByIndex(i11);
            ?? entryForIndex = dataSetByIndex.getEntryForIndex(i10);
            float f10 = i10;
            Utils.getPosition(((RadarChart) this.mChart).getCenterOffsets(), (entryForIndex.getY() - ((RadarChart) this.mChart).getYChartMin()) * factor * phaseY, (sliceAngle * f10 * phaseX) + ((RadarChart) this.mChart).getRotationAngle(), mPPointF);
            this.mHighlightBuffer.add(new Highlight(f10, entryForIndex.getY(), mPPointF.f43143x, mPPointF.f43144y, i11, dataSetByIndex.getAxisDependency()));
        }
        return this.mHighlightBuffer;
    }
}
