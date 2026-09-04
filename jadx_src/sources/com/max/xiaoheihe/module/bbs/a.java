package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ActColumnObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ActColumnContentFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nActColumnContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActColumnContentFragment.kt\ncom/max/xiaoheihe/module/bbs/ActColumnContentFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.news.adapter.a.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final C0674a f80234r = new C0674a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f80235s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final String f80236t = "arg_column_id";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final String f80237u = "arg_tab_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f80238v = "arg_tab_index";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f80239w = "arg_lastval";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f80240x = "arg_data";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f80241y = "arg_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80243c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80245e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f80249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private HashtagDetailContentFragment.e f80250j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.video.b f80254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RecyclerView f80255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SmartRefreshLayout f80256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RecyclerView.Adapter<com.max.hbcommon.base.adapter.s.e> f80257q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f80242b = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private String f80244d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private String f80246f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private String f80247g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private String f80248h = "1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSLinkObj> f80251k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final ArrayList<FeedsContentBaseObj> f80252l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final ArrayList<AbsVideoView> f80253m = new ArrayList<>();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class C0674a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0674a() {
        }

        public /* synthetic */ C0674a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final a a(@dl.d String colID, @dl.d String type, int i10, @dl.d String lastval, @dl.d ActColumnObj data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colID, type, new Integer(i10), lastval, data}, this, changeQuickRedirect, false, 25685, new Class[]{String.class, String.class, Integer.TYPE, String.class, ActColumnObj.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(colID, "colID");
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(lastval, "lastval");
            kotlin.jvm.internal.f0.p(data, "data");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString(a.f80236t, colID);
            bundle.putString(a.f80241y, type);
            bundle.putInt(a.f80238v, i10);
            bundle.putString(a.f80239w, lastval);
            bundle.putSerializable(a.f80240x, data);
            aVar.setArguments(bundle);
            return aVar;
        }

        @dl.d
        @xh.m
        public final a b(@dl.d String colID, @dl.d String type, @dl.d String tabID) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colID, type, tabID}, this, changeQuickRedirect, false, 25684, new Class[]{String.class, String.class, String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(colID, "colID");
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(tabID, "tabID");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString(a.f80236t, colID);
            bundle.putString(a.f80241y, type);
            bundle.putString(a.f80237u, tabID);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25686, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            a.Z3(a.this);
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25687, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            a.X3(a.this);
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActColumnContentFragment.kt */
        public static final class C0675a implements com.max.xiaoheihe.module.bbs.utils.b.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0675a f80261a = new C0675a();
            public static ChangeQuickRedirect changeQuickRedirect;

            C0675a() {
            }

            @Override // com.max.xiaoheihe.module.bbs.utils.b.y
            public final void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity, ArrayList<BBSLinkObj> arrayList) {
            super(activity, arrayList, R.layout.item_channels_link);
            kotlin.jvm.internal.f0.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.max.xiaoheihe.bean.bbs.BBSLinkObj>");
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25688, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            com.max.xiaoheihe.module.bbs.utils.b.N(viewHolder, data, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, null, true);
            ((BBSUserSectionView) viewHolder.i(R.id.vg_title)).setDesc(com.max.xiaoheihe.module.bbs.utils.b.t(((com.max.hbcommon.base.d) a.this).mContext, data));
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.ll_origin_post);
            viewGroup.setVisibility(8);
            if (data.getForward() != null) {
                LayoutInflater layoutInflater = this.mInflater;
                View viewB = viewHolder.b();
                kotlin.jvm.internal.f0.n(viewB, "null cannot be cast to non-null type android.view.ViewGroup");
                View viewInflate = layoutInflater.inflate(R.layout.item_forward_post, (ViewGroup) viewB, false);
                com.max.xiaoheihe.module.bbs.utils.b.P(((com.max.hbcommon.base.d) a.this).mContext, viewInflate, data.getForward(), com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, C0675a.f80261a);
                viewGroup.removeAllViews();
                viewGroup.setVisibility(0);
                viewGroup.addView(viewInflate);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 25689, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class e extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActColumnContentFragment.kt */
        public static final class ViewOnClickListenerC0676a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f80263b;

            ViewOnClickListenerC0676a(a aVar) {
                this.f80263b = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25692, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                RecyclerView recyclerView = this.f80263b.f80255o;
                SmartRefreshLayout smartRefreshLayout = null;
                if (recyclerView == null) {
                    kotlin.jvm.internal.f0.S("mRecyclerView");
                    recyclerView = null;
                }
                recyclerView.scrollToPosition(0);
                SmartRefreshLayout smartRefreshLayout2 = this.f80263b.f80256p;
                if (smartRefreshLayout2 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout = smartRefreshLayout2;
                }
                smartRefreshLayout.F();
            }
        }

        e(Activity activity, ArrayList<FeedsContentBaseObj> arrayList) {
            super(activity, arrayList, a.this);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 25691, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25690, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            super.p(viewHolder, data);
            if (viewHolder.d() == R.layout.item_concept_update) {
                viewHolder.i(R.id.vg_update).setOnClickListener(new ViewOnClickListenerC0676a(a.this));
                return;
            }
            if (viewHolder.d() == R.layout.item_concept_feeds_mobile_video) {
                AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
                if (a.this.f80253m.contains(absVideoView)) {
                    return;
                }
                a.this.f80253m.add(absVideoView);
            }
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class f extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25693, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            if (Math.abs(i11) > a.this.f80249i) {
                if (i11 > 0) {
                    HashtagDetailContentFragment.e eVar = a.this.f80250j;
                    if (eVar != null) {
                        eVar.t(false);
                        return;
                    }
                    return;
                }
                HashtagDetailContentFragment.e eVar2 = a.this.f80250j;
                if (eVar2 != null) {
                    eVar2.t(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ActColumnContentFragment.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<ActColumnObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25695, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (a.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = a.this.f80256p;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                SmartRefreshLayout smartRefreshLayout3 = a.this.f80256p;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.w();
                a.b4(a.this);
            }
        }

        public void onNext(@dl.d Result<ActColumnObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 25694, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            if (a.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = a.this.f80256p;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                SmartRefreshLayout smartRefreshLayout3 = a.this.f80256p;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.w();
                a.a4(a.this);
                a aVar = a.this;
                ActColumnObj result = t10.getResult();
                kotlin.jvm.internal.f0.o(result, "t.result");
                a.Y3(aVar, result);
                if (com.max.hbcommon.utils.c.u(t10.getMsg())) {
                    return;
                }
                com.max.hbutils.utils.c.f(t10.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25696, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ActColumnObj>) obj);
        }
    }

    public static final /* synthetic */ void X3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 25680, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.f4();
    }

    public static final /* synthetic */ void Y3(a aVar, ActColumnObj actColumnObj) {
        if (PatchProxy.proxy(new Object[]{aVar, actColumnObj}, null, changeQuickRedirect, true, 25682, new Class[]{a.class, ActColumnObj.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.i4(actColumnObj);
    }

    public static final /* synthetic */ void Z3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 25679, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.j4();
    }

    public static final /* synthetic */ void a4(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 25681, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showContentView();
    }

    public static final /* synthetic */ void b4(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 25683, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showError();
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25668, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = this.mContentView.findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById, "mContentView.findViewById(R.id.rv)");
        this.f80255o = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = this.mContentView.findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "mContentView.findViewById(R.id.srl)");
        this.f80256p = (SmartRefreshLayout) viewFindViewById2;
    }

    private final void d4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25671, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        String string = arguments.getString(f80236t);
        kotlin.jvm.internal.f0.m(string);
        this.f80246f = string;
        String string2 = arguments.getString(f80241y);
        kotlin.jvm.internal.f0.m(string2);
        this.f80248h = string2;
        String str = f80237u;
        if (arguments.getString(str) != null) {
            String string3 = arguments.getString(str);
            kotlin.jvm.internal.f0.m(string3);
            this.f80247g = string3;
            e4();
            j4();
            return;
        }
        this.f80245e = arguments.getInt(f80238v);
        String string4 = arguments.getString(f80239w);
        kotlin.jvm.internal.f0.m(string4);
        this.f80244d = string4;
        this.f80251k.clear();
        Serializable serializable = arguments.getSerializable(f80240x);
        kotlin.jvm.internal.f0.n(serializable, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.ActColumnObj");
        ArrayList<BBSLinkObj> links = ((ActColumnObj) serializable).getLinks();
        if (links != null) {
            this.f80251k.addAll(links);
            e4();
        }
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25670, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f80256p;
        RecyclerView recyclerView = null;
        if (smartRefreshLayout == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new b());
        SmartRefreshLayout smartRefreshLayout2 = this.f80256p;
        if (smartRefreshLayout2 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new c());
        if (kotlin.jvm.internal.f0.g(this.f80248h, "1")) {
            this.f80257q = new d(this.mContext, this.f80251k);
        } else {
            for (BBSLinkObj bBSLinkObj : this.f80251k) {
                ArrayList<FeedsContentBaseObj> arrayList = this.f80252l;
                kotlin.jvm.internal.f0.n(bBSLinkObj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.news.FeedsContentBaseObj");
                arrayList.add(bBSLinkObj);
            }
            this.f80257q = new e(this.mContext, this.f80252l);
        }
        RecyclerView recyclerView2 = this.f80255o;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView3 = this.f80255o;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        RecyclerView.Adapter<com.max.hbcommon.base.adapter.s.e> adapter = this.f80257q;
        if (adapter == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            adapter = null;
        }
        recyclerView3.setAdapter(adapter);
        RecyclerView recyclerView4 = this.f80255o;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.clearOnScrollListeners();
        RecyclerView recyclerView5 = this.f80255o;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
        } else {
            recyclerView = recyclerView5;
        }
        recyclerView.addOnScrollListener(new f());
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25673, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80243c += this.f80242b;
        k4();
    }

    @dl.d
    @xh.m
    public static final a g4(@dl.d String str, @dl.d String str2, int i10, @dl.d String str3, @dl.d ActColumnObj actColumnObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), str3, actColumnObj}, null, changeQuickRedirect, true, 25678, new Class[]{String.class, String.class, Integer.TYPE, String.class, ActColumnObj.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f80234r.a(str, str2, i10, str3, actColumnObj);
    }

    @dl.d
    @xh.m
    public static final a h4(@dl.d String str, @dl.d String str2, @dl.d String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 25677, new Class[]{String.class, String.class, String.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f80234r.b(str, str2, str3);
    }

    private final void i4(ActColumnObj actColumnObj) {
        if (PatchProxy.proxy(new Object[]{actColumnObj}, this, changeQuickRedirect, false, 25676, new Class[]{ActColumnObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<BBSLinkObj> links = actColumnObj.getLinks();
        if (links != null) {
            RecyclerView.Adapter<com.max.hbcommon.base.adapter.s.e> adapter = null;
            if (kotlin.jvm.internal.f0.g(this.f80248h, "1")) {
                this.f80251k.addAll(links);
                RecyclerView.Adapter<com.max.hbcommon.base.adapter.s.e> adapter2 = this.f80257q;
                if (adapter2 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    adapter = adapter2;
                }
                adapter.notifyDataSetChanged();
            } else {
                for (BBSLinkObj it : links) {
                    kotlin.jvm.internal.f0.o(it, "it");
                    BBSLinkObj bBSLinkObj = it;
                    ArrayList<FeedsContentBaseObj> arrayList = this.f80252l;
                    kotlin.jvm.internal.f0.n(bBSLinkObj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.news.FeedsContentBaseObj");
                    arrayList.add(bBSLinkObj);
                }
                RecyclerView.Adapter<com.max.hbcommon.base.adapter.s.e> adapter3 = this.f80257q;
                if (adapter3 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    adapter = adapter3;
                }
                adapter.notifyDataSetChanged();
            }
        }
        String lastval = actColumnObj.getLastval();
        if (lastval != null) {
            this.f80244d = lastval;
        }
    }

    private final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80243c = 0;
        this.f80251k.clear();
        this.f80252l.clear();
        k4();
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V3(this.f80246f, this.f80247g, Integer.valueOf(this.f80243c), Integer.valueOf(this.f80242b), this.f80244d).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private final void l4(ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25674, new Class[]{ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.xiaoheihe.module.video.b bVar = this.f80254n;
            if (bVar != null) {
                kotlin.jvm.internal.f0.m(bVar);
                bVar.c(absVideoView, viewGroup);
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.video.b bVar2 = this.f80254n;
        if (bVar2 != null) {
            kotlin.jvm.internal.f0.m(bVar2);
            bVar2.e();
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void B3(int i10) {
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void G2(int i10) {
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25666, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f80249i = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        c4();
        d4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25667, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        this.f80250j = (HashtagDetailContentFragment.e) getActivity();
        if (getParentFragment() instanceof com.max.xiaoheihe.module.video.b) {
            this.f80254n = (com.max.xiaoheihe.module.video.b) getParentFragment();
            return;
        }
        if (context instanceof com.max.xiaoheihe.module.video.b) {
            this.f80254n = (com.max.xiaoheihe.module.video.b) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement NewsListInteractionListener");
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25669, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j4();
    }
}
