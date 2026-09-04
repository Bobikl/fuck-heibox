package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class ConceptTopicWrapperObj {
    public static final int ITEM_TYPE_TITLE = 0;
    public static final int ITEM_TYPE_TOPIC = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int item_type;
    private String title;
    private BBSTopicObj topic;

    public int getItem_type() {
        return this.item_type;
    }

    public String getTitle() {
        return this.title;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public void setItem_type(int i10) {
        this.item_type = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }
}
