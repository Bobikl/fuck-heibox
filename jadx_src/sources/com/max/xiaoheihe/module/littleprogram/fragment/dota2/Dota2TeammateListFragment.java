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
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeammateListObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserItemView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.o8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2TeammateListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f89072h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f89073i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f89074j = "teammate";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o8 f89075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f89076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f89077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f89078e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<Dota2UserObj> f89079f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f89080g;

    /* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ Fragment b(a aVar, String str, String str2, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 39349, new Class[]{a.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return aVar.a(str, str2, (i10 & 4) == 0 ? z10 ? 1 : 0 : true);
        }

        @dl.d
        public final Fragment a(@dl.e String str, @dl.e String str2, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39348, new Class[]{String.class, String.class, Boolean.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), str2);
            bundle.putBoolean("teammate", z10);
            Dota2TeammateListFragment dota2TeammateListFragment = new Dota2TeammateListFragment();
            dota2TeammateListFragment.setArguments(bundle);
            return dota2TeammateListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39361, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2TeammateListFragment.M3(Dota2TeammateListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
    public static final class c extends s<Dota2UserObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, List<Dota2UserObj> list) {
            super(activity, list, R.layout.item_dota2_user);
        }

        public void m(@dl.e s.e eVar, @dl.e Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 39362, new Class[]{s.e.class, Dota2UserObj.class}, Void.TYPE).isSupported || eVar == null || dota2UserObj == null) {
                return;
            }
            ((Dota2UserItemView) eVar.i(R.id.v_dota2_user)).setData(dota2UserObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 39363, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2UserObj);
        }
    }

    /* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
    public static final class d implements Dota2HeroTitleView.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView.b
        public void a(@dl.d TextView tv, @dl.d String type) {
            if (PatchProxy.proxy(new Object[]{tv, type}, this, changeQuickRedirect, false, 39364, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tv, "tv");
            f0.p(type, "type");
            Dota2TeammateListFragment.this.f89080g = type;
            Dota2TeammateListFragment.M3(Dota2TeammateListFragment.this);
        }
    }

    public static final /* synthetic */ void M3(Dota2TeammateListFragment dota2TeammateListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2TeammateListFragment}, null, changeQuickRedirect, true, 39345, new Class[]{Dota2TeammateListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2TeammateListFragment.Q3();
    }

    public static final /* synthetic */ void N3(Dota2TeammateListFragment dota2TeammateListFragment, Dota2TeammateListObj dota2TeammateListObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeammateListFragment, dota2TeammateListObj}, null, changeQuickRedirect, true, 39347, new Class[]{Dota2TeammateListFragment.class, Dota2TeammateListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2TeammateListFragment.R3(dota2TeammateListObj);
    }

    public static final /* synthetic */ void O3(Dota2TeammateListFragment dota2TeammateListFragment, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeammateListFragment, gameOverviewHeaderInfoObj}, null, changeQuickRedirect, true, 39346, new Class[]{Dota2TeammateListFragment.class, GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2TeammateListFragment.T3(gameOverviewHeaderInfoObj);
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().p7(this.f89076c, this.f89077d, this.f89080g, this.f89078e).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2TeammateListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2TeammateListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39350, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89083b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f89083b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2TeammateListFragment$getData$1$onError$1(this.f89083b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2TeammateListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39351, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89083b.isActive()) {
                    y viewLifecycleOwner = this.f89083b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2TeammateListFragment$getData$1$onNext$1(this.f89083b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39352, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2TeammateListObj>) obj);
            }
        }));
    }

    private final void R3(Dota2TeammateListObj dota2TeammateListObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeammateListObj}, this, changeQuickRedirect, false, 39342, new Class[]{Dota2TeammateListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89079f.clear();
        if (dota2TeammateListObj != null) {
            this.f89080g = dota2TeammateListObj.getOrder_by();
            List<Dota2UserObj> user_list = dota2TeammateListObj.getUser_list();
            if (user_list != null) {
                this.f89079f.addAll(user_list);
            }
            S3();
            T3(dota2TeammateListObj.getHeader_info());
        }
        o8 o8Var = this.f89075b;
        if (o8Var == null) {
            f0.S("binding");
            o8Var = null;
        }
        RecyclerView.Adapter adapter = o8Var.f114132b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private final void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39344, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o8 o8Var = this.f89075b;
        o8 o8Var2 = null;
        if (o8Var == null) {
            f0.S("binding");
            o8Var = null;
        }
        o8Var.f114134d.c(this.f89080g);
        o8 o8Var3 = this.f89075b;
        if (o8Var3 == null) {
            f0.S("binding");
            o8Var3 = null;
        }
        o8Var3.f114134d.setCanClick(true);
        o8 o8Var4 = this.f89075b;
        if (o8Var4 == null) {
            f0.S("binding");
        } else {
            o8Var2 = o8Var4;
        }
        o8Var2.f114134d.setOnSelectListener(new d());
    }

    private final void T3(GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (!PatchProxy.proxy(new Object[]{gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 39343, new Class[]{GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported && (getParentFragment() instanceof Dota2TeammateFragment)) {
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
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39340, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        o8 o8VarC = o8.c(this.mInflater);
        f0.o(o8VarC, "inflate(mInflater)");
        this.f89075b = o8VarC;
        o8 o8Var = null;
        if (o8VarC == null) {
            f0.S("binding");
            o8VarC = null;
        }
        setContentView(o8VarC);
        o8 o8Var2 = this.f89075b;
        if (o8Var2 == null) {
            f0.S("binding");
            o8Var2 = null;
        }
        o8Var2.f114133c.setBackgroundColor(0);
        o8 o8Var3 = this.f89075b;
        if (o8Var3 == null) {
            f0.S("binding");
            o8Var3 = null;
        }
        o8Var3.f114132b.setBackgroundColor(0);
        o8 o8Var4 = this.f89075b;
        if (o8Var4 == null) {
            f0.S("binding");
            o8Var4 = null;
        }
        o8Var4.f114133c.b0(false);
        o8 o8Var5 = this.f89075b;
        if (o8Var5 == null) {
            f0.S("binding");
            o8Var5 = null;
        }
        o8Var5.f114133c.S(new b());
        Bundle arguments = getArguments();
        if (arguments != null) {
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            this.f89076c = arguments.getString(aVar.b());
            this.f89077d = arguments.getString(aVar.a());
            this.f89078e = arguments.getBoolean("teammate");
        }
        o8 o8Var6 = this.f89075b;
        if (o8Var6 == null) {
            f0.S("binding");
            o8Var6 = null;
        }
        o8Var6.f114132b.setLayoutManager(new LinearLayoutManager(this.mContext));
        o8 o8Var7 = this.f89075b;
        if (o8Var7 == null) {
            f0.S("binding");
        } else {
            o8Var = o8Var7;
        }
        o8Var.f114132b.setAdapter(new c(this.mContext, this.f89079f));
        Q3();
    }
}
