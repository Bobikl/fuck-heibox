package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f125903a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static a f125904b;

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final Method f125905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Method f125906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final Method f125907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final Method f125908d;

        public a(@dl.e Method method, @dl.e Method method2, @dl.e Method method3, @dl.e Method method4) {
            this.f125905a = method;
            this.f125906b = method2;
            this.f125907c = method3;
            this.f125908d = method4;
        }

        @dl.e
        public final Method a() {
            return this.f125906b;
        }

        @dl.e
        public final Method b() {
            return this.f125908d;
        }

        @dl.e
        public final Method c() {
            return this.f125907c;
        }

        @dl.e
        public final Method d() {
            return this.f125905a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f125904b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f125904b = aVarA;
        return aVarA;
    }

    @dl.e
    public final Class<?>[] c(@dl.d Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        f0.p(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    @dl.e
    public final Object[] d(@dl.d Class<?> clazz) {
        f0.p(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, new Object[0]);
    }

    @dl.e
    public final Boolean e(@dl.d Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        f0.p(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    @dl.e
    public final Boolean f(@dl.d Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        f0.p(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
