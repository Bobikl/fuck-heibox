package com.max.xiaoheihe.module.game.adapter.overview.binder;

import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMatchListObj;
import com.max.xiaoheihe.module.game.component.GameConsecutiveWinView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchListTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewMatchListVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85904b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85905a;

    public t(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85905a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35819, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35818, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewMatchListObj) {
            GameConsecutiveWinView gameConsecutiveWinView = (GameConsecutiveWinView) viewHolder.i(R.id.v_game_consecutive_win);
            Dota2MatchListTitleView dota2MatchListTitleView = (Dota2MatchListTitleView) viewHolder.i(R.id.v_match_list_title);
            gameConsecutiveWinView.setData(((GameOverviewMatchListObj) data).getConsecutive_info());
            if (f0.g(data.getItem_type(), com.max.xiaoheihe.module.game.adapter.overview.b.f85780y)) {
                dota2MatchListTitleView.getTv_dan().setText("MMR/排名");
            } else {
                dota2MatchListTitleView.getTv_dan().setText("对局段位");
            }
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85905a;
    }
}
