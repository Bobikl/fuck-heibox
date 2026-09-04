package com.max.hbutils.bean;

import android.text.TextUtils;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Result<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4061106485113976817L;
    private String msg;
    private String protocol;
    private String referer_path;
    private String report_canceled;
    private T result;
    protected String status;
    private String version;

    public Map<String, String> getKeyMap() {
        return (Map) this.result;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getReferer_path() {
        return this.referer_path;
    }

    public String getReport_canceled() {
        return this.report_canceled;
    }

    public T getResult() {
        return this.result;
    }

    public String getStatus() {
        return this.status;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isOk() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Mn, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !TextUtils.isEmpty(this.status) && ITagManager.SUCCESS.equals(this.status);
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setReferer_path(String str) {
        this.referer_path = str;
    }

    public void setReport_canceled(String str) {
        this.report_canceled = str;
    }

    public void setResult(T t10) {
        this.result = t10;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Nn, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Result{status='" + this.status + "', msg='" + this.msg + "', result=" + this.result + '}';
    }
}
