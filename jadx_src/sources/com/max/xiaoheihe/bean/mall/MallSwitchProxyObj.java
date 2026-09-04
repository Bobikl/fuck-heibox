package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallSwitchProxyObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6966127811439824105L;
    private String msg;
    private String proxy;

    public String getMsg() {
        return this.msg;
    }

    public String getProxy() {
        return this.proxy;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setProxy(String str) {
        this.proxy = str;
    }
}
