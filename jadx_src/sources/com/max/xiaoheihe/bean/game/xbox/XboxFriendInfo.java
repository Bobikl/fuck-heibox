package com.max.xiaoheihe.bean.game.xbox;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.XboxBaseAccountInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: XboxFriendInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class XboxFriendInfo extends XboxBaseAccountInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BBSUserInfoObj bind_heybox_info;

    @e
    private Boolean has_heybox;
    private boolean isMyself;

    @e
    private String onlineStateCode;

    @e
    private String onlineStateStr;

    @e
    private String rank;

    public XboxFriendInfo(@e Boolean bool, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3, boolean z10) {
        this.has_heybox = bool;
        this.bind_heybox_info = bBSUserInfoObj;
        this.rank = str;
        this.onlineStateCode = str2;
        this.onlineStateStr = str3;
        this.isMyself = z10;
    }

    public /* synthetic */ XboxFriendInfo(Boolean bool, BBSUserInfoObj bBSUserInfoObj, String str, String str2, String str3, boolean z10, int i10, u uVar) {
        this(bool, bBSUserInfoObj, str, str2, str3, (i10 & 32) != 0 ? false : z10);
    }

    public static /* synthetic */ XboxFriendInfo copy$default(XboxFriendInfo xboxFriendInfo, Boolean bool, BBSUserInfoObj bBSUserInfoObj, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xboxFriendInfo, bool, bBSUserInfoObj, str, str2, str3, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 15449, new Class[]{XboxFriendInfo.class, Boolean.class, BBSUserInfoObj.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, XboxFriendInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (XboxFriendInfo) patchProxyResultProxy.result;
        }
        Boolean bool2 = (i10 & 1) != 0 ? xboxFriendInfo.has_heybox : bool;
        BBSUserInfoObj bBSUserInfoObj2 = (i10 & 2) != 0 ? xboxFriendInfo.bind_heybox_info : bBSUserInfoObj;
        String str4 = (i10 & 4) != 0 ? xboxFriendInfo.rank : str;
        String str5 = (i10 & 8) != 0 ? xboxFriendInfo.onlineStateCode : str2;
        String str6 = (i10 & 16) != 0 ? xboxFriendInfo.onlineStateStr : str3;
        if ((i10 & 32) != 0) {
            z11 = xboxFriendInfo.isMyself;
        }
        return xboxFriendInfo.copy(bool2, bBSUserInfoObj2, str4, str5, str6, z11);
    }

    @e
    public final Boolean component1() {
        return this.has_heybox;
    }

    @e
    public final BBSUserInfoObj component2() {
        return this.bind_heybox_info;
    }

    @e
    public final String component3() {
        return this.rank;
    }

    @e
    public final String component4() {
        return this.onlineStateCode;
    }

    @e
    public final String component5() {
        return this.onlineStateStr;
    }

    public final boolean component6() {
        return this.isMyself;
    }

    @d
    public final XboxFriendInfo copy(@e Boolean bool, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, bBSUserInfoObj, str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 15448, new Class[]{Boolean.class, BBSUserInfoObj.class, String.class, String.class, String.class, Boolean.TYPE}, XboxFriendInfo.class);
        return patchProxyResultProxy.isSupported ? (XboxFriendInfo) patchProxyResultProxy.result : new XboxFriendInfo(bool, bBSUserInfoObj, str, str2, str3, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15452, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XboxFriendInfo)) {
            return false;
        }
        XboxFriendInfo xboxFriendInfo = (XboxFriendInfo) obj;
        return f0.g(this.has_heybox, xboxFriendInfo.has_heybox) && f0.g(this.bind_heybox_info, xboxFriendInfo.bind_heybox_info) && f0.g(this.rank, xboxFriendInfo.rank) && f0.g(this.onlineStateCode, xboxFriendInfo.onlineStateCode) && f0.g(this.onlineStateStr, xboxFriendInfo.onlineStateStr) && this.isMyself == xboxFriendInfo.isMyself;
    }

    @e
    public final BBSUserInfoObj getBind_heybox_info() {
        return this.bind_heybox_info;
    }

    @e
    public final Boolean getHas_heybox() {
        return this.has_heybox;
    }

    @e
    public final String getOnlineStateCode() {
        return this.onlineStateCode;
    }

    @e
    public final String getOnlineStateStr() {
        return this.onlineStateStr;
    }

    @e
    public final String getRank() {
        return this.rank;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15451, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.has_heybox;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.bind_heybox_info;
        int iHashCode2 = (iHashCode + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str = this.rank;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onlineStateCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onlineStateStr;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.isMyself;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode5 + r10;
    }

    public final boolean isMyself() {
        return this.isMyself;
    }

    public final void setBind_heybox_info(@e BBSUserInfoObj bBSUserInfoObj) {
        this.bind_heybox_info = bBSUserInfoObj;
    }

    public final void setHas_heybox(@e Boolean bool) {
        this.has_heybox = bool;
    }

    public final void setMyself(boolean z10) {
        this.isMyself = z10;
    }

    public final void setOnlineStateCode(@e String str) {
        this.onlineStateCode = str;
    }

    public final void setOnlineStateStr(@e String str) {
        this.onlineStateStr = str;
    }

    public final void setRank(@e String str) {
        this.rank = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15450, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "XboxFriendInfo(has_heybox=" + this.has_heybox + ", bind_heybox_info=" + this.bind_heybox_info + ", rank=" + this.rank + ", onlineStateCode=" + this.onlineStateCode + ", onlineStateStr=" + this.onlineStateStr + ", isMyself=" + this.isMyself + ')';
    }
}
