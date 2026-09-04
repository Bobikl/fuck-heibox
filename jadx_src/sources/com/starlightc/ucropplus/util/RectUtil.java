package com.starlightc.ucropplus.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import fi.u;
import kotlin.jvm.internal.f0;
import kotlin.random.Random;

/* JADX INFO: compiled from: RectUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RectUtil {

    @d
    public static final RectUtil INSTANCE = new RectUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    private RectUtil() {
    }

    @d
    public final float[] getCenterFromRect(@d RectF r10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 50972, new Class[]{RectF.class}, float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        f0.p(r10, "r");
        return new float[]{r10.centerX(), r10.centerY()};
    }

    @d
    public final float[] getCornersFromRect(@d RectF r10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 50970, new Class[]{RectF.class}, float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        f0.p(r10, "r");
        float f10 = r10.left;
        float f11 = r10.top;
        float f12 = r10.right;
        float f13 = r10.bottom;
        return new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
    }

    @d
    public final float[] getRectSidesFromCorners(@d float[] corners) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{corners}, this, changeQuickRedirect, false, 50971, new Class[]{float[].class}, float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        f0.p(corners, "corners");
        return new float[]{(float) Math.sqrt(Math.pow(corners[0] - corners[2], 2.0d) + Math.pow(corners[1] - corners[3], 2.0d)), (float) Math.sqrt(Math.pow(corners[2] - corners[4], 2.0d) + Math.pow(corners[3] - corners[5], 2.0d))};
    }

    public final void rectAddV(@e Rect rect, @e Rect rect2, int i10, int i11) {
        Object[] objArr = {rect, rect2, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50967, new Class[]{Rect.class, Rect.class, cls, cls}, Void.TYPE).isSupported || rect == null || rect2 == null) {
            return;
        }
        int i12 = rect.left;
        int i13 = rect.top;
        int iWidth = rect.right;
        int i14 = rect.bottom;
        if (rect.width() <= rect2.width()) {
            iWidth = rect2.width() + i12;
        }
        rect.set(i12, i13, iWidth, i14 + i10 + Math.max(rect2.height(), i11));
    }

    public final void rectAddV(@e RectF rectF, @e Rect rect, int i10, int i11) {
        Object[] objArr = {rectF, rect, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50968, new Class[]{RectF.class, Rect.class, cls, cls}, Void.TYPE).isSupported || rectF == null || rect == null) {
            return;
        }
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.right;
        float f12 = rectF.bottom;
        if (rectF.width() <= rect.width()) {
            fWidth = rect.width() + f10;
        }
        rectF.set(f10, f11, fWidth, f12 + i10 + u.u(rect.height(), i11));
    }

    public final void rectAddV(@e RectF rectF, @e RectF rectF2, int i10) {
        if (PatchProxy.proxy(new Object[]{rectF, rectF2, new Integer(i10)}, this, changeQuickRedirect, false, 50966, new Class[]{RectF.class, RectF.class, Integer.TYPE}, Void.TYPE).isSupported || rectF == null || rectF2 == null) {
            return;
        }
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.right;
        float f12 = rectF.bottom;
        if (rectF.width() <= rectF2.width()) {
            fWidth = rectF2.width() + f10;
        }
        rectF.set(f10, f11, fWidth, f12 + i10 + rectF2.height());
    }

    @d
    public final RectF rectRandomOffset(@d RectF rectF) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 50974, new Class[]{RectF.class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        f0.p(rectF, "rectF");
        Random.Default r10 = Random.f125033b;
        int iN = r10.n(-200, 200);
        int iN2 = r10.n(-200, 200);
        float f10 = iN;
        rectF.left += f10;
        rectF.right += f10;
        float f11 = iN2;
        rectF.top += f11;
        rectF.bottom += f11;
        return rectF;
    }

    public final void rotatePoint(@d Point p10, float f10, float f11, float f12) {
        Object[] objArr = {p10, new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50965, new Class[]{Point.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(p10, "p");
        double d10 = f12;
        float fSin = (float) Math.sin(Math.toRadians(d10));
        float fCos = (float) Math.cos(Math.toRadians(d10));
        int i10 = p10.x;
        int i11 = p10.y;
        p10.set((int) ((((i10 - f10) * fCos) + f10) - ((i11 - f11) * fSin)), (int) (f11 + ((i11 - f11) * fCos) + ((i10 - f10) * fSin)));
    }

    public final void rotateRect(@d RectF rect, float f10, float f11, float f12) {
        Object[] objArr = {rect, new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50964, new Class[]{RectF.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rect, "rect");
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        double d10 = f12;
        float fSin = (float) Math.sin(Math.toRadians(d10));
        float fCos = (float) Math.cos(Math.toRadians(d10));
        float f13 = fCenterX - f10;
        float f14 = fCenterY - f11;
        rect.offset(((f10 + (f13 * fCos)) - (f14 * fSin)) - fCenterX, ((f11 + (f14 * fCos)) + (f13 * fSin)) - fCenterY);
    }

    public final void scaleRect(@d RectF rect, float f10) {
        if (PatchProxy.proxy(new Object[]{rect, new Float(f10)}, this, changeQuickRedirect, false, 50962, new Class[]{RectF.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rect, "rect");
        float fWidth = rect.width();
        float fHeight = rect.height();
        float f11 = 2;
        float f12 = ((f10 * fWidth) - fWidth) / f11;
        float f13 = ((f10 * fHeight) - fHeight) / f11;
        rect.left -= f12;
        rect.top -= f13;
        rect.right += f12;
        rect.bottom += f13;
    }

    public final void scaleRect(@d RectF rect, float f10, float f11) {
        Object[] objArr = {rect, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50963, new Class[]{RectF.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rect, "rect");
        float fWidth = rect.width();
        float fHeight = rect.height();
        float f12 = (f10 * fWidth) - fWidth;
        float f13 = 2;
        float f14 = f12 / f13;
        float f15 = ((f11 * fHeight) - fHeight) / f13;
        rect.left -= f14;
        rect.top -= f15;
        rect.right += f14;
        rect.bottom += f15;
    }

    public final void translateRect(@d RectF rect, float f10, float f11) {
        Object[] objArr = {rect, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50969, new Class[]{RectF.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rect, "rect");
        rect.left += f10;
        rect.right += f10;
        rect.top += f11;
        rect.bottom += f11;
    }

    @d
    public final RectF trapToRect(@d float[] array) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{array}, this, changeQuickRedirect, false, 50973, new Class[]{float[].class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        f0.p(array, "array");
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i10 = 1; i10 < array.length; i10 += 2) {
            float f10 = 10;
            float fL0 = di.d.L0(array[i10 - 1] * f10) / 10.0f;
            float fL1 = di.d.L0(array[i10] * f10) / 10.0f;
            float f11 = rectF.left;
            if (fL0 < f11) {
                f11 = fL0;
            }
            rectF.left = f11;
            float f12 = rectF.top;
            if (fL1 < f12) {
                f12 = fL1;
            }
            rectF.top = f12;
            float f13 = rectF.right;
            if (fL0 <= f13) {
                fL0 = f13;
            }
            rectF.right = fL0;
            float f14 = rectF.bottom;
            if (fL1 <= f14) {
                fL1 = f14;
            }
            rectF.bottom = fL1;
        }
        rectF.sort();
        return rectF;
    }
}
