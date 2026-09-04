package com.max.hbshare.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProtocolPostOptionObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ProtocolPostOptionObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String full_icon;

    @e
    private String icon;

    @e
    private String icon_tint_color;

    @e
    private String protocol;

    @e
    private String title;

    public ProtocolPostOptionObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.title = str;
        this.icon = str2;
        this.icon_tint_color = str3;
        this.full_icon = str4;
        this.protocol = str5;
    }

    public static /* synthetic */ ProtocolPostOptionObj copy$default(ProtocolPostOptionObj protocolPostOptionObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{protocolPostOptionObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Wa, new Class[]{ProtocolPostOptionObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ProtocolPostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProtocolPostOptionObj) patchProxyResultProxy.result;
        }
        return protocolPostOptionObj.copy((i10 & 1) != 0 ? protocolPostOptionObj.title : str, (i10 & 2) != 0 ? protocolPostOptionObj.icon : str2, (i10 & 4) != 0 ? protocolPostOptionObj.icon_tint_color : str3, (i10 & 8) != 0 ? protocolPostOptionObj.full_icon : str4, (i10 & 16) != 0 ? protocolPostOptionObj.protocol : str5);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.icon;
    }

    @e
    public final String component3() {
        return this.icon_tint_color;
    }

    @e
    public final String component4() {
        return this.full_icon;
    }

    @e
    public final String component5() {
        return this.protocol;
    }

    @d
    public final ProtocolPostOptionObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, c.k.Va, new Class[]{String.class, String.class, String.class, String.class, String.class}, ProtocolPostOptionObj.class);
        return patchProxyResultProxy.isSupported ? (ProtocolPostOptionObj) patchProxyResultProxy.result : new ProtocolPostOptionObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Za, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolPostOptionObj)) {
            return false;
        }
        ProtocolPostOptionObj protocolPostOptionObj = (ProtocolPostOptionObj) obj;
        return f0.g(this.title, protocolPostOptionObj.title) && f0.g(this.icon, protocolPostOptionObj.icon) && f0.g(this.icon_tint_color, protocolPostOptionObj.icon_tint_color) && f0.g(this.full_icon, protocolPostOptionObj.full_icon) && f0.g(this.protocol, protocolPostOptionObj.protocol);
    }

    @e
    public final String getFull_icon() {
        return this.full_icon;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getIcon_tint_color() {
        return this.icon_tint_color;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ya, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon_tint_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.full_icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setFull_icon(@e String str) {
        this.full_icon = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setIcon_tint_color(@e String str) {
        this.icon_tint_color = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Xa, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProtocolPostOptionObj(title=" + this.title + ", icon=" + this.icon + ", icon_tint_color=" + this.icon_tint_color + ", full_icon=" + this.full_icon + ", protocol=" + this.protocol + ')';
    }
}
