package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamFriendRequestObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamFriendRequestObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String method;

    @e
    private StreamFriendRequestUserObj receiver;

    @e
    private StreamFriendRequestUserObj sender;

    @e
    private String status;

    @e
    private String ts;

    public SteamFriendRequestObj(@e StreamFriendRequestUserObj streamFriendRequestUserObj, @e StreamFriendRequestUserObj streamFriendRequestUserObj2, @e String str, @e String str2, @e String str3) {
        this.sender = streamFriendRequestUserObj;
        this.receiver = streamFriendRequestUserObj2;
        this.method = str;
        this.status = str2;
        this.ts = str3;
    }

    public static /* synthetic */ SteamFriendRequestObj copy$default(SteamFriendRequestObj steamFriendRequestObj, StreamFriendRequestUserObj streamFriendRequestUserObj, StreamFriendRequestUserObj streamFriendRequestUserObj2, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamFriendRequestObj, streamFriendRequestUserObj, streamFriendRequestUserObj2, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14068, new Class[]{SteamFriendRequestObj.class, StreamFriendRequestUserObj.class, StreamFriendRequestUserObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SteamFriendRequestObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamFriendRequestObj) patchProxyResultProxy.result;
        }
        return steamFriendRequestObj.copy((i10 & 1) != 0 ? steamFriendRequestObj.sender : streamFriendRequestUserObj, (i10 & 2) != 0 ? steamFriendRequestObj.receiver : streamFriendRequestUserObj2, (i10 & 4) != 0 ? steamFriendRequestObj.method : str, (i10 & 8) != 0 ? steamFriendRequestObj.status : str2, (i10 & 16) != 0 ? steamFriendRequestObj.ts : str3);
    }

    @e
    public final StreamFriendRequestUserObj component1() {
        return this.sender;
    }

    @e
    public final StreamFriendRequestUserObj component2() {
        return this.receiver;
    }

    @e
    public final String component3() {
        return this.method;
    }

    @e
    public final String component4() {
        return this.status;
    }

    @e
    public final String component5() {
        return this.ts;
    }

    @d
    public final SteamFriendRequestObj copy(@e StreamFriendRequestUserObj streamFriendRequestUserObj, @e StreamFriendRequestUserObj streamFriendRequestUserObj2, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{streamFriendRequestUserObj, streamFriendRequestUserObj2, str, str2, str3}, this, changeQuickRedirect, false, 14067, new Class[]{StreamFriendRequestUserObj.class, StreamFriendRequestUserObj.class, String.class, String.class, String.class}, SteamFriendRequestObj.class);
        return patchProxyResultProxy.isSupported ? (SteamFriendRequestObj) patchProxyResultProxy.result : new SteamFriendRequestObj(streamFriendRequestUserObj, streamFriendRequestUserObj2, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14071, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamFriendRequestObj)) {
            return false;
        }
        SteamFriendRequestObj steamFriendRequestObj = (SteamFriendRequestObj) obj;
        return f0.g(this.sender, steamFriendRequestObj.sender) && f0.g(this.receiver, steamFriendRequestObj.receiver) && f0.g(this.method, steamFriendRequestObj.method) && f0.g(this.status, steamFriendRequestObj.status) && f0.g(this.ts, steamFriendRequestObj.ts);
    }

    @e
    public final String getMethod() {
        return this.method;
    }

    @e
    public final StreamFriendRequestUserObj getReceiver() {
        return this.receiver;
    }

    @e
    public final StreamFriendRequestUserObj getSender() {
        return this.sender;
    }

    @e
    public final String getStatus() {
        return this.status;
    }

    @e
    public final String getTs() {
        return this.ts;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14070, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StreamFriendRequestUserObj streamFriendRequestUserObj = this.sender;
        int iHashCode = (streamFriendRequestUserObj == null ? 0 : streamFriendRequestUserObj.hashCode()) * 31;
        StreamFriendRequestUserObj streamFriendRequestUserObj2 = this.receiver;
        int iHashCode2 = (iHashCode + (streamFriendRequestUserObj2 == null ? 0 : streamFriendRequestUserObj2.hashCode())) * 31;
        String str = this.method;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ts;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setMethod(@e String str) {
        this.method = str;
    }

    public final void setReceiver(@e StreamFriendRequestUserObj streamFriendRequestUserObj) {
        this.receiver = streamFriendRequestUserObj;
    }

    public final void setSender(@e StreamFriendRequestUserObj streamFriendRequestUserObj) {
        this.sender = streamFriendRequestUserObj;
    }

    public final void setStatus(@e String str) {
        this.status = str;
    }

    public final void setTs(@e String str) {
        this.ts = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14069, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamFriendRequestObj(sender=" + this.sender + ", receiver=" + this.receiver + ", method=" + this.method + ", status=" + this.status + ", ts=" + this.ts + ')';
    }
}
