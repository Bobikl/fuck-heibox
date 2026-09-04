package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewMatchListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewMatchListObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ConsecutiveInfoObj consecutive_info;

    @e
    private List<MatchObj> follow_match_list;

    @e
    private List<MatchObj> match_list;

    @e
    private String select;

    @e
    private String title;

    @e
    public final ConsecutiveInfoObj getConsecutive_info() {
        return this.consecutive_info;
    }

    @e
    public final List<MatchObj> getFollow_match_list() {
        return this.follow_match_list;
    }

    @e
    public final List<MatchObj> getMatch_list() {
        return this.match_list;
    }

    @e
    public final String getSelect() {
        return this.select;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setConsecutive_info(@e ConsecutiveInfoObj consecutiveInfoObj) {
        this.consecutive_info = consecutiveInfoObj;
    }

    public final void setFollow_match_list(@e List<MatchObj> list) {
        this.follow_match_list = list;
    }

    public final void setMatch_list(@e List<MatchObj> list) {
        this.match_list = list;
    }

    public final void setSelect(@e String str) {
        this.select = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
