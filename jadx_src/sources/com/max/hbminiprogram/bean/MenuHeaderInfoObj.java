package com.max.hbminiprogram.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MenuHeaderInfoObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MenuHeaderInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String icon_img;

    @e
    private String protocol;

    public MenuHeaderInfoObj(@e String str, @e String str2) {
        this.icon_img = str;
        this.protocol = str2;
    }

    public static /* synthetic */ MenuHeaderInfoObj copy$default(MenuHeaderInfoObj menuHeaderInfoObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuHeaderInfoObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.f33257i, new Class[]{MenuHeaderInfoObj.class, String.class, String.class, Integer.TYPE, Object.class}, MenuHeaderInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MenuHeaderInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = menuHeaderInfoObj.icon_img;
        }
        if ((i10 & 2) != 0) {
            str2 = menuHeaderInfoObj.protocol;
        }
        return menuHeaderInfoObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.icon_img;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @d
    public final MenuHeaderInfoObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.h.f33255h, new Class[]{String.class, String.class}, MenuHeaderInfoObj.class);
        return patchProxyResultProxy.isSupported ? (MenuHeaderInfoObj) patchProxyResultProxy.result : new MenuHeaderInfoObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.f33263l, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuHeaderInfoObj)) {
            return false;
        }
        MenuHeaderInfoObj menuHeaderInfoObj = (MenuHeaderInfoObj) obj;
        return f0.g(this.icon_img, menuHeaderInfoObj.icon_img) && f0.g(this.protocol, menuHeaderInfoObj.protocol);
    }

    @e
    public final String getIcon_img() {
        return this.icon_img;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33261k, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.icon_img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setIcon_img(@e String str) {
        this.icon_img = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33259j, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MenuHeaderInfoObj(icon_img=" + this.icon_img + ", protocol=" + this.protocol + ')';
    }
}
