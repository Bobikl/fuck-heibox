package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7706258298652413771L;
    private String android_id;
    private String oaid;
    private String useragent;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.A3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceInfoObj deviceInfoObj = (DeviceInfoObj) obj;
        String str = this.oaid;
        if (str == null ? deviceInfoObj.oaid != null : !str.equals(deviceInfoObj.oaid)) {
            return false;
        }
        String str2 = this.useragent;
        if (str2 == null ? deviceInfoObj.useragent != null : !str2.equals(deviceInfoObj.useragent)) {
            return false;
        }
        String str3 = this.android_id;
        String str4 = deviceInfoObj.android_id;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    public String getAndroid_id() {
        return this.android_id;
    }

    public String getOaid() {
        return this.oaid;
    }

    public String getUseragent() {
        return this.useragent;
    }

    public void setAndroid_id(String str) {
        this.android_id = str;
    }

    public void setOaid(String str) {
        this.oaid = str;
    }

    public void setUseragent(String str) {
        this.useragent = str;
    }
}
