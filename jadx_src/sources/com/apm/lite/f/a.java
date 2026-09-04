package com.apm.lite.f;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f39945a;

    /* JADX INFO: renamed from: com.apm.lite.f.a$a, reason: collision with other inner class name */
    public static class C0308a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f39946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f39947b;
    }

    static {
        HashMap map = new HashMap();
        f39945a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return (T) c(cls, str, f(objArr)).invoke(null, g(objArr));
    }

    public static <T> T b(String str, String str2, Object... objArr) {
        try {
            return (T) a(Class.forName(str), str2, objArr);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e10);
            return null;
        }
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodD = d(cls.getDeclaredMethods(), str, clsArr);
        if (methodD != null) {
            methodD.setAccessible(true);
            return methodD;
        }
        if (cls.getSuperclass() != null) {
            return c(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    private static Method d(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && e(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private static boolean e(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (!clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                Map<Class<?>, Class<?>> map = f39945a;
                if (!map.containsKey(clsArr[i10]) || !map.get(clsArr[i10]).equals(map.get(clsArr2[i10]))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] f(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof C0308a)) {
                clsArr[i10] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i10] = ((C0308a) obj).f39946a;
            }
        }
        return clsArr;
    }

    private static Object[] g(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof C0308a)) {
                objArr2[i10] = obj;
            } else {
                objArr2[i10] = ((C0308a) obj).f39947b;
            }
        }
        return objArr2;
    }
}
