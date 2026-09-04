package com.max.hbuikit.bean.param;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitBackgroundGradientObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitBackgroundGradientObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_color_end;

    @e
    private String background_color_orientation;

    @e
    private String background_color_start;

    public UiKitBackgroundGradientObj(@e String str, @e String str2, @e String str3) {
        this.background_color_start = str;
        this.background_color_end = str2;
        this.background_color_orientation = str3;
    }

    public static /* synthetic */ UiKitBackgroundGradientObj copy$default(UiKitBackgroundGradientObj uiKitBackgroundGradientObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitBackgroundGradientObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33787pk, new Class[]{UiKitBackgroundGradientObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, UiKitBackgroundGradientObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitBackgroundGradientObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = uiKitBackgroundGradientObj.background_color_start;
        }
        if ((i10 & 2) != 0) {
            str2 = uiKitBackgroundGradientObj.background_color_end;
        }
        if ((i10 & 4) != 0) {
            str3 = uiKitBackgroundGradientObj.background_color_orientation;
        }
        return uiKitBackgroundGradientObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.background_color_start;
    }

    @e
    public final String component2() {
        return this.background_color_end;
    }

    @e
    public final String component3() {
        return this.background_color_orientation;
    }

    @d
    public final UiKitBackgroundGradientObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.k.f33764ok, new Class[]{String.class, String.class, String.class}, UiKitBackgroundGradientObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitBackgroundGradientObj) patchProxyResultProxy.result : new UiKitBackgroundGradientObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33854sk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitBackgroundGradientObj)) {
            return false;
        }
        UiKitBackgroundGradientObj uiKitBackgroundGradientObj = (UiKitBackgroundGradientObj) obj;
        return f0.g(this.background_color_start, uiKitBackgroundGradientObj.background_color_start) && f0.g(this.background_color_end, uiKitBackgroundGradientObj.background_color_end) && f0.g(this.background_color_orientation, uiKitBackgroundGradientObj.background_color_orientation);
    }

    @e
    public final String getBackground_color_end() {
        return this.background_color_end;
    }

    @e
    public final String getBackground_color_orientation() {
        return this.background_color_orientation;
    }

    @e
    public final String getBackground_color_start() {
        return this.background_color_start;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33832rk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.background_color_start;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.background_color_end;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.background_color_orientation;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBackground_color_end(@e String str) {
        this.background_color_end = str;
    }

    public final void setBackground_color_orientation(@e String str) {
        this.background_color_orientation = str;
    }

    public final void setBackground_color_start(@e String str) {
        this.background_color_start = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33810qk, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitBackgroundGradientObj(background_color_start=" + this.background_color_start + ", background_color_end=" + this.background_color_end + ", background_color_orientation=" + this.background_color_orientation + ')';
    }
}
