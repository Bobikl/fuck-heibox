package com.max.xiaoheihe.bean.proxy;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProxyListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProxyListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String default_line;

    @e
    private String desc;

    @e
    private String icon_url;

    @e
    private List<ProxyItemObj> lines;

    @e
    private String title;

    public ProxyListObj(@e String str, @e List<ProxyItemObj> list, @e String str2, @e String str3, @e String str4) {
        this.default_line = str;
        this.lines = list;
        this.title = str2;
        this.desc = str3;
        this.icon_url = str4;
    }

    public static /* synthetic */ ProxyListObj copy$default(ProxyListObj proxyListObj, String str, List list, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyListObj, str, list, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15802, new Class[]{ProxyListObj.class, String.class, List.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ProxyListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProxyListObj) patchProxyResultProxy.result;
        }
        return proxyListObj.copy((i10 & 1) != 0 ? proxyListObj.default_line : str, (i10 & 2) != 0 ? proxyListObj.lines : list, (i10 & 4) != 0 ? proxyListObj.title : str2, (i10 & 8) != 0 ? proxyListObj.desc : str3, (i10 & 16) != 0 ? proxyListObj.icon_url : str4);
    }

    @e
    public final String component1() {
        return this.default_line;
    }

    @e
    public final List<ProxyItemObj> component2() {
        return this.lines;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @e
    public final String component5() {
        return this.icon_url;
    }

    @d
    public final ProxyListObj copy(@e String str, @e List<ProxyItemObj> list, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2, str3, str4}, this, changeQuickRedirect, false, 15801, new Class[]{String.class, List.class, String.class, String.class, String.class}, ProxyListObj.class);
        return patchProxyResultProxy.isSupported ? (ProxyListObj) patchProxyResultProxy.result : new ProxyListObj(str, list, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15805, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyListObj)) {
            return false;
        }
        ProxyListObj proxyListObj = (ProxyListObj) obj;
        return f0.g(this.default_line, proxyListObj.default_line) && f0.g(this.lines, proxyListObj.lines) && f0.g(this.title, proxyListObj.title) && f0.g(this.desc, proxyListObj.desc) && f0.g(this.icon_url, proxyListObj.icon_url);
    }

    @e
    public final String getDefault_line() {
        return this.default_line;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon_url() {
        return this.icon_url;
    }

    @e
    public final List<ProxyItemObj> getLines() {
        return this.lines;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15804, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.default_line;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ProxyItemObj> list = this.lines;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon_url;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setDefault_line(@e String str) {
        this.default_line = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon_url(@e String str) {
        this.icon_url = str;
    }

    public final void setLines(@e List<ProxyItemObj> list) {
        this.lines = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15803, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProxyListObj(default_line=" + this.default_line + ", lines=" + this.lines + ", title=" + this.title + ", desc=" + this.desc + ", icon_url=" + this.icon_url + ')';
    }
}
