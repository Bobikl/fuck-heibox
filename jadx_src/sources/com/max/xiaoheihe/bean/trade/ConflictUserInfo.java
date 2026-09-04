package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BindFailedInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ConflictUserInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String heybox_id;

    @e
    private String max_id;

    @e
    private String username;

    public ConflictUserInfo(@e String str, @e String str2, @e String str3, @e String str4) {
        this.username = str;
        this.avatar = str2;
        this.max_id = str3;
        this.heybox_id = str4;
    }

    public static /* synthetic */ ConflictUserInfo copy$default(ConflictUserInfo conflictUserInfo, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{conflictUserInfo, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 16013, new Class[]{ConflictUserInfo.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ConflictUserInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConflictUserInfo) patchProxyResultProxy.result;
        }
        return conflictUserInfo.copy((i10 & 1) != 0 ? conflictUserInfo.username : str, (i10 & 2) != 0 ? conflictUserInfo.avatar : str2, (i10 & 4) != 0 ? conflictUserInfo.max_id : str3, (i10 & 8) != 0 ? conflictUserInfo.heybox_id : str4);
    }

    @e
    public final String component1() {
        return this.username;
    }

    @e
    public final String component2() {
        return this.avatar;
    }

    @e
    public final String component3() {
        return this.max_id;
    }

    @e
    public final String component4() {
        return this.heybox_id;
    }

    @d
    public final ConflictUserInfo copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 16012, new Class[]{String.class, String.class, String.class, String.class}, ConflictUserInfo.class);
        return patchProxyResultProxy.isSupported ? (ConflictUserInfo) patchProxyResultProxy.result : new ConflictUserInfo(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16016, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConflictUserInfo)) {
            return false;
        }
        ConflictUserInfo conflictUserInfo = (ConflictUserInfo) obj;
        return f0.g(this.username, conflictUserInfo.username) && f0.g(this.avatar, conflictUserInfo.avatar) && f0.g(this.max_id, conflictUserInfo.max_id) && f0.g(this.heybox_id, conflictUserInfo.heybox_id);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getHeybox_id() {
        return this.heybox_id;
    }

    @e
    public final String getMax_id() {
        return this.max_id;
    }

    @e
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16015, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.max_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.heybox_id;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setHeybox_id(@e String str) {
        this.heybox_id = str;
    }

    public final void setMax_id(@e String str) {
        this.max_id = str;
    }

    public final void setUsername(@e String str) {
        this.username = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16014, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ConflictUserInfo(username=" + this.username + ", avatar=" + this.avatar + ", max_id=" + this.max_id + ", heybox_id=" + this.heybox_id + ')';
    }
}
