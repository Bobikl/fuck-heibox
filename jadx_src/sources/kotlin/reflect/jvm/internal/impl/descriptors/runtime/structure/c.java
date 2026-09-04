package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f125909a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static a f125910b;

    /* JADX INFO: compiled from: ReflectJavaMember.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final Method f125911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Method f125912b;

        public a(@dl.e Method method, @dl.e Method method2) {
            this.f125911a = method;
            this.f125912b = method2;
        }

        @dl.e
        public final Method a() {
            return this.f125912b;
        }

        @dl.e
        public final Method b() {
            return this.f125911a;
        }
    }

    private c() {
    }

    @dl.d
    public final a a(@dl.d Member member) {
        f0.p(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    @dl.e
    public final List<String> b(@dl.d Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        f0.p(member, "member");
        a aVarA = f125910b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f125910b;
                if (aVarA == null) {
                    aVarA = f125909a.a(member);
                    f125910b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, new Object[0]);
        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, new Object[0]);
            f0.n(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
