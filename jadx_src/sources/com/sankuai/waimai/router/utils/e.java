package com.sankuai.waimai.router.utils;

import androidx.annotation.n0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* JADX INFO: compiled from: ProviderPool.java */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Class, Method> f96570a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f96571b = Object.class.getDeclaredMethods()[0];

    public static <T> T a(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        Method methodC = c(cls);
        if (methodC == f96571b) {
            com.sankuai.waimai.router.core.c.f("[ProviderPool] provider not found: %s", cls);
            return null;
        }
        com.sankuai.waimai.router.core.c.f("[ProviderPool] provider found: %s", methodC);
        try {
            return (T) methodC.invoke(null, new Object[0]);
        } catch (Exception e10) {
            com.sankuai.waimai.router.core.c.e(e10);
            return null;
        }
    }

    @n0
    private static Method b(@n0 Class cls) {
        com.sankuai.waimai.router.core.c.f("[ProviderPool] >>> find provider with reflection: %s", cls);
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getAnnotation(ig.b.class) != null) {
                if (Modifier.isStatic(method.getModifiers()) && method.getReturnType() == cls && f.c(method.getParameterTypes())) {
                    return method;
                }
                com.sankuai.waimai.router.core.c.d("[ProviderPool] RouterProvider注解的应该是静态无参数方法，且返回值类型为当前Class", new Object[0]);
                return f96571b;
            }
        }
        return f96571b;
    }

    @n0
    private static <T> Method c(@n0 Class<T> cls) {
        HashMap<Class, Method> map = f96570a;
        Method methodB = map.get(cls);
        if (methodB == null) {
            synchronized (map) {
                methodB = map.get(cls);
                if (methodB == null) {
                    methodB = b(cls);
                    map.put(cls, methodB);
                }
            }
        }
        return methodB;
    }
}
