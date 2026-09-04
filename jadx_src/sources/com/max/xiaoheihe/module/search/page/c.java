package com.max.xiaoheihe.module.search.page;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.SearchLinkResult;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchChannelNewsFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c extends y0 {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<FeedsContentBaseObj> I = new ArrayList<>();

    @dl.e
    private t J;

    /* JADX INFO: compiled from: SearchChannelNewsFragment.kt */
    public static final class a implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42968, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            if (tab.k() == 0) {
                c cVar = c.this;
                c.R5(cVar, cVar.R3());
            } else if (tab.k() == 1) {
                c cVar2 = c.this;
                c.R5(cVar2, cVar2.T3());
            } else {
                c cVar3 = c.this;
                c.R5(cVar3, cVar3.S3());
            }
            c cVar4 = c.this;
            cVar4.P3(c.O5(cVar4), 0, c.M5(c.this));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42969, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42970, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: SearchChannelNewsFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<SearchLinkResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f91644c;

        b(String str, c cVar) {
            this.f91643b = str;
            this.f91644c = cVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42972, new Class[0], Void.TYPE).isSupported && f0.g(this.f91643b, c.O5(this.f91644c)) && this.f91644c.isActive()) {
                super.onComplete();
                c.K5(this.f91644c, this.f91643b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42971, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91643b, c.O5(this.f91644c)) && this.f91644c.isActive()) {
                super.onError(e10);
                c.K5(this.f91644c, this.f91643b);
            }
        }

        public void onNext(@dl.d Result<SearchLinkResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42973, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91643b, c.O5(this.f91644c)) && this.f91644c.isActive()) {
                if (result.getResult() != null) {
                    SearchLinkResult result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getList() != null) {
                        if (c.N5(this.f91644c) == 0) {
                            this.f91644c.I.clear();
                        }
                        SearchLinkResult result3 = result.getResult();
                        f0.m(result3);
                        this.f91644c.I.addAll(result3.getList());
                    }
                }
                if (c.P5(this.f91644c) != null && result.getResult() != null) {
                    c cVar = this.f91644c;
                    SearchLinkResult result4 = result.getResult();
                    f0.m(result4);
                    c.S5(cVar, result4.getSort_filter());
                }
                c.Q5(this.f91644c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42974, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchLinkResult>) obj);
        }
    }

    public static final /* synthetic */ void K5(c cVar, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, 42963, new Class[]{c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.Q3(str);
    }

    public static final /* synthetic */ int M5(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 42962, new Class[]{c.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : cVar.a4();
    }

    public static final /* synthetic */ int N5(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 42964, new Class[]{c.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : cVar.c4();
    }

    public static final /* synthetic */ String O5(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 42961, new Class[]{c.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : cVar.d4();
    }

    public static final /* synthetic */ FilterButtonView P5(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 42965, new Class[]{c.class}, FilterButtonView.class);
        return patchProxyResultProxy.isSupported ? (FilterButtonView) patchProxyResultProxy.result : cVar.S4();
    }

    public static final /* synthetic */ void Q5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 42967, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.T5();
    }

    public static final /* synthetic */ void R5(c cVar, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, 42960, new Class[]{c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.l5(str);
    }

    public static final /* synthetic */ void S5(c cVar, List list) {
        if (PatchProxy.proxy(new Object[]{cVar, list}, null, changeQuickRedirect, true, 42966, new Class[]{c.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.I5(list);
    }

    private final void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42958, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.I.isEmpty()) {
            y4();
        } else {
            t tVar = this.J;
            if (tVar != null) {
                tVar.E(R.layout.empty_view);
            }
            N4().setVisibility(8);
        }
        t tVar2 = this.J;
        f0.m(tVar2);
        tVar2.notifyDataSetChanged();
        E5(true);
    }

    private final void U5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42957, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        z<Result<SearchLinkResult>> zVarH2 = com.max.xiaoheihe.network.i.a().h2(str, U4(), K4(), R4(), V4(), c4(), a4());
        f0.o(zVarH2, "createHeyBoxService()\n  …cParams, mOffset, mLimit)");
        addDisposable((io.reactivex.disposables.b) zVarH2.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str, this)));
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new t(new com.max.xiaoheihe.module.news.adapter.a(this.mContext, this.I));
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42953, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = X4().findViewById(R.id.fbv_sort);
        f0.n(viewFindViewById, "null cannot be cast to non-null type com.max.hbcommon.component.FilterButtonView");
        t5((FilterButtonView) viewFindViewById);
        View viewFindViewById2 = X4().findViewById(R.id.tl_sort_type);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        TabLayout tabLayout = (TabLayout) viewFindViewById2;
        tabLayout.i(tabLayout.I().D(getString(R.string.all)));
        tabLayout.i(tabLayout.I().D(getString(R.string.this_week)));
        tabLayout.i(tabLayout.I().D(getString(R.string.this_month)));
        l5(R3());
        tabLayout.h(new a());
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 42956, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        U5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 20;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42955, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.J;
        f0.m(tVar);
        tVar.p(R.layout.item_search_filter_header, X4());
        P4().setAdapter(this.J);
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        t tVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42959, new Class[0], Void.TYPE).isSupported || (tVar = this.J) == null) {
            return;
        }
        if (tVar.z(R.layout.empty_view)) {
            tVar.E(R.layout.empty_view);
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.empty_view, (ViewGroup) P4(), false);
        View viewFindViewById = viewInflate.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((ImageView) viewFindViewById).setImageResource(R.drawable.common_tag_search_error_45x45);
        ((TextView) viewFindViewById2).setText(String.format(getString(R.string.no_result_about_account), d4()));
        tVar.m(R.layout.empty_view, viewInflate);
    }
}
