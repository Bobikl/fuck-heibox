package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: GameOverviewAuthsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewAuthsObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Dota2UserListObj follows_tab;

    @e
    private Dota2UserListObj friends_tab;

    @e
    private String select;

    @e
    private Dota2UserListObj teammates_tab;

    @e
    public final Dota2UserListObj getFollows_tab() {
        return this.follows_tab;
    }

    @e
    public final Dota2UserListObj getFriends_tab() {
        return this.friends_tab;
    }

    @e
    public final String getSelect() {
        return this.select;
    }

    @e
    public final Dota2UserListObj getTeammates_tab() {
        return this.teammates_tab;
    }

    public final void setFollows_tab(@e Dota2UserListObj dota2UserListObj) {
        this.follows_tab = dota2UserListObj;
    }

    public final void setFriends_tab(@e Dota2UserListObj dota2UserListObj) {
        this.friends_tab = dota2UserListObj;
    }

    public final void setSelect(@e String str) {
        this.select = str;
    }

    public final void setTeammates_tab(@e Dota2UserListObj dota2UserListObj) {
        this.teammates_tab = dota2UserListObj;
    }
}
