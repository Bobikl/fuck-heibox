package com.max.xiaoheihe.bean.proxy;

import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyAddressObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5791996604910951325L;
    private String host;
    private String port;

    public ProxyAddressObj(String str, String str2) {
        this.host = str;
        this.port = str2;
    }

    public String getHost() {
        return this.host;
    }

    public String getPort() {
        return this.port;
    }

    public boolean isValid() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15795, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (c.u(this.host) || c.u(this.port)) ? false : true;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(String str) {
        this.port = str;
    }
}
