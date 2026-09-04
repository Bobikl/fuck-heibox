package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HotSearchListItemColor implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String end_color;

    @e
    private String start_color;

    public HotSearchListItemColor(@e String str, @e String str2) {
        this.start_color = str;
        this.end_color = str2;
    }

    public static /* synthetic */ HotSearchListItemColor copy$default(HotSearchListItemColor hotSearchListItemColor, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchListItemColor, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33451b7, new Class[]{HotSearchListItemColor.class, String.class, String.class, Integer.TYPE, Object.class}, HotSearchListItemColor.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchListItemColor) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = hotSearchListItemColor.start_color;
        }
        if ((i10 & 2) != 0) {
            str2 = hotSearchListItemColor.end_color;
        }
        return hotSearchListItemColor.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.start_color;
    }

    @e
    public final String component2() {
        return this.end_color;
    }

    @d
    public final HotSearchListItemColor copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.k.f33428a7, new Class[]{String.class, String.class}, HotSearchListItemColor.class);
        return patchProxyResultProxy.isSupported ? (HotSearchListItemColor) patchProxyResultProxy.result : new HotSearchListItemColor(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33521e7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSearchListItemColor)) {
            return false;
        }
        HotSearchListItemColor hotSearchListItemColor = (HotSearchListItemColor) obj;
        return f0.g(this.start_color, hotSearchListItemColor.start_color) && f0.g(this.end_color, hotSearchListItemColor.end_color);
    }

    @e
    public final String getEnd_color() {
        return this.end_color;
    }

    @e
    public final String getStart_color() {
        return this.start_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33498d7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.start_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end_color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEnd_color(@e String str) {
        this.end_color = str;
    }

    public final void setStart_color(@e String str) {
        this.start_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33474c7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotSearchListItemColor(start_color=" + this.start_color + ", end_color=" + this.end_color + ')';
    }
}
