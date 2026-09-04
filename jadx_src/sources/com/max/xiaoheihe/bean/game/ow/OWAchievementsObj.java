package com.max.xiaoheihe.bean.game.ow;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OWAchievementsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String achieved_count;
    private List<OWAchievementObj> achievements;
    private String total_count;

    public String getAchieved_count() {
        return this.achieved_count;
    }

    public List<OWAchievementObj> getAchievements() {
        return this.achievements;
    }

    public String getTotal_count() {
        return this.total_count;
    }

    public void setAchieved_count(String str) {
        this.achieved_count = str;
    }

    public void setAchievements(List<OWAchievementObj> list) {
        this.achievements = list;
    }

    public void setTotal_count(String str) {
        this.total_count = str;
    }
}
