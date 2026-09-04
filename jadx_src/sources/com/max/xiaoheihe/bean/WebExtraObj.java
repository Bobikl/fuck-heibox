package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WebExtraObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8533877455429315623L;
    private String article_id;
    private String chooseTopic;
    private String wiki_id;

    public String getArticle_id() {
        return this.article_id;
    }

    public String getChooseTopic() {
        return this.chooseTopic;
    }

    public String getWiki_id() {
        return this.wiki_id;
    }

    public void setArticle_id(String str) {
        this.article_id = str;
    }

    public void setChooseTopic(String str) {
        this.chooseTopic = str;
    }

    public void setWiki_id(String str) {
        this.wiki_id = str;
    }
}
