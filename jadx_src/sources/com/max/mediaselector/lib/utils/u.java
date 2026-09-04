package com.max.mediaselector.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ValueOf.java */
/* JADX INFO: loaded from: classes2.dex */
public class u {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, T t10) {
        return obj == 0 ? t10 : obj;
    }

    public static boolean b(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.f34653ca, new Class[]{Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(obj, false);
    }

    public static boolean c(Object obj, boolean z10) {
        Object[] objArr = {obj, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34677da, new Class[]{Object.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        try {
            return !"false".equals(obj.toString().trim().trim());
        } catch (Exception unused) {
            return z10;
        }
    }

    public static double d(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.U9, new Class[]{Object.class}, Double.TYPE);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : e(obj, 0);
    }

    public static double e(Object obj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.V9, new Class[]{Object.class, Integer.TYPE}, Double.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        if (obj == null) {
            return i10;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static float f(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.Z9, new Class[]{Object.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : g(obj, 0L);
    }

    public static float g(Object obj, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.Y9, new Class[]{Object.class, Long.TYPE}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (obj == null) {
            return j10;
        }
        try {
            return Float.parseFloat(obj.toString().trim());
        } catch (Exception unused) {
            return j10;
        }
    }

    public static int h(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.f34630ba, new Class[]{Object.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : i(obj, 0);
    }

    public static int i(Object obj, int i10) {
        Object[] objArr = {obj, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34607aa, new Class[]{Object.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (obj == null) {
            return i10;
        }
        try {
            String strTrim = obj.toString().trim();
            return strTrim.contains(".") ? Integer.parseInt(strTrim.substring(0, strTrim.lastIndexOf("."))) : Integer.parseInt(strTrim);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static long j(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.X9, new Class[]{Object.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : k(obj, 0L);
    }

    public static long k(Object obj, long j10) {
        Object[] objArr = {obj, new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.W9, new Class[]{Object.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (obj == null) {
            return j10;
        }
        try {
            String strTrim = obj.toString().trim();
            return strTrim.contains(".") ? Long.parseLong(strTrim.substring(0, strTrim.lastIndexOf("."))) : Long.parseLong(strTrim);
        } catch (Exception unused) {
            return j10;
        }
    }

    public static String l(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.m.T9, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
