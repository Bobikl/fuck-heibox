package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TopicRankingObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -138347923283052723L;
    private String today_link_num;
    private int today_link_num_inc;

    public String getToday_link_num() {
        return this.today_link_num;
    }

    public int getToday_link_num_inc() {
        return this.today_link_num_inc;
    }

    public void setToday_link_num(String str) {
        this.today_link_num = str;
    }

    public void setToday_link_num_inc(int i10) {
        this.today_link_num_inc = i10;
    }
}
