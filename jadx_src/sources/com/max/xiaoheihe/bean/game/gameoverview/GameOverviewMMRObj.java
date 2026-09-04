package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewMMRObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewMMRObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<KeyDescObj> match_stats;

    @e
    private MMRInfo mmr_info;

    @e
    public final List<KeyDescObj> getMatch_stats() {
        return this.match_stats;
    }

    @e
    public final MMRInfo getMmr_info() {
        return this.mmr_info;
    }

    public final void setMatch_stats(@e List<KeyDescObj> list) {
        this.match_stats = list;
    }

    public final void setMmr_info(@e MMRInfo mMRInfo) {
        this.mmr_info = mMRInfo;
    }
}
