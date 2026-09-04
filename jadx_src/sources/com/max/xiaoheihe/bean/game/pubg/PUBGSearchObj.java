package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGSearchObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PUBGPlayerObj> players;
    private String query;

    public List<PUBGPlayerObj> getPlayers() {
        return this.players;
    }

    public String getQuery() {
        return this.query;
    }

    public void setPlayers(List<PUBGPlayerObj> list) {
        this.players = list;
    }

    public void setQuery(String str) {
        this.query = str;
    }
}
