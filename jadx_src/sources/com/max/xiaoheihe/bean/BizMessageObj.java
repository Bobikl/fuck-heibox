package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BizMessageObj implements Serializable {
    public static final String TYPE_BUBBLE_NOTIFY = "BUBBLE_NOTIFY";
    public static final String TYPE_HEYCHAT_IM_MESSAGE = "USER_IM_MESSAGE";
    public static final String TYPE_MESSAGE_CENTER_PUSH = "MSG_NOTIFY";
    public static final String TYPE_NOTIFY = "INTERNAL_PUSH";
    public static final String TYPE_PING = "PING";
    public static final String TYPE_PONG = "PONG";
    public static final String TYPE_PROTOCOL = "PROTOCOL";
    public static final String TYPE_PULL = "PULL";
    public static final String TYPE_PUSH = "PUSH";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5471065874469157556L;
    private Object data;
    private String type;

    public Object getData() {
        return this.data;
    }

    public String getType() {
        return this.type;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setType(String str) {
        this.type = str;
    }
}
