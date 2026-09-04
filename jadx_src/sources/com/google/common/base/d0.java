package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Throwables.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@g
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.c
    private static final String f56725a = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.c
    @o9.d
    static final String f56726b = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @o9.c
    private static final Object f56727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @o9.c
    private static final Method f56728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @o9.c
    private static final Method f56729e;

    /* JADX INFO: compiled from: Throwables.java */
    public class a extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f56730b;

        a(Throwable th2) {
            this.f56730b = th2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int i10) {
            Method method = d0.f56728d;
            Objects.requireNonNull(method);
            Object obj = d0.f56727c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) d0.m(method, obj, this.f56730b, Integer.valueOf(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = d0.f56729e;
            Objects.requireNonNull(method);
            Object obj = d0.f56727c;
            Objects.requireNonNull(obj);
            return ((Integer) d0.m(method, obj, this.f56730b)).intValue();
        }
    }

    static {
        Object objH = h();
        f56727c = objH;
        f56728d = objH == null ? null : g();
        f56729e = objH != null ? k(objH) : null;
    }

    private d0() {
    }

    public static List<Throwable> e(Throwable th2) {
        w.E(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th2);
            if (th2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
        }
    }

    @CheckForNull
    @o9.c
    public static <X extends Throwable> X f(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(th2);
            throw e10;
        }
    }

    @CheckForNull
    @o9.c
    private static Method g() {
        return i("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @CheckForNull
    @o9.c
    private static Object h() {
        try {
            return Class.forName(f56726b, false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    @o9.c
    private static Method i(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(f56725a, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable th2) {
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                return th2;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
            th2 = cause2;
        }
    }

    @CheckForNull
    @o9.c
    private static Method k(Object obj) {
        try {
            Method methodI = i("getStackTraceDepth", Throwable.class);
            if (methodI == null) {
                return null;
            }
            methodI.invoke(obj, new Throwable());
            return methodI;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @o9.c
    public static String l(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o9.c
    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw q(e11.getCause());
        }
    }

    @o9.c
    private static List<StackTraceElement> n(Throwable th2) {
        w.E(th2);
        return new a(th2);
    }

    @o9.c
    @Deprecated
    public static List<StackTraceElement> o(Throwable th2) {
        return p() ? n(th2) : Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @o9.c
    @Deprecated
    public static boolean p() {
        return (f56728d == null || f56729e == null) ? false : true;
    }

    @s9.a
    @o9.c
    @Deprecated
    public static RuntimeException q(Throwable th2) {
        w(th2);
        throw new RuntimeException(th2);
    }

    @o9.c
    @Deprecated
    public static <X extends Throwable> void r(@CheckForNull Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            v(th2, cls);
        }
    }

    @o9.c
    @Deprecated
    public static void s(@CheckForNull Throwable th2) {
        if (th2 != null) {
            w(th2);
        }
    }

    @o9.c
    public static <X extends Throwable> void t(@CheckForNull Throwable th2, Class<X> cls) throws Throwable {
        r(th2, cls);
        s(th2);
    }

    @o9.c
    public static <X1 extends Throwable, X2 extends Throwable> void u(@CheckForNull Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable {
        w.E(cls2);
        r(th2, cls);
        t(th2, cls2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @o9.c
    public static <X extends Throwable> void v(Throwable th2, Class<X> cls) throws Throwable {
        w.E(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void w(Throwable th2) {
        w.E(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
