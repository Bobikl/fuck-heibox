package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeyBoxUserObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HeyBoxUserObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String name;

    @e
    private String user_id;

    public HeyBoxUserObj(@e String str, @e String str2, @e String str3) {
        this.name = str;
        this.avatar = str2;
        this.user_id = str3;
    }

    public static /* synthetic */ HeyBoxUserObj copy$default(HeyBoxUserObj heyBoxUserObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyBoxUserObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15251, new Class[]{HeyBoxUserObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, HeyBoxUserObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyBoxUserObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = heyBoxUserObj.name;
        }
        if ((i10 & 2) != 0) {
            str2 = heyBoxUserObj.avatar;
        }
        if ((i10 & 4) != 0) {
            str3 = heyBoxUserObj.user_id;
        }
        return heyBoxUserObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.avatar;
    }

    @e
    public final String component3() {
        return this.user_id;
    }

    @d
    public final HeyBoxUserObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15250, new Class[]{String.class, String.class, String.class}, HeyBoxUserObj.class);
        return patchProxyResultProxy.isSupported ? (HeyBoxUserObj) patchProxyResultProxy.result : new HeyBoxUserObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15254, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeyBoxUserObj)) {
            return false;
        }
        HeyBoxUserObj heyBoxUserObj = (HeyBoxUserObj) obj;
        return f0.g(this.name, heyBoxUserObj.name) && f0.g(this.avatar, heyBoxUserObj.avatar) && f0.g(this.user_id, heyBoxUserObj.user_id);
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
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15253, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user_id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setUser_id(@e String str) {
        this.user_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15252, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeyBoxUserObj(name=" + this.name + ", avatar=" + this.avatar + ", user_id=" + this.user_id + ')';
    }
}
