package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: InsetObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class InsetObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public InsetObj(float f10, float f11, float f12, float f13) {
        this.top = f10;
        this.bottom = f11;
        this.left = f12;
        this.right = f13;
    }

    public static /* synthetic */ InsetObj copy$default(InsetObj insetObj, float f10, float f11, float f12, float f13, int i10, Object obj) {
        float f14 = f10;
        float f15 = f11;
        float f16 = f12;
        float f17 = f13;
        Object[] objArr = {insetObj, new Float(f14), new Float(f15), new Float(f16), new Float(f17), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.sM, new Class[]{InsetObj.class, cls, cls, cls, cls, Integer.TYPE, Object.class}, InsetObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (InsetObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            f14 = insetObj.top;
        }
        if ((i10 & 2) != 0) {
            f15 = insetObj.bottom;
        }
        if ((i10 & 4) != 0) {
            f16 = insetObj.left;
        }
        if ((i10 & 8) != 0) {
            f17 = insetObj.right;
        }
        return insetObj.copy(f14, f15, f16, f17);
    }

    public final float component1() {
        return this.top;
    }

    public final float component2() {
        return this.bottom;
    }

    public final float component3() {
        return this.left;
    }

    public final float component4() {
        return this.right;
    }

    @d
    public final InsetObj copy(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.rM, new Class[]{cls, cls, cls, cls}, InsetObj.class);
        return patchProxyResultProxy.isSupported ? (InsetObj) patchProxyResultProxy.result : new InsetObj(f10, f11, f12, f13);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.vM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetObj)) {
            return false;
        }
        InsetObj insetObj = (InsetObj) obj;
        return Float.compare(this.top, insetObj.top) == 0 && Float.compare(this.bottom, insetObj.bottom) == 0 && Float.compare(this.left, insetObj.left) == 0 && Float.compare(this.right, insetObj.right) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.uM, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((Float.floatToIntBits(this.top) * 31) + Float.floatToIntBits(this.bottom)) * 31) + Float.floatToIntBits(this.left)) * 31) + Float.floatToIntBits(this.right);
    }

    public final void setBottom(float f10) {
        this.bottom = f10;
    }

    public final void setLeft(float f10) {
        this.left = f10;
    }

    public final void setRight(float f10) {
        this.right = f10;
    }

    public final void setTop(float f10) {
        this.top = f10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.tM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "InsetObj(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ')';
    }
}
