package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AchieveBadgesWrapperObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int auth_medal_count;
    private String faq;
    private List<AchieveBadgesObj> groups;
    private int total_count;
    private BBSUserInfoObj user;

    public int getAuth_medal_count() {
        return this.auth_medal_count;
    }

    public String getFaq() {
        return this.faq;
    }

    public List<AchieveBadgesObj> getGroups() {
        return this.groups;
    }

    public int getTotal_count() {
        return this.total_count;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setAuth_medal_count(int i10) {
        this.auth_medal_count = i10;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setGroups(List<AchieveBadgesObj> list) {
        this.groups = list;
    }

    public void setTotal_count(int i10) {
        this.total_count = i10;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
