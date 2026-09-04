package org.aspectj.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: Aspects.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f137673a = new Class[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f137674b = {Object.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class[] f137675c = {Class.class};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f137676d = new Object[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f137677e = "aspectOf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f137678f = "hasAspect";

    public static <T> T a(Class<T> cls) throws NoAspectBoundException {
        try {
            return (T) j(cls).invoke(null, f137676d);
        } catch (InvocationTargetException e10) {
            throw new NoAspectBoundException(cls.getName(), e10);
        } catch (Exception e11) {
            throw new NoAspectBoundException(cls.getName(), e11);
        }
    }

    public static <T> T b(Class<T> cls, Class<?> cls2) throws NoAspectBoundException {
        try {
            return (T) h(cls).invoke(null, cls2);
        } catch (InvocationTargetException e10) {
            throw new NoAspectBoundException(cls.getName(), e10);
        } catch (Exception e11) {
            throw new NoAspectBoundException(cls.getName(), e11);
        }
    }

    public static <T> T c(Class<T> cls, Object obj) throws NoAspectBoundException {
        try {
            return (T) f(cls).invoke(null, obj);
        } catch (InvocationTargetException e10) {
            throw new NoAspectBoundException(cls.getName(), e10);
        } catch (Exception e11) {
            throw new NoAspectBoundException(cls.getName(), e11);
        }
    }

    private static Method d(Method method, Class<?> cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName() + ".aspectOf(..) is not accessible public static");
    }

    private static Method e(Method method, Class cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName() + ".hasAspect(..) is not accessible public static");
    }

    private static Method f(Class<?> cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f137677e, f137674b), cls);
    }

    private static Method g(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f137678f, f137674b), cls);
    }

    private static Method h(Class<?> cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f137677e, f137675c), cls);
    }

    private static Method i(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f137678f, f137675c), cls);
    }

    private static Method j(Class<?> cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f137677e, f137673a), cls);
    }

    private static Method k(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f137678f, f137673a), cls);
    }

    public static boolean l(Class<?> cls) throws NoAspectBoundException {
        try {
            return ((Boolean) k(cls).invoke(null, f137676d)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean m(Class<?> cls, Class<?> cls2) throws NoAspectBoundException {
        try {
            return ((Boolean) i(cls).invoke(null, cls2)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean n(Class<?> cls, Object obj) throws NoAspectBoundException {
        try {
            return ((Boolean) g(cls).invoke(null, obj)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
