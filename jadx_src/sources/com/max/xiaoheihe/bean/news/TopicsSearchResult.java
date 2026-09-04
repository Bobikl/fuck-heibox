package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TopicsSearchResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSTopicCategoryObj> topics;

    public List<BBSTopicCategoryObj> getTopics() {
        return this.topics;
    }

    public void setTopics(List<BBSTopicCategoryObj> list) {
        this.topics = list;
    }
}
