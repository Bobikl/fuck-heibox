package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bottom;

    @e
    private String bottom_grad;

    @e
    private String main;

    @e
    private String top;

    public ColorInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.main = str;
        this.top = str2;
        this.bottom = str3;
        this.bottom_grad = str4;
    }

    public static /* synthetic */ ColorInfoObj copy$default(ColorInfoObj colorInfoObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorInfoObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Ij, new Class[]{ColorInfoObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ColorInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorInfoObj) patchProxyResultProxy.result;
        }
        return colorInfoObj.copy((i10 & 1) != 0 ? colorInfoObj.main : str, (i10 & 2) != 0 ? colorInfoObj.top : str2, (i10 & 4) != 0 ? colorInfoObj.bottom : str3, (i10 & 8) != 0 ? colorInfoObj.bottom_grad : str4);
    }

    @e
    public final String component1() {
        return this.main;
    }

    @e
    public final String component2() {
        return this.top;
    }

    @e
    public final String component3() {
        return this.bottom;
    }

    @e
    public final String component4() {
        return this.bottom_grad;
    }

    @d
    public final ColorInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, c.b.Hj, new Class[]{String.class, String.class, String.class, String.class}, ColorInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ColorInfoObj) patchProxyResultProxy.result : new ColorInfoObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Lj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorInfoObj)) {
            return false;
        }
        ColorInfoObj colorInfoObj = (ColorInfoObj) obj;
        return f0.g(this.main, colorInfoObj.main) && f0.g(this.top, colorInfoObj.top) && f0.g(this.bottom, colorInfoObj.bottom) && f0.g(this.bottom_grad, colorInfoObj.bottom_grad);
    }

    @e
    public final String getBottom() {
        return this.bottom;
    }

    @e
    public final String getBottom_grad() {
        return this.bottom_grad;
    }

    @e
    public final String getMain() {
        return this.main;
    }

    @e
    public final String getTop() {
        return this.top;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Kj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.main;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.top;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottom;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottom_grad;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBottom(@e String str) {
        this.bottom = str;
    }

    public final void setBottom_grad(@e String str) {
        this.bottom_grad = str;
    }

    public final void setMain(@e String str) {
        this.main = str;
    }

    public final void setTop(@e String str) {
        this.top = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Jj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ColorInfoObj(main=" + this.main + ", top=" + this.top + ", bottom=" + this.bottom + ", bottom_grad=" + this.bottom_grad + ')';
    }
}
