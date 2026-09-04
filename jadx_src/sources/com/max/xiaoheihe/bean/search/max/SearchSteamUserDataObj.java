package com.max.xiaoheihe.bean.search.max;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchSteamUserDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchSteamUserDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String is_authentication;

    @e
    private String name;

    @e
    private String protocol;

    @e
    private String steam_id;

    public SearchSteamUserDataObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.avatar = str;
        this.name = str2;
        this.steam_id = str3;
        this.is_authentication = str4;
        this.protocol = str5;
    }

    public static /* synthetic */ SearchSteamUserDataObj copy$default(SearchSteamUserDataObj searchSteamUserDataObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchSteamUserDataObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15893, new Class[]{SearchSteamUserDataObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SearchSteamUserDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchSteamUserDataObj) patchProxyResultProxy.result;
        }
        return searchSteamUserDataObj.copy((i10 & 1) != 0 ? searchSteamUserDataObj.avatar : str, (i10 & 2) != 0 ? searchSteamUserDataObj.name : str2, (i10 & 4) != 0 ? searchSteamUserDataObj.steam_id : str3, (i10 & 8) != 0 ? searchSteamUserDataObj.is_authentication : str4, (i10 & 16) != 0 ? searchSteamUserDataObj.protocol : str5);
    }

    @e
    public final String component1() {
        return this.avatar;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.steam_id;
    }

    @e
    public final String component4() {
        return this.is_authentication;
    }

    @e
    public final String component5() {
        return this.protocol;
    }

    @d
    public final SearchSteamUserDataObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15892, new Class[]{String.class, String.class, String.class, String.class, String.class}, SearchSteamUserDataObj.class);
        return patchProxyResultProxy.isSupported ? (SearchSteamUserDataObj) patchProxyResultProxy.result : new SearchSteamUserDataObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15896, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSteamUserDataObj)) {
            return false;
        }
        SearchSteamUserDataObj searchSteamUserDataObj = (SearchSteamUserDataObj) obj;
        return f0.g(this.avatar, searchSteamUserDataObj.avatar) && f0.g(this.name, searchSteamUserDataObj.name) && f0.g(this.steam_id, searchSteamUserDataObj.steam_id) && f0.g(this.is_authentication, searchSteamUserDataObj.is_authentication) && f0.g(this.protocol, searchSteamUserDataObj.protocol);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15895, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.steam_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.is_authentication;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @e
    public final String is_authentication() {
        return this.is_authentication;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void set_authentication(@e String str) {
        this.is_authentication = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15894, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchSteamUserDataObj(avatar=" + this.avatar + ", name=" + this.name + ", steam_id=" + this.steam_id + ", is_authentication=" + this.is_authentication + ", protocol=" + this.protocol + ')';
    }
}
