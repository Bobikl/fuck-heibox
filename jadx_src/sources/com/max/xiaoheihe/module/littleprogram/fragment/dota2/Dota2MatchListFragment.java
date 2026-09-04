package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.annotation.SuppressLint;
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
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchListObj;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMatchObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.l8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2MatchListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.V3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2MatchListFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a D = new a(null);
    public static final int E = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f89033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l8 f89034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.overview.b f89035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final List<BaseGameOverviewObj> f89036y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private List<FilterGroup> f89037z = new ArrayList();

    @dl.e
    private String A = "-1";
    private int B = 30;

    /* JADX INFO: compiled from: Dota2MatchListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39281, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            Object obj = map != null ? map.get(Dota2GameDetailFragment.C.a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), (String) obj);
            Dota2MatchListFragment dota2MatchListFragment = new Dota2MatchListFragment();
            dota2MatchListFragment.setArguments(bundle);
            return dota2MatchListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39293, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2MatchListFragment.X4(Dota2MatchListFragment.this);
            Dota2MatchListFragment.U4(Dota2MatchListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchListFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39294, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2MatchListFragment.U4(Dota2MatchListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchListFragment.kt */
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39296, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2MatchListFragment.this.c5();
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        @dl.e
        public String getUserId() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39295, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2MatchListFragment.this.d5();
        }
    }

    /* JADX INFO: compiled from: Dota2MatchListFragment.kt */
    public static final class e implements com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        public void a(@dl.d List<FilterGroup> groupList) {
            if (PatchProxy.proxy(new Object[]{groupList}, this, changeQuickRedirect, false, 39297, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(groupList, "groupList");
            Dota2MatchListFragment.this.f89037z = groupList;
            Dota2MatchListFragment.X4(Dota2MatchListFragment.this);
            Dota2MatchListFragment.U4(Dota2MatchListFragment.this);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        @dl.e
        public List<FilterGroup> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39298, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Dota2MatchListFragment.this.f89037z;
        }
    }

    public static final /* synthetic */ void U4(Dota2MatchListFragment dota2MatchListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListFragment}, null, changeQuickRedirect, true, 39279, new Class[]{Dota2MatchListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchListFragment.b5();
    }

    public static final /* synthetic */ void W4(Dota2MatchListFragment dota2MatchListFragment, Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListFragment, dota2MatchListObj}, null, changeQuickRedirect, true, 39280, new Class[]{Dota2MatchListFragment.class, Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchListFragment.e5(dota2MatchListObj);
    }

    public static final /* synthetic */ void X4(Dota2MatchListFragment dota2MatchListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListFragment}, null, changeQuickRedirect, true, 39278, new Class[]{Dota2MatchListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchListFragment.g5();
    }

    @SuppressLint({"AutoDispose"})
    private final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39273, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        for (FilterGroup filterGroup : this.f89037z) {
            String key = filterGroup.getKey();
            FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(filterGroup);
            map.put(key, filterItemC != null ? filterItemC.getKey() : null);
        }
        addDisposable((io.reactivex.disposables.b) i.a().c0(this.f89032u, this.f89033v, this.A, this.B, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2MatchListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39282, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89042b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f89042b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchListFragment$getData$1$onError$1(this.f89042b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2MatchListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39283, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89042b.isActive()) {
                    y viewLifecycleOwner = this.f89042b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchListFragment$getData$1$onNext$1(this.f89042b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39284, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2MatchListObj>) obj);
            }
        }));
    }

    private final void e5(Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListObj}, this, changeQuickRedirect, false, 39274, new Class[]{Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<MatchObj> match_list = dota2MatchListObj != null ? dota2MatchListObj.getMatch_list() : null;
        if (f5()) {
            this.f89036y.clear();
            com.max.xiaoheihe.module.littleprogram.fragment.dota2.c cVar = com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f89134a;
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            cVar.c(mContext, a5().f112915d.b(), dota2MatchListObj != null ? dota2MatchListObj.getHeader_info() : null, null, new e());
            a5().f112916e.f109833c.setData(dota2MatchListObj != null ? dota2MatchListObj.getConsecutive_info() : null);
        }
        this.A = dota2MatchListObj != null ? dota2MatchListObj.getMatch_id() : null;
        showContentView();
        if (!com.max.hbcommon.utils.c.w(match_list)) {
            f0.m(match_list);
            Iterator<MatchObj> it = match_list.iterator();
            while (it.hasNext()) {
                GameOverviewMatchObj gameOverviewMatchObj = new GameOverviewMatchObj(it.next());
                gameOverviewMatchObj.setItem_type(com.max.xiaoheihe.module.game.adapter.overview.b.f85781z);
                this.f89036y.add(gameOverviewMatchObj);
            }
        }
        com.max.xiaoheihe.module.game.adapter.overview.b bVar = this.f89035x;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    private final boolean f5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39275, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.A, "-1");
    }

    private final void g5() {
        this.A = "-1";
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39272, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f89032u = arguments.getString(aVar.b());
        this.f89033v = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39271, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.C = System.currentTimeMillis();
        l8 l8VarC = l8.c(this.mInflater);
        f0.o(l8VarC, "inflate(mInflater)");
        h5(l8VarC);
        g5();
        a5().f112914c.setBackgroundResource(R.color.transparent);
        a5().f112914c.S(new b());
        a5().f112914c.f0(new c());
        a5().f112913b.setLayoutManager(new LinearLayoutManager(this.mContext));
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        List<BaseGameOverviewObj> list = this.f89036y;
        RecyclerView recyclerView = a5().f112913b;
        f0.o(recyclerView, "binding.rv");
        this.f89035x = new com.max.xiaoheihe.module.game.adapter.overview.b(mContext, list, recyclerView, new d(), getChildFragmentManager());
        a5().f112913b.setAdapter(this.f89035x);
        a5().f112914c.setVisibility(4);
        a5().f112913b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        b5();
        SmartRefreshLayout smartRefreshLayoutB = a5().b();
        f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39277, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : D.a(map);
    }

    @dl.d
    public final l8 a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39269, new Class[0], l8.class);
        if (patchProxyResultProxy.isSupported) {
            return (l8) patchProxyResultProxy.result;
        }
        l8 l8Var = this.f89034w;
        if (l8Var != null) {
            return l8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String c5() {
        return this.f89033v;
    }

    @dl.e
    public final String d5() {
        return this.f89032u;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39276, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f89032u);
        jsonObject.addProperty(aVar.a(), this.f89033v);
        return jsonObject.toString();
    }

    public final void h5(@dl.d l8 l8Var) {
        if (PatchProxy.proxy(new Object[]{l8Var}, this, changeQuickRedirect, false, 39270, new Class[]{l8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(l8Var, "<set-?>");
        this.f89034w = l8Var;
    }

    public final void i5(@dl.e String str) {
        this.f89033v = str;
    }

    public final void j5(@dl.e String str) {
        this.f89032u = str;
    }
}
