package com.max.component;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ComponentUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Map<String, Method> map, Method[] methodArr) {
        if (PatchProxy.proxy(new Object[]{map, methodArr}, null, changeQuickRedirect, true, 1200, new Class[]{Map.class, Method[].class}, Void.TYPE).isSupported) {
            return;
        }
        for (Method method : methodArr) {
            if (!method.isBridge()) {
                String strE = e(method);
                if (!map.containsKey(strE)) {
                    if (b()) {
                        try {
                            method.setAccessible(true);
                        } catch (Exception unused) {
                        }
                    }
                    map.put(strE, method);
                }
            }
        }
    }

    public static boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1202, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new ReflectPermission("suppressAccessChecks"));
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static HashMap<String, Method> c(Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.b.f30595dk, new Class[]{Class.class}, HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, Method> map = new HashMap<>();
        while (cls != null && cls != Object.class) {
            a(map, cls.getDeclaredMethods());
            for (Class<?> cls2 : cls.getInterfaces()) {
                a(map, cls2.getMethods());
            }
            cls = cls.getSuperclass();
        }
        return map;
    }

    public static HashMap<String, Method> d(Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.b.f30571ck, new Class[]{Class.class}, HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, Method> mapC = c(cls);
        HashMap<String, Method> map = new HashMap<>();
        for (String str : mapC.keySet()) {
            Method method = mapC.get(str);
            if (method != null && ((qa.a) method.getAnnotation(qa.a.class)) != null) {
                map.put(str, method);
            }
        }
        return map;
    }

    public static String e(Method method) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{method}, null, changeQuickRedirect, true, 1201, new Class[]{Method.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        Class<?> returnType = method.getReturnType();
        if (returnType != null) {
            sb2.append(returnType.getName());
            sb2.append('#');
        }
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 == 0) {
                sb2.append(':');
            } else {
                sb2.append(',');
            }
            sb2.append(parameterTypes[i10].getName());
        }
        return sb2.toString();
    }

    public static void f(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.b.f30548bk, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) HBComponentActivity.class));
    }
}
