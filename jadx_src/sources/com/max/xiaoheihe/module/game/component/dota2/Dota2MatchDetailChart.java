package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2PlayerObj;
import com.max.xiaoheihe.module.game.component.ChartSelectorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ue0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2MatchDetailChart extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f87131j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f87132k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChartSelectorView f87133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChartSelectorView f87134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f87135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ue0 f87136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LineChart f87137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<Dota2PlayerObj> f87138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<KeyDescObj> f87139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private Type f87140i;

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public enum Type {
        Gold,
        Exp;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 37228, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37227, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final void a(@dl.d Context context, @dl.d LineChart lineChart) {
            if (PatchProxy.proxy(new Object[]{context, lineChart}, this, changeQuickRedirect, false, 37226, new Class[]{Context.class, LineChart.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(lineChart, "lineChart");
            lineChart.setLayerType(1, null);
            ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
            YAxis axisLeft = lineChart.getAxisLeft();
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            com.max.hbcommon.component.chart.g gVar = new com.max.hbcommon.component.chart.g(viewPortHandler, axisLeft, lineChart.getTransformer(axisDependency));
            gVar.d(true);
            gVar.c(true);
            lineChart.setRendererLeftYAxis(gVar);
            lineChart.getAxisRight().setEnabled(false);
            Typeface typefaceB = bb.d.a().b(2);
            lineChart.setDragEnabled(false);
            lineChart.setScaleEnabled(false);
            lineChart.setDescription(null);
            lineChart.getLegend().setEnabled(false);
            YAxis axisLeft2 = lineChart.getAxisLeft();
            axisLeft2.setLabelCount(5, false);
            axisLeft2.setAxisLineWidth(1.0f);
            axisLeft2.setAxisLineColor(context.getResources().getColor(R.color.white_alpha5));
            axisLeft2.setGridLineWidth(1.0f);
            axisLeft2.setGridColor(context.getResources().getColor(R.color.white_alpha5));
            axisLeft2.setTextColor(context.getResources().getColor(R.color.white_alpha40));
            axisLeft2.setTypeface(typefaceB);
            axisLeft2.setDrawAxisLine(false);
            XAxis xAxis = lineChart.getXAxis();
            lineChart.setXAxisRenderer(new com.max.hbcommon.component.chart.i(lineChart.getViewPortHandler(), lineChart.getXAxis(), lineChart.getTransformer(axisDependency), false, false));
            xAxis.setAxisLineWidth(1.0f);
            xAxis.setAxisLineColor(context.getResources().getColor(R.color.white_alpha5));
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setGridLineWidth(1.0f);
            xAxis.setTextColor(context.getResources().getColor(R.color.white_alpha40));
            xAxis.setTypeface(typefaceB);
            xAxis.setDrawAxisLine(false);
            xAxis.setDrawGridLines(true);
            lineChart.animateX(300, Easing.EasingOption.EaseInOutQuad);
            xAxis.setGridColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha5));
            lineChart.setExtraRightOffset(8.0f);
            lineChart.setExtraLeftOffset(9.0f);
            lineChart.setData(new LineData());
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class b implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87141a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class c implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            int iQ;
            Dota2ChartObj dota2ChartObj;
            Dota2ChartObj dota2ChartObj2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 37229, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            try {
                String time = null;
                if (Dota2MatchDetailChart.this.f87140i == Type.Gold) {
                    List<Dota2ChartObj> graph_gold = ((Dota2PlayerObj) Dota2MatchDetailChart.this.f87138g.get(0)).getGraph_gold();
                    if (graph_gold != null && (dota2ChartObj2 = graph_gold.get(i10)) != null) {
                        time = dota2ChartObj2.getTime();
                    }
                    iQ = n.q(time);
                } else {
                    List<Dota2ChartObj> graph_exp = ((Dota2PlayerObj) Dota2MatchDetailChart.this.f87138g.get(0)).getGraph_exp();
                    if (graph_exp != null && (dota2ChartObj = graph_exp.get(i10)) != null) {
                        time = dota2ChartObj.getTime();
                    }
                    iQ = n.q(time);
                }
                return String.valueOf(iQ / 60);
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class d implements HeroDataMarkerView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.component.dota2.HeroDataMarkerView.a
        @dl.e
        public List<Integer> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37230, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            ArrayList arrayList = new ArrayList();
            int size = Dota2MatchDetailChart.this.getSelectorList().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Dota2MatchDetailChart.this.getSelectorList().get(i10).isChecked()) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            return arrayList;
        }

        @Override // com.max.xiaoheihe.module.game.component.dota2.HeroDataMarkerView.a
        @dl.d
        public Type getType() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37231, new Class[0], Type.class);
            return patchProxyResultProxy.isSupported ? (Type) patchProxyResultProxy.result : Dota2MatchDetailChart.this.f87140i;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class e extends s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
        public static final class a implements ShineButton.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f87145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Dota2MatchDetailChart f87146b;

            a(KeyDescObj keyDescObj, Dota2MatchDetailChart dota2MatchDetailChart) {
                this.f87145a = keyDescObj;
                this.f87146b = dota2MatchDetailChart;
            }

            @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
            public final void a(View view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37234, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f87145a.setChecked(z10);
                Dota2MatchDetailChart.e(this.f87146b);
                this.f87146b.i();
            }
        }

        e(Context context, List<KeyDescObj> list) {
            super(context, list, R.layout.item_chart_selector);
        }

        public void m(@dl.e s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 37232, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2MatchDetailChart dota2MatchDetailChart = Dota2MatchDetailChart.this;
            if (keyDescObj != null) {
                View viewI = eVar.i(R.id.v_chart_selector);
                f0.o(viewI, "viewHolder.getView(R.id.v_chart_selector)");
                ChartSelectorView chartSelectorView = (ChartSelectorView) viewI;
                chartSelectorView.setType(ChartSelectorView.Type.ICON);
                chartSelectorView.setColor(com.max.xiaoheihe.utils.d.e1(keyDescObj.getColor()));
                com.max.hbimage.b.K(keyDescObj.getIcon(), chartSelectorView.getIv_icon());
                chartSelectorView.b(keyDescObj.isChecked(), false);
                chartSelectorView.setCheckChangeListener(new a(keyDescObj, dota2MatchDetailChart));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 37233, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class f implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public final void a(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37235, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Dota2MatchDetailChart.f(Dota2MatchDetailChart.this, false);
            Dota2MatchDetailChart.a(Dota2MatchDetailChart.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class g implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public final void a(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37236, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Dota2MatchDetailChart.f(Dota2MatchDetailChart.this, true);
            Dota2MatchDetailChart.a(Dota2MatchDetailChart.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class h implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public final void a(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37237, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Dota2MatchDetailChart.g(Dota2MatchDetailChart.this, false);
            Dota2MatchDetailChart.b(Dota2MatchDetailChart.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class i implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public final void a(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37238, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Dota2MatchDetailChart.g(Dota2MatchDetailChart.this, true);
            Dota2MatchDetailChart.b(Dota2MatchDetailChart.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailChart.kt */
    public static final class j implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 37239, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2MatchDetailChart.this.m((int) f10);
        }
    }

    public Dota2MatchDetailChart(@dl.e Context context) {
        this(context, null);
    }

    public Dota2MatchDetailChart(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2MatchDetailChart(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2MatchDetailChart(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f87138g = new ArrayList();
        this.f87139h = new ArrayList();
        this.f87140i = Type.Gold;
        j();
    }

    public static final /* synthetic */ void a(Dota2MatchDetailChart dota2MatchDetailChart) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailChart}, null, changeQuickRedirect, true, 37223, new Class[]{Dota2MatchDetailChart.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailChart.k();
    }

    public static final /* synthetic */ void b(Dota2MatchDetailChart dota2MatchDetailChart) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailChart}, null, changeQuickRedirect, true, 37225, new Class[]{Dota2MatchDetailChart.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailChart.l();
    }

    public static final /* synthetic */ void e(Dota2MatchDetailChart dota2MatchDetailChart) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailChart}, null, changeQuickRedirect, true, 37221, new Class[]{Dota2MatchDetailChart.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailChart.o();
    }

    public static final /* synthetic */ void f(Dota2MatchDetailChart dota2MatchDetailChart, boolean z10) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailChart, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 37222, new Class[]{Dota2MatchDetailChart.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailChart.p(z10);
    }

    public static final /* synthetic */ void g(Dota2MatchDetailChart dota2MatchDetailChart, boolean z10) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailChart, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 37224, new Class[]{Dota2MatchDetailChart.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailChart.q(z10);
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        ue0 ue0VarC = ue0.c(LayoutInflater.from(getContext()));
        f0.o(ue0VarC, "inflate(LayoutInflater.from(context))");
        setSelestorBinding(ue0VarC);
        getSelestorBinding().b().setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 50.0f)));
        addView(getSelestorBinding().b());
        ChartSelectorView chartSelectorView = getSelestorBinding().f116398c;
        f0.o(chartSelectorView, "selestorBinding.vSelectTianhui");
        setV_select_tianhui(chartSelectorView);
        ChartSelectorView chartSelectorView2 = getSelestorBinding().f116399d;
        f0.o(chartSelectorView2, "selestorBinding.vSelectYeyan");
        setV_select_yeyan(chartSelectorView2);
        RecyclerView recyclerView = getSelestorBinding().f116397b;
        f0.o(recyclerView, "selestorBinding.rv");
        setRv(recyclerView);
        ChartSelectorView v_select_tianhui = getV_select_tianhui();
        ChartSelectorView.Type type = ChartSelectorView.Type.TEXT;
        v_select_tianhui.setType(type);
        getV_select_tianhui().setDesc("天辉");
        getV_select_tianhui().setColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_tianhui));
        getV_select_yeyan().setType(type);
        getV_select_yeyan().setDesc("夜魇");
        getV_select_yeyan().setColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_yemo));
        getRv().setAdapter(new e(getContext(), this.f87139h));
        o();
        n();
    }

    private final void k() {
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37217, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f87139h.size() <= 0) {
            z10 = true;
            break;
        }
        int size = this.f87139h.size() / 2;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else {
                if (!this.f87139h.get(i10).isChecked()) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            getV_select_tianhui().b(true, false);
            getV_select_tianhui().setCheckChangeListener(new f());
        } else {
            getV_select_tianhui().b(false, false);
            getV_select_tianhui().setCheckChangeListener(new g());
        }
    }

    private final void l() {
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37218, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f87139h.size() <= 0) {
            z10 = true;
            break;
        }
        int size = this.f87139h.size() / 2;
        int size2 = this.f87139h.size();
        while (true) {
            if (size >= size2) {
                z10 = true;
                break;
            } else {
                if (!this.f87139h.get(size).isChecked()) {
                    z10 = false;
                    break;
                }
                size++;
            }
        }
        if (z10) {
            getV_select_yeyan().b(true, false);
            getV_select_yeyan().setCheckChangeListener(new h());
        } else {
            getV_select_yeyan().b(false, false);
            getV_select_yeyan().setCheckChangeListener(new i());
        }
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37212, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLineChart(new LineChart(getContext()));
        getLineChart().setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 308.0f)));
        addView(getLineChart());
        a aVar = f87131j;
        Context context = getContext();
        f0.o(context, "context");
        aVar.a(context, getLineChart());
        YAxis axisLeft = getLineChart().getAxisLeft();
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setValueFormatter(new j());
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37216, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k();
        l();
    }

    private final void p(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37219, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f87139h.size() / 2;
        for (int i10 = 0; i10 < size; i10++) {
            this.f87139h.get(i10).setChecked(z10);
            RecyclerView.Adapter adapter = getRv().getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(i10);
            }
        }
        i();
    }

    private final void q(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37220, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f87139h.size();
        for (int size2 = this.f87139h.size() / 2; size2 < size; size2++) {
            this.f87139h.get(size2).setChecked(z10);
            RecyclerView.Adapter adapter = getRv().getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(size2);
            }
        }
        i();
    }

    @dl.d
    public final Type getChartType() {
        return this.f87140i;
    }

    @dl.d
    public final LineChart getLineChart() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37207, new Class[0], LineChart.class);
        if (patchProxyResultProxy.isSupported) {
            return (LineChart) patchProxyResultProxy.result;
        }
        LineChart lineChart = this.f87137f;
        if (lineChart != null) {
            return lineChart;
        }
        f0.S("lineChart");
        return null;
    }

    @dl.d
    public final RecyclerView getRv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37203, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f87135d;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv");
        return null;
    }

    @dl.d
    public final List<KeyDescObj> getSelectorList() {
        return this.f87139h;
    }

    @dl.d
    public final ue0 getSelestorBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37205, new Class[0], ue0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ue0) patchProxyResultProxy.result;
        }
        ue0 ue0Var = this.f87136e;
        if (ue0Var != null) {
            return ue0Var;
        }
        f0.S("selestorBinding");
        return null;
    }

    @dl.d
    public final ChartSelectorView getV_select_tianhui() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37199, new Class[0], ChartSelectorView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ChartSelectorView) patchProxyResultProxy.result;
        }
        ChartSelectorView chartSelectorView = this.f87133b;
        if (chartSelectorView != null) {
            return chartSelectorView;
        }
        f0.S("v_select_tianhui");
        return null;
    }

    @dl.d
    public final ChartSelectorView getV_select_yeyan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37201, new Class[0], ChartSelectorView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ChartSelectorView) patchProxyResultProxy.result;
        }
        ChartSelectorView chartSelectorView = this.f87134c;
        if (chartSelectorView != null) {
            return chartSelectorView;
        }
        f0.S("v_select_yeyan");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37215, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<Dota2ChartObj> graph_gold = this.f87140i == Type.Gold ? this.f87138g.get(i10).getGraph_gold() : this.f87138g.get(i10).getGraph_exp();
        if (graph_gold != null) {
            ArrayList arrayList = new ArrayList();
            int size = graph_gold.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new Entry(i11, n.p(graph_gold.get(i11).getValue()), graph_gold.get(i11)));
            }
            LineDataSet lineDataSet = new LineDataSet(arrayList, String.valueOf(i10));
            lineDataSet.setLineWidth(1.0f);
            lineDataSet.setColor(com.max.xiaoheihe.utils.d.e1(this.f87139h.get(i10).getColor()));
            lineDataSet.setDrawCircles(false);
            lineDataSet.setHighLightColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha5));
            lineDataSet.setHighlightLineWidth(5.0f);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setDrawVerticalHighlightIndicator(true);
            lineDataSet.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet.setDrawFilled(false);
            lineDataSet.setValueFormatter(b.f87141a);
            LineData lineData = (LineData) getLineChart().getData();
            if (lineData == null) {
                lineData = new LineData();
            }
            lineData.addDataSet(lineDataSet);
            getLineChart().setData(lineData);
        }
    }

    public final void i() {
        int iQ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37214, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getLineChart().clear();
        XAxis xAxis = getLineChart().getXAxis();
        f0.o(xAxis, "lineChart.getXAxis()");
        try {
            if (this.f87140i == Type.Gold) {
                List<Dota2ChartObj> graph_gold = this.f87138g.get(0).getGraph_gold();
                f0.m(graph_gold);
                List<Dota2ChartObj> graph_gold2 = this.f87138g.get(0).getGraph_gold();
                f0.m(graph_gold2);
                iQ = n.q(graph_gold.get(CollectionsKt__CollectionsKt.G(graph_gold2)).getTime());
            } else {
                List<Dota2ChartObj> graph_exp = this.f87138g.get(0).getGraph_exp();
                f0.m(graph_exp);
                List<Dota2ChartObj> graph_exp2 = this.f87138g.get(0).getGraph_exp();
                f0.m(graph_exp2);
                iQ = n.q(graph_exp.get(CollectionsKt__CollectionsKt.G(graph_exp2)).getTime());
            }
            xAxis.setLabelCount(((iQ / 60) + 4) / 5, true);
        } catch (Throwable th2) {
            Log.e("setLabelCount", String.valueOf(th2.getMessage()));
        }
        xAxis.setValueFormatter(new c());
        int size = this.f87139h.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f87139h.get(i10).isChecked()) {
                h(i10);
            }
        }
        Context context = getContext();
        f0.o(context, "context");
        HeroDataMarkerView heroDataMarkerView = new HeroDataMarkerView(context, this.f87138g, new d());
        heroDataMarkerView.setChartView(getLineChart());
        getLineChart().setMarker(heroDataMarkerView);
        getLineChart().invalidate();
    }

    @dl.d
    public final String m(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37213, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f87140i != Type.Gold) {
            return String.valueOf(i10);
        }
        return new DecimalFormat("#,###").format(Integer.valueOf(i10 / 1000)) + 'k';
    }

    public final void setChartType(@dl.d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 37210, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f87140i = type;
        i();
    }

    public final void setData(@dl.e List<Dota2PlayerObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37211, new Class[]{List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        this.f87138g.clear();
        List<Dota2PlayerObj> list2 = this.f87138g;
        f0.m(list);
        list2.addAll(list);
        this.f87139h.clear();
        for (Dota2PlayerObj dota2PlayerObj : list) {
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setColor(dota2PlayerObj.getChart_color());
            keyDescObj.setIcon(dota2PlayerObj.getHero_icon());
            keyDescObj.setChecked(true);
            this.f87139h.add(keyDescObj);
        }
        getRv().setLayoutManager(new GridLayoutManager(getContext(), 5));
        if (getRv().getItemDecorationCount() == 0) {
            getRv().addItemDecoration(new fc.b(5, ViewUtils.f(getContext(), 14.0f), false));
        }
        RecyclerView.Adapter adapter = getRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        i();
    }

    public final void setLineChart(@dl.d LineChart lineChart) {
        if (PatchProxy.proxy(new Object[]{lineChart}, this, changeQuickRedirect, false, 37208, new Class[]{LineChart.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lineChart, "<set-?>");
        this.f87137f = lineChart;
    }

    public final void setRv(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 37204, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f87135d = recyclerView;
    }

    public final void setSelestorBinding(@dl.d ue0 ue0Var) {
        if (PatchProxy.proxy(new Object[]{ue0Var}, this, changeQuickRedirect, false, 37206, new Class[]{ue0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ue0Var, "<set-?>");
        this.f87136e = ue0Var;
    }

    public final void setV_select_tianhui(@dl.d ChartSelectorView chartSelectorView) {
        if (PatchProxy.proxy(new Object[]{chartSelectorView}, this, changeQuickRedirect, false, 37200, new Class[]{ChartSelectorView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(chartSelectorView, "<set-?>");
        this.f87133b = chartSelectorView;
    }

    public final void setV_select_yeyan(@dl.d ChartSelectorView chartSelectorView) {
        if (PatchProxy.proxy(new Object[]{chartSelectorView}, this, changeQuickRedirect, false, 37202, new Class[]{ChartSelectorView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(chartSelectorView, "<set-?>");
        this.f87134c = chartSelectorView;
    }
}
