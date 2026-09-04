package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMMRObj;
import com.max.xiaoheihe.bean.game.gameoverview.MMRInfo;
import com.max.xiaoheihe.module.game.component.GameDetailDataValueView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewMMRHeroVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class r extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85898b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85899a;

    /* JADX INFO: compiled from: GameOverviewMMRHeroVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f85900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<KeyDescObj> list, int i10, Context context) {
            super(context, list, R.layout.item_game_overview_mmr_right_data);
            this.f85900b = i10;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35799, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
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
            layoutParams.width = this.f85900b;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35800, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public r(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85899a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35798, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        List<KeyDescObj> match_stats;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35797, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewMMRObj) {
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_dan);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            GameDetailDataValueView gameDetailDataValueView = (GameDetailDataValueView) viewHolder.i(R.id.v_dv_mmr);
            GameDetailDataValueView gameDetailDataValueView2 = (GameDetailDataValueView) viewHolder.i(R.id.v_rank);
            Context contextB = this.f85899a.b();
            float fM = ViewUtils.m(contextB, (ViewUtils.L(contextB) - ViewUtils.f(contextB, 33.0f)) / 2, ViewUtils.f(contextB, 64.0f));
            viewGroup.setBackground(com.max.hbutils.utils.q.i(contextB, R.color.white_alpha5, R.color.white_alpha10, 0.5f, ViewUtils.h0(contextB, fM)));
            recyclerView.setBackground(com.max.hbutils.utils.q.i(contextB, R.color.white_alpha5, R.color.white_alpha10, 0.5f, ViewUtils.h0(contextB, fM)));
            gameDetailDataValueView.getTv_desc().setText("MMR");
            TextView tv_value = gameDetailDataValueView.getTv_value();
            GameOverviewMMRObj gameOverviewMMRObj = (GameOverviewMMRObj) data;
            MMRInfo mmr_info = gameOverviewMMRObj.getMmr_info();
            tv_value.setText(mmr_info != null ? mmr_info.getDan_value() : null);
            gameDetailDataValueView2.getTv_desc().setText("排名");
            TextView tv_value2 = gameDetailDataValueView2.getTv_value();
            MMRInfo mmr_info2 = gameOverviewMMRObj.getMmr_info();
            tv_value2.setText(mmr_info2 != null ? mmr_info2.getDan_desc() : null);
            MMRInfo mmr_info3 = gameOverviewMMRObj.getMmr_info();
            if (mmr_info3 == null || (match_stats = mmr_info3.getMatch_stats()) == null || match_stats.size() <= 0) {
                return;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85899a.b(), 0, false));
            recyclerView.setAdapter(new a(match_stats, ((ViewUtils.L(this.f85899a.b()) - ViewUtils.f(this.f85899a.b(), 49.0f)) / match_stats.size()) / 2, this.f85899a.b()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85899a;
    }
}
