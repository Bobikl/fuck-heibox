package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ConceptTopicIndex {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSTopicCategoryObj> categories;
    private int follow_topic_limit;
    private BBSTopicCategoryObj latest_hot_topics;
    private BBSTopicCategoryObj recommend_for_user_topics;
    private BBSTopicCategoryObj subscribed_topics;

    public List<BBSTopicCategoryObj> getCategories() {
        return this.categories;
    }

    public int getFollow_topic_limit() {
        return this.follow_topic_limit;
    }

    public BBSTopicCategoryObj getLatest_hot_topics() {
        return this.latest_hot_topics;
    }

    public BBSTopicCategoryObj getRecommend_for_user_topics() {
        return this.recommend_for_user_topics;
    }

    public BBSTopicCategoryObj getSubscribed_topics() {
        return this.subscribed_topics;
    }

    public void setCategories(List<BBSTopicCategoryObj> list) {
        this.categories = list;
    }

    public void setFollow_topic_limit(int i10) {
        this.follow_topic_limit = i10;
    }

    public void setLatest_hot_topics(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.latest_hot_topics = bBSTopicCategoryObj;
    }

    public void setRecommend_for_user_topics(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.recommend_for_user_topics = bBSTopicCategoryObj;
    }

    public void setSubscribed_topics(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.subscribed_topics = bBSTopicCategoryObj;
    }
}
