package com.max.xiaoheihe.bean.game.destiny2;

import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.game.gamedata.GameDataTrendInfoObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeFilter;
import com.max.xiaoheihe.bean.game.pubg.PUBGStatsObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGTrendObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Destiny2StatsDetailObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameDataTrendInfoObj match_trend;
    private List<Destiny2MatchObj> matches;
    private List<PUBGGameModeFilter> modes;
    private List<PUBGDataObj> overview;
    private PlayerInfoObj player_info;
    private List<PUBGDataObj> radar_score;
    private List<PUBGStatsObj> stats;
    private List<PUBGTrendObj> trend;

    public GameDataTrendInfoObj getMatch_trend() {
        return this.match_trend;
    }

    public List<Destiny2MatchObj> getMatches() {
        return this.matches;
    }

    public List<PUBGGameModeFilter> getModes() {
        return this.modes;
    }

    public List<PUBGDataObj> getOverview() {
        return this.overview;
    }

    public PlayerInfoObj getPlayer_info() {
        return this.player_info;
    }

    public List<PUBGDataObj> getRadar_score() {
        return this.radar_score;
    }

    public List<PUBGStatsObj> getStats() {
        return this.stats;
    }

    public List<PUBGTrendObj> getTrend() {
        return this.trend;
    }

    public void setMatch_trend(GameDataTrendInfoObj gameDataTrendInfoObj) {
        this.match_trend = gameDataTrendInfoObj;
    }

    public void setMatches(List<Destiny2MatchObj> list) {
        this.matches = list;
    }

    public void setModes(List<PUBGGameModeFilter> list) {
        this.modes = list;
    }

    public void setOverview(List<PUBGDataObj> list) {
        this.overview = list;
    }

    public void setPlayer_info(PlayerInfoObj playerInfoObj) {
        this.player_info = playerInfoObj;
    }

    public void setRadar_score(List<PUBGDataObj> list) {
        this.radar_score = list;
    }

    public void setStats(List<PUBGStatsObj> list) {
        this.stats = list;
    }

    public void setTrend(List<PUBGTrendObj> list) {
        this.trend = list;
    }
}
