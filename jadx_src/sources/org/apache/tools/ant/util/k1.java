package org.apache.tools.ant.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ReflectUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class k1 {
    private k1() {
    }

    public static <T> T a(Object obj, String str) throws BuildException {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return (T) declaredField.get(obj);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static <T> T b(Object obj, String str) {
        try {
            return (T) obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static <T> T c(Object obj, String str, Class<?> cls, Object obj2) {
        try {
            return (T) obj.getClass().getMethod(str, cls).invoke(obj, obj2);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static <T> T d(Object obj, String str, Class<?> cls, Object obj2, Class<?> cls2, Object obj3) {
        try {
            return (T) obj.getClass().getMethod(str, cls, cls2).invoke(obj, obj2, obj3);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str) {
        try {
            return (T) ((Class) obj).getMethod(str, new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static <T> T f(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            return cls.getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e10) {
            h(e10);
            return null;
        }
    }

    public static boolean g(Object obj, String str) throws BuildException {
        try {
            return Stream.of((Object[]) obj.getClass().getMethods()).map(new Function() { // from class: org.apache.tools.ant.util.j1
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ((Method) obj2).getName();
                }
            }).anyMatch(Predicate.isEqual(str));
        } catch (Exception e10) {
            throw i(e10);
        }
    }

    public static void h(Exception exc) throws BuildException {
        throw i(exc);
    }

    public static BuildException i(Exception exc) {
        if (!(exc instanceof InvocationTargetException)) {
            return new BuildException(exc);
        }
        Throwable targetException = ((InvocationTargetException) exc).getTargetException();
        return targetException instanceof BuildException ? (BuildException) targetException : new BuildException(targetException);
    }
}
