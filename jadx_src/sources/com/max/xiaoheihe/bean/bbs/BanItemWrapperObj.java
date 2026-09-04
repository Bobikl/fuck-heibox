package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BanItemWrapperObj implements Serializable {
    public static final int ITEM_TYPE_ADD_TOPIC = 3;
    public static final int ITEM_TYPE_TITLE = 0;
    public static final int ITEM_TYPE_TOPIC = 1;
    public static final int ITEM_TYPE_USER = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8352478539488712803L;
    private int itemType;
    private String title;
    private BBSTopicObj topic;
    private BBSUserInfoObj user;

    public int getItemType() {
        return this.itemType;
    }

    public String getTitle() {
        return this.title;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
