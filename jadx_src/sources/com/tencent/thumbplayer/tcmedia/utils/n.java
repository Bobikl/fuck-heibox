package com.tencent.thumbplayer.tcmedia.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<a> f103167a = new ArrayList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f103168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<Integer, Method> f103169b;

        private a() {
        }
    }

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        boolean a() default false;

        boolean b() default false;

        boolean c() default false;
    }

    public static Method a(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> mapB = b(cls);
        if (mapB == null) {
            return null;
        }
        Iterator<Map.Entry<Integer, Method>> it = mapB.entrySet().iterator();
        while (it.hasNext()) {
            Method value = it.next().getValue();
            if (value != null && str.equals(value.getName()) && a(value, objArr)) {
                return value;
            }
        }
        return null;
    }

    private static boolean a(Class<?> cls) {
        String str;
        for (a aVar : f103167a) {
            if (aVar != null && (str = aVar.f103168a) != null && str.equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean a(Class<?> cls, int i10) {
        if (a(cls)) {
            return true;
        }
        HashMap map = new HashMap();
        try {
            for (Method method : cls.getMethods()) {
                if (((b) method.getAnnotation(b.class)) != null) {
                    map.put(Integer.valueOf(i10), method);
                    i10++;
                }
            }
            a aVar = new a();
            aVar.f103168a = cls.getName();
            aVar.f103169b = map;
            f103167a.add(aVar);
            return true;
        } catch (Exception unused) {
            map.clear();
            return false;
        }
    }

    private static boolean a(Class<?> cls, Object obj) {
        if (!cls.isPrimitive()) {
            return false;
        }
        try {
            return obj.getClass().getField("TYPE").get(null).equals(cls);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (objArr == null || objArr.length == 0) {
            return parameterTypes.length == 0;
        }
        if (parameterTypes.length != objArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            Class<?> cls = parameterTypes[i10];
            Object obj = objArr[i10];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(obj.getClass()) && !a(cls, objArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public static int b(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> mapB = b(cls);
        if (mapB == null) {
            return -1;
        }
        for (Map.Entry<Integer, Method> entry : mapB.entrySet()) {
            Method value = entry.getValue();
            if (value != null && str.equals(value.getName()) && a(value, objArr)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public static String b(Class<?> cls, int i10) {
        Method method;
        Map<Integer, Method> mapB = b(cls);
        return (mapB == null || (method = mapB.get(Integer.valueOf(i10))) == null) ? "unknown" : method.getName();
    }

    private static Map<Integer, Method> b(Class<?> cls) {
        String str;
        for (a aVar : f103167a) {
            if (aVar != null && (str = aVar.f103168a) != null && str.equals(cls.getName())) {
                return aVar.f103169b;
            }
        }
        return null;
    }

    public static boolean c(Class<?> cls, int i10) {
        Method method;
        Map<Integer, Method> mapB = b(cls);
        if (mapB != null && (method = mapB.get(Integer.valueOf(i10))) != null) {
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                return true;
            }
            b bVar = (b) method.getAnnotation(b.class);
            if (bVar != null) {
                return bVar.a();
            }
        }
        return false;
    }

    public static boolean d(Class<?> cls, int i10) {
        Method method;
        b bVar;
        Map<Integer, Method> mapB = b(cls);
        if (mapB == null || (method = mapB.get(Integer.valueOf(i10))) == null || (bVar = (b) method.getAnnotation(b.class)) == null) {
            return false;
        }
        return bVar.b();
    }

    public static boolean e(Class<?> cls, int i10) {
        Method method;
        b bVar;
        Map<Integer, Method> mapB = b(cls);
        if (mapB == null || (method = mapB.get(Integer.valueOf(i10))) == null || (bVar = (b) method.getAnnotation(b.class)) == null) {
            return false;
        }
        return bVar.c();
    }

    public static Method f(Class<?> cls, int i10) {
        Map<Integer, Method> mapB = b(cls);
        if (mapB == null) {
            return null;
        }
        return mapB.get(Integer.valueOf(i10));
    }
}
