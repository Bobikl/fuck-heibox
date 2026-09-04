package com.ss.android.ttvecamera.framework;

import com.ss.android.ttvecamera.q;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TEReflectUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97508a = "TEReflectUtil";

    private static Method a(Class<? extends Object> cls, String str, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str) && d(method.getParameterTypes(), objArr)) {
                return method;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return a(superclass, str, objArr);
        }
        return null;
    }

    public static <T> T b(Object obj, String str, Object[] objArr) {
        try {
            Method methodA = a(obj.getClass(), str, objArr);
            methodA.setAccessible(true);
            return (T) methodA.invoke(obj, objArr);
        } catch (Exception e10) {
            q.u(f97508a, "couldn't invoke " + str + " on " + obj + ", " + e10);
            return null;
        }
    }

    public static <T> T c(String str, String str2, Object[] objArr) {
        try {
            Method methodA = a(Class.forName(str), str2, objArr);
            methodA.setAccessible(true);
            return (T) methodA.invoke(null, objArr);
        } catch (Exception e10) {
            q.u(f97508a, "couldn't invoke " + str2 + ", " + e10);
            return null;
        }
    }

    private static boolean d(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr == null || clsArr.length == 0) {
            return objArr == null || objArr.length == 0;
        }
        if (objArr == null || clsArr.length != objArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj != null && !clsArr[i10].isAssignableFrom(obj.getClass())) {
                return false;
            }
        }
        return true;
    }
}
