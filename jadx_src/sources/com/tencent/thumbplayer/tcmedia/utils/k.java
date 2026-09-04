package com.tencent.thumbplayer.tcmedia.utils;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f103162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f103163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f103164c;

    static {
        try {
            f103162a = Class.class.getDeclaredMethod("forName", String.class);
            f103163b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f103164c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (Throwable th2) {
            TPLogUtil.e("TPPrimaryReflectUtil", th2.getMessage());
        }
    }

    public static Object a(Object obj, String str, String str2, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(str, str2, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable th2) {
            TPLogUtil.e("TPPrimaryReflectUtil", th2.getMessage());
            return null;
        }
    }

    private static Method a(String str, String str2, Class[] clsArr) {
        Method method = null;
        if (!a()) {
            return null;
        }
        try {
            Method method2 = (Method) f103163b.invoke((Class) f103162a.invoke(null, str), str2, clsArr);
            try {
                method2.setAccessible(true);
                return method2;
            } catch (Throwable th2) {
                th = th2;
                method = method2;
                TPLogUtil.e("TPPrimaryReflectUtil", th.getMessage());
                return method;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean a() {
        return (f103162a == null || f103163b == null || f103164c == null) ? false : true;
    }
}
