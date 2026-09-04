package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.GradientColorObj;
import com.max.xiaoheihe.bean.account.UserMedalV2Obj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSAchieveResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String achieve_count;
    private UserMedalV2Obj achieve_event;
    private List<BBSAchieveObj> achieves;
    private GradientColorObj default_color;
    private String event_status;
    private String faq;
    private AchieveEventObj milestone_event;
    private AchieveEventObj mission_event;
    private String total_count;
    private BBSUserInfoObj user;

    public String getAchieve_count() {
        return this.achieve_count;
    }

    public UserMedalV2Obj getAchieve_event() {
        return this.achieve_event;
    }

    public List<BBSAchieveObj> getAchieves() {
        return this.achieves;
    }

    public GradientColorObj getDefault_color() {
        return this.default_color;
    }

    public String getEvent_status() {
        return this.event_status;
    }

    public String getFaq() {
        return this.faq;
    }

    public AchieveEventObj getMilestone_event() {
        return this.milestone_event;
    }

    public AchieveEventObj getMission_event() {
        return this.mission_event;
    }

    public String getTotal_count() {
        return this.total_count;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setAchieve_count(String str) {
        this.achieve_count = str;
    }

    public void setAchieve_event(UserMedalV2Obj userMedalV2Obj) {
        this.achieve_event = userMedalV2Obj;
    }

    public void setAchieves(List<BBSAchieveObj> list) {
        this.achieves = list;
    }

    public void setDefault_color(GradientColorObj gradientColorObj) {
        this.default_color = gradientColorObj;
    }

    public void setEvent_status(String str) {
        this.event_status = str;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setMilestone_event(AchieveEventObj achieveEventObj) {
        this.milestone_event = achieveEventObj;
    }

    public void setMission_event(AchieveEventObj achieveEventObj) {
        this.mission_event = achieveEventObj;
    }

    public void setTotal_count(String str) {
        this.total_count = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
