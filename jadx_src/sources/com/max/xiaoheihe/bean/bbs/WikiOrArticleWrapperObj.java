package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class WikiOrArticleWrapperObj {
    public static final int ITEM_TYPE_ADDITION = 3;
    public static final int ITEM_TYPE_ARTICLE = 0;
    public static final int ITEM_TYPE_TITLE = 2;
    public static final int ITEM_TYPE_WIKI = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private WikiArticelObj article;
    private int itemType;
    private String title;
    private WikiListObj wiki;

    public WikiArticelObj getArticle() {
        return this.article;
    }

    public int getItemType() {
        return this.itemType;
    }

    public String getTitle() {
        return this.title;
    }

    public WikiListObj getWiki() {
        return this.wiki;
    }

    public void setArticle(WikiArticelObj wikiArticelObj) {
        this.article = wikiArticelObj;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWiki(WikiListObj wikiListObj) {
        this.wiki = wikiListObj;
    }
}
