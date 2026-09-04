package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AchieveObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6219645620354698557L;
    private int achieved;
    private String achieved_percent;
    private int appid;
    private int defaultvalue;
    private String desc;
    private String end_color;
    private String full_desc;
    private int hidden;
    private String icon;
    private String icongray;
    private String name;
    private String point;
    private String start_color;
    private String unlocktime;

    public int getAchieved() {
        return this.achieved;
    }

    public String getAchieved_percent() {
        return this.achieved_percent;
    }

    public int getAppid() {
        return this.appid;
    }

    public int getDefaultvalue() {
        return this.defaultvalue;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public String getFull_desc() {
        return this.full_desc;
    }

    public int getHidden() {
        return this.hidden;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIcongray() {
        return this.icongray;
    }

    public String getName() {
        return this.name;
    }

    public String getPoint() {
        return this.point;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getUnlocktime() {
        return this.unlocktime;
    }

    public void setAchieved(int i10) {
        this.achieved = i10;
    }

    public void setAchieved_percent(String str) {
        this.achieved_percent = str;
    }

    public void setAppid(int i10) {
        this.appid = i10;
    }

    public void setDefaultvalue(int i10) {
        this.defaultvalue = i10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setFull_desc(String str) {
        this.full_desc = str;
    }

    public void setHidden(int i10) {
        this.hidden = i10;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIcongray(String str) {
        this.icongray = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoint(String str) {
        this.point = str;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setUnlocktime(String str) {
        this.unlocktime = str;
    }
}
