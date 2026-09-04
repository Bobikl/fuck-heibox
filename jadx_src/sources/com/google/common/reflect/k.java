package com.google.common.reflect;

import com.google.common.base.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public final class k {
    private k() {
    }

    public static String a(Class<?> cls) {
        return b(cls.getName());
    }

    public static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? "" : str.substring(0, iLastIndexOf);
    }

    public static void c(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static <T> T d(Class<T> cls, InvocationHandler invocationHandler) {
        w.E(invocationHandler);
        w.u(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
