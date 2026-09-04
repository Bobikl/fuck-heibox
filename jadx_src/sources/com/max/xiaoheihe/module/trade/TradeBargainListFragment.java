package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeBargainHistoryResult;
import com.max.xiaoheihe.bean.trade.TradeBargainOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
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
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import org.apache.tools.ant.util.d0;
import yh.l;

/* JADX INFO: compiled from: TradeBargainListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeBargainListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBargainListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeBargainListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
@o(parameters = 0)
public final class TradeBargainListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f92698n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f92699o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f92700p = "1";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f92701q = "2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f92702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f92703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f92704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradeBargainHistoryResult f92705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f92706f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<TradeBargainOrderInfoObj> f92708h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f92710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f92711k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private ProgressDialog f92713m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<TradeBargainOrderInfoObj> f92707g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final List<CountDownTimer> f92709i = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private String f92712l = f92700p;

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44853, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeBargainListFragment.f92701q;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44852, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeBargainListFragment.f92700p;
        }

        @dl.d
        public final TradeBargainListFragment c(boolean z10, @dl.d String order_type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), order_type}, this, changeQuickRedirect, false, 44854, new Class[]{Boolean.TYPE, String.class}, TradeBargainListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradeBargainListFragment) patchProxyResultProxy.result;
            }
            f0.p(order_type, "order_type");
            TradeBargainListFragment tradeBargainListFragment = new TradeBargainListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_seller", z10);
            bundle.putString("order_type", order_type);
            tradeBargainListFragment.setArguments(bundle);
            return tradeBargainListFragment;
        }
    }

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeBargainHistoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44856, new Class[0], Void.TYPE).isSupported && TradeBargainListFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeBargainListFragment.this.f92702b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeBargainListFragment.this.f92702b;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44855, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBargainListFragment.this.isActive()) {
                super.onError(e10);
                TradeBargainListFragment.X3(TradeBargainListFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeBargainListFragment.this.f92702b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeBargainListFragment.this.f92702b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeBargainHistoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44857, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBargainListFragment.this.isActive()) {
                TradeBargainListFragment.this.f92705e = result.getResult();
                TradeBargainListFragment.this.d4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44858, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeBargainHistoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44859, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeBargainListFragment.this.f92706f = 0;
            TradeBargainListFragment.O3(TradeBargainListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44860, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeBargainListFragment.this.f92706f += 30;
            TradeBargainListFragment.O3(TradeBargainListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class e extends s<TradeBargainOrderInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeBargainListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeBargainListFragment f92718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeBargainOrderInfoObj f92719c;

            a(TradeBargainListFragment tradeBargainListFragment, TradeBargainOrderInfoObj tradeBargainOrderInfoObj) {
                this.f92718b = tradeBargainListFragment;
                this.f92719c = tradeBargainOrderInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                androidx.fragment.app.j jVarA;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44863, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f92718b.f92711k) {
                    g.a aVar = g.K;
                    String order_id = this.f92719c.getOrder_id();
                    f0.m(order_id);
                    jVarA = aVar.a(order_id);
                } else {
                    com.max.xiaoheihe.module.trade.b.a aVar2 = com.max.xiaoheihe.module.trade.b.A;
                    String order_id2 = this.f92719c.getOrder_id();
                    f0.m(order_id2);
                    jVarA = aVar2.a(order_id2);
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92718b).mContext;
                f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                jVarA.show(((BaseActivity) activity).getSupportFragmentManager(), "tag_order_fragment");
            }
        }

        e(Activity activity, List<TradeBargainOrderInfoObj> list) {
            super(activity, list, R.layout.item_bargain_order_list);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeBargainOrderInfoObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44861, new Class[]{s.e.class, TradeBargainOrderInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            TradeSteamInventoryObj sku_info = data.getSku_info();
            f0.m(sku_info);
            Activity mContext = ((com.max.hbcommon.base.d) TradeBargainListFragment.this).mContext;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.B(mContext, viewHolder, sku_info, false, 8, null);
            Activity mContext2 = ((com.max.hbcommon.base.d) TradeBargainListFragment.this).mContext;
            f0.o(mContext2, "mContext");
            TradeInfoUtilKt.u(mContext2, viewHolder, sku_info);
            Activity mContext3 = ((com.max.hbcommon.base.d) TradeBargainListFragment.this).mContext;
            f0.o(mContext3, "mContext");
            TradeInfoUtilKt.z(mContext3, viewHolder, sku_info, false);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_create_time);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_bargain_price);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.i(R.id.cl_root);
            TextView tv_time_left = (TextView) viewHolder.i(R.id.tv_time_left);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_time_left_desc);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_state_desc);
            TextView textView6 = (TextView) viewHolder.i(R.id.tv_respond_bargain);
            bb.d.d(textView, 5);
            bb.d.d(tv_time_left, 5);
            bb.d.d(textView3, 5);
            textView.setText(data.getCurrent_price());
            textView.getPaint().setFlags(16);
            textView3.setText(data.getBargain_price());
            textView2.setText(w.i(data.getCreate_time(), w.f73605l));
            if (sku_info.getFloat_value() == null) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.H(constraintLayout);
                cVar.K(R.id.vg_time_left, 3, 0, 3);
                cVar.K(R.id.vg_time_left, 4, 0, 4);
                cVar.r(constraintLayout);
            } else {
                androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                cVar2.H(constraintLayout);
                cVar2.K(R.id.vg_time_left, 3, 0, 3);
                cVar2.K(R.id.vg_time_left, 4, R.id.v_float_bar, 3);
                cVar2.r(constraintLayout);
            }
            if (TradeBargainListFragment.this.f92711k) {
                TradeBargainListFragment tradeBargainListFragment = TradeBargainListFragment.this;
                f0.o(tv_time_left, "tv_time_left");
                TradeBargainListFragment.L3(tradeBargainListFragment, tv_time_left);
                if (f0.g(data.getOrder_state(), "1")) {
                    textView4.setVisibility(0);
                    tv_time_left.setVisibility(0);
                    textView5.setVisibility(8);
                    tv_time_left.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                    textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                    TradeBargainListFragment tradeBargainListFragment2 = TradeBargainListFragment.this;
                    f0.o(tv_time_left, "tv_time_left");
                    String time_left = data.getTime_left();
                    f0.m(time_left);
                    TradeBargainListFragment.W3(tradeBargainListFragment2, tv_time_left, time_left);
                    textView6.setVisibility(0);
                } else if (f0.g(data.getOrder_state(), "12")) {
                    textView4.setVisibility(8);
                    tv_time_left.setVisibility(8);
                    textView5.setVisibility(0);
                    textView5.setText("已接受还价");
                    textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                    textView6.setVisibility(8);
                } else {
                    textView4.setVisibility(8);
                    tv_time_left.setVisibility(8);
                    textView5.setVisibility(0);
                    textView5.setText(data.getError_desc());
                    textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                    textView6.setVisibility(8);
                }
            } else {
                textView6.setVisibility(8);
                TradeBargainListFragment tradeBargainListFragment3 = TradeBargainListFragment.this;
                f0.o(tv_time_left, "tv_time_left");
                TradeBargainListFragment.L3(tradeBargainListFragment3, tv_time_left);
                if (f0.g(data.getOrder_state(), "1")) {
                    textView4.setVisibility(0);
                    tv_time_left.setVisibility(0);
                    textView5.setVisibility(8);
                    tv_time_left.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    TradeBargainListFragment tradeBargainListFragment4 = TradeBargainListFragment.this;
                    f0.o(tv_time_left, "tv_time_left");
                    String time_left2 = data.getTime_left();
                    f0.m(time_left2);
                    TradeBargainListFragment.W3(tradeBargainListFragment4, tv_time_left, time_left2);
                } else if (f0.g(data.getOrder_state(), "12")) {
                    textView4.setVisibility(8);
                    tv_time_left.setVisibility(8);
                    textView5.setVisibility(0);
                    textView5.setText("还价成功");
                    textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                } else {
                    textView4.setVisibility(8);
                    tv_time_left.setVisibility(8);
                    textView5.setVisibility(0);
                    textView5.setText(data.getError_desc());
                    textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                }
            }
            viewHolder.itemView.setOnClickListener(new a(TradeBargainListFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeBargainOrderInfoObj tradeBargainOrderInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeBargainOrderInfoObj}, this, changeQuickRedirect, false, 44862, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeBargainOrderInfoObj);
        }
    }

    /* JADX INFO: compiled from: TradeBargainListFragment.kt */
    public static final class f extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f92720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(TextView textView, long j10) {
            super(j10, 1000L);
            this.f92720a = textView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            TextView textView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44869, new Class[0], Void.TYPE).isSupported || (textView = this.f92720a) == null) {
                return;
            }
            textView.setText("00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 44868, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textView = this.f92720a;
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }

    public static final /* synthetic */ void L3(TradeBargainListFragment tradeBargainListFragment, TextView textView) {
        if (PatchProxy.proxy(new Object[]{tradeBargainListFragment, textView}, null, changeQuickRedirect, true, 44849, new Class[]{TradeBargainListFragment.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBargainListFragment.Y3(textView);
    }

    public static final /* synthetic */ void O3(TradeBargainListFragment tradeBargainListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeBargainListFragment}, null, changeQuickRedirect, true, 44848, new Class[]{TradeBargainListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBargainListFragment.a4();
    }

    public static final /* synthetic */ void W3(TradeBargainListFragment tradeBargainListFragment, TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{tradeBargainListFragment, textView, str}, null, changeQuickRedirect, true, 44850, new Class[]{TradeBargainListFragment.class, TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBargainListFragment.c4(textView, str);
    }

    public static final /* synthetic */ void X3(TradeBargainListFragment tradeBargainListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeBargainListFragment}, null, changeQuickRedirect, true, 44851, new Class[]{TradeBargainListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBargainListFragment.showError();
    }

    private final void Y3(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 44845, new Class[]{TextView.class}, Void.TYPE).isSupported || textView.getTag() == null || !(textView.getTag() instanceof CountDownTimer)) {
            return;
        }
        Object tag = textView.getTag();
        f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
        ((CountDownTimer) tag).cancel();
    }

    private final void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44844, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f92709i)) {
            return;
        }
        for (CountDownTimer countDownTimer : this.f92709i) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    private final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44840, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!i0.s()) {
            e4();
        } else {
            String str = this.f92710j;
            addDisposable((io.reactivex.disposables.b) i.a().Ea(str == null || str.length() == 0 ? null : this.f92710j, this.f92711k ? "1" : "0", this.f92712l, this.f92706f, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
        }
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44839, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f92702b;
        RecyclerView recyclerView = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new c());
        SmartRefreshLayout smartRefreshLayout2 = this.f92702b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new d());
        RecyclerView recyclerView2 = this.f92703c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView3 = this.f92703c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setBackgroundResource(R.color.background_layer_2_color);
        this.f92708h = new e(this.mContext, this.f92707g);
        RecyclerView recyclerView4 = this.f92703c;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        s<TradeBargainOrderInfoObj> sVar = this.f92708h;
        if (sVar == null) {
            f0.S("mAdapter");
            sVar = null;
        }
        recyclerView4.setAdapter(sVar);
        RecyclerView recyclerView5 = this.f92703c;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
        } else {
            recyclerView = recyclerView5;
        }
        Activity activity = this.mContext;
        recyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 4.0f), 0, 0));
    }

    private final void c4(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 44846, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer timer = new f(textView, n.r(str) * ((long) 1000)).start();
        List<CountDownTimer> list = this.f92709i;
        f0.o(timer, "timer");
        list.add(timer);
        textView.setTag(timer);
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44847, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f92704d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f92704d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f92704d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        textView.setText(f0.g(this.f92712l, f92700p) ? "暂无正在还价饰品" : "暂无还价记录");
    }

    public final void d4() {
        ArrayList<TradeBargainOrderInfoObj> orders;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44842, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f92706f == 0) {
            this.f92707g.clear();
        }
        TradeBargainHistoryResult tradeBargainHistoryResult = this.f92705e;
        if (tradeBargainHistoryResult != null && (orders = tradeBargainHistoryResult.getOrders()) != null) {
            this.f92707g.addAll(orders);
        }
        List<TradeBargainOrderInfoObj> list = this.f92707g;
        if (list == null || list.isEmpty()) {
            e4();
            return;
        }
        View view = this.f92704d;
        s<TradeBargainOrderInfoObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradeBargainOrderInfoObj> sVar2 = this.f92708h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 44838, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            this.f92711k = arguments.getBoolean("is_seller");
            Bundle arguments2 = getArguments();
            f0.m(arguments2);
            String string = arguments2.getString("order_type", f92700p);
            f0.o(string, "arguments!!.getString(\"o…T_ORDER_TYPE_IN_PROGRESS)");
            this.f92712l = string;
        }
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f92702b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f92703c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f92704d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBargainListFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44865, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44864, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeBargainListFragment.this.f92706f = 0;
                TradeBargainListFragment.O3(TradeBargainListFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBargainListFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44867, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 44866, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                TradeBargainListFragment.this.f92710j = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint(f0.g(this.f92712l, f92700p) ? "搜索当前还价饰品" : "搜索当前还价历史饰品");
        }
        b4();
        showLoading();
        a4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44843, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z3();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44841, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f92706f = 0;
        a4();
    }
}
