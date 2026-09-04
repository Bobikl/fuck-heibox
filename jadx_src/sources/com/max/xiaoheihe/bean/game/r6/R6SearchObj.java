package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6SearchObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<R6FamousPlayerObj> player_list;
    private String query;

    public List<R6FamousPlayerObj> getPlayer_list() {
        return this.player_list;
    }

    public String getQuery() {
        return this.query;
    }

    public void setPlayer_list(List<R6FamousPlayerObj> list) {
        this.player_list = list;
    }

    public void setQuery(String str) {
        this.query = str;
    }
}
