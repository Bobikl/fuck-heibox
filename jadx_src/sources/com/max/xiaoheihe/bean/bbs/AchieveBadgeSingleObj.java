package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AchieveBadgeSingleObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int achieved_count;
    private int current_exp;
    List<AchieveBadgeDescObj> levels;
    private String limit_note;
    private int medal_id;
    private String name;
    private int total_count;
    private int wear;
    private int wear_level;
    private AchieveBadgeDescObj zero_level;

    public int getAchieved_count() {
        return this.achieved_count;
    }

    public int getCurrent_exp() {
        return this.current_exp;
    }

    public List<AchieveBadgeDescObj> getLevels() {
        return this.levels;
    }

    public String getLimit_note() {
        return this.limit_note;
    }

    public int getMedal_id() {
        return this.medal_id;
    }

    public String getName() {
        return this.name;
    }

    public int getTotal_count() {
        return this.total_count;
    }

    public int getWear() {
        return this.wear;
    }

    public int getWear_level() {
        return this.wear_level;
    }

    public AchieveBadgeDescObj getZero_level() {
        return this.zero_level;
    }

    public void setAchieved_count(int i10) {
        this.achieved_count = i10;
    }

    public void setCurrent_exp(int i10) {
        this.current_exp = i10;
    }

    public void setLevels(List<AchieveBadgeDescObj> list) {
        this.levels = list;
    }

    public void setLimit_note(String str) {
        this.limit_note = str;
    }

    public void setMedal_id(int i10) {
        this.medal_id = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTotal_count(int i10) {
        this.total_count = i10;
    }

    public void setWear(int i10) {
        this.wear = i10;
    }

    public void setWear_level(int i10) {
        this.wear_level = i10;
    }

    public void setZero_level(AchieveBadgeDescObj achieveBadgeDescObj) {
        this.zero_level = achieveBadgeDescObj;
    }
}
