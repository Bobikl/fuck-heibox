package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentEntryObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String formated_time;
    private List<NewsMenuObj> items;
    private BBSTopicObj topic;

    public String getFormated_time() {
        return this.formated_time;
    }

    public List<NewsMenuObj> getItems() {
        return this.items;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public void setFormated_time(String str) {
        this.formated_time = str;
    }

    public void setItems(List<NewsMenuObj> list) {
        this.items = list;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }
}
