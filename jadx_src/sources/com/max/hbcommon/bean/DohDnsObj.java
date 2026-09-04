package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DohDnsObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DohDnsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<String> ip_list;

    @d
    private String url;

    public DohDnsObj(@d String url, @d List<String> ip_list) {
        f0.p(url, "url");
        f0.p(ip_list, "ip_list");
        this.url = url;
        this.ip_list = ip_list;
    }

    public static /* synthetic */ DohDnsObj copy$default(DohDnsObj dohDnsObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dohDnsObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.E3, new Class[]{DohDnsObj.class, String.class, List.class, Integer.TYPE, Object.class}, DohDnsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DohDnsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dohDnsObj.url;
        }
        if ((i10 & 2) != 0) {
            list = dohDnsObj.ip_list;
        }
        return dohDnsObj.copy(str, list);
    }

    @d
    public final String component1() {
        return this.url;
    }

    @d
    public final List<String> component2() {
        return this.ip_list;
    }

    @d
    public final DohDnsObj copy(@d String url, @d List<String> ip_list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url, ip_list}, this, changeQuickRedirect, false, c.d.D3, new Class[]{String.class, List.class}, DohDnsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DohDnsObj) patchProxyResultProxy.result;
        }
        f0.p(url, "url");
        f0.p(ip_list, "ip_list");
        return new DohDnsObj(url, ip_list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.H3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DohDnsObj)) {
            return false;
        }
        DohDnsObj dohDnsObj = (DohDnsObj) obj;
        return f0.g(this.url, dohDnsObj.url) && f0.g(this.ip_list, dohDnsObj.ip_list);
    }

    @d
    public final List<String> getIp_list() {
        return this.ip_list;
    }

    @d
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.G3, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.url.hashCode() * 31) + this.ip_list.hashCode();
    }

    public final void setIp_list(@d List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.d.C3, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.ip_list = list;
    }

    public final void setUrl(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.B3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.F3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DohDnsObj(url=" + this.url + ", ip_list=" + this.ip_list + ')';
    }
}
