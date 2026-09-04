package com.max.hbcommon.component.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class HeyBoxRadarChart extends PieRadarChartBase<RadarData> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f67438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f67439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private YAxis f67445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected h f67446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected f f67447k;

    public HeyBoxRadarChart(Context context) {
        super(context);
        this.f67438b = 2.0f;
        this.f67439c = 1.0f;
        this.f67440d = 1301189528;
        this.f67441e = 1301189528;
        this.f67442f = 77;
        this.f67443g = true;
        this.f67444h = 0;
    }

    public HeyBoxRadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67438b = 2.0f;
        this.f67439c = 1.0f;
        this.f67440d = 1301189528;
        this.f67441e = 1301189528;
        this.f67442f = 77;
        this.f67443g = true;
        this.f67444h = 0;
    }

    public HeyBoxRadarChart(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67438b = 2.0f;
        this.f67439c = 1.0f;
        this.f67440d = 1301189528;
        this.f67441e = 1301189528;
        this.f67442f = 77;
        this.f67443g = true;
        this.f67444h = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.calcMinMax();
        YAxis yAxis = this.f67445i;
        RadarData radarData = (RadarData) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(radarData.getYMin(axisDependency), ((RadarData) this.mData).getYMax(axisDependency));
        this.mXAxis.calculate(0.0f, ((RadarData) this.mData).getMaxEntryCountSet().getEntryCount());
    }

    public float getFactor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ym, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        RectF contentRect = this.mViewPortHandler.getContentRect();
        return Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f) / this.f67445i.mAxisRange;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.an, new Class[]{Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        float normalizedAngle = Utils.getNormalizedAngle(f10 - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int entryCount = ((RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
        int i10 = 0;
        while (i10 < entryCount) {
            int i11 = i10 + 1;
            if ((i11 * sliceAngle) - (sliceAngle / 2.0f) > normalizedAngle) {
                return i10;
            }
            i10 = i11;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.gn, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        RectF contentRect = this.mViewPortHandler.getContentRect();
        return Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.fn, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) ? this.mXAxis.mLabelRotatedWidth : Utils.convertDpToPixel(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.en, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.mLegendRenderer.getLabelPaint().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f67444h;
    }

    public float getSliceAngle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Zm, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : 360.0f / ((RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
    }

    public int getWebAlpha() {
        return this.f67442f;
    }

    public int getWebColor() {
        return this.f67440d;
    }

    public int getWebColorInner() {
        return this.f67441e;
    }

    public float getWebLineWidth() {
        return this.f67438b;
    }

    public float getWebLineWidthInner() {
        return this.f67439c;
    }

    public f getXAxisRenderer() {
        return this.f67447k;
    }

    public YAxis getYAxis() {
        return this.f67445i;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.f67445i.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.f67445i.mAxisMinimum;
    }

    public float getYRange() {
        return this.f67445i.mAxisRange;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Um, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.init();
        this.f67445i = new YAxis(YAxis.AxisDependency.LEFT);
        this.f67438b = Utils.convertDpToPixel(0.5f);
        this.f67439c = Utils.convertDpToPixel(1.0f);
        this.mRenderer = new c(this, this.mAnimator, this.mViewPortHandler);
        this.f67446j = new h(this.mViewPortHandler, this.f67445i, this);
        this.f67447k = new f(this.mViewPortHandler, this.mXAxis, this);
        this.mHighlighter = new d(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wm, new Class[0], Void.TYPE).isSupported || this.mData == 0) {
            return;
        }
        calcMinMax();
        h hVar = this.f67446j;
        YAxis yAxis = this.f67445i;
        hVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        f fVar = this.f67447k;
        XAxis xAxis = this.mXAxis;
        fVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        Legend legend = this.mLegend;
        if (legend != null && !legend.isLegendCustom()) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Xm, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        if (this.mXAxis.isEnabled()) {
            f fVar = this.f67447k;
            XAxis xAxis = this.mXAxis;
            fVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.f67447k.renderAxisLabels(canvas);
        if (this.f67443g) {
            this.mRenderer.drawExtras(canvas);
        }
        if (this.f67445i.isEnabled() && this.f67445i.isDrawLimitLinesBehindDataEnabled()) {
            this.f67446j.renderLimitLines(canvas);
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        if (this.f67445i.isEnabled() && !this.f67445i.isDrawLimitLinesBehindDataEnabled()) {
            this.f67446j.renderLimitLines(canvas);
        }
        this.f67446j.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setDrawWeb(boolean z10) {
        this.f67443g = z10;
    }

    public void setSkipWebLineCount(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.dn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67444h = Math.max(0, i10);
    }

    public void setWebAlpha(int i10) {
        this.f67442f = i10;
    }

    public void setWebColor(int i10) {
        this.f67440d = i10;
    }

    public void setWebColorInner(int i10) {
        this.f67441e = i10;
    }

    public void setWebLineWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.bn, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67438b = Utils.convertDpToPixel(f10);
    }

    public void setWebLineWidthInner(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.f31172cn, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67439c = Utils.convertDpToPixel(f10);
    }

    public void setXAxisRenderer(f fVar) {
        this.f67447k = fVar;
    }
}
