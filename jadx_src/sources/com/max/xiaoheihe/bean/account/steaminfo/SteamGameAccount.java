package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamGameAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamGameAccount implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String name;

    @SerializedName("steam_id")
    @e
    private String steamId;

    public SteamGameAccount(@e String str, @e String str2, @e String str3) {
        this.name = str;
        this.steamId = str2;
        this.avatar = str3;
    }

    public static /* synthetic */ SteamGameAccount copy$default(SteamGameAccount steamGameAccount, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamGameAccount, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14074, new Class[]{SteamGameAccount.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SteamGameAccount.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamGameAccount) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = steamGameAccount.name;
        }
        if ((i10 & 2) != 0) {
            str2 = steamGameAccount.steamId;
        }
        if ((i10 & 4) != 0) {
            str3 = steamGameAccount.avatar;
        }
        return steamGameAccount.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.steamId;
    }

    @e
    public final String component3() {
        return this.avatar;
    }

    @d
    public final SteamGameAccount copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14073, new Class[]{String.class, String.class, String.class}, SteamGameAccount.class);
        return patchProxyResultProxy.isSupported ? (SteamGameAccount) patchProxyResultProxy.result : new SteamGameAccount(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14077, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamGameAccount)) {
            return false;
        }
        SteamGameAccount steamGameAccount = (SteamGameAccount) obj;
        return f0.g(this.name, steamGameAccount.name) && f0.g(this.steamId, steamGameAccount.steamId) && f0.g(this.avatar, steamGameAccount.avatar);
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
    public final String getSteamId() {
        return this.steamId;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14076, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.steamId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSteamId(@e String str) {
        this.steamId = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14075, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamGameAccount(name=" + this.name + ", steamId=" + this.steamId + ", avatar=" + this.avatar + ')';
    }
}
