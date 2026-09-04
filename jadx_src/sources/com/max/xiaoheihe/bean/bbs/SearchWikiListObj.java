package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchWikiListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<WikiArticelObj> search_result;
    private List<WikiListObj> wikis;

    public List<WikiArticelObj> getSearch_result() {
        return this.search_result;
    }

    public List<WikiListObj> getWikis() {
        return this.wikis;
    }

    public void setSearch_result(List<WikiArticelObj> list) {
        this.search_result = list;
    }

    public void setWikis(List<WikiListObj> list) {
        this.wikis = list;
    }
}
