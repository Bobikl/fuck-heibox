package com.max.xiaoheihe.bean.bbs;

import androidx.annotation.p0;
import com.max.hbcommon.bean.WikiObj;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class WikiArticelObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String article_id;
    private String article_name;
    private String article_url;
    private String custom_index;
    private String custom_suggested_from;
    private String extra_tag;
    private String image;
    private String report_id;
    private Boolean showDivider = Boolean.TRUE;
    private WikiObj wiki;

    public String getArticle_id() {
        return this.article_id;
    }

    public String getArticle_name() {
        return this.article_name;
    }

    public String getArticle_url() {
        return this.article_url;
    }

    public String getCustom_index() {
        return this.custom_index;
    }

    public String getCustom_suggested_from() {
        return this.custom_suggested_from;
    }

    public String getExtra_tag() {
        return this.extra_tag;
    }

    public String getImage() {
        return this.image;
    }

    @p0
    public String getReport_id() {
        return this.report_id;
    }

    public Boolean getShowDivider() {
        return this.showDivider;
    }

    public WikiObj getWiki() {
        return this.wiki;
    }

    public void setArticle_id(String str) {
        this.article_id = str;
    }

    public void setArticle_name(String str) {
        this.article_name = str;
    }

    public void setArticle_url(String str) {
        this.article_url = str;
    }

    public void setCustom_index(String str) {
        this.custom_index = str;
    }

    public void setCustom_suggested_from(String str) {
        this.custom_suggested_from = str;
    }

    public void setExtra_tag(String str) {
        this.extra_tag = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setReport_id(@p0 String str) {
        this.report_id = str;
    }

    public void setShowDivider(Boolean bool) {
        this.showDivider = bool;
    }

    public void setWiki(WikiObj wikiObj) {
        this.wiki = wikiObj;
    }
}
