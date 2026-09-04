package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.k;
import com.max.hbsearch.l;
import com.max.hbsearch.m;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeItemFlagObj;
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
import ng.j;

/* JADX INFO: compiled from: TradeItemSearchFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeItemSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeItemSearchFragment.kt\ncom/max/xiaoheihe/module/trade/TradeItemSearchFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
@o(parameters = 0)
public final class e extends k {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f93350u = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SmartRefreshLayout f93351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RecyclerView f93352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f93353s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private u<TradeSteamInventoryObj> f93354t;

    /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45370, new Class[0], Void.TYPE).isSupported && e.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = e.this.f93351q;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = e.this.f93351q;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45369, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (e.this.isActive()) {
                super.onError(e10);
                e.J4(e.this);
                SmartRefreshLayout smartRefreshLayout = e.this.f93351q;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = e.this.f93351q;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45371, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (e.this.isActive()) {
                e.I4(e.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45372, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45373, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            e eVar = e.this;
            m mVarF4 = e.F4(eVar);
            eVar.O3(mVarF4 != null ? mVarF4.r() : null);
        }
    }

    /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45374, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            e eVar = e.this;
            m mVarF4 = e.F4(eVar);
            eVar.P3(mVarF4 != null ? mVarF4.r() : null, e.G4(e.this) + 30, 30);
        }
    }

    /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
    public static final class d extends u<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f93359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93360c;

            a(e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93359b = eVar;
                this.f93360c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45379, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f93359b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f93359b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.g(mContext, this.f93360c.getSku_id()));
            }
        }

        /* JADX INFO: compiled from: TradeItemSearchFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f93361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93362c;

            b(e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93361b = eVar;
                this.f93362c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45380, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f93361b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f93361b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.h(mContext, this.f93362c.getSpu_id()));
            }
        }

        d(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45375, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            String sku_id = ((TradeSteamInventoryObj) e.this.f93353s.get(i10)).getSku_id();
            return sku_id != null ? Long.parseLong(sku_id) : i10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45378, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryObj);
        }

        public int n(int i10, @dl.e TradeSteamInventoryObj tradeSteamInventoryObj) {
            return R.layout.item_inventory_spu_item;
        }

        public void o(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45376, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            if (viewHolder.d() == R.layout.item_inventory_item) {
                Activity mContext = ((com.max.hbcommon.base.d) e.this).mContext;
                f0.o(mContext, "mContext");
                TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
                Activity mContext2 = ((com.max.hbcommon.base.d) e.this).mContext;
                f0.o(mContext2, "mContext");
                TradeInfoUtilKt.u(mContext2, viewHolder, data);
                Activity mContext3 = ((com.max.hbcommon.base.d) e.this).mContext;
                f0.o(mContext3, "mContext");
                TradeInfoUtilKt.z(mContext3, viewHolder, data, false);
                Activity mContext4 = ((com.max.hbcommon.base.d) e.this).mContext;
                f0.o(mContext4, "mContext");
                TradeInfoUtilKt.v(mContext4, viewHolder, data);
                viewHolder.itemView.setOnClickListener(new a(e.this, data));
                return;
            }
            Activity mContext5 = ((com.max.hbcommon.base.d) e.this).mContext;
            f0.o(mContext5, "mContext");
            TradeInfoUtilKt.A(mContext5, viewHolder, data, false);
            TextView textView = (TextView) viewHolder.i(R.id.tv_count_desc);
            View viewI = viewHolder.i(R.id.tv_spu_flag);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price);
            bb.d.d(textView2, 5);
            textView2.setText(data.getPrice());
            textView.setText(data.getSell_desc());
            List<TradeItemFlagObj> flags = data.getFlags();
            if (flags != null) {
                TextView textView3 = (TextView) viewI;
                textView3.setVisibility(0);
                textView3.setText(flags.get(0).getDesc());
                textView3.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(flags.get(0).getColor()));
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                ((TextView) viewI).setVisibility(8);
            }
            viewHolder.itemView.setOnClickListener(new b(e.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 45377, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TradeSteamInventoryObj) obj);
        }
    }

    public static final /* synthetic */ m F4(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 45365, new Class[]{e.class}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : eVar.b4();
    }

    public static final /* synthetic */ int G4(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 45366, new Class[]{e.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : eVar.c4();
    }

    public static final /* synthetic */ void I4(e eVar, TradeSteamInventoryResult tradeSteamInventoryResult) {
        if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryResult}, null, changeQuickRedirect, true, 45368, new Class[]{e.class, TradeSteamInventoryResult.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.M4(tradeSteamInventoryResult);
    }

    public static final /* synthetic */ void J4(e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 45367, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.showError();
    }

    private final void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45362, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m mVarB4 = b4();
        O3(mVarB4 != null ? mVarB4.r() : null);
    }

    private final void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45360, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f93351q;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.setBackgroundResource(R.drawable.gradient_white_divider);
        SmartRefreshLayout smartRefreshLayout2 = this.f93351q;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.S(new b());
        SmartRefreshLayout smartRefreshLayout3 = this.f93351q;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.f0(new c());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        RecyclerView recyclerView = this.f93352r;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        int iF = ViewUtils.f(this.mContext, 10.0f);
        RecyclerView recyclerView2 = this.f93352r;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setPadding(iF, iF, ViewUtils.f(this.mContext, 7.0f), ViewUtils.f(this.mContext, 4.0f));
        RecyclerView recyclerView3 = this.f93352r;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView3.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        RecyclerView recyclerView4 = this.f93352r;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.f93352r;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        d dVar = new d(this.mContext, this.f93353s);
        this.f93354t = dVar;
        dVar.setHasStableIds(true);
        RecyclerView recyclerView6 = this.f93352r;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        u<TradeSteamInventoryObj> uVar = this.f93354t;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView6.setAdapter(uVar);
        RecyclerView recyclerView7 = this.f93352r;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
    }

    private final void M4(TradeSteamInventoryResult tradeSteamInventoryResult) {
        ArrayList<TradeSteamInventoryObj> list;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryResult}, this, changeQuickRedirect, false, 45364, new Class[]{TradeSteamInventoryResult.class}, Void.TYPE).isSupported) {
            return;
        }
        if (c4() == 0) {
            this.f93353s.clear();
        }
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.f93353s.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.f93353s;
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            showEmpty();
            return;
        }
        showContentView();
        u<TradeSteamInventoryObj> uVar = this.f93354t;
        SmartRefreshLayout smartRefreshLayout = null;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
        SmartRefreshLayout smartRefreshLayout2 = this.f93351q;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
        } else {
            smartRefreshLayout = smartRefreshLayout2;
        }
        smartRefreshLayout.setVisibility(0);
    }

    @Override // com.max.hbsearch.k
    public void P3(@dl.e String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45363, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            SmartRefreshLayout smartRefreshLayout = this.f93351q;
            if (smartRefreshLayout == null) {
                f0.S("mRefreshLayout");
                smartRefreshLayout = null;
            }
            smartRefreshLayout.setVisibility(8);
            return;
        }
        r4(i10);
        clearCompositeDisposable();
        if (c4() == 0) {
            showLoading();
        }
        addDisposable((io.reactivex.disposables.b) i.a().y9(str, c4(), i11).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public String Y3() {
        return l.O;
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        return null;
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 35;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45359, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.layout_sample_refresh_rv);
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f93351q = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f93352r = (RecyclerView) viewFindViewById2;
        L4();
    }

    @Override // com.max.hbsearch.k
    @dl.d
    public String j4() {
        return "搜索饰品";
    }

    @Override // com.max.hbsearch.k
    public void l4() {
    }

    @Override // com.max.hbsearch.k
    public void m4() {
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45361, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        K4();
    }
}
