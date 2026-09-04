package com.umeng.socialize.a;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: UMReflectUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class k {
    public static Class<?> a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = k.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, k.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(String str, String str2, Object obj) {
        return a(a(str, str2), obj);
    }

    public static Object a(String str, String str2, Class<?>[] clsArr, Object obj, Object[] objArr) {
        Method methodA = a(str, str2, clsArr);
        if (methodA != null) {
            return a(methodA, obj, objArr);
        }
        return null;
    }

    public static Object a(String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> clsA = a(str);
        if (clsA == null) {
            return null;
        }
        try {
            return clsA.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable th2) {
            m.d("", "newInstance failed, cls:", str, " msg:", th2.getMessage());
            return null;
        }
    }

    public static Object a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Throwable th2) {
            m.d("", "getFiledValue failed:", th2.getMessage());
            return null;
        }
    }

    public static Object a(Method method, Object obj, Object[] objArr) {
        if (method == null) {
            return null;
        }
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th2) {
            m.d("", "invoke failed:", th2.getMessage());
            return null;
        }
    }

    public static Field a(String str, String str2) {
        Class<?> clsA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (clsA = a(str)) == null) {
            return null;
        }
        try {
            return clsA.getField(str2);
        } catch (Throwable th2) {
            m.d("", "getFiled failed, cls:", str, " filed:", str2, " msg:", th2.getMessage());
            return null;
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        Class<?> clsA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (clsA = a(str)) == null) {
            return null;
        }
        try {
            return clsA.getDeclaredMethod(str2, clsArr);
        } catch (Throwable th2) {
            m.d("", "getMethod failed, cls:", str, " method:", str2, " msg:", th2.getMessage());
            return null;
        }
    }
}
