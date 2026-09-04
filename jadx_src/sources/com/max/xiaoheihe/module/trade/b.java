package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeBargainHistoryResult;
import com.max.xiaoheihe.bean.trade.TradeBargainOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.util.d0;

/* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final a A = new a(null);
    public static final int B = 8;

    @dl.d
    private static final String C = "order_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f93304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f93305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f93306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f93307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f93308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f93309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f93310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f93311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f93312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f93313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f93314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f93315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f93316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private TradeBargainHistoryResult f93317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Context f93318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f93319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private CountDownTimer f93320z;

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final b a(@dl.d String order_id) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{order_id}, this, changeQuickRedirect, false, 44883, new Class[]{String.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            f0.p(order_id, "order_id");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("order_id", order_id);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.trade.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class C0871b extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0871b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44884, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (b.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44885, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.isActive()) {
                b.W3(b.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44886, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeBargainHistoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44887, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (b.this.isActive()) {
                super.onError(e10);
                View view = b.this.f93305k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<TradeBargainHistoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44888, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.isActive()) {
                View view = b.this.f93305k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
                b.this.f93317w = result.getResult();
                b.a4(b.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44889, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeBargainHistoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44890, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44891, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44892, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.c4(b.this);
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44893, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b bVar = b.this;
            TradeOrderDetailActivity.a aVar = TradeOrderDetailActivity.f93027p2;
            Context context = bVar.f93318x;
            String str = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            String str2 = b.this.f93319y;
            if (str2 == null) {
                f0.S("mOrderId");
            } else {
                str = str2;
            }
            bVar.startActivity(aVar.a(context, str));
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class h extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f93327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(TextView textView, long j10) {
            super(j10, 1000L);
            this.f93327a = textView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            TextView textView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44895, new Class[0], Void.TYPE).isSupported || (textView = this.f93327a) == null) {
                return;
            }
            textView.setText("等待卖家回应还价，剩余时间: 00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 44894, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textView = this.f93327a;
            if (textView == null) {
                return;
            }
            textView.setText("等待卖家回应还价，剩余时间: " + str);
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44896, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            b.V3(b.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBargainOrderDialogFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f93329b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44897, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void V3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 44881, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.d4();
    }

    public static final /* synthetic */ void W3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 44882, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.e4();
    }

    public static final /* synthetic */ void a4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 44880, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.g4();
    }

    public static final /* synthetic */ void c4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 44879, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.i4();
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f93319y;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.s7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0871b()));
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44873, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f93319y;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.K7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93312r;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_trade_price");
            textView = null;
        }
        bb.d.d(textView, 5);
        TextView textView3 = this.f93313s;
        if (textView3 == null) {
            f0.S("tv_bargain_price");
            textView3 = null;
        }
        bb.d.d(textView3, 5);
        View view = this.f93304j;
        if (view == null) {
            f0.S("vg_close");
            view = null;
        }
        view.setOnClickListener(new d());
        View view2 = this.f93306l;
        if (view2 == null) {
            f0.S("iv_close");
            view2 = null;
        }
        view2.setOnClickListener(new e());
        TextView textView4 = this.f93308n;
        if (textView4 == null) {
            f0.S("tv_btn_confirm");
            textView4 = null;
        }
        textView4.setOnClickListener(new f());
        TextView textView5 = this.f93309o;
        if (textView5 == null) {
            f0.S("tv_check_order");
        } else {
            textView2 = textView5;
        }
        textView2.setOnClickListener(new g());
    }

    private final void g4() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44874, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeBargainHistoryResult tradeBargainHistoryResult = this.f93317w;
        TextView textView = null;
        if (tradeBargainHistoryResult != null) {
            Context context2 = this.f93318x;
            if (context2 == null) {
                f0.S("mContext");
                context = null;
            } else {
                context = context2;
            }
            View view = this.f93307m;
            if (view == null) {
                f0.S("vg_item");
                view = null;
            }
            s.e eVar = new s.e(R.layout.fragment_bargain_order_dialog, view);
            TradeSteamInventoryObj sku_info = tradeBargainHistoryResult.getSku_info();
            f0.m(sku_info);
            TradeInfoUtilKt.B(context, eVar, sku_info, false, 8, null);
            Context context3 = this.f93318x;
            if (context3 == null) {
                f0.S("mContext");
                context3 = null;
            }
            View view2 = this.f93307m;
            if (view2 == null) {
                f0.S("vg_item");
                view2 = null;
            }
            s.e eVar2 = new s.e(R.layout.fragment_bargain_order_dialog, view2);
            TradeSteamInventoryObj sku_info2 = tradeBargainHistoryResult.getSku_info();
            f0.m(sku_info2);
            TradeInfoUtilKt.u(context3, eVar2, sku_info2);
            Context context4 = this.f93318x;
            if (context4 == null) {
                f0.S("mContext");
                context4 = null;
            }
            View view3 = this.f93307m;
            if (view3 == null) {
                f0.S("vg_item");
                view3 = null;
            }
            s.e eVar3 = new s.e(R.layout.fragment_bargain_order_dialog, view3);
            TradeSteamInventoryObj sku_info3 = tradeBargainHistoryResult.getSku_info();
            f0.m(sku_info3);
            TradeInfoUtilKt.z(context4, eVar3, sku_info3, true);
        }
        TradeBargainHistoryResult tradeBargainHistoryResult2 = this.f93317w;
        ArrayList<TradeBargainOrderInfoObj> orders = tradeBargainHistoryResult2 != null ? tradeBargainHistoryResult2.getOrders() : null;
        f0.m(orders);
        TradeBargainOrderInfoObj tradeBargainOrderInfoObj = orders.get(0);
        f0.o(tradeBargainOrderInfoObj, "mTradeBargainOrderDetail?.orders!![0]");
        TradeBargainOrderInfoObj tradeBargainOrderInfoObj2 = tradeBargainOrderInfoObj;
        TextView textView2 = this.f93311q;
        if (textView2 == null) {
            f0.S("tv_create_time");
            textView2 = null;
        }
        textView2.setText(w.i(tradeBargainOrderInfoObj2.getCreate_time(), w.f73605l));
        if (f0.g(tradeBargainOrderInfoObj2.getOrder_state(), "1")) {
            TextView textView3 = this.f93310p;
            if (textView3 == null) {
                f0.S("tv_state");
                textView3 = null;
            }
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            TextView textView4 = this.f93310p;
            if (textView4 == null) {
                f0.S("tv_state");
                textView4 = null;
            }
            String time_left = tradeBargainOrderInfoObj2.getTime_left();
            f0.m(time_left);
            h4(textView4, time_left);
            View view4 = this.f93316v;
            if (view4 == null) {
                f0.S("vg_bottom_bar");
                view4 = null;
            }
            view4.setVisibility(0);
            TextView textView5 = this.f93309o;
            if (textView5 == null) {
                f0.S("tv_check_order");
                textView5 = null;
            }
            textView5.setVisibility(8);
            TextView textView6 = this.f93308n;
            if (textView6 == null) {
                f0.S("tv_btn_confirm");
                textView6 = null;
            }
            textView6.setVisibility(0);
        } else if (f0.g(tradeBargainOrderInfoObj2.getOrder_state(), "12")) {
            CountDownTimer countDownTimer = this.f93320z;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            TextView textView7 = this.f93310p;
            if (textView7 == null) {
                f0.S("tv_state");
                textView7 = null;
            }
            textView7.setText("还价成功");
            TextView textView8 = this.f93310p;
            if (textView8 == null) {
                f0.S("tv_state");
                textView8 = null;
            }
            textView8.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            View view5 = this.f93316v;
            if (view5 == null) {
                f0.S("vg_bottom_bar");
                view5 = null;
            }
            view5.setVisibility(0);
            TextView textView9 = this.f93309o;
            if (textView9 == null) {
                f0.S("tv_check_order");
                textView9 = null;
            }
            textView9.setVisibility(0);
            TextView textView10 = this.f93308n;
            if (textView10 == null) {
                f0.S("tv_btn_confirm");
                textView10 = null;
            }
            textView10.setVisibility(8);
        } else {
            CountDownTimer countDownTimer2 = this.f93320z;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            TextView textView11 = this.f93310p;
            if (textView11 == null) {
                f0.S("tv_state");
                textView11 = null;
            }
            textView11.setText(tradeBargainOrderInfoObj2.getError_desc());
            TextView textView12 = this.f93310p;
            if (textView12 == null) {
                f0.S("tv_state");
                textView12 = null;
            }
            textView12.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
            View view6 = this.f93316v;
            if (view6 == null) {
                f0.S("vg_bottom_bar");
                view6 = null;
            }
            view6.setVisibility(4);
        }
        TextView textView13 = this.f93312r;
        if (textView13 == null) {
            f0.S("tv_trade_price");
            textView13 = null;
        }
        textView13.setText(tradeBargainOrderInfoObj2.getCurrent_price());
        TextView textView14 = this.f93312r;
        if (textView14 == null) {
            f0.S("tv_trade_price");
            textView14 = null;
        }
        textView14.getPaint().setFlags(16);
        TextView textView15 = this.f93313s;
        if (textView15 == null) {
            f0.S("tv_bargain_price");
            textView15 = null;
        }
        textView15.setText(tradeBargainOrderInfoObj2.getBargain_price());
        TextView textView16 = this.f93314t;
        if (textView16 == null) {
            f0.S("tv_price1");
            textView16 = null;
        }
        textView16.setText((char) 65509 + tradeBargainOrderInfoObj2.getCurrent_price());
        TextView textView17 = this.f93315u;
        if (textView17 == null) {
            f0.S("tv_price2");
        } else {
            textView = textView17;
        }
        textView.setText((char) 65509 + tradeBargainOrderInfoObj2.getBargain_price());
    }

    private final void h4(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 44875, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (textView.getTag() != null && (textView.getTag() instanceof CountDownTimer)) {
            Object tag = textView.getTag();
            f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
            ((CountDownTimer) tag).cancel();
        }
        CountDownTimer countDownTimerStart = new h(textView, n.r(str) * ((long) 1000)).start();
        this.f93320z = countDownTimerStart;
        textView.setTag(countDownTimerStart);
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44877, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f93318x;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(context).y("是否撤销还价");
        fVarY.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new i());
        fVarY.o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), j.f93329b);
        fVarY.F();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 44870, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            String string = arguments.getString("order_id");
            f0.m(string);
            this.f93319y = string;
        }
        Context context = getContext();
        f0.m(context);
        this.f93318x = context;
        return inflater.inflate(R.layout.fragment_bargain_order_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44876, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer countDownTimer = this.f93320z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 44871, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.vg_close);
        f0.o(viewFindViewById, "view.findViewById(R.id.vg_close)");
        this.f93304j = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_close);
        f0.o(viewFindViewById2, "view.findViewById(R.id.iv_close)");
        this.f93306l = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.cl_root);
        f0.o(viewFindViewById3, "view.findViewById(R.id.cl_root)");
        this.f93307m = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_btn_confirm);
        f0.o(viewFindViewById4, "view.findViewById(R.id.tv_btn_confirm)");
        this.f93308n = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_check_order);
        f0.o(viewFindViewById5, "view.findViewById(R.id.tv_check_order)");
        this.f93309o = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_state);
        f0.o(viewFindViewById6, "view.findViewById(R.id.tv_state)");
        this.f93310p = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_create_time);
        f0.o(viewFindViewById7, "view.findViewById(R.id.tv_create_time)");
        this.f93311q = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_trade_price);
        f0.o(viewFindViewById8, "view.findViewById(R.id.tv_trade_price)");
        this.f93312r = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_bargain_price);
        f0.o(viewFindViewById9, "view.findViewById(R.id.tv_bargain_price)");
        this.f93313s = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_price1);
        f0.o(viewFindViewById10, "view.findViewById(R.id.tv_price1)");
        this.f93314t = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tv_price2);
        f0.o(viewFindViewById11, "view.findViewById(R.id.tv_price2)");
        this.f93315u = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.vg_progress);
        f0.o(viewFindViewById12, "view.findViewById(R.id.vg_progress)");
        this.f93305k = viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.vg_bottom_bar);
        f0.o(viewFindViewById13, "view.findViewById(R.id.vg_bottom_bar)");
        this.f93316v = viewFindViewById13;
        f4();
        e4();
    }
}
