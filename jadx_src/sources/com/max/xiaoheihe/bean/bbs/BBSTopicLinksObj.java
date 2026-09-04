package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicLinksObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -945671417057475001L;
    private List<AdsBannerObj> banner;
    private List<HashtagObj> hashtags;
    private List<HeaderNavObj> header_navs;
    private String lastval;
    private List<FeedsContentBaseObj> links;
    private List<BBSTopicObj> related_topics;
    private List<KeyDescObj> sort_filter;

    public List<AdsBannerObj> getBanner() {
        return this.banner;
    }

    public List<HashtagObj> getHashtags() {
        return this.hashtags;
    }

    public List<HeaderNavObj> getHeader_navs() {
        return this.header_navs;
    }

    public String getLastval() {
        return this.lastval;
    }

    public List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    public List<BBSTopicObj> getRelated_topics() {
        return this.related_topics;
    }

    public List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    public void setBanner(List<AdsBannerObj> list) {
        this.banner = list;
    }

    public void setHashtags(List<HashtagObj> list) {
        this.hashtags = list;
    }

    public void setHeader_navs(List<HeaderNavObj> list) {
        this.header_navs = list;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setLinks(List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    public void setRelated_topics(List<BBSTopicObj> list) {
        this.related_topics = list;
    }

    public void setSort_filter(List<KeyDescObj> list) {
        this.sort_filter = list;
    }
}
