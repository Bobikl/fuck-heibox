package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameAchievementListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameAchievementObj> games;
    private StatsObj stats;

    public List<GameAchievementObj> getGames() {
        return this.games;
    }

    public StatsObj getStats() {
        return this.stats;
    }

    public GameAchievementListObj setGames(List<GameAchievementObj> list) {
        this.games = list;
        return this;
    }

    public void setStats(StatsObj statsObj) {
        this.stats = statsObj;
    }
}
