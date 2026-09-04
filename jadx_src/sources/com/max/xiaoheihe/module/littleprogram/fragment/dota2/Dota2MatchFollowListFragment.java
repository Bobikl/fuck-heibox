package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchListObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowMatchItemView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.k8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2MatchFollowListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.W3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2MatchFollowListFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a A = new a(null);
    public static final int B = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f89017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k8 f89018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private s<MatchObj> f89019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final List<MatchObj> f89020y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f89021z;

    /* JADX INFO: compiled from: Dota2MatchFollowListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39253, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            Object obj = map != null ? map.get(Dota2GameDetailFragment.C.a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), (String) obj);
            Dota2MatchFollowListFragment dota2MatchFollowListFragment = new Dota2MatchFollowListFragment();
            dota2MatchFollowListFragment.setArguments(bundle);
            return dota2MatchFollowListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchFollowListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39265, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2MatchFollowListFragment.U4(Dota2MatchFollowListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchFollowListFragment.kt */
    public static final class c extends s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: Dota2MatchFollowListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MatchObj f89024b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Dota2MatchFollowListFragment f89025c;

            a(MatchObj matchObj, Dota2MatchFollowListFragment dota2MatchFollowListFragment) {
                this.f89024b = matchObj;
                this.f89025c = dota2MatchFollowListFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String match_id;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39268, new Class[]{View.class}, Void.TYPE).isSupported || (match_id = this.f89024b.getMatch_id()) == null) {
                    return;
                }
                Dota2MatchFollowListFragment dota2MatchFollowListFragment = this.f89025c;
                Activity mContext = ((com.max.hbcommon.base.d) dota2MatchFollowListFragment).mContext;
                f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.s0(mContext, match_id, dota2MatchFollowListFragment.b5(), dota2MatchFollowListFragment.a5());
            }
        }

        c(Activity activity, List<MatchObj> list) {
            super(activity, list, R.layout.item_game_overview_follow_match);
        }

        public void m(@dl.e s.e eVar, @dl.e MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39266, new Class[]{s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2MatchFollowListFragment dota2MatchFollowListFragment = Dota2MatchFollowListFragment.this;
            if (matchObj != null) {
                View viewI = eVar.i(R.id.v_match);
                f0.o(viewI, "viewHolder.getView(R.id.v_match)");
                Dota2FollowMatchItemView dota2FollowMatchItemView = (Dota2FollowMatchItemView) viewI;
                dota2FollowMatchItemView.setMatch(matchObj);
                dota2FollowMatchItemView.setOnClickListener(new a(matchObj, dota2MatchFollowListFragment));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39267, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    public static final /* synthetic */ void U4(Dota2MatchFollowListFragment dota2MatchFollowListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchFollowListFragment}, null, changeQuickRedirect, true, 39251, new Class[]{Dota2MatchFollowListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchFollowListFragment.Z4();
    }

    public static final /* synthetic */ void W4(Dota2MatchFollowListFragment dota2MatchFollowListFragment, Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchFollowListFragment, dota2MatchListObj}, null, changeQuickRedirect, true, 39252, new Class[]{Dota2MatchFollowListFragment.class, Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchFollowListFragment.c5(dota2MatchListObj);
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().Ra(this.f89016u, this.f89017v, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2MatchListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchFollowListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39254, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89026b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f89026b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchFollowListFragment$getData$1$onError$1(this.f89026b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2MatchListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39255, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89026b.isActive()) {
                    y viewLifecycleOwner = this.f89026b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchFollowListFragment$getData$1$onNext$1(this.f89026b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39256, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2MatchListObj>) obj);
            }
        }));
    }

    private final void c5(Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListObj}, this, changeQuickRedirect, false, 39248, new Class[]{Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89020y.clear();
        List<MatchObj> match_list = dota2MatchListObj != null ? dota2MatchListObj.getMatch_list() : null;
        if (!com.max.hbcommon.utils.c.w(match_list)) {
            List<MatchObj> list = this.f89020y;
            f0.m(match_list);
            list.addAll(match_list);
        }
        s<MatchObj> sVar = this.f89019x;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39246, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f89016u = arguments.getString(aVar.b());
        this.f89017v = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39245, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.f89021z = System.currentTimeMillis();
        k8 k8VarC = k8.c(this.mInflater);
        f0.o(k8VarC, "inflate(mInflater)");
        d5(k8VarC);
        Y4().f112470c.setBackgroundResource(R.color.transparent);
        Y4().f112470c.S(new b());
        Y4().f112470c.b0(false);
        Y4().f112469b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f89019x = new c(this.mContext, this.f89020y);
        Y4().f112469b.setAdapter(this.f89019x);
        Y4().f112470c.setVisibility(4);
        Y4().f112469b.setOverScrollMode(2);
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
    public final k8 Y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39243, new Class[0], k8.class);
        if (patchProxyResultProxy.isSupported) {
            return (k8) patchProxyResultProxy.result;
        }
        k8 k8Var = this.f89018w;
        if (k8Var != null) {
            return k8Var;
        }
        f0.S("binding");
        return null;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39250, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : A.a(map);
    }

    @dl.e
    public final String a5() {
        return this.f89017v;
    }

    @dl.e
    public final String b5() {
        return this.f89016u;
    }

    public final void d5(@dl.d k8 k8Var) {
        if (PatchProxy.proxy(new Object[]{k8Var}, this, changeQuickRedirect, false, 39244, new Class[]{k8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(k8Var, "<set-?>");
        this.f89018w = k8Var;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    public final void e5(@dl.e String str) {
        this.f89017v = str;
    }

    public final void f5(@dl.e String str) {
        this.f89016u = str;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39249, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f89016u);
        jsonObject.addProperty(aVar.a(), this.f89017v);
        return jsonObject.toString();
    }
}
