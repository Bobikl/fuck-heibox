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
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeammateListObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowUserItemView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2FollowListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2FollowListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2FollowListFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2FollowListFragment\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,148:1\n29#2:149\n5#2,2:150\n22#2:152\n7#2:153\n*S KotlinDebug\n*F\n+ 1 Dota2FollowListFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2FollowListFragment\n*L\n90#1:149\n90#1:150,2\n90#1:152\n90#1:153\n*E\n"})
@o(parameters = 0)
public final class Dota2FollowListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f88915i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88916j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f88917k = "type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e8 f88918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f88919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f88920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f88921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f88922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f88923g = 30;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<Dota2UserObj> f88924h = new ArrayList();

    /* JADX INFO: compiled from: Dota2FollowListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e String str, @dl.e String str2, @dl.e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 39015, new Class[]{String.class, String.class, String.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), str2);
            bundle.putString("type", str3);
            Dota2FollowListFragment dota2FollowListFragment = new Dota2FollowListFragment();
            dota2FollowListFragment.setArguments(bundle);
            return dota2FollowListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2FollowListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39027, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2FollowListFragment.this.f88922f = 0;
            Dota2FollowListFragment.M3(Dota2FollowListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2FollowListFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39028, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2FollowListFragment.this.f88922f += Dota2FollowListFragment.this.f88923g;
            Dota2FollowListFragment.M3(Dota2FollowListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2FollowListFragment.kt */
    public static final class d extends s<Dota2UserObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Activity activity, List<Dota2UserObj> list) {
            super(activity, list, R.layout.item_game_overview_auth);
        }

        public void m(@dl.e s.e eVar, @dl.e Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 39029, new Class[]{s.e.class, Dota2UserObj.class}, Void.TYPE).isSupported || eVar == null || dota2UserObj == null) {
                return;
            }
            ((Dota2FollowUserItemView) eVar.i(R.id.v_dota2_follow)).setData(dota2UserObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 39030, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2UserObj);
        }
    }

    public static final /* synthetic */ void M3(Dota2FollowListFragment dota2FollowListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2FollowListFragment}, null, changeQuickRedirect, true, 39012, new Class[]{Dota2FollowListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2FollowListFragment.S3();
    }

    public static final /* synthetic */ void P3(Dota2FollowListFragment dota2FollowListFragment, Dota2TeammateListObj dota2TeammateListObj) {
        if (PatchProxy.proxy(new Object[]{dota2FollowListFragment, dota2TeammateListObj}, null, changeQuickRedirect, true, 39014, new Class[]{Dota2FollowListFragment.class, Dota2TeammateListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2FollowListFragment.T3(dota2TeammateListObj);
    }

    public static final /* synthetic */ void Q3(Dota2FollowListFragment dota2FollowListFragment, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (PatchProxy.proxy(new Object[]{dota2FollowListFragment, gameOverviewHeaderInfoObj}, null, changeQuickRedirect, true, 39013, new Class[]{Dota2FollowListFragment.class, GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2FollowListFragment.U3(gameOverviewHeaderInfoObj);
    }

    private final void S3() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39008, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = "Dota2FollowListFragment, getData, offset = " + this.f88922f;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (Dota2FollowListFragment.class.isAnonymousClass()) {
            name = Dota2FollowListFragment.class.getName();
            f0.m(name);
        } else {
            name = Dota2FollowListFragment.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        addDisposable((io.reactivex.disposables.b) i.a().t(this.f88919c, this.f88920d, this.f88922f, this.f88923g, this.f88921e).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2TeammateListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2FollowListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39016, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f88927b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f88927b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2FollowListFragment$getData$1$onError$1(this.f88927b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2TeammateListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39017, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f88927b.isActive()) {
                    y viewLifecycleOwner = this.f88927b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2FollowListFragment$getData$1$onNext$1(this.f88927b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39018, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2TeammateListObj>) obj);
            }
        }));
    }

    private final void T3(Dota2TeammateListObj dota2TeammateListObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeammateListObj}, this, changeQuickRedirect, false, 39009, new Class[]{Dota2TeammateListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f88922f == 0) {
            this.f88924h.clear();
        }
        if (dota2TeammateListObj != null) {
            List<Dota2UserObj> user_list = dota2TeammateListObj.getUser_list();
            if (user_list != null) {
                this.f88924h.addAll(user_list);
            }
            U3(dota2TeammateListObj.getHeader_info());
        }
        e8 e8Var = this.f88918b;
        if (e8Var == null) {
            f0.S("binding");
            e8Var = null;
        }
        RecyclerView.Adapter adapter = e8Var.f110061b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private final void U3(GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (!PatchProxy.proxy(new Object[]{gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 39010, new Class[]{GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported && (getParentFragment() instanceof Dota2TeammateFragment)) {
            Fragment parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2TeammateFragment");
            Dota2TeammateFragment dota2TeammateFragment = (Dota2TeammateFragment) parentFragment;
            if (dota2TeammateFragment.isActive()) {
                dota2TeammateFragment.X4(gameOverviewHeaderInfoObj);
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39007, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        e8 e8VarC = e8.c(this.mInflater);
        f0.o(e8VarC, "inflate(mInflater)");
        this.f88918b = e8VarC;
        e8 e8Var = null;
        if (e8VarC == null) {
            f0.S("binding");
            e8VarC = null;
        }
        setContentView(e8VarC);
        e8 e8Var2 = this.f88918b;
        if (e8Var2 == null) {
            f0.S("binding");
            e8Var2 = null;
        }
        e8Var2.f110062c.setBackgroundColor(0);
        e8 e8Var3 = this.f88918b;
        if (e8Var3 == null) {
            f0.S("binding");
            e8Var3 = null;
        }
        e8Var3.f110061b.setBackgroundColor(0);
        e8 e8Var4 = this.f88918b;
        if (e8Var4 == null) {
            f0.S("binding");
            e8Var4 = null;
        }
        e8Var4.f110062c.S(new b());
        e8 e8Var5 = this.f88918b;
        if (e8Var5 == null) {
            f0.S("binding");
            e8Var5 = null;
        }
        e8Var5.f110062c.f0(new c());
        Bundle arguments = getArguments();
        if (arguments != null) {
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            this.f88919c = arguments.getString(aVar.b());
            this.f88920d = arguments.getString(aVar.a());
            this.f88921e = arguments.getString("type");
        }
        e8 e8Var6 = this.f88918b;
        if (e8Var6 == null) {
            f0.S("binding");
            e8Var6 = null;
        }
        e8Var6.f110061b.setLayoutManager(new LinearLayoutManager(this.mContext));
        e8 e8Var7 = this.f88918b;
        if (e8Var7 == null) {
            f0.S("binding");
        } else {
            e8Var = e8Var7;
        }
        e8Var.f110061b.setAdapter(new d(this.mContext, this.f88924h));
        S3();
    }

    @Override // com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39011, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.shouldKeepViewOnDestroyView();
    }
}
