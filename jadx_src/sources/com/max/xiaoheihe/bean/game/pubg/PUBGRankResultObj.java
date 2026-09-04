package com.max.xiaoheihe.bean.game.pubg;

import com.max.hbcommon.bean.FiltersObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGRankResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PlayerRankObj> board;
    private String board_value_desc;
    private List<FiltersObj> filter;
    private PlayerRankObj user_rank;

    public List<PlayerRankObj> getBoard() {
        return this.board;
    }

    public String getBoard_value_desc() {
        return this.board_value_desc;
    }

    public List<FiltersObj> getFilter() {
        return this.filter;
    }

    public PlayerRankObj getUser_rank() {
        return this.user_rank;
    }

    public void setBoard(List<PlayerRankObj> list) {
        this.board = list;
    }

    public void setBoard_value_desc(String str) {
        this.board_value_desc = str;
    }

    public void setFilter(List<FiltersObj> list) {
        this.filter = list;
    }

    public void setUser_rank(PlayerRankObj playerRankObj) {
        this.user_rank = playerRankObj;
    }
}
