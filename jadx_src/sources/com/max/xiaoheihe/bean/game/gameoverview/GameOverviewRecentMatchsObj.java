package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewRecentMatchsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewRecentMatchsObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String kda;

    @e
    private String lose;

    @e
    private List<MatchObj> match_list;

    @e
    private String title;

    @e
    private String win;

    @e
    public final String getKda() {
        return this.kda;
    }

    @e
    public final String getLose() {
        return this.lose;
    }

    @e
    public final List<MatchObj> getMatch_list() {
        return this.match_list;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    public final void setKda(@e String str) {
        this.kda = str;
    }

    public final void setLose(@e String str) {
        this.lose = str;
    }

    public final void setMatch_list(@e List<MatchObj> list) {
        this.match_list = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }
}
