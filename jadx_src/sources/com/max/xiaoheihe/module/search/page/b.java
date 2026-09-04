package com.max.xiaoheihe.module.search.page;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.SearchLinkResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchChannelLinkFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b extends y0 {
    public static final int L = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<BBSLinkObj> I = new ArrayList<>();

    @dl.e
    private t J;

    @dl.e
    private com.max.xiaoheihe.module.bbs.i<t> K;

    /* JADX INFO: compiled from: SearchChannelLinkFragment.kt */
    public static final class a extends s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Activity activity, ArrayList<BBSLinkObj> arrayList) {
            super(activity, arrayList, R.layout.item_channels_link);
        }

        public void m(@dl.d s.e viewHolder, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42943, new Class[]{s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            com.max.xiaoheihe.module.bbs.utils.b.M(viewHolder, data, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42944, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.page.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchChannelLinkFragment.kt */
    public static final class C0854b implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0854b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42945, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            if (tab.k() == 0) {
                b bVar = b.this;
                b.S5(bVar, bVar.R3());
            } else if (tab.k() == 1) {
                b bVar2 = b.this;
                b.S5(bVar2, bVar2.T3());
            } else {
                b bVar3 = b.this;
                b.S5(bVar3, bVar3.S3());
            }
            b bVar4 = b.this;
            bVar4.P3(b.P5(bVar4), 0, b.N5(b.this));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42946, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 42947, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: SearchChannelLinkFragment.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.max.xiaoheihe.module.bbs.i<t> iVarU5;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42948, new Class[0], Void.TYPE).isSupported || (iVarU5 = b.this.U5()) == null) {
                return;
            }
            iVarU5.q();
        }
    }

    /* JADX INFO: compiled from: SearchChannelLinkFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<SearchLinkResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f91641c;

        d(String str, b bVar) {
            this.f91640b = str;
            this.f91641c = bVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42950, new Class[0], Void.TYPE).isSupported && f0.g(this.f91640b, b.P5(this.f91641c)) && this.f91641c.isActive()) {
                super.onComplete();
                b.K5(this.f91641c, this.f91640b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42949, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91640b, b.P5(this.f91641c)) && this.f91641c.isActive()) {
                super.onError(e10);
                b.K5(this.f91641c, this.f91640b);
            }
        }

        public void onNext(@dl.d Result<SearchLinkResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42951, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91640b, b.P5(this.f91641c)) && this.f91641c.isActive()) {
                this.f91641c.I.size();
                t tVar = this.f91641c.J;
                f0.m(tVar);
                tVar.u();
                if (result.getResult() != null) {
                    SearchLinkResult result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getList() != null) {
                        if (b.O5(this.f91641c) == 0) {
                            this.f91641c.I.clear();
                        }
                        SearchLinkResult result3 = result.getResult();
                        f0.m(result3);
                        result3.getList().size();
                        ArrayList arrayList = this.f91641c.I;
                        SearchLinkResult result4 = result.getResult();
                        f0.m(result4);
                        arrayList.addAll(result4.getList());
                    }
                }
                if (b.Q5(this.f91641c) != null && result.getResult() != null) {
                    b bVar = this.f91641c;
                    SearchLinkResult result5 = result.getResult();
                    f0.m(result5);
                    b.T5(bVar, result5.getSort_filter());
                }
                t tVar2 = this.f91641c.J;
                f0.m(tVar2);
                tVar2.notifyDataSetChanged();
                b.R5(this.f91641c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42952, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchLinkResult>) obj);
        }
    }

    public static final /* synthetic */ void K5(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 42938, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.Q3(str);
    }

    public static final /* synthetic */ int N5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 42937, new Class[]{b.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.a4();
    }

    public static final /* synthetic */ int O5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 42939, new Class[]{b.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.c4();
    }

    public static final /* synthetic */ String P5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 42936, new Class[]{b.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : bVar.d4();
    }

    public static final /* synthetic */ FilterButtonView Q5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 42940, new Class[]{b.class}, FilterButtonView.class);
        return patchProxyResultProxy.isSupported ? (FilterButtonView) patchProxyResultProxy.result : bVar.S4();
    }

    public static final /* synthetic */ void R5(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 42942, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.V5();
    }

    public static final /* synthetic */ void S5(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 42935, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.l5(str);
    }

    public static final /* synthetic */ void T5(b bVar, List list) {
        if (PatchProxy.proxy(new Object[]{bVar, list}, null, changeQuickRedirect, true, 42941, new Class[]{b.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.I5(list);
    }

    private final void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42933, new Class[0], Void.TYPE).isSupported) {
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
            if (c4() == 0) {
                P4().post(new c());
            }
        }
        t tVar2 = this.J;
        if (tVar2 != null) {
            tVar2.notifyDataSetChanged();
        }
        E5(true);
    }

    private final void W5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42932, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        z<Result<SearchLinkResult>> zVarH2 = com.max.xiaoheihe.network.i.a().h2(str, U4(), K4(), R4(), V4(), c4(), a4());
        f0.o(zVarH2, "createHeyBoxService()\n  …cParams, mOffset, mLimit)");
        addDisposable((io.reactivex.disposables.b) zVarH2.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str, this)));
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.i<t> U5() {
        return this.K;
    }

    public final void X5(@dl.e com.max.xiaoheihe.module.bbs.i<t> iVar) {
        this.K = iVar;
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42928, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new t(new a(this.mContext, this.I));
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42927, new Class[0], Void.TYPE).isSupported) {
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
        tabLayout.h(new C0854b());
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 42930, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        W5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 19;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42929, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.J;
        f0.m(tVar);
        tVar.p(R.layout.item_search_filter_header, X4());
        P4().setAdapter(this.J);
        this.K = new com.max.xiaoheihe.module.bbs.i<>(this, P4(), BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, P4());
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        t tVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42934, new Class[0], Void.TYPE).isSupported || (tVar = this.J) == null) {
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

    @Override // com.max.hbsearch.k
    public void z4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42931, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.z4(str);
        com.max.xiaoheihe.module.bbs.i<t> iVar = this.K;
        if (iVar != null) {
            iVar.v(str);
        }
    }
}
