package com.max.hbqrcode.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class QRRedirectObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String action;
    private String desc;
    private String maxjia;
    private String url;

    public String getAction() {
        return this.action;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.L0, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "QRRedirectObj{action='" + this.action + "', desc='" + this.desc + "', url='" + this.url + "', maxjia='" + this.maxjia + "'}";
    }
}
