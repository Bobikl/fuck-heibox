package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeBargainHistoryResult;
import com.max.xiaoheihe.bean.trade.TradeBargainOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import org.apache.tools.ant.util.d0;

/* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final a K = new a(null);
    public static final int L = 8;

    @dl.d
    private static final String M = "order_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinearLayoutManager B;
    private com.max.hbcommon.base.adapter.s<TradeBargainOrderInfoObj> C;

    @dl.e
    private TradeBargainHistoryResult D;
    private Context E;
    private String G;

    @dl.e
    private String H;
    private boolean I;
    private boolean J;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f93388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f93389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f93390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f93391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f93392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ViewGroup f93393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CheckBox f93394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f93395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Switch f93396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewGroup f93397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f93398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ViewGroup f93399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f93400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f93401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f93402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RecyclerView f93403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final List<TradeBargainOrderInfoObj> f93404z = new ArrayList();

    @dl.d
    private final List<String> A = new ArrayList();

    @dl.d
    private final List<CountDownTimer> F = new ArrayList();

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final g a(@dl.d String order_id) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{order_id}, this, changeQuickRedirect, false, 45943, new Class[]{String.class}, g.class);
            if (patchProxyResultProxy.isSupported) {
                return (g) patchProxyResultProxy.result;
            }
            f0.p(order_id, "order_id");
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString("order_id", order_id);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45944, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (g.this.isActive()) {
                g.this.dismiss();
            }
            Context context = g.this.E;
            Context context2 = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            TradeOrderDetailActivity.a aVar = TradeOrderDetailActivity.f93027p2;
            Context context3 = g.this.E;
            if (context3 == null) {
                f0.S("mContext");
            } else {
                context2 = context3;
            }
            context.startActivity(aVar.a(context2, result.getResult().getOrder_id()));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45945, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeBargainHistoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45946, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (g.this.isActive()) {
                super.onError(e10);
                View view = g.this.f93389k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<TradeBargainHistoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45947, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (g.this.isActive()) {
                View view = g.this.f93389k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
                g.this.D = result.getResult();
                g.k4(g.this);
                g.l4(g.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45948, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeBargainHistoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45949, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45950, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f93410b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45952, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45951, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (g.this.A.size() < 1) {
                com.max.hbutils.utils.c.f("请选择一个还价");
                return;
            }
            if (g.this.A.size() <= 1) {
                g.p4(g.this);
                return;
            }
            Context context = g.this.E;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            new com.max.hbcommon.view.a.f(context).y("接受还价失败").l("仅允许选择一个还价接受").u("我知道了", a.f93410b).g(false).F();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.trade.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class ViewOnClickListenerC0873g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0873g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45953, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (g.this.A.size() < 1) {
                com.max.hbutils.utils.c.f("请选择一个还价");
            } else {
                g.r4(g.this);
            }
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45954, new Class[]{View.class}, Void.TYPE).isSupported || (str = g.this.H) == null) {
                return;
            }
            g gVar = g.this;
            TradeOrderDetailActivity.a aVar = TradeOrderDetailActivity.f93027p2;
            Context context = gVar.E;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            gVar.startActivity(aVar.a(context, str));
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45955, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (g.i4(g.this)) {
                g.this.A.clear();
                g.j4(g.this);
            } else {
                for (TradeBargainOrderInfoObj tradeBargainOrderInfoObj : g.this.f93404z) {
                    if (f0.g(tradeBargainOrderInfoObj.getOrder_state(), "1")) {
                        List list = g.this.A;
                        String order_id = tradeBargainOrderInfoObj.getOrder_id();
                        f0.m(order_id);
                        list.add(order_id);
                    }
                }
                g.j4(g.this);
            }
            com.max.hbcommon.base.adapter.s sVar = g.this.C;
            if (sVar == null) {
                f0.S("mAdapter");
                sVar = null;
            }
            sVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class j extends com.max.hbcommon.base.adapter.s<TradeBargainOrderInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeBargainOrderInfoObj f93415b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f93416c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<ImageView> f93417d;

            a(TradeBargainOrderInfoObj tradeBargainOrderInfoObj, g gVar, Ref.ObjectRef<ImageView> objectRef) {
                this.f93415b = tradeBargainOrderInfoObj;
                this.f93416c = gVar;
                this.f93417d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45958, new Class[]{View.class}, Void.TYPE).isSupported && f0.g(this.f93415b.getOrder_state(), "1")) {
                    if (CollectionsKt___CollectionsKt.R1(this.f93416c.A, this.f93415b.getOrder_id())) {
                        w0.a(this.f93416c.A).remove(this.f93415b.getOrder_id());
                    } else {
                        List list = this.f93416c.A;
                        String order_id = this.f93415b.getOrder_id();
                        f0.m(order_id);
                        list.add(order_id);
                    }
                    if (CollectionsKt___CollectionsKt.R1(this.f93416c.A, this.f93415b.getOrder_id())) {
                        this.f93417d.f124891b.setImageResource(R.drawable.account_cb_checked_16_16x16);
                    } else {
                        this.f93417d.f124891b.setImageResource(R.drawable.common_cb_unchecked);
                    }
                    g.j4(this.f93416c);
                }
            }
        }

        j(Context context, List<TradeBargainOrderInfoObj> list) {
            super(context, list, R.layout.item_seller_bargain_order);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.View] */
        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeBargainOrderInfoObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45956, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TradeBargainOrderInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = viewHolder.i(R.id.iv_check);
            TextView textView = (TextView) viewHolder.i(R.id.tv_create_time);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_profit);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_state_desc);
            TextView tv_time_left = (TextView) viewHolder.i(R.id.tv_time_left);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_time_left_desc);
            bb.d.d(textView2, 5);
            bb.d.d(tv_time_left, 5);
            if (!g.this.J) {
                ((ImageView) objectRef.f124891b).setVisibility(8);
            } else if (f0.g(data.getOrder_state(), "1")) {
                ((ImageView) objectRef.f124891b).setVisibility(0);
                if (CollectionsKt___CollectionsKt.R1(g.this.A, data.getOrder_id())) {
                    ((ImageView) objectRef.f124891b).setImageResource(R.drawable.account_cb_checked_16_16x16);
                } else {
                    ((ImageView) objectRef.f124891b).setImageResource(R.drawable.common_cb_unchecked);
                }
            } else {
                ((ImageView) objectRef.f124891b).setVisibility(4);
            }
            textView.setText(w.i(data.getCreate_time(), w.f73605l));
            textView2.setText(data.getBargain_price());
            textView3.setText((char) 65509 + data.getProfit());
            g gVar = g.this;
            f0.o(tv_time_left, "tv_time_left");
            g.X3(gVar, tv_time_left);
            if (f0.g(data.getOrder_state(), "1")) {
                textView5.setVisibility(0);
                tv_time_left.setVisibility(0);
                textView4.setVisibility(8);
                tv_time_left.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                g gVar2 = g.this;
                f0.o(tv_time_left, "tv_time_left");
                String time_left = data.getTime_left();
                f0.m(time_left);
                g.o4(gVar2, tv_time_left, time_left);
            } else if (f0.g(data.getOrder_state(), "12")) {
                textView5.setVisibility(8);
                tv_time_left.setVisibility(8);
                textView4.setVisibility(0);
                textView4.setText("已接受还价");
                textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            } else {
                textView5.setVisibility(8);
                tv_time_left.setVisibility(8);
                textView4.setVisibility(0);
                textView4.setText(data.getError_desc());
                textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
            }
            viewHolder.itemView.setOnClickListener(new a(data, g.this, objectRef));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TradeBargainOrderInfoObj tradeBargainOrderInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeBargainOrderInfoObj}, this, changeQuickRedirect, false, 45957, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeBargainOrderInfoObj);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45959, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g gVar = g.this;
            TradebargainRegisterActivity.a aVar = TradebargainRegisterActivity.f93276c0;
            Context context = gVar.E;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            TradeBargainHistoryResult tradeBargainHistoryResult = g.this.D;
            f0.m(tradeBargainHistoryResult);
            TradeSteamInventoryObj sku_info = tradeBargainHistoryResult.getSku_info();
            f0.m(sku_info);
            gVar.startActivityForResult(aVar.b(context, sku_info.getSku_id()), ItemTradeCenterActivity.U.c());
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45960, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (g.this.J) {
                g.q4(g.this);
            } else {
                g.h4(g.this);
            }
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class m extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45961, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext((Result) result);
            g.Y3(g.this);
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45962, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class n extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f93421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(TextView textView, long j10) {
            super(j10, 1000L);
            this.f93421a = textView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            TextView textView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45964, new Class[0], Void.TYPE).isSupported || (textView = this.f93421a) == null) {
                return;
            }
            textView.setText("00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 45963, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textView = this.f93421a;
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45965, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            g.W3(g.this);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class p implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f93423b = new p();
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45966, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45967, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            g.h4(g.this);
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class r implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f93425b = new r();
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45968, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CheckBox> f93426b;

        s(Ref.ObjectRef<CheckBox> objectRef) {
            this.f93426b = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45969, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            CheckBox checkBox = this.f93426b.f124891b;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CheckBox> f93428c;

        t(Ref.ObjectRef<CheckBox> objectRef) {
            this.f93428c = objectRef;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45970, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            g.m4(g.this, true ^ this.f93428c.f124891b.isChecked());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeSellerBargainOrderDialogFragment.kt */
    public static final class u implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f93429b = new u();
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45971, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private final void A4() {
        TradeBargainHistoryResult tradeBargainHistoryResult;
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45917, new Class[0], Void.TYPE).isSupported || (tradeBargainHistoryResult = this.D) == null) {
            return;
        }
        Context context2 = this.E;
        if (context2 == null) {
            f0.S("mContext");
            context = null;
        } else {
            context = context2;
        }
        View view = this.f93391m;
        if (view == null) {
            f0.S("vg_item");
            view = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.fragment_sell_bargain_order_dialog, view);
        TradeSteamInventoryObj sku_info = tradeBargainHistoryResult.getSku_info();
        f0.m(sku_info);
        TradeInfoUtilKt.B(context, eVar, sku_info, false, 8, null);
        Context context3 = this.E;
        if (context3 == null) {
            f0.S("mContext");
            context3 = null;
        }
        View view2 = this.f93391m;
        if (view2 == null) {
            f0.S("vg_item");
            view2 = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar2 = new com.max.hbcommon.base.adapter.s.e(R.layout.fragment_sell_bargain_order_dialog, view2);
        TradeSteamInventoryObj sku_info2 = tradeBargainHistoryResult.getSku_info();
        f0.m(sku_info2);
        TradeInfoUtilKt.u(context3, eVar2, sku_info2);
        Context context4 = this.E;
        if (context4 == null) {
            f0.S("mContext");
            context4 = null;
        }
        View view3 = this.f93391m;
        if (view3 == null) {
            f0.S("vg_item");
            view3 = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar3 = new com.max.hbcommon.base.adapter.s.e(R.layout.fragment_sell_bargain_order_dialog, view3);
        TradeSteamInventoryObj sku_info3 = tradeBargainHistoryResult.getSku_info();
        f0.m(sku_info3);
        TradeInfoUtilKt.z(context4, eVar3, sku_info3, true);
        TextView textView = this.f93392n;
        if (textView == null) {
            f0.S("tv_item_price");
            textView = null;
        }
        TradeSteamInventoryObj sku_info4 = tradeBargainHistoryResult.getSku_info();
        textView.setText(sku_info4 != null ? sku_info4.getPrice() : null);
    }

    private final void B4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45921, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93398t;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_switch_desc");
            textView = null;
        }
        textView.setText(z10 ? "允许还价" : "禁止还价");
        TextView textView3 = this.f93398t;
        if (textView3 == null) {
            f0.S("tv_switch_desc");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(z10 ? R.color.text_primary_1_color : R.color.text_secondary_1_color));
    }

    private final void C4() {
        ArrayList<TradeBargainOrderInfoObj> orders;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45919, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f93404z.clear();
        this.A.clear();
        TradeBargainHistoryResult tradeBargainHistoryResult = this.D;
        if (tradeBargainHistoryResult != null && (orders = tradeBargainHistoryResult.getOrders()) != null) {
            this.f93404z.addAll(orders);
        }
        this.I = false;
        this.J = false;
        com.max.hbcommon.base.adapter.s<TradeBargainOrderInfoObj> sVar = null;
        this.H = null;
        for (TradeBargainOrderInfoObj tradeBargainOrderInfoObj : this.f93404z) {
            if (!f0.g(tradeBargainOrderInfoObj.getOrder_state(), "12")) {
                if (f0.g(tradeBargainOrderInfoObj.getOrder_state(), "1")) {
                    this.J = true;
                    this.I = false;
                    break;
                }
            } else {
                this.I = true;
                this.J = false;
                this.H = tradeBargainOrderInfoObj.getOrder_id();
                break;
            }
        }
        com.max.hbcommon.base.adapter.s<TradeBargainOrderInfoObj> sVar2 = this.C;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
        D4();
        z4();
    }

    private final void D4() {
        StateObj bargain_state;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (this.I) {
            TextView textView2 = this.f93398t;
            if (textView2 == null) {
                f0.S("tv_switch_desc");
                textView2 = null;
            }
            textView2.setVisibility(8);
            Switch r10 = this.f93396r;
            if (r10 == null) {
                f0.S("sb_bargain");
                r10 = null;
            }
            r10.setVisibility(8);
            TextView textView3 = this.f93395q;
            if (textView3 == null) {
                f0.S("tv_change_price");
                textView3 = null;
            }
            textView3.setVisibility(8);
            ViewGroup viewGroup = this.f93397s;
            if (viewGroup == null) {
                f0.S("vg_switch");
                viewGroup = null;
            }
            viewGroup.setOnClickListener(null);
            return;
        }
        TextView textView4 = this.f93398t;
        if (textView4 == null) {
            f0.S("tv_switch_desc");
            textView4 = null;
        }
        textView4.setVisibility(0);
        Switch r11 = this.f93396r;
        if (r11 == null) {
            f0.S("sb_bargain");
            r11 = null;
        }
        r11.setVisibility(0);
        TextView textView5 = this.f93395q;
        if (textView5 == null) {
            f0.S("tv_change_price");
            textView5 = null;
        }
        textView5.setVisibility(0);
        TradeBargainHistoryResult tradeBargainHistoryResult = this.D;
        boolean z10 = !f0.g((tradeBargainHistoryResult == null || (bargain_state = tradeBargainHistoryResult.getBargain_state()) == null) ? null : bargain_state.getState(), "0");
        Switch r12 = this.f93396r;
        if (r12 == null) {
            f0.S("sb_bargain");
            r12 = null;
        }
        r12.setChecked(z10);
        B4(z10);
        ViewGroup viewGroup2 = this.f93397s;
        if (viewGroup2 == null) {
            f0.S("vg_switch");
            viewGroup2 = null;
        }
        viewGroup2.setOnClickListener(new k());
        TextView textView6 = this.f93395q;
        if (textView6 == null) {
            f0.S("tv_change_price");
        } else {
            textView = textView6;
        }
        textView.setOnClickListener(new l());
    }

    private final void E4(boolean z10) {
        TradeBargainHistoryResult tradeBargainHistoryResult;
        TradeSteamInventoryObj sku_info;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45927, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(this.A, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null);
        String sku_id = null;
        String str = z10 ? null : "0";
        if (!z10 && (tradeBargainHistoryResult = this.D) != null && (sku_info = tradeBargainHistoryResult.getSku_info()) != null) {
            sku_id = sku_info.getSku_id();
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v2(strH3, str, sku_id).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private final void F4(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 45914, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer timer = new n(textView, com.max.hbutils.utils.n.r(str) * ((long) 1000)).start();
        List<CountDownTimer> list = this.F;
        f0.o(timer, "timer");
        list.add(timer);
        textView.setTag(timer);
    }

    private final void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45924, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SpannableString spannableString = new SpannableString("接受还价后将会自动拒绝其余还价。\n请在30min内发起报价，否则将被封禁上架权限");
        Context context = this.E;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(context).y("接受还价").l("接受还价后将会自动拒绝其余还价。\n请在30min内发起报价，否则将被封禁上架权限").u("确定", new o()).o("取消", p.f93423b).g(false).F();
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.delete_red)), 16, spannableString.length(), 34);
        aVarF.f().setText(spannableString);
    }

    private final void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45923, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.E;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        new com.max.hbcommon.view.a.f(context).y("是否改价").l("改价将自动拒绝该饰品下所有未回应还价").u("确定", new q()).o("取消", r.f93425b).g(false).F().f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, android.view.View] */
    private final void I4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45926, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.E;
        Context context2 = null;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_reject_bargain, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context3 = this.E;
        if (context3 == null) {
            f0.S("mContext");
            context3 = null;
        }
        marginLayoutParams.topMargin = ViewUtils.f(context3, 30.0f);
        Context context4 = this.E;
        if (context4 == null) {
            f0.S("mContext");
            context4 = null;
        }
        marginLayoutParams.bottomMargin = ViewUtils.f(context4, 30.0f);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = viewInflate.findViewById(R.id.cb_check);
        viewInflate.setOnClickListener(new s(objectRef));
        viewInflate.setLayoutParams(marginLayoutParams);
        Context context5 = this.E;
        if (context5 == null) {
            f0.S("mContext");
        } else {
            context2 = context5;
        }
        new com.max.hbcommon.view.a.f(context2).y("拒绝该还价").i(viewInflate).u("确定", new t(objectRef)).o("取消", u.f93429b).g(false).F();
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45925, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o6(this.A.get(0)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public static final /* synthetic */ void W3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45940, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.V3();
    }

    public static final /* synthetic */ void X3(g gVar, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gVar, textView}, null, changeQuickRedirect, true, 45934, new Class[]{g.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.s4(textView);
    }

    public static final /* synthetic */ void Y3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45942, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.u4();
    }

    public static final /* synthetic */ void h4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45939, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.v4();
    }

    public static final /* synthetic */ boolean i4(g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45932, new Class[]{g.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gVar.x4();
    }

    public static final /* synthetic */ void j4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45933, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.y4();
    }

    public static final /* synthetic */ void k4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45936, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.A4();
    }

    public static final /* synthetic */ void l4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45937, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.C4();
    }

    public static final /* synthetic */ void m4(g gVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45941, new Class[]{g.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gVar.E4(z10);
    }

    public static final /* synthetic */ void o4(g gVar, TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{gVar, textView, str}, null, changeQuickRedirect, true, 45935, new Class[]{g.class, TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.F4(textView, str);
    }

    public static final /* synthetic */ void p4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45930, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.G4();
    }

    public static final /* synthetic */ void q4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45938, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.H4();
    }

    public static final /* synthetic */ void r4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 45931, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.I4();
    }

    private final void s4(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45913, new Class[]{TextView.class}, Void.TYPE).isSupported || textView.getTag() == null || !(textView.getTag() instanceof CountDownTimer)) {
            return;
        }
        Object tag = textView.getTag();
        f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
        ((CountDownTimer) tag).cancel();
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45912, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.F)) {
            return;
        }
        for (CountDownTimer countDownTimer : this.F) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    private final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45916, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.G;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.K7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45928, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeBargainHistoryResult tradeBargainHistoryResult = this.D;
        Context context = null;
        TradeSteamInventoryObj sku_info = tradeBargainHistoryResult != null ? tradeBargainHistoryResult.getSku_info() : null;
        if (sku_info != null) {
            TradeBargainHistoryResult tradeBargainHistoryResult2 = this.D;
            sku_info.setBargain_state(tradeBargainHistoryResult2 != null ? tradeBargainHistoryResult2.getBargain_state() : null);
        }
        ArrayList<TradeSteamInventoryObj> arrayList = new ArrayList<>();
        TradeBargainHistoryResult tradeBargainHistoryResult3 = this.D;
        TradeSteamInventoryObj sku_info2 = tradeBargainHistoryResult3 != null ? tradeBargainHistoryResult3.getSku_info() : null;
        f0.m(sku_info2);
        arrayList.add(sku_info2);
        ItemPutOnActivity.a aVar = ItemPutOnActivity.f92462y2;
        Context context2 = this.E;
        if (context2 == null) {
            f0.S("mContext");
        } else {
            context = context2;
        }
        startActivityForResult(aVar.a(context, arrayList, true), ItemTradeCenterActivity.U.c());
    }

    private final void w4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93392n;
        if (textView == null) {
            f0.S("tv_item_price");
            textView = null;
        }
        bb.d.d(textView, 5);
        View view = this.f93388j;
        if (view == null) {
            f0.S("vg_close");
            view = null;
        }
        view.setOnClickListener(new d());
        View view2 = this.f93390l;
        if (view2 == null) {
            f0.S("iv_close");
            view2 = null;
        }
        view2.setOnClickListener(new e());
        TextView textView2 = this.f93401w;
        if (textView2 == null) {
            f0.S("tv_accept");
            textView2 = null;
        }
        textView2.setOnClickListener(new f());
        TextView textView3 = this.f93402x;
        if (textView3 == null) {
            f0.S("tv_reject");
            textView3 = null;
        }
        textView3.setOnClickListener(new ViewOnClickListenerC0873g());
        TextView textView4 = this.f93400v;
        if (textView4 == null) {
            f0.S("tv_check_order");
            textView4 = null;
        }
        textView4.setOnClickListener(new h());
        ViewGroup viewGroup = this.f93393o;
        if (viewGroup == null) {
            f0.S("vg_check_all");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(new i());
        Context context = this.E;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        this.B = new LinearLayoutManager(context);
        RecyclerView recyclerView = this.f93403y;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = this.B;
        if (linearLayoutManager == null) {
            f0.S("rvlayoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f93403y;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        Context context2 = this.E;
        if (context2 == null) {
            f0.S("mContext");
            context2 = null;
        }
        recyclerView2.addItemDecoration(new com.max.hbcommon.base.adapter.i(context2));
        RecyclerView recyclerView3 = this.f93403y;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setClipToPadding(false);
        RecyclerView recyclerView4 = this.f93403y;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipChildren(false);
        RecyclerView recyclerView5 = this.f93403y;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        Context context3 = this.E;
        if (context3 == null) {
            f0.S("mContext");
            context3 = null;
        }
        recyclerView5.setPadding(0, 0, 0, ViewUtils.f(context3, 20.0f));
        Context context4 = this.E;
        if (context4 == null) {
            f0.S("mContext");
            context4 = null;
        }
        j jVar = new j(context4, this.f93404z);
        this.C = jVar;
        jVar.setHasStableIds(true);
        RecyclerView recyclerView6 = this.f93403y;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        com.max.hbcommon.base.adapter.s<TradeBargainOrderInfoObj> sVar = this.C;
        if (sVar == null) {
            f0.S("mAdapter");
            sVar = null;
        }
        recyclerView6.setAdapter(sVar);
        RecyclerView recyclerView7 = this.f93403y;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
    }

    private final boolean x4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45918, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (TradeBargainOrderInfoObj tradeBargainOrderInfoObj : this.f93404z) {
            if (f0.g(tradeBargainOrderInfoObj.getOrder_state(), "1") && !CollectionsKt___CollectionsKt.R1(this.A, tradeBargainOrderInfoObj.getOrder_id())) {
                return false;
            }
        }
        return true;
    }

    private final void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CheckBox checkBox = this.f93394p;
        if (checkBox == null) {
            f0.S("cb_all");
            checkBox = null;
        }
        checkBox.setChecked(x4());
    }

    private final void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45920, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = null;
        if (this.I) {
            ViewGroup viewGroup = this.f93399u;
            if (viewGroup == null) {
                f0.S("vg_bottom_bar");
                viewGroup = null;
            }
            viewGroup.setVisibility(0);
            TextView textView = this.f93400v;
            if (textView == null) {
                f0.S("tv_check_order");
            } else {
                view = textView;
            }
            view.setVisibility(0);
            return;
        }
        if (!this.J) {
            ViewGroup viewGroup2 = this.f93399u;
            if (viewGroup2 == null) {
                f0.S("vg_bottom_bar");
            } else {
                view = viewGroup2;
            }
            view.setVisibility(8);
            return;
        }
        ViewGroup viewGroup3 = this.f93399u;
        if (viewGroup3 == null) {
            f0.S("vg_bottom_bar");
            viewGroup3 = null;
        }
        viewGroup3.setVisibility(0);
        TextView textView2 = this.f93400v;
        if (textView2 == null) {
            f0.S("tv_check_order");
        } else {
            view = textView2;
        }
        view.setVisibility(8);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45929, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (ItemTradeCenterActivity.U.c() == i10) {
            u4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 45908, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            String string = arguments.getString("order_id");
            f0.m(string);
            this.G = string;
        }
        Context context = getContext();
        f0.m(context);
        this.E = context;
        return inflater.inflate(R.layout.fragment_sell_bargain_order_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45911, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t4();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 45909, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rv);
        f0.o(viewFindViewById, "view.findViewById(R.id.rv)");
        this.f93403y = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_close);
        f0.o(viewFindViewById2, "view.findViewById(R.id.vg_close)");
        this.f93388j = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_close);
        f0.o(viewFindViewById3, "view.findViewById(R.id.iv_close)");
        this.f93390l = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.cl_root);
        f0.o(viewFindViewById4, "view.findViewById(R.id.cl_root)");
        this.f93391m = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_item_price);
        f0.o(viewFindViewById5, "view.findViewById(R.id.tv_item_price)");
        this.f93392n = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.vg_progress);
        f0.o(viewFindViewById6, "view.findViewById(R.id.vg_progress)");
        this.f93389k = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.vg_check_all);
        f0.o(viewFindViewById7, "view.findViewById(R.id.vg_check_all)");
        this.f93393o = (ViewGroup) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_accept);
        f0.o(viewFindViewById8, "view.findViewById(R.id.tv_accept)");
        this.f93401w = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_reject);
        f0.o(viewFindViewById9, "view.findViewById(R.id.tv_reject)");
        this.f93402x = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_change_price);
        f0.o(viewFindViewById10, "view.findViewById(R.id.tv_change_price)");
        this.f93395q = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.sb_bargain);
        f0.o(viewFindViewById11, "view.findViewById(R.id.sb_bargain)");
        this.f93396r = (Switch) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.vg_switch);
        f0.o(viewFindViewById12, "view.findViewById(R.id.vg_switch)");
        this.f93397s = (ViewGroup) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_switch_desc);
        f0.o(viewFindViewById13, "view.findViewById(R.id.tv_switch_desc)");
        this.f93398t = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.vg_bottom_bar);
        f0.o(viewFindViewById14, "view.findViewById(R.id.vg_bottom_bar)");
        this.f93399u = (ViewGroup) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.tv_check_order);
        f0.o(viewFindViewById15, "view.findViewById(R.id.tv_check_order)");
        this.f93400v = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.cb_all);
        f0.o(viewFindViewById16, "view.findViewById(R.id.cb_all)");
        this.f93394p = (CheckBox) viewFindViewById16;
        w4();
        u4();
    }
}
