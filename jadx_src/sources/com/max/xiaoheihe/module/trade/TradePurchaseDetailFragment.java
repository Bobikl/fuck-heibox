package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradePurchaseInfoObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseItemObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradePurchaseDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradePurchaseDetailFragment.kt\ncom/max/xiaoheihe/module/trade/TradePurchaseDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
@o(parameters = 0)
public final class TradePurchaseDetailFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final a f93135u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f93136v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f93137w = "pcs_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f93138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f93139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f93140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f93141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f93142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f93143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private TradePurchaseInfoObj f93144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final List<TradePurchaseItemObj> f93145q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private s<TradePurchaseItemObj> f93146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Context f93147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f93148t;

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final TradePurchaseDetailFragment a(@dl.d String pcs_id) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pcs_id}, this, changeQuickRedirect, false, 45727, new Class[]{String.class}, TradePurchaseDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradePurchaseDetailFragment) patchProxyResultProxy.result;
            }
            f0.p(pcs_id, "pcs_id");
            TradePurchaseDetailFragment tradePurchaseDetailFragment = new TradePurchaseDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TradePurchaseDetailFragment.f93137w, pcs_id);
            tradePurchaseDetailFragment.setArguments(bundle);
            return tradePurchaseDetailFragment;
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45728, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradePurchaseDetailFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45729, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradePurchaseDetailFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradePurchaseDetailFragment f93152b;

            a(TradePurchaseDetailFragment tradePurchaseDetailFragment) {
                this.f93152b = tradePurchaseDetailFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45731, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                TradePurchaseDetailFragment.Y3(this.f93152b);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f93153b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45732, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45730, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(TradePurchaseDetailFragment.this.getContext());
            fVar.y("是否终止求购").l("终止求购将把金额退回至钱包余额内").u("确定", new a(TradePurchaseDetailFragment.this)).o("取消", b.f93153b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class e extends s<TradePurchaseItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(Context context, List<TradePurchaseItemObj> list) {
            super(context, list, R.layout.item_trade_purchase_finished);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradePurchaseItemObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45733, new Class[]{s.e.class, TradePurchaseItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.i(R.id.cl_root);
            View viewI = viewHolder.i(R.id.vg_tag);
            View viewI2 = viewHolder.i(R.id.vg_supply_state);
            TextView textView = (TextView) viewHolder.i(R.id.tv_owned);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_receive_time);
            View viewI3 = viewHolder.i(R.id.v_supply_state);
            if (f0.g(data.getState(), "1")) {
                viewI2.setVisibility(8);
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setText(data.getFinish_time());
            } else {
                viewI2.setVisibility(0);
                viewI3.setBackground(ViewUtils.j(3.0f, com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color)));
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
            TradeSteamInventoryObj asset = data.getAsset();
            Context context = null;
            String float_value = asset != null ? asset.getFloat_value() : null;
            if (float_value == null || float_value.length() == 0) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.H(constraintLayout);
                cVar.M0(R.id.vg_tag);
                cVar.K(R.id.vg_tag, 3, 0, 3);
                cVar.K(R.id.vg_tag, 4, 0, 4);
                cVar.M0(R.id.vg_stickers);
                cVar.L0(R.id.vg_stickers);
                cVar.K(R.id.vg_stickers, 3, R.id.vg_tag, 3);
                cVar.K(R.id.vg_stickers, 4, R.id.vg_tag, 4);
                cVar.K(R.id.vg_stickers, 1, R.id.vg_tag, 2);
                cVar.r(constraintLayout);
                ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            } else {
                androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                cVar2.H(constraintLayout);
                cVar2.M0(R.id.vg_tag);
                cVar2.K(R.id.vg_tag, 3, 0, 3);
                cVar2.M0(R.id.vg_stickers);
                cVar2.L0(R.id.vg_stickers);
                cVar2.K(R.id.vg_stickers, 3, R.id.v_float_bar, 4);
                cVar2.K(R.id.vg_stickers, 2, 0, 2);
                cVar2.r(constraintLayout);
                ViewGroup.LayoutParams layoutParams2 = viewI.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                Context context2 = TradePurchaseDetailFragment.this.f93147s;
                if (context2 == null) {
                    f0.S("mContext");
                    context2 = null;
                }
                marginLayoutParams.topMargin = ViewUtils.f(context2, 18.0f);
            }
            Context context3 = TradePurchaseDetailFragment.this.f93147s;
            if (context3 == null) {
                f0.S("mContext");
                context3 = null;
            }
            TradeSteamInventoryObj asset2 = data.getAsset();
            f0.m(asset2);
            TradeInfoUtilKt.B(context3, viewHolder, asset2, false, 8, null);
            Context context4 = TradePurchaseDetailFragment.this.f93147s;
            if (context4 == null) {
                f0.S("mContext");
                context4 = null;
            }
            TradeSteamInventoryObj asset3 = data.getAsset();
            f0.m(asset3);
            TradeInfoUtilKt.u(context4, viewHolder, asset3);
            Context context5 = TradePurchaseDetailFragment.this.f93147s;
            if (context5 == null) {
                f0.S("mContext");
            } else {
                context = context5;
            }
            TradeSteamInventoryObj asset4 = data.getAsset();
            f0.m(asset4);
            TradeInfoUtilKt.z(context, viewHolder, asset4, false);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradePurchaseItemObj tradePurchaseItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradePurchaseItemObj}, this, changeQuickRedirect, false, 45734, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradePurchaseItemObj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class f extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45735, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext((Result) result);
            TradePurchaseDetailFragment.this.dismiss();
            if (TradePurchaseDetailFragment.this.getParentFragment() instanceof TradePurchaseListFragment) {
                Fragment parentFragment = TradePurchaseDetailFragment.this.getParentFragment();
                f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.trade.TradePurchaseListFragment");
                ((TradePurchaseListFragment) parentFragment).U3();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45736, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<TradePurchaseInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45737, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseDetailFragment.this.isActive()) {
                super.onError(e10);
                View view = TradePurchaseDetailFragment.this.f93142n;
                if (view == null) {
                    f0.S("mProgressBar");
                    view = null;
                }
                view.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<TradePurchaseInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45738, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseDetailFragment.this.isActive()) {
                View view = TradePurchaseDetailFragment.this.f93142n;
                if (view == null) {
                    f0.S("mProgressBar");
                    view = null;
                }
                view.setVisibility(8);
                TradePurchaseDetailFragment.this.f93144p = result.getResult();
                TradePurchaseDetailFragment.Z3(TradePurchaseDetailFragment.this);
                TradePurchaseDetailFragment.a4(TradePurchaseDetailFragment.this);
                TradePurchaseDetailFragment.b4(TradePurchaseDetailFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45739, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradePurchaseInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseDetailFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45741, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = TradePurchaseDetailFragment.this.f93147s;
            Context context2 = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            Context context3 = TradePurchaseDetailFragment.this.f93147s;
            if (context3 == null) {
                f0.S("mContext");
            } else {
                context2 = context3;
            }
            TradePurchaseInfoObj tradePurchaseInfoObj = TradePurchaseDetailFragment.this.f93144p;
            f0.m(tradePurchaseInfoObj);
            TradeSteamInventoryObj asset = tradePurchaseInfoObj.getAsset();
            f0.m(asset);
            context.startActivity(TradeInfoUtilKt.h(context2, asset.getSpu_id()));
        }
    }

    public static final /* synthetic */ void Y3(TradePurchaseDetailFragment tradePurchaseDetailFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseDetailFragment}, null, changeQuickRedirect, true, 45723, new Class[]{TradePurchaseDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseDetailFragment.e4();
    }

    public static final /* synthetic */ void Z3(TradePurchaseDetailFragment tradePurchaseDetailFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseDetailFragment}, null, changeQuickRedirect, true, 45724, new Class[]{TradePurchaseDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseDetailFragment.g4();
    }

    public static final /* synthetic */ void a4(TradePurchaseDetailFragment tradePurchaseDetailFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseDetailFragment}, null, changeQuickRedirect, true, 45725, new Class[]{TradePurchaseDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseDetailFragment.h4();
    }

    public static final /* synthetic */ void b4(TradePurchaseDetailFragment tradePurchaseDetailFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseDetailFragment}, null, changeQuickRedirect, true, 45726, new Class[]{TradePurchaseDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseDetailFragment.i4();
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45717, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f93138j;
        TextView textView = null;
        if (view == null) {
            f0.S("vg_close");
            view = null;
        }
        view.setOnClickListener(new b());
        View view2 = this.f93139k;
        if (view2 == null) {
            f0.S("iv_close");
            view2 = null;
        }
        view2.setOnClickListener(new c());
        TextView textView2 = this.f93140l;
        if (textView2 == null) {
            f0.S("tv_action");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(new d());
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45722, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = i.a();
        String str = this.f93148t;
        if (str == null) {
            f0.S("mPcsId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.q0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45718, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = i.a();
        String str = this.f93148t;
        if (str == null) {
            f0.S("mPcsId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.L1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45719, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradePurchaseInfoObj tradePurchaseInfoObj = this.f93144p;
        TextView textView = null;
        if (f0.g(tradePurchaseInfoObj != null ? tradePurchaseInfoObj.getState() : null, "2")) {
            TextView textView2 = this.f93140l;
            if (textView2 == null) {
                f0.S("tv_action");
            } else {
                textView = textView2;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView3 = this.f93140l;
        if (textView3 == null) {
            f0.S("tv_action");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
    }

    private final void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45720, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f93147s;
        View view = null;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        View view2 = this.f93141m;
        if (view2 == null) {
            f0.S("vg_item");
            view2 = null;
        }
        s.e eVar = new s.e(R.layout.fragment_purchase_detail_dialog, view2);
        TradePurchaseInfoObj tradePurchaseInfoObj = this.f93144p;
        f0.m(tradePurchaseInfoObj);
        TradeInfoUtilKt.y(context, eVar, tradePurchaseInfoObj, false, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseDetailFragment$refreshDetail$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45740, new Class[0], Object.class);
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
        View view3 = this.f93141m;
        if (view3 == null) {
            f0.S("vg_item");
        } else {
            view = view3;
        }
        view.setOnClickListener(new h());
    }

    private final void i4() {
        List<TradePurchaseItemObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45721, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f93145q.clear();
        TradePurchaseInfoObj tradePurchaseInfoObj = this.f93144p;
        if (tradePurchaseInfoObj != null && (list = tradePurchaseInfoObj.getList()) != null) {
            this.f93145q.addAll(list);
        }
        View view = null;
        if (this.f93145q.isEmpty()) {
            View view2 = this.f93143o;
            if (view2 == null) {
                f0.S("empty_view");
            } else {
                view = view2;
            }
            view.setVisibility(0);
        } else {
            View view3 = this.f93143o;
            if (view3 == null) {
                f0.S("empty_view");
            } else {
                view = view3;
            }
            view.setVisibility(8);
        }
        s<TradePurchaseItemObj> sVar = this.f93146r;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 45715, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            String string = arguments.getString(f93137w);
            f0.m(string);
            this.f93148t = string;
        }
        Context context = getContext();
        f0.m(context);
        this.f93147s = context;
        return inflater.inflate(R.layout.fragment_purchase_detail_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 45716, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rv);
        f0.n(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_close);
        f0.o(viewFindViewById2, "view.findViewById(R.id.vg_close)");
        this.f93138j = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_progress);
        f0.o(viewFindViewById3, "view.findViewById(R.id.vg_progress)");
        this.f93142n = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_close);
        f0.o(viewFindViewById4, "view.findViewById(R.id.iv_close)");
        this.f93139k = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_action);
        f0.o(viewFindViewById5, "view.findViewById(R.id.tv_action)");
        this.f93140l = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.vg_item);
        f0.o(viewFindViewById6, "view.findViewById(R.id.vg_item)");
        this.f93141m = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.empty_view);
        f0.o(viewFindViewById7, "view.findViewById(R.id.empty_view)");
        this.f93143o = viewFindViewById7;
        d4();
        this.f93146r = new e(getContext(), this.f93145q);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.f93146r);
        f4();
    }
}
