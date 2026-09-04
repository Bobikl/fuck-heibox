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
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: InterestProfileGroupObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class InterestProfileGroupObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String bg_color;
    private boolean custom_checked;

    @d
    private String group_key;

    @d
    private String group_name;

    @d
    private String icon;

    public InterestProfileGroupObj(@d String group_key, @d String bg_color, @d String icon, @d String group_name, boolean z10) {
        f0.p(group_key, "group_key");
        f0.p(bg_color, "bg_color");
        f0.p(icon, "icon");
        f0.p(group_name, "group_name");
        this.group_key = group_key;
        this.bg_color = bg_color;
        this.icon = icon;
        this.group_name = group_name;
        this.custom_checked = z10;
    }

    public /* synthetic */ InterestProfileGroupObj(String str, String str2, String str3, String str4, boolean z10, int i10, u uVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? false : z10);
    }

    public static /* synthetic */ InterestProfileGroupObj copy$default(InterestProfileGroupObj interestProfileGroupObj, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{interestProfileGroupObj, str, str2, str3, str4, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.BP, new Class[]{InterestProfileGroupObj.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, InterestProfileGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (InterestProfileGroupObj) patchProxyResultProxy.result;
        }
        String str5 = (i10 & 1) != 0 ? interestProfileGroupObj.group_key : str;
        String str6 = (i10 & 2) != 0 ? interestProfileGroupObj.bg_color : str2;
        String str7 = (i10 & 4) != 0 ? interestProfileGroupObj.icon : str3;
        String str8 = (i10 & 8) != 0 ? interestProfileGroupObj.group_name : str4;
        if ((i10 & 16) != 0) {
            z11 = interestProfileGroupObj.custom_checked;
        }
        return interestProfileGroupObj.copy(str5, str6, str7, str8, z11);
    }

    @d
    public final String component1() {
        return this.group_key;
    }

    @d
    public final String component2() {
        return this.bg_color;
    }

    @d
    public final String component3() {
        return this.icon;
    }

    @d
    public final String component4() {
        return this.group_name;
    }

    public final boolean component5() {
        return this.custom_checked;
    }

    @d
    public final InterestProfileGroupObj copy(@d String group_key, @d String bg_color, @d String icon, @d String group_name, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{group_key, bg_color, icon, group_name, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.AP, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, InterestProfileGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (InterestProfileGroupObj) patchProxyResultProxy.result;
        }
        f0.p(group_key, "group_key");
        f0.p(bg_color, "bg_color");
        f0.p(icon, "icon");
        f0.p(group_name, "group_name");
        return new InterestProfileGroupObj(group_key, bg_color, icon, group_name, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.EP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestProfileGroupObj)) {
            return false;
        }
        InterestProfileGroupObj interestProfileGroupObj = (InterestProfileGroupObj) obj;
        return f0.g(this.group_key, interestProfileGroupObj.group_key) && f0.g(this.bg_color, interestProfileGroupObj.bg_color) && f0.g(this.icon, interestProfileGroupObj.icon) && f0.g(this.group_name, interestProfileGroupObj.group_name) && this.custom_checked == interestProfileGroupObj.custom_checked;
    }

    @d
    public final String getBg_color() {
        return this.bg_color;
    }

    public final boolean getCustom_checked() {
        return this.custom_checked;
    }

    @d
    public final String getGroup_key() {
        return this.group_key;
    }

    @d
    public final String getGroup_name() {
        return this.group_name;
    }

    @d
    public final String getIcon() {
        return this.icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.DP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((((this.group_key.hashCode() * 31) + this.bg_color.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.group_name.hashCode()) * 31;
        boolean z10 = this.custom_checked;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        return iHashCode + r10;
    }

    public final void setBg_color(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.xP, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.bg_color = str;
    }

    public final void setCustom_checked(boolean z10) {
        this.custom_checked = z10;
    }

    public final void setGroup_key(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.wP, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.group_key = str;
    }

    public final void setGroup_name(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.zP, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.group_name = str;
    }

    public final void setIcon(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.yP, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.icon = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.CP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "InterestProfileGroupObj(group_key=" + this.group_key + ", bg_color=" + this.bg_color + ", icon=" + this.icon + ", group_name=" + this.group_name + ", custom_checked=" + this.custom_checked + ')';
    }
}
