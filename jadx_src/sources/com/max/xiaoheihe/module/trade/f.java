package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeOfferDetailResult;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
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
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import org.apache.tools.ant.util.d0;

/* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeOfferDetailDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeOfferDetailDialogFragment.kt\ncom/max/xiaoheihe/module/trade/TradeOfferDetailDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"})
@o(parameters = 0)
public final class f extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final a C = new a(null);
    public static final int D = 8;

    @dl.d
    private static final String E = "toid";

    @dl.d
    private static final String F = "type";

    @dl.d
    private static final String G = "count";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;

    @dl.e
    private CountDownTimer B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f93363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f93364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f93365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f93366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f93367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f93368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f93369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f93370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SmartRefreshLayout f93371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f93372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private TradeOfferDetailResult f93373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f93374u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private s<TradeSteamInventoryObj> f93375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Context f93376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f93377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f93378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f93379z;

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final f a(@dl.d String toid, @dl.d String type, @dl.d String count) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{toid, type, count}, this, changeQuickRedirect, false, 45443, new Class[]{String.class, String.class, String.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            f0.p(toid, "toid");
            f0.p(type, "type");
            f0.p(count, "count");
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putString(f.E, toid);
            bundle.putString("type", type);
            bundle.putString("count", count);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeOfferDetailResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45444, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f.this.isActive()) {
                super.onError(e10);
                View view = f.this.f93372s;
                SmartRefreshLayout smartRefreshLayout = null;
                if (view == null) {
                    f0.S("mProgressBar");
                    view = null;
                }
                view.setVisibility(8);
                SmartRefreshLayout smartRefreshLayout2 = f.this.f93371r;
                if (smartRefreshLayout2 == null) {
                    f0.S("mSmartRefreshLayout");
                    smartRefreshLayout2 = null;
                }
                smartRefreshLayout2.A(0);
                SmartRefreshLayout smartRefreshLayout3 = f.this.f93371r;
                if (smartRefreshLayout3 == null) {
                    f0.S("mSmartRefreshLayout");
                } else {
                    smartRefreshLayout = smartRefreshLayout3;
                }
                smartRefreshLayout.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeOfferDetailResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45445, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = f.this.f93371r;
                View view = null;
                if (smartRefreshLayout == null) {
                    f0.S("mSmartRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout2 = f.this.f93371r;
                if (smartRefreshLayout2 == null) {
                    f0.S("mSmartRefreshLayout");
                    smartRefreshLayout2 = null;
                }
                smartRefreshLayout2.p(0);
                View view2 = f.this.f93372s;
                if (view2 == null) {
                    f0.S("mProgressBar");
                } else {
                    view = view2;
                }
                view.setVisibility(8);
                f.this.f93373t = result.getResult();
                if (f.this.A == 0) {
                    f.c4(f.this);
                }
                f.d4(f.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45446, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeOfferDetailResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45447, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            f.this.A = 0;
            f.V3(f.this);
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45448, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            f.this.A += 30;
            f.V3(f.this);
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45449, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.trade.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class ViewOnClickListenerC0872f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0872f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45450, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45451, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.dismiss();
            Context context = f.this.f93376w;
            String str = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            if (context instanceof TradeAssistantActivity) {
                Context context2 = f.this.f93376w;
                if (context2 == null) {
                    f0.S("mContext");
                    context2 = null;
                }
                TradeAssistantActivity tradeAssistantActivity = (TradeAssistantActivity) context2;
                String str2 = f.this.f93377x;
                if (str2 == null) {
                    f0.S("mToId");
                } else {
                    str = str2;
                }
                tradeAssistantActivity.p2(str);
            }
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class h extends s<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h(Context context, List<TradeSteamInventoryObj> list) {
            super(context, list, R.layout.item_wait_deliver);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45452, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Context context = f.this.f93376w;
            Context context2 = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            TradeInfoUtilKt.B(context, viewHolder, data, false, 8, null);
            Context context3 = f.this.f93376w;
            if (context3 == null) {
                f0.S("mContext");
                context3 = null;
            }
            TradeInfoUtilKt.u(context3, viewHolder, data);
            Context context4 = f.this.f93376w;
            if (context4 == null) {
                f0.S("mContext");
            } else {
                context2 = context4;
            }
            TradeInfoUtilKt.z(context2, viewHolder, data, false);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_time_left);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_time_left_desc);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_amount);
            String amount = data.getAmount();
            if (amount != null && amount.length() != 0) {
                z10 = false;
            }
            if (z10) {
                textView5.setVisibility(4);
            } else {
                textView5.setVisibility(0);
                textView5.setText('x' + data.getAmount());
            }
            bb.d.d(textView2, 5);
            bb.d.d(textView, 5);
            textView.setText(data.getPrice());
            textView3.setVisibility(8);
            textView4.setVisibility(8);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 45453, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeSteamInventoryObj);
        }
    }

    /* JADX INFO: compiled from: TradeOfferDetailDialogFragment.kt */
    public static final class i extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        i(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45455, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TextView textView = f.this.f93367n;
            if (textView == null) {
                f0.S("tv_time_left");
                textView = null;
            }
            textView.setText("剩余回应时间:00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 45454, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textView = f.this.f93367n;
            if (textView == null) {
                f0.S("tv_time_left");
                textView = null;
            }
            textView.setText("剩余回应时间: " + str);
        }
    }

    public static final /* synthetic */ void V3(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 45440, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.g4();
    }

    public static final /* synthetic */ void c4(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 45441, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.i4();
    }

    public static final /* synthetic */ void d4(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 45442, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.j4();
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45436, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f93377x;
        if (str == null) {
            f0.S("mToId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.N5(str, this.A, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45435, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93369p;
        View view = null;
        if (textView == null) {
            f0.S("rv_title");
            textView = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("包含单品 (");
        String str = this.f93379z;
        if (str == null) {
            f0.S("mCount");
            str = null;
        }
        sb2.append(str);
        sb2.append(')');
        textView.setText(sb2.toString());
        SmartRefreshLayout smartRefreshLayout = this.f93371r;
        if (smartRefreshLayout == null) {
            f0.S("mSmartRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new c());
        SmartRefreshLayout smartRefreshLayout2 = this.f93371r;
        if (smartRefreshLayout2 == null) {
            f0.S("mSmartRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new d());
        View view2 = this.f93363j;
        if (view2 == null) {
            f0.S("vg_close");
            view2 = null;
        }
        view2.setOnClickListener(new e());
        View view3 = this.f93364k;
        if (view3 == null) {
            f0.S("iv_close");
            view3 = null;
        }
        view3.setOnClickListener(new ViewOnClickListenerC0872f());
        String strB = TradeAssistantActivity.X.b();
        String str2 = this.f93378y;
        if (str2 == null) {
            f0.S("mType");
            str2 = null;
        }
        if (f0.g(strB, str2)) {
            ImageView imageView = this.f93365l;
            if (imageView == null) {
                f0.S("iv_steam");
                imageView = null;
            }
            imageView.setVisibility(8);
            TextView textView2 = this.f93366m;
            if (textView2 == null) {
                f0.S("tv_join_time");
                textView2 = null;
            }
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            TextView textView3 = this.f93368o;
            if (textView3 == null) {
                f0.S("tv_btn");
                textView3 = null;
            }
            textView3.setText("收货");
            TextView textView4 = this.f93368o;
            if (textView4 == null) {
                f0.S("tv_btn");
                textView4 = null;
            }
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            View view4 = this.f93370q;
            if (view4 == null) {
                f0.S("vg_btn");
                view4 = null;
            }
            view4.setBackgroundResource(R.drawable.text_primary_2dp);
        } else {
            ImageView imageView2 = this.f93365l;
            if (imageView2 == null) {
                f0.S("iv_steam");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            TextView textView5 = this.f93366m;
            if (textView5 == null) {
                f0.S("tv_join_time");
                textView5 = null;
            }
            textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            TextView textView6 = this.f93368o;
            if (textView6 == null) {
                f0.S("tv_btn");
                textView6 = null;
            }
            textView6.setText("发货");
            TextView textView7 = this.f93368o;
            if (textView7 == null) {
                f0.S("tv_btn");
                textView7 = null;
            }
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            View view5 = this.f93370q;
            if (view5 == null) {
                f0.S("vg_btn");
                view5 = null;
            }
            view5.setBackgroundResource(R.drawable.text_primary_2dp);
        }
        View view6 = this.f93370q;
        if (view6 == null) {
            f0.S("vg_btn");
        } else {
            view = view6;
        }
        view.setOnClickListener(new g());
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45438, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93366m;
        if (textView == null) {
            f0.S("tv_join_time");
            textView = null;
        }
        TradeOfferDetailResult tradeOfferDetailResult = this.f93373t;
        textView.setText(tradeOfferDetailResult != null ? tradeOfferDetailResult.getDesc() : null);
        if (this.f93367n == null) {
            f0.S("tv_time_left");
        }
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        TradeOfferDetailResult tradeOfferDetailResult2 = this.f93373t;
        this.B = new i(n.r(tradeOfferDetailResult2 != null ? tradeOfferDetailResult2.getTime_left() : null) * ((long) 1000)).start();
    }

    private final void j4() {
        List<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45439, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.A == 0) {
            this.f93374u.clear();
        }
        TradeOfferDetailResult tradeOfferDetailResult = this.f93373t;
        if (tradeOfferDetailResult != null && (list = tradeOfferDetailResult.getList()) != null) {
            this.f93374u.addAll(list);
        }
        s<TradeSteamInventoryObj> sVar = this.f93375v;
        if (sVar == null) {
            f0.S("mAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 45433, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            String string = arguments.getString(E);
            f0.m(string);
            this.f93377x = string;
            Bundle arguments2 = getArguments();
            f0.m(arguments2);
            String string2 = arguments2.getString("type");
            f0.m(string2);
            this.f93378y = string2;
            Bundle arguments3 = getArguments();
            f0.m(arguments3);
            String string3 = arguments3.getString("count");
            f0.m(string3);
            this.f93379z = string3;
        }
        Context context = getContext();
        f0.m(context);
        this.f93376w = context;
        return inflater.inflate(R.layout.fragment_trade_offer_detail_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45437, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 45434, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rv);
        f0.n(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_close);
        f0.o(viewFindViewById2, "view.findViewById(R.id.vg_close)");
        this.f93363j = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_progress);
        f0.o(viewFindViewById3, "view.findViewById(R.id.vg_progress)");
        this.f93372s = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_close);
        f0.o(viewFindViewById4, "view.findViewById(R.id.iv_close)");
        this.f93364k = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iv_steam);
        f0.o(viewFindViewById5, "view.findViewById(R.id.iv_steam)");
        this.f93365l = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_join_time);
        f0.o(viewFindViewById6, "view.findViewById(R.id.tv_join_time)");
        this.f93366m = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_btn);
        f0.o(viewFindViewById7, "view.findViewById(R.id.tv_btn)");
        this.f93368o = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.rv_title);
        f0.o(viewFindViewById8, "view.findViewById(R.id.rv_title)");
        this.f93369p = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_time_left);
        f0.o(viewFindViewById9, "view.findViewById(R.id.tv_time_left)");
        this.f93367n = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.vg_btn);
        f0.o(viewFindViewById10, "view.findViewById(R.id.vg_btn)");
        this.f93370q = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.srl);
        f0.o(viewFindViewById11, "view.findViewById(R.id.srl)");
        this.f93371r = (SmartRefreshLayout) viewFindViewById11;
        h4();
        Context context = this.f93376w;
        s<TradeSteamInventoryObj> sVar = null;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        this.f93375v = new h(context, this.f93374u);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        s<TradeSteamInventoryObj> sVar2 = this.f93375v;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView.setAdapter(sVar);
        recyclerView.setBackgroundResource(R.color.background_layer_2_color);
        this.A = 0;
        g4();
    }
}
