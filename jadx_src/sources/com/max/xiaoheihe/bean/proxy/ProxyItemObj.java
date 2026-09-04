package com.max.xiaoheihe.bean.proxy;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProxyItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProxyItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccProxyObj acc_proxy;

    @e
    private HashMap<String, String> filter_hosts;

    @e
    private List<Host> hosts;

    @e
    private String key;

    @e
    private String url;

    @e
    private String value;

    public ProxyItemObj(@e String str, @e String str2, @e String str3, @e AccProxyObj accProxyObj, @e List<Host> list, @e HashMap<String, String> map) {
        this.key = str;
        this.value = str2;
        this.url = str3;
        this.acc_proxy = accProxyObj;
        this.hosts = list;
        this.filter_hosts = map;
    }

    public static /* synthetic */ ProxyItemObj copy$default(ProxyItemObj proxyItemObj, String str, String str2, String str3, AccProxyObj accProxyObj, List list, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyItemObj, str, str2, str3, accProxyObj, list, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 15798, new Class[]{ProxyItemObj.class, String.class, String.class, String.class, AccProxyObj.class, List.class, HashMap.class, Integer.TYPE, Object.class}, ProxyItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProxyItemObj) patchProxyResultProxy.result;
        }
        return proxyItemObj.copy((i10 & 1) != 0 ? proxyItemObj.key : str, (i10 & 2) != 0 ? proxyItemObj.value : str2, (i10 & 4) != 0 ? proxyItemObj.url : str3, (i10 & 8) != 0 ? proxyItemObj.acc_proxy : accProxyObj, (i10 & 16) != 0 ? proxyItemObj.hosts : list, (i10 & 32) != 0 ? proxyItemObj.filter_hosts : map);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.value;
    }

    @e
    public final String component3() {
        return this.url;
    }

    @e
    public final AccProxyObj component4() {
        return this.acc_proxy;
    }

    @e
    public final List<Host> component5() {
        return this.hosts;
    }

    @e
    public final HashMap<String, String> component6() {
        return this.filter_hosts;
    }

    @d
    public final ProxyItemObj copy(@e String str, @e String str2, @e String str3, @e AccProxyObj accProxyObj, @e List<Host> list, @e HashMap<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, accProxyObj, list, map}, this, changeQuickRedirect, false, 15797, new Class[]{String.class, String.class, String.class, AccProxyObj.class, List.class, HashMap.class}, ProxyItemObj.class);
        return patchProxyResultProxy.isSupported ? (ProxyItemObj) patchProxyResultProxy.result : new ProxyItemObj(str, str2, str3, accProxyObj, list, map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15796, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(ProxyItemObj.class, obj.getClass())) {
            return false;
        }
        return f0.g(((ProxyItemObj) obj).key, this.key);
    }

    @e
    public final AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    @e
    public final HashMap<String, String> getFilter_hosts() {
        return this.filter_hosts;
    }

    @e
    public final List<Host> getHosts() {
        return this.hosts;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15800, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AccProxyObj accProxyObj = this.acc_proxy;
        int iHashCode4 = (iHashCode3 + (accProxyObj == null ? 0 : accProxyObj.hashCode())) * 31;
        List<Host> list = this.hosts;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        HashMap<String, String> map = this.filter_hosts;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final void setAcc_proxy(@e AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public final void setFilter_hosts(@e HashMap<String, String> map) {
        this.filter_hosts = map;
    }

    public final void setHosts(@e List<Host> list) {
        this.hosts = list;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15799, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProxyItemObj(key=" + this.key + ", value=" + this.value + ", url=" + this.url + ", acc_proxy=" + this.acc_proxy + ", hosts=" + this.hosts + ", filter_hosts=" + this.filter_hosts + ')';
    }
}
