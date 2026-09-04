package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PrefetchObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PrefetchObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String body;

    @e
    private String need_encrypt;

    @e
    private Map<String, String> query;

    @e
    private String type;

    @e
    private String url;

    public PrefetchObj(@e String str, @e String str2, @e Map<String, String> map, @e String str3, @e String str4) {
        this.type = str;
        this.url = str2;
        this.query = map;
        this.body = str3;
        this.need_encrypt = str4;
    }

    public static /* synthetic */ PrefetchObj copy$default(PrefetchObj prefetchObj, String str, String str2, Map map, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{prefetchObj, str, str2, map, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.HM, new Class[]{PrefetchObj.class, String.class, String.class, Map.class, String.class, String.class, Integer.TYPE, Object.class}, PrefetchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PrefetchObj) patchProxyResultProxy.result;
        }
        return prefetchObj.copy((i10 & 1) != 0 ? prefetchObj.type : str, (i10 & 2) != 0 ? prefetchObj.url : str2, (i10 & 4) != 0 ? prefetchObj.query : map, (i10 & 8) != 0 ? prefetchObj.body : str3, (i10 & 16) != 0 ? prefetchObj.need_encrypt : str4);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.url;
    }

    @e
    public final Map<String, String> component3() {
        return this.query;
    }

    @e
    public final String component4() {
        return this.body;
    }

    @e
    public final String component5() {
        return this.need_encrypt;
    }

    @d
    public final PrefetchObj copy(@e String str, @e String str2, @e Map<String, String> map, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, map, str3, str4}, this, changeQuickRedirect, false, c.m.GM, new Class[]{String.class, String.class, Map.class, String.class, String.class}, PrefetchObj.class);
        return patchProxyResultProxy.isSupported ? (PrefetchObj) patchProxyResultProxy.result : new PrefetchObj(str, str2, map, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.KM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrefetchObj)) {
            return false;
        }
        PrefetchObj prefetchObj = (PrefetchObj) obj;
        return f0.g(this.type, prefetchObj.type) && f0.g(this.url, prefetchObj.url) && f0.g(this.query, prefetchObj.query) && f0.g(this.body, prefetchObj.body) && f0.g(this.need_encrypt, prefetchObj.need_encrypt);
    }

    @e
    public final String getBody() {
        return this.body;
    }

    @e
    public final String getNeed_encrypt() {
        return this.need_encrypt;
    }

    @e
    public final Map<String, String> getQuery() {
        return this.query;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.JM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.query;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.body;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.need_encrypt;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBody(@e String str) {
        this.body = str;
    }

    public final void setNeed_encrypt(@e String str) {
        this.need_encrypt = str;
    }

    public final void setQuery(@e Map<String, String> map) {
        this.query = map;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.IM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PrefetchObj(type=" + this.type + ", url=" + this.url + ", query=" + this.query + ", body=" + this.body + ", need_encrypt=" + this.need_encrypt + ')';
    }
}
