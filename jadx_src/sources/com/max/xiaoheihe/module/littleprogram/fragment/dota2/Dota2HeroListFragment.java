package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2HeroListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroItemView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.h8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2HeroListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.Z3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2HeroListFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a A = new a(null);
    public static final int B = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f88977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f88978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h8 f88979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final List<GameOverviewHeroObj> f88980x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f88981y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f88982z;

    /* JADX INFO: compiled from: Dota2HeroListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39129, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            Object obj = map != null ? map.get(Dota2GameDetailFragment.C.a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), (String) obj);
            Dota2HeroListFragment dota2HeroListFragment = new Dota2HeroListFragment();
            dota2HeroListFragment.setArguments(bundle);
            return dota2HeroListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2HeroListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39141, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2HeroListFragment.U4(Dota2HeroListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2HeroListFragment.kt */
    public static final class c extends s<GameOverviewHeroObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, List<GameOverviewHeroObj> list) {
            super(activity, list, R.layout.item_dota2_hero);
        }

        public void m(@dl.e s.e eVar, @dl.e GameOverviewHeroObj gameOverviewHeroObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameOverviewHeroObj}, this, changeQuickRedirect, false, 39142, new Class[]{s.e.class, GameOverviewHeroObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2HeroListFragment dota2HeroListFragment = Dota2HeroListFragment.this;
            if (gameOverviewHeroObj != null) {
                ((Dota2HeroItemView) eVar.i(R.id.v_dota2_hero)).setData(gameOverviewHeroObj, dota2HeroListFragment.b5(), dota2HeroListFragment.a5());
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameOverviewHeroObj gameOverviewHeroObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameOverviewHeroObj}, this, changeQuickRedirect, false, 39143, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameOverviewHeroObj);
        }
    }

    /* JADX INFO: compiled from: Dota2HeroListFragment.kt */
    public static final class d implements Dota2HeroTitleView.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView.b
        public void a(@dl.d TextView tv, @dl.d String type) {
            if (PatchProxy.proxy(new Object[]{tv, type}, this, changeQuickRedirect, false, 39144, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tv, "tv");
            f0.p(type, "type");
            Dota2HeroListFragment.this.f88982z = type;
            Dota2HeroListFragment.U4(Dota2HeroListFragment.this);
        }
    }

    public static final /* synthetic */ void U4(Dota2HeroListFragment dota2HeroListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2HeroListFragment}, null, changeQuickRedirect, true, 39127, new Class[]{Dota2HeroListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2HeroListFragment.Z4();
    }

    public static final /* synthetic */ void V4(Dota2HeroListFragment dota2HeroListFragment, Dota2HeroListObj dota2HeroListObj) {
        if (PatchProxy.proxy(new Object[]{dota2HeroListFragment, dota2HeroListObj}, null, changeQuickRedirect, true, 39128, new Class[]{Dota2HeroListFragment.class, Dota2HeroListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2HeroListFragment.c5(dota2HeroListObj);
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39122, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().k8(this.f88977u, this.f88978v, this.f88982z).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2HeroListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2HeroListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39130, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f88986b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f88986b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2HeroListFragment$getData$1$onError$1(this.f88986b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2HeroListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39131, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f88986b.isActive()) {
                    y viewLifecycleOwner = this.f88986b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2HeroListFragment$getData$1$onNext$1(this.f88986b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39132, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2HeroListObj>) obj);
            }
        }));
    }

    private final void c5(Dota2HeroListObj dota2HeroListObj) {
        if (PatchProxy.proxy(new Object[]{dota2HeroListObj}, this, changeQuickRedirect, false, 39123, new Class[]{Dota2HeroListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.littleprogram.fragment.dota2.c cVar = com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f89134a;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        cVar.e(mContext, Y4().f111323e.b(), dota2HeroListObj != null ? dota2HeroListObj.getHeader_info() : null);
        this.f88982z = dota2HeroListObj != null ? dota2HeroListObj.getOrder_by() : null;
        d5();
        this.f88980x.clear();
        List<GameOverviewHeroObj> status_list = dota2HeroListObj != null ? dota2HeroListObj.getStatus_list() : null;
        if (!com.max.hbcommon.utils.c.w(status_list)) {
            f0.m(status_list);
            Iterator<GameOverviewHeroObj> it = status_list.iterator();
            while (it.hasNext()) {
                it.next().setItem_type(com.max.xiaoheihe.module.game.adapter.overview.b.f85781z);
            }
            this.f88980x.addAll(status_list);
        }
        RecyclerView.Adapter adapter = Y4().f111320b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        showContentView();
    }

    private final void d5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39124, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y4().f111322d.c(this.f88982z);
        Y4().f111322d.setCanClick(true);
        Y4().f111322d.setOnSelectListener(new d());
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39121, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f88977u = arguments.getString(aVar.b());
        this.f88978v = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39120, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.f88981y = System.currentTimeMillis();
        h8 h8VarC = h8.c(this.mInflater);
        f0.o(h8VarC, "inflate(mInflater)");
        e5(h8VarC);
        Y4().f111321c.setBackgroundResource(R.color.transparent);
        Y4().f111321c.S(new b());
        Y4().f111321c.b0(false);
        Y4().f111320b.setLayoutManager(new LinearLayoutManager(this.mContext));
        Y4().f111320b.setAdapter(new c(this.mContext, this.f88980x));
        Y4().f111321c.setVisibility(4);
        Y4().f111320b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        Z4();
        SmartRefreshLayout smartRefreshLayoutB = Y4().b();
        f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    @dl.d
    public final h8 Y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39118, new Class[0], h8.class);
        if (patchProxyResultProxy.isSupported) {
            return (h8) patchProxyResultProxy.result;
        }
        h8 h8Var = this.f88979w;
        if (h8Var != null) {
            return h8Var;
        }
        f0.S("binding");
        return null;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39126, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : A.a(map);
    }

    @dl.e
    public final String a5() {
        return this.f88978v;
    }

    @dl.e
    public final String b5() {
        return this.f88977u;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    public final void e5(@dl.d h8 h8Var) {
        if (PatchProxy.proxy(new Object[]{h8Var}, this, changeQuickRedirect, false, 39119, new Class[]{h8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(h8Var, "<set-?>");
        this.f88979w = h8Var;
    }

    public final void f5(@dl.e String str) {
        this.f88978v = str;
    }

    public final void g5(@dl.e String str) {
        this.f88977u = str;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39125, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f88977u);
        jsonObject.addProperty(aVar.a(), this.f88978v);
        return jsonObject.toString();
    }
}
