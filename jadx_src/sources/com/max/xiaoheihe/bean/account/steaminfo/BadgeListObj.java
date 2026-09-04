package com.max.xiaoheihe.bean.account.steaminfo;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BadgeListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String achieved;
    private String appicon;
    private String appid;
    private BadgeDetailObj badge_detail;
    private String cards_collect;
    private String cards_count;
    private List<BadgesCardObj> cards_list;
    private String completion_time;
    private String name;
    private String xp;

    public String getAchieved() {
        return this.achieved;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public BadgeDetailObj getBadge_detail() {
        return this.badge_detail;
    }

    public String getCards_collect() {
        return this.cards_collect;
    }

    public String getCards_count() {
        return this.cards_count;
    }

    public List<BadgesCardObj> getCards_list() {
        return this.cards_list;
    }

    public String getCompletion_time() {
        return this.completion_time;
    }

    public String getName() {
        return this.name;
    }

    public String getXp() {
        return this.xp;
    }

    public void setAchieved(String str) {
        this.achieved = str;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBadge_detail(BadgeDetailObj badgeDetailObj) {
        this.badge_detail = badgeDetailObj;
    }

    public void setCards_collect(String str) {
        this.cards_collect = str;
    }

    public void setCards_count(String str) {
        this.cards_count = str;
    }

    public void setCards_list(List<BadgesCardObj> list) {
        this.cards_list = list;
    }

    public void setCompletion_time(String str) {
        this.completion_time = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setXp(String str) {
        this.xp = str;
    }
}
