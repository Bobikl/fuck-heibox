package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.account.UserMedalV2Obj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AchieveBadgesObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AchieveBadgeSingleObj> achieves;
    private List<UserMedalV2Obj> medals;
    private String name;

    public List<AchieveBadgeSingleObj> getAchieves() {
        return this.achieves;
    }

    public List<UserMedalV2Obj> getMedals() {
        return this.medals;
    }

    public String getName() {
        return this.name;
    }

    public void setAchieves(List<AchieveBadgeSingleObj> list) {
        this.achieves = list;
    }

    public void setMedals(List<UserMedalV2Obj> list) {
        this.medals = list;
    }

    public void setName(String str) {
        this.name = str;
    }
}
