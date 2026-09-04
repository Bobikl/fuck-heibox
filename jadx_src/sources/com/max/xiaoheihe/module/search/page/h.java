package com.max.xiaoheihe.module.search.page;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.SearchLinkResult;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.max.xiaoheihe.module.bbs.adapter.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchPostFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class h extends y0 {

    @dl.d
    public static final a N = new a(null);
    public static final int O = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private com.max.xiaoheihe.module.bbs.i<t> I;

    @dl.d
    private final ArrayList<BBSLinkObj> J = new ArrayList<>();

    @dl.d
    private final ArrayList<BBSLinkObj> K = new ArrayList<>();

    @dl.d
    private final ArrayList<BBSLinkObj> L = new ArrayList<>();

    @dl.e
    private t M;

    /* JADX INFO: compiled from: SearchPostFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(@dl.d String topicid) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicid}, this, changeQuickRedirect, false, 43087, new Class[]{String.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            f0.p(topicid, "topicid");
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putString(bVar.j(), topicid);
            bundle.putInt(bVar.e(), 5);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: SearchPostFragment.kt */
    public final class b extends m {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b(@dl.e Context context, @dl.e List<? extends BBSLinkObj> list, String str) {
            super(context, list, str);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 43089, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            t(eVar, (BBSLinkObj) obj);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m
        public void t(@dl.d s.e viewHolder, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43088, new Class[]{s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            super.t(viewHolder, data);
            View viewB = viewHolder.b();
            ViewUtils.f(((com.max.hbcommon.base.d) h.this).mContext, 12.0f);
            if (viewB instanceof CardView) {
                CardView cardView = (CardView) viewB;
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin != 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                    cardView.setRadius(0.0f);
                    cardView.setLayoutParams(layoutParams2);
                }
            }
            View viewI = viewHolder.i(R.id.divider);
            if (viewI != null) {
                viewI.setVisibility(data == this.mDataList.get(getItemCount() - 1) ? 8 : 0);
            }
            AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
            if (absVideoView != null) {
                absVideoView.setFocusable(false);
                absVideoView.setFocusableInTouchMode(false);
                absVideoView.clearFocus();
            }
        }
    }

    /* JADX INFO: compiled from: SearchPostFragment.kt */
    public static final class c implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43090, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            if (tab.k() == 0) {
                h hVar = h.this;
                h.U5(hVar, hVar.R3());
            } else if (tab.k() == 1) {
                h hVar2 = h.this;
                h.U5(hVar2, hVar2.T3());
            } else {
                h hVar3 = h.this;
                h.U5(hVar3, hVar3.S3());
            }
            h hVar4 = h.this;
            hVar4.P3(h.Q5(hVar4), 0, h.N5(h.this));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43091, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43092, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: SearchPostFragment.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.max.xiaoheihe.module.bbs.i<t> iVarW5;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43093, new Class[0], Void.TYPE).isSupported || (iVarW5 = h.this.W5()) == null) {
                return;
            }
            iVarW5.q();
        }
    }

    /* JADX INFO: compiled from: SearchPostFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<SearchLinkResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f91674c;

        e(String str, h hVar) {
            this.f91673b = str;
            this.f91674c = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43095, new Class[0], Void.TYPE).isSupported && f0.g(this.f91673b, h.Q5(this.f91674c)) && this.f91674c.isActive()) {
                super.onComplete();
                h.K5(this.f91674c, this.f91673b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43094, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91673b, h.Q5(this.f91674c)) && this.f91674c.isActive()) {
                super.onError(e10);
                h.K5(this.f91674c, this.f91673b);
            }
        }

        public void onNext(@dl.d Result<SearchLinkResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43096, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91673b, h.Q5(this.f91674c)) && this.f91674c.isActive()) {
                if (result.getResult() != null) {
                    SearchLinkResult result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getList() != null) {
                        if (h.P5(this.f91674c) == 0) {
                            this.f91674c.J.clear();
                            this.f91674c.K.clear();
                            this.f91674c.L.clear();
                        }
                        ArrayList arrayList = this.f91674c.J;
                        SearchLinkResult result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getList());
                    }
                }
                if (h.S5(this.f91674c) != null && result.getResult() != null) {
                    h hVar = this.f91674c;
                    SearchLinkResult result4 = result.getResult();
                    f0.m(result4);
                    h.V5(hVar, result4.getSort_filter());
                }
                h.T5(this.f91674c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43097, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchLinkResult>) obj);
        }
    }

    public static final /* synthetic */ void K5(h hVar, String str) {
        if (PatchProxy.proxy(new Object[]{hVar, str}, null, changeQuickRedirect, true, 43082, new Class[]{h.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.Q3(str);
    }

    public static final /* synthetic */ int N5(h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 43081, new Class[]{h.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : hVar.a4();
    }

    public static final /* synthetic */ int P5(h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 43083, new Class[]{h.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : hVar.c4();
    }

    public static final /* synthetic */ String Q5(h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 43080, new Class[]{h.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : hVar.d4();
    }

    public static final /* synthetic */ FilterButtonView S5(h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 43084, new Class[]{h.class}, FilterButtonView.class);
        return patchProxyResultProxy.isSupported ? (FilterButtonView) patchProxyResultProxy.result : hVar.S4();
    }

    public static final /* synthetic */ void T5(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 43086, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.X5();
    }

    public static final /* synthetic */ void U5(h hVar, String str) {
        if (PatchProxy.proxy(new Object[]{hVar, str}, null, changeQuickRedirect, true, 43079, new Class[]{h.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.l5(str);
    }

    public static final /* synthetic */ void V5(h hVar, List list) {
        if (PatchProxy.proxy(new Object[]{hVar, list}, null, changeQuickRedirect, true, 43085, new Class[]{h.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.I5(list);
    }

    private final void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43075, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.M;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        if (this.J.isEmpty()) {
            y4();
            return;
        }
        E5(true);
        N4().setVisibility(8);
        if (c4() == 0) {
            P4().post(new d());
        }
    }

    private final void Y5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43074, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h2(str, U4(), K4(), R4(), V4(), c4(), a4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str, this)));
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.i<t> W5() {
        return this.I;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43077, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.u(U4())) {
            return com.max.hbsearch.o.f72357a.f();
        }
        SearchHotwordsObj searchHotwordsObj = com.max.hbsearch.o.f72358b;
        if (searchHotwordsObj != null) {
            return searchHotwordsObj.getList();
        }
        return null;
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = new t(new b(this.mContext, this.J, LinkListV2Fragment.f79976x));
    }

    public final void Z5(@dl.e com.max.xiaoheihe.module.bbs.i<t> iVar) {
        this.I = iVar;
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43069, new Class[0], Void.TYPE).isSupported) {
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
        tabLayout.h(new c());
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43072, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        Y5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 5;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43078, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_post);
        f0.o(strN0, "getString(R.string.search_post)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43071, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.M;
        f0.m(tVar);
        tVar.p(R.layout.item_search_filter_header, X4());
        P4().setAdapter(this.M);
        this.I = new com.max.xiaoheihe.module.bbs.i<>(this, P4(), BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, P4());
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43073, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(true);
        N4().setVisibility(8);
    }

    @Override // com.max.hbsearch.k
    public void z4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43076, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.z4(str);
        com.max.xiaoheihe.module.bbs.i<t> iVar = this.I;
        if (iVar != null) {
            iVar.v(str);
        }
    }
}
