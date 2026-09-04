package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamFriendRequestHistoryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamFriendRequestHistoryObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<SteamFriendRequestObj> received;

    @d
    private List<SteamFriendRequestObj> sent;

    public SteamFriendRequestHistoryObj(@d List<SteamFriendRequestObj> received, @d List<SteamFriendRequestObj> sent) {
        f0.p(received, "received");
        f0.p(sent, "sent");
        this.received = received;
        this.sent = sent;
    }

    public static /* synthetic */ SteamFriendRequestHistoryObj copy$default(SteamFriendRequestHistoryObj steamFriendRequestHistoryObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamFriendRequestHistoryObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14063, new Class[]{SteamFriendRequestHistoryObj.class, List.class, List.class, Integer.TYPE, Object.class}, SteamFriendRequestHistoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamFriendRequestHistoryObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = steamFriendRequestHistoryObj.received;
        }
        if ((i10 & 2) != 0) {
            list2 = steamFriendRequestHistoryObj.sent;
        }
        return steamFriendRequestHistoryObj.copy(list, list2);
    }

    @d
    public final List<SteamFriendRequestObj> component1() {
        return this.received;
    }

    @d
    public final List<SteamFriendRequestObj> component2() {
        return this.sent;
    }

    @d
    public final SteamFriendRequestHistoryObj copy(@d List<SteamFriendRequestObj> received, @d List<SteamFriendRequestObj> sent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{received, sent}, this, changeQuickRedirect, false, 14062, new Class[]{List.class, List.class}, SteamFriendRequestHistoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamFriendRequestHistoryObj) patchProxyResultProxy.result;
        }
        f0.p(received, "received");
        f0.p(sent, "sent");
        return new SteamFriendRequestHistoryObj(received, sent);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14066, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamFriendRequestHistoryObj)) {
            return false;
        }
        SteamFriendRequestHistoryObj steamFriendRequestHistoryObj = (SteamFriendRequestHistoryObj) obj;
        return f0.g(this.received, steamFriendRequestHistoryObj.received) && f0.g(this.sent, steamFriendRequestHistoryObj.sent);
    }

    @d
    public final List<SteamFriendRequestObj> getReceived() {
        return this.received;
    }

    @d
    public final List<SteamFriendRequestObj> getSent() {
        return this.sent;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14065, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.received.hashCode() * 31) + this.sent.hashCode();
    }

    public final void setReceived(@d List<SteamFriendRequestObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14060, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.received = list;
    }

    public final void setSent(@d List<SteamFriendRequestObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14061, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.sent = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14064, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamFriendRequestHistoryObj(received=" + this.received + ", sent=" + this.sent + ')';
    }
}
