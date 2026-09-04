package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSMessageUnreadNumObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8224693460292955133L;
    private String award;
    private String comment;
    private String follow;
    private String notify;
    private String total;

    public String getAward() {
        return this.award;
    }

    public String getComment() {
        return this.comment;
    }

    public String getFollow() {
        return this.follow;
    }

    public String getNotify() {
        return this.notify;
    }

    public String getTotal() {
        return this.total;
    }

    public void setAward(String str) {
        this.award = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setFollow(String str) {
        this.follow = str;
    }

    public void setNotify(String str) {
        this.notify = str;
    }

    public void setTotal(String str) {
        this.total = str;
    }
}
