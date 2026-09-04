package com.max.xiaoheihe.bean.game;

import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.FiltersObj;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRatingDistributionObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerLeaderboardsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PlayerInfoObj> board;
    private String board_value_desc;
    private List<PlayerInfoObj> boards;

    @SerializedName(alternate = {"filters"}, value = "filter")
    private List<FiltersObj> filter;
    private String key1;
    private String key2;
    private String key3;
    private List<PlayerInfoObj> player_list;
    private List<PUBGRatingDistributionObj> rating_distribution;

    public List<PlayerInfoObj> getBoard() {
        return this.board;
    }

    public String getBoard_value_desc() {
        return this.board_value_desc;
    }

    public List<PlayerInfoObj> getBoards() {
        return this.boards;
    }

    public List<FiltersObj> getFilter() {
        return this.filter;
    }

    public String getKey1() {
        return this.key1;
    }

    public String getKey2() {
        return this.key2;
    }

    public String getKey3() {
        return this.key3;
    }

    public List<PlayerInfoObj> getPlayer_list() {
        return this.player_list;
    }

    public List<PUBGRatingDistributionObj> getRating_distribution() {
        return this.rating_distribution;
    }

    public void setBoard(List<PlayerInfoObj> list) {
        this.board = list;
    }

    public void setBoard_value_desc(String str) {
        this.board_value_desc = str;
    }

    public void setBoards(List<PlayerInfoObj> list) {
        this.boards = list;
    }

    public void setFilter(List<FiltersObj> list) {
        this.filter = list;
    }

    public void setKey1(String str) {
        this.key1 = str;
    }

    public void setKey2(String str) {
        this.key2 = str;
    }

    public void setKey3(String str) {
        this.key3 = str;
    }

    public void setPlayer_list(List<PlayerInfoObj> list) {
        this.player_list = list;
    }

    public void setRating_distribution(List<PUBGRatingDistributionObj> list) {
        this.rating_distribution = list;
    }
}
