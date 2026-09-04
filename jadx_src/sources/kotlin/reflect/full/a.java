package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KAnnotatedElements.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125063a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static C1133a f125064b;

    /* JADX INFO: renamed from: kotlin.reflect.full.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KAnnotatedElements.kt */
    public static final class C1133a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final Class<? extends Annotation> f125065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Method f125066b;

        public C1133a(@dl.e Class<? extends Annotation> cls, @dl.e Method method) {
            this.f125065a = cls;
            this.f125066b = method;
        }

        @dl.e
        public final Class<? extends Annotation> a() {
            return this.f125065a;
        }

        @dl.e
        public final Method b() {
            return this.f125066b;
        }
    }

    private a() {
    }

    private final C1133a a() {
        try {
            Class<?> cls = Class.forName("java.lang.annotation.Repeatable");
            f0.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
            return new C1133a(cls, cls.getMethod("value", new Class[0]));
        } catch (ClassNotFoundException unused) {
            return new C1133a(null, null);
        }
    }

    @dl.e
    public final Class<? extends Annotation> b(@dl.d Class<? extends Annotation> klass) throws IllegalAccessException, InvocationTargetException {
        Annotation annotation;
        Method methodB;
        f0.p(klass, "klass");
        C1133a c1133aA = f125064b;
        if (c1133aA == null) {
            synchronized (this) {
                c1133aA = f125064b;
                if (c1133aA == null) {
                    c1133aA = f125063a.a();
                    f125064b = c1133aA;
                }
            }
        }
        Class clsA = c1133aA.a();
        if (clsA == null || (annotation = klass.getAnnotation(clsA)) == null || (methodB = c1133aA.b()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(annotation, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) objInvoke;
    }
}
