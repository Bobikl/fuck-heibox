package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.github.mikephil.charting.components.AxisBase;
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
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameGlobalPricesObj;
import com.max.xiaoheihe.bean.game.GlobalRegionPriceObj;
import com.max.xiaoheihe.bean.game.PriceHistoryResult;
import com.max.xiaoheihe.bean.game.PricePointObj;
import com.max.xiaoheihe.bean.game.RegionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: GameGlobalPricesFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class d0 extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f87248t = "steam_appid";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f87249u = "platform";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f87250v = "steam";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f87251w = "全部";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f87252x = "360天";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f87253y = "180天";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f87254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f87255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f87256l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PriceHistoryResult f87258n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y.d f87260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f87261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PopupWindow f87262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e9 f87263s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f87257m = f87252x;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<GlobalRegionPriceObj> f87259o = new ArrayList();

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33156, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33157, new Class[]{View.class}, Void.TYPE).isSupported || d0.this.f87258n == null || com.max.hbcommon.utils.c.w(d0.this.f87258n.getRegions())) {
                return;
            }
            d0.X3(d0.this, view);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class c implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33158, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                d0.this.f87257m = d0.f87253y;
            } else if (i10 == 1) {
                d0.this.f87257m = d0.f87252x;
            } else {
                d0.this.f87257m = d0.f87251w;
            }
            d0.Z3(d0.this);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class d extends com.max.hbcommon.network.d<Result<GameGlobalPricesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33159, new Class[]{Throwable.class}, Void.TYPE).isSupported && d0.this.isActive()) {
                super.onError(th2);
                d0.this.f87263s.f110078c.setVisibility(8);
            }
        }

        public void onNext(Result<GameGlobalPricesObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33160, new Class[]{Result.class}, Void.TYPE).isSupported && d0.this.isActive()) {
                super.onNext(result);
                d0.this.f87263s.f110078c.setVisibility(8);
                if (result.getResult() == null || result.getResult().getPrices() == null) {
                    return;
                }
                d0.this.f87259o.clear();
                d0.this.f87259o.addAll(result.getResult().getPrices());
                d0.this.f87260p.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33161, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameGlobalPricesObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class e extends com.max.hbcommon.network.d<Result<PriceHistoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(Result<PriceHistoryResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33162, new Class[]{Result.class}, Void.TYPE).isSupported && d0.this.isActive()) {
                d0.this.f87258n = result.getResult();
                if (d0.this.f87256l == null && !com.max.hbcommon.utils.c.w(d0.this.f87258n.getRegions())) {
                    d0 d0Var = d0.this;
                    d0Var.f87256l = d0Var.f87258n.getRegions().get(0).getRegion();
                    d0.this.f87263s.f110084i.setText(d0.this.f87258n.getRegions().get(0).getDesc());
                }
                if (com.max.hbcommon.utils.c.w(d0.this.f87258n.getPrices()) || d0.this.f87258n.getPrices().size() <= 1) {
                    d0.this.f87263s.f110086k.setVisibility(8);
                } else {
                    d0.this.f87263s.f110086k.setVisibility(0);
                    d0.Z3(d0.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33163, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PriceHistoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class f implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 33164, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "￥" + com.max.hbutils.utils.n.g(f10);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class g implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f87270a;

        g(List list) {
            this.f87270a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 33165, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            com.max.hbcommon.utils.d.b("zzzztest", "getFormattedValue value==" + f10);
            int i10 = (int) f10;
            return (i10 < 0 || i10 >= this.f87270a.size()) ? "" : com.max.hbutils.utils.w.i(((PricePointObj) this.f87270a.get(i10)).getDate(), com.max.hbutils.utils.w.f73603j);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class h implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesFragment.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RegionObj f87273b;

        i(RegionObj regionObj) {
            this.f87273b = regionObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33166, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d0.f4(d0.this);
            d0.this.f87256l = this.f87273b.getRegion();
            d0.this.f87263s.f110084i.setText(this.f87273b.getDesc());
            d0.g4(d0.this);
        }
    }

    static /* synthetic */ void X3(d0 d0Var, View view) {
        if (PatchProxy.proxy(new Object[]{d0Var, view}, null, changeQuickRedirect, true, 33152, new Class[]{d0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        d0Var.n4(view);
    }

    static /* synthetic */ void Z3(d0 d0Var) {
        if (PatchProxy.proxy(new Object[]{d0Var}, null, changeQuickRedirect, true, 33153, new Class[]{d0.class}, Void.TYPE).isSupported) {
            return;
        }
        d0Var.m4();
    }

    static /* synthetic */ void f4(d0 d0Var) {
        if (PatchProxy.proxy(new Object[]{d0Var}, null, changeQuickRedirect, true, 33154, new Class[]{d0.class}, Void.TYPE).isSupported) {
            return;
        }
        d0Var.j4();
    }

    static /* synthetic */ void g4(d0 d0Var) {
        if (PatchProxy.proxy(new Object[]{d0Var}, null, changeQuickRedirect, true, 33155, new Class[]{d0.class}, Void.TYPE).isSupported) {
            return;
        }
        d0Var.i4();
    }

    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33147, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r0(this.f87254j, this.f87255k).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33148, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i7(this.f87254j, this.f87255k, this.f87256l, "720").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void j4() {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33151, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f87261q;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || (popupWindow = this.f87262r) == null || !popupWindow.isShowing()) {
            return;
        }
        this.f87262r.dismiss();
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33145, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        arrayList.add(new TabEntity("6个月"));
        arrayList.add(new TabEntity("12个月"));
        arrayList.add(new TabEntity(f87251w));
        this.f87263s.f110080e.setTabData(arrayList);
        this.f87263s.f110080e.setOnTabSelectListener(new c());
        this.f87263s.f110080e.setCurrentTab(1);
    }

    public static com.max.hbcommon.base.c l4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 33142, new Class[]{String.class, String.class}, com.max.hbcommon.base.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.c) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.c e0Var = com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.E0, null)) ? new e0() : new d0();
        Bundle bundle = new Bundle();
        bundle.putString(f87248t, str);
        bundle.putString("platform", str2);
        e0Var.setArguments(bundle);
        return e0Var;
    }

    private void m4() {
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33149, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<PricePointObj> prices = this.f87258n.getPrices();
        PricePointObj pricePointObj = prices.get(0);
        PricePointObj pricePointObj2 = prices.get(prices.size() - 1);
        String price = pricePointObj.getPrice();
        String desc = pricePointObj.getDesc();
        ArrayList arrayList = new ArrayList();
        Long lValueOf = f87252x.equals(this.f87257m) ? Long.valueOf(Math.max(com.max.hbutils.utils.n.r(pricePointObj2.getDate()) - 31104000, com.max.hbutils.utils.n.r(pricePointObj.getDate()))) : f87253y.equals(this.f87257m) ? Long.valueOf(Math.max(com.max.hbutils.utils.n.r(pricePointObj2.getDate()) - 15552000, com.max.hbutils.utils.n.r(pricePointObj.getDate()))) : Long.valueOf(com.max.hbutils.utils.n.r(pricePointObj.getDate()));
        PricePointObj pricePointObj3 = new PricePointObj(lValueOf.toString(), price, desc);
        arrayList.add(pricePointObj3);
        float fP = com.max.hbutils.utils.n.p(pricePointObj3.getPrice());
        PricePointObj pricePointObj4 = pricePointObj3;
        for (PricePointObj pricePointObj5 : prices) {
            if (com.max.hbutils.utils.n.r(pricePointObj5.getDate()) <= lValueOf.longValue()) {
                pricePointObj3.setPrice(pricePointObj5.getPrice());
                pricePointObj3.setDesc(pricePointObj5.getDesc());
                fP = com.max.hbutils.utils.n.p(pricePointObj3.getPrice());
            } else {
                arrayList.add(pricePointObj5);
                if (com.max.hbutils.utils.n.p(pricePointObj5.getPrice()) > fP) {
                    fP = com.max.hbutils.utils.n.p(pricePointObj5.getPrice());
                }
                if (com.max.hbutils.utils.n.p(pricePointObj5.getPrice()) < com.max.hbutils.utils.n.p(pricePointObj4.getPrice())) {
                }
            }
            pricePointObj4 = pricePointObj5;
        }
        if (com.max.hbutils.utils.n.p(this.f87258n.getLowest_info() != null ? this.f87258n.getLowest_info().getPrice() : "0") < com.max.hbutils.utils.n.p(pricePointObj4.getPrice())) {
            this.f87263s.f110081f.setText(this.f87257m + "价格低点: " + com.max.hbutils.utils.w.f(this.f87261q, pricePointObj4.getDate()) + " ￥" + pricePointObj4.getPrice());
            this.f87263s.f110082g.setVisibility(8);
        } else {
            this.f87263s.f110081f.setText(this.f87257m + "价格低点: " + com.max.hbutils.utils.w.f(this.f87261q, pricePointObj4.getDate()));
            this.f87263s.f110082g.setText("￥" + pricePointObj4.getPrice() + " 历史最低");
            this.f87263s.f110082g.setVisibility(0);
        }
        if (arrayList.size() > 1) {
            if (!((PricePointObj) arrayList.get(0)).getPrice().equals(((PricePointObj) arrayList.get(1)).getPrice())) {
                arrayList.add(0, new PricePointObj(((PricePointObj) arrayList.get(0)).getDate(), ((PricePointObj) arrayList.get(0)).getPrice(), ((PricePointObj) arrayList.get(0)).getDesc()));
            }
            int size = arrayList.size();
            int i10 = size - 1;
            if (!((PricePointObj) arrayList.get(i10)).getPrice().equals(((PricePointObj) arrayList.get(size - 2)).getPrice())) {
                arrayList.add(new PricePointObj(((PricePointObj) arrayList.get(i10)).getDate(), ((PricePointObj) arrayList.get(i10)).getPrice(), ((PricePointObj) arrayList.get(i10)).getDesc()));
            }
        }
        String price2 = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            PricePointObj pricePointObj6 = (PricePointObj) it.next();
            if (price2 != null) {
                if (!price2.equals(pricePointObj6.getPrice())) {
                    z10 = true;
                    break;
                }
            } else {
                price2 = pricePointObj6.getPrice();
            }
        }
        if (z10) {
            this.f87263s.f110083h.setVisibility(8);
        } else {
            this.f87263s.f110083h.setVisibility(0);
        }
        int iCeil = ((int) Math.ceil(fP / 40.0f)) * 10 * 4;
        y.a(this.f87263s.f110077b, 5, true, false);
        YAxis axisLeft = this.f87263s.f110077b.getAxisLeft();
        axisLeft.setAxisMinimum(0);
        axisLeft.setAxisMaximum(iCeil);
        axisLeft.setValueFormatter(new f());
        XAxis xAxis = this.f87263s.f110077b.getXAxis();
        xAxis.setValueFormatter(new g(arrayList));
        xAxis.setLabelCount(Math.min(arrayList.size(), 4), true);
        this.f87263s.f110077b.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z11 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            float fP2 = com.max.hbutils.utils.n.p(((PricePointObj) arrayList.get(i11)).getPrice());
            if (!((PricePointObj) arrayList.get(i11)).getDate().equals(pricePointObj4.getDate()) || z11) {
                arrayList3.add(new Entry(i11, fP2, arrayList.get(i11)));
            } else {
                arrayList3.add(new Entry(i11, fP2, com.max.xiaoheihe.utils.d.X(R.drawable.drawable_trend_highlight), arrayList.get(i11)));
                z11 = true;
            }
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
        lineDataSet.setValueFormatter(new h());
        lineDataSet.setFillDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_primary15));
        arrayList2.add(lineDataSet);
        LineData lineData = new LineData(arrayList2);
        this.f87263s.f110077b.setExtraRightOffset(20.0f);
        this.f87263s.f110077b.setData(lineData);
        PriceTrendMarkerView priceTrendMarkerView = new PriceTrendMarkerView(this.f87261q, this.f87263s.f110077b.getXAxis().getValueFormatter());
        priceTrendMarkerView.setChartView(this.f87263s.f110077b);
        this.f87263s.f110077b.setMarker(priceTrendMarkerView);
        this.f87263s.f110077b.invalidate();
    }

    private void n4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33150, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f87261q);
        frameLayout.setPadding(0, 0, ViewUtils.f(this.f87261q, 12.0f), 0);
        LinearLayout linearLayout = new LinearLayout(this.f87261q);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.text_primary_alpha90_2dp);
        linearLayout.setPadding(ViewUtils.f(this.f87261q, 10.0f), 0, ViewUtils.f(this.f87261q, 10.0f), 0);
        for (RegionObj regionObj : this.f87258n.getRegions()) {
            TextView textView = new TextView(this.f87261q);
            textView.setText(regionObj.getDesc());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.f87261q, 80.0f), ViewUtils.f(this.f87261q, 34.0f));
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            if (this.f87256l.equals(regionObj.getRegion())) {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            } else {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            }
            textView.setTextSize(1, 12.0f);
            textView.setOnClickListener(new i(regionObj));
            if (linearLayout.getChildCount() > 0) {
                View viewInflate = LayoutInflater.from(this.f87261q).inflate(R.layout.divider_concept, (ViewGroup) linearLayout, false);
                viewInflate.setBackgroundResource(R.color.white_alpha10);
                linearLayout.addView(viewInflate);
            }
            linearLayout.addView(textView, layoutParams);
        }
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, -2, -2, true);
        this.f87262r = popupWindow;
        popupWindow.setTouchable(true);
        this.f87262r.setBackgroundDrawable(new BitmapDrawable());
        this.f87262r.showAsDropDown(view);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 33143, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f87254j = getArguments().getString(f87248t);
            this.f87255k = getArguments().getString("platform");
        }
        this.f87261q = getContext();
        e9 e9VarD = e9.d(layoutInflater, viewGroup, false);
        this.f66868d = e9VarD;
        this.f87263s = e9VarD;
        return e9VarD.getRoot();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33146, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        h4();
        i4();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33144, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_game_global_prices);
        this.f87263s.f110087l.setOnClickListener(new a());
        this.f87260p = new y.d(getContext(), this.f87259o);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.f87260p);
        if ("steam".equals(this.f87255k)) {
            this.f87263s.f110085j.setText("国区价格趋势/全区价格");
            this.f87263s.f110089n.setVisibility(8);
            ((RelativeLayout.LayoutParams) this.f87263s.f110080e.getLayoutParams()).addRule(14);
        } else {
            this.f87263s.f110085j.setText("各区价格趋势/全区价格");
            this.f87263s.f110089n.setVisibility(0);
            ((RelativeLayout.LayoutParams) this.f87263s.f110080e.getLayoutParams()).addRule(9);
            this.f87263s.f110089n.setOnClickListener(new b());
        }
        k4();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f87254j);
        com.max.hbcommon.analytics.d.e("1", lb.d.f131250s3, null, null, jsonObject, null, true);
    }
}
