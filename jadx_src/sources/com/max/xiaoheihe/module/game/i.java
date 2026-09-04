package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.ConsoleCattessePriceHistoryObj;
import com.max.xiaoheihe.bean.game.GameDetailDataObj;
import com.max.xiaoheihe.bean.game.PricePointObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.l5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f87748o = "appid";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f87749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l5 f87750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.adapter.r f87751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<GameDetailDataObj> f87752m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f87753n;

    /* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32305, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
    public class b extends com.max.hbcommon.network.d<Result<ConsoleCattessePriceHistoryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32306, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            i.this.f87750k.f112864c.setVisibility(8);
        }

        public void onNext(Result<ConsoleCattessePriceHistoryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32307, new Class[]{Result.class}, Void.TYPE).isSupported && i.this.isActive()) {
                i.this.f87750k.f112864c.setVisibility(8);
                ConsoleCattessePriceHistoryObj result2 = result.getResult();
                if (result2 != null) {
                    if (com.max.hbcommon.utils.c.w(result2.getPrices()) || result2.getPrices().size() <= 1) {
                        i.this.f87750k.f112868g.setVisibility(8);
                    } else {
                        i.this.f87750k.f112868g.setVisibility(0);
                        i.W3(i.this, result2.getPrices(), com.max.hbutils.utils.n.q(result2.getStart_price()));
                    }
                    if (com.max.hbcommon.utils.c.w(result2.getGame_data())) {
                        return;
                    }
                    i.this.f87752m.clear();
                    i.this.f87752m.addAll(result2.getGame_data());
                    i.this.f87751l.notifyDataSetChanged();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32308, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConsoleCattessePriceHistoryObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
    public class c implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 32309, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "￥" + com.max.hbutils.utils.n.g(f10);
        }
    }

    /* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
    public class d implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f87757a;

        d(List list) {
            this.f87757a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 32310, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            com.max.hbcommon.utils.d.b("zzzztest", "getFormattedValue value==" + f10);
            int i10 = (int) f10;
            return (i10 < 0 || i10 >= this.f87757a.size()) ? "" : com.max.hbutils.utils.w.i(((PricePointObj) this.f87757a.get(i10)).getDate(), com.max.hbutils.utils.w.f73603j);
        }
    }

    /* JADX INFO: compiled from: ConsoleSecondHandCassettePriceDialogFragment.java */
    public class e implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    static /* synthetic */ void W3(i iVar, List list, int i10) {
        if (PatchProxy.proxy(new Object[]{iVar, list, new Integer(i10)}, null, changeQuickRedirect, true, 32304, new Class[]{i.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        iVar.b4(list, i10);
    }

    private void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32302, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().sb(this.f87753n).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public static i a4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32298, new Class[]{String.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("appid", str);
        iVar.setArguments(bundle);
        return iVar;
    }

    private void b4(List<PricePointObj> list, int i10) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{list, new Integer(i10)}, this, changeQuickRedirect, false, 32303, new Class[]{List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PricePointObj pricePointObj = list.get(0);
        list.get(list.size() - 1);
        String price = pricePointObj.getPrice();
        String desc = pricePointObj.getDesc();
        ArrayList arrayList = new ArrayList();
        Long lValueOf = Long.valueOf(com.max.hbutils.utils.n.r(pricePointObj.getDate()));
        PricePointObj pricePointObj2 = new PricePointObj(lValueOf.toString(), price, desc);
        arrayList.add(pricePointObj2);
        float fP = com.max.hbutils.utils.n.p(pricePointObj2.getPrice());
        PricePointObj pricePointObj3 = pricePointObj2;
        for (PricePointObj pricePointObj4 : list) {
            if (com.max.hbutils.utils.n.r(pricePointObj4.getDate()) <= lValueOf.longValue()) {
                pricePointObj2.setPrice(pricePointObj4.getPrice());
                pricePointObj2.setDesc(pricePointObj4.getDesc());
                fP = com.max.hbutils.utils.n.p(pricePointObj2.getPrice());
            } else {
                arrayList.add(pricePointObj4);
                if (com.max.hbutils.utils.n.p(pricePointObj4.getPrice()) > fP) {
                    fP = com.max.hbutils.utils.n.p(pricePointObj4.getPrice());
                }
                if (com.max.hbutils.utils.n.p(pricePointObj4.getPrice()) < com.max.hbutils.utils.n.p(pricePointObj3.getPrice())) {
                    pricePointObj3 = pricePointObj4;
                }
            }
        }
        if (arrayList.size() > 1) {
            if (!((PricePointObj) arrayList.get(0)).getPrice().equals(((PricePointObj) arrayList.get(1)).getPrice())) {
                arrayList.add(0, new PricePointObj(((PricePointObj) arrayList.get(0)).getDate(), ((PricePointObj) arrayList.get(0)).getPrice(), ((PricePointObj) arrayList.get(0)).getDesc()));
            }
            int size = arrayList.size();
            int i11 = size - 1;
            if (!((PricePointObj) arrayList.get(i11)).getPrice().equals(((PricePointObj) arrayList.get(size - 2)).getPrice())) {
                arrayList.add(new PricePointObj(((PricePointObj) arrayList.get(i11)).getDate(), ((PricePointObj) arrayList.get(i11)).getPrice(), ((PricePointObj) arrayList.get(i11)).getDesc()));
            }
        }
        String price2 = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            PricePointObj pricePointObj5 = (PricePointObj) it.next();
            if (price2 != null) {
                if (!price2.equals(pricePointObj5.getPrice())) {
                    z10 = true;
                    break;
                }
            } else {
                price2 = pricePointObj5.getPrice();
            }
        }
        if (z10) {
            this.f87750k.f112866e.setVisibility(8);
        } else {
            this.f87750k.f112866e.setVisibility(0);
        }
        int iCeil = ((int) Math.ceil(fP / 20.0f)) * 20;
        y.a(this.f87750k.f112863b, 5, true, false);
        YAxis axisLeft = this.f87750k.f112863b.getAxisLeft();
        axisLeft.setAxisMinimum(i10);
        axisLeft.setAxisMaximum(iCeil);
        axisLeft.setValueFormatter(new c());
        XAxis xAxis = this.f87750k.f112863b.getXAxis();
        xAxis.setValueFormatter(new d(arrayList));
        xAxis.setLabelCount(Math.min(arrayList.size(), 4), true);
        this.f87750k.f112863b.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            float fP2 = com.max.hbutils.utils.n.p(((PricePointObj) arrayList.get(i12)).getPrice());
            if (!((PricePointObj) arrayList.get(i12)).getDate().equals(pricePointObj3.getDate()) || z11) {
                arrayList3.add(new Entry(i12, fP2, arrayList.get(i12)));
            } else {
                arrayList3.add(new Entry(i12, fP2, com.max.xiaoheihe.utils.d.X(R.drawable.drawable_trend_highlight), arrayList.get(i12)));
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
        lineDataSet.setValueFormatter(new e());
        lineDataSet.setFillDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_primary15));
        arrayList2.add(lineDataSet);
        LineData lineData = new LineData(arrayList2);
        this.f87750k.f112863b.setExtraRightOffset(16.0f);
        this.f87750k.f112863b.setExtraLeftOffset(10.0f);
        this.f87750k.f112863b.setData(lineData);
        PriceTrendMarkerView priceTrendMarkerView = new PriceTrendMarkerView(this.f87749j, this.f87750k.f112863b.getXAxis().getValueFormatter());
        priceTrendMarkerView.setChartView(this.f87750k.f112863b);
        this.f87750k.f112863b.setMarker(priceTrendMarkerView);
        this.f87750k.f112863b.invalidate();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 32299, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f87753n = getArguments().getString("appid");
        }
        this.f87749j = getContext();
        l5 l5VarD = l5.d(layoutInflater, viewGroup, false);
        this.f66868d = l5VarD;
        this.f87750k = l5VarD;
        return l5VarD.getRoot();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32301, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Z3();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 32300, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f87750k.f112869h.setOnClickListener(new a());
        this.f87750k.f112865d.setLayoutManager(new GridLayoutManager(this.f87749j, 4));
        com.max.xiaoheihe.module.game.adapter.r rVar = new com.max.xiaoheihe.module.game.adapter.r(this.f87749j, this.f87752m);
        this.f87751l = rVar;
        this.f87750k.f112865d.setAdapter(rVar);
        if (this.f87750k.f112865d.getItemDecorationCount() == 0) {
            this.f87750k.f112865d.addItemDecoration(new le.a(4, ViewUtils.f(this.f87749j, 4.0f), false));
        }
    }
}
