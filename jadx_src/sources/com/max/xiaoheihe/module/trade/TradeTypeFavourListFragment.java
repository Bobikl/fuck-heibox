package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import yh.l;

/* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeTypeFavourListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeFavourListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeTypeFavourListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
@o(parameters = 0)
public final class TradeTypeFavourListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f93254j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f93255k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f93256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f93257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f93258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradeSteamInventoryResult f93259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f93261g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<TradeSteamInventoryObj> f93262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private String f93263i;

    /* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final TradeTypeFavourListFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45980, new Class[0], TradeTypeFavourListFragment.class);
            return patchProxyResultProxy.isSupported ? (TradeTypeFavourListFragment) patchProxyResultProxy.result : new TradeTypeFavourListFragment();
        }
    }

    /* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45982, new Class[0], Void.TYPE).isSupported && TradeTypeFavourListFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeTypeFavourListFragment.this.f93256b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeTypeFavourListFragment.this.f93256b;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45981, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeTypeFavourListFragment.this.isActive()) {
                super.onError(e10);
                TradeTypeFavourListFragment.R3(TradeTypeFavourListFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeTypeFavourListFragment.this.f93256b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeTypeFavourListFragment.this.f93256b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45983, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeTypeFavourListFragment.this.isActive()) {
                TradeTypeFavourListFragment.this.f93259e = result.getResult();
                TradeTypeFavourListFragment.this.U3();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45984, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45985, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeTypeFavourListFragment.this.f93260f = 0;
            TradeTypeFavourListFragment.L3(TradeTypeFavourListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
    public static final class d extends s<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeTypeFavourListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeTypeFavourListFragment f93267b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93268c;

            a(TradeTypeFavourListFragment tradeTypeFavourListFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93267b = tradeTypeFavourListFragment;
                this.f93268c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45988, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f93267b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f93267b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.h(mContext, this.f93268c.getSpu_id()));
            }
        }

        d(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list, R.layout.item_trade_favour);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45986, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Activity mContext = ((com.max.hbcommon.base.d) TradeTypeFavourListFragment.this).mContext;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.i(R.id.cl_root);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_purchase);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_count);
            View viewI = viewHolder.i(R.id.vg_purchase_info);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_sale_desc);
            TextView textView6 = (TextView) viewHolder.i(R.id.tv_pruchase_price_symbol);
            TextView textView7 = (TextView) viewHolder.i(R.id.tv_pruchase_price);
            bb.d.d(textView2, 5);
            bb.d.d(textView, 5);
            bb.d.d(textView6, 5);
            bb.d.d(textView7, 5);
            viewI.setVisibility(0);
            textView5.setVisibility(0);
            textView.setText(data.getPrice());
            textView7.setText(data.getHigh_purchase_price());
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.H(constraintLayout);
            cVar.M0(R.id.vg_favour_info);
            cVar.K(R.id.vg_favour_info, 3, 0, 3);
            cVar.K(R.id.vg_favour_info, 4, 0, 4);
            cVar.r(constraintLayout);
            textView3.setVisibility(8);
            textView4.setVisibility(0);
            textView4.setText(data.getSell_desc());
            viewHolder.itemView.setOnClickListener(new a(TradeTypeFavourListFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 45987, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeSteamInventoryObj);
        }
    }

    public static final /* synthetic */ void L3(TradeTypeFavourListFragment tradeTypeFavourListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeTypeFavourListFragment}, null, changeQuickRedirect, true, 45978, new Class[]{TradeTypeFavourListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeTypeFavourListFragment.S3();
    }

    public static final /* synthetic */ void R3(TradeTypeFavourListFragment tradeTypeFavourListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeTypeFavourListFragment}, null, changeQuickRedirect, true, 45979, new Class[]{TradeTypeFavourListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeTypeFavourListFragment.showError();
    }

    private final void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45974, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f93263i;
        addDisposable((io.reactivex.disposables.b) i.a().y1("spu", str == null || str.length() == 0 ? null : this.f93263i).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45973, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f93256b;
        s<TradeSteamInventoryObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new c());
        SmartRefreshLayout smartRefreshLayout2 = this.f93256b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        RecyclerView recyclerView = this.f93257c;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f93257c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        this.f93262h = new d(this.mContext, this.f93261g);
        RecyclerView recyclerView3 = this.f93257c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        s<TradeSteamInventoryObj> sVar2 = this.f93262h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView3.setAdapter(sVar);
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45977, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f93258d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f93258d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f93258d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        imageView.setImageResource(R.drawable.common_tag_favour_46x45);
        ((TextView) viewFindViewById2).setText("暂无收藏单品");
    }

    public final void U3() {
        ArrayList<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f93260f == 0) {
            this.f93261g.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.f93259e;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.f93261g.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.f93261g;
        if (list2 == null || list2.isEmpty()) {
            V3();
            return;
        }
        View view = this.f93258d;
        s<TradeSteamInventoryObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradeSteamInventoryObj> sVar2 = this.f93262h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45972, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f93256b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f93257c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f93258d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeTypeFavourListFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45990, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45989, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeTypeFavourListFragment.L3(TradeTypeFavourListFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.TradeTypeFavourListFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45992, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 45991, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                TradeTypeFavourListFragment.this.f93263i = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint("搜索当前关注饰品");
        }
        T3();
        showLoading();
        S3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45975, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f93260f = 0;
        S3();
    }
}
