package com.max.hbcommon.component.chart;

import android.content.Context;
import android.content.res.Resources;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbcommon.R;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ChartUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.hbcommon.component.chart.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChartUtils.java */
    public class C0541a implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0541a() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, bb.c.d.Mm, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n.g(f10);
        }
    }

    public static void a(LineChart lineChart, int i10, boolean z10, boolean z11) {
        Object[] objArr = {lineChart, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Lm, new Class[]{LineChart.class, Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = lineChart.getContext();
        b bVar = new b(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
        lineChart.setLayerType(1, null);
        bVar.f(true);
        lineChart.setRenderer(bVar);
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        YAxis axisLeft = lineChart.getAxisLeft();
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        g gVar = new g(viewPortHandler, axisLeft, lineChart.getTransformer(axisDependency));
        gVar.d(z10);
        gVar.c(z11);
        lineChart.setRendererLeftYAxis(gVar);
        lineChart.setXAxisRenderer(new e(lineChart.getViewPortHandler(), lineChart.getXAxis(), lineChart.getTransformer(axisDependency)));
        lineChart.setExtraBottomOffset(10.0f);
        lineChart.setBackgroundColor(context.getResources().getColor(R.color.background_layer_2_color));
        lineChart.setDragEnabled(false);
        lineChart.setScaleEnabled(false);
        lineChart.setDescription(null);
        lineChart.getLegend().setEnabled(false);
        YAxis axisLeft2 = lineChart.getAxisLeft();
        if (i10 > 0) {
            axisLeft2.setLabelCount(i10, true);
        }
        axisLeft2.setAxisLineWidth(1.0f);
        Resources resources = context.getResources();
        int i11 = R.color.divider_secondary_2_color;
        axisLeft2.setAxisLineColor(resources.getColor(i11));
        axisLeft2.setGridLineWidth(1.0f);
        Resources resources2 = context.getResources();
        int i12 = R.color.divider_color_alpha_30;
        axisLeft2.setGridColor(resources2.getColor(i12));
        Resources resources3 = context.getResources();
        int i13 = R.color.text_secondary_1_color;
        axisLeft2.setTextColor(resources3.getColor(i13));
        axisLeft2.setValueFormatter(new C0541a());
        YAxis axisRight = lineChart.getAxisRight();
        axisRight.setAxisLineWidth(1.0f);
        axisRight.setAxisLineColor(context.getResources().getColor(i12));
        axisRight.setDrawLabels(false);
        axisRight.setDrawGridLines(false);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setAxisLineColor(context.getResources().getColor(i11));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGridLineWidth(1.0f);
        xAxis.setGridColor(context.getResources().getColor(i12));
        xAxis.setTextColor(context.getResources().getColor(i13));
        lineChart.animateX(500, Easing.EasingOption.EaseInOutQuad);
    }
}
