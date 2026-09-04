package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewOverlayRecordObj;
import com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchDetailChart;
import com.max.xiaoheihe.module.game.component.dota2.Dota2OverviewLayMarkerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameOverviewOverlayChartVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOverviewOverlayChartVHB.kt\ncom/max/xiaoheihe/module/game/adapter/overview/binder/GameOverviewOverlayChartVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n262#2,2:267\n262#2,2:269\n262#2,2:271\n*S KotlinDebug\n*F\n+ 1 GameOverviewOverlayChartVHB.kt\ncom/max/xiaoheihe/module/game/adapter/overview/binder/GameOverviewOverlayChartVHB\n*L\n58#1:267,2\n70#1:269,2\n72#1:271,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class x extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85918b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85919a;

    /* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseGameOverviewObj f85921c;

        a(BaseGameOverviewObj baseGameOverviewObj) {
            this.f85921c = baseGameOverviewObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35838, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(x.this.m().b(), ((GameOverviewOverlayRecordObj) this.f85921c).getFaq_protocol());
        }
    }

    /* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
    public static final class b implements IAxisValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f85922a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 35839, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.valueOf((int) f10);
        }
    }

    /* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
    public static final class c implements IAxisValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f85923a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            return "";
        }
    }

    /* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
    public static final class d implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LineChart f85925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Overlaymatch> f85926c;

        d(LineChart lineChart, List<Overlaymatch> list) {
            this.f85925b = lineChart;
            this.f85926c = list;
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 35840, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            if (i10 == 0) {
                x xVar = x.this;
                LineChart lineChart = this.f85925b;
                List<Overlaymatch> list = this.f85926c;
                x.f(xVar, lineChart, list.subList(fi.u.u(0, list.size() - 10), this.f85926c.size()));
                return;
            }
            if (i10 == 1) {
                x xVar2 = x.this;
                LineChart lineChart2 = this.f85925b;
                List<Overlaymatch> list2 = this.f85926c;
                x.f(xVar2, lineChart2, list2.subList(fi.u.u(0, list2.size() - 25), this.f85926c.size()));
                return;
            }
            if (i10 != 2) {
                return;
            }
            x xVar3 = x.this;
            LineChart lineChart3 = this.f85925b;
            List<Overlaymatch> list3 = this.f85926c;
            x.f(xVar3, lineChart3, list3.subList(fi.u.u(0, list3.size() - 50), this.f85926c.size()));
        }
    }

    /* JADX INFO: compiled from: GameOverviewOverlayChartVHB.kt */
    public static final class e implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f85927a = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    public x(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85919a = param;
    }

    public static final /* synthetic */ void f(x xVar, LineChart lineChart, List list) {
        if (PatchProxy.proxy(new Object[]{xVar, lineChart, list}, null, changeQuickRedirect, true, 35837, new Class[]{x.class, LineChart.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        xVar.n(lineChart, list);
    }

    private final void h(SegmentFilterView segmentFilterView, LineChart lineChart, List<Overlaymatch> list) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView, lineChart, list}, this, changeQuickRedirect, false, 35831, new Class[]{SegmentFilterView.class, LineChart.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        if (size < 10) {
            arrayList.add(l(true));
        } else if (size < 25) {
            arrayList.add(i(true));
            arrayList.add(l(false));
        } else if (size < 50) {
            arrayList.add(i(true));
            arrayList.add(j(false));
            arrayList.add(l(false));
        } else {
            arrayList.add(i(true));
            arrayList.add(j(false));
            arrayList.add(k(false));
        }
        segmentFilterView.setLittleWhiteStyle();
        segmentFilterView.setMOnTabCheckedListener(new d(lineChart, list));
        segmentFilterView.setData(arrayList);
        segmentFilterView.d();
    }

    private final void n(LineChart lineChart, List<Overlaymatch> list) {
        if (PatchProxy.proxy(new Object[]{lineChart, list}, this, changeQuickRedirect, false, 35830, new Class[]{LineChart.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        lineChart.clear();
        lineChart.getXAxis().setLabelCount(list.size(), true);
        ArrayList arrayList = new ArrayList();
        int i10 = Integer.MAX_VALUE;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int rank = list.get(i12).getRank();
            if (i11 <= rank) {
                i11 = rank;
            }
            if (i10 >= rank) {
                i10 = rank;
            }
            arrayList.add(new Entry(i12, rank, list.get(i12)));
        }
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setAxisMinimum((i10 / 10) * 10.0f);
        axisLeft.setAxisMaximum(axisLeft.getAxisMinimum() + ((((int) ((i11 + 79) - axisLeft.getAxisMinimum())) / 80) * 80.0f));
        LineDataSet lineDataSet = new LineDataSet(arrayList, "overview");
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setCircleColor(com.max.xiaoheihe.utils.d.F(this.f85919a.b(), R.color.dota2_tianhui));
        lineDataSet.setCircleColorHole(com.max.xiaoheihe.utils.d.F(this.f85919a.b(), R.color.dota2_tianhui));
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
        lineDataSet.setValueFormatter(e.f85927a);
        LineData lineData = (LineData) lineChart.getData();
        if (lineData == null) {
            lineData = new LineData();
        }
        lineData.addDataSet(lineDataSet);
        lineData.setHighlightEnabled(true);
        lineChart.setData(lineData);
        Dota2OverviewLayMarkerView dota2OverviewLayMarkerView = new Dota2OverviewLayMarkerView(this.f85919a.b());
        dota2OverviewLayMarkerView.setChartView(lineChart);
        lineChart.setMarker(dota2OverviewLayMarkerView);
        lineChart.invalidate();
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35836, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(eVar, baseGameOverviewObj);
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
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35829, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewOverlayRecordObj) {
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
            SegmentFilterView v_filter = (SegmentFilterView) viewHolder.i(R.id.v_filter);
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_chart);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_overlay_score);
            LineChart v_chart = (LineChart) viewHolder.i(R.id.v_chart);
            ViewGroup bindView$lambda$0 = (ViewGroup) viewHolder.i(R.id.vg_help);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_help);
            GameOverviewOverlayRecordObj gameOverviewOverlayRecordObj = (GameOverviewOverlayRecordObj) data;
            textView3.setText(gameOverviewOverlayRecordObj.getCur_rank_score());
            imageView.setAlpha(0.4f);
            imageView.setColorFilter(-1);
            f0.o(bindView$lambda$0, "bindView$lambda$0");
            bindView$lambda$0.setVisibility(com.max.hbcommon.utils.c.u(gameOverviewOverlayRecordObj.getFaq_protocol()) ^ true ? 0 : 8);
            bindView$lambda$0.setOnClickListener(new a(data));
            v_filter.setLittleWhiteStyle();
            textView2.setText(gameOverviewOverlayRecordObj.getDesc());
            String title = gameOverviewOverlayRecordObj.getTitle();
            if (title == null) {
                title = "天梯助手";
            }
            textView.setText(title);
            if (com.max.hbcommon.utils.c.w(gameOverviewOverlayRecordObj.getOverlay_matches())) {
                View view = viewHolder.itemView;
                f0.o(view, "viewHolder.itemView");
                view.setVisibility(8);
                return;
            }
            View view2 = viewHolder.itemView;
            f0.o(view2, "viewHolder.itemView");
            view2.setVisibility(0);
            List<Overlaymatch> overlay_matches = gameOverviewOverlayRecordObj.getOverlay_matches();
            f0.m(overlay_matches);
            viewGroup.setBackground(com.max.hbutils.utils.q.i(this.f85919a.b(), R.color.white_alpha2, R.color.white_alpha5, 0.5f, 8.0f));
            Dota2MatchDetailChart.a aVar = Dota2MatchDetailChart.f87131j;
            Context contextB = this.f85919a.b();
            f0.o(v_chart, "v_chart");
            aVar.a(contextB, v_chart);
            v_chart.setRenderer(new LineChartRenderer(v_chart, v_chart.getAnimator(), v_chart.getViewPortHandler()));
            YAxis axisLeft = v_chart.getAxisLeft();
            axisLeft.setValueFormatter(b.f85922a);
            axisLeft.setDrawAxisLine(true);
            axisLeft.setLabelCount(7, false);
            XAxis xAxis = v_chart.getXAxis();
            f0.o(xAxis, "v_chart.getXAxis()");
            xAxis.setValueFormatter(c.f85923a);
            xAxis.setDrawAxisLine(true);
            xAxis.setDrawGridLines(true);
            xAxis.setGridColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            com.max.hbcommon.component.chart.e eVar = new com.max.hbcommon.component.chart.e(v_chart.getViewPortHandler(), v_chart.getXAxis(), v_chart.getTransformer(YAxis.AxisDependency.LEFT));
            eVar.f67463c = com.max.xiaoheihe.utils.d.E(R.color.white_alpha2);
            v_chart.setXAxisRenderer(eVar);
            n(v_chart, overlay_matches.subList(fi.u.u(0, overlay_matches.size() - 10), overlay_matches.size()));
            if (v_filter.getCurrent() == null) {
                f0.o(v_filter, "v_filter");
                h(v_filter, v_chart, overlay_matches);
            }
        }
    }

    @dl.d
    public final KeyDescObj i(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35833, new Class[]{Boolean.TYPE}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("10场");
        keyDescObj.setKey("10");
        keyDescObj.setChecked(z10);
        return keyDescObj;
    }

    @dl.d
    public final KeyDescObj j(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35834, new Class[]{Boolean.TYPE}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("25场");
        keyDescObj.setKey(Constants.VIA_REPORT_TYPE_CHAT_AUDIO);
        keyDescObj.setChecked(z10);
        return keyDescObj;
    }

    @dl.d
    public final KeyDescObj k(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35835, new Class[]{Boolean.TYPE}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("50场");
        keyDescObj.setKey(BBSLinkObj.CONTENT_TYPE_LINK_NEWS_WITH_TOP_USER);
        keyDescObj.setChecked(z10);
        return keyDescObj;
    }

    @dl.d
    public final KeyDescObj l(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35832, new Class[]{Boolean.TYPE}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(com.max.xiaoheihe.module.game.d0.f87251w);
        keyDescObj.setKey("all");
        keyDescObj.setChecked(z10);
        return keyDescObj;
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d m() {
        return this.f85919a;
    }
}
