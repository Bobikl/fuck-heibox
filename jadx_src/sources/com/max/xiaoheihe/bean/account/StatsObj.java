package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class StatsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1445792154020825925L;
    private int achieved_count;
    private String achieved_percent;
    private String achieved_point;
    private String achieved_rank;
    private String cleared_count;
    private int total_count;

    public int getAchieved_count() {
        return this.achieved_count;
    }

    public String getAchieved_percent() {
        return this.achieved_percent;
    }

    public String getAchieved_point() {
        return this.achieved_point;
    }

    public String getAchieved_rank() {
        return this.achieved_rank;
    }

    public String getCleared_count() {
        return this.cleared_count;
    }

    public int getTotal_count() {
        return this.total_count;
    }

    public void setAchieved_count(int i10) {
        this.achieved_count = i10;
    }

    public void setAchieved_percent(String str) {
        this.achieved_percent = str;
    }

    public void setAchieved_point(String str) {
        this.achieved_point = str;
    }

    public void setAchieved_rank(String str) {
        this.achieved_rank = str;
    }

    public void setCleared_count(String str) {
        this.cleared_count = str;
    }

    public void setTotal_count(int i10) {
        this.total_count = i10;
    }
}
