package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NotifyPushMessageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7093548740679369413L;
    private String event;
    private String timestamp;
    private String type;
    private String userid;

    public String getEvent() {
        return this.event;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }
}
