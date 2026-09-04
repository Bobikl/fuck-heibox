package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkListHeaderObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSTopicObj> subscribed_topics;
    private String title;
    private List<BBSTopicObj> top_topics;
    private List<BBSTopicObj> topics;

    public List<BBSTopicObj> getSubscribed_topics() {
        return this.subscribed_topics;
    }

    public String getTitle() {
        return this.title;
    }

    public List<BBSTopicObj> getTop_topics() {
        return this.top_topics;
    }

    public List<BBSTopicObj> getTopics() {
        return this.topics;
    }

    public void setSubscribed_topics(List<BBSTopicObj> list) {
        this.subscribed_topics = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTop_topics(List<BBSTopicObj> list) {
        this.top_topics = list;
    }

    public void setTopics(List<BBSTopicObj> list) {
        this.topics = list;
    }
}
