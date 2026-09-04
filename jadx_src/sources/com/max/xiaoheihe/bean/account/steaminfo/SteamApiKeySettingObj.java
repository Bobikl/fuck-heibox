package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamApiKeySettingObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamApiKeySettingObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String api_key;

    @e
    private UiKitViewObj bottom_prompt;

    @e
    private SteamAcceptGameParams data;

    @e
    private String desc;

    @e
    private String title;

    public SteamApiKeySettingObj(@e SteamAcceptGameParams steamAcceptGameParams, @e String str, @e String str2, @e String str3, @e UiKitViewObj uiKitViewObj) {
        this.data = steamAcceptGameParams;
        this.title = str;
        this.desc = str2;
        this.api_key = str3;
        this.bottom_prompt = uiKitViewObj;
    }

    public static /* synthetic */ SteamApiKeySettingObj copy$default(SteamApiKeySettingObj steamApiKeySettingObj, SteamAcceptGameParams steamAcceptGameParams, String str, String str2, String str3, UiKitViewObj uiKitViewObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamApiKeySettingObj, steamAcceptGameParams, str, str2, str3, uiKitViewObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14051, new Class[]{SteamApiKeySettingObj.class, SteamAcceptGameParams.class, String.class, String.class, String.class, UiKitViewObj.class, Integer.TYPE, Object.class}, SteamApiKeySettingObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamApiKeySettingObj) patchProxyResultProxy.result;
        }
        return steamApiKeySettingObj.copy((i10 & 1) != 0 ? steamApiKeySettingObj.data : steamAcceptGameParams, (i10 & 2) != 0 ? steamApiKeySettingObj.title : str, (i10 & 4) != 0 ? steamApiKeySettingObj.desc : str2, (i10 & 8) != 0 ? steamApiKeySettingObj.api_key : str3, (i10 & 16) != 0 ? steamApiKeySettingObj.bottom_prompt : uiKitViewObj);
    }

    @e
    public final SteamAcceptGameParams component1() {
        return this.data;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @e
    public final String component4() {
        return this.api_key;
    }

    @e
    public final UiKitViewObj component5() {
        return this.bottom_prompt;
    }

    @d
    public final SteamApiKeySettingObj copy(@e SteamAcceptGameParams steamAcceptGameParams, @e String str, @e String str2, @e String str3, @e UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamAcceptGameParams, str, str2, str3, uiKitViewObj}, this, changeQuickRedirect, false, 14050, new Class[]{SteamAcceptGameParams.class, String.class, String.class, String.class, UiKitViewObj.class}, SteamApiKeySettingObj.class);
        return patchProxyResultProxy.isSupported ? (SteamApiKeySettingObj) patchProxyResultProxy.result : new SteamApiKeySettingObj(steamAcceptGameParams, str, str2, str3, uiKitViewObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14054, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamApiKeySettingObj)) {
            return false;
        }
        SteamApiKeySettingObj steamApiKeySettingObj = (SteamApiKeySettingObj) obj;
        return f0.g(this.data, steamApiKeySettingObj.data) && f0.g(this.title, steamApiKeySettingObj.title) && f0.g(this.desc, steamApiKeySettingObj.desc) && f0.g(this.api_key, steamApiKeySettingObj.api_key) && f0.g(this.bottom_prompt, steamApiKeySettingObj.bottom_prompt);
    }

    @e
    public final String getApi_key() {
        return this.api_key;
    }

    @e
    public final UiKitViewObj getBottom_prompt() {
        return this.bottom_prompt;
    }

    @e
    public final SteamAcceptGameParams getData() {
        return this.data;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14053, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        SteamAcceptGameParams steamAcceptGameParams = this.data;
        int iHashCode = (steamAcceptGameParams == null ? 0 : steamAcceptGameParams.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.api_key;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UiKitViewObj uiKitViewObj = this.bottom_prompt;
        return iHashCode4 + (uiKitViewObj != null ? uiKitViewObj.hashCode() : 0);
    }

    public final void setApi_key(@e String str) {
        this.api_key = str;
    }

    public final void setBottom_prompt(@e UiKitViewObj uiKitViewObj) {
        this.bottom_prompt = uiKitViewObj;
    }

    public final void setData(@e SteamAcceptGameParams steamAcceptGameParams) {
        this.data = steamAcceptGameParams;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14052, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamApiKeySettingObj(data=" + this.data + ", title=" + this.title + ", desc=" + this.desc + ", api_key=" + this.api_key + ", bottom_prompt=" + this.bottom_prompt + ')';
    }
}
