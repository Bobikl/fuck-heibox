package com.max.xiaoheihe.bean.news;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SubjectListResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<NewsSubjectObj> topics;

    public List<NewsSubjectObj> getTopics() {
        return this.topics;
    }

    public void setTopics(List<NewsSubjectObj> list) {
        this.topics = list;
    }
}
