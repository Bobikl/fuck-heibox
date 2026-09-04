package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.bean.trade.TradeSupplyCheckResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.util.d0;
import yh.l;

/* JADX INFO: compiled from: TradeOrderListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeOrderListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeOrderListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
@o(parameters = 0)
public final class TradeOrderListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f93089n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f93090o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f93091p = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f93092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f93093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f93094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradeSteamInventoryResult f93095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93096f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<TradeSteamInventoryObj> f93098h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f93100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f93101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private LoadingDialog f93102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f93103m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f93097g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final List<CountDownTimer> f93099i = new ArrayList();

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ TradeOrderListFragment c(a aVar, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 45675, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, TradeOrderListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradeOrderListFragment) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(z10);
        }

        public final int a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45673, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeOrderListFragment.f93091p;
        }

        @dl.d
        public final TradeOrderListFragment b(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45674, new Class[]{Boolean.TYPE}, TradeOrderListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradeOrderListFragment) patchProxyResultProxy.result;
            }
            TradeOrderListFragment tradeOrderListFragment = new TradeOrderListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_seller", z10);
            tradeOrderListFragment.setArguments(bundle);
            return tradeOrderListFragment;
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class b extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f93104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TradeSteamInventoryObj f93105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TextView textView, TradeSteamInventoryObj tradeSteamInventoryObj, long j10) {
            super(j10, 1000L);
            this.f93104a = textView;
            this.f93105b = tradeSteamInventoryObj;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            TextView textView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45677, new Class[0], Void.TYPE).isSupported || (textView = this.f93104a) == null) {
                return;
            }
            textView.setText(this.f93105b.getState_desc());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 45676, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textView = this.f93104a;
            if (textView == null) {
                return;
            }
            textView.setText(this.f93105b.getState_desc() + "，剩余时间: " + str);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93107c;

        c(String str) {
            this.f93107c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45678, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeOrderListFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeOrderListFragment.this.f93102l;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45679, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeOrderListFragment.this.isActive()) {
                TradeOrderListFragment.this.f93103m = this.f93107c;
                TradeOrderListFragment.V3(TradeOrderListFragment.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45680, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TradeSupplyCheckResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93109c;

        d(String str) {
            this.f93109c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45681, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeOrderListFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TradeSupplyCheckResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45682, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeOrderListFragment.this.isActive()) {
                if (result.getResult().getMerge_count() > 0) {
                    TradeOrderListFragment.c4(TradeOrderListFragment.this, this.f93109c, String.valueOf(result.getResult().getMerge_count()));
                } else {
                    TradeOrderListFragment.M3(TradeOrderListFragment.this, this.f93109c);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45683, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSupplyCheckResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45685, new Class[0], Void.TYPE).isSupported && TradeOrderListFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeOrderListFragment.this.f93092b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeOrderListFragment.this.f93092b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45684, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeOrderListFragment.this.isActive()) {
                super.onError(e10);
                TradeOrderListFragment.b4(TradeOrderListFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeOrderListFragment.this.f93092b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeOrderListFragment.this.f93092b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45686, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeOrderListFragment.this.isActive()) {
                TradeOrderListFragment.this.f93095e = result.getResult();
                TradeOrderListFragment.this.l4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45687, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class f implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45697, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeOrderListFragment.this.f93096f = 0;
            TradeOrderListFragment.O3(TradeOrderListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class g implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45698, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeOrderListFragment.this.f93096f += 30;
            TradeOrderListFragment.O3(TradeOrderListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class h extends s<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeOrderListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeOrderListFragment f93120b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93121c;

            a(TradeOrderListFragment tradeOrderListFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93120b = tradeOrderListFragment;
                this.f93121c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45701, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                TradeOrderListFragment.d4(this.f93120b, this.f93121c.getOrder_id());
            }
        }

        /* JADX INFO: compiled from: TradeOrderListFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeOrderListFragment f93122b;

            b(TradeOrderListFragment tradeOrderListFragment) {
                this.f93122b = tradeOrderListFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45702, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f93122b).mContext;
                TradeAssistantActivity.a aVar = TradeAssistantActivity.X;
                Activity mContext = ((com.max.hbcommon.base.d) this.f93122b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext));
            }
        }

        /* JADX INFO: compiled from: TradeOrderListFragment.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeOrderListFragment f93123b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93124c;

            c(TradeOrderListFragment tradeOrderListFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93123b = tradeOrderListFragment;
                this.f93124c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45703, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                TradeOrderListFragment tradeOrderListFragment = this.f93123b;
                String order_id = this.f93124c.getOrder_id();
                f0.m(order_id);
                TradeOrderListFragment.N3(tradeOrderListFragment, order_id);
            }
        }

        /* JADX INFO: compiled from: TradeOrderListFragment.kt */
        public static final class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeOrderListFragment f93125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93126c;

            d(TradeOrderListFragment tradeOrderListFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93125b = tradeOrderListFragment;
                this.f93126c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45704, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) this.f93125b).mContext.startActivity(TradeOrderDetailActivity.f93027p2.a(((com.max.hbcommon.base.d) this.f93125b).mContext, this.f93126c.getOrder_id()));
            }
        }

        h(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list, R.layout.item_trade_order_list);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45699, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Activity mContext = ((com.max.hbcommon.base.d) TradeOrderListFragment.this).mContext;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_amount);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_btn_action);
            TextView tv_order_desc = (TextView) viewHolder.i(R.id.tv_order_desc);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_create_time);
            bb.d.d(textView3, 5);
            bb.d.d(textView, 5);
            textView.setText(data.getPrice());
            textView2.setText("共 " + data.getAmount() + " 件");
            tv_order_desc.setText(data.getState_desc());
            String create_time = data.getCreate_time();
            if (create_time == null || create_time.length() == 0) {
                textView5.setText("");
            } else {
                textView5.setText(data.getCreate_time());
            }
            tv_order_desc.setTextColor(com.max.xiaoheihe.utils.d.e1(data.getState_desc_color()));
            if (tv_order_desc.getTag() != null && (tv_order_desc.getTag() instanceof CountDownTimer)) {
                Object tag = tv_order_desc.getTag();
                f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
                ((CountDownTimer) tag).cancel();
            }
            if (!TradeOrderListFragment.this.f93100j && f0.g(data.getState(), "2")) {
                textView4.setVisibility(0);
                String btn_desc = data.getBtn_desc();
                if (btn_desc == null || btn_desc.length() == 0) {
                    textView4.setText("提醒发货");
                } else {
                    textView4.setText(data.getBtn_desc());
                }
                TradeOrderListFragment tradeOrderListFragment = TradeOrderListFragment.this;
                f0.o(tv_order_desc, "tv_order_desc");
                TradeOrderListFragment.L3(tradeOrderListFragment, tv_order_desc, data);
                textView4.setOnClickListener(new a(TradeOrderListFragment.this, data));
            } else if (TradeOrderListFragment.this.f93100j && f0.g(data.getState(), "3")) {
                textView4.setVisibility(0);
                textView4.setText("处理报价");
                TradeOrderListFragment tradeOrderListFragment2 = TradeOrderListFragment.this;
                f0.o(tv_order_desc, "tv_order_desc");
                TradeOrderListFragment.L3(tradeOrderListFragment2, tv_order_desc, data);
                textView4.setOnClickListener(new b(TradeOrderListFragment.this));
            } else if (TradeOrderListFragment.this.f93100j || !f0.g(data.getState(), "4")) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setText("发起报价");
                TradeOrderListFragment tradeOrderListFragment3 = TradeOrderListFragment.this;
                f0.o(tv_order_desc, "tv_order_desc");
                TradeOrderListFragment.L3(tradeOrderListFragment3, tv_order_desc, data);
                textView4.setOnClickListener(new c(TradeOrderListFragment.this, data));
            }
            viewHolder.itemView.setOnClickListener(new d(TradeOrderListFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 45700, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeSteamInventoryObj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93128c;

        i(String str) {
            this.f93128c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45709, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderListFragment.M3(TradeOrderListFragment.this, this.f93128c);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93132c;

        j(String str) {
            this.f93132c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45710, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) TradeOrderListFragment.this).mContext.startActivity(TradeOrderDetailActivity.f93027p2.a(((com.max.hbcommon.base.d) TradeOrderListFragment.this).mContext, this.f93132c));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOrderListFragment.kt */
    public static final class k extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeOrderListFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f93134b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45714, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        k() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45711, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeOrderListFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45712, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeOrderListFragment.this.isActive()) {
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) TradeOrderListFragment.this).mContext);
                String msg = result.getMsg();
                f0.o(msg, "result.msg");
                fVar.l(msg.length() > 0 ? "卖家已收到您的催促，会尽快发货，请耐心等待" : result.getMsg()).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), a.f93134b).g(false);
                fVar.F();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45713, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public static final /* synthetic */ void L3(TradeOrderListFragment tradeOrderListFragment, TextView textView, TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, textView, tradeSteamInventoryObj}, null, changeQuickRedirect, true, 45666, new Class[]{TradeOrderListFragment.class, TextView.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.e4(textView, tradeSteamInventoryObj);
    }

    public static final /* synthetic */ void M3(TradeOrderListFragment tradeOrderListFragment, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, str}, null, changeQuickRedirect, true, 45671, new Class[]{TradeOrderListFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.f4(str);
    }

    public static final /* synthetic */ void N3(TradeOrderListFragment tradeOrderListFragment, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, str}, null, changeQuickRedirect, true, 45668, new Class[]{TradeOrderListFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.g4(str);
    }

    public static final /* synthetic */ void O3(TradeOrderListFragment tradeOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment}, null, changeQuickRedirect, true, 45665, new Class[]{TradeOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.i4();
    }

    public static final /* synthetic */ void V3(TradeOrderListFragment tradeOrderListFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, new Integer(i10)}, null, changeQuickRedirect, true, 45672, new Class[]{TradeOrderListFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.j4(i10);
    }

    public static final /* synthetic */ void b4(TradeOrderListFragment tradeOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment}, null, changeQuickRedirect, true, 45669, new Class[]{TradeOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.showError();
    }

    public static final /* synthetic */ void c4(TradeOrderListFragment tradeOrderListFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, str, str2}, null, changeQuickRedirect, true, 45670, new Class[]{TradeOrderListFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.n4(str, str2);
    }

    public static final /* synthetic */ void d4(TradeOrderListFragment tradeOrderListFragment, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderListFragment, str}, null, changeQuickRedirect, true, 45667, new Class[]{TradeOrderListFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderListFragment.o4(str);
    }

    private final void e4(TextView textView, TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{textView, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 45653, new Class[]{TextView.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer timer = new b(textView, tradeSteamInventoryObj, n.r(tradeSteamInventoryObj.getTime_left()) * ((long) 1000)).start();
        List<CountDownTimer> list = this.f93099i;
        f0.o(timer, "timer");
        list.add(timer);
        textView.setTag(timer);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    private final void f4(String str) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45661, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f93102l;
        if (loadingDialog == null) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            this.f93102l = new LoadingDialog(mContext, "正在发起报价…", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.mContext;
                f0.o(mContext2, "mContext");
                this.f93102l = new LoadingDialog(mContext2, "正在发起报价…", true).r();
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    private final void g4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45659, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private final void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45657, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f93099i)) {
            return;
        }
        for (CountDownTimer countDownTimer : this.f93099i) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45652, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f93100j ? "sell" : "buy";
        String str2 = this.f93101k;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().xa(str, str2 == null || str2.length() == 0 ? null : this.f93101k, this.f93096f, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void j4(final int i10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45662, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 3) {
            j10 = 2;
        } else {
            j10 = i10 < 8 ? 4L : 8L;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f3(this.f93103m).w1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<TradeOfferStateObj>>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment$getOfferState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45688, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f93113b.isActive()) {
                    LoadingDialog loadingDialog = this.f93113b.f93102l;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    Activity mContext = ((com.max.hbcommon.base.d) this.f93113b).mContext;
                    f0.o(mContext, "mContext");
                    TradeInfoUtilKt.q(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment$getOfferState$1$onError$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45691, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }
                    });
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TradeOfferStateObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45689, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f93113b.isActive()) {
                    TradeOfferStateObj result2 = result.getResult();
                    String state = result2 != null ? result2.getState() : null;
                    if (state != null) {
                        int iHashCode = state.hashCode();
                        if (iHashCode == -1867169789) {
                            if (state.equals("success")) {
                                LoadingDialog loadingDialog = this.f93113b.f93102l;
                                if (loadingDialog != null) {
                                    loadingDialog.c();
                                }
                                Activity mContext = ((com.max.hbcommon.base.d) this.f93113b).mContext;
                                f0.o(mContext, "mContext");
                                final TradeOrderListFragment tradeOrderListFragment = this.f93113b;
                                TradeInfoUtilKt.r(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment$getOfferState$1$onNext$2
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45695, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45694, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        tradeOrderListFragment.onRefresh();
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (iHashCode == -1091295072) {
                            if (state.equals("overdue")) {
                                LoadingDialog loadingDialog2 = this.f93113b.f93102l;
                                if (loadingDialog2 != null) {
                                    loadingDialog2.c();
                                }
                                Activity mContext2 = ((com.max.hbcommon.base.d) this.f93113b).mContext;
                                f0.o(mContext2, "mContext");
                                final TradeOrderListFragment tradeOrderListFragment2 = this.f93113b;
                                TradeInfoUtilKt.b0(mContext2, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment$getOfferState$1$onNext$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45693, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45692, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        ((com.max.hbcommon.base.d) tradeOrderListFragment2).mContext.startActivityForResult(TradeUploadSteamActivity.P.a(((com.max.hbcommon.base.d) tradeOrderListFragment2).mContext, tradeOrderListFragment2.f93103m), TradeOrderListFragment.f93089n.a());
                                    }
                                }, 14, null);
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            int i11 = i10;
                            if (i11 <= 12) {
                                TradeOrderListFragment.V3(this.f93113b, i11 + 1);
                                return;
                            }
                            LoadingDialog loadingDialog3 = this.f93113b.f93102l;
                            if (loadingDialog3 != null) {
                                loadingDialog3.c();
                            }
                            Activity mContext3 = ((com.max.hbcommon.base.d) this.f93113b).mContext;
                            f0.o(mContext3, "mContext");
                            TradeInfoUtilKt.s(mContext3, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment$getOfferState$1$onNext$3
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45696, new Class[0], Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }
                            });
                        }
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45690, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TradeOfferStateObj>) obj);
            }
        }));
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45651, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f93092b;
        s<TradeSteamInventoryObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new f());
        SmartRefreshLayout smartRefreshLayout2 = this.f93092b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new g());
        RecyclerView recyclerView = this.f93093c;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f93093c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        this.f93098h = new h(this.mContext, this.f93097g);
        RecyclerView recyclerView3 = this.f93093c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        s<TradeSteamInventoryObj> sVar2 = this.f93098h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView3.setAdapter(sVar);
    }

    private final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45664, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f93094d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f93094d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f93094d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        textView.setText(this.f93100j ? "暂无出售订单" : "暂无购买订单");
    }

    private final void n4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 45660, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y("合并发起报价").l("监测到有 " + str2 + " 个订单可以合并报价，\n是否合并发起报价").u("合并发起", new i(str)).o("查看订单", new j(str)).g(false).F();
    }

    private final void o4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45658, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45650, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        Bundle arguments = getArguments();
        this.f93100j = arguments != null ? arguments.getBoolean("is_seller") : false;
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f93092b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f93093c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f93094d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45706, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45705, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeOrderListFragment.this.f93096f = 0;
                TradeOrderListFragment.O3(TradeOrderListFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderListFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45708, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 45707, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                TradeOrderListFragment.this.f93101k = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint("搜索当前订单");
        }
        k4();
        showLoading();
        i4();
    }

    public final void l4() {
        ArrayList<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45655, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f93096f == 0) {
            this.f93097g.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.f93095e;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.f93097g.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.f93097g;
        if (list2 == null || list2.isEmpty()) {
            m4();
            return;
        }
        View view = this.f93094d;
        s<TradeSteamInventoryObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradeSteamInventoryObj> sVar2 = this.f93098h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45663, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == f93091p && i11 == -1) {
            LoadingDialog loadingDialog = this.f93102l;
            if (loadingDialog == null) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                this.f93102l = new LoadingDialog(mContext, "正在发起报价…", true).r();
            } else {
                if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                    Activity mContext2 = this.mContext;
                    f0.o(mContext2, "mContext");
                    this.f93102l = new LoadingDialog(mContext2, "正在发起报价…", true).r();
                }
            }
            j4(0);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45656, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h4();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45654, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f93096f = 0;
        i4();
    }
}
