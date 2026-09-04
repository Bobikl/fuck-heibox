package com.starlightc.ucropplus.model.puzzle;

import android.content.Context;
import android.graphics.RectF;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBRectF.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class HBRectF implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public HBRectF() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public HBRectF(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public /* synthetic */ HBRectF(float f10, float f11, float f12, float f13, int i10, u uVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    public static /* synthetic */ HBRectF copy$default(HBRectF hBRectF, float f10, float f11, float f12, float f13, int i10, Object obj) {
        float f14 = f10;
        float f15 = f11;
        float f16 = f12;
        float f17 = f13;
        Object[] objArr = {hBRectF, new Float(f14), new Float(f15), new Float(f16), new Float(f17), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50176, new Class[]{HBRectF.class, cls, cls, cls, cls, Integer.TYPE, Object.class}, HBRectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBRectF) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            f14 = hBRectF.left;
        }
        if ((i10 & 2) != 0) {
            f15 = hBRectF.top;
        }
        if ((i10 & 4) != 0) {
            f16 = hBRectF.right;
        }
        if ((i10 & 8) != 0) {
            f17 = hBRectF.bottom;
        }
        return hBRectF.copy(f14, f15, f16, f17);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    @d
    public final HBRectF copy(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50175, new Class[]{cls, cls, cls, cls}, HBRectF.class);
        return patchProxyResultProxy.isSupported ? (HBRectF) patchProxyResultProxy.result : new HBRectF(f10, f11, f12, f13);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HBRectF)) {
            return false;
        }
        HBRectF hBRectF = (HBRectF) obj;
        if (!(hBRectF.left == this.left)) {
            return false;
        }
        if (!(hBRectF.top == this.top)) {
            return false;
        }
        if (hBRectF.right == this.right) {
            return (hBRectF.bottom > this.bottom ? 1 : (hBRectF.bottom == this.bottom ? 0 : -1)) == 0;
        }
        return false;
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50178, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom);
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
    public final RectF toPxRectF(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50174, new Class[]{Context.class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        float f10 = 375;
        return new RectF((this.left * ViewUtils.L(context)) / f10, (this.top * ViewUtils.L(context)) / f10, (this.right * ViewUtils.L(context)) / f10, (this.bottom * ViewUtils.L(context)) / f10);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50177, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HBRectF(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
