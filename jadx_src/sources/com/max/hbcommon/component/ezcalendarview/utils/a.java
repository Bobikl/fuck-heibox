package com.max.hbcommon.component.ezcalendarview.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Random;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f67687a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f67688b = 0.017453292f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f67689c = 57.295784f;
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    public static float A(int i10, int i11, int i12) {
        if (i10 < i11) {
            if (i10 >= i12) {
                i10 = i12;
            }
            return i10;
        }
        if (i11 >= i12) {
            i11 = i12;
        }
        return i11;
    }

    public static float B(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    public static float C(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.or, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.pow(f10, f11);
    }

    public static float D(float f10) {
        return f10 * 0.017453292f;
    }

    public static float E(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Ar, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : f67687a.nextFloat() * f10;
    }

    public static float F(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Br, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return f10 >= f11 ? f10 : (f67687a.nextFloat() * (f11 - f10)) + f10;
    }

    public static int G(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.yr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) (f67687a.nextFloat() * i10);
    }

    public static int H(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.zr, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return i10 >= i11 ? i10 : (int) ((f67687a.nextFloat() * (i11 - i10)) + i10);
    }

    public static void I(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.d.Cr, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f67687a.setSeed(j10);
    }

    public static float J(float f10) {
        return f10 * f10;
    }

    public static float K(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.xr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.tan(f10);
    }

    public static float a(float f10) {
        return f10 > 0.0f ? f10 : -f10;
    }

    public static float b(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.tr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.acos(f10);
    }

    public static float c(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.ur, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.asin(f10);
    }

    public static float d(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.vr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.atan(f10);
    }

    public static float e(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.wr, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.atan2(f10, f11);
    }

    public static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int g(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static long h(long j10, long j11, long j12) {
        if (j10 < j11) {
            return j11;
        }
        return j10 > j12 ? j12 : j10;
    }

    public static float i(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    public static float j(float f10) {
        return f10 * f67689c;
    }

    public static float k(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.pr, new Class[]{cls, cls, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float l(float f10, float f11, float f12, float f13, float f14, float f15) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.qr, new Class[]{cls, cls, cls, cls, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        return (float) Math.sqrt((f16 * f16) + (f17 * f17) + (f18 * f18));
    }

    public static float m(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public static float n(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.nr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.exp(f10);
    }

    public static float o(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public static float p(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.mr, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.log(f10);
    }

    public static float q(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.rr, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.hypot(f10, f11);
    }

    public static float r(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.sr, new Class[]{cls, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    public static float s(float f10, float f11, float f12, float f13, float f14) {
        return f12 + ((f12 - f13) * ((f14 - f10) / (f11 - f10)));
    }

    public static float t(float f10, float f11) {
        return f10 > f11 ? f10 : f11;
    }

    public static float u(float f10, float f11, float f12) {
        if (f10 > f11) {
            if (f10 > f12) {
                return f10;
            }
        } else if (f11 > f12) {
            return f11;
        }
        return f12;
    }

    public static float v(int i10, int i11) {
        return i10 > i11 ? i10 : i11;
    }

    public static float w(int i10, int i11, int i12) {
        if (i10 > i11) {
            if (i10 <= i12) {
                i10 = i12;
            }
            return i10;
        }
        if (i11 <= i12) {
            i11 = i12;
        }
        return i11;
    }

    public static float x(float f10, float f11) {
        return f10 < f11 ? f10 : f11;
    }

    public static float y(float f10, float f11, float f12) {
        if (f10 < f11) {
            if (f10 < f12) {
                return f10;
            }
        } else if (f11 < f12) {
            return f11;
        }
        return f12;
    }

    public static float z(int i10, int i11) {
        return i10 < i11 ? i10 : i11;
    }
}
