package com.max.xiaoheihe.bean.news;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentNewsTopicObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<NewsSubjectObj> news_topics;

    public List<NewsSubjectObj> getNews_topics() {
        return this.news_topics;
    }

    public void setNews_topics(List<NewsSubjectObj> list) {
        this.news_topics = list;
    }
}
