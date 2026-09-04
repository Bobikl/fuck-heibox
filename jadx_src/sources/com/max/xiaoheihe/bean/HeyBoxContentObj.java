package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class HeyBoxContentObj {
    public static final String TYPE_BANNER = "banner";
    public static final String TYPE_GAME = "game";
    public static final String TYPE_LINKING = "linking";
    public static final String TYPE_PRODUCT = "mall";
    public static ChangeQuickRedirect changeQuickRedirect;
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
