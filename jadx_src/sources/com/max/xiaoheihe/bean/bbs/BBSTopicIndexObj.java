package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicIndexObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String allow_schedule;
    private BBSTopicCategoryObj common_topics;
    private BBSTopicCategoryObj follow;
    private String follow_count;
    private String notify;
    private String plan_protocol;
    private BBSPostArticleAlertObj post_article_notify;
    private List<PostPlan> post_article_plan;
    private String post_article_plan_notice;
    private BBSPostArticleAlertObj post_link_notify;
    private BBSPostArticleAlertObj post_pic_link_notify;
    private List<PostPlan> post_pic_link_plan;
    private String post_pic_link_plan_notice;
    private BBSPostArticleAlertObj post_video_notify;
    private BBSTopicCategoryObj recommend;
    private KeyDescObj tips;
    private String title_notify;
    private BBSTopicCategoryObj topics;
    private List<BBSTopicCategoryObj> topics_list;
    private TopicsListV2Obj topics_list_v2;

    public static class PostPlan extends KeyDescObj {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean disabled;

        public boolean isDisabled() {
            return this.disabled;
        }

        public void setDisabled(boolean z10) {
            this.disabled = z10;
        }
    }

    public static class TopicsListV2Obj {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<BBSTopicObj> recommend_topics;
        private List<BBSTopicCategoryObj> section_topics;

        public List<BBSTopicObj> getRecommend_topics() {
            return this.recommend_topics;
        }

        public List<BBSTopicCategoryObj> getSection_topics() {
            return this.section_topics;
        }

        public void setRecommend_topics(List<BBSTopicObj> list) {
            this.recommend_topics = list;
        }

        public void setSection_topics(List<BBSTopicCategoryObj> list) {
            this.section_topics = list;
        }
    }

    public String getAllow_schedule() {
        return this.allow_schedule;
    }

    public BBSTopicCategoryObj getCommon_topics() {
        return this.common_topics;
    }

    public BBSTopicCategoryObj getFollow() {
        return this.follow;
    }

    public String getFollow_count() {
        return this.follow_count;
    }

    public String getNotify() {
        return this.notify;
    }

    public String getPlan_protocol() {
        return this.plan_protocol;
    }

    public BBSPostArticleAlertObj getPost_article_notify() {
        return this.post_article_notify;
    }

    public List<PostPlan> getPost_article_plan() {
        return this.post_article_plan;
    }

    public String getPost_article_plan_notice() {
        return this.post_article_plan_notice;
    }

    public BBSPostArticleAlertObj getPost_link_notify() {
        return this.post_link_notify;
    }

    public BBSPostArticleAlertObj getPost_pic_link_notify() {
        return this.post_pic_link_notify;
    }

    public List<PostPlan> getPost_pic_link_plan() {
        return this.post_pic_link_plan;
    }

    public String getPost_pic_link_plan_notice() {
        return this.post_pic_link_plan_notice;
    }

    public BBSPostArticleAlertObj getPost_video_notify() {
        return this.post_video_notify;
    }

    public BBSTopicCategoryObj getRecommend() {
        return this.recommend;
    }

    public KeyDescObj getTips() {
        return this.tips;
    }

    public String getTitle_notify() {
        return this.title_notify;
    }

    public BBSTopicCategoryObj getTopics() {
        return this.topics;
    }

    public List<BBSTopicCategoryObj> getTopics_list() {
        return this.topics_list;
    }

    public TopicsListV2Obj getTopics_list_v2() {
        return this.topics_list_v2;
    }

    public void setAllow_schedule(String str) {
        this.allow_schedule = str;
    }

    public void setCommon_topics(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.common_topics = bBSTopicCategoryObj;
    }

    public void setFollow(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.follow = bBSTopicCategoryObj;
    }

    public void setFollow_count(String str) {
        this.follow_count = str;
    }

    public void setNotify(String str) {
        this.notify = str;
    }

    public void setPlan_protocol(String str) {
        this.plan_protocol = str;
    }

    public void setPost_article_notify(BBSPostArticleAlertObj bBSPostArticleAlertObj) {
        this.post_article_notify = bBSPostArticleAlertObj;
    }

    public void setPost_article_plan(List<PostPlan> list) {
        this.post_article_plan = list;
    }

    public void setPost_article_plan_notice(String str) {
        this.post_article_plan_notice = str;
    }

    public void setPost_link_notify(BBSPostArticleAlertObj bBSPostArticleAlertObj) {
        this.post_link_notify = bBSPostArticleAlertObj;
    }

    public void setPost_pic_link_notify(BBSPostArticleAlertObj bBSPostArticleAlertObj) {
        this.post_pic_link_notify = bBSPostArticleAlertObj;
    }

    public void setPost_pic_link_plan(List<PostPlan> list) {
        this.post_pic_link_plan = list;
    }

    public void setPost_pic_link_plan_notice(String str) {
        this.post_pic_link_plan_notice = str;
    }

    public void setPost_video_notify(BBSPostArticleAlertObj bBSPostArticleAlertObj) {
        this.post_video_notify = bBSPostArticleAlertObj;
    }

    public void setRecommend(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.recommend = bBSTopicCategoryObj;
    }

    public void setTips(KeyDescObj keyDescObj) {
        this.tips = keyDescObj;
    }

    public void setTitle_notify(String str) {
        this.title_notify = str;
    }

    public void setTopics(BBSTopicCategoryObj bBSTopicCategoryObj) {
        this.topics = bBSTopicCategoryObj;
    }

    public void setTopics_list(List<BBSTopicCategoryObj> list) {
        this.topics_list = list;
    }

    public void setTopics_list_v2(TopicsListV2Obj topicsListV2Obj) {
        this.topics_list_v2 = topicsListV2Obj;
    }
}
