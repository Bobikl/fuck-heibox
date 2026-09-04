package com.max.xiaoheihe.module.game.adapter.overview.binder;

import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewUserListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewUserListTitleVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d0 extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85860b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85861a;

    /* JADX INFO: compiled from: GameOverviewUserListTitleVHB.kt */
    public static final class a implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseGameOverviewObj f85862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f85863b;

        a(BaseGameOverviewObj baseGameOverviewObj, d0 d0Var) {
            this.f85862a = baseGameOverviewObj;
            this.f85863b = d0Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            int iIndexOf;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 35861, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((hVar != null && hVar.k() == ((GameOverviewUserListObj) this.f85862a).getCurrentTab()) || (iIndexOf = this.f85863b.g().a().getDataList().indexOf(this.f85862a)) < 0) {
                return;
            }
            int currentSize = ((GameOverviewUserListObj) this.f85862a).getCurrentSize();
            for (int i10 = 0; i10 < currentSize; i10++) {
                int i11 = iIndexOf + 1;
                if (i11 < this.f85863b.g().a().getDataList().size()) {
                    this.f85863b.g().a().getDataList().remove(i11);
                }
            }
            ((GameOverviewUserListObj) this.f85862a).setTeammate(hVar != null && hVar.k() == 0);
            int currentSize2 = ((GameOverviewUserListObj) this.f85862a).getCurrentSize();
            for (int i12 = 0; i12 < currentSize2; i12++) {
                List<Dota2UserObj> teammates = ((GameOverviewUserListObj) this.f85862a).isTeammate() ? ((GameOverviewUserListObj) this.f85862a).getTeammates() : ((GameOverviewUserListObj) this.f85862a).getOpponents();
                f0.m(teammates);
                Dota2UserObj dota2UserObj = teammates.get(i12);
                dota2UserObj.setItem_type(com.max.xiaoheihe.module.game.adapter.overview.b.M);
                com.max.xiaoheihe.module.game.adapter.overview.b bVarA = this.f85863b.g().a();
                f0.n(bVarA, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.overview.GameOverviewAdapter");
                bVarA.getDataList().add(iIndexOf + 1 + i12, dota2UserObj);
            }
            this.f85863b.g().a().notifyItemRangeChanged(iIndexOf + 1, Math.max(currentSize, currentSize2));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    public d0(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85861a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35860, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35859, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewUserListObj) {
            GameOverviewUserListObj gameOverviewUserListObj = (GameOverviewUserListObj) data;
            if (com.max.hbcommon.utils.c.w(gameOverviewUserListObj.getTeammates()) || com.max.hbcommon.utils.c.w(gameOverviewUserListObj.getOpponents())) {
                return;
            }
            TabLayout tabLayout = (TabLayout) viewHolder.i(R.id.tab);
            tabLayout.L();
            tabLayout.t();
            TabLayout.h hVarI = tabLayout.I();
            f0.o(hVarI, "tabLayout.newTab()");
            hVarI.D("我的队友");
            tabLayout.i(hVarI);
            TabLayout.h hVarI2 = tabLayout.I();
            f0.o(hVarI2, "tabLayout.newTab()");
            hVarI2.D("我的对手");
            tabLayout.i(hVarI2);
            tabLayout.R(tabLayout.D(!gameOverviewUserListObj.isTeammate() ? 1 : 0));
            tabLayout.h(new a(data, this));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85861a;
    }
}
