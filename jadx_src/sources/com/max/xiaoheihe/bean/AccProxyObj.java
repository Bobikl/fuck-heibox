package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AccProxyObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5447346671929865457L;
    private String appid;
    private String msg;

    public String getAppid() {
        return this.appid;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
