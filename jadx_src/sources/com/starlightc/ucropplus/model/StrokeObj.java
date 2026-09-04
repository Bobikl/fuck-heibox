package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StrokeObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StrokeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String stroke_color;
    private float stroke_width;

    public StrokeObj(@e String str, float f10) {
        this.stroke_color = str;
        this.stroke_width = f10;
    }

    public /* synthetic */ StrokeObj(String str, float f10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public static /* synthetic */ StrokeObj copy$default(StrokeObj strokeObj, String str, float f10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strokeObj, str, new Float(f10), new Integer(i10), obj}, null, changeQuickRedirect, true, 50120, new Class[]{StrokeObj.class, String.class, Float.TYPE, Integer.TYPE, Object.class}, StrokeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StrokeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = strokeObj.stroke_color;
        }
        if ((i10 & 2) != 0) {
            f10 = strokeObj.stroke_width;
        }
        return strokeObj.copy(str, f10);
    }

    @e
    public final String component1() {
        return this.stroke_color;
    }

    public final float component2() {
        return this.stroke_width;
    }

    @d
    public final StrokeObj copy(@e String str, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Float(f10)}, this, changeQuickRedirect, false, 50119, new Class[]{String.class, Float.TYPE}, StrokeObj.class);
        return patchProxyResultProxy.isSupported ? (StrokeObj) patchProxyResultProxy.result : new StrokeObj(str, f10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50118, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrokeObj)) {
            return false;
        }
        StrokeObj strokeObj = (StrokeObj) obj;
        if (f0.g(strokeObj.stroke_color, this.stroke_color)) {
            return (strokeObj.stroke_width > this.stroke_width ? 1 : (strokeObj.stroke_width == this.stroke_width ? 0 : -1)) == 0;
        }
        return false;
    }

    @e
    public final String getStroke_color() {
        return this.stroke_color;
    }

    public final float getStroke_width() {
        return this.stroke_width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50122, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.stroke_color;
        return ((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.stroke_width);
    }

    public final void setStroke_color(@e String str) {
        this.stroke_color = str;
    }

    public final void setStroke_width(float f10) {
        this.stroke_width = f10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50121, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StrokeObj(stroke_color=" + this.stroke_color + ", stroke_width=" + this.stroke_width + ')';
    }
}
