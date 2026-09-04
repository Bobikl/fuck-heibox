package com.max.xiaoheihe.bean.game.xbox;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: XboxPresenceInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class XboxPresenceInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String online_state;

    @e
    private String presence_state_desc;

    public XboxPresenceInfo(@e String str, @e String str2) {
        this.online_state = str;
        this.presence_state_desc = str2;
    }

    public static /* synthetic */ XboxPresenceInfo copy$default(XboxPresenceInfo xboxPresenceInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xboxPresenceInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15459, new Class[]{XboxPresenceInfo.class, String.class, String.class, Integer.TYPE, Object.class}, XboxPresenceInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (XboxPresenceInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = xboxPresenceInfo.online_state;
        }
        if ((i10 & 2) != 0) {
            str2 = xboxPresenceInfo.presence_state_desc;
        }
        return xboxPresenceInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.online_state;
    }

    @e
    public final String component2() {
        return this.presence_state_desc;
    }

    @d
    public final XboxPresenceInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15458, new Class[]{String.class, String.class}, XboxPresenceInfo.class);
        return patchProxyResultProxy.isSupported ? (XboxPresenceInfo) patchProxyResultProxy.result : new XboxPresenceInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15462, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XboxPresenceInfo)) {
            return false;
        }
        XboxPresenceInfo xboxPresenceInfo = (XboxPresenceInfo) obj;
        return f0.g(this.online_state, xboxPresenceInfo.online_state) && f0.g(this.presence_state_desc, xboxPresenceInfo.presence_state_desc);
    }

    @e
    public final String getOnline_state() {
        return this.online_state;
    }

    @e
    public final String getPresence_state_desc() {
        return this.presence_state_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15461, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.online_state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.presence_state_desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOnline_state(@e String str) {
        this.online_state = str;
    }

    public final void setPresence_state_desc(@e String str) {
        this.presence_state_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15460, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "XboxPresenceInfo(online_state=" + this.online_state + ", presence_state_desc=" + this.presence_state_desc + ')';
    }
}
