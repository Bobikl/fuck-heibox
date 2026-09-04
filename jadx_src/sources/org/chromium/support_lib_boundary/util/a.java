package org.chromium.support_lib_boundary.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: BoundaryInterfaceReflectionUtil.java */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanTargetApiAnnotation"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f137778a = false;

    /* JADX INFO: renamed from: org.chromium.support_lib_boundary.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BoundaryInterfaceReflectionUtil.java */
    @TargetApi(19)
    public static class C1240a implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f137779b;

        public C1240a(@n0 Object obj) {
            this.f137779b = obj;
        }

        @n0
        public Object a() {
            return this.f137779b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return a.f(method, this.f137779b.getClass().getClassLoader()).invoke(this.f137779b, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    @p0
    public static <T> T a(@n0 Class<T> cls, @p0 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (i()) {
                if (collection.contains(str + b.f137780a)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean c(String[] strArr, String str) {
        return b(Arrays.asList(strArr), str);
    }

    @TargetApi(19)
    @p0
    public static InvocationHandler d(@p0 Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1240a(obj);
    }

    @TargetApi(19)
    @p0
    public static InvocationHandler[] e(@p0 Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i10 = 0; i10 < length; i10++) {
            invocationHandlerArr[i10] = d(objArr[i10]);
        }
        return invocationHandlerArr;
    }

    public static Method f(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @p0
    public static Object g(@p0 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C1240a) invocationHandler).a();
    }

    public static boolean h(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static boolean i() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
