package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewHeroListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewHeroListObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameOverviewHeroObj> status_list;

    @e
    private String title;

    @e
    public final List<GameOverviewHeroObj> getStatus_list() {
        return this.status_list;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setStatus_list(@e List<GameOverviewHeroObj> list) {
        this.status_list = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
