package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewChartObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchDetailChart;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MmrMarkerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameOverviewChartVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameOverviewChartVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOverviewChartVHB.kt\ncom/max/xiaoheihe/module/game/adapter/overview/binder/GameOverviewChartVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,151:1\n262#2,2:152\n304#2,2:154\n304#2,2:156\n262#2,2:158\n*S KotlinDebug\n*F\n+ 1 GameOverviewChartVHB.kt\ncom/max/xiaoheihe/module/game/adapter/overview/binder/GameOverviewChartVHB\n*L\n48#1:152,2\n49#1:154,2\n52#1:156,2\n53#1:158,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85876b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85877a;

    /* JADX INFO: compiled from: GameOverviewChartVHB.kt */
    public static final class a implements IAxisValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f85878a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 35777, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.valueOf((int) f10);
        }
    }

    /* JADX INFO: compiled from: GameOverviewChartVHB.kt */
    public static final class b implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Dota2ChartObj> f85879a;

        b(List<Dota2ChartObj> list) {
            this.f85879a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 35778, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            try {
                return Dota2CalendarView.f87038h.a(this.f85879a.get((int) f10).getTime());
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* JADX INFO: compiled from: GameOverviewChartVHB.kt */
    public static final class c implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f85880a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    public i(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85877a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35776, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35775, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewChartObj) {
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            LineChart v_chart = (LineChart) viewHolder.i(R.id.v_chart);
            TextView tv_no_data = (TextView) viewHolder.i(R.id.tv_no_data);
            GameOverviewChartObj gameOverviewChartObj = (GameOverviewChartObj) data;
            String title = gameOverviewChartObj.getTitle();
            if (title == null) {
                title = "趋势图";
            }
            textView.setText(title);
            if (com.max.hbcommon.utils.c.w(gameOverviewChartObj.getList())) {
                f0.o(tv_no_data, "tv_no_data");
                tv_no_data.setVisibility(0);
                f0.o(v_chart, "v_chart");
                v_chart.setVisibility(8);
                tv_no_data.setText(gameOverviewChartObj.getMsg());
                return;
            }
            f0.o(tv_no_data, "tv_no_data");
            tv_no_data.setVisibility(8);
            f0.o(v_chart, "v_chart");
            v_chart.setVisibility(0);
            List<Dota2ChartObj> list = gameOverviewChartObj.getList();
            f0.m(list);
            v_chart.setBackground(com.max.hbutils.utils.q.i(this.f85877a.b(), R.color.white_alpha2, R.color.white_alpha5, 0.5f, 8.0f));
            Dota2MatchDetailChart.f87131j.a(this.f85877a.b(), v_chart);
            v_chart.setRenderer(new LineChartRenderer(v_chart, v_chart.getAnimator(), v_chart.getViewPortHandler()));
            v_chart.getAxisLeft().setValueFormatter(a.f85878a);
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Dota2ChartObj dota2ChartObj = new Dota2ChartObj(list.get(i10).getTime(), list.get(i10).getValue(), null, null);
                arrayList.add(new Entry(i10, com.max.hbutils.utils.n.p(dota2ChartObj.getValue()), dota2ChartObj));
            }
            v_chart.clear();
            XAxis xAxis = v_chart.getXAxis();
            f0.o(xAxis, "v_chart.getXAxis()");
            xAxis.setLabelCount(Math.min(10, list.size()), true);
            xAxis.setValueFormatter(new b(list));
            xAxis.setDrawGridLines(true);
            xAxis.setGridColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            com.max.hbcommon.component.chart.e eVar = new com.max.hbcommon.component.chart.e(v_chart.getViewPortHandler(), v_chart.getXAxis(), v_chart.getTransformer(YAxis.AxisDependency.LEFT));
            eVar.f67463c = com.max.xiaoheihe.utils.d.E(R.color.white_alpha2);
            v_chart.setXAxisRenderer(eVar);
            v_chart.setExtraBottomOffset(14.0f);
            LineDataSet lineDataSet = new LineDataSet(arrayList, "");
            lineDataSet.setLineWidth(1.5f);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleColor(com.max.xiaoheihe.utils.d.F(this.f85877a.b(), R.color.dota2_tianhui));
            lineDataSet.setCircleColorHole(com.max.xiaoheihe.utils.d.F(this.f85877a.b(), R.color.dota2_tianhui));
            lineDataSet.setCircleRadius(2.5f);
            lineDataSet.setCircleHoleRadius(0.0f);
            lineDataSet.setHighLightColor(com.max.xiaoheihe.utils.d.I(0.2f, com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui)));
            lineDataSet.setHighlightLineWidth(5.0f);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setDrawHighlightIndicators(false);
            lineDataSet.setColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(ViewUtils.P(0, com.max.xiaoheihe.utils.d.I(0.3f, com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui)), 0));
            lineDataSet.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet.setValueFormatter(c.f85880a);
            LineData lineData = (LineData) v_chart.getData();
            if (lineData == null) {
                lineData = new LineData();
            }
            lineData.addDataSet(lineDataSet);
            v_chart.setData(lineData);
            Dota2MmrMarkerView dota2MmrMarkerView = new Dota2MmrMarkerView(this.f85877a.b(), list);
            dota2MmrMarkerView.setChartView(v_chart);
            v_chart.setMarker(dota2MmrMarkerView);
            v_chart.invalidate();
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85877a;
    }
}
