package com.max.hbcommon.component.ezcalendarview.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31861k, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b(null, f10);
    }

    public static int b(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31878l, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * (c(context).getDisplayMetrics().densityDpi / 160.0f)) + 0.5f);
    }

    public static Resources c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.f31844j, new Class[]{Context.class}, Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        return context == null ? Resources.getSystem() : context.getResources();
    }

    public static Drawable d(int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f32048v, new Class[]{Integer.TYPE, Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public static int e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.f32014t, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int f(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.f31997s, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static Drawable g(Context context, int i10, float f10, float f11, float f12) {
        Object[] objArr = {context, new Integer(i10), new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f32031u, new Class[]{Context.class, Integer.TYPE, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new b(i10, i10, f10, f11, f12);
    }

    public static float h(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f31895m, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : i(null, f10);
    }

    public static float i(Context context, float f10) {
        Object[] objArr = {context, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f31912n, new Class[]{Context.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (f10 * 160.0f) / c(context).getDisplayMetrics().densityDpi;
    }

    public static float j(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f31963q, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : k(null, f10);
    }

    public static float k(Context context, float f10) {
        Object[] objArr = {context, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f31980r, new Class[]{Context.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : f10 / c(context).getDisplayMetrics().scaledDensity;
    }

    public static int l(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31929o, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : m(null, f10);
    }

    public static int m(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31946p, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * c(context).getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
