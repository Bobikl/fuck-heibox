package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FollowCntObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2083014421565725205L;
    private String fan_num;
    private String follow_num;

    public String getFan_num() {
        return this.fan_num;
    }

    public String getFollow_num() {
        return this.follow_num;
    }

    public void setFan_num(String str) {
        this.fan_num = str;
    }

    public void setFollow_num(String str) {
        this.follow_num = str;
    }
}
