package com.max.hbcommon.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ResUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32548s1, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : d().getColor(i10);
    }

    public static float b(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32636w1, new Class[]{Integer.TYPE}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : d().getDimension(i10);
    }

    public static Drawable c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32526r1, new Class[]{Integer.TYPE}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : d().getDrawable(i10);
    }

    public static Resources d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32570t1, new Class[0], Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        return (activityA == null || activityA.isFinishing()) ? BaseApplication.a().getResources() : activityA.getResources();
    }

    public static String e(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32614v1, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d().getString(i10);
    }

    public static String[] f(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32592u1, new Class[]{Integer.TYPE}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : d().getStringArray(i10);
    }

    public static int g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32658x1, new Class[]{String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.hbutils.utils.a.d(str);
    }
}
