package com.max.xiaoheihe.bean.favour;

import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FavourWikiResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<WikiArticelObj> favours_article;
    private List<WikiListObj> favours_wiki;

    public List<WikiArticelObj> getFavours_article() {
        return this.favours_article;
    }

    public List<WikiListObj> getFavours_wiki() {
        return this.favours_wiki;
    }

    public void setFavours_article(List<WikiArticelObj> list) {
        this.favours_article = list;
    }

    public void setFavours_wiki(List<WikiListObj> list) {
        this.favours_wiki = list;
    }
}
