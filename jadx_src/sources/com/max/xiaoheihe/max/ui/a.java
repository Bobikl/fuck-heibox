package com.max.xiaoheihe.max.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BbsRecommendObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: compiled from: BBSRecommendFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f77421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f77422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SmartRefreshLayout f77423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f77424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.c f77425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.a f77426h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f77420b = 30;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<BBSTopicObj> f77427i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<FeedsContentBaseObj> f77428j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f77429k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f77430l = null;

    /* JADX INFO: renamed from: com.max.xiaoheihe.max.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BBSRecommendFragment.java */
    public class C0633a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0633a() {
        }

        @Override // pg.d
        public void k(@n0 j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22178, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            a.L3(a.this);
            a.M3(a.this);
        }
    }

    /* JADX INFO: compiled from: BBSRecommendFragment.java */
    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(@n0 j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22179, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            a.U3(a.this, 30);
            a.M3(a.this);
        }
    }

    /* JADX INFO: compiled from: BBSRecommendFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<BbsRecommendObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22181, new Class[0], Void.TYPE).isSupported && a.this.isActive()) {
                super.onComplete();
                a.this.f77423e.P();
                a.this.f77423e.w();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22180, new Class[]{Throwable.class}, Void.TYPE).isSupported && a.this.isActive()) {
                super.onError(th2);
                a.V3(a.this);
                a.this.f77423e.P();
                a.this.f77423e.w();
            }
        }

        public void onNext(Result<BbsRecommendObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22182, new Class[]{Result.class}, Void.TYPE).isSupported && a.this.isActive()) {
                if (a.this.f77429k == 0 && result != null && result.getResult() != null) {
                    if (com.max.hbcommon.utils.c.w(result.getResult().getBanner())) {
                        a.this.f77424f.setVisibility(8);
                    } else {
                        int iL = ViewUtils.L(((d) a.this).mContext) - (ViewUtils.f(((d) a.this).mContext, 12.0f) * 2);
                        a.this.f77424f.setVisibility(0);
                        com.max.hbcommon.utils.b.g(a.this.f77424f, result.getResult().getBanner(), iL, 8.0f);
                    }
                    if (!com.max.hbcommon.utils.c.w(result.getResult().getTopics())) {
                        a.this.f77427i.clear();
                        a.this.f77427i.addAll(result.getResult().getTopics());
                        a.this.f77425g.notifyDataSetChanged();
                    }
                    a.this.f77428j.clear();
                    if (com.max.hbcommon.utils.c.w(result.getResult().getLinks())) {
                        a.O3(a.this);
                    }
                }
                if (result != null && result.getResult() != null && !com.max.hbcommon.utils.c.w(result.getResult().getLinks())) {
                    a.this.f77430l = result.getResult().getLastval();
                    for (FeedsContentBaseObj feedsContentBaseObj : result.getResult().getLinks()) {
                        if (!a.this.f77428j.contains(feedsContentBaseObj)) {
                            a.this.f77428j.add(feedsContentBaseObj);
                        }
                    }
                    a.this.f77426h.notifyDataSetChanged();
                }
                if (com.max.hbcommon.utils.c.w(a.this.f77428j)) {
                    a.S3(a.this);
                } else {
                    a.R3(a.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22183, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BbsRecommendObj>) obj);
        }
    }

    static /* synthetic */ void L3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22172, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.e4();
    }

    static /* synthetic */ void M3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22173, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c4();
    }

    static /* synthetic */ void O3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22175, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showEmpty();
    }

    static /* synthetic */ void R3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22176, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showContentView();
    }

    static /* synthetic */ void S3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22177, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showEmpty();
    }

    static /* synthetic */ int U3(a aVar, int i10) {
        int i11 = aVar.f77429k + i10;
        aVar.f77429k = i11;
        return i11;
    }

    static /* synthetic */ void V3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 22174, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showError();
    }

    private void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22169, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().b9(this.f77429k, 30, this.f77430l).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static a d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22167, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    private void e4() {
        this.f77429k = 0;
        this.f77430l = null;
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22170, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.f77422d.scrollToPosition(0);
            this.f77423e.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22168, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        setContentView(R.layout.fragment_bbs_recommend);
        this.f77421c = (RecyclerView) view.findViewById(R.id.rv_topic);
        this.f77422d = (RecyclerView) view.findViewById(R.id.rv_links);
        this.f77423e = (SmartRefreshLayout) view.findViewById(R.id.srl);
        this.f77424f = (BannerViewPager) view.findViewById(R.id.banner);
        this.f77421c.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        com.max.xiaoheihe.module.news.adapter.c cVar = new com.max.xiaoheihe.module.news.adapter.c(this.mContext, this.f77427i, null);
        this.f77425g = cVar;
        this.f77421c.setAdapter(cVar);
        this.f77422d.setLayoutManager(new LinearLayoutManager(this.mContext));
        com.max.xiaoheihe.module.news.adapter.a aVar = new com.max.xiaoheihe.module.news.adapter.a(this.mContext, this.f77428j);
        this.f77426h = aVar;
        this.f77422d.setAdapter(aVar);
        this.f77423e.b0(true);
        this.f77423e.i0(true);
        this.f77423e.S(new C0633a());
        this.f77423e.f0(new b());
        showLoading();
        c4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        c4();
    }
}
