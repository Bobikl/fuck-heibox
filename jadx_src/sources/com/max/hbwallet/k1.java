package com.max.hbwallet;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbwallet.bean.ProfitWithdrawInfoObj;
import com.max.hbwallet.bean.ProfitWithdrawResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ProfitWithdrawRecordFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.t0({"SMAP\nProfitWithdrawRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitWithdrawRecordFragment.kt\ncom/max/hbwallet/ProfitWithdrawRecordFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
public final class k1 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f74225g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f74226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f74227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f74228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<ProfitWithdrawInfoObj> f74229e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<ProfitWithdrawInfoObj> f74230f;

    /* JADX INFO: compiled from: ProfitWithdrawRecordFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final k1 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.G1, new Class[0], k1.class);
            return patchProxyResultProxy.isSupported ? (k1) patchProxyResultProxy.result : new k1();
        }
    }

    /* JADX INFO: compiled from: ProfitWithdrawRecordFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<ProfitWithdrawResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.I1, new Class[0], Void.TYPE).isSupported && k1.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = k1.this.f74226b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = k1.this.f74226b;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.l.H1, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (k1.this.isActive()) {
                super.onError(e10);
                k1.O3(k1.this);
                SmartRefreshLayout smartRefreshLayout = k1.this.f74226b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = k1.this.f74226b;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<ProfitWithdrawResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.J1, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (k1.this.isActive()) {
                k1.this.T3(result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.K1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProfitWithdrawResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ProfitWithdrawRecordFragment.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<ProfitWithdrawInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, List<ProfitWithdrawInfoObj> list, int i10) {
            super(activity, list, i10);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d ProfitWithdrawInfoObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, bb.c.l.L1, new Class[]{com.max.hbcommon.base.adapter.s.e.class, ProfitWithdrawInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_event_desc);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_timestamp);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_value);
            View viewI = viewHolder.i(R.id.divider);
            kotlin.jvm.internal.f0.o(viewI, "getView(...)");
            String strValueOf = String.valueOf(com.max.hbutils.utils.n.p(data.getAmount()) / 100);
            textView.setText("提现到" + (kotlin.jvm.internal.f0.g(PaymentManager.f71422u, data.getWay()) ? "支付宝" : "微信") + " ￥" + strValueOf);
            textView2.setText(data.getCreate_at());
            textView3.setText(data.getDesc());
            textView3.setTextColor(com.max.hbcommon.utils.l.g(data.getColor()));
            if (kotlin.jvm.internal.f0.g(data, this.mDataList.get(getItemCount() - 1))) {
                viewI.setVisibility(8);
            } else {
                viewI.setVisibility(0);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, ProfitWithdrawInfoObj profitWithdrawInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, profitWithdrawInfoObj}, this, changeQuickRedirect, false, bb.c.l.M1, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, profitWithdrawInfoObj);
        }
    }

    public static final /* synthetic */ void O3(k1 k1Var) {
        if (PatchProxy.proxy(new Object[]{k1Var}, null, changeQuickRedirect, true, bb.c.l.F1, new Class[]{k1.class}, Void.TYPE).isSupported) {
            return;
        }
        k1Var.showError();
    }

    private final void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.A1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().l(this.f74228d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34576z1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f74226b;
        com.max.hbcommon.base.adapter.s<ProfitWithdrawInfoObj> sVar = null;
        if (smartRefreshLayout == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new pg.d() { // from class: com.max.hbwallet.i1
            @Override // pg.d
            public final void k(ng.j jVar) {
                k1.R3(this.f74219b, jVar);
            }
        });
        SmartRefreshLayout smartRefreshLayout2 = this.f74226b;
        if (smartRefreshLayout2 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new pg.b() { // from class: com.max.hbwallet.j1
            @Override // pg.b
            public final void f(ng.j jVar) {
                k1.S3(this.f74221b, jVar);
            }
        });
        RecyclerView recyclerView = this.f74227c;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f74227c;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        this.f74230f = new c(this.mContext, this.f74229e, R.layout.hbwallet_item_h_coin_history);
        RecyclerView recyclerView3 = this.f74227c;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        com.max.hbcommon.base.adapter.s<ProfitWithdrawInfoObj> sVar2 = this.f74230f;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView3.setAdapter(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(k1 this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.l.D1, new Class[]{k1.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.f74228d = 0;
        this$0.P3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(k1 this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.l.E1, new Class[]{k1.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.f74228d += 30;
        this$0.P3();
    }

    public final void T3(@dl.e ProfitWithdrawResult profitWithdrawResult) {
        ArrayList<ProfitWithdrawInfoObj> history;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{profitWithdrawResult}, this, changeQuickRedirect, false, bb.c.l.C1, new Class[]{ProfitWithdrawResult.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f74228d == 0) {
            this.f74229e.clear();
        }
        if (profitWithdrawResult != null && (history = profitWithdrawResult.getHistory()) != null) {
            this.f74229e.addAll(history);
        }
        List<ProfitWithdrawInfoObj> list = this.f74229e;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            showEmpty(R.drawable.common_tag_common_45x45, "暂无提现记录");
            return;
        }
        showContentView();
        com.max.hbcommon.base.adapter.s<ProfitWithdrawInfoObj> sVar = this.f74230f;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, bb.c.l.f34554y1, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(rootView, "rootView");
        setContentView(R.layout.layout_sample_refresh_rv);
        View viewFindViewById = rootView.findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.f74226b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.f74227c = (RecyclerView) viewFindViewById2;
        Q3();
        showLoading();
        P3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.B1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f74228d = 0;
        P3();
    }
}
