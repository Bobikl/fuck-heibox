package com.alipay.zoloz.mobile.common.rpc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ReflectUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static boolean a(Object obj, String str) {
        return obj != null && obj.getClass().getName().equals(str);
    }

    public static Object b(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static Object c(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object d(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object e(String str, String str2) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object f(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
