package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class XAxisRendererRadarChart extends XAxisRenderer {
    private RadarChart mChart;

    public XAxisRendererRadarChart(ViewPortHandler viewPortHandler, XAxis xAxis, RadarChart radarChart) {
        super(viewPortHandler, xAxis, null);
        this.mChart = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
            MPPointF mPPointF = MPPointF.getInstance(0.5f, 0.25f);
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            float sliceAngle = this.mChart.getSliceAngle();
            float factor = this.mChart.getFactor();
            MPPointF centerOffsets = this.mChart.getCenterOffsets();
            MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
            for (int i10 = 0; i10 < ((RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount(); i10++) {
                float f10 = i10;
                String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(f10, this.mXAxis);
                Utils.getPosition(centerOffsets, (this.mChart.getYRange() * factor) + (this.mXAxis.mLabelRotatedWidth / 2.0f), ((f10 * sliceAngle) + this.mChart.getRotationAngle()) % 360.0f, mPPointF2);
                drawLabel(canvas, formattedValue, mPPointF2.f43143x, mPPointF2.f43144y - (this.mXAxis.mLabelRotatedHeight / 2.0f), mPPointF, labelRotationAngle);
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(mPPointF2);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
    }
}
