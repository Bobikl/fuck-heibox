package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GroupBuyUserInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GroupBuyUserInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String heybox_id;

    @e
    private String user_image;

    @e
    private String user_name;

    public GroupBuyUserInfoObj(@e String str, @e String str2, @e String str3) {
        this.heybox_id = str;
        this.user_image = str2;
        this.user_name = str3;
    }

    public static /* synthetic */ GroupBuyUserInfoObj copy$default(GroupBuyUserInfoObj groupBuyUserInfoObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupBuyUserInfoObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15665, new Class[]{GroupBuyUserInfoObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GroupBuyUserInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GroupBuyUserInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = groupBuyUserInfoObj.heybox_id;
        }
        if ((i10 & 2) != 0) {
            str2 = groupBuyUserInfoObj.user_image;
        }
        if ((i10 & 4) != 0) {
            str3 = groupBuyUserInfoObj.user_name;
        }
        return groupBuyUserInfoObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.heybox_id;
    }

    @e
    public final String component2() {
        return this.user_image;
    }

    @e
    public final String component3() {
        return this.user_name;
    }

    @d
    public final GroupBuyUserInfoObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15664, new Class[]{String.class, String.class, String.class}, GroupBuyUserInfoObj.class);
        return patchProxyResultProxy.isSupported ? (GroupBuyUserInfoObj) patchProxyResultProxy.result : new GroupBuyUserInfoObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15668, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupBuyUserInfoObj)) {
            return false;
        }
        GroupBuyUserInfoObj groupBuyUserInfoObj = (GroupBuyUserInfoObj) obj;
        return f0.g(this.heybox_id, groupBuyUserInfoObj.heybox_id) && f0.g(this.user_image, groupBuyUserInfoObj.user_image) && f0.g(this.user_name, groupBuyUserInfoObj.user_name);
    }

    @e
    public final String getHeybox_id() {
        return this.heybox_id;
    }

    @e
    public final String getUser_image() {
        return this.user_image;
    }

    @e
    public final String getUser_name() {
        return this.user_name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15667, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.heybox_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.user_image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user_name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setHeybox_id(@e String str) {
        this.heybox_id = str;
    }

    public final void setUser_image(@e String str) {
        this.user_image = str;
    }

    public final void setUser_name(@e String str) {
        this.user_name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15666, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GroupBuyUserInfoObj(heybox_id=" + this.heybox_id + ", user_image=" + this.user_image + ", user_name=" + this.user_name + ')';
    }
}
