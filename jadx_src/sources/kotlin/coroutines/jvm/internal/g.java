package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f124722a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final a f124723b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static a f124724c;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        @xh.e
        public final Method f124725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        @xh.e
        public final Method f124726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        @xh.e
        public final Method f124727c;

        public a(@dl.e Method method, @dl.e Method method2, @dl.e Method method3) {
            this.f124725a = method;
            this.f124726b = method2;
            this.f124727c = method3;
        }
    }

    private g() {
    }

    private final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f124724c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f124723b;
            f124724c = aVar2;
            return aVar2;
        }
    }

    @dl.e
    public final String b(@dl.d BaseContinuationImpl continuation) {
        f0.p(continuation, "continuation");
        a aVarA = f124724c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f124723b) {
            return null;
        }
        Method method = aVarA.f124725a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f124726b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f124727c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
