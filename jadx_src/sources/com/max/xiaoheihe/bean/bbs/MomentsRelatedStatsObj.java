package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MomentsRelatedStatsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3039329214481597853L;
    private String achieved;
    private String achieved_point;
    private String count;

    public String getAchieved() {
        return this.achieved;
    }

    public String getAchieved_point() {
        return this.achieved_point;
    }

    public String getCount() {
        return this.count;
    }

    public void setAchieved(String str) {
        this.achieved = str;
    }

    public void setAchieved_point(String str) {
        this.achieved_point = str;
    }

    public void setCount(String str) {
        this.count = str;
    }
}
