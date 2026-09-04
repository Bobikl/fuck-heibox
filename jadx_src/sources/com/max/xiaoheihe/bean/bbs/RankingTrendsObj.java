package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class RankingTrendsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1914017515964994761L;
    private Integer article_inc;
    private String article_num;
    private Integer hot_inc;
    private String hot_value;
    private Integer rank_inc;

    public Integer getArticle_inc() {
        return this.article_inc;
    }

    public String getArticle_num() {
        return this.article_num;
    }

    public Integer getHot_inc() {
        return this.hot_inc;
    }

    public String getHot_value() {
        return this.hot_value;
    }

    public Integer getRank_inc() {
        return this.rank_inc;
    }

    public void setArticle_inc(Integer num) {
        this.article_inc = num;
    }

    public void setArticle_num(String str) {
        this.article_num = str;
    }

    public void setHot_inc(Integer num) {
        this.hot_inc = num;
    }

    public void setHot_value(String str) {
        this.hot_value = str;
    }

    public void setRank_inc(Integer num) {
        this.rank_inc = num;
    }
}
