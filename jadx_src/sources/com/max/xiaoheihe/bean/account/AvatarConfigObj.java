package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AvatarConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AvatarConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String can_change;

    @e
    private String change_msg;

    public AvatarConfigObj(@e String str, @e String str2) {
        this.can_change = str;
        this.change_msg = str2;
    }

    public static /* synthetic */ AvatarConfigObj copy$default(AvatarConfigObj avatarConfigObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarConfigObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.CO, new Class[]{AvatarConfigObj.class, String.class, String.class, Integer.TYPE, Object.class}, AvatarConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AvatarConfigObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = avatarConfigObj.can_change;
        }
        if ((i10 & 2) != 0) {
            str2 = avatarConfigObj.change_msg;
        }
        return avatarConfigObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.can_change;
    }

    @e
    public final String component2() {
        return this.change_msg;
    }

    @d
    public final AvatarConfigObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.BO, new Class[]{String.class, String.class}, AvatarConfigObj.class);
        return patchProxyResultProxy.isSupported ? (AvatarConfigObj) patchProxyResultProxy.result : new AvatarConfigObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.FO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarConfigObj)) {
            return false;
        }
        AvatarConfigObj avatarConfigObj = (AvatarConfigObj) obj;
        return f0.g(this.can_change, avatarConfigObj.can_change) && f0.g(this.change_msg, avatarConfigObj.change_msg);
    }

    @e
    public final String getCan_change() {
        return this.can_change;
    }

    @e
    public final String getChange_msg() {
        return this.change_msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.EO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.can_change;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.change_msg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCan_change(@e String str) {
        this.can_change = str;
    }

    public final void setChange_msg(@e String str) {
        this.change_msg = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.DO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AvatarConfigObj(can_change=" + this.can_change + ", change_msg=" + this.change_msg + ')';
    }
}
