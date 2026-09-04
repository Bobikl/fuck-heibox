package com.max.xiaoheihe.bean.news;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SubjectDetailResultOjb {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FeedsContentBaseObj> news_list;
    private NewsSubjectObj news_topic;

    public List<FeedsContentBaseObj> getNews_list() {
        return this.news_list;
    }

    public NewsSubjectObj getNews_topic() {
        return this.news_topic;
    }

    public void setNews_list(List<FeedsContentBaseObj> list) {
        this.news_list = list;
    }

    public void setNews_topic(NewsSubjectObj newsSubjectObj) {
        this.news_topic = newsSubjectObj;
    }
}
