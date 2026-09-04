package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradePurchaseInfoObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseResult;
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

/* JADX INFO: compiled from: TradePurchaseListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradePurchaseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradePurchaseListFragment.kt\ncom/max/xiaoheihe/module/trade/TradePurchaseListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
@o(parameters = 0)
public final class TradePurchaseListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final a f93195k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f93196l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f93197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f93198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f93199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradePurchaseResult f93200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<TradePurchaseInfoObj> f93202g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<TradePurchaseInfoObj> f93203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f93204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f93205j;

    /* JADX INFO: compiled from: TradePurchaseListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ TradePurchaseListFragment b(a aVar, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 45798, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, TradePurchaseListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradePurchaseListFragment) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(z10);
        }

        @dl.d
        public final TradePurchaseListFragment a(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45797, new Class[]{Boolean.TYPE}, TradePurchaseListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradePurchaseListFragment) patchProxyResultProxy.result;
            }
            TradePurchaseListFragment tradePurchaseListFragment = new TradePurchaseListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_finished", z10);
            tradePurchaseListFragment.setArguments(bundle);
            return tradePurchaseListFragment;
        }
    }

    /* JADX INFO: compiled from: TradePurchaseListFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradePurchaseResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45800, new Class[0], Void.TYPE).isSupported && TradePurchaseListFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradePurchaseListFragment.this.f93197b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradePurchaseListFragment.this.f93197b;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45799, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseListFragment.this.isActive()) {
                super.onError(e10);
                TradePurchaseListFragment.T3(TradePurchaseListFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradePurchaseListFragment.this.f93197b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradePurchaseListFragment.this.f93197b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradePurchaseResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45801, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseListFragment.this.isActive()) {
                TradePurchaseListFragment.this.f93200e = result.getResult();
                TradePurchaseListFragment.this.X3();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45802, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradePurchaseResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45803, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradePurchaseListFragment.this.f93201f = 0;
            TradePurchaseListFragment.L3(TradePurchaseListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseListFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45804, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradePurchaseListFragment.this.f93201f += 30;
            TradePurchaseListFragment.L3(TradePurchaseListFragment.this);
        }
    }

    public static final /* synthetic */ void L3(TradePurchaseListFragment tradePurchaseListFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseListFragment}, null, changeQuickRedirect, true, 45795, new Class[]{TradePurchaseListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseListFragment.V3();
    }

    public static final /* synthetic */ void T3(TradePurchaseListFragment tradePurchaseListFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseListFragment}, null, changeQuickRedirect, true, 45796, new Class[]{TradePurchaseListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseListFragment.showError();
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45790, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f93204i ? "1" : "0";
        String str2 = this.f93205j;
        addDisposable((io.reactivex.disposables.b) i.a().i1(str, str2 == null || str2.length() == 0 ? null : this.f93205j, this.f93201f, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45789, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f93197b;
        s<TradePurchaseInfoObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new c());
        SmartRefreshLayout smartRefreshLayout2 = this.f93197b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new d());
        RecyclerView recyclerView = this.f93198c;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f93198c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        Activity activity = this.mContext;
        com.max.hbcommon.base.adapter.i iVar = new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 4.0f), 0, 0);
        iVar.e(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color));
        iVar.g(false);
        RecyclerView recyclerView3 = this.f93198c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(iVar);
        final Activity activity2 = this.mContext;
        final List<TradePurchaseInfoObj> list = this.f93202g;
        this.f93203h = new s<TradePurchaseInfoObj>(activity2, list) { // from class: com.max.xiaoheihe.module.trade.TradePurchaseListFragment$initView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            public void m(@dl.d s.e viewHolder, @dl.d final TradePurchaseInfoObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45805, new Class[]{s.e.class, TradePurchaseInfoObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                Activity mContext = ((com.max.hbcommon.base.d) this.f93209b).mContext;
                f0.o(mContext, "mContext");
                boolean z10 = this.f93209b.f93204i;
                final TradePurchaseListFragment tradePurchaseListFragment = this.f93209b;
                TradeInfoUtilKt.y(mContext, viewHolder, data, z10, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseListFragment$initView$3$onBindViewHolder$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45808, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45807, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        TradePurchaseDetailFragment.a aVar = TradePurchaseDetailFragment.f93135u;
                        String pcs_id = data.getPcs_id();
                        f0.m(pcs_id);
                        aVar.a(pcs_id).show(tradePurchaseListFragment.getChildFragmentManager(), "tag_detail_fragment");
                    }
                });
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradePurchaseInfoObj tradePurchaseInfoObj) {
                if (PatchProxy.proxy(new Object[]{eVar, tradePurchaseInfoObj}, this, changeQuickRedirect, false, 45806, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, tradePurchaseInfoObj);
            }
        };
        RecyclerView recyclerView4 = this.f93198c;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        s<TradePurchaseInfoObj> sVar2 = this.f93203h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView4.setAdapter(sVar);
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f93199d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f93199d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f93199d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        textView.setText(this.f93204i ? "暂未发起求购" : "暂无求购记录");
    }

    public final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45792, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f93198c;
        SmartRefreshLayout smartRefreshLayout = null;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.scrollToPosition(0);
        SmartRefreshLayout smartRefreshLayout2 = this.f93197b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
        } else {
            smartRefreshLayout = smartRefreshLayout2;
        }
        smartRefreshLayout.F();
    }

    public final void X3() {
        ArrayList<TradePurchaseInfoObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45793, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f93201f == 0) {
            this.f93202g.clear();
        }
        TradePurchaseResult tradePurchaseResult = this.f93200e;
        if (tradePurchaseResult != null && (list = tradePurchaseResult.getList()) != null) {
            this.f93202g.addAll(list);
        }
        List<TradePurchaseInfoObj> list2 = this.f93202g;
        if (list2 == null || list2.isEmpty()) {
            Y3();
            return;
        }
        View view = this.f93199d;
        s<TradePurchaseInfoObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradePurchaseInfoObj> sVar2 = this.f93203h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45788, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        Bundle arguments = getArguments();
        this.f93204i = arguments != null ? arguments.getBoolean("is_finished") : false;
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f93197b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f93198c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f93199d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseListFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45810, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45809, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradePurchaseListFragment.this.f93201f = 0;
                TradePurchaseListFragment.L3(TradePurchaseListFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseListFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45812, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 45811, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                TradePurchaseListFragment.this.f93205j = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint("搜索当前待发货饰品");
        }
        W3();
        showLoading();
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45791, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f93201f = 0;
        V3();
    }
}
