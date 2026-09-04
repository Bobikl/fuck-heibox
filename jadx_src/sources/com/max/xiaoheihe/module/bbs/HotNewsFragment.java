package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.accelworld.AccelWorldABTestKt;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.p9;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HotNewsFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHotNewsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotNewsFragment.kt\ncom/max/xiaoheihe/module/bbs/HotNewsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1855#2,2:210\n*S KotlinDebug\n*F\n+ 1 HotNewsFragment.kt\ncom/max/xiaoheihe/module/bbs/HotNewsFragment\n*L\n168#1:210,2\n*E\n"})
@com.max.hbcommon.analytics.m(path = "/home/rank")
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HotNewsFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a, com.max.xiaoheihe.module.news.adapter.a.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f79924h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f79925i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p9 f79926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> f79927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private List<HotNewsInfoWrapperObj> f79928d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private List<BBSLinkObj> f79929e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private List<BBSLinkObj> f79930f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> f79931g;

    /* JADX INFO: compiled from: HotNewsFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final HotNewsFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26583, new Class[0], HotNewsFragment.class);
            return patchProxyResultProxy.isSupported ? (HotNewsFragment) patchProxyResultProxy.result : new HotNewsFragment();
        }
    }

    /* JADX INFO: compiled from: HotNewsFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26584, new Class[0], Void.TYPE).isSupported && HotNewsFragment.this.isActive()) {
                super.onComplete();
                HotNewsFragment.this.S3().f114485c.A(0);
                HotNewsFragment.this.S3().f114485c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26585, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HotNewsFragment.this.isActive()) {
                super.onError(e10);
                HotNewsFragment.Q3(HotNewsFragment.this);
                HotNewsFragment.this.S3().f114485c.A(0);
                HotNewsFragment.this.S3().f114485c.p(0);
            }
        }

        public void onNext(@dl.d Result<BBSLinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26586, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HotNewsFragment.this.isActive()) {
                super.onNext(result);
                HotNewsFragment hotNewsFragment = HotNewsFragment.this;
                BBSLinkListResultObj result2 = result.getResult();
                kotlin.jvm.internal.f0.o(result2, "result.result");
                HotNewsFragment.O3(hotNewsFragment, result2);
                com.max.hbcache.c.C("rank_list_refresh_time", String.valueOf(System.currentTimeMillis()));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26587, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HotNewsFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 26588, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            HotNewsFragment.this.f79929e.clear();
            HotNewsFragment.this.f79930f.clear();
            HotNewsFragment.L3(HotNewsFragment.this);
        }
    }

    public static final /* synthetic */ void L3(HotNewsFragment hotNewsFragment) {
        if (PatchProxy.proxy(new Object[]{hotNewsFragment}, null, changeQuickRedirect, true, 26580, new Class[]{HotNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsFragment.R3();
    }

    public static final /* synthetic */ void O3(HotNewsFragment hotNewsFragment, BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hotNewsFragment, bBSLinkListResultObj}, null, changeQuickRedirect, true, 26582, new Class[]{HotNewsFragment.class, BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsFragment.W3(bBSLinkListResultObj);
    }

    public static final /* synthetic */ void Q3(HotNewsFragment hotNewsFragment) {
        if (PatchProxy.proxy(new Object[]{hotNewsFragment}, null, changeQuickRedirect, true, 26581, new Class[]{HotNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsFragment.showError();
    }

    private final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26575, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26570, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = S3().f114484b;
        kotlin.jvm.internal.f0.o(recyclerView, "binding.rv");
        this.f79931g = new i<>(this, recyclerView, BBSLinkObj.class);
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        Y3(new com.max.xiaoheihe.module.bbs.adapter.k(mContext, this.f79928d, this, this.f79931g, false, 16, null));
        S3().f114484b.setLayoutManager(new LinearLayoutManager(this.mContext));
        S3().f114484b.setAdapter(T3());
        RecyclerView recyclerView2 = S3().f114484b;
        kotlin.jvm.internal.f0.o(recyclerView2, "binding.rv");
        new OneTimeValidExposureWatcher(this, recyclerView2);
        S3().f114485c.setBackgroundResource(R.color.background_layer_2_color);
        S3().f114485c.V(false);
        S3().f114485c.b0(false);
        S3().f114485c.S(new c());
    }

    @dl.d
    @xh.m
    public static final HotNewsFragment V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26579, new Class[0], HotNewsFragment.class);
        return patchProxyResultProxy.isSupported ? (HotNewsFragment) patchProxyResultProxy.result : f79924h.a();
    }

    private final void W3(BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListResultObj}, this, changeQuickRedirect, false, 26577, new Class[]{BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        this.f79928d.clear();
        List<BBSLinkObj> links = bBSLinkListResultObj.getLinks();
        kotlin.jvm.internal.f0.o(links, "result.links");
        for (BBSLinkObj bBSLinkObj : links) {
            bBSLinkObj.setIndex(String.valueOf(this.f79928d.size()));
            this.f79928d.add(new HotNewsInfoWrapperObj(TYPE.RANK, bBSLinkObj));
        }
        T3().notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void B3(int i10) {
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26572, new Class[0], Void.TYPE).isSupported && isActive()) {
            S3().f114485c.F();
            S3().f114484b.scrollToPosition(0);
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void G2(int i10) {
        i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> iVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26578, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (iVar = this.f79931g) == null) {
            return;
        }
        iVar.q();
    }

    @dl.d
    public final p9 S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26565, new Class[0], p9.class);
        if (patchProxyResultProxy.isSupported) {
            return (p9) patchProxyResultProxy.result;
        }
        p9 p9Var = this.f79926b;
        if (p9Var != null) {
            return p9Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26567, new Class[0], com.max.hbcommon.base.adapter.u.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.u) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> uVar = this.f79927c;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.f0.S("mLinkAdapter");
        return null;
    }

    public final void X3(@dl.d p9 p9Var) {
        if (PatchProxy.proxy(new Object[]{p9Var}, this, changeQuickRedirect, false, 26566, new Class[]{p9.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(p9Var, "<set-?>");
        this.f79926b = p9Var;
    }

    public final void Y3(@dl.d com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 26568, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(uVar, "<set-?>");
        this.f79927c = uVar;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26571, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        R3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26569, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        p9 p9VarC = p9.c(this.mInflater);
        kotlin.jvm.internal.f0.o(p9VarC, "inflate(mInflater)");
        X3(p9VarC);
        setContentView(S3());
        U3();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79928d.clear();
        this.f79929e.clear();
        this.f79930f.clear();
        AccelWorldABTestKt.a(ad.a.d(), new yh.l<com.max.accelworld.i, b2>() { // from class: com.max.xiaoheihe.module.bbs.HotNewsFragment.onDestroy.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d com.max.accelworld.i DoABTest) {
                if (PatchProxy.proxy(new Object[]{DoABTest}, this, changeQuickRedirect, false, 26589, new Class[]{com.max.accelworld.i.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(DoABTest, "$this$DoABTest");
                final HotNewsFragment hotNewsFragment = HotNewsFragment.this;
                DoABTest.c(new yh.l<com.max.accelworld.j, b2>() { // from class: com.max.xiaoheihe.module.bbs.HotNewsFragment.onDestroy.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    public final void a(@dl.d com.max.accelworld.j TrueDoA) {
                        if (PatchProxy.proxy(new Object[]{TrueDoA}, this, changeQuickRedirect, false, 26591, new Class[]{com.max.accelworld.j.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        kotlin.jvm.internal.f0.p(TrueDoA, "$this$TrueDoA");
                        hotNewsFragment.f79931g = null;
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.accelworld.j jVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26592, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(jVar);
                        return b2.f124493a;
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.accelworld.i iVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 26590, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(iVar);
                return b2.f124493a;
            }
        });
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        long j10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26576, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        String lastsignTime = com.max.hbcache.c.o("rank_list_refresh_time", "");
        if (TextUtils.isEmpty(lastsignTime)) {
            j10 = 0;
        } else {
            kotlin.jvm.internal.f0.o(lastsignTime, "lastsignTime");
            j10 = Long.parseLong(lastsignTime);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mIsFirst || jCurrentTimeMillis - j10 < 3600000) {
            return;
        }
        D3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26574, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        R3();
    }
}
