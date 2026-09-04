package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125896a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static C1147a f125897b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
    public static final class C1147a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final Method f125898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Method f125899b;

        public C1147a(@dl.e Method method, @dl.e Method method2) {
            this.f125898a = method;
            this.f125899b = method2;
        }

        @dl.e
        public final Method a() {
            return this.f125899b;
        }

        @dl.e
        public final Method b() {
            return this.f125898a;
        }
    }

    private a() {
    }

    private final C1147a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C1147a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C1147a(null, null);
        }
    }

    private final C1147a b(Object obj) {
        C1147a c1147a = f125897b;
        if (c1147a != null) {
            return c1147a;
        }
        C1147a c1147aA = a(obj);
        f125897b = c1147aA;
        return c1147aA;
    }

    @dl.e
    public final Method c(@dl.d Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        f0.p(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    @dl.e
    public final Class<?> d(@dl.d Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        f0.p(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
