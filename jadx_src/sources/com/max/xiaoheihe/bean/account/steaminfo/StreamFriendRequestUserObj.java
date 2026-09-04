package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StreamFriendRequestUserObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class StreamFriendRequestUserObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountDetailObj heybox;

    @e
    private SteamIdInfoObj steam;

    public StreamFriendRequestUserObj(@e AccountDetailObj accountDetailObj, @e SteamIdInfoObj steamIdInfoObj) {
        this.heybox = accountDetailObj;
        this.steam = steamIdInfoObj;
    }

    public static /* synthetic */ StreamFriendRequestUserObj copy$default(StreamFriendRequestUserObj streamFriendRequestUserObj, AccountDetailObj accountDetailObj, SteamIdInfoObj steamIdInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{streamFriendRequestUserObj, accountDetailObj, steamIdInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14079, new Class[]{StreamFriendRequestUserObj.class, AccountDetailObj.class, SteamIdInfoObj.class, Integer.TYPE, Object.class}, StreamFriendRequestUserObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StreamFriendRequestUserObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            accountDetailObj = streamFriendRequestUserObj.heybox;
        }
        if ((i10 & 2) != 0) {
            steamIdInfoObj = streamFriendRequestUserObj.steam;
        }
        return streamFriendRequestUserObj.copy(accountDetailObj, steamIdInfoObj);
    }

    @e
    public final AccountDetailObj component1() {
        return this.heybox;
    }

    @e
    public final SteamIdInfoObj component2() {
        return this.steam;
    }

    @d
    public final StreamFriendRequestUserObj copy(@e AccountDetailObj accountDetailObj, @e SteamIdInfoObj steamIdInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDetailObj, steamIdInfoObj}, this, changeQuickRedirect, false, 14078, new Class[]{AccountDetailObj.class, SteamIdInfoObj.class}, StreamFriendRequestUserObj.class);
        return patchProxyResultProxy.isSupported ? (StreamFriendRequestUserObj) patchProxyResultProxy.result : new StreamFriendRequestUserObj(accountDetailObj, steamIdInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14082, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamFriendRequestUserObj)) {
            return false;
        }
        StreamFriendRequestUserObj streamFriendRequestUserObj = (StreamFriendRequestUserObj) obj;
        return f0.g(this.heybox, streamFriendRequestUserObj.heybox) && f0.g(this.steam, streamFriendRequestUserObj.steam);
    }

    @e
    public final AccountDetailObj getHeybox() {
        return this.heybox;
    }

    @e
    public final SteamIdInfoObj getSteam() {
        return this.steam;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14081, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        AccountDetailObj accountDetailObj = this.heybox;
        int iHashCode = (accountDetailObj == null ? 0 : accountDetailObj.hashCode()) * 31;
        SteamIdInfoObj steamIdInfoObj = this.steam;
        return iHashCode + (steamIdInfoObj != null ? steamIdInfoObj.hashCode() : 0);
    }

    public final void setHeybox(@e AccountDetailObj accountDetailObj) {
        this.heybox = accountDetailObj;
    }

    public final void setSteam(@e SteamIdInfoObj steamIdInfoObj) {
        this.steam = steamIdInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14080, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StreamFriendRequestUserObj(heybox=" + this.heybox + ", steam=" + this.steam + ')';
    }
}
