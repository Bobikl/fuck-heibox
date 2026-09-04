package com.max.xiaoheihe.bean.game.apex;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApexSearchObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ApexSearchPlayerObj> player_list;
    private String query;

    public List<ApexSearchPlayerObj> getPlayer_list() {
        return this.player_list;
    }

    public String getQuery() {
        return this.query;
    }

    public void setPlayer_list(List<ApexSearchPlayerObj> list) {
        this.player_list = list;
    }

    public void setQuery(String str) {
        this.query = str;
    }
}
