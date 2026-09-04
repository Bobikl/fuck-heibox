package com.tencent.qimei.l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RefInvoke.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static Object a(String str, Object obj, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            return null;
        }
    }

    public static Object a(String str, String str2, Object obj, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object a(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
