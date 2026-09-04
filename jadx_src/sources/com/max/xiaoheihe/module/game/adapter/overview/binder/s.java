package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMMRObj;
import com.max.xiaoheihe.module.game.component.GameDanDataView;
import com.max.xiaoheihe.module.game.component.GameDetailDataValueView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewMMRVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85901b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85902a;

    /* JADX INFO: compiled from: GameOverviewMMRVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f85903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<KeyDescObj> list, int i10, Context context) {
            super(context, list, R.layout.item_game_overview_mmr_right_data);
            this.f85903b = i10;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35803, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailDataValueView gameDetailDataValueView = eVar != null ? (GameDetailDataValueView) eVar.i(R.id.v_game_detail_data_value) : null;
            if (gameDetailDataValueView != null) {
                gameDetailDataValueView.setData(keyDescObj);
            }
            ViewGroup.LayoutParams layoutParams = gameDetailDataValueView != null ? gameDetailDataValueView.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f85903b;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35804, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public s(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85902a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35802, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35801, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewMMRObj) {
            GameDanDataView gameDanDataView = (GameDanDataView) viewHolder.i(R.id.v_game_dan_data);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            GameOverviewMMRObj gameOverviewMMRObj = (GameOverviewMMRObj) data;
            gameDanDataView.setData(gameOverviewMMRObj.getMmr_info());
            Context contextB = this.f85902a.b();
            int iL = (ViewUtils.L(contextB) - ViewUtils.f(contextB, 33.0f)) / 2;
            recyclerView.setBackground(com.max.hbutils.utils.q.i(contextB, R.color.white_alpha3, R.color.white_alpha10, 0.5f, ViewUtils.h0(contextB, ViewUtils.m(contextB, iL, ViewUtils.f(contextB, 64.0f)))));
            List<KeyDescObj> match_stats = gameOverviewMMRObj.getMatch_stats();
            if (match_stats == null || match_stats.size() <= 0) {
                return;
            }
            int iA = (iL - ic.a.f119343a.a(this.f85902a.b(), 15.5f)) / fi.u.B(4, match_stats.size());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85902a.b(), 0, false));
            recyclerView.setAdapter(new a(match_stats, iA, this.f85902a.b()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85902a;
    }
}
