package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicFriendInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicFriendInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BBSUserInfoObj bind_heybox_info;

    @e
    private String epic_name;

    @e
    private Boolean has_heybox;

    @e
    private String head_color;

    @e
    private String rank;

    public EpicFriendInfo(@e Boolean bool, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        this.has_heybox = bool;
        this.bind_heybox_info = bBSUserInfoObj;
        this.rank = str;
        this.epic_name = str2;
        this.head_color = str3;
    }

    public static /* synthetic */ EpicFriendInfo copy$default(EpicFriendInfo epicFriendInfo, Boolean bool, BBSUserInfoObj bBSUserInfoObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicFriendInfo, bool, bBSUserInfoObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15171, new Class[]{EpicFriendInfo.class, Boolean.class, BBSUserInfoObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, EpicFriendInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicFriendInfo) patchProxyResultProxy.result;
        }
        return epicFriendInfo.copy((i10 & 1) != 0 ? epicFriendInfo.has_heybox : bool, (i10 & 2) != 0 ? epicFriendInfo.bind_heybox_info : bBSUserInfoObj, (i10 & 4) != 0 ? epicFriendInfo.rank : str, (i10 & 8) != 0 ? epicFriendInfo.epic_name : str2, (i10 & 16) != 0 ? epicFriendInfo.head_color : str3);
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
        return this.epic_name;
    }

    @e
    public final String component5() {
        return this.head_color;
    }

    @d
    public final EpicFriendInfo copy(@e Boolean bool, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, bBSUserInfoObj, str, str2, str3}, this, changeQuickRedirect, false, 15170, new Class[]{Boolean.class, BBSUserInfoObj.class, String.class, String.class, String.class}, EpicFriendInfo.class);
        return patchProxyResultProxy.isSupported ? (EpicFriendInfo) patchProxyResultProxy.result : new EpicFriendInfo(bool, bBSUserInfoObj, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15174, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicFriendInfo)) {
            return false;
        }
        EpicFriendInfo epicFriendInfo = (EpicFriendInfo) obj;
        return f0.g(this.has_heybox, epicFriendInfo.has_heybox) && f0.g(this.bind_heybox_info, epicFriendInfo.bind_heybox_info) && f0.g(this.rank, epicFriendInfo.rank) && f0.g(this.epic_name, epicFriendInfo.epic_name) && f0.g(this.head_color, epicFriendInfo.head_color);
    }

    @e
    public final BBSUserInfoObj getBind_heybox_info() {
        return this.bind_heybox_info;
    }

    @e
    public final String getEpic_name() {
        return this.epic_name;
    }

    @e
    public final Boolean getHas_heybox() {
        return this.has_heybox;
    }

    @e
    public final String getHead_color() {
        return this.head_color;
    }

    @e
    public final String getRank() {
        return this.rank;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15173, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.has_heybox;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.bind_heybox_info;
        int iHashCode2 = (iHashCode + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str = this.rank;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.epic_name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.head_color;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBind_heybox_info(@e BBSUserInfoObj bBSUserInfoObj) {
        this.bind_heybox_info = bBSUserInfoObj;
    }

    public final void setEpic_name(@e String str) {
        this.epic_name = str;
    }

    public final void setHas_heybox(@e Boolean bool) {
        this.has_heybox = bool;
    }

    public final void setHead_color(@e String str) {
        this.head_color = str;
    }

    public final void setRank(@e String str) {
        this.rank = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15172, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicFriendInfo(has_heybox=" + this.has_heybox + ", bind_heybox_info=" + this.bind_heybox_info + ", rank=" + this.rank + ", epic_name=" + this.epic_name + ", head_color=" + this.head_color + ')';
    }
}
