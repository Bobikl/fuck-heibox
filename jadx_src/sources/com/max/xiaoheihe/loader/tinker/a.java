package com.max.xiaoheihe.loader.tinker;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: ShareReflectUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (PatchProxy.proxy(new Object[]{obj, str, objArr}, null, changeQuickRedirect, true, 22122, new Class[]{Object.class, String.class, Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        Field fieldD = d(obj, str);
        Object[] objArr2 = (Object[]) fieldD.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        fieldD.set(obj, objArr3);
    }

    public static Constructor<?> b(Object obj, Class<?>... clsArr) throws NoSuchMethodException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, clsArr}, null, changeQuickRedirect, true, 22121, new Class[]{Object.class, Class[].class}, Constructor.class);
        if (patchProxyResultProxy.isSupported) {
            return (Constructor) patchProxyResultProxy.result;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Constructor<?> declaredConstructor = superclass.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Constructor with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static Field c(Class<?> cls, String str) throws NoSuchFieldException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, str}, null, changeQuickRedirect, true, 22118, new Class[]{Class.class, String.class}, Field.class);
        if (patchProxyResultProxy.isSupported) {
            return (Field) patchProxyResultProxy.result;
        }
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    public static Field d(Object obj, String str) throws NoSuchFieldException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, str}, null, changeQuickRedirect, true, 22117, new Class[]{Object.class, String.class}, Field.class);
        if (patchProxyResultProxy.isSupported) {
            return (Field) patchProxyResultProxy.result;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method e(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, str, clsArr}, null, changeQuickRedirect, true, 22120, new Class[]{Class.class, String.class, Class[].class}, Method.class);
        if (patchProxyResultProxy.isSupported) {
            return (Method) patchProxyResultProxy.result;
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    public static Method f(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, str, clsArr}, null, changeQuickRedirect, true, 22119, new Class[]{Object.class, String.class, Class[].class}, Method.class);
        if (patchProxyResultProxy.isSupported) {
            return (Method) patchProxyResultProxy.result;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static Object g(Context context, Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, cls}, null, changeQuickRedirect, true, 22124, new Class[]{Context.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object objInvoke = method.invoke(null, new Object[0]);
        if (objInvoke != null || context == null) {
            return objInvoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static int h(Class<?> cls, String str, int i10) {
        Object[] objArr = {cls, str, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 22125, new Class[]{Class.class, String.class, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            return c(cls, str).getInt(null);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static void i(Object obj, String str, int i10) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!PatchProxy.proxy(new Object[]{obj, str, new Integer(i10)}, null, changeQuickRedirect, true, 22123, new Class[]{Object.class, String.class, Integer.TYPE}, Void.TYPE).isSupported && i10 > 0) {
            Field fieldD = d(obj, str);
            Object[] objArr = (Object[]) fieldD.get(obj);
            int length = objArr.length - i10;
            if (length <= 0) {
                return;
            }
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
            System.arraycopy(objArr, i10, objArr2, 0, length);
            fieldD.set(obj, objArr2);
        }
    }
}
