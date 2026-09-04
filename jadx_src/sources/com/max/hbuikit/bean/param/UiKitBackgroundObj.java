package com.max.hbuikit.bean.param;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UiKitBackgroundObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitBackgroundObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_color;

    @e
    private String background_corner_radius;

    @e
    private UiKitBackgroundGradientObj background_gradient;

    @e
    private UiKitBackgroundStrokeObj background_stroke;

    @e
    private String pressed_color;

    public UiKitBackgroundObj() {
        this(null, null, null, null, null, 31, null);
    }

    public UiKitBackgroundObj(@e String str, @e UiKitBackgroundGradientObj uiKitBackgroundGradientObj, @e UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj, @e String str2, @e String str3) {
        this.background_color = str;
        this.background_gradient = uiKitBackgroundGradientObj;
        this.background_stroke = uiKitBackgroundStrokeObj;
        this.background_corner_radius = str2;
        this.pressed_color = str3;
    }

    public /* synthetic */ UiKitBackgroundObj(String str, UiKitBackgroundGradientObj uiKitBackgroundGradientObj, UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj, String str2, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : uiKitBackgroundGradientObj, (i10 & 4) != 0 ? null : uiKitBackgroundStrokeObj, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ UiKitBackgroundObj copy$default(UiKitBackgroundObj uiKitBackgroundObj, String str, UiKitBackgroundGradientObj uiKitBackgroundGradientObj, UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitBackgroundObj, str, uiKitBackgroundGradientObj, uiKitBackgroundStrokeObj, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33898uk, new Class[]{UiKitBackgroundObj.class, String.class, UiKitBackgroundGradientObj.class, UiKitBackgroundStrokeObj.class, String.class, String.class, Integer.TYPE, Object.class}, UiKitBackgroundObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitBackgroundObj) patchProxyResultProxy.result;
        }
        return uiKitBackgroundObj.copy((i10 & 1) != 0 ? uiKitBackgroundObj.background_color : str, (i10 & 2) != 0 ? uiKitBackgroundObj.background_gradient : uiKitBackgroundGradientObj, (i10 & 4) != 0 ? uiKitBackgroundObj.background_stroke : uiKitBackgroundStrokeObj, (i10 & 8) != 0 ? uiKitBackgroundObj.background_corner_radius : str2, (i10 & 16) != 0 ? uiKitBackgroundObj.pressed_color : str3);
    }

    @e
    public final String component1() {
        return this.background_color;
    }

    @e
    public final UiKitBackgroundGradientObj component2() {
        return this.background_gradient;
    }

    @e
    public final UiKitBackgroundStrokeObj component3() {
        return this.background_stroke;
    }

    @e
    public final String component4() {
        return this.background_corner_radius;
    }

    @e
    public final String component5() {
        return this.pressed_color;
    }

    @d
    public final UiKitBackgroundObj copy(@e String str, @e UiKitBackgroundGradientObj uiKitBackgroundGradientObj, @e UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, uiKitBackgroundGradientObj, uiKitBackgroundStrokeObj, str2, str3}, this, changeQuickRedirect, false, c.k.f33876tk, new Class[]{String.class, UiKitBackgroundGradientObj.class, UiKitBackgroundStrokeObj.class, String.class, String.class}, UiKitBackgroundObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitBackgroundObj) patchProxyResultProxy.result : new UiKitBackgroundObj(str, uiKitBackgroundGradientObj, uiKitBackgroundStrokeObj, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33964xk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitBackgroundObj)) {
            return false;
        }
        UiKitBackgroundObj uiKitBackgroundObj = (UiKitBackgroundObj) obj;
        return f0.g(this.background_color, uiKitBackgroundObj.background_color) && f0.g(this.background_gradient, uiKitBackgroundObj.background_gradient) && f0.g(this.background_stroke, uiKitBackgroundObj.background_stroke) && f0.g(this.background_corner_radius, uiKitBackgroundObj.background_corner_radius) && f0.g(this.pressed_color, uiKitBackgroundObj.pressed_color);
    }

    @e
    public final String getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getBackground_corner_radius() {
        return this.background_corner_radius;
    }

    @e
    public final UiKitBackgroundGradientObj getBackground_gradient() {
        return this.background_gradient;
    }

    @e
    public final UiKitBackgroundStrokeObj getBackground_stroke() {
        return this.background_stroke;
    }

    @e
    public final String getPressed_color() {
        return this.pressed_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33942wk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.background_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UiKitBackgroundGradientObj uiKitBackgroundGradientObj = this.background_gradient;
        int iHashCode2 = (iHashCode + (uiKitBackgroundGradientObj == null ? 0 : uiKitBackgroundGradientObj.hashCode())) * 31;
        UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj = this.background_stroke;
        int iHashCode3 = (iHashCode2 + (uiKitBackgroundStrokeObj == null ? 0 : uiKitBackgroundStrokeObj.hashCode())) * 31;
        String str2 = this.background_corner_radius;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pressed_color;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBackground_color(@e String str) {
        this.background_color = str;
    }

    public final void setBackground_corner_radius(@e String str) {
        this.background_corner_radius = str;
    }

    public final void setBackground_gradient(@e UiKitBackgroundGradientObj uiKitBackgroundGradientObj) {
        this.background_gradient = uiKitBackgroundGradientObj;
    }

    public final void setBackground_stroke(@e UiKitBackgroundStrokeObj uiKitBackgroundStrokeObj) {
        this.background_stroke = uiKitBackgroundStrokeObj;
    }

    public final void setPressed_color(@e String str) {
        this.pressed_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33920vk, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitBackgroundObj(background_color=" + this.background_color + ", background_gradient=" + this.background_gradient + ", background_stroke=" + this.background_stroke + ", background_corner_radius=" + this.background_corner_radius + ", pressed_color=" + this.pressed_color + ')';
    }
}
