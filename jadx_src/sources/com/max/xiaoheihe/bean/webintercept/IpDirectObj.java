package com.max.xiaoheihe.bean.webintercept;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IpDirectObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class IpDirectObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HashMap<String, String> domain_ip_list;

    @e
    private ArrayList<TagJsObj> intercept_request_js_list;

    public IpDirectObj(@e HashMap<String, String> map, @e ArrayList<TagJsObj> arrayList) {
        this.domain_ip_list = map;
        this.intercept_request_js_list = arrayList;
    }

    public static /* synthetic */ IpDirectObj copy$default(IpDirectObj ipDirectObj, HashMap map, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ipDirectObj, map, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 16229, new Class[]{IpDirectObj.class, HashMap.class, ArrayList.class, Integer.TYPE, Object.class}, IpDirectObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (IpDirectObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            map = ipDirectObj.domain_ip_list;
        }
        if ((i10 & 2) != 0) {
            arrayList = ipDirectObj.intercept_request_js_list;
        }
        return ipDirectObj.copy(map, arrayList);
    }

    @e
    public final HashMap<String, String> component1() {
        return this.domain_ip_list;
    }

    @e
    public final ArrayList<TagJsObj> component2() {
        return this.intercept_request_js_list;
    }

    @d
    public final IpDirectObj copy(@e HashMap<String, String> map, @e ArrayList<TagJsObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map, arrayList}, this, changeQuickRedirect, false, 16228, new Class[]{HashMap.class, ArrayList.class}, IpDirectObj.class);
        return patchProxyResultProxy.isSupported ? (IpDirectObj) patchProxyResultProxy.result : new IpDirectObj(map, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16232, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IpDirectObj)) {
            return false;
        }
        IpDirectObj ipDirectObj = (IpDirectObj) obj;
        return f0.g(this.domain_ip_list, ipDirectObj.domain_ip_list) && f0.g(this.intercept_request_js_list, ipDirectObj.intercept_request_js_list);
    }

    @e
    public final HashMap<String, String> getDomain_ip_list() {
        return this.domain_ip_list;
    }

    @e
    public final ArrayList<TagJsObj> getIntercept_request_js_list() {
        return this.intercept_request_js_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16231, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HashMap<String, String> map = this.domain_ip_list;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        ArrayList<TagJsObj> arrayList = this.intercept_request_js_list;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setDomain_ip_list(@e HashMap<String, String> map) {
        this.domain_ip_list = map;
    }

    public final void setIntercept_request_js_list(@e ArrayList<TagJsObj> arrayList) {
        this.intercept_request_js_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16230, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "IpDirectObj(domain_ip_list=" + this.domain_ip_list + ", intercept_request_js_list=" + this.intercept_request_js_list + ')';
    }
}
