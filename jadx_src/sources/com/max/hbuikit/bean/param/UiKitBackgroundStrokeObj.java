package com.max.hbuikit.bean.param;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitBackgroundStrokeObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitBackgroundStrokeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String width;

    public UiKitBackgroundStrokeObj(@e String str, @e String str2) {
        this.width = str;
        this.color = str2;
    }

    public static /* synthetic */ UiKitBackgroundStrokeObj copy$default(UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitBackgroundStrokeObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f34008zk, new Class[]{UiKitBackgroundStrokeObj.class, String.class, String.class, Integer.TYPE, Object.class}, UiKitBackgroundStrokeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitBackgroundStrokeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = uiKitBackgroundStrokeObj.width;
        }
        if ((i10 & 2) != 0) {
            str2 = uiKitBackgroundStrokeObj.color;
        }
        return uiKitBackgroundStrokeObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.width;
    }

    @e
    public final String component2() {
        return this.color;
    }

    @d
    public final UiKitBackgroundStrokeObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.k.f33986yk, new Class[]{String.class, String.class}, UiKitBackgroundStrokeObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitBackgroundStrokeObj) patchProxyResultProxy.result : new UiKitBackgroundStrokeObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Ck, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitBackgroundStrokeObj)) {
            return false;
        }
        UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj = (UiKitBackgroundStrokeObj) obj;
        return f0.g(this.width, uiKitBackgroundStrokeObj.width) && f0.g(this.color, uiKitBackgroundStrokeObj.color);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Bk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.width;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setWidth(@e String str) {
        this.width = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ak, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitBackgroundStrokeObj(width=" + this.width + ", color=" + this.color + ')';
    }
}
