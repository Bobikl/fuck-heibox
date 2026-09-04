package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WikiRankingObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RankingTrendsObj trends;
    private WikiListObj wiki;

    public RankingTrendsObj getTrends() {
        return this.trends;
    }

    public WikiListObj getWiki() {
        return this.wiki;
    }

    public void setTrends(RankingTrendsObj rankingTrendsObj) {
        this.trends = rankingTrendsObj;
    }

    public void setWiki(WikiListObj wikiListObj) {
        this.wiki = wikiListObj;
    }
}
