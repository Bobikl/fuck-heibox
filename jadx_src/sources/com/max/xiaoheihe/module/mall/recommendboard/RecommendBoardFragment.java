package com.max.xiaoheihe.module.mall.recommendboard;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseFragment;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.mall.RecommendBoardList;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB;
import com.max.xiaoheihe.module.game.adapter.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.b90;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import ng.j;

/* JADX INFO: compiled from: RecommendBoardFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = "/game/comment_recommend")
@o(parameters = 0)
public final class RecommendBoardFragment extends BaseFragment<RecommendBoardFragmentVM> {
    public static final int W = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public b90 M;
    public UniversalRecyclerView N;
    public SmartRefreshLayout O;
    public t P;

    @dl.e
    private v<t> R;

    @dl.d
    private final Handler L = new Handler(Looper.getMainLooper());
    private boolean Q = true;

    @dl.d
    private final ArrayList<RecommendBoardItem> S = new ArrayList<>();

    @dl.d
    private final ArrayList<RecommendBoardItem> T = new ArrayList<>();
    private boolean U = true;

    @dl.d
    private RecommendBoardFragment$mBroadcastReceiver$1 V = new BroadcastReceiver() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragment$mBroadcastReceiver$1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(@e Context context, @e Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 42134, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.m(intent);
            if (f0.g("com.max.xiaoheihe.game.gotop", intent.getAction())) {
                this.f91033a.z4().scrollToPosition(0);
                this.f91033a.A4().F();
            }
        }
    };

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42123, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            RecommendBoardFragment.this.S.clear();
            RecommendBoardFragment.this.T.clear();
            RecommendBoardFragment.t4(RecommendBoardFragment.this).A();
        }
    }

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42124, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            RecommendBoardFragment.t4(RecommendBoardFragment.this).y();
        }
    }

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class c extends v<t> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(RecommendBoardFragment recommendBoardFragment, UniversalRecyclerView universalRecyclerView) {
            super(recommendBoardFragment, universalRecyclerView, false, null, 8, null);
        }

        @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper, com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            View view;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 42130, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            super.b(i10, viewHolder);
            Object tag = (viewHolder == null || (view = viewHolder.itemView) == null) ? null : view.getTag();
            if (tag instanceof RecommendBoardItem) {
                RecommendBoardItem recommendBoardItem = (RecommendBoardItem) tag;
                if (recommendBoardItem.isHideReport()) {
                    return;
                }
                recommendBoardItem.setHideReport(true);
                com.max.xiaoheihe.utils.d.d(false, k.p(recommendBoardItem.generateShowInfo()));
            }
        }

        @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper, com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            View view;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 42129, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            super.c(i10, viewHolder);
            Object tag = (viewHolder == null || (view = viewHolder.itemView) == null) ? null : view.getTag();
            if (tag instanceof RecommendBoardItem) {
                RecommendBoardItem recommendBoardItem = (RecommendBoardItem) tag;
                if (recommendBoardItem.isExposureReport()) {
                    return;
                }
                recommendBoardItem.setExposureReport(true);
                com.max.xiaoheihe.utils.d.d(true, k.p(recommendBoardItem.generateShowInfo()));
            }
        }
    }

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class d extends s<RecommendBoardItem> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: RecommendBoardFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecommendBoardFragment f91028b;

            a(RecommendBoardFragment recommendBoardFragment) {
                this.f91028b = recommendBoardFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v<t> vVarX4;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42133, new Class[]{View.class}, Void.TYPE).isSupported || (vVarX4 = this.f91028b.x4()) == null) {
                    return;
                }
                vVarX4.q();
            }
        }

        d(Context context, ArrayList<RecommendBoardItem> arrayList) {
            super(context, arrayList, R.layout.item_recommend_board);
        }

        public void m(@dl.d s.e viewHolder, @dl.d RecommendBoardItem data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42131, new Class[]{s.e.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            RecommendBoardVHB.a aVar = RecommendBoardVHB.f86042h;
            Activity activityU4 = RecommendBoardFragment.u4(RecommendBoardFragment.this);
            f0.m(activityU4);
            RecommendBoardVHB.a.e(aVar, activityU4, viewHolder, data, false, false, new a(RecommendBoardFragment.this), 24, null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, RecommendBoardItem recommendBoardItem) {
            if (PatchProxy.proxy(new Object[]{eVar, recommendBoardItem}, this, changeQuickRedirect, false, 42132, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, recommendBoardItem);
        }
    }

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class e implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 42136, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 42135, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            RecommendBoardFragment.this.A4().p(0);
            RecommendBoardFragment.this.A4().A(0);
        }
    }

    /* JADX INFO: compiled from: RecommendBoardFragment.kt */
    public static final class f implements j0<RecommendBoardList> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(RecommendBoardList recommendBoardList) {
            if (PatchProxy.proxy(new Object[]{recommendBoardList}, this, changeQuickRedirect, false, 42138, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(recommendBoardList);
        }

        public final void b(RecommendBoardList recommendBoardList) {
            if (PatchProxy.proxy(new Object[]{recommendBoardList}, this, changeQuickRedirect, false, 42137, new Class[]{RecommendBoardList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (RecommendBoardFragment.t4(RecommendBoardFragment.this).t() > 0) {
                int size = RecommendBoardFragment.t4(RecommendBoardFragment.this).r().size();
                List<RecommendBoardItem> items = recommendBoardList.getItems();
                if (size - (items != null ? items.size() : 0) > 0) {
                    t tVarY4 = RecommendBoardFragment.this.y4();
                    int size2 = RecommendBoardFragment.t4(RecommendBoardFragment.this).r().size();
                    List<RecommendBoardItem> items2 = recommendBoardList.getItems();
                    int size3 = size2 - (items2 != null ? items2.size() : 0);
                    List<RecommendBoardItem> items3 = recommendBoardList.getItems();
                    tVarY4.notifyItemRangeInserted(size3, items3 != null ? items3.size() : 0);
                    return;
                }
            }
            RecommendBoardFragment.this.y4().notifyDataSetChanged();
        }
    }

    public static final /* synthetic */ RecommendBoardFragmentVM t4(RecommendBoardFragment recommendBoardFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendBoardFragment}, null, changeQuickRedirect, true, 42121, new Class[]{RecommendBoardFragment.class}, RecommendBoardFragmentVM.class);
        return patchProxyResultProxy.isSupported ? (RecommendBoardFragmentVM) patchProxyResultProxy.result : recommendBoardFragment.Y3();
    }

    public static final /* synthetic */ Activity u4(RecommendBoardFragment recommendBoardFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendBoardFragment}, null, changeQuickRedirect, true, 42122, new Class[]{RecommendBoardFragment.class}, Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : recommendBoardFragment.getParentActivity();
    }

    @dl.d
    public final SmartRefreshLayout A4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42111, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.O;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        f0.S("refreshLayout");
        return null;
    }

    public final void B4(@dl.d b90 b90Var) {
        if (PatchProxy.proxy(new Object[]{b90Var}, this, changeQuickRedirect, false, 42108, new Class[]{b90.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(b90Var, "<set-?>");
        this.M = b90Var;
    }

    public final void C4(@dl.e v<t> vVar) {
        this.R = vVar;
    }

    public final void D4(@dl.d t tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 42114, new Class[]{t.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tVar, "<set-?>");
        this.P = tVar;
    }

    public final void E4(@dl.d UniversalRecyclerView universalRecyclerView) {
        if (PatchProxy.proxy(new Object[]{universalRecyclerView}, this, changeQuickRedirect, false, 42110, new Class[]{UniversalRecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(universalRecyclerView, "<set-?>");
        this.N = universalRecyclerView;
    }

    public final void F4(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 42112, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(smartRefreshLayout, "<set-?>");
        this.O = smartRefreshLayout;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42115, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b90 b90VarC = b90.c(getMInflater());
        f0.o(b90VarC, "inflate(mInflater)");
        B4(b90VarC);
        setViewBinding(w4());
        UniversalRecyclerView universalRecyclerView = w4().f108879b;
        f0.o(universalRecyclerView, "binding.rv");
        E4(universalRecyclerView);
        SmartRefreshLayout smartRefreshLayout = w4().f108880c;
        f0.o(smartRefreshLayout, "binding.srl");
        F4(smartRefreshLayout);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42117, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().x().k(getViewLifecycleOwner(), new e());
        Y3().v().k(getViewLifecycleOwner(), new f());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    @dl.d
    public Handler getEventHandler() {
        return this.L;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42116, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        registerReceiver(this.V, "com.max.xiaoheihe.game.gotop");
        A4().S(new a());
        A4().f0(new b());
        D4(new t(new d(getContext(), Y3().r())));
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(getContext(), 4.0f)));
        view.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color));
        y4().p(R.layout.divider, view);
        z4().setAdapter(y4());
        z4().setLayoutManager(new LinearLayoutManager(getContext()));
        z4().setPreloadEnable(true);
        z4().setPreLoadGap(2);
        z4().setPreLoadAction(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragment.initViews.3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42126, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42125, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                RecommendBoardFragmentVM recommendBoardFragmentVMT4 = RecommendBoardFragment.t4(RecommendBoardFragment.this);
                final RecommendBoardFragment recommendBoardFragment = RecommendBoardFragment.this;
                recommendBoardFragmentVMT4.z(true, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragment.initViews.3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42128, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42127, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        recommendBoardFragment.z4().b();
                    }
                });
            }
        });
        this.R = new c(this, z4());
        if (this.Q) {
            Y3().a();
        }
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42120, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AbsVideoView absVideoViewM = VideoPlayerManager.f76079a.m();
        if (absVideoViewM != null) {
            absVideoViewM.Q();
        }
        super.onDestroyView();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42118, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onHiddenChanged(z10);
        if (z10) {
            AbsVideoView absVideoViewM = VideoPlayerManager.f76079a.m();
            if (absVideoViewM != null && absVideoViewM.G()) {
                absVideoViewM.K();
            }
        }
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42119, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            AbsVideoView absVideoViewM = VideoPlayerManager.f76079a.m();
            if (absVideoViewM != null && absVideoViewM.G()) {
                absVideoViewM.K();
            }
        } else if (this.Q && T3()) {
            this.Q = false;
            Y3().a();
        }
        super.setUserVisibleHint(z10);
    }

    @dl.d
    public final b90 w4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42107, new Class[0], b90.class);
        if (patchProxyResultProxy.isSupported) {
            return (b90) patchProxyResultProxy.result;
        }
        b90 b90Var = this.M;
        if (b90Var != null) {
            return b90Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final v<t> x4() {
        return this.R;
    }

    @dl.d
    public final t y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42113, new Class[0], t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        t tVar = this.P;
        if (tVar != null) {
            return tVar;
        }
        f0.S("mAdapter");
        return null;
    }

    @dl.d
    public final UniversalRecyclerView z4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42109, new Class[0], UniversalRecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (UniversalRecyclerView) patchProxyResultProxy.result;
        }
        UniversalRecyclerView universalRecyclerView = this.N;
        if (universalRecyclerView != null) {
            return universalRecyclerView;
        }
        f0.S("recyclerView");
        return null;
    }
}
