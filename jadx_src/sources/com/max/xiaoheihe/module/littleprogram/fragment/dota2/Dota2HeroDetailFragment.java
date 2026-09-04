package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.g8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.f131132b4)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2HeroDetailFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a F = new a(null);
    public static final int G = 8;

    @dl.d
    private static final String H = "hero_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String B;

    @dl.e
    private String C;

    @dl.e
    private String D;
    private long E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f88961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f88962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private String f88963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g8 f88964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.overview.b f88965y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final List<BaseGameOverviewObj> f88966z = new ArrayList();

    @dl.d
    private List<FilterGroup> A = new ArrayList();

    /* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39099, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2HeroDetailFragment.H;
        }

        @dl.d
        public final Fragment b(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39100, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            String str2 = (String) (map != null ? map.get(Dota2GameDetailFragment.C.a()) : null);
            Object obj = map != null ? map.get(a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), str2);
            bundle.putString(a(), (String) obj);
            Dota2HeroDetailFragment dota2HeroDetailFragment = new Dota2HeroDetailFragment();
            dota2HeroDetailFragment.setArguments(bundle);
            return dota2HeroDetailFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39112, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2HeroDetailFragment.Y4(Dota2HeroDetailFragment.this);
            Dota2HeroDetailFragment.V4(Dota2HeroDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39113, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2HeroDetailFragment.V4(Dota2HeroDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
    public static final class d implements com.max.xiaoheihe.module.game.adapter.overview.b.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        public boolean a() {
            return true;
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        @dl.e
        public String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39115, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2HeroDetailFragment.this.h5();
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        @dl.e
        public String getUserId() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39114, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2HeroDetailFragment.this.i5();
        }
    }

    /* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
    public static final class e implements com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        public void a(@dl.d List<FilterGroup> groupList) {
            if (PatchProxy.proxy(new Object[]{groupList}, this, changeQuickRedirect, false, 39116, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(groupList, "groupList");
            Dota2HeroDetailFragment.this.A = groupList;
            Dota2HeroDetailFragment.Y4(Dota2HeroDetailFragment.this);
            Dota2HeroDetailFragment.V4(Dota2HeroDetailFragment.this);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        @dl.e
        public List<FilterGroup> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39117, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Dota2HeroDetailFragment.this.A;
        }
    }

    public static final /* synthetic */ void V4(Dota2HeroDetailFragment dota2HeroDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2HeroDetailFragment}, null, changeQuickRedirect, true, 39097, new Class[]{Dota2HeroDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2HeroDetailFragment.f5();
    }

    public static final /* synthetic */ void X4(Dota2HeroDetailFragment dota2HeroDetailFragment, List list) {
        if (PatchProxy.proxy(new Object[]{dota2HeroDetailFragment, list}, null, changeQuickRedirect, true, 39098, new Class[]{Dota2HeroDetailFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2HeroDetailFragment.j5(list);
    }

    public static final /* synthetic */ void Y4(Dota2HeroDetailFragment dota2HeroDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2HeroDetailFragment}, null, changeQuickRedirect, true, 39096, new Class[]{Dota2HeroDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2HeroDetailFragment.k5();
    }

    private final void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39091, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        for (FilterGroup filterGroup : this.A) {
            String key = filterGroup.getKey();
            FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(filterGroup);
            map.put(key, filterItemC != null ? filterItemC.getKey() : null);
        }
        addDisposable((io.reactivex.disposables.b) i.a().q1(this.f88961u, this.f88962v, this.f88963w, this.B, this.C, this.D, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<GameOverviewListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2HeroDetailFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39101, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f88971b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f88971b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2HeroDetailFragment$getData$1$onError$1(this.f88971b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<GameOverviewListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39102, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f88971b.isActive()) {
                    y viewLifecycleOwner = this.f88971b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2HeroDetailFragment$getData$1$onNext$1(this.f88971b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39103, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<GameOverviewListObj>) obj);
            }
        }));
    }

    private final void j5(List<BaseGameOverviewObj> list) {
        List<BaseGameOverviewObj> listA;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39092, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.B == null) {
            this.f88966z.clear();
        }
        if (list != null && (listA = com.max.xiaoheihe.module.game.adapter.overview.b.f85762g.a(list, this.A)) != null) {
            this.f88966z.addAll(listA);
        }
        com.max.xiaoheihe.module.game.adapter.overview.b bVar = this.f88965y;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    private final void k5() {
        this.B = null;
        this.C = null;
        this.D = null;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39090, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        this.f88961u = arguments.getString(H);
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f88962v = arguments.getString(aVar.b());
        this.f88963w = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39089, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.E = System.currentTimeMillis();
        g8 g8VarC = g8.c(this.mInflater);
        f0.o(g8VarC, "inflate(mInflater)");
        l5(g8VarC);
        e5().f110860c.setBackgroundResource(R.color.transparent);
        e5().f110860c.S(new b());
        e5().f110860c.f0(new c());
        e5().f110859b.setLayoutManager(new LinearLayoutManager(this.mContext));
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        List<BaseGameOverviewObj> list = this.f88966z;
        RecyclerView recyclerView = e5().f110859b;
        f0.o(recyclerView, "binding.rv");
        com.max.xiaoheihe.module.game.adapter.overview.b bVar = new com.max.xiaoheihe.module.game.adapter.overview.b(mContext, list, recyclerView, new d(), getChildFragmentManager());
        this.f88965y = bVar;
        bVar.v(new e());
        e5().f110859b.setAdapter(this.f88965y);
        e5().f110859b.setVisibility(4);
        e5().f110859b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        f5();
        SmartRefreshLayout smartRefreshLayoutB = e5().b();
        f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39095, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : F.b(map);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @dl.d
    public final g8 e5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39087, new Class[0], g8.class);
        if (patchProxyResultProxy.isSupported) {
            return (g8) patchProxyResultProxy.result;
        }
        g8 g8Var = this.f88964x;
        if (g8Var != null) {
            return g8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String g5() {
        return this.f88961u;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39094, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(H, this.f88962v);
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f88962v);
        jsonObject.addProperty(aVar.a(), this.f88963w);
        return jsonObject.toString();
    }

    @dl.e
    public final String h5() {
        return this.f88963w;
    }

    @dl.e
    public final String i5() {
        return this.f88962v;
    }

    public final void l5(@dl.d g8 g8Var) {
        if (PatchProxy.proxy(new Object[]{g8Var}, this, changeQuickRedirect, false, 39088, new Class[]{g8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(g8Var, "<set-?>");
        this.f88964x = g8Var;
    }

    public final void m5(@dl.e String str) {
        this.f88961u = str;
    }

    public final void n5(@dl.e String str) {
        this.f88963w = str;
    }

    public final void o5(@dl.e String str) {
        this.f88962v = str;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39093, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        f5();
    }
}
