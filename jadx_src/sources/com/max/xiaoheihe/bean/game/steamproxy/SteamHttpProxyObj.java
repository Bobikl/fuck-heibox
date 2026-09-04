package com.max.xiaoheihe.bean.game.steamproxy;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamHttpProxyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamHttpProxyObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HashMap<String, String> host;

    @e
    private HashMap<String, ArrayList<String>> hosts;

    @e
    private ArrayList<TagJsObj> js_list;

    @e
    private EncryptionParamsObj proxy;

    public SteamHttpProxyObj(@e HashMap<String, ArrayList<String>> map, @e HashMap<String, String> map2, @e EncryptionParamsObj encryptionParamsObj, @e ArrayList<TagJsObj> arrayList) {
        this.hosts = map;
        this.host = map2;
        this.proxy = encryptionParamsObj;
        this.js_list = arrayList;
    }

    public static /* synthetic */ SteamHttpProxyObj copy$default(SteamHttpProxyObj steamHttpProxyObj, HashMap map, HashMap map2, EncryptionParamsObj encryptionParamsObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamHttpProxyObj, map, map2, encryptionParamsObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 15428, new Class[]{SteamHttpProxyObj.class, HashMap.class, HashMap.class, EncryptionParamsObj.class, ArrayList.class, Integer.TYPE, Object.class}, SteamHttpProxyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamHttpProxyObj) patchProxyResultProxy.result;
        }
        return steamHttpProxyObj.copy((i10 & 1) != 0 ? steamHttpProxyObj.hosts : map, (i10 & 2) != 0 ? steamHttpProxyObj.host : map2, (i10 & 4) != 0 ? steamHttpProxyObj.proxy : encryptionParamsObj, (i10 & 8) != 0 ? steamHttpProxyObj.js_list : arrayList);
    }

    @e
    public final HashMap<String, ArrayList<String>> component1() {
        return this.hosts;
    }

    @e
    public final HashMap<String, String> component2() {
        return this.host;
    }

    @e
    public final EncryptionParamsObj component3() {
        return this.proxy;
    }

    @e
    public final ArrayList<TagJsObj> component4() {
        return this.js_list;
    }

    @d
    public final SteamHttpProxyObj copy(@e HashMap<String, ArrayList<String>> map, @e HashMap<String, String> map2, @e EncryptionParamsObj encryptionParamsObj, @e ArrayList<TagJsObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map, map2, encryptionParamsObj, arrayList}, this, changeQuickRedirect, false, 15427, new Class[]{HashMap.class, HashMap.class, EncryptionParamsObj.class, ArrayList.class}, SteamHttpProxyObj.class);
        return patchProxyResultProxy.isSupported ? (SteamHttpProxyObj) patchProxyResultProxy.result : new SteamHttpProxyObj(map, map2, encryptionParamsObj, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15431, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamHttpProxyObj)) {
            return false;
        }
        SteamHttpProxyObj steamHttpProxyObj = (SteamHttpProxyObj) obj;
        return f0.g(this.hosts, steamHttpProxyObj.hosts) && f0.g(this.host, steamHttpProxyObj.host) && f0.g(this.proxy, steamHttpProxyObj.proxy) && f0.g(this.js_list, steamHttpProxyObj.js_list);
    }

    @e
    public final HashMap<String, String> getHost() {
        return this.host;
    }

    @e
    public final HashMap<String, ArrayList<String>> getHosts() {
        return this.hosts;
    }

    @e
    public final ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    @e
    public final EncryptionParamsObj getProxy() {
        return this.proxy;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15430, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HashMap<String, ArrayList<String>> map = this.hosts;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        HashMap<String, String> map2 = this.host;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        EncryptionParamsObj encryptionParamsObj = this.proxy;
        int iHashCode3 = (iHashCode2 + (encryptionParamsObj == null ? 0 : encryptionParamsObj.hashCode())) * 31;
        ArrayList<TagJsObj> arrayList = this.js_list;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setHost(@e HashMap<String, String> map) {
        this.host = map;
    }

    public final void setHosts(@e HashMap<String, ArrayList<String>> map) {
        this.hosts = map;
    }

    public final void setJs_list(@e ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public final void setProxy(@e EncryptionParamsObj encryptionParamsObj) {
        this.proxy = encryptionParamsObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15429, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamHttpProxyObj(hosts=" + this.hosts + ", host=" + this.host + ", proxy=" + this.proxy + ", js_list=" + this.js_list + ')';
    }
}
