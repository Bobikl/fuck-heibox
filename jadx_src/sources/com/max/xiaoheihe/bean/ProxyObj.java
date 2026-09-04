package com.max.xiaoheihe.bean;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7975681724701918419L;
    private String banned;
    private EncryptionParamsObj encrypted_proxy_info;
    private String msg;
    private String proxy_ip;
    private String proxy_port;

    public String getBanned() {
        return this.banned;
    }

    public EncryptionParamsObj getEncrypted_proxy_info() {
        return this.encrypted_proxy_info;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getProxy_ip() {
        return this.proxy_ip;
    }

    public String getProxy_port() {
        return this.proxy_port;
    }

    public void setBanned(String str) {
        this.banned = str;
    }

    public void setEncrypted_proxy_info(EncryptionParamsObj encryptionParamsObj) {
        this.encrypted_proxy_info = encryptionParamsObj;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setProxy_ip(String str) {
        this.proxy_ip = str;
    }

    public void setProxy_port(String str) {
        this.proxy_port = str;
    }
}
