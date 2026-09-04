package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameRollEarnInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5520717967870438853L;
    private String game_count;
    private String total_price;
    private BBSUserInfoObj user_info;
    private List<RollItemObj> win_items;

    public String getGame_count() {
        return this.game_count;
    }

    public String getTotal_price() {
        return this.total_price;
    }

    public BBSUserInfoObj getUser_info() {
        return this.user_info;
    }

    public List<RollItemObj> getWin_items() {
        return this.win_items;
    }

    public void setGame_count(String str) {
        this.game_count = str;
    }

    public void setTotal_price(String str) {
        this.total_price = str;
    }

    public void setUser_info(BBSUserInfoObj bBSUserInfoObj) {
        this.user_info = bBSUserInfoObj;
    }

    public void setWin_items(List<RollItemObj> list) {
        this.win_items = list;
    }
}
