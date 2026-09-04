package com.taobao.aranger.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectUtils {
    private static Method sGetDeclaredMethod;

    static {
        try {
            sGetDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }

    public static Method getHideMethod(Class<?> cls, String str, Class... clsArr) throws IllegalAccessException, NullPointerException, InvocationTargetException {
        Method method = sGetDeclaredMethod;
        if (method != null) {
            return (Method) method.invoke(cls, str, clsArr);
        }
        throw new NullPointerException("sGetDeclaredMethod is null");
    }
}
