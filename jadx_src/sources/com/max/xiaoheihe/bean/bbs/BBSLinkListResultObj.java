package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkListResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private BBSUserInfoObj current_user;
    private String follow_timestamp;
    private BBSLinkListHeaderObj header;
    private int is_follow;
    private List<BBSLinkObj> links;
    private BBSRecommendTopicObj rec_topics;
    private String reply_timestamp;
    private List<KeyDescObj> sort_filter;
    private BBSTopicObj topic;
    private List<KeyDescObj> type_filter;
    private String update_at;

    public BBSUserInfoObj getCurrent_user() {
        return this.current_user;
    }

    public String getFollow_timestamp() {
        return this.follow_timestamp;
    }

    public BBSLinkListHeaderObj getHeader() {
        return this.header;
    }

    public int getIs_follow() {
        return this.is_follow;
    }

    public List<BBSLinkObj> getLinks() {
        return this.links;
    }

    public BBSRecommendTopicObj getRec_topics() {
        return this.rec_topics;
    }

    public String getReply_timestamp() {
        return this.reply_timestamp;
    }

    public List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public List<KeyDescObj> getType_filter() {
        return this.type_filter;
    }

    public String getUpdate_at() {
        return this.update_at;
    }

    public void setCurrent_user(BBSUserInfoObj bBSUserInfoObj) {
        this.current_user = bBSUserInfoObj;
    }

    public void setFollow_timestamp(String str) {
        this.follow_timestamp = str;
    }

    public void setHeader(BBSLinkListHeaderObj bBSLinkListHeaderObj) {
        this.header = bBSLinkListHeaderObj;
    }

    public void setIs_follow(int i10) {
        this.is_follow = i10;
    }

    public void setLinks(List<BBSLinkObj> list) {
        this.links = list;
    }

    public void setRec_topics(BBSRecommendTopicObj bBSRecommendTopicObj) {
        this.rec_topics = bBSRecommendTopicObj;
    }

    public void setReply_timestamp(String str) {
        this.reply_timestamp = str;
    }

    public void setSort_filter(List<KeyDescObj> list) {
        this.sort_filter = list;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }

    public void setType_filter(List<KeyDescObj> list) {
        this.type_filter = list;
    }

    public void setUpdate_at(String str) {
        this.update_at = str;
    }
}
