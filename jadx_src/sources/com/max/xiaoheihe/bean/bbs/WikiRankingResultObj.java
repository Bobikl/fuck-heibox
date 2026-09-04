package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WikiRankingResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2129630806571895011L;
    private String update_at;
    private List<WikiRankingObj> wikis;

    public String getUpdate_at() {
        return this.update_at;
    }

    public List<WikiRankingObj> getWikis() {
        return this.wikis;
    }

    public void setUpdate_at(String str) {
        this.update_at = str;
    }

    public void setWikis(List<WikiRankingObj> list) {
        this.wikis = list;
    }
}
