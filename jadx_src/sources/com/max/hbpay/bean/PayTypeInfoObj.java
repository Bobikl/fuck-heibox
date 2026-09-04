package com.max.hbpay.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class PayTypeInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7767661317273787378L;
    private String icon;
    private String name;
    private String pay_type;
    private String pay_url;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.i.f33373q3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.pay_type;
        String str2 = ((PayTypeInfoObj) obj).pay_type;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.i.f33378r3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.pay_type;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPay_url(String str) {
        this.pay_url = str;
    }
}
