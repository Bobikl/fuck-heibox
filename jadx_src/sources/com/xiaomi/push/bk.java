package com.xiaomi.push;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f106874a;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f106875a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public final T f215a;
    }

    static {
        HashMap map = new HashMap();
        f106874a = map;
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

    public static <T> T a(Class<? extends Object> cls, Object obj, String str) throws NoSuchFieldException {
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static <T> T a(Class<? extends Object> cls, String str) {
        try {
            return (T) a(cls, (Object) null, str);
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Meet exception when call getStaticField '");
            sb2.append(str);
            sb2.append("' in ");
            sb2.append(cls != null ? cls.getSimpleName() : "");
            sb2.append(", ");
            sb2.append(e10);
            Log.w("JavaCalls", sb2.toString());
            return null;
        }
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return (T) a(cls, str, a(objArr)).invoke(null, m185a(objArr));
    }

    public static <T> T a(Object obj, String str) {
        try {
            return (T) a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call getField '" + str + "' in " + obj + ", " + e10);
            return null;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) b(obj, str, objArr);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str + "' in " + obj + ", " + e10);
            return null;
        }
    }

    public static <T> T a(String str, String str2) {
        try {
            return (T) a((Class<? extends Object>) C1339r.a(null, str), (Object) null, str2);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call getStaticField '" + str2 + "' in " + str + ", " + e10);
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(C1339r.a(null, str), str2, objArr);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str + ", " + e10);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodA = a(cls.getDeclaredMethods(), str, clsArr);
        if (methodA != null) {
            methodA.setAccessible(true);
            return methodA;
        }
        if (cls.getSuperclass() != null) {
            return a((Class<?>) cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public static void a(Object obj, String str, Object obj2) {
        try {
            b(obj, str, obj2);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call setField '" + str + "' in " + obj + ", " + e10);
        }
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
            Class<?> cls = clsArr2[i10];
            if (cls != null && !clsArr[i10].isAssignableFrom(cls)) {
                Map<Class<?>, Class<?>> map = f106874a;
                if (!map.containsKey(clsArr[i10]) || !map.get(clsArr[i10]).equals(map.get(clsArr2[i10]))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof a)) {
                clsArr[i10] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i10] = ((a) obj).f106875a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Object[] m185a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i10] = obj;
            } else {
                objArr2[i10] = ((a) obj).f215a;
            }
        }
        return objArr2;
    }

    public static <T> T b(Object obj, String str, Object... objArr) {
        return (T) a(obj.getClass(), str, a(objArr)).invoke(obj, m185a(objArr));
    }

    public static void b(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
