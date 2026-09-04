package com.max.hbcommon.component.chart;

import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.PieRadarHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: HeyBoxRadarHighlighter.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends PieRadarHighlighter<HeyBoxRadarChart> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public d(HeyBoxRadarChart heyBoxRadarChart) {
        super(heyBoxRadarChart);
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    public Highlight getClosestHighlight(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.pn, new Class[]{Integer.TYPE, cls, cls}, Highlight.class);
        if (patchProxyResultProxy.isSupported) {
            return (Highlight) patchProxyResultProxy.result;
        }
        List<Highlight> highlightsAtIndex = getHighlightsAtIndex(i10);
        float fDistanceToCenter = ((HeyBoxRadarChart) this.mChart).distanceToCenter(f10, f11) / ((HeyBoxRadarChart) this.mChart).getFactor();
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
    /* JADX WARN: Type inference failed for: r6v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public List<Highlight> getHighlightsAtIndex(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.qn, new Class[]{Integer.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        this.mHighlightBuffer.clear();
        float phaseX = ((HeyBoxRadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((HeyBoxRadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((HeyBoxRadarChart) this.mChart).getSliceAngle();
        float factor = ((HeyBoxRadarChart) this.mChart).getFactor();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i11 = 0; i11 < ((RadarData) ((HeyBoxRadarChart) this.mChart).getData()).getDataSetCount(); i11++) {
            IRadarDataSet dataSetByIndex = ((RadarData) ((HeyBoxRadarChart) this.mChart).getData()).getDataSetByIndex(i11);
            ?? entryForIndex = dataSetByIndex.getEntryForIndex(i10);
            float f10 = i10;
            Utils.getPosition(((HeyBoxRadarChart) this.mChart).getCenterOffsets(), (entryForIndex.getY() - ((HeyBoxRadarChart) this.mChart).getYChartMin()) * factor * phaseY, (sliceAngle * f10 * phaseX) + ((HeyBoxRadarChart) this.mChart).getRotationAngle(), mPPointF);
            this.mHighlightBuffer.add(new Highlight(f10, entryForIndex.getY(), mPPointF.f43143x, mPPointF.f43144y, i11, dataSetByIndex.getAxisDependency()));
        }
        return this.mHighlightBuffer;
    }
}
