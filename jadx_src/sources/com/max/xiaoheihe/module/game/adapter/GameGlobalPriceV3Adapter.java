package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.TabEntity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GlobalRegionPriceObj;
import com.max.xiaoheihe.bean.game.LowestInfoV2Obj;
import com.max.xiaoheihe.bean.game.PriceHistoryResult;
import com.max.xiaoheihe.bean.game.PricePointObj;
import com.max.xiaoheihe.module.game.PriceTrendMarkerV2View;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.PriceDiscountView;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameGlobalPriceV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameGlobalPriceV3Adapter.kt\ncom/max/xiaoheihe/module/game/adapter/GameGlobalPriceV3Adapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n1855#2,2:504\n*S KotlinDebug\n*F\n+ 1 GameGlobalPriceV3Adapter.kt\ncom/max/xiaoheihe/module/game/adapter/GameGlobalPriceV3Adapter\n*L\n342#1:504,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameGlobalPriceV3Adapter extends com.max.hbcommon.base.adapter.s<GlobalRegionPriceObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85586j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f85588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String f85589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final RecyclerView f85590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private a f85591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private LoadingDialog f85592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f85593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f85594i;

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public interface a {
        @dl.e
        String a();
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PriceHistoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GlobalRegionPriceObj f85596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0.g f85597d;

        b(GlobalRegionPriceObj globalRegionPriceObj, l0.g gVar) {
            this.f85596c = globalRegionPriceObj;
            this.f85597d = gVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35616, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            GameGlobalPriceV3Adapter.n(GameGlobalPriceV3Adapter.this);
        }

        public void onNext(@dl.d Result<PriceHistoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35615, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            GameGlobalPriceV3Adapter.n(GameGlobalPriceV3Adapter.this);
            this.f85596c.setPrice_history_result(result.getResult());
            this.f85597d.a();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35617, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PriceHistoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class c implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PriceHistoryResult f85598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameGlobalPriceV3Adapter f85599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GlobalRegionPriceObj f85600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LineChart f85601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f85602e;

        c(PriceHistoryResult priceHistoryResult, GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, GlobalRegionPriceObj globalRegionPriceObj, LineChart lineChart, TextView textView) {
            this.f85598a = priceHistoryResult;
            this.f85599b = gameGlobalPriceV3Adapter;
            this.f85600c = globalRegionPriceObj;
            this.f85601d = lineChart;
            this.f85602e = textView;
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 35618, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                this.f85598a.setMDays(com.max.xiaoheihe.module.game.d0.f87253y);
            } else if (i10 != 1) {
                this.f85598a.setMDays(com.max.xiaoheihe.module.game.d0.f87251w);
            } else {
                this.f85598a.setMDays(com.max.xiaoheihe.module.game.d0.f87252x);
            }
            GameGlobalPriceV3Adapter.o(this.f85599b, this.f85600c, this.f85601d, this.f85602e);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f85603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GlobalRegionPriceObj f85604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameGlobalPriceV3Adapter f85605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f85606e;

        d(boolean z10, GlobalRegionPriceObj globalRegionPriceObj, GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, yh.a<b2> aVar) {
            this.f85603b = z10;
            this.f85604c = globalRegionPriceObj;
            this.f85605d = gameGlobalPriceV3Adapter;
            this.f85606e = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35619, new Class[]{View.class}, Void.TYPE).isSupported && this.f85603b) {
                if (!this.f85604c.isExpand() && this.f85604c.getPrice_history_result() == null) {
                    GameGlobalPriceV3Adapter.r(this.f85605d);
                }
                if (!this.f85604c.isExpand()) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("app_id", this.f85605d.s());
                    a aVarX = this.f85605d.x();
                    jsonObject.addProperty("package_id", aVarX != null ? aVarX.a() : null);
                    jsonObject.addProperty("cc", this.f85604c.getCc());
                    com.max.hbcommon.analytics.d.e("4", lb.d.f131271v3, null, null, jsonObject, null, true);
                }
                this.f85606e.invoke();
            }
        }
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class e implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f85607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<PricePointObj> f85608b;

        e(int i10, List<PricePointObj> list) {
            this.f85607a = i10;
            this.f85608b = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 35625, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            String strG = (Math.abs(f10 - ((float) this.f85607a)) > 1.0f || com.max.hbcommon.utils.c.u(this.f85608b.get(0).getCurrency())) ? com.max.hbutils.utils.n.g(f10) : this.f85608b.get(0).getCurrency();
            Log.d("IAxisValueFormatter", "result: " + strG);
            return strG;
        }
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class f implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<PricePointObj> f85609a;

        f(List<PricePointObj> list) {
            this.f85609a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 35626, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            return (i10 < 0 || i10 >= this.f85609a.size()) ? "" : com.max.hbutils.utils.w.i(this.f85609a.get(i10).getDate(), com.max.hbutils.utils.w.f73603j);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
    public static final class g implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f85610a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameGlobalPriceV3Adapter(@dl.d Context context, @dl.d List<GlobalRegionPriceObj> list, @dl.e String str, @dl.e String str2, @dl.d RecyclerView rv, @dl.e a aVar) {
        super(context, list, R.layout.item_game_global_price_v3);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        kotlin.jvm.internal.f0.p(rv, "rv");
        this.f85587b = context;
        this.f85588c = str;
        this.f85589d = str2;
        this.f85590e = rv;
        this.f85591f = aVar;
        this.f85593h = -1;
        this.f85594i = true;
    }

    private final int A(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35602, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (kotlin.jvm.internal.f0.g(str, com.max.xiaoheihe.module.game.d0.f87253y)) {
            return 0;
        }
        return kotlin.jvm.internal.f0.g(str, com.max.xiaoheihe.module.game.d0.f87251w) ? 2 : 1;
    }

    private final void B() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35606, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.f85592g) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void C(CommonTabLayout commonTabLayout, GlobalRegionPriceObj globalRegionPriceObj, LineChart lineChart, TextView textView) {
        PriceHistoryResult price_history_result;
        if (PatchProxy.proxy(new Object[]{commonTabLayout, globalRegionPriceObj, lineChart, textView}, this, changeQuickRedirect, false, 35601, new Class[]{CommonTabLayout.class, GlobalRegionPriceObj.class, LineChart.class, TextView.class}, Void.TYPE).isSupported || (price_history_result = globalRegionPriceObj.getPrice_history_result()) == null) {
            return;
        }
        commonTabLayout.setOnTabSelectListener(new c(price_history_result, this, globalRegionPriceObj, lineChart, textView));
        commonTabLayout.setCurrentTab(A(price_history_result.getMDays()));
    }

    private final void F(GlobalRegionPriceObj globalRegionPriceObj, LineChart lineChart, TextView textView) {
        PriceHistoryResult price_history_result;
        ArrayList<PricePointObj> prices;
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{globalRegionPriceObj, lineChart, textView}, this, changeQuickRedirect, false, 35603, new Class[]{GlobalRegionPriceObj.class, LineChart.class, TextView.class}, Void.TYPE).isSupported || (price_history_result = globalRegionPriceObj.getPrice_history_result()) == null || (prices = price_history_result.getPrices()) == null) {
            return;
        }
        PricePointObj pricePointObj = prices.get(0);
        String strComponent1 = pricePointObj.component1();
        String strComponent2 = pricePointObj.component2();
        String strComponent3 = pricePointObj.component3();
        String strComponent4 = pricePointObj.component4();
        String strComponent5 = pricePointObj.component5();
        String strComponent6 = pricePointObj.component6();
        String strComponent7 = prices.get(prices.size() - 1).component1();
        ArrayList<PricePointObj> arrayList = new ArrayList();
        long jR = kotlin.jvm.internal.f0.g(com.max.xiaoheihe.module.game.d0.f87251w, globalRegionPriceObj.getPrice_history_result().getMDays()) ? com.max.hbutils.utils.n.r(strComponent1) : kotlin.jvm.internal.f0.g(com.max.xiaoheihe.module.game.d0.f87253y, globalRegionPriceObj.getPrice_history_result().getMDays()) ? Math.max(com.max.hbutils.utils.n.r(strComponent7) - ((long) 15552000), com.max.hbutils.utils.n.r(strComponent1)) : Math.max(com.max.hbutils.utils.n.r(strComponent7) - ((long) 31104000), com.max.hbutils.utils.n.r(strComponent1));
        PricePointObj pricePointObj2 = new PricePointObj(String.valueOf(jR), strComponent2, strComponent3, strComponent4, strComponent5, strComponent6);
        arrayList.add(pricePointObj2);
        float fP = com.max.hbutils.utils.n.p(pricePointObj2.getPrice());
        PricePointObj pricePointObj3 = pricePointObj2;
        for (PricePointObj pricePointObj4 : prices) {
            if (com.max.hbutils.utils.n.r(pricePointObj4.getDate()) <= jR) {
                pricePointObj2.setPrice(pricePointObj4.getPrice());
                pricePointObj2.setDesc(pricePointObj4.getDesc());
                fP = com.max.hbutils.utils.n.p(pricePointObj2.getPrice());
            } else {
                arrayList.add(pricePointObj4);
                if (com.max.hbutils.utils.n.p(pricePointObj4.getPrice()) > fP) {
                    fP = com.max.hbutils.utils.n.p(pricePointObj4.getPrice());
                }
                if (com.max.hbutils.utils.n.p(pricePointObj4.getPrice()) < com.max.hbutils.utils.n.p(pricePointObj3.getPrice())) {
                }
            }
            pricePointObj3 = pricePointObj4;
        }
        if (arrayList.size() > 1) {
            if (!kotlin.jvm.internal.f0.g(((PricePointObj) arrayList.get(0)).getPrice(), ((PricePointObj) arrayList.get(1)).getPrice())) {
                arrayList.add(0, new PricePointObj(((PricePointObj) arrayList.get(0)).getDate(), ((PricePointObj) arrayList.get(0)).getPrice(), ((PricePointObj) arrayList.get(0)).getDesc(), ((PricePointObj) arrayList.get(0)).getDiscount(), ((PricePointObj) arrayList.get(0)).getRmb_price(), ((PricePointObj) arrayList.get(0)).getCurrency()));
            }
            int size = arrayList.size();
            int i11 = size - 1;
            if (!kotlin.jvm.internal.f0.g(((PricePointObj) arrayList.get(i11)).getPrice(), ((PricePointObj) arrayList.get(size - 2)).getPrice())) {
                arrayList.add(new PricePointObj(((PricePointObj) arrayList.get(i11)).getDate(), ((PricePointObj) arrayList.get(i11)).getPrice(), ((PricePointObj) arrayList.get(i11)).getDesc(), ((PricePointObj) arrayList.get(i11)).getDiscount(), ((PricePointObj) arrayList.get(i11)).getRmb_price(), ((PricePointObj) arrayList.get(i11)).getCurrency()));
            }
        }
        String price = null;
        boolean z10 = false;
        for (PricePointObj pricePointObj5 : arrayList) {
            if (price == null) {
                price = pricePointObj5.getPrice();
            } else if (!kotlin.jvm.internal.f0.g(price, pricePointObj5.getPrice())) {
                z10 = true;
            }
        }
        if (z10 || com.max.hbutils.utils.n.q(globalRegionPriceObj.getDiscount()) != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        int iCeil = ((int) Math.ceil(fP / 40)) * 10 * 4;
        com.max.xiaoheihe.module.game.y.a(lineChart, 5, true, false);
        lineChart.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color));
        YAxis axisLeft = lineChart.getAxisLeft();
        kotlin.jvm.internal.f0.o(axisLeft, "lineChartTrend.getAxisLeft()");
        axisLeft.removeAllLimitLines();
        if (z10) {
            LimitLine limitLine = new LimitLine(com.max.hbutils.utils.n.p(pricePointObj3.getPrice()));
            limitLine.setLineWidth(1.0f);
            limitLine.setLineColor(com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color));
            limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
            limitLine.setLabel("");
            float f10 = ViewUtils.f(this.f85587b, 2.0f);
            limitLine.enableDashedLine(f10, f10, 0.0f);
            axisLeft.setDrawLimitLinesBehindData(true);
            axisLeft.addLimitLine(limitLine);
        }
        axisLeft.setAxisMinimum(0);
        axisLeft.setAxisMaximum(iCeil);
        axisLeft.setValueFormatter(new e(iCeil, arrayList));
        XAxis xAxis = lineChart.getXAxis();
        kotlin.jvm.internal.f0.o(xAxis, "lineChartTrend.getXAxis()");
        xAxis.setValueFormatter(new f(arrayList));
        xAxis.setLabelCount(Math.min(arrayList.size(), 4), true);
        lineChart.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            float fP2 = com.max.hbutils.utils.n.p(((PricePointObj) arrayList.get(i12)).getPrice());
            if (!kotlin.jvm.internal.f0.g(((PricePointObj) arrayList.get(i12)).getPrice(), pricePointObj3.getPrice())) {
                arrayList3.add(new Entry(i12, fP2, arrayList.get(i12)));
            } else if (arrayList.size() > i10 && i12 == arrayList.size() - i10 && kotlin.jvm.internal.f0.g(((PricePointObj) arrayList.get(i12 - 1)).getPrice(), pricePointObj3.getPrice())) {
                arrayList3.add(new Entry(i12, fP2, arrayList.get(i12)));
            } else {
                arrayList3.add(new Entry(i12, fP2, com.max.xiaoheihe.utils.d.X(R.drawable.drawable_lowest_trend_highlight), arrayList.get(i12)));
            }
            i12++;
            i10 = 1;
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList3, "");
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        lineDataSet.setDrawCircles(false);
        lineDataSet.setHighLightColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color_alpha10));
        lineDataSet.setHighlightLineWidth(6.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        lineDataSet.setMode(LineDataSet.Mode.STEPPED);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setValueFormatter(g.f85610a);
        lineDataSet.setFillDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_primary15));
        arrayList2.add(lineDataSet);
        LineData lineData = new LineData(arrayList2);
        lineChart.setExtraRightOffset(20.0f);
        lineChart.setData(lineData);
        PriceTrendMarkerV2View priceTrendMarkerV2View = new PriceTrendMarkerV2View(this.f85587b, lineChart.getXAxis().getValueFormatter());
        priceTrendMarkerV2View.setChartView(lineChart);
        lineChart.setMarker(priceTrendMarkerV2View);
        lineChart.invalidate();
    }

    private final void G(ImageView imageView, ViewGroup viewGroup, GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{imageView, viewGroup, globalRegionPriceObj}, this, changeQuickRedirect, false, 35604, new Class[]{ImageView.class, ViewGroup.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (globalRegionPriceObj.isExpand() && com.max.hbcommon.utils.c.x(globalRegionPriceObj.getHas_history())) {
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
        } else if (layoutParams != null) {
            layoutParams.height = 0;
        }
        if (viewGroup != null) {
            viewGroup.setLayoutParams(layoutParams);
        }
        imageView.setRotation(globalRegionPriceObj.isExpand() ? 180.0f : 0.0f);
    }

    private final void H(ViewGroup viewGroup, GlobalRegionPriceObj globalRegionPriceObj) {
        PriceHistoryResult price_history_result;
        if (PatchProxy.proxy(new Object[]{viewGroup, globalRegionPriceObj}, this, changeQuickRedirect, false, 35600, new Class[]{ViewGroup.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported || (price_history_result = globalRegionPriceObj.getPrice_history_result()) == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.tab_time);
        kotlin.jvm.internal.f0.o(viewFindViewById, "vgExpand.findViewById(R.id.tab_time)");
        View viewFindViewById2 = viewGroup.findViewById(R.id.line_chart_trend);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "vgExpand.findViewById(R.id.line_chart_trend)");
        LineChart lineChart = (LineChart) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.tv_no_discount);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "vgExpand.findViewById(R.id.tv_no_discount)");
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.vg_lowest);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "vgExpand.findViewById(R.id.vg_lowest)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.tv_lowest_price_symbol);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "vgExpand.findViewById(R.id.tv_lowest_price_symbol)");
        TextView textView2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.tv_lowest_price);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "vgExpand.findViewById(R.id.tv_lowest_price)");
        TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.tv_lowest_count);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "vgExpand.findViewById(R.id.tv_lowest_count)");
        TextView textView4 = (TextView) viewFindViewById7;
        C((CommonTabLayout) viewFindViewById, globalRegionPriceObj, lineChart, textView);
        if (price_history_result.getLowest_info_v2() != null) {
            linearLayout.setVisibility(0);
            LowestInfoV2Obj lowest_info_v2 = price_history_result.getLowest_info_v2();
            textView3.setText(lowest_info_v2 != null ? lowest_info_v2.getPrice() : null);
            LowestInfoV2Obj lowest_info_v3 = price_history_result.getLowest_info_v2();
            textView2.setText(lowest_info_v3 != null ? lowest_info_v3.getCurrency() : null);
            LowestInfoV2Obj lowest_info_v4 = price_history_result.getLowest_info_v2();
            textView4.setText(lowest_info_v4 != null ? lowest_info_v4.getCount() : null);
        } else {
            linearLayout.setVisibility(8);
        }
        F(globalRegionPriceObj, lineChart, textView);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    private final void I(ViewGroup viewGroup, GlobalRegionPriceObj globalRegionPriceObj) {
        GamePriceView.DiscountType discountType;
        if (PatchProxy.proxy(new Object[]{viewGroup, globalRegionPriceObj}, this, changeQuickRedirect, false, 35599, new Class[]{ViewGroup.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.iv_flag);
        kotlin.jvm.internal.f0.o(viewFindViewById, "vgStatic.findViewById(R.id.iv_flag)");
        View viewFindViewById2 = viewGroup.findViewById(R.id.tv_country);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "vgStatic.findViewById(R.id.tv_country)");
        View viewFindViewById3 = viewGroup.findViewById(R.id.tv_current_cn_price);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "vgStatic.findViewById(R.id.tv_current_cn_price)");
        View viewFindViewById4 = viewGroup.findViewById(R.id.v_cn_price_discount);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "vgStatic.findViewById(R.id.v_cn_price_discount)");
        PriceDiscountView priceDiscountView = (PriceDiscountView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.tv_current_other_price);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "vgStatic.findViewById(R.id.tv_current_other_price)");
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.tv_origin_cn_price);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "vgStatic.findViewById(R.id.tv_origin_cn_price)");
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.tv_origin_other_price);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "vgStatic.findViewById(R.id.tv_origin_other_price)");
        TextView textView3 = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.vg_current_price);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "vgStatic.findViewById(R.id.vg_current_price)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById8;
        com.max.hbimage.b.K(globalRegionPriceObj.getImage(), (ImageView) viewFindViewById);
        ((TextView) viewFindViewById2).setText(globalRegionPriceObj.getRegion_name());
        ((TextView) viewFindViewById3).setText(globalRegionPriceObj.getCurrent());
        String discount = globalRegionPriceObj.getDiscount();
        String tag = globalRegionPriceObj.getTag();
        if (tag == null) {
            discountType = null;
        } else {
            int iHashCode = tag.hashCode();
            if (iHashCode != -2100727050) {
                if (iHashCode != -1096862286) {
                    if (iHashCode == 541685041 && tag.equals("new_lowest")) {
                        discountType = GamePriceView.DiscountType.NewLowest;
                    } else {
                        discountType = null;
                    }
                } else if (tag.equals("lowest")) {
                    discountType = GamePriceView.DiscountType.Lowest;
                } else {
                    discountType = null;
                }
            } else if (tag.equals("super_lowest")) {
                discountType = GamePriceView.DiscountType.SuperLowest;
            } else {
                discountType = null;
            }
        }
        priceDiscountView.setData(discount, discountType);
        textView.setText(globalRegionPriceObj.getFinal_amount());
        textView2.setText(globalRegionPriceObj.getInitial());
        textView3.setText(globalRegionPriceObj.getInitial_amount());
        if (com.max.hbutils.utils.n.p(globalRegionPriceObj.getDiscount()) == 0.0f) {
            viewGroup2.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
        }
    }

    private final void O() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35605, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f85592g == null) {
            this.f85592g = new LoadingDialog(this.f85587b, "");
        }
        LoadingDialog loadingDialog2 = this.f85592g;
        if (loadingDialog2 != null && !loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.f85592g) == null) {
            return;
        }
        loadingDialog.r();
    }

    public static final /* synthetic */ void m(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, GlobalRegionPriceObj globalRegionPriceObj, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter, globalRegionPriceObj, gVar}, null, changeQuickRedirect, true, 35612, new Class[]{GameGlobalPriceV3Adapter.class, GlobalRegionPriceObj.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.v(globalRegionPriceObj, gVar);
    }

    public static final /* synthetic */ void n(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter}, null, changeQuickRedirect, true, 35609, new Class[]{GameGlobalPriceV3Adapter.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.B();
    }

    public static final /* synthetic */ void o(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, GlobalRegionPriceObj globalRegionPriceObj, LineChart lineChart, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter, globalRegionPriceObj, lineChart, textView}, null, changeQuickRedirect, true, 35614, new Class[]{GameGlobalPriceV3Adapter.class, GlobalRegionPriceObj.class, LineChart.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.F(globalRegionPriceObj, lineChart, textView);
    }

    public static final /* synthetic */ void p(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, ImageView imageView, ViewGroup viewGroup, GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter, imageView, viewGroup, globalRegionPriceObj}, null, changeQuickRedirect, true, 35611, new Class[]{GameGlobalPriceV3Adapter.class, ImageView.class, ViewGroup.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.G(imageView, viewGroup, globalRegionPriceObj);
    }

    public static final /* synthetic */ void q(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter, ViewGroup viewGroup, GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter, viewGroup, globalRegionPriceObj}, null, changeQuickRedirect, true, 35610, new Class[]{GameGlobalPriceV3Adapter.class, ViewGroup.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.H(viewGroup, globalRegionPriceObj);
    }

    public static final /* synthetic */ void r(GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter) {
        if (PatchProxy.proxy(new Object[]{gameGlobalPriceV3Adapter}, null, changeQuickRedirect, true, 35613, new Class[]{GameGlobalPriceV3Adapter.class}, Void.TYPE).isSupported) {
            return;
        }
        gameGlobalPriceV3Adapter.O();
    }

    private final void v(GlobalRegionPriceObj globalRegionPriceObj, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{globalRegionPriceObj, gVar}, this, changeQuickRedirect, false, 35607, new Class[]{GlobalRegionPriceObj.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f85588c;
        String str2 = this.f85589d;
        String cc2 = globalRegionPriceObj.getCc();
        a aVar = this.f85591f;
        eVarA.K6(str, str2, cc2, aVar != null ? aVar.a() : null, "720").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(globalRegionPriceObj, gVar));
    }

    public final boolean D() {
        return this.f85594i;
    }

    public void E(@dl.e final com.max.hbcommon.base.adapter.s.e eVar, @dl.e final GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{eVar, globalRegionPriceObj}, this, changeQuickRedirect, false, 35598, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported || eVar == null || globalRegionPriceObj == null) {
            return;
        }
        View viewI = eVar.i(R.id.vg_static);
        kotlin.jvm.internal.f0.o(viewI, "viewHolder.getView(R.id.vg_static)");
        ViewGroup viewGroup = (ViewGroup) viewI;
        View viewI2 = eVar.i(R.id.vg_expand);
        kotlin.jvm.internal.f0.o(viewI2, "viewHolder.getView(R.id.vg_expand)");
        final ViewGroup viewGroup2 = (ViewGroup) viewI2;
        View viewI3 = eVar.i(R.id.iv_expand_arrow);
        kotlin.jvm.internal.f0.o(viewI3, "viewHolder.getView(R.id.iv_expand_arrow)");
        final ImageView imageView = (ImageView) viewI3;
        View viewI4 = eVar.i(R.id.line_chart_trend);
        kotlin.jvm.internal.f0.o(viewI4, "viewHolder.getView(R.id.line_chart_trend)");
        LineChart lineChart = (LineChart) viewI4;
        View viewI5 = eVar.i(R.id.tab_time);
        kotlin.jvm.internal.f0.o(viewI5, "viewHolder.getView(R.id.tab_time)");
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        arrayList.add(new TabEntity("6个月"));
        arrayList.add(new TabEntity("12个月"));
        arrayList.add(new TabEntity(com.max.xiaoheihe.module.game.d0.f87251w));
        ((CommonTabLayout) viewI5).setTabData(arrayList);
        lineChart.setNoDataText("");
        lineChart.setNoDataText("");
        I(viewGroup, globalRegionPriceObj);
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.game.adapter.GameGlobalPriceV3Adapter$onBindViewHolder$1$1$tryExpand$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: GameGlobalPriceV3Adapter.kt */
            public static final class a implements l0.g {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ yh.a<b2> f85616a;

                a(yh.a<b2> aVar) {
                    this.f85616a = aVar;
                }

                @Override // com.max.xiaoheihe.utils.l0.g
                public final void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35622, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    this.f85616a.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35621, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35620, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                final AutoTransition autoTransition = new AutoTransition();
                autoTransition.w0(200L);
                if (globalRegionPriceObj.isExpand()) {
                    this.K(-1);
                    androidx.transition.v.b(this.z(), autoTransition);
                    globalRegionPriceObj.setExpand(false);
                } else {
                    final GlobalRegionPriceObj globalRegionPriceObj2 = globalRegionPriceObj;
                    final GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter = this;
                    final ViewGroup viewGroup3 = viewGroup2;
                    final ImageView imageView2 = imageView;
                    final com.max.hbcommon.base.adapter.s.e eVar2 = eVar;
                    yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.game.adapter.GameGlobalPriceV3Adapter$onBindViewHolder$1$1$tryExpand$1$expand$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35624, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35623, new Class[0], Void.TYPE).isSupported || globalRegionPriceObj2.getPrice_history_result() == null || com.max.hbcommon.utils.c.w(globalRegionPriceObj2.getPrice_history_result().getPrices())) {
                                return;
                            }
                            globalRegionPriceObj2.setExpand(true);
                            androidx.transition.v.b(gameGlobalPriceV3Adapter.z(), autoTransition);
                            GameGlobalPriceV3Adapter.q(gameGlobalPriceV3Adapter, viewGroup3, globalRegionPriceObj2);
                            if (gameGlobalPriceV3Adapter.u() >= 0 && gameGlobalPriceV3Adapter.u() < gameGlobalPriceV3Adapter.getDataList().size()) {
                                GlobalRegionPriceObj globalRegionPriceObj3 = gameGlobalPriceV3Adapter.getDataList().get(gameGlobalPriceV3Adapter.u());
                                globalRegionPriceObj3.setExpand(false);
                                RecyclerView.LayoutManager layoutManager = gameGlobalPriceV3Adapter.z().getLayoutManager();
                                kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                View viewFindViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(gameGlobalPriceV3Adapter.u());
                                if (viewFindViewByPosition != null) {
                                    GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter2 = gameGlobalPriceV3Adapter;
                                    View viewFindViewById = viewFindViewByPosition.findViewById(R.id.iv_expand_arrow);
                                    kotlin.jvm.internal.f0.o(viewFindViewById, "lastExpandView.findViewB…ew>(R.id.iv_expand_arrow)");
                                    ViewGroup viewGroup4 = (ViewGroup) viewFindViewByPosition.findViewById(R.id.vg_expand);
                                    kotlin.jvm.internal.f0.o(globalRegionPriceObj3, "globalRegionPriceObj");
                                    GameGlobalPriceV3Adapter.p(gameGlobalPriceV3Adapter2, (ImageView) viewFindViewById, viewGroup4, globalRegionPriceObj3);
                                }
                            }
                            GameGlobalPriceV3Adapter.p(gameGlobalPriceV3Adapter, imageView2, viewGroup3, globalRegionPriceObj2);
                            gameGlobalPriceV3Adapter.K(eVar2.getAbsoluteAdapterPosition());
                        }
                    };
                    if (globalRegionPriceObj.getPrice_history_result() != null) {
                        aVar2.invoke();
                    } else {
                        GameGlobalPriceV3Adapter.m(this, globalRegionPriceObj, new a(aVar2));
                    }
                }
                GameGlobalPriceV3Adapter.p(this, imageView, viewGroup2, globalRegionPriceObj);
            }
        };
        boolean zX = com.max.hbcommon.utils.c.x(globalRegionPriceObj.getHas_history());
        if (eVar.getAbsoluteAdapterPosition() == 0 && this.f85594i && zX) {
            this.f85594i = false;
            this.f85593h = -1;
            aVar.invoke();
        }
        imageView.setVisibility(zX ? 0 : 8);
        viewGroup.setOnClickListener(new d(zX, globalRegionPriceObj, this, aVar));
        G(imageView, viewGroup2, globalRegionPriceObj);
    }

    public final void J() {
        this.f85593h = -1;
        this.f85594i = true;
    }

    public final void K(int i10) {
        this.f85593h = i10;
    }

    public final void L(boolean z10) {
        this.f85594i = z10;
    }

    public final void M(@dl.e LoadingDialog loadingDialog) {
        this.f85592g = loadingDialog;
    }

    public final void N(@dl.e a aVar) {
        this.f85591f = aVar;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{eVar, globalRegionPriceObj}, this, changeQuickRedirect, false, 35608, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        E(eVar, globalRegionPriceObj);
    }

    @dl.e
    public final String s() {
        return this.f85588c;
    }

    @dl.d
    public final Context t() {
        return this.f85587b;
    }

    public final int u() {
        return this.f85593h;
    }

    @dl.e
    public final LoadingDialog w() {
        return this.f85592g;
    }

    @dl.e
    public final a x() {
        return this.f85591f;
    }

    @dl.e
    public final String y() {
        return this.f85589d;
    }

    @dl.d
    public final RecyclerView z() {
        return this.f85590e;
    }
}
