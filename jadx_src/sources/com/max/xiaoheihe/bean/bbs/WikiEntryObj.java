package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WikiEntryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8305492060139192623L;
    private String article_id;
    private String name;
    private String url;
    private String wiki_id;

    public String getArticle_id() {
        return this.article_id;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWiki_id() {
        return this.wiki_id;
    }

    public void setArticle_id(String str) {
        this.article_id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWiki_id(String str) {
        this.wiki_id = str;
    }
}
