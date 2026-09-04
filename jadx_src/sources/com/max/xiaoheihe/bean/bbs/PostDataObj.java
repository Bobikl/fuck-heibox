package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Map<String, String> cookieHeaders;

    @e
    private String isDraft;

    @e
    private Map<String, String> paramsMap;

    @e
    private String user_code;

    public PostDataObj(@e Map<String, String> map, @e String str, @e Map<String, String> map2, @e String str2) {
        this.cookieHeaders = map;
        this.isDraft = str;
        this.paramsMap = map2;
        this.user_code = str2;
    }

    public /* synthetic */ PostDataObj(Map map, String str, Map map2, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? new HashMap() : map, str, (i10 & 4) != 0 ? new HashMap() : map2, str2);
    }

    public static /* synthetic */ PostDataObj copy$default(PostDataObj postDataObj, Map map, String str, Map map2, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postDataObj, map, str, map2, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14371, new Class[]{PostDataObj.class, Map.class, String.class, Map.class, String.class, Integer.TYPE, Object.class}, PostDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostDataObj) patchProxyResultProxy.result;
        }
        return postDataObj.copy((i10 & 1) != 0 ? postDataObj.cookieHeaders : map, (i10 & 2) != 0 ? postDataObj.isDraft : str, (i10 & 4) != 0 ? postDataObj.paramsMap : map2, (i10 & 8) != 0 ? postDataObj.user_code : str2);
    }

    @e
    public final Map<String, String> component1() {
        return this.cookieHeaders;
    }

    @e
    public final String component2() {
        return this.isDraft;
    }

    @e
    public final Map<String, String> component3() {
        return this.paramsMap;
    }

    @e
    public final String component4() {
        return this.user_code;
    }

    @d
    public final PostDataObj copy(@e Map<String, String> map, @e String str, @e Map<String, String> map2, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map, str, map2, str2}, this, changeQuickRedirect, false, 14370, new Class[]{Map.class, String.class, Map.class, String.class}, PostDataObj.class);
        return patchProxyResultProxy.isSupported ? (PostDataObj) patchProxyResultProxy.result : new PostDataObj(map, str, map2, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14374, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostDataObj)) {
            return false;
        }
        PostDataObj postDataObj = (PostDataObj) obj;
        return f0.g(this.cookieHeaders, postDataObj.cookieHeaders) && f0.g(this.isDraft, postDataObj.isDraft) && f0.g(this.paramsMap, postDataObj.paramsMap) && f0.g(this.user_code, postDataObj.user_code);
    }

    @e
    public final Map<String, String> getCookieHeaders() {
        return this.cookieHeaders;
    }

    @e
    public final Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    @e
    public final String getUser_code() {
        return this.user_code;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14373, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Map<String, String> map = this.cookieHeaders;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.isDraft;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map2 = this.paramsMap;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.user_code;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @e
    public final String isDraft() {
        return this.isDraft;
    }

    public final void setCookieHeaders(@e Map<String, String> map) {
        this.cookieHeaders = map;
    }

    public final void setDraft(@e String str) {
        this.isDraft = str;
    }

    public final void setParamsMap(@e Map<String, String> map) {
        this.paramsMap = map;
    }

    public final void setUser_code(@e String str) {
        this.user_code = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14372, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostDataObj(cookieHeaders=" + this.cookieHeaders + ", isDraft=" + this.isDraft + ", paramsMap=" + this.paramsMap + ", user_code=" + this.user_code + ')';
    }
}
