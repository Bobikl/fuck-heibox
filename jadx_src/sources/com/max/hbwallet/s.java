package com.max.hbwallet;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbwallet.bean.CouponHistoryResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CouponHistoryFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.t0({"SMAP\nCouponHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponHistoryFragment.kt\ncom/max/hbwallet/CouponHistoryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class s extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f74246h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f74247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f74248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f74249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<MallCouponObj> f74250e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<MallCouponObj> f74251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private CouponHistoryResultObj f74252g;

    /* JADX INFO: compiled from: CouponHistoryFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final s a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.zz, new Class[0], s.class);
            return patchProxyResultProxy.isSupported ? (s) patchProxyResultProxy.result : new s();
        }
    }

    /* JADX INFO: compiled from: CouponHistoryFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CouponHistoryResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Bz, new Class[0], Void.TYPE).isSupported && s.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = s.this.f74247b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = s.this.f74247b;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.Az, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (s.this.isActive()) {
                super.onError(e10);
                s.P3(s.this);
                SmartRefreshLayout smartRefreshLayout = s.this.f74247b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = s.this.f74247b;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<CouponHistoryResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.Cz, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (s.this.isActive()) {
                s.this.f74252g = result.getResult();
                s.this.U3();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Dz, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CouponHistoryResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: CouponHistoryFragment.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<MallCouponObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, List<MallCouponObj> list, int i10) {
            super(activity, list, i10);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MallCouponObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, bb.c.k.Ez, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_time);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_status);
            if (com.max.hbcommon.utils.c.u(data.getDescription())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(data.getDescription());
                textView2.setVisibility(0);
            }
            if (com.max.hbcommon.utils.c.u(data.getTime_desc())) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(data.getTime_desc());
                textView3.setVisibility(0);
            }
            textView.setText(data.getName());
            textView4.setText(data.getState_desc());
            textView4.setTextColor(com.max.hbcommon.utils.l.g(data.getState_color()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallCouponObj mallCouponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponObj}, this, changeQuickRedirect, false, bb.c.k.Fz, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, mallCouponObj);
        }
    }

    public static final /* synthetic */ void P3(s sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, null, changeQuickRedirect, true, bb.c.k.yz, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        sVar.showError();
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.tz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().w(this.f74249d).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.sz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f74247b;
        com.max.hbcommon.base.adapter.s<MallCouponObj> sVar = null;
        if (smartRefreshLayout == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new pg.d() { // from class: com.max.hbwallet.p
            @Override // pg.d
            public final void k(ng.j jVar) {
                s.S3(this.f74241b, jVar);
            }
        });
        SmartRefreshLayout smartRefreshLayout2 = this.f74247b;
        if (smartRefreshLayout2 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new pg.b() { // from class: com.max.hbwallet.q
            @Override // pg.b
            public final void f(ng.j jVar) {
                s.T3(this.f74243b, jVar);
            }
        });
        RecyclerView recyclerView = this.f74248c;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f74248c;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        RecyclerView recyclerView3 = this.f74248c;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new com.max.hbcommon.base.adapter.i(this.mContext));
        this.f74251f = new c(this.mContext, this.f74250e, R.layout.hbwallet_item_coupon_history);
        RecyclerView recyclerView4 = this.f74248c;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        com.max.hbcommon.base.adapter.s<MallCouponObj> sVar2 = this.f74251f;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView4.setAdapter(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(s this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.wz, new Class[]{s.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.f74249d = null;
        this$0.Q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(s this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.xz, new Class[]{s.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.Q3();
    }

    public final void U3() {
        ArrayList<MallCouponObj> items;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.vz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f74249d == null) {
            this.f74250e.clear();
        }
        CouponHistoryResultObj couponHistoryResultObj = this.f74252g;
        com.max.hbcommon.base.adapter.s<MallCouponObj> sVar = null;
        this.f74249d = couponHistoryResultObj != null ? couponHistoryResultObj.getLastval() : null;
        CouponHistoryResultObj couponHistoryResultObj2 = this.f74252g;
        if (couponHistoryResultObj2 != null && (items = couponHistoryResultObj2.getItems()) != null) {
            this.f74250e.addAll(items);
        }
        List<MallCouponObj> list = this.f74250e;
        if (list == null || list.isEmpty()) {
            showEmpty();
            return;
        }
        com.max.hbcommon.base.adapter.s<MallCouponObj> sVar2 = this.f74251f;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, bb.c.k.rz, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(rootView, "rootView");
        setContentView(R.layout.layout_sample_refresh_rv);
        View viewFindViewById = rootView.findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.f74247b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.f74248c = (RecyclerView) viewFindViewById2;
        R3();
        showLoading();
        Q3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.uz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f74249d = null;
        Q3();
    }
}
