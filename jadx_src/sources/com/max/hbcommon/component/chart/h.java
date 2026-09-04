package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: HeyBoxYAxisRendererRadarChart.java */
/* JADX INFO: loaded from: classes9.dex */
public class h extends YAxisRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HeyBoxRadarChart f67485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f67486b;

    public h(ViewPortHandler viewPortHandler, YAxis yAxis, HeyBoxRadarChart heyBoxRadarChart) {
        super(viewPortHandler, yAxis, null);
        this.f67486b = new Path();
        this.f67485a = heyBoxRadarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f10, float f11) {
        ?? r10;
        float f12 = f10;
        Object[] objArr = {new Float(f12), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Jn, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f11 - f12);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(dRoundToNextSignificant2 * 10.0d);
        }
        boolean zIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f13 = ((float) dAbs) / (labelCount - 1);
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i10 = 0; i10 < labelCount; i10++) {
                this.mAxis.mEntries[i10] = f12;
                f12 += f13;
            }
        } else {
            double dCeil = dRoundToNextSignificant == 0.0d ? 0.0d : Math.ceil(((double) f12) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (zIsCenterAxisLabelsEnabled) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f11) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (dRoundToNextSignificant != 0.0d) {
                double d10 = dCeil;
                r10 = zIsCenterAxisLabelsEnabled;
                while (d10 <= dNextUp) {
                    d10 += dRoundToNextSignificant;
                    r10 = (r10 == true ? 1 : 0) + 1;
                }
            } else {
                r10 = zIsCenterAxisLabelsEnabled;
            }
            labelCount = r10 + 1;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = labelCount;
            if (axisBase3.mEntries.length < labelCount) {
                axisBase3.mEntries = new float[labelCount];
            }
            for (int i11 = 0; i11 < labelCount; i11++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i11] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
        }
        if (dRoundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (zIsCenterAxisLabelsEnabled) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float[] fArr = axisBase4.mEntries;
            float f14 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i12 = 0; i12 < labelCount; i12++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i12] = axisBase5.mEntries[i12] + f14;
            }
        }
        AxisBase axisBase6 = this.mAxis;
        float[] fArr2 = axisBase6.mEntries;
        float f15 = fArr2[0];
        axisBase6.mAxisMinimum = f15;
        float f16 = fArr2[labelCount - 1];
        axisBase6.mAxisMaximum = f16;
        axisBase6.mAxisRange = Math.abs(f16 - f15);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Kn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            MPPointF centerOffsets = this.f67485a.getCenterOffsets();
            MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
            float factor = this.f67485a.getFactor();
            int i10 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            for (int i11 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i11 < i10; i11++) {
                YAxis yAxis = this.mYAxis;
                Utils.getPosition(centerOffsets, (yAxis.mEntries[i11] - yAxis.mAxisMinimum) * factor, this.f67485a.getRotationAngle(), mPPointF);
                canvas.drawText(this.mYAxis.getFormattedLabel(i11), mPPointF.f43143x + 10.0f, mPPointF.f43144y, this.mAxisLabelPaint);
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Ln, new Class[]{Canvas.class}, Void.TYPE).isSupported || (limitLines = this.mYAxis.getLimitLines()) == null) {
            return;
        }
        float sliceAngle = this.f67485a.getSliceAngle();
        float factor = this.f67485a.getFactor();
        MPPointF centerOffsets = this.f67485a.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i10 = 0; i10 < limitLines.size(); i10++) {
            LimitLine limitLine = limitLines.get(i10);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                float limit = (limitLine.getLimit() - this.f67485a.getYChartMin()) * factor;
                Path path = this.f67486b;
                path.reset();
                for (int i11 = 0; i11 < ((RadarData) this.f67485a.getData()).getMaxEntryCountSet().getEntryCount(); i11++) {
                    Utils.getPosition(centerOffsets, limit, (i11 * sliceAngle) + this.f67485a.getRotationAngle(), mPPointF);
                    if (i11 == 0) {
                        path.moveTo(mPPointF.f43143x, mPPointF.f43144y);
                    } else {
                        path.lineTo(mPPointF.f43143x, mPPointF.f43144y);
                    }
                }
                path.close();
                canvas.drawPath(path, this.mLimitLinePaint);
            }
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }
}
