package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.MoreButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameListWithTabObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.GameTabListObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameListWithTabVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86120h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86121g;

    /* JADX INFO: compiled from: GameListWithTabVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86123c;

        a(String str) {
            this.f86123c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35982, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(g.this.v().b(), this.f86123c);
        }
    }

    /* JADX INFO: compiled from: GameListWithTabVHB.kt */
    @t0({"SMAP\nGameListWithTabVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameListWithTabVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/GameListWithTabVHB$contentBinding$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,115:1\n1295#2,2:116\n1295#2,2:118\n*S KotlinDebug\n*F\n+ 1 GameListWithTabVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/GameListWithTabVHB$contentBinding$2\n*L\n94#1:116,2\n102#1:118,2\n*E\n"})
    public static final class b implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f86125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MoreButton f86127d;

        /* JADX INFO: compiled from: GameListWithTabVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f86128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameRecommendBaseObj f86129c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TabLayout.h f86130d;

            a(g gVar, GameRecommendBaseObj gameRecommendBaseObj, TabLayout.h hVar) {
                this.f86128b = gVar;
                this.f86129c = gameRecommendBaseObj;
                this.f86130d = hVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameTabListObj gameTabListObj;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35985, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context contextB = this.f86128b.v().b();
                ArrayList<GameTabListObj> tabs = ((GameListWithTabObj) this.f86129c).getTabs();
                com.max.xiaoheihe.base.router.b.k0(contextB, (tabs == null || (gameTabListObj = tabs.get(this.f86130d.k())) == null) ? null : gameTabListObj.getProt());
            }
        }

        b(GameRecommendBaseObj gameRecommendBaseObj, g gVar, int i10, MoreButton moreButton) {
            this.f86124a = gameRecommendBaseObj;
            this.f86125b = gVar;
            this.f86126c = i10;
            this.f86127d = moreButton;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x01c5  */
        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            TabLayout.TabView tabView;
            kotlin.sequences.m<View> mVarE;
            GameTabListObj gameTabListObj;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 35983, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(hVar != null && hVar.k() == ((GameListWithTabObj) this.f86124a).getCurrentTab())) {
                ((GameListWithTabObj) this.f86124a).setDirty(true);
                String current_tab = ((GameListWithTabObj) this.f86124a).getCurrent_tab();
                String strValueOf = String.valueOf(hVar != null ? Integer.valueOf(hVar.k()) : null);
                com.max.hbcommon.base.adapter.u<?> uVarA = this.f86125b.v().a();
                String str = "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter";
                f0.n(uVarA, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter");
                int iP = ((GameRecommendAdapter) uVarA).p(this.f86124a);
                if (iP < 0) {
                    com.max.heybox.hblog.g.f74531b.v("GameListWithTabVHB, onTabSelected, " + current_tab + " -> " + strValueOf + ", dataIndex = " + iP + ", dataIndexWrapper = " + this.f86126c);
                    return;
                }
                int currentSize = ((GameListWithTabObj) this.f86124a).getCurrentSize();
                for (int i10 = 0; i10 < currentSize; i10++) {
                    int i11 = iP + 1;
                    if (i11 < this.f86125b.v().a().getDataList().size()) {
                        this.f86125b.v().a().getDataList().remove(i11);
                    }
                }
                ((GameListWithTabObj) this.f86124a).setCurrent_tab(String.valueOf(hVar != null ? Integer.valueOf(hVar.k()) : null));
                int currentSize2 = ((GameListWithTabObj) this.f86124a).getCurrentSize();
                int i12 = 0;
                while (i12 < currentSize2) {
                    com.max.hbcommon.base.adapter.u<?> uVarA2 = this.f86125b.v().a();
                    f0.n(uVarA2, str);
                    GameRecommendAdapter.Companion companion = GameRecommendAdapter.f85954d;
                    GameRecommendBaseObj gameRecommendBaseObj = this.f86124a;
                    ArrayList<GameTabListObj> tabs = ((GameListWithTabObj) gameRecommendBaseObj).getTabs();
                    f0.m(tabs);
                    f0.m(hVar);
                    String str2 = str;
                    List<GameObj> games = tabs.get(hVar.k()).getGames();
                    f0.m(games);
                    ((GameRecommendAdapter) uVarA2).getDataList().add(iP + 1 + i12, companion.a(gameRecommendBaseObj, games.get(i12), i12));
                    i12++;
                    str = str2;
                }
                com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GameListWithTabVHB, onTabSelected, ");
                sb2.append(current_tab);
                sb2.append(" -> ");
                sb2.append(strValueOf);
                sb2.append(", changeIndex = ");
                int i13 = iP + 1;
                sb2.append(i13);
                sb2.append(", currentSizeOld = ");
                sb2.append(currentSize);
                sb2.append(", currentSizeNew = ");
                sb2.append(currentSize2);
                aVar.q(sb2.toString());
                this.f86125b.v().a().notifyItemRangeChanged(i13, Math.max(currentSize, currentSize2));
                if (hVar == null) {
                    this.f86127d.setVisibility(8);
                } else {
                    ArrayList<GameTabListObj> tabs2 = ((GameListWithTabObj) this.f86124a).getTabs();
                    if (com.max.hbcommon.utils.c.u((tabs2 == null || (gameTabListObj = tabs2.get(hVar.k())) == null) ? null : gameTabListObj.getProt())) {
                        this.f86127d.setVisibility(8);
                    } else {
                        this.f86127d.setVisibility(0);
                        this.f86127d.setOnClickListener(new a(this.f86125b, this.f86124a, hVar));
                    }
                }
            }
            if (hVar == null || (tabView = hVar.f55494i) == null || (mVarE = ViewGroupKt.e(tabView)) == null) {
                return;
            }
            for (View view : mVarE) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            TabLayout.TabView tabView;
            kotlin.sequences.m<View> mVarE;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 35984, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (tabView = hVar.f55494i) == null || (mVarE = ViewGroupKt.e(tabView)) == null) {
                return;
            }
            for (View view : mVarE) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    public g(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86121g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        GameTabListObj gameTabListObj;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35981, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        com.max.hbcommon.base.adapter.u<?> uVarA = this.f86121g.a();
        f0.n(uVarA, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter");
        int iP = ((GameRecommendAdapter) uVarA).p(data);
        if (data instanceof GameListWithTabObj) {
            TabLayout tabLayout = (TabLayout) viewHolder.i(R.id.tab);
            MoreButton moreButton = (MoreButton) viewHolder.i(R.id.f76247mb);
            tabLayout.L();
            tabLayout.t();
            GameListWithTabObj gameListWithTabObj = (GameListWithTabObj) data;
            if (!com.max.hbcommon.utils.c.w(gameListWithTabObj.getTabs())) {
                ArrayList<GameTabListObj> tabs = gameListWithTabObj.getTabs();
                f0.m(tabs);
                for (GameTabListObj gameTabListObj2 : tabs) {
                    TabLayout.h hVarI = tabLayout.I();
                    f0.o(hVarI, "tabLayout.newTab()");
                    hVarI.D(gameTabListObj2.getName());
                    tabLayout.i(hVarI);
                }
            }
            ArrayList<GameTabListObj> tabs2 = gameListWithTabObj.getTabs();
            String prot = (tabs2 == null || (gameTabListObj = tabs2.get(gameListWithTabObj.getCurrentTab())) == null) ? null : gameTabListObj.getProt();
            if (com.max.hbcommon.utils.c.u(prot)) {
                moreButton.setVisibility(8);
            } else {
                moreButton.setVisibility(0);
                moreButton.setOnClickListener(new a(prot));
            }
            tabLayout.R(tabLayout.D(gameListWithTabObj.getCurrentTab()));
            tabLayout.h(new b(data, this, iP, moreButton));
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86121g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35980, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86121g = recommendVHBParam;
    }
}
